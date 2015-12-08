// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.platform.capture;

import java.io.Closeable;

// Referenced classes of package com.skype.android.platform.capture:
//            CaptureException, Camera, CameraInfo

public interface CameraManager
    extends Closeable
{

    public abstract int a();

    public abstract Camera a(int i)
        throws CaptureException;

    public abstract CameraInfo b(int i)
        throws CaptureException;
}
