// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


final class ay extends Enum
{

    public static final ay a;
    public static final ay b;
    public static final ay c;
    public static final ay d;
    public static final ay e;
    public static final ay f;
    public static final ay g;
    public static final ay h;
    public static final ay i;
    public static final ay j;
    public static final ay k;
    public static final ay l;
    public static final ay m;
    private static final ay o[];
    private int n;

    private ay(String s, int i1, int j1)
    {
        super(s, i1);
        n = j1;
    }

    public static ay valueOf(String s)
    {
        return (ay)Enum.valueOf(com/yume/android/sdk/ay, s);
    }

    public static ay[] values()
    {
        ay aay[] = o;
        int i1 = aay.length;
        ay aay1[] = new ay[i1];
        System.arraycopy(aay, 0, aay1, 0, i1);
        return aay1;
    }

    public final int a()
    {
        return n;
    }

    static 
    {
        a = new ay("XML_FEED_EMPTY", 0, 1);
        b = new ay("XML_FEED_NO_AD_NODE", 1, 3);
        c = new ay("XML_NO_FEED", 2, 4);
        d = new ay("XML_FEED_NO_CREATIVE", 3, 5);
        e = new ay("XML_MAX_TRACKERS", 4, 6);
        f = new ay("XML_MAX_WRAPPERS", 5, 7);
        g = new ay("XML_FEED_UNSUPPORTED_PLAYLIST", 6, 9);
        h = new ay("CREATIVE_UNSUPPORTED_FORMAT", 7, 10);
        i = new ay("NO_FILLED_UNFILLED_TRACKER", 8, 11);
        j = new ay("XML_MAL_FORMED", 9, 14);
        k = new ay("CREATIVE_ABSENT", 10, 18);
        l = new ay("NONLINEAR_AD_IN_LINEAR_PLACEMENT", 11, 20);
        m = new ay("RESPONSE_TIMED_OUT", 12, 21);
        o = (new ay[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }
}
