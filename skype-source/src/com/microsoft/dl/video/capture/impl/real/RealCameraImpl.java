// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.real;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.Camera;
import com.microsoft.dl.video.capture.api.CameraCallback;
import com.microsoft.dl.video.capture.api.CameraParameters;
import com.microsoft.dl.video.capture.api.CaptureException;
import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.Resolution;
import com.microsoft.dl.video.capture.impl.real.impl.CameraCapabilitiesUtils;
import java.io.IOException;

public class RealCameraImpl
    implements Camera
{
    private static class CallbackHandler
        implements android.hardware.Camera.ErrorCallback, android.hardware.Camera.PreviewCallback
    {

        private final CameraCallback a;
        private final Camera b;

        public void onError(int i, android.hardware.Camera camera)
        {
            a.onError(i, b);
        }

        public void onPreviewFrame(byte abyte0[], android.hardware.Camera camera)
        {
            a.onFrame(abyte0, b);
        }

        public CallbackHandler(CameraCallback cameracallback, Camera camera)
        {
            a = cameracallback;
            b = camera;
        }
    }


    private final int a;
    private final android.hardware.Camera b;

    public RealCameraImpl(int i)
        throws CaptureException
    {
        a = i;
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", (new StringBuilder("Opening camera ")).append(i).toString());
        }
        try
        {
            b = android.hardware.Camera.open(i);
            if (b == null)
            {
                throw new CaptureException((new StringBuilder("Could not open camera ")).append(i).toString());
            }
        }
        catch (RuntimeException runtimeexception)
        {
            throw new CaptureException((new StringBuilder("Could not open camera ")).append(i).toString(), runtimeexception);
        }
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(i).append(" is opened").toString());
        }
    }

    public final void addCallbackBuffer(byte abyte0[])
        throws CaptureException
    {
        try
        {
            b.addCallbackBuffer(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new CaptureException((new StringBuilder("Could not add callback buffer for the camera ")).append(a).toString(), abyte0);
        }
    }

    public final void close()
    {
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", (new StringBuilder("Closing camera ")).append(a).toString());
        }
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        b.release();
_L2:
        if (Log.isLoggable("Capture", 3))
        {
            Log.d("Capture", (new StringBuilder("Camera ")).append(a).append(" is closed").toString());
        }
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        if (Log.isLoggable("Capture", 6))
        {
            Log.e("Capture", (new StringBuilder("Exception caught during releasing camera ")).append(a).toString(), runtimeexception);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final CameraParameters getParameters()
        throws CaptureException
    {
        int ai[] = new int[2];
        android.hardware.Camera.Size size;
        CameraParameters cameraparameters;
        int i;
        try
        {
            android.hardware.Camera.Parameters parameters = b.getParameters();
            i = parameters.getPreviewFormat();
            size = parameters.getPreviewSize();
            parameters.getPreviewFpsRange(ai);
        }
        catch (RuntimeException runtimeexception)
        {
            throw new CaptureException((new StringBuilder("Could not get parameters of the camera ")).append(a).toString(), runtimeexception);
        }
        cameraparameters = new CameraParameters();
        cameraparameters.setImageFormat(CameraCapabilitiesUtils.mapImageFormat(i));
        cameraparameters.setResolution(CameraCapabilitiesUtils.mapResolution(size));
        cameraparameters.setFpsRange(CameraCapabilitiesUtils.mapFpsRange(ai));
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Camera ")).append(a).append(" returned ").append(cameraparameters).toString());
        }
        return cameraparameters;
    }

    public final void setCallback(CameraCallback cameracallback)
        throws CaptureException
    {
        if (cameracallback == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        cameracallback = new CallbackHandler(cameracallback, this);
_L1:
        b.setPreviewCallbackWithBuffer(cameracallback);
        b.setErrorCallback(cameracallback);
        return;
        cameracallback = null;
          goto _L1
        cameracallback;
        throw new CaptureException((new StringBuilder("Could not set preview callback for the camera ")).append(a).toString(), cameracallback);
    }

    public final void setDisplayOrientation(int i)
        throws CaptureException
    {
        try
        {
            b.setDisplayOrientation(i);
        }
        catch (RuntimeException runtimeexception)
        {
            throw new CaptureException((new StringBuilder("Could not set display orientation to ")).append(i).append(" degrees for the camera ").append(a).toString(), runtimeexception);
        }
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Display orientation is set to ")).append(i).append(" degrees for the camera ").append(a).toString());
        }
    }

    public final void setParameters(CameraParameters cameraparameters)
        throws CaptureException
    {
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Setting ")).append(cameraparameters).append(" to the camera ").append(a).toString());
        }
        try
        {
            android.hardware.Camera.Parameters parameters = b.getParameters();
            parameters.setPreviewFormat(CameraCapabilitiesUtils.mapImageFormat(cameraparameters.getImageFormat()));
            parameters.setPreviewSize(cameraparameters.getResolution().getWidth(), cameraparameters.getResolution().getHeight());
            if (CameraCapabilitiesUtils.isPictureSizeSupported(cameraparameters.getResolution(), parameters))
            {
                parameters.setPictureSize(cameraparameters.getResolution().getWidth(), cameraparameters.getResolution().getHeight());
            }
            parameters.setPreviewFpsRange(cameraparameters.getFpsRange().getMin(), cameraparameters.getFpsRange().getMax());
            b.setParameters(parameters);
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw new CaptureException((new StringBuilder("Could not set ")).append(cameraparameters).append(" to the camera ").append(a).toString(), runtimeexception);
        }
    }

    public final void setPreviewDisplay(Object obj)
        throws CaptureException
    {
        if (!(obj instanceof SurfaceHolder)) goto _L2; else goto _L1
_L1:
        b.setPreviewDisplay((SurfaceHolder)obj);
_L4:
        if (Log.isLoggable("Capture", 4))
        {
            Log.i("Capture", (new StringBuilder("Preview display is set to ")).append(obj).append(" for the camera ").append(a).toString());
        }
        return;
_L2:
label0:
        {
            IOException ioexception;
            if (obj instanceof SurfaceTexture)
            {
                b.setPreviewTexture((SurfaceTexture)obj);
                continue; /* Loop/switch isn't completed */
            }
            try
            {
                if (!(obj instanceof SurfaceView))
                {
                    break label0;
                }
                b.setPreviewDisplay(((SurfaceView)obj).getHolder());
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                throw new CaptureException((new StringBuilder("Could not set preview display to ")).append(obj).append(" for the camera ").append(a).toString(), ioexception);
            }
            catch (RuntimeException runtimeexception)
            {
                throw new CaptureException((new StringBuilder("Could not set preview display to ")).append(obj).append(" for the camera ").append(a).toString(), runtimeexception);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append(obj.getClass().getCanonicalName()).append(" is not supported").toString());
    }

    public final void startPreview()
        throws CaptureException
    {
        try
        {
            b.startPreview();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw new CaptureException((new StringBuilder("Could not start preview from the camera ")).append(a).toString(), runtimeexception);
        }
    }

    public final void stopPreview()
        throws CaptureException
    {
        try
        {
            b.stopPreview();
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            throw new CaptureException((new StringBuilder("Could not stop preview from the camera ")).append(a).toString(), runtimeexception);
        }
    }
}
