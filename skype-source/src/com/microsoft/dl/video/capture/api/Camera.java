// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;

import java.io.Closeable;

// Referenced classes of package com.microsoft.dl.video.capture.api:
//            CaptureException, CameraParameters, CameraCallback

public interface Camera
    extends Closeable
{

    public abstract void addCallbackBuffer(byte abyte0[])
        throws CaptureException;

    public abstract CameraParameters getParameters()
        throws CaptureException;

    public abstract void setCallback(CameraCallback cameracallback)
        throws CaptureException;

    public abstract void setDisplayOrientation(int i)
        throws CaptureException;

    public abstract void setParameters(CameraParameters cameraparameters)
        throws CaptureException;

    public abstract void setPreviewDisplay(Object obj)
        throws CaptureException;

    public abstract void startPreview()
        throws CaptureException;

    public abstract void stopPreview()
        throws CaptureException;
}
