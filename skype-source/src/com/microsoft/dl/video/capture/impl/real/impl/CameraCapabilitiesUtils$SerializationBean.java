// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.real.impl;

import android.os.Build;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.microsoft.dl.video.capture.impl.real.impl:
//            CameraCapabilitiesUtils

private static class b
    implements Serializable
{

    private final String a;
    private final List b;

    public List getCapabilities()
    {
        return b;
    }

    public boolean isSameOSBuild()
    {
        return Build.FINGERPRINT.equals(a);
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [osBuildFingerprint=").append(a).append(", capabilities=").append(b).append("]").toString();
    }

    public (List list)
    {
        a = Build.FINGERPRINT;
        b = list;
    }
}
