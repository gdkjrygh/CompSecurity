// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class bw extends Enum
{

    public static final bw a;
    private static bw b;
    private static bw c;
    private static bw d;
    private static bw e;
    private static bw f;
    private static bw g;
    private static bw h;
    private static bw i;
    private static final bw j[];

    private bw(String s, int k)
    {
        super(s, k);
    }

    public static bw a(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        bw bw1 = a;
_L6:
        return bw1;
_L2:
        bw abw[];
        int k;
        int l;
        abw = values();
        l = abw.length;
        k = 0;
_L7:
        if (k >= l) goto _L4; else goto _L3
_L3:
        bw bw2;
        bw2 = abw[k];
        if (bw2 == a || bw2 == i)
        {
            continue; /* Loop/switch isn't completed */
        }
        bw1 = bw2;
        if (s.equalsIgnoreCase(bw2.toString())) goto _L6; else goto _L5
_L5:
        k++;
          goto _L7
_L4:
        return a;
    }

    public static bw valueOf(String s)
    {
        return (bw)Enum.valueOf(com/paypal/android/sdk/bw, s);
    }

    public static bw[] values()
    {
        return (bw[])j.clone();
    }

    static 
    {
        b = new bw("AMEX", 0);
        c = new bw("DINERSCLUB", 1);
        d = new bw("DISCOVER", 2);
        e = new bw("JCB", 3);
        f = new bw("MASTERCARD", 4);
        g = new bw("VISA", 5);
        h = new bw("MAESTRO", 6);
        a = new bw("UNKNOWN", 7);
        i = new bw("INSUFFICIENT_DIGITS", 8);
        j = (new bw[] {
            b, c, d, e, f, g, h, a, i
        });
    }
}
