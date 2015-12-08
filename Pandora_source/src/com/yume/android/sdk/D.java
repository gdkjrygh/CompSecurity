// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


final class D extends Enum
{

    public static final D a;
    public static final D b;
    public static final D c;
    public static final D d;
    public static final D e;
    public static final D f;
    public static final D g;
    public static final D h;
    public static final D i;
    public static final D j;
    private static D k;
    private static final D l[];

    private D(String s, int i1)
    {
        super(s, i1);
    }

    public static D valueOf(String s)
    {
        return (D)Enum.valueOf(com/yume/android/sdk/D, s);
    }

    public static D[] values()
    {
        D ad[] = l;
        int i1 = ad.length;
        D ad1[] = new D[i1];
        System.arraycopy(ad, 0, ad1, 0, i1);
        return ad1;
    }

    static 
    {
        a = new D("NONE", 0);
        b = new D("GOTOURL", 1);
        c = new D("LINKTOSLATE", 2);
        d = new D("CALL", 3);
        e = new D("CLOSEAD", 4);
        f = new D("CALENDAR", 5);
        g = new D("PLAY", 6);
        h = new D("PAUSE", 7);
        i = new D("REPLAY", 8);
        j = new D("FLIP", 9);
        k = new D("TIMER", 10);
        l = (new D[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
