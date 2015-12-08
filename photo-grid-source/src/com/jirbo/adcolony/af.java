// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.PrintStream;

abstract class af
{

    boolean h;
    int i;

    af()
    {
        h = true;
        i = 0;
    }

    public static void b(String as[])
    {
        System.out.println("Test...");
    }

    abstract void a(char c1);

    void a(double d1)
    {
        if (h)
        {
            c();
        }
        if (!Double.isNaN(d1) && !Double.isInfinite(d1)) goto _L2; else goto _L1
_L1:
        a("0.0");
_L4:
        return;
_L2:
        long l2;
        long l3;
        double d2 = d1;
        if (d1 < 0.0D)
        {
            d2 = -d1;
            a('-');
        }
        l2 = (long)Math.pow(10D, 4D);
        long l = Math.round((double)l2 * d2);
        a(l / l2);
        a('.');
        l3 = l % l2;
        if (l3 != 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        int j = 0;
        while (j < 4) 
        {
            a('0');
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        for (long l1 = l3 * 10L; l1 < l2; l1 *= 10L)
        {
            a('0');
        }

        a(l3);
        return;
    }

    void a(long l)
    {
        if (h)
        {
            c();
        }
        if (l == 0L)
        {
            a('0');
            return;
        }
        if (l == -l)
        {
            a("-9223372036854775808");
            return;
        }
        if (l < 0L)
        {
            a('-');
            a(-l);
            return;
        } else
        {
            b(l);
            return;
        }
    }

    void a(Object obj)
    {
        if (h)
        {
            c();
        }
        if (obj == null)
        {
            a("null");
            return;
        } else
        {
            a(obj.toString());
            return;
        }
    }

    void a(String s)
    {
        int k = s.length();
        for (int j = 0; j < k; j++)
        {
            b(s.charAt(j));
        }

    }

    void a(boolean flag)
    {
        if (flag)
        {
            a("true");
            return;
        } else
        {
            a("false");
            return;
        }
    }

    void b(char c1)
    {
        if (h)
        {
            c();
        }
        a(c1);
        if (c1 == '\n')
        {
            h = true;
        }
    }

    void b(double d1)
    {
        a(d1);
        b('\n');
    }

    void b(long l)
    {
        if (l == 0L)
        {
            return;
        } else
        {
            b(l / 10L);
            a((char)(int)(48L + l % 10L));
            return;
        }
    }

    void b(Object obj)
    {
        a(obj);
        b('\n');
    }

    void b(String s)
    {
        a(s);
        b('\n');
    }

    void b(boolean flag)
    {
        a(flag);
        b('\n');
    }

    void c()
    {
        if (h)
        {
            h = false;
            int j = i;
            do
            {
                j--;
                if (j < 0)
                {
                    break;
                }
                a(' ');
            } while (true);
        }
    }

    void c(char c1)
    {
        b(c1);
        b('\n');
    }

    void c(long l)
    {
        a(l);
        b('\n');
    }

    void d()
    {
        b('\n');
    }
}
