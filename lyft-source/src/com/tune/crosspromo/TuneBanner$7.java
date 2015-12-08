// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tune.crosspromo;


// Referenced classes of package com.tune.crosspromo:
//            TuneBanner, TuneBannerPosition

class ition
{

    static final int a[];

    static 
    {
        a = new int[TuneBannerPosition.values().length];
        try
        {
            a[TuneBannerPosition.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[TuneBannerPosition.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
