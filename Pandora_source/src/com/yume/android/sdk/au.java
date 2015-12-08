// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


final class au extends Enum
{

    public static final au a;
    public static final au b;
    public static final au c;
    public static final au d;
    public static final au e;
    public static final au f;
    public static final au g;
    public static final au h;
    public static final au i;
    public static final au j;
    public static final au k;
    public static final au l;
    public static final au m;
    public static final au n;
    private static au o;
    private static final au q[];
    private String p;

    private au(String s, int i1, String s1)
    {
        super(s, i1);
        p = s1;
    }

    public static au valueOf(String s)
    {
        return (au)Enum.valueOf(com/yume/android/sdk/au, s);
    }

    public static au[] values()
    {
        au aau[] = q;
        int i1 = aau.length;
        au aau1[] = new au[i1];
        System.arraycopy(aau, 0, aau1, 0, i1);
        return aau1;
    }

    public final String a()
    {
        return p;
    }

    static 
    {
        a = new au("UNFILLED", 0, "UnFilled");
        b = new au("FILLED", 1, "Filled");
        c = new au("GENERIC_EMPTY", 2, "Generic Empty");
        d = new au("IMPRESSION", 3, "Impression");
        e = new au("ERROR", 4, "Error");
        f = new au("SURVEY", 5, "Survey");
        o = new au("OVERLAYCLICK", 6, "Overlay Click");
        g = new au("CLICK", 7, "Click");
        h = new au("CREATIVEVIEW", 8, "CreativeView");
        i = new au("ZERO", 9, "0%");
        j = new au("TWENTYFIVE", 10, "25%");
        k = new au("FIFTY", 11, "50%");
        l = new au("SEVENTYFIVE", 12, "75%");
        m = new au("HUNDRED", 13, "100%");
        n = new au("UNKNOWN", 14, "Unknown");
        q = (new au[] {
            a, b, c, d, e, f, o, g, h, i, 
            j, k, l, m, n
        });
    }
}
