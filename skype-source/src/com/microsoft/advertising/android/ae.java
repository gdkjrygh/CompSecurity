// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


final class ae extends Enum
{

    public static final ae a;
    public static final ae b;
    public static final ae c;
    public static final ae d;
    public static final ae e;
    public static final ae f;
    public static final ae g;
    public static final ae h;
    public static final ae i;
    public static final ae j;
    public static final ae k;
    public static final ae l;
    public static final ae m;
    public static final ae n;
    private static final ae p[];
    private final String o;

    private ae(String s, int i1, String s1)
    {
        super(s, i1);
        o = s1;
    }

    public static ae valueOf(String s)
    {
        return (ae)Enum.valueOf(com/microsoft/advertising/android/ae, s);
    }

    public static ae[] values()
    {
        ae aae[] = p;
        int i1 = aae.length;
        ae aae1[] = new ae[i1];
        System.arraycopy(aae, 0, aae1, 0, i1);
        return aae1;
    }

    public final String a()
    {
        return o;
    }

    static 
    {
        a = new ae("ORIENTATION_CHANGE_DETECTED", 0, "ORIENTATION_CHANGE_DETECTED");
        b = new ae("IMPRESSION_SENT", 1, "IMPRESSION_SENT");
        c = new ae("REFRESH_ANIMATION_COMPLETE", 2, "REFRESH_ANIMATION_COMPLETE");
        d = new ae("SCHEDULING_FETCH", 3, "SCHEDULING_FETCH");
        e = new ae("PREFETCHED_AD_USED", 4, "PREFETCHED_AD_USED");
        f = new ae("AD_FETCH_STARTED", 5, "AD_FETCH_STARTED");
        g = new ae("AD_PRE_RENDER_STARTED", 6, "AD_PRE_RENDER_STARTED");
        h = new ae("AD_LOAD_FAILURE", 7, "AD_LOAD_FAILURE");
        i = new ae("AD_PRE_RENDER_FAILED", 8, "AD_PRE_RENDER_FAILED");
        j = new ae("AD_PRE_RENDER_SUCCESS", 9, "AD_PRE_RENDER_SUCCESS");
        k = new ae("AD_PRE_RENDER_DISCARDED", 10, "AD_PRE_RENDER_DISCARDED");
        l = new ae("AD_PRE_RENDER_USED", 11, "AD_PRE_RENDER_USED");
        m = new ae("SHOW_AD_BLOCKED", 12, "SHOW_AD_BLOCKED");
        n = new ae("PERFORMANCE", 13, "PERFORMANCE");
        p = (new ae[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n
        });
    }
}
