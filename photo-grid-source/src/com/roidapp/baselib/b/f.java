// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.roidapp.baselib.b:
//            b, d

final class f
{

    final b a;
    private final String b;
    private final long c[];
    private boolean d;
    private d e;
    private long f;

    private f(b b1, String s)
    {
        a = b1;
        super();
        b = s;
        c = new long[com.roidapp.baselib.b.b.f(b1)];
    }

    f(b b1, String s, byte byte0)
    {
        this(b1, s);
    }

    static long a(f f1, long l)
    {
        f1.f = l;
        return l;
    }

    static d a(f f1, d d1)
    {
        f1.e = d1;
        return d1;
    }

    private static IOException a(String as[])
    {
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(Arrays.toString(as)).toString());
    }

    static void a(f f1, String as[])
    {
        if (as.length != com.roidapp.baselib.b.b.f(f1.a))
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
                f1.c[i] = Long.parseLong(as[i]);
            }
            // Misplaced declaration of an exception variable
            catch (f f1)
            {
                throw a(as);
            }
            i++;
        } while (true);
    }

    static boolean a(f f1)
    {
        f1.d = true;
        return true;
    }

    static d b(f f1)
    {
        return f1.e;
    }

    static long[] c(f f1)
    {
        return f1.c;
    }

    static String d(f f1)
    {
        return f1.b;
    }

    static boolean e(f f1)
    {
        return f1.d;
    }

    static long f(f f1)
    {
        return f1.f;
    }

    public final File a(int i)
    {
        return new File(com.roidapp.baselib.b.b.g(a), (new StringBuilder()).append(b).append(".").append(i).toString());
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        long al[] = c;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            stringbuilder.append(' ').append(l);
        }

        return stringbuilder.toString();
    }

    public final File b(int i)
    {
        return new File(com.roidapp.baselib.b.b.g(a), (new StringBuilder()).append(b).append(".").append(i).append(".tmp").toString());
    }
}
