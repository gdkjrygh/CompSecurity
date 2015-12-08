// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;

import java.io.Closeable;

// Referenced classes of package com.microsoft.dl.video.capture.api:
//            CaptureException, CameraCapabilities, Camera

public interface CameraManager
    extends Closeable
{

    public abstract CameraCapabilities getCameraCapabilities(int i)
        throws CaptureException;

    public abstract int getNumberOfCameras();

    public abstract Camera openCamera(int i)
        throws CaptureException;
}
