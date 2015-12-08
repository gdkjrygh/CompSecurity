// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.impl.capture;

import com.skype.android.platform.capture.ImageFormat;

// Referenced classes of package com.skype.android.impl.capture:
//            CameraImpl

static final class at
{

    static final int a[];

    static 
    {
        a = new int[ImageFormat.values().length];
        try
        {
            a[ImageFormat.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ImageFormat.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
