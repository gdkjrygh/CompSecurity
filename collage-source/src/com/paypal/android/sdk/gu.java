// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


public final class gu extends Enum
{

    public static final gu a;
    public static final gu b;
    public static final gu c;
    public static final gu d;
    public static final gu e;
    public static final gu f;
    public static final gu g;
    public static final gu h;
    public static final gu i;
    public static final gu j;
    public static final gu k;
    public static final gu l;
    public static final gu m;
    public static final gu n;
    public static final gu o;
    public static final gu p;
    public static final gu q;
    public static final gu r;
    private static final gu s[];

    private gu(String s1, int i1)
    {
        super(s1, i1);
    }

    public static gu valueOf(String s1)
    {
        return (gu)Enum.valueOf(com/paypal/android/sdk/gu, s1);
    }

    public static gu[] values()
    {
        return (gu[])s.clone();
    }

    static 
    {
        a = new gu("CANCEL", 0);
        b = new gu("CARDTYPE_AMERICANEXPRESS", 1);
        c = new gu("CARDTYPE_DISCOVER", 2);
        d = new gu("CARDTYPE_JCB", 3);
        e = new gu("CARDTYPE_MASTERCARD", 4);
        f = new gu("CARDTYPE_VISA", 5);
        g = new gu("DONE", 6);
        h = new gu("ENTRY_CVV", 7);
        i = new gu("ENTRY_POSTAL_CODE", 8);
        j = new gu("ENTRY_EXPIRES", 9);
        k = new gu("EXPIRES_PLACEHOLDER", 10);
        l = new gu("SCAN_GUIDE", 11);
        m = new gu("KEYBOARD", 12);
        n = new gu("ENTRY_CARD_NUMBER", 13);
        o = new gu("MANUAL_ENTRY_TITLE", 14);
        p = new gu("ERROR_NO_DEVICE_SUPPORT", 15);
        q = new gu("ERROR_CAMERA_CONNECT_FAIL", 16);
        r = new gu("ERROR_CAMERA_UNEXPECTED_FAIL", 17);
        s = (new gu[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
