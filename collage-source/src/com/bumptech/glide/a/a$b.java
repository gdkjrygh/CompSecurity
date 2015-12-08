// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.a;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.bumptech.glide.a:
//            a

private final class <init>
{

    File a[];
    File b[];
    final a c;
    private final String d;
    private final long e[];
    private boolean f;
    private b g;
    private long h;

    static long a(<init> <init>1, long l)
    {
        <init>1.h = l;
        return l;
    }

    static h a(h h1)
    {
        return h1.g;
    }

    static g a(g g1, g g2)
    {
        g1.g = g2;
        return g2;
    }

    static void a(g g1, String as[])
        throws IOException
    {
        g1.a(as);
    }

    private void a(String as[])
        throws IOException
    {
        if (as.length != com.bumptech.glide.a.a.e(c))
        {
            throw b(as);
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
                e[i] = Long.parseLong(as[i]);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw b(as);
            }
            i++;
        } while (true);
    }

    static boolean a(b b1, boolean flag)
    {
        b1.f = flag;
        return flag;
    }

    private IOException b(String as[])
        throws IOException
    {
        throw new IOException((new StringBuilder()).append("unexpected journal line: ").append(Arrays.toString(as)).toString());
    }

    static long[] b(oString ostring)
    {
        return ostring.e;
    }

    static String c(e e1)
    {
        return e1.d;
    }

    static boolean d(d d1)
    {
        return d1.f;
    }

    static long e(f f1)
    {
        return f1.h;
    }

    public File a(int i)
    {
        return a[i];
    }

    public String a()
        throws IOException
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

    public File b(int i)
    {
        return b[i];
    }

    private eption(a a1, String s)
    {
        c = a1;
        super();
        d = s;
        e = new long[com.bumptech.glide.a.a.e(a1)];
        a = new File[com.bumptech.glide.a.a.e(a1)];
        b = new File[com.bumptech.glide.a.a.e(a1)];
        s = (new StringBuilder(s)).append('.');
        int j = s.length();
        for (int i = 0; i < com.bumptech.glide.a.a.e(a1); i++)
        {
            s.append(i);
            a[i] = new File(com.bumptech.glide.a.a.f(a1), s.toString());
            s.append(".tmp");
            b[i] = new File(com.bumptech.glide.a.a.f(a1), s.toString());
            s.setLength(j);
        }

    }

    etLength(a a1, String s, etLength etlength)
    {
        this(a1, s);
    }
}
