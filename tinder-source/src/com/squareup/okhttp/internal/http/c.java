// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.d;
import com.squareup.okhttp.o;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import java.util.Date;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            g, e, k

public final class c
{
    public static final class a
    {

        public final long a;
        public final t b;
        public final v c;
        public Date d;
        public String e;
        public Date f;
        public String g;
        public Date h;
        public long i;
        public long j;
        public String k;
        public int l;

        public static boolean a(t t1)
        {
            return t1.a("If-Modified-Since") != null || t1.a("If-None-Match") != null;
        }

        public a(long l1, t t1, v v1)
        {
            l = -1;
            a = l1;
            b = t1;
            c = v1;
            if (v1 != null)
            {
                t1 = v1.f;
                int i1 = 0;
                int j1 = ((o) (t1)).a.length / 2;
                while (i1 < j1) 
                {
                    v1 = t1.a(i1);
                    String s = t1.b(i1);
                    if ("Date".equalsIgnoreCase(v1))
                    {
                        d = com.squareup.okhttp.internal.http.g.a(s);
                        e = s;
                    } else
                    if ("Expires".equalsIgnoreCase(v1))
                    {
                        h = com.squareup.okhttp.internal.http.g.a(s);
                    } else
                    if ("Last-Modified".equalsIgnoreCase(v1))
                    {
                        f = com.squareup.okhttp.internal.http.g.a(s);
                        g = s;
                    } else
                    if ("ETag".equalsIgnoreCase(v1))
                    {
                        k = s;
                    } else
                    if ("Age".equalsIgnoreCase(v1))
                    {
                        l = com.squareup.okhttp.internal.http.e.b(s, -1);
                    } else
                    if (k.b.equalsIgnoreCase(v1))
                    {
                        i = Long.parseLong(s);
                    } else
                    if (k.c.equalsIgnoreCase(v1))
                    {
                        j = Long.parseLong(s);
                    }
                    i1++;
                }
            }
        }
    }


    public final t a;
    public final v b;

    private c(t t1, v v1)
    {
        a = t1;
        b = v1;
    }

    public c(t t1, v v1, byte byte0)
    {
        this(t1, v1);
    }

    public static boolean a(v v1, t t1)
    {
        v1.c;
        JVM INSTR lookupswitch 13: default 120
    //                   200: 162
    //                   203: 162
    //                   204: 162
    //                   300: 162
    //                   301: 162
    //                   302: 122
    //                   307: 122
    //                   308: 162
    //                   404: 162
    //                   405: 162
    //                   410: 162
    //                   414: 162
    //                   501: 162;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L3 _L3 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        return false;
_L3:
        if (v1.a("Expires") == null && v1.h().e == -1 && !v1.h().g && !v1.h().f)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (!v1.h().d && !t1.c().d)
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
