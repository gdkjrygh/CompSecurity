// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Date;

public final class gtx
{

    final long a;
    final grq b;
    final grt c;
    Date d;
    String e;
    Date f;
    String g;
    Date h;
    long i;
    long j;
    String k;
    int l;

    public gtx(long l1, grq grq1, grt grt1)
    {
        l = -1;
        a = l1;
        b = grq1;
        c = grt1;
        if (grt1 != null)
        {
            grq1 = grt1.f;
            int i1 = 0;
            int j1 = ((grh) (grq1)).a.length / 2;
            while (i1 < j1) 
            {
                grt1 = grq1.a(i1);
                String s = grq1.b(i1);
                if ("Date".equalsIgnoreCase(grt1))
                {
                    d = guh.a(s);
                    e = s;
                } else
                if ("Expires".equalsIgnoreCase(grt1))
                {
                    h = guh.a(s);
                } else
                if ("Last-Modified".equalsIgnoreCase(grt1))
                {
                    f = guh.a(s);
                    g = s;
                } else
                if ("ETag".equalsIgnoreCase(grt1))
                {
                    k = s;
                } else
                if ("Age".equalsIgnoreCase(grt1))
                {
                    l = gtz.b(s, -1);
                } else
                if (gum.a.equalsIgnoreCase(grt1))
                {
                    i = Long.parseLong(s);
                } else
                if (gum.b.equalsIgnoreCase(grt1))
                {
                    j = Long.parseLong(s);
                }
                i1++;
            }
        }
    }

    static boolean a(grq grq1)
    {
        return grq1.a("If-Modified-Since") != null || grq1.a("If-None-Match") != null;
    }
}
