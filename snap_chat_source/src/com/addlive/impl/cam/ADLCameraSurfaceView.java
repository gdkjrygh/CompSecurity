// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import com.addlive.impl.Log;
import com.addlive.impl.cb.ADLInjectFrameCb;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.addlive.impl.cam:
//            ADLCamera, ADLCameraHelper, CaptureConfig

public class ADLCameraSurfaceView
    implements android.view.SurfaceHolder.Callback, ADLCamera
{

    private static final String LOG_TAG = "AddLive_SDK_SCam";
    private ADLCameraHelper camHelper;
    private SurfaceHolder holder;

    public ADLCameraSurfaceView(ADLInjectFrameCb adlinjectframecb, Context context, CaptureConfig captureconfig)
    {
        camHelper = new ADLCameraHelper(context, adlinjectframecb, captureconfig);
        camHelper.checkHardware();
    }

    private void initCam()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("AddLive_SDK_SCam", "Initialising camera");
        CountDownLatch countdownlatch = new CountDownLatch(1);
        camHelper.configure(countdownlatch);
        if (holder != null)
        {
            Log.d("AddLive_SDK_SCam", "Already received surface view. Starting preview");
            startPreview();
            if (!countdownlatch.await(5L, TimeUnit.SECONDS))
            {
                Log.e("AddLive_SDK_SCam", "Failed to receive the first frame");
                camHelper.stopCam();
                throw new IOException("Failed to receive frames from the camera");
            }
        }
        break MISSING_BLOCK_LABEL_89;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Log.d("AddLive_SDK_SCam", "Camera initialized");
        this;
        JVM INSTR monitorexit ;
    }

    private void startPreview()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("AddLive_SDK_SCam", "Starting preview");
        if (camHelper.isCamWorking()) goto _L2; else goto _L1
_L1:
        Log.i("AddLive_SDK_SCam", "Preview already started, skipping");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camHelper.doOnCam(new ADLCameraHelper.CamTask() {

            final ADLCameraSurfaceView this$0;

            public void workOnCam(Camera camera)
            {
                Log.i("AddLive_SDK_SCam", "Setting preview display");
                camera.setPreviewDisplay(holder);
                camera.startPreview();
            }

            
            {
                this$0 = ADLCameraSurfaceView.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void dispose()
    {
        camHelper.dispose();
    }

    public List getCameraDevices()
    {
        return camHelper.getCameraDevices();
    }

    public String getDevice()
    {
        return camHelper.getDevice();
    }

    public int processProperty(String s, String s1)
    {
        return camHelper.processProperty(s, s1);
    }

    public void setDevice(String s)
    {
        camHelper.setDevice(s);
        if (camHelper.isCamWorking())
        {
            camHelper.stopCam();
            initCam();
        }
    }

    public void start(Object obj)
    {
        Log.d("AddLive_SDK_SCam", "Starting camera preview");
        if (!(obj instanceof SurfaceHolder))
        {
            throw new IllegalArgumentException("Surface View cam used with a surface view");
        }
        if (camHelper.isCamWorking())
        {
            Log.d("AddLive_SDK_SCam", "Camera was already in use. Releasing it");
            stop();
        }
        initCam();
        SurfaceHolder surfaceholder = (SurfaceHolder)obj;
        if (obj != holder)
        {
            holder = (SurfaceHolder)obj;
            holder.addCallback(this);
        }
        if (!surfaceholder.isCreating())
        {
            surfaceCreated(holder);
        }
    }

    public void stop()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("AddLive_SDK_SCam", "Stopping camera");
        if (holder != null)
        {
            holder.removeCallback(this);
            holder = null;
        }
        camHelper.stopCam();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("AddLive_SDK_SCam", "Got surface texture changed");
        if (camHelper.isCamWorking()) goto _L2; else goto _L1
_L1:
        Log.i("AddLive_SDK_SCam", "Cam is already working - skipping");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        SurfaceHolder surfaceholder1 = holder;
        if (surfaceholder == surfaceholder1)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            camHelper.doOnCam(new ADLCameraHelper.CamTask() {

                final ADLCameraSurfaceView this$0;

                public void workOnCam(Camera camera)
                {
                    camera.setPreviewDisplay(holder);
                }

            
            {
                this$0 = ADLCameraSurfaceView.this;
                super();
            }
            });
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder) { }
        finally
        {
            this;
        }
        surfaceholder.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
        throw surfaceholder;
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        Log.d("AddLive_SDK_SCam", "Got surface texture available");
        holder = surfaceholder;
        try
        {
            startPreview();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            surfaceholder.printStackTrace();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        Log.d("AddLive_SDK_SCam", "Got surface texture destroyed");
        try
        {
            stop();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder)
        {
            surfaceholder.printStackTrace();
        }
    }

}
