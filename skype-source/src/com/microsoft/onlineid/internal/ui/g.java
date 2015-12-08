// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import java.util.HashMap;
import java.util.Map;

public final class g
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        private static final a u[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/internal/ui/g$a, s1);
        }

        public static a[] values()
        {
            return (a[])u.clone();
        }

        static 
        {
            a = new a("CID", 0);
            b = new a("DAToken", 1);
            c = new a("DASessionKey", 2);
            d = new a("ErrorCode", 3);
            e = new a("ErrorString", 4);
            f = new a("ExtendedErrorString", 5);
            g = new a("ErrorURL", 6);
            h = new a("Password", 7);
            i = new a("PUID", 8);
            j = new a("STSInlineFlowToken", 9);
            k = new a("Username", 10);
            l = new a("PfUsernames", 11);
            m = new a("PfFirstName", 12);
            n = new a("PfLastName", 13);
            o = new a("PfDeviceEmail", 14);
            p = new a("PfPhone", 15);
            q = new a("PfCountryCode", 16);
            r = new a("SmsCode", 17);
            s = new a("IsSignUp", 18);
            t = new a("SigninName", 19);
            u = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private final Map a = new HashMap();

    public g()
    {
    }

    public final String a(a a1)
    {
        return (String)a.get(a1);
    }

    public final void a(a a1, String s)
    {
        a.put(a1, s);
    }
}
