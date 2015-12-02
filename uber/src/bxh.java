// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bxh extends Enum
{

    public static final bxh a;
    public static final bxh b;
    public static final bxh c;
    public static final bxh d;
    public static final bxh e;
    public static final bxh f;
    public static final bxh g;
    public static final bxh h;
    public static final bxh i;
    public static final bxh j;
    public static final bxh k;
    public static final bxh l;
    public static final bxh m;
    public static final bxh n;
    public static final bxh o;
    public static final bxh p;
    public static final bxh q;
    public static final bxh r;
    private static final bxh s[];

    private bxh(String s1, int i1)
    {
        super(s1, i1);
    }

    public static bxh valueOf(String s1)
    {
        return (bxh)Enum.valueOf(bxh, s1);
    }

    public static bxh[] values()
    {
        return (bxh[])s.clone();
    }

    static 
    {
        a = new bxh("CANCEL", 0);
        b = new bxh("CARDTYPE_AMERICANEXPRESS", 1);
        c = new bxh("CARDTYPE_DISCOVER", 2);
        d = new bxh("CARDTYPE_JCB", 3);
        e = new bxh("CARDTYPE_MASTERCARD", 4);
        f = new bxh("CARDTYPE_VISA", 5);
        g = new bxh("DONE", 6);
        h = new bxh("ENTRY_CVV", 7);
        i = new bxh("ENTRY_POSTAL_CODE", 8);
        j = new bxh("ENTRY_EXPIRES", 9);
        k = new bxh("EXPIRES_PLACEHOLDER", 10);
        l = new bxh("SCAN_GUIDE", 11);
        m = new bxh("KEYBOARD", 12);
        n = new bxh("ENTRY_CARD_NUMBER", 13);
        o = new bxh("MANUAL_ENTRY_TITLE", 14);
        p = new bxh("ERROR_NO_DEVICE_SUPPORT", 15);
        q = new bxh("ERROR_CAMERA_CONNECT_FAIL", 16);
        r = new bxh("ERROR_CAMERA_UNEXPECTED_FAIL", 17);
        s = (new bxh[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
