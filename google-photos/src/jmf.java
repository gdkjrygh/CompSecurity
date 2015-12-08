// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.charset.Charset;
import java.util.Stack;

class jmf
{

    final byte a[] = new byte[8];
    final Stack b = new Stack();
    final jmi c = new jmi();
    jmg d;
    int e;
    int f;
    long g;

    jmf()
    {
    }

    long a(jke jke1, int i)
    {
        int j = 0;
        jke1.b(a, 0, i);
        long l = 0L;
        for (; j < i; j++)
        {
            l = l << 8 | (long)(a[j] & 0xff);
        }

        return l;
    }

    public void a()
    {
        e = 0;
        b.clear();
        c.a();
    }

    public void a(jmg jmg1)
    {
        d = jmg1;
    }

    public boolean a(jke jke1)
    {
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        do
        {
            if (!b.isEmpty() && jke1.b() >= ((jme)b.peek()).b)
            {
                d.c(((jme)b.pop()).a);
                return true;
            }
            if (e == 0)
            {
                long l5 = c.a(jke1, true, false, 4);
                long l = l5;
                if (l5 == -2L)
                {
                    l = b(jke1);
                }
                if (l == -1L)
                {
                    return false;
                }
                f = (int)l;
                e = 1;
            }
            if (e == 1)
            {
                g = c.a(jke1, false, true, 8);
                e = 2;
            }
            int i = d.a(f);
            switch (i)
            {
            default:
                throw new jjj((new StringBuilder(32)).append("Invalid element type ").append(i).toString());

            case 1: // '\001'
                long l1 = jke1.b();
                long l6 = g;
                b.add(new jme(f, l6 + l1));
                d.a(f, l1, g);
                e = 0;
                return true;

            case 2: // '\002'
                if (g > 8L)
                {
                    long l2 = g;
                    throw new jjj((new StringBuilder(42)).append("Invalid integer size: ").append(l2).toString());
                } else
                {
                    d.a(f, a(jke1, (int)g));
                    e = 0;
                    return true;
                }

            case 5: // '\005'
                if (g != 4L && g != 8L)
                {
                    long l3 = g;
                    throw new jjj((new StringBuilder(40)).append("Invalid float size: ").append(l3).toString());
                } else
                {
                    d.a(f, b(jke1, (int)g));
                    e = 0;
                    return true;
                }

            case 3: // '\003'
                if (g > 0x7fffffffL)
                {
                    long l4 = g;
                    throw new jjj((new StringBuilder(41)).append("String element size: ").append(l4).toString());
                } else
                {
                    jmg jmg1 = d;
                    int j = f;
                    int k = (int)g;
                    byte abyte0[] = new byte[k];
                    jke1.b(abyte0, 0, k);
                    jmg1.a(j, new String(abyte0, Charset.forName("UTF-8")));
                    e = 0;
                    return true;
                }

            case 4: // '\004'
                d.a(f, (int)g, jke1);
                e = 0;
                return true;

            case 0: // '\0'
                jke1.a((int)g);
                e = 0;
                break;
            }
        } while (true);
    }

    double b(jke jke1, int i)
    {
        long l = a(jke1, i);
        if (i == 4)
        {
            return (double)Float.intBitsToFloat((int)l);
        } else
        {
            return Double.longBitsToDouble(l);
        }
    }

    long b(jke jke1)
    {
        do
        {
            jke1.a();
            jke1.c(a, 0, 4);
            int i = jmi.a(a[0]);
            if (i != -1 && i <= 4)
            {
                int j = (int)jmi.a(a, i, false);
                if (d.b(j))
                {
                    jke1.a(i);
                    jke1.a();
                    return (long)j;
                }
            }
            jke1.a(1);
        } while (true);
    }
}
