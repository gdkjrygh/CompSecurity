// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.camera;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Display;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;

// Referenced classes of package com.moodstocks.android.camera:
//            CameraInstance, CameraPreview, CameraFrame, Size

public class CameraManager extends Handler
    implements CameraFrame.ReleaseListener, CameraInstance.Listener, CameraPreview.Listener
{

    private boolean busy;
    private CameraInstance camera;
    private int initStatus;
    private Listener listener;
    private Activity parent;
    private CameraPreview preview;
    private BackgroundThread thread;

    public CameraManager(Activity activity, Listener listener1, SurfaceView surfaceview)
    {
        camera = null;
        preview = null;
        thread = null;
        busy = false;
        initStatus = 0;
        parent = activity;
        listener = listener1;
        camera = new CameraInstance(this);
        preview = new CameraPreview(surfaceview, this);
    }

    private int getUIOrientation()
    {
        return parent.getWindowManager().getDefaultDisplay().getRotation();
    }

    private boolean isUIPortrait()
    {
        return parent.getResources().getConfiguration().orientation == 1;
    }

    public void onCameraOpenException(Exception exception)
    {
        listener.onCameraOpenException(exception);
    }

    public void onCameraOpenSuccess()
    {
        initStatus = 3;
        preview.startAsync();
    }

    public void onFrameReleased()
    {
        busy = false;
    }

    public void onNewFrame(byte abyte0[], Size size, int i)
    {
        if (!listener.isListening() || busy)
        {
            return;
        } else
        {
            busy = true;
            abyte0 = new CameraFrame(this, abyte0, size, i);
            thread.sendFrameToBackground(abyte0);
            return;
        }
    }

    public void onPreviewStarts(SurfaceHolder surfaceholder, Size size)
    {
        camera.stopPreview();
        camera.updatePreviewParameters(size, isUIPortrait(), getUIOrientation());
        initStatus = 4;
        camera.startPreview(surfaceholder);
    }

    public void start(boolean flag, boolean flag1)
    {
        initStatus = 1;
        thread = new BackgroundThread(listener, null);
        thread.start();
        initStatus = 2;
        camera.openAsync(flag, flag1);
    }

    public void stop()
    {
        if (initStatus == 4)
        {
            camera.stopPreview();
        }
        if (initStatus >= 3)
        {
            preview.stop();
        }
        if (initStatus >= 2)
        {
            camera.close();
        }
        if (initStatus >= 1)
        {
            thread.quit();
            thread = null;
        }
        initStatus = 0;
    }

    private class Listener
    {

        public abstract boolean isListening();

        public abstract void onCameraOpenException(Exception exception);

        public abstract void onNewFrameInBackground(CameraFrame cameraframe);
    }


    private class BackgroundThread extends Thread
    {

        private static final String TAG = "WorkerThread";
        private Listener listener;
        private BackgroundThreadHandler threadHandler;

        private void frameIsInBackground(CameraFrame cameraframe)
        {
            if (listener.isListening())
            {
                listener.onNewFrameInBackground(cameraframe);
                return;
            } else
            {
                cameraframe.release();
                return;
            }
        }

        private void quit()
        {
            interrupt();
            class BackgroundThreadHandler extends Handler
            {

                private BackgroundThread thread;

                public void handleMessage(Message message)
                {
                    switch (message.what)
                    {
                    default:
                        Log.e("WorkerThread", (new StringBuilder()).append("handleMessage: bad message received (").append(message.what).append(")").toString());
                        return;

                    case 0: // '\0'
                        thread.frameIsInBackground((CameraFrame)message.obj);
                        return;

                    case 1: // '\001'
                        thread.quitImpl();
                        break;
                    }
                }

                private BackgroundThreadHandler()
                {
                    thread = BackgroundThread.this;
                }

                BackgroundThreadHandler(_cls1 _pcls1)
                {
                    this();
                }
            }

            threadHandler.obtainMessage(1).sendToTarget();
            try
            {
                join();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                interrupt();
                Log.e("WorkerThread", "`quit` received InterruptedException");
                interruptedexception.printStackTrace();
                return;
            }
        }

        private void quitImpl()
        {
            Looper.myLooper().quit();
        }

        private void sendFrameToBackground(CameraFrame cameraframe)
        {
            threadHandler.obtainMessage(0, cameraframe).sendToTarget();
        }

        public void run()
        {
            Looper.prepare();
            threadHandler = new BackgroundThreadHandler(null);
            Looper.loop();
        }





        private BackgroundThread(Listener listener1)
        {
            listener = listener1;
        }

        BackgroundThread(Listener listener1, _cls1 _pcls1)
        {
            this(listener1);
        }
    }

}
