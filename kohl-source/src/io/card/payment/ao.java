// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;


public final class ao extends Enum
{

    public static final ao a;
    public static final ao b;
    public static final ao c;
    public static final ao d;
    public static final ao e;
    public static final ao f;
    public static final ao g;
    public static final ao h;
    public static final ao i;
    public static final ao j;
    public static final ao k;
    public static final ao l;
    public static final ao m;
    public static final ao n;
    public static final ao o;
    public static final ao p;
    public static final ao q;
    public static final ao r;
    public static final ao s;
    public static final ao t;
    public static final ao u;
    public static final ao v;
    public static final ao w;
    private static final ao x[];

    private ao(String s1, int i1)
    {
        super(s1, i1);
    }

    public static ao valueOf(String s1)
    {
        return (ao)Enum.valueOf(io/card/payment/ao, s1);
    }

    public static ao[] values()
    {
        return (ao[])x.clone();
    }

    static 
    {
        a = new ao("APP_NOT_AUTHORIZED_MESSAGE", 0);
        b = new ao("CANCEL", 1);
        c = new ao("CARDTYPE_AMERICANEXPRESS", 2);
        d = new ao("CARDTYPE_DISCOVER", 3);
        e = new ao("CARDTYPE_JCB", 4);
        f = new ao("CARDTYPE_MASTERCARD", 5);
        g = new ao("CARDTYPE_VISA", 6);
        h = new ao("DONE", 7);
        i = new ao("ENTRY_CVV", 8);
        j = new ao("ENTRY_POSTAL_CODE", 9);
        k = new ao("ENTRY_EXPIRES", 10);
        l = new ao("ENTRY_NUMBER", 11);
        m = new ao("ENTRY_TITLE", 12);
        n = new ao("EXPIRES_PLACEHOLDER", 13);
        o = new ao("OK", 14);
        p = new ao("SCAN_GUIDE", 15);
        q = new ao("KEYBOARD", 16);
        r = new ao("ENTRY_CARD_NUMBER", 17);
        s = new ao("MANUAL_ENTRY_TITLE", 18);
        t = new ao("WHOOPS", 19);
        u = new ao("ERROR_NO_DEVICE_SUPPORT", 20);
        v = new ao("ERROR_CAMERA_CONNECT_FAIL", 21);
        w = new ao("ERROR_CAMERA_UNEXPECTED_FAIL", 22);
        x = (new ao[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w
        });
    }
}
