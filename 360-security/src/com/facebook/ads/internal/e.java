// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    private static final e l[];
    private final int k;

    private e(String s, int i1, int j1)
    {
        super(s, i1);
        k = j1;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/ads/internal/e, s);
    }

    public static e[] values()
    {
        return (e[])l.clone();
    }

    public int a()
    {
        return k;
    }

    static 
    {
        a = new e("UNKNOWN", 0, 0);
        b = new e("WEBVIEW_BANNER_LEGACY", 1, 4);
        c = new e("WEBVIEW_BANNER_50", 2, 5);
        d = new e("WEBVIEW_BANNER_90", 3, 6);
        e = new e("WEBVIEW_INTERSTITIAL_UNKNOWN", 4, 100);
        f = new e("WEBVIEW_INTERSTITIAL_HORIZONTAL", 5, 101);
        g = new e("WEBVIEW_INTERSTITIAL_VERTICAL", 6, 102);
        h = new e("WEBVIEW_INTERSTITIAL_TABLET", 7, 103);
        i = new e("NATIVE_UNKNOWN", 8, 200);
        j = new e("NATIVE_250", 9, 201);
        l = (new e[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
