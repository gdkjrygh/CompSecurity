// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class cvt
{

    final String a;
    final long b[];
    boolean c;
    cvr d;
    long e;
    private cvq f;

    private cvt(cvq cvq1, String s)
    {
        f = cvq1;
        super();
        a = s;
        b = new long[cvq.f(cvq1)];
    }

    cvt(cvq cvq1, String s, byte byte0)
    {
        this(cvq1, s);
    }

    private static IOException b(String as[])
    {
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(Arrays.toString(as)).toString());
    }

    public final File a(int i)
    {
        return new File(cvq.g(f), (new StringBuilder()).append(a).append(".").append(i).toString());
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        long al[] = b;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            stringbuilder.append(' ').append(l);
        }

        return stringbuilder.toString();
    }

    final void a(String as[])
    {
        if (as.length != cvq.f(f))
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
                b[i] = Long.parseLong(as[i]);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw b(as);
            }
            i++;
        } while (true);
    }

    public final File b(int i)
    {
        return new File(cvq.g(f), (new StringBuilder()).append(a).append(".").append(i).append(".tmp").toString());
    }
}
