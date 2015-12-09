// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.ssp;

import com.facebook.ads.AdSize;

// Referenced classes of package com.facebook.ads.internal.ssp:
//            ANAdRenderer

static class 
{

    static final int a[];

    static 
    {
        a = new int[AdSize.values().length];
        try
        {
            a[AdSize.INTERSTITIAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[AdSize.RECTANGLE_HEIGHT_250.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[AdSize.BANNER_HEIGHT_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[AdSize.BANNER_HEIGHT_50.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
