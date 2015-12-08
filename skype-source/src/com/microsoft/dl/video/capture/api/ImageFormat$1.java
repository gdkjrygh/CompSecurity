// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.api;


// Referenced classes of package com.microsoft.dl.video.capture.api:
//            ImageFormat

static class 
{

    static final int a[];

    static 
    {
        a = new int[ImageFormat.values().length];
        try
        {
            a[ImageFormat.YV12.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
    }
}
