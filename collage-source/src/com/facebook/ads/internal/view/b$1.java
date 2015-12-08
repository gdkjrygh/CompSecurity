// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view;


// Referenced classes of package com.facebook.ads.internal.view:
//            b

static class 
{

    static final int a[];

    static 
    {
        a = new int[com.facebook.ads.veAdView.Type.values().length];
        try
        {
            a[com.facebook.ads.veAdView.Type.HEIGHT_400.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[com.facebook.ads.veAdView.Type.HEIGHT_300.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[com.facebook.ads.veAdView.Type.HEIGHT_100.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[com.facebook.ads.veAdView.Type.HEIGHT_120.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
