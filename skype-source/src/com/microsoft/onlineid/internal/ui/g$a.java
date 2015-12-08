// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;


// Referenced classes of package com.microsoft.onlineid.internal.ui:
//            g

public static final class  extends Enum
{

    public static final t a;
    public static final t b;
    public static final t c;
    public static final t d;
    public static final t e;
    public static final t f;
    public static final t g;
    public static final t h;
    public static final t i;
    public static final t j;
    public static final t k;
    public static final t l;
    public static final t m;
    public static final t n;
    public static final t o;
    public static final t p;
    public static final t q;
    public static final t r;
    public static final t s;
    public static final t t;
    private static final t u[];

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/microsoft/onlineid/internal/ui/g$a, s1);
    }

    public static [] values()
    {
        return ([])u.clone();
    }

    static 
    {
        a = new <init>("CID", 0);
        b = new <init>("DAToken", 1);
        c = new <init>("DASessionKey", 2);
        d = new <init>("ErrorCode", 3);
        e = new <init>("ErrorString", 4);
        f = new <init>("ExtendedErrorString", 5);
        g = new <init>("ErrorURL", 6);
        h = new <init>("Password", 7);
        i = new <init>("PUID", 8);
        j = new <init>("STSInlineFlowToken", 9);
        k = new <init>("Username", 10);
        l = new <init>("PfUsernames", 11);
        m = new <init>("PfFirstName", 12);
        n = new <init>("PfLastName", 13);
        o = new <init>("PfDeviceEmail", 14);
        p = new <init>("PfPhone", 15);
        q = new <init>("PfCountryCode", 16);
        r = new <init>("SmsCode", 17);
        s = new <init>("IsSignUp", 18);
        t = new <init>("SigninName", 19);
        u = (new u[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t
        });
    }

    private (String s1, int i1)
    {
        super(s1, i1);
    }
}
