// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            as, m, g, n

public final class ar extends as
{

    public m a;
    public g b;
    public g c;
    private int d;
    private int f;
    private int g;
    private volatile g h;
    private volatile g i;
    private volatile g j;
    private volatile g k;
    private volatile g l;
    private volatile g m;

    private ar(m m1)
    {
        a = m1;
        g g1 = m1.c();
        m1 = m1.d();
        boolean flag;
        if (g1.a < 0)
        {
            d = -g1.a;
        } else
        if (((g) (m1)).a > 0x40000000)
        {
            d = 0x40000000 - ((g) (m1)).a;
        }
        b = new g();
        g1.h(b);
        c = new g();
        m1.h(c);
        if (b.a > c.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        f = g1.a + d;
        g = ((g) (m1)).a + d;
    }

    public static ar a(m m1)
    {
        return new ar(m1);
    }

    public final ar a()
    {
        return this;
    }

    public final g a(int i1)
    {
        switch (i1)
        {
        default:
            throw new ArrayIndexOutOfBoundsException();

        case 0: // '\0'
            if (h == null)
            {
                h = new g(c.a, b.b);
            }
            return h;

        case 1: // '\001'
            return c;

        case 2: // '\002'
            if (i == null)
            {
                i = new g(b.a, c.b);
            }
            return i;

        case 3: // '\003'
            return b;
        }
    }

    public final void a(int i1, g ag[])
    {
        if (e)
        {
            switch (i1)
            {
            default:
                return;

            case 0: // '\0'
                ag[0] = a(0);
                ag[1] = a(1);
                return;

            case 1: // '\001'
                ag[0] = a(1);
                if (j == null)
                {
                    j = new g(0xdfffffff, c.b);
                }
                ag[1] = j;
                return;

            case 2: // '\002'
                if (k == null)
                {
                    k = new g(0x20000000, c.b);
                }
                ag[0] = k;
                ag[1] = a(2);
                return;

            case 3: // '\003'
                ag[0] = a(2);
                ag[1] = a(3);
                return;

            case 4: // '\004'
                ag[0] = a(3);
                if (l == null)
                {
                    l = new g(0x20000000, b.b);
                }
                ag[1] = l;
                return;

            case 5: // '\005'
                break;
            }
            if (m == null)
            {
                m = new g(0xdfffffff, b.b);
            }
            ag[0] = m;
            ag[1] = a(0);
            return;
        } else
        {
            ag[0] = a(i1);
            ag[1] = a((i1 + 1) % 4);
            return;
        }
    }

    public final boolean a(g g1)
    {
        int i1 = g1.a + d & 0x3fffffff;
        return i1 >= f && i1 <= g && g1.b >= b.b && g1.b <= c.b;
    }

    public final boolean a(n n1)
    {
        if (!e)
        {
            return a.b(n1);
        }
        n1 = n1.a();
        if (b.b > ((m) (n1)).a.b || c.b < ((m) (n1)).b.b)
        {
            return false;
        }
        int j1 = ((m) (n1)).a.a;
        int k1 = ((m) (n1)).b.a;
        if (b.a <= j1 && 0x20000000 > k1 || 0xe0000000 <= j1 && c.a >= k1)
        {
            return true;
        }
        int i1;
        if (j1 < 0xe0000000)
        {
            i1 = j1 + 0x40000000;
        } else
        {
            i1 = j1;
            if (j1 >= 0x20000000)
            {
                i1 = j1 - 0x40000000;
            }
        }
        if (k1 < 0xe0000000)
        {
            j1 = k1 + 0x40000000;
        } else
        {
            j1 = k1;
            if (k1 >= 0x20000000)
            {
                j1 = k1 - 0x40000000;
            }
        }
        return b.a <= i1 && c.a >= j1;
    }

    public final n b()
    {
        return a;
    }

    public final boolean b(n n1)
    {
        boolean flag1 = false;
        if (e) goto _L2; else goto _L1
_L1:
        boolean flag = a.a(n1);
_L4:
        return flag;
_L2:
        if (!(n1 instanceof m))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        n1 = (m)n1;
        flag = flag1;
        if (b.b > ((m) (n1)).b.b) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (c.b < ((m) (n1)).a.b) goto _L4; else goto _L5
_L5:
        if (b.a <= ((m) (n1)).b.a && 0x20000000 > ((m) (n1)).a.a)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (0xe0000000 > ((m) (n1)).b.a) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (c.a < ((m) (n1)).a.a) goto _L4; else goto _L7
_L7:
        return true;
        return super.b(n1);
    }

    public final int c()
    {
        return !e ? 4 : 6;
    }

    public final int d()
    {
        return c.b - b.b;
    }
}
