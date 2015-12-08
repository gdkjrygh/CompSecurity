// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.impl.cam;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.TextureView;
import com.addlive.impl.Log;
import com.addlive.impl.cb.ADLInjectFrameCb;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.addlive.impl.cam:
//            ADLCamera, ADLCameraHelper, CaptureConfig

public class ADLCameraTextureView
    implements android.view.TextureView.SurfaceTextureListener, ADLCamera
{

    private ADLCameraHelper camHelper;
    private Context ctx;
    private SurfaceTexture surface;
    private TextureView textureView;

    public ADLCameraTextureView(ADLInjectFrameCb adlinjectframecb, Context context, CaptureConfig captureconfig)
    {
        camHelper = new ADLCameraHelper(context, adlinjectframecb, captureconfig);
        camHelper.checkHardware();
        ctx = context;
    }

    private void startInternal()
    {
        this;
        JVM INSTR monitorenter ;
        CountDownLatch countdownlatch = new CountDownLatch(1);
        camHelper.configure(countdownlatch);
        if (surface != null)
        {
            Log.d("AddLive_SDK", "Already received surface view. Starting preview");
            startPreview();
            if (!countdownlatch.await(5L, TimeUnit.SECONDS))
            {
                Log.e("AddLive_SDK", "Failed to receive the first frame");
                camHelper.stopCam();
                throw new IOException("Failed to receive frames from the camera");
            }
        }
        break MISSING_BLOCK_LABEL_81;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Log.d("AddLive_SDK", "Camera initialized");
        this;
        JVM INSTR monitorexit ;
    }

    private void startPreview()
    {
        this;
        JVM INSTR monitorenter ;
        if (camHelper.isCamWorking()) goto _L2; else goto _L1
_L1:
        Log.w("AddLive_SDK", "Cannot start preview as the camera was already disposed");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camHelper.doOnCam(new ADLCameraHelper.CamTask() {

            final ADLCameraTextureView this$0;

            public void workOnCam(Camera camera)
            {
                camera.setPreviewTexture(surface);
                camera.startPreview();
            }

            
            {
                this$0 = ADLCameraTextureView.this;
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

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        Log.d("AddLive_SDK", "Got surface texture available");
        surface = surfacetexture;
        try
        {
            startPreview();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceTexture surfacetexture)
        {
            surfacetexture.printStackTrace();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        Log.d("AddLive_SDK", "Got surface texture destroyed");
        try
        {
            stop();
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceTexture surfacetexture)
        {
            surfacetexture.printStackTrace();
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        Log.d("AddLive_SDK", "onSurfaceTextureSizeChanged");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
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
            startInternal();
        }
    }

    public void start(Object obj)
    {
        Log.d("AddLive_SDK", "Starting camera preview");
        if (!(obj instanceof TextureView))
        {
            throw new IllegalArgumentException("TextureView cam used with a surface view");
        }
        if (camHelper.isCamWorking())
        {
            Log.d("AddLive_SDK", "Camera was already in use. Releasing it");
            stop();
        }
        startInternal();
        textureView = (TextureView)obj;
        textureView.setWillNotDraw(false);
        if (textureView.isAvailable())
        {
            surface = textureView.getSurfaceTexture();
            startPreview();
        }
        textureView.setSurfaceTextureListener(this);
    }

    public void stop()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("AddLive_SDK", "Stopping camera");
        camHelper.stopCam();
        textureView.setSurfaceTextureListener(null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
