// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.view.SurfaceView;
import com.moodstocks.android.advanced.Image;
import com.moodstocks.android.advanced.Tools;
import com.moodstocks.android.camera.CameraFrame;
import com.moodstocks.android.camera.CameraManager;
import com.moodstocks.android.camera.Size;
import com.moodstocks.android.core.Loader;

// Referenced classes of package com.moodstocks.android:
//            Scanner, MoodstocksError, Result

public class AutoScannerSession extends Handler
    implements com.moodstocks.android.camera.CameraManager.Listener
{

    private static final int BARCODE_MASK = 15;
    private static final String TAG = "AutoScannerSession";
    private boolean advancedListener;
    private CameraManager cameraManager;
    private CameraFrame currentFrame;
    private int extras;
    private Listener listener;
    private int options;
    private boolean paused;
    private Scanner scanner;
    private boolean started;
    private int types;

    public AutoScannerSession(Activity activity, Scanner scanner1, Listener listener1, SurfaceView surfaceview)
    {
        currentFrame = null;
        started = false;
        paused = false;
        types = 0x80000000;
        options = 0;
        extras = 0;
        advancedListener = false;
        cameraManager = new CameraManager(activity, this, surfaceview);
        scanner = scanner1;
        listener = listener1;
        if (listener1 instanceof AdvancedListener)
        {
            advancedListener = true;
        }
    }

    private Result offlineImpl(Image image)
    {
        Result result = null;
        if ((types & 0x80000000) != 0)
        {
            result = scanner.search(image, options, extras);
        }
        Result result1 = result;
        if (result == null)
        {
            result1 = result;
            if ((types & 0xf) != 0)
            {
                result1 = scanner.decode(image, types, extras);
            }
        }
        return result1;
    }

    private void transmitResult(Result result, Bitmap bitmap)
    {
label0:
        {
            if (started && !paused)
            {
                pause();
                if (!advancedListener)
                {
                    break label0;
                }
                ((AdvancedListener)listener).onResult(result, bitmap);
            }
            return;
        }
        listener.onResult(result);
    }

    private void transmitWarning(String s)
    {
        if (started && !paused)
        {
            listener.onWarning(s);
        }
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 69
    //                   1 86;
           goto _L1 _L2 _L3
_L1:
        Log.e("AutoScannerSession", (new StringBuilder()).append("handleMessage: bad message received (").append(message.what).append(")").toString());
_L5:
        currentFrame.release();
        return;
_L2:
        transmitWarning(((MoodstocksError)message.obj).getMessage());
        continue; /* Loop/switch isn't completed */
_L3:
        Object obj = (Pair)message.obj;
        message = (Result)((Pair) (obj)).first;
        obj = (Bitmap)((Pair) (obj)).second;
        if (message != null)
        {
            transmitResult(message, ((Bitmap) (obj)));
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean isListening()
    {
        return started && !paused;
    }

    public void onCameraOpenException(Exception exception)
    {
        listener.onCameraOpenFailed(exception);
    }

    public void onNewFrameInBackground(CameraFrame cameraframe)
    {
        Object obj1;
        obj1 = null;
        currentFrame = cameraframe;
        Image image = new Image(cameraframe.data, cameraframe.size.width, cameraframe.size.height, cameraframe.orientation);
        Object obj = null;
_L1:
        Result result;
        if (image != null)
        {
            try
            {
                result = offlineImpl(image);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                result = null;
            }
            image.release();
        } else
        {
            result = null;
        }
        if (obj != null)
        {
            obtainMessage(0, obj).sendToTarget();
            return;
        }
        break MISSING_BLOCK_LABEL_85;
        obj;
        image = null;
          goto _L1
        obj = obj1;
        if (result != null)
        {
            obj = obj1;
            if (advancedListener)
            {
                obj = Tools.convertNV21ToBitmap(cameraframe.data, cameraframe.size.width, cameraframe.size.height, cameraframe.orientation);
            }
        }
        obtainMessage(1, new Pair(result, obj)).sendToTarget();
        return;
    }

    public void pause()
    {
        paused = true;
    }

    public void resume()
    {
        paused = false;
    }

    public void setResultExtras(int i)
    {
        extras = i;
    }

    public void setResultTypes(int i)
    {
        types = i;
    }

    public void setSearchOptions(int i)
    {
        options = i;
    }

    public void start()
    {
        cameraManager.start(true, true);
        started = true;
    }

    public void stop()
    {
        started = false;
        cameraManager.stop();
    }

    static 
    {
        Loader.load();
    }

    private class AdvancedListener
        implements Listener
    {

        public abstract void onResult(Result result, Bitmap bitmap);
    }


    private class Listener
    {

        public abstract void onCameraOpenFailed(Exception exception);

        public abstract void onResult(Result result);

        public abstract void onWarning(String s);
    }

}
