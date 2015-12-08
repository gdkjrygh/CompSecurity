// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.a;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.bumptech.glide.a:
//            a, c

final class d
{

    File a[];
    File b[];
    final a c;
    private final String d;
    private final long e[];
    private boolean f;
    private c g;
    private long h;

    private d(a a1, String s)
    {
        c = a1;
        super();
        d = s;
        e = new long[com.bumptech.glide.a.a.f(a1)];
        a = new File[com.bumptech.glide.a.a.f(a1)];
        b = new File[com.bumptech.glide.a.a.f(a1)];
        s = (new StringBuilder(s)).append('.');
        int j = s.length();
        for (int i = 0; i < com.bumptech.glide.a.a.f(a1); i++)
        {
            s.append(i);
            a[i] = new File(com.bumptech.glide.a.a.g(a1), s.toString());
            s.append(".tmp");
            b[i] = new File(com.bumptech.glide.a.a.g(a1), s.toString());
            s.setLength(j);
        }

    }

    d(a a1, String s, byte byte0)
    {
        this(a1, s);
    }

    static long a(d d1, long l)
    {
        d1.h = l;
        return l;
    }

    static c a(d d1, c c1)
    {
        d1.g = c1;
        return c1;
    }

    private static IOException a(String as[])
    {
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(Arrays.toString(as)).toString());
    }

    static void a(d d1, String as[])
    {
        if (as.length != com.bumptech.glide.a.a.f(d1.c))
        {
            throw a(as);
        }
        int i = 0;
        do
        {
            try
            {
                if (i >= as.length)
                {
                    break;
                }
                d1.e[i] = Long.parseLong(as[i]);
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                throw a(as);
            }
            i++;
        } while (true);
    }

    static boolean a(d d1)
    {
        d1.f = true;
        return true;
    }

    static c b(d d1)
    {
        return d1.g;
    }

    static long[] c(d d1)
    {
        return d1.e;
    }

    static String d(d d1)
    {
        return d1.d;
    }

    static boolean e(d d1)
    {
        return d1.f;
    }

    static long f(d d1)
    {
        return d1.h;
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        long al[] = e;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            stringbuilder.append(' ').append(l);
        }

        return stringbuilder.toString();
    }
}
