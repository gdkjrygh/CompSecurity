// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            n, i, g, k

public final class aw
{
    static final class a
    {

        int a[];
        int b;

        a()
        {
            this((byte)0);
        }

        private a(byte byte0)
        {
            a = new int[16];
            b = 0;
        }
    }


    private n a;
    private int b;
    private g c[];
    private boolean d;
    private final ArrayList e = new ArrayList();
    private final ArrayList f = new ArrayList();
    private int g;

    public aw(n n1)
    {
        a(n1);
    }

    private void a(int j, g g1, int l, boolean flag)
    {
        g g2;
        g g3;
        if (j == b)
        {
            if (flag)
            {
                if (g == e.size())
                {
                    e.add(new k.a());
                    f.add(new a());
                }
                g = g + 1;
            }
            if (((k.a)e.get(g - 1)).a(g1) && d)
            {
                g1 = (a)f.get(g - 1);
                if (((a) (g1)).b == ((a) (g1)).a.length)
                {
                    int ai[] = new int[((a) (g1)).a.length * 2];
                    System.arraycopy(((a) (g1)).a, 0, ai, 0, ((a) (g1)).a.length);
                    g1.a = ai;
                }
                int ai1[] = ((a) (g1)).a;
                j = ((a) (g1)).b;
                g1.b = j + 1;
                ai1[j] = l;
            }
            return;
        }
        g g4;
        if (j == 0)
        {
            g3 = a.h();
            g2 = a.a(0);
        } else
        {
            g3 = a.a(j - 1);
            g2 = a.a(j);
        }
        if (i.a(g3, g2, g1) < 0) goto _L2; else goto _L1
_L1:
        if (!flag && i.a(g3, g2, c[j]) < 0)
        {
            g4 = new g();
            i.a(g3, g2, g1, c[j], g4);
            a(j + 1, g4, l, true);
        }
        a(j + 1, g1, l, flag);
_L4:
        c[j].b(g1);
        return;
_L2:
        if (!flag && i.a(g3, g2, c[j]) >= 0)
        {
            g g5 = new g();
            i.a(g3, g2, c[j], g1, g5);
            a(j + 1, g5, l, false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(n n1)
    {
        a = n1;
        b = n1.b();
        c = new g[b];
        for (int j = 0; j < c.length; j++)
        {
            c[j] = new g();
        }

    }

    public final void a(k k1, List list)
    {
        g = 0;
        d = false;
        m m = k1.a();
        if (a.a(m))
        {
            if (a.b(m))
            {
                list.add(k1);
                if (d)
                {
                    throw new NullPointerException();
                }
            } else
            {
                g g1 = new g();
                int i1 = k1.a.length / 3;
                k1.a(0, g1);
                if (d)
                {
                    throw new NullPointerException();
                }
                a(0, g1, 0, true);
                for (int j = 1; j < i1; j++)
                {
                    k1.a(j, g1);
                    if (d)
                    {
                        throw new NullPointerException();
                    }
                    a(0, g1, 0, false);
                }

                int l = 0;
                while (l < g) 
                {
                    k1 = (k.a)e.get(l);
                    if (((k.a) (k1)).b > 1)
                    {
                        list.add(k1.a());
                    }
                    k1.b = 0;
                    if (d)
                    {
                        k1 = (a)f.get(l);
                        if (((a) (k1)).b > 1)
                        {
                            list = new int[((a) (k1)).b];
                            System.arraycopy(((a) (k1)).a, 0, list, 0, ((a) (k1)).b);
                            throw new NullPointerException();
                        }
                        k1.b = 0;
                    }
                    l++;
                }
            }
        }
    }
}
