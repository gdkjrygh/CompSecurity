// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters.view;

import com.facebook.ads.InterstitialAdActivity;

// Referenced classes of package com.facebook.ads.internal.adapters.view:
//            b, a

public static final class  extends Enum
{

    public static final a a;
    private static final a b[];

    public static b a( , InterstitialAdActivity interstitialadactivity,  1)
    {
        switch (a[.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new a(interstitialadactivity, 1);
        }
    }

    public static nit> valueOf(String s)
    {
        return (nit>)Enum.valueOf(com/facebook/ads/internal/adapters/view/b$b, s);
    }

    public static nit>[] values()
    {
        return (nit>[])b.clone();
    }

    static 
    {
        a = new <init>("DISPLAY", 0);
        b = (new b[] {
            a
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
