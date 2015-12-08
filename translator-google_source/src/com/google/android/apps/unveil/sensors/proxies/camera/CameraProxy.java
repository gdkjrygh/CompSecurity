// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.sensors.proxies.camera;

import android.view.SurfaceHolder;
import com.google.android.apps.unveil.env.r;

// Referenced classes of package com.google.android.apps.unveil.sensors.proxies.camera:
//            ParametersProxy

public interface CameraProxy
{

    public abstract void addCallbackBuffer(byte abyte0[]);

    public abstract void autoFocus(android.hardware.Camera.AutoFocusCallback autofocuscallback);

    public abstract void cancelAutoFocus();

    public abstract ParametersProxy getParameters();

    public abstract void release();

    public abstract void setDisplayOrientation(int i);

    public abstract void setOneShotPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback);

    public abstract void setParameters(ParametersProxy parametersproxy);

    public abstract void setPreviewCallback(android.hardware.Camera.PreviewCallback previewcallback);

    public abstract void setPreviewCallbackWithBuffer(android.hardware.Camera.PreviewCallback previewcallback);

    public abstract void setPreviewDisplay(SurfaceHolder surfaceholder);

    public abstract void setPreviewTexture(r r);

    public abstract void setZoomChangeListener(android.hardware.Camera.OnZoomChangeListener onzoomchangelistener);

    public abstract void startPreview();

    public abstract void startSmoothZoom(int i);

    public abstract void stopPreview();

    public abstract void takePicture(android.hardware.Camera.ShutterCallback shuttercallback, android.hardware.Camera.PictureCallback picturecallback, android.hardware.Camera.PictureCallback picturecallback1);
}
