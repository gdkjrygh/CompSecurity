// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.platform.capture;

import java.io.Closeable;

// Referenced classes of package com.skype.android.platform.capture:
//            CaptureException, CameraCapabilities, CameraCallback, CameraParameters

public interface Camera
    extends Closeable
{

    public abstract CameraCapabilities a()
        throws CaptureException;

    public abstract void a(int i)
        throws CaptureException;

    public abstract void a(CameraCallback cameracallback)
        throws CaptureException;

    public abstract void a(CameraParameters cameraparameters)
        throws CaptureException;

    public abstract void a(Object obj)
        throws CaptureException;

    public abstract void a(byte abyte0[])
        throws CaptureException;

    public abstract CameraParameters b()
        throws CaptureException;

    public abstract void c()
        throws CaptureException;

    public abstract void d()
        throws CaptureException;
}
