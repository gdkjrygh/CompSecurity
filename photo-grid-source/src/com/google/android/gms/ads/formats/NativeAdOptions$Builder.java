// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;


// Referenced classes of package com.google.android.gms.ads.formats:
//            NativeAdOptions

public final class c
{

    private boolean a;
    private int b;
    private boolean c;

    static boolean a(c c1)
    {
        return c1.a;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    static boolean c(b b1)
    {
        return b1.c;
    }

    public final NativeAdOptions build()
    {
        return new NativeAdOptions(this, (byte)0);
    }

    public final c setImageOrientation(int i)
    {
        b = i;
        return this;
    }

    public final b setRequestMultipleImages(boolean flag)
    {
        c = flag;
        return this;
    }

    public final c setReturnUrlsForImageAssets(boolean flag)
    {
        a = flag;
        return this;
    }

    public ()
    {
        a = false;
        b = 0;
        c = false;
    }
}
