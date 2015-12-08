// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class amp
{

    final String a;
    final long b[];
    File c[];
    File d[];
    boolean e;
    amo f;
    long g;
    private amm h;

    amp(amm amm1, String s)
    {
        h = amm1;
        super();
        a = s;
        b = new long[amm.e(amm1)];
        c = new File[amm.e(amm1)];
        d = new File[amm.e(amm1)];
        s = (new StringBuilder(s)).append('.');
        int j = s.length();
        for (int i = 0; i < amm.e(amm1); i++)
        {
            s.append(i);
            c[i] = new File(amm.f(amm1), s.toString());
            s.append(".tmp");
            d[i] = new File(amm.f(amm1), s.toString());
            s.setLength(j);
        }

    }

    private static IOException b(String as[])
    {
        as = String.valueOf(Arrays.toString(as));
        if (as.length() != 0)
        {
            as = "unexpected journal line: ".concat(as);
        } else
        {
            as = new String("unexpected journal line: ");
        }
        throw new IOException(as);
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

    void a(String as[])
    {
        if (as.length != amm.e(h))
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
}
