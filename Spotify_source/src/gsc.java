// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

final class gsc
{

    final String a;
    final long b[];
    final File c[];
    final File d[];
    boolean e;
    gsb f;
    long g;
    private gsa h;

    private gsc(gsa gsa1, String s)
    {
        h = gsa1;
        super();
        a = s;
        b = new long[gsa.a()];
        c = new File[gsa.a()];
        d = new File[gsa.a()];
        s = (new StringBuilder(s)).append('.');
        int j = s.length();
        for (int i = 0; i < gsa.a(); i++)
        {
            s.append(i);
            c[i] = new File(gsa.i(gsa1), s.toString());
            s.append(".tmp");
            d[i] = new File(gsa.i(gsa1), s.toString());
            s.setLength(j);
        }

    }

    gsc(gsa gsa1, String s, byte byte0)
    {
        this(gsa1, s);
    }

    private static IOException b(String as[])
    {
        throw new IOException((new StringBuilder("unexpected journal line: ")).append(Arrays.toString(as)).toString());
    }

    final gsd a()
    {
        hcw ahcw[];
        int i;
        boolean flag;
        flag = false;
        if (!Thread.holdsLock(h))
        {
            throw new AssertionError();
        }
        ahcw = new hcw[gsa.a()];
        b.clone();
        i = 0;
_L2:
        if (i >= gsa.a())
        {
            break; /* Loop/switch isn't completed */
        }
        ahcw[i] = gsa.h(h).a(c[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        gsd gsd1 = new gsd(h, a, g, ahcw, (byte)0);
        return gsd1;
_L4:
        for (; i < gsa.a() && ahcw[i] != null; i++)
        {
            gsp.a(ahcw[i]);
        }

        return null;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        i = ((flag) ? 1 : 0);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(hci hci1)
    {
        long al[] = b;
        int j = al.length;
        for (int i = 0; i < j; i++)
        {
            long l = al[i];
            hci1.h(32).j(l);
        }

    }

    final void a(String as[])
    {
        if (as.length != gsa.a())
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
