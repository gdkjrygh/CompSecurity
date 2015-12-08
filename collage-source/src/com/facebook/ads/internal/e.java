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
    public static final e k;
    private static final e m[];
    private final int l;

    private e(String s, int i1, int j1)
    {
        super(s, i1);
        l = j1;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/ads/internal/e, s);
    }

    public static e[] values()
    {
        return (e[])m.clone();
    }

    public int a()
    {
        return l;
    }

    static 
    {
        a = new e("UNKNOWN", 0, 0);
        b = new e("WEBVIEW_BANNER_LEGACY", 1, 4);
        c = new e("WEBVIEW_BANNER_50", 2, 5);
        d = new e("WEBVIEW_BANNER_90", 3, 6);
        e = new e("WEBVIEW_BANNER_250", 4, 7);
        f = new e("WEBVIEW_INTERSTITIAL_UNKNOWN", 5, 100);
        g = new e("WEBVIEW_INTERSTITIAL_HORIZONTAL", 6, 101);
        h = new e("WEBVIEW_INTERSTITIAL_VERTICAL", 7, 102);
        i = new e("WEBVIEW_INTERSTITIAL_TABLET", 8, 103);
        j = new e("NATIVE_UNKNOWN", 9, 200);
        k = new e("NATIVE_250", 10, 201);
        m = (new e[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
