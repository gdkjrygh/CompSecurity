// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;

import com.microsoft.dl.video.capture.api.CameraCapabilities;
import java.util.Comparator;

// Referenced classes of package com.microsoft.dl.video.capture.impl.virtual.impl:
//            CameraConfig

static final class 
    implements Comparator
{

    public final int compare(CameraConfig cameraconfig, CameraConfig cameraconfig1)
    {
        int i = CameraConfig.a(cameraconfig).getCameraId() - CameraConfig.a(cameraconfig1).getCameraId();
        if (i > 0)
        {
            return 1;
        }
        return i >= 0 ? 0 : -1;
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((CameraConfig)obj, (CameraConfig)obj1);
    }

    ()
    {
    }
}
