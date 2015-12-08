// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.client.android.camera.open.OpenCameraInterface;
import java.io.IOException;

// Referenced classes of package com.google.zxing.client.android.camera:
//            CameraConfigurationManager, PreviewCallback, AutoFocusManager

public final class CameraManager
{

    private static final int MAX_FRAME_HEIGHT = 675;
    private static final int MAX_FRAME_WIDTH = 1200;
    private static final int MIN_FRAME_HEIGHT = 240;
    private static final int MIN_FRAME_WIDTH = 240;
    private static final String TAG = com/google/zxing/client/android/camera/CameraManager.getSimpleName();
    private AutoFocusManager autoFocusManager;
    private Camera camera;
    private final CameraConfigurationManager configManager;
    private final Context context;
    private Rect framingRect;
    private Rect framingRectInPreview;
    private boolean initialized;
    private final PreviewCallback previewCallback;
    private boolean previewing;
    private int requestedFramingRectHeight;
    private int requestedFramingRectWidth;

    public CameraManager(Context context1)
    {
        context = context1;
        configManager = new CameraConfigurationManager(context1);
        previewCallback = new PreviewCallback(configManager);
    }

    private static int findDesiredDimensionInRange(int i, int j, int k)
    {
        i = (i * 5) / 8;
        if (i < j)
        {
            return j;
        }
        if (i > k)
        {
            return k;
        } else
        {
            return i;
        }
    }

    public PlanarYUVLuminanceSource buildLuminanceSource(byte abyte0[], int i, int j)
    {
        Rect rect = getFramingRectInPreview();
        if (rect == null)
        {
            return null;
        } else
        {
            return new PlanarYUVLuminanceSource(abyte0, i, j, rect.left, rect.top, rect.width(), rect.height(), false);
        }
    }

    public void closeDriver()
    {
        this;
        JVM INSTR monitorenter ;
        if (camera != null)
        {
            camera.release();
            camera = null;
            framingRect = null;
            framingRectInPreview = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public Rect getFramingRect()
    {
        Rect rect = null;
        this;
        JVM INSTR monitorenter ;
        if (framingRect != null) goto _L2; else goto _L1
_L1:
        Object obj = camera;
        if (obj != null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return rect;
_L4:
        obj = configManager.getScreenResolution();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i = findDesiredDimensionInRange(((Point) (obj)).x, 240, 1200);
        int j = findDesiredDimensionInRange(((Point) (obj)).y, 240, 675);
        int k = (((Point) (obj)).x - i) / 2;
        int l = (((Point) (obj)).y - j) / 2;
        framingRect = new Rect(k, l, k + i, l + j);
        Log.e(TAG, (new StringBuilder()).append("Calculated framing rect: ").append(framingRect).append(" width: ").append(i).append(" height: ").append(j).toString());
_L2:
        rect = framingRect;
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public Rect getFramingRectInPreview()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (framingRectInPreview != null) goto _L2; else goto _L1
_L1:
        Rect rect = getFramingRect();
        if (rect != null) goto _L4; else goto _L3
_L3:
        rect = obj;
_L6:
        this;
        JVM INSTR monitorexit ;
        return rect;
_L4:
        Rect rect1;
        Point point;
        Point point1;
        rect1 = new Rect(rect);
        point = configManager.getCameraResolution();
        point1 = configManager.getScreenResolution();
        rect = obj;
        if (point == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        rect = obj;
        if (point1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        rect1.left = (rect1.left * point.y) / point1.x;
        rect1.right = (rect1.right * point.y) / point1.x;
        rect1.top = (rect1.top * point.x) / point1.y;
        rect1.bottom = (rect1.bottom * point.x) / point1.y;
        framingRectInPreview = rect1;
_L2:
        rect = framingRectInPreview;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isOpen()
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        boolean flag;
        if (camera1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void openDriver(SurfaceHolder surfaceholder)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = camera;
        Camera camera1;
        camera1 = ((Camera) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        camera1 = OpenCameraInterface.open();
        if (camera1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        throw new IOException();
        surfaceholder;
        this;
        JVM INSTR monitorexit ;
        throw surfaceholder;
        camera = camera1;
        camera1.setPreviewDisplay(surfaceholder);
        if (!initialized)
        {
            initialized = true;
            configManager.initFromCameraParameters(camera1);
            if (requestedFramingRectWidth > 0 && requestedFramingRectHeight > 0)
            {
                setManualFramingRect(requestedFramingRectWidth, requestedFramingRectHeight);
                requestedFramingRectWidth = 0;
                requestedFramingRectHeight = 0;
            }
        }
        surfaceholder = camera1.getParameters();
        if (surfaceholder != null) goto _L2; else goto _L1
_L1:
        surfaceholder = null;
_L3:
        configManager.setDesiredCameraParameters(camera1, false);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        surfaceholder = surfaceholder.flatten();
          goto _L3
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w(TAG, "Camera rejected parameters. Setting only minimal safe-mode parameters");
        Log.i(TAG, (new StringBuilder()).append("Resetting to saved camera params: ").append(surfaceholder).toString());
        if (surfaceholder == null) goto _L5; else goto _L4
_L4:
        runtimeexception = camera1.getParameters();
        runtimeexception.unflatten(surfaceholder);
        camera1.setParameters(runtimeexception);
        configManager.setDesiredCameraParameters(camera1, true);
          goto _L5
        surfaceholder;
        Log.w(TAG, "Camera rejected even safe-mode parameters! No configuration");
          goto _L5
    }

    public void requestPreviewFrame(Handler handler, int i)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (previewing)
        {
            previewCallback.setHandler(handler, i);
            camera1.setOneShotPreviewCallback(previewCallback);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        handler;
        throw handler;
    }

    public void setManualFramingRect(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (!initialized) goto _L2; else goto _L1
_L1:
        Point point = configManager.getScreenResolution();
        int k = i;
        if (i > point.x)
        {
            k = point.x;
        }
        i = j;
        if (j > point.y)
        {
            i = point.y;
        }
        j = (point.x - k) / 2;
        int l = (point.y - i) / 2;
        Log.e(TAG, (new StringBuilder()).append("topoffset: ").append(l).append("screenheight: ").append(point.y).toString());
        framingRect = new Rect(j, l - 450, j + k, l + i);
        Log.d(TAG, (new StringBuilder()).append("Calculated manual framing rect: ").append(framingRect).toString());
        framingRectInPreview = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        requestedFramingRectWidth = i;
        requestedFramingRectHeight = j;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setTorch(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (flag != configManager.getTorchState(camera) && camera != null)
        {
            if (autoFocusManager != null)
            {
                autoFocusManager.stop();
            }
            configManager.setTorch(camera, flag);
            if (autoFocusManager != null)
            {
                autoFocusManager.start();
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void startPreview()
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (!previewing)
        {
            camera1.startPreview();
            previewing = true;
            autoFocusManager = new AutoFocusManager(context, camera);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void stopPreview()
    {
        this;
        JVM INSTR monitorenter ;
        if (autoFocusManager != null)
        {
            autoFocusManager.stop();
            autoFocusManager = null;
        }
        if (camera != null && previewing)
        {
            camera.stopPreview();
            previewCallback.setHandler(null, 0);
            previewing = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
