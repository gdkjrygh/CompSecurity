// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;

import com.skype.android.platform.capture.CameraCapabilities;
import java.util.Comparator;

// Referenced classes of package com.skype.android.fake.capture.impl:
//            CameraConfig

static final class es
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (CameraConfig)obj;
        obj1 = (CameraConfig)obj1;
        int i = ((CameraConfig) (obj)).b.a() - ((CameraConfig) (obj1)).b.a();
        if (i > 0)
        {
            return 1;
        }
        return i >= 0 ? 0 : -1;
    }

    es()
    {
    }
}
