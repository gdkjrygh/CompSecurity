// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.content.res.Resources;
import android.hardware.Camera;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.google.android.apps.unveil.env.q;
import com.google.android.apps.unveil.env.r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            CameraProxy, RealParameters, ParametersProxy

public class RealCamera
    implements CameraProxy
{

    private Method addBufferMethod;
    public Camera camera;
    private Method setCallbackWithBufferMethod;

    protected RealCamera(Camera camera1)
    {
        addBufferMethod = null;
        setCallbackWithBufferMethod = null;
        camera = camera1;
    }

    public static RealCamera open(Handler handler, Map map, Resources resources)
    {
label0:
        {
            map = Camera.open();
            handler = map;
            if (map == null)
            {
                if (android.os.Build.VERSION.SDK_INT < 9)
                {
                    break label0;
                }
                handler = Camera.open(0);
            }
            return new RealCamera(handler);
        }
        return null;
    }

    public void addCallbackBuffer(byte abyte0[])
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (addBufferMethod != null) goto _L4; else goto _L3
_L3:
        Method amethod[];
        int j;
        amethod = camera.getClass().getDeclaredMethods();
        j = amethod.length;
_L6:
        if (i >= j) goto _L4; else goto _L5
_L5:
        Method method = amethod[i];
        if (!method.getName().equals("addCallbackBuffer"))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        addBufferMethod = method;
_L4:
        addBufferMethod.invoke(camera, new Object[] {
            abyte0
        });
          goto _L1
        abyte0;
        abyte0.printStackTrace();
          goto _L1
        abyte0;
        throw abyte0;
        i++;
          goto _L6
        abyte0;
        abyte0.printStackTrace();
          goto _L1
        abyte0;
        abyte0.printStackTrace();
          goto _L1
    }

    public void autoFocus(android.hardware.Camera.AutoFocusCallback autofocuscallback)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.autoFocus(autofocuscallback);
        if (true) goto _L1; else goto _L3
_L3:
        autofocuscallback;
        throw autofocuscallback;
    }

    public void cancelAutoFocus()
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.cancelAutoFocus();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public ParametersProxy getParameters()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = camera;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((ParametersProxy) (obj));
_L2:
        obj = new RealParameters(camera.getParameters());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        camera.release();
        camera = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setDisplayOrientation(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.setDisplayOrientation(i);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setOneShotPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.setOneShotPreviewCallback(previewcallback);
        if (true) goto _L1; else goto _L3
_L3:
        previewcallback;
        throw previewcallback;
    }

    public void setParameters(ParametersProxy parametersproxy)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.setParameters(parametersproxy.getActualParameters());
        if (true) goto _L1; else goto _L3
_L3:
        parametersproxy;
        throw parametersproxy;
    }

    public void setPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.setPreviewCallback(previewcallback);
        if (true) goto _L1; else goto _L3
_L3:
        previewcallback;
        throw previewcallback;
    }

    public void setPreviewCallbackWithBuffer(android.hardware.Camera.PreviewCallback previewcallback)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (setCallbackWithBufferMethod != null) goto _L4; else goto _L3
_L3:
        Method amethod[];
        int j;
        amethod = camera.getClass().getDeclaredMethods();
        j = amethod.length;
_L6:
        if (i >= j) goto _L4; else goto _L5
_L5:
        Method method = amethod[i];
        if (!method.getName().equals("setPreviewCallbackWithBuffer"))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        setCallbackWithBufferMethod = method;
_L4:
        setCallbackWithBufferMethod.invoke(camera, new Object[] {
            previewcallback
        });
          goto _L1
        previewcallback;
        previewcallback.printStackTrace();
          goto _L1
        previewcallback;
        throw previewcallback;
        i++;
          goto _L6
        previewcallback;
        previewcallback.printStackTrace();
          goto _L1
        previewcallback;
        previewcallback.printStackTrace();
          goto _L1
    }

    public void setPreviewDisplay(SurfaceHolder surfaceholder)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.setPreviewDisplay(surfaceholder);
        if (true) goto _L1; else goto _L3
_L3:
        surfaceholder;
        throw surfaceholder;
    }

    public void setPreviewTexture(r r1)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Camera camera2 = camera;
        q.a();
        Method method = q.a;
        if (r1.b == null)
        {
            r1.b = q.a(q.b, r1.a, new Object[0]);
        }
        q.a(method, camera2, new Object[] {
            r1.b
        });
        if (true) goto _L1; else goto _L3
_L3:
        r1;
        throw r1;
    }

    public void setZoomChangeListener(android.hardware.Camera.OnZoomChangeListener onzoomchangelistener)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.setZoomChangeListener(onzoomchangelistener);
        if (true) goto _L1; else goto _L3
_L3:
        onzoomchangelistener;
        throw onzoomchangelistener;
    }

    public void startPreview()
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.startPreview();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void startSmoothZoom(int i)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.startSmoothZoom(i);
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void stopPreview()
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.stopPreview();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void takePicture(android.hardware.Camera.ShutterCallback shuttercallback, android.hardware.Camera.PictureCallback picturecallback, android.hardware.Camera.PictureCallback picturecallback1)
    {
        this;
        JVM INSTR monitorenter ;
        Camera camera1 = camera;
        if (camera1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        camera.takePicture(shuttercallback, picturecallback, picturecallback1);
        if (true) goto _L1; else goto _L3
_L3:
        shuttercallback;
        throw shuttercallback;
    }
}
