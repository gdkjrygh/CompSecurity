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
import com.moodstocks.android.advanced.ApiSearcher;
import com.moodstocks.android.advanced.Image;
import com.moodstocks.android.advanced.Tools;
import com.moodstocks.android.camera.CameraFrame;
import com.moodstocks.android.camera.CameraManager;
import com.moodstocks.android.camera.Size;
import com.moodstocks.android.core.Loader;

// Referenced classes of package com.moodstocks.android:
//            MoodstocksError, Scanner, Result

public class ManualScannerSession extends Handler
    implements com.moodstocks.android.camera.CameraManager.Listener
{

    private static final int BARCODE_MASK = 15;
    private static final String TAG = "ManualScannerSession";
    private long CACHE_DELAY;
    private Result cachedResult;
    private long cachedTimestamp;
    private CameraManager cameraManager;
    private CameraFrame currentFrame;
    private Listener listener;
    private boolean paused;
    private Scanner scanner;
    private ApiSearcher searcher;
    private boolean started;
    private int state;
    private int types;
    private boolean wantsQuery;

    public ManualScannerSession(Activity activity, Scanner scanner1, Listener listener1, SurfaceView surfaceview)
    {
        searcher = null;
        types = 0x80000000;
        wantsQuery = false;
        currentFrame = null;
        started = false;
        paused = false;
        CACHE_DELAY = 1000L;
        cachedResult = null;
        cachedTimestamp = 0L;
        cameraManager = new CameraManager(activity, this, surfaceview);
        scanner = scanner1;
        listener = listener1;
    }

    private void convert(CameraFrame cameraframe)
    {
        obtainMessage(4, Tools.convertNV21ToBitmap(cameraframe.data, cameraframe.size.width, cameraframe.size.height, cameraframe.orientation)).sendToTarget();
    }

    private void offline(CameraFrame cameraframe)
    {
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        Image image = new Image(cameraframe.data, cameraframe.size.width, cameraframe.size.height, cameraframe.orientation);
        cameraframe = null;
_L3:
        Object obj = cameraframe;
        if (image == null) goto _L2; else goto _L1
_L1:
        obj1 = offlineImpl(image);
        obj = cameraframe;
        cameraframe = ((CameraFrame) (obj1));
_L4:
        image.release();
        obj1 = cameraframe;
_L2:
        if (obj != null)
        {
            obtainMessage(0, obj).sendToTarget();
            return;
        } else
        {
            obtainMessage(1, obj1).sendToTarget();
            return;
        }
        cameraframe;
        image = null;
          goto _L3
        obj;
        cameraframe = obj2;
          goto _L4
    }

    private Result offlineImpl(Image image)
    {
        Result result = null;
        if ((types & 0xf) != 0)
        {
            result = scanner.decode(image, types, 0);
        }
        Result result1 = result;
        if (result == null)
        {
            result1 = result;
            if ((types & 0x80000000) != 0)
            {
                result1 = scanner.search(image, 1, 0);
            }
        }
        return result1;
    }

    private void online(CameraFrame cameraframe)
    {
        Object obj1;
        obj1 = null;
        if ((types & 0x80000000) == 0)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        Image image = new Image(cameraframe.data, cameraframe.size.width, cameraframe.size.height, cameraframe.orientation);
        Object obj = null;
_L1:
        Result result;
        if (image != null)
        {
            obtainMessage(10).sendToTarget();
            try
            {
                result = onlineImpl(image);
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
_L2:
        if (obj != null)
        {
            obtainMessage(2, obj).sendToTarget();
            return;
        }
        break MISSING_BLOCK_LABEL_99;
        obj;
        image = null;
          goto _L1
        obj = obj1;
        if (wantsQuery)
        {
            obj = Tools.convertNV21ToBitmap(cameraframe.data, cameraframe.size.width, cameraframe.size.height, cameraframe.orientation);
        }
        obtainMessage(3, new Pair(result, obj)).sendToTarget();
        return;
        result = null;
        obj = null;
          goto _L2
    }

    private Result onlineImpl(Image image)
    {
        searcher = new ApiSearcher(scanner);
        image = searcher.search(image);
        searcher = null;
        return image;
    }

    private void transmitError(MoodstocksError moodstockserror)
    {
        if (started && !paused)
        {
            pause();
            listener.onError(moodstockserror);
        }
    }

    private void transmitResult(Result result, Bitmap bitmap)
    {
        if (started && !paused)
        {
            pause();
            listener.onResult(result, bitmap);
        }
    }

    private void transmitSearchStart()
    {
        if (started && !paused)
        {
            listener.onServerSearchStart();
        }
    }

    private void transmitWarning(String s)
    {
        if (started && !paused)
        {
            listener.onWarning(s);
        }
    }

    public void cancel()
    {
        if (searcher != null)
        {
            searcher.cancel();
        }
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 4: default 40
    //                   0 98
    //                   1 120
    //                   2 147
    //                   3 180
    //                   4 209;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        switch (message.what)
        {
        default:
            Log.e("ManualScannerSession", (new StringBuilder()).append("handleMessage: bad message received (").append(message.what).append(")").toString());
            return;

        case 10: // '\n'
            transmitSearchStart();
            break;
        }
          goto _L7
_L2:
        transmitWarning(((MoodstocksError)message.obj).getMessage());
_L8:
        currentFrame.release();
        return;
_L3:
        message = (Result)message.obj;
        if (message != null)
        {
            cachedResult = message;
            cachedTimestamp = System.currentTimeMillis();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        message = (MoodstocksError)message.obj;
        if (message.getErrorCode() != 15)
        {
            transmitError(message);
        } else
        {
            state = 0;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        message = (Pair)message.obj;
        transmitResult((Result)((Pair) (message)).first, (Bitmap)((Pair) (message)).second);
        continue; /* Loop/switch isn't completed */
_L6:
        transmitResult(cachedResult, (Bitmap)message.obj);
        if (true) goto _L8; else goto _L7
_L7:
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
        currentFrame = cameraframe;
        switch (state)
        {
        default:
            return;

        case 0: // '\0'
            offline(cameraframe);
            return;

        case 1: // '\001'
            online(cameraframe);
            return;

        case 2: // '\002'
            convert(cameraframe);
            break;
        }
    }

    public void pause()
    {
        paused = true;
    }

    public void resume()
    {
        state = 0;
        paused = false;
    }

    public void setResultTypes(int i)
    {
        types = i;
    }

    public void snap()
    {
        if (cachedResult != null && System.currentTimeMillis() - cachedTimestamp < CACHE_DELAY)
        {
            if (wantsQuery)
            {
                state = 2;
                return;
            } else
            {
                transmitResult(cachedResult, null);
                return;
            }
        } else
        {
            state = 1;
            return;
        }
    }

    public void start()
    {
        state = 0;
        cameraManager.start(true, true);
        started = true;
    }

    public void stop()
    {
        started = false;
        cameraManager.stop();
    }

    public void wantQueryImage(boolean flag)
    {
        wantsQuery = flag;
    }

    static 
    {
        Loader.load();
    }

    private class Listener
    {

        public abstract void onCameraOpenFailed(Exception exception);

        public abstract void onError(MoodstocksError moodstockserror);

        public abstract void onResult(Result result, Bitmap bitmap);

        public abstract void onServerSearchStart();

        public abstract void onWarning(String s);
    }

}
