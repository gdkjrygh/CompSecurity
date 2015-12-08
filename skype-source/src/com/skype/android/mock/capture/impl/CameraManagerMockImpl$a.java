// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mock.capture.impl;

import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.platform.capture.CameraInfo;
import com.skype.android.platform.capture.CameraParameters;

// Referenced classes of package com.skype.android.mock.capture.impl:
//            CameraManagerMockImpl

private static final class A
{

    private final CameraInfo a;
    private final CameraCapabilities b;
    private final CameraParameters c;

    public final CameraCapabilities a()
    {
        return b;
    }

    public final CameraParameters b()
    {
        return c;
    }

    public final CameraInfo c()
    {
        return a;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [info=").append(a).append(", capabilities=").append(b).append(", initialParameters=").append(c).append("]").toString();
    }
}
