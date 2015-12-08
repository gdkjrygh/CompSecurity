// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.real.impl;

import com.microsoft.dl.video.capture.api.ImageFormat;

// Referenced classes of package com.microsoft.dl.video.capture.impl.real.impl:
//            CameraCapabilitiesUtils

static class 
{

    static final int a[];

    static 
    {
        a = new int[ImageFormat.values().length];
        try
        {
            a[ImageFormat.NV21.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[ImageFormat.YV12.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ImageFormat.NV16.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ImageFormat.YUY2.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
