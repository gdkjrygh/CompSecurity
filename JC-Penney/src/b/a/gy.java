// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package b.a:
//            nh, ot, gx, gw, 
//            nk

public final class gy
{

    final ArrayList a;
    int b;
    nk c;
    private int d[];
    private int e;

    public gy(int i)
    {
        a = new ArrayList(i);
        b = 0;
        c = null;
        d = null;
        e = 0;
    }

    static nh a(nh nh1)
    {
        nh nh2 = nh1;
        if (nh1 != null)
        {
            nh2 = nh1;
            if (nh1.b() == ot.j)
            {
                nh2 = nh1.a(ot.o);
            }
        }
        return nh2;
    }

    private void a(int i, gw gw1, nh nh1)
    {
        int j = nh1.e();
        a.add(new gx(i, gw1, nh1));
        if (gw1 == gw.a)
        {
            c.c(nh1);
            d[j] = -1;
            return;
        } else
        {
            c.b(nh1);
            d[j] = a.size() - 1;
            return;
        }
    }

    private void a(int i, nh nh1, gw gw1)
    {
        nh nh2;
        int j;
        boolean flag1;
        flag1 = false;
        j = nh1.e();
        nh2 = a(nh1);
        a(i, j);
        if (d[j] < 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        j = a.size() - 1;
_L7:
        if (j < 0) goto _L4; else goto _L3
_L3:
        nh1 = (gx)a.get(j);
        if (nh1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (nh1.a() == i) goto _L6; else goto _L5
_L5:
        j = 0;
_L8:
        if (j == 0)
        {
            a(i, gw1, nh2);
            return;
        }
          goto _L1
_L6:
        if (nh1.a(nh2))
        {
            break; /* Loop/switch isn't completed */
        }
        j--;
          goto _L7
_L4:
        int k;
        c.b(nh2);
        a.set(j, null);
        b = b + 1;
        k = nh2.e();
        j--;
        nh1 = null;
_L9:
label0:
        {
            boolean flag = flag1;
            if (j >= 0)
            {
                nh1 = (gx)a.get(j);
                if (nh1 == null || nh1.h().e() != k)
                {
                    break label0;
                }
                flag = true;
            }
            if (flag)
            {
                d[k] = j;
                if (nh1.a() == i)
                {
                    a.set(j, nh1.a(gw.b));
                }
            }
            j = 1;
        }
          goto _L8
        j--;
          goto _L9
    }

    private void b(int i, gw gw1, nh nh1)
    {
        if (gw1 == gw.a)
        {
            throw new RuntimeException("shouldn't happen");
        }
        int j = nh1.e();
        j = d[j];
        if (j >= 0)
        {
            gx gx1 = (gx)a.get(j);
            if (gx1.a() == i && gx1.h().equals(nh1))
            {
                a.set(j, gx1.a(gw1));
                c.b(nh1);
                return;
            }
        }
        a(i, nh1, gw1);
    }

    final void a(int i, int j)
    {
        boolean flag;
        if (d == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i != e || flag)
        {
            if (i < e)
            {
                throw new RuntimeException("shouldn't happen");
            }
            if (flag || j >= d.length)
            {
                i = j + 1;
                nk nk1 = new nk(i);
                int ai[] = new int[i];
                Arrays.fill(ai, -1);
                if (!flag)
                {
                    nk1.a(c);
                    System.arraycopy(d, 0, ai, 0, d.length);
                }
                c = nk1;
                d = ai;
                return;
            }
        }
    }

    public final void a(int i, nh nh1)
    {
        nh nh2;
        int j;
        int k;
        j = nh1.e();
        nh1 = a(nh1);
        a(i, j);
        nh2 = c.a(j);
        if (nh1.a(nh2))
        {
            return;
        }
        nh nh5 = c.a(nh1);
        if (nh5 != null)
        {
            b(i, gw.d, nh5);
        }
        k = d[j];
        if (nh2 == null) goto _L2; else goto _L1
_L1:
        a(i, gw.c, nh2);
_L4:
        if (j > 0)
        {
            nh nh3 = c.a(j - 1);
            if (nh3 != null && nh3.j())
            {
                b(i, gw.f, nh3);
            }
        }
        if (nh1.j())
        {
            nh nh4 = c.a(j + 1);
            if (nh4 != null)
            {
                b(i, gw.e, nh4);
            }
        }
        a(i, gw.a, nh1);
        return;
_L2:
        if (k >= 0)
        {
            gx gx1 = (gx)a.get(k);
            if (gx1.a() == i)
            {
                if (gx1.a(nh1))
                {
                    a.set(k, null);
                    b = b + 1;
                    c.c(nh1);
                    d[j] = -1;
                    return;
                }
                gx1 = gx1.a(gw.c);
                a.set(k, gx1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(int i, nh nh1)
    {
        a(i, nh1, gw.b);
    }
}
