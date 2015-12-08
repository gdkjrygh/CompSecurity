// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;


// Referenced classes of package com.skype.android.widget.recycler:
//            TwoWayRecyclerView

public static class k
{

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    public int s;

    static void a(k k1, int i1)
    {
        boolean flag1 = true;
        k1.e = i1;
        k1.f = android.view.outManager.Dimension.f(i1);
        k1.g = android.view.outManager.Dimension.g(i1);
        int j1;
        boolean flag;
        if (k1.f != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1.m = flag;
        if (k1.f != 0x40000000)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        k1.n = flag;
        if (k1.k)
        {
            j1 = k1.a;
        } else
        {
            j1 = 0x7fffffff;
        }
        if (k1.m)
        {
            int l1 = k1.g;
            i1 = l1;
            if (k1.l)
            {
                i1 = l1 / k1.d;
            }
        } else
        {
            i1 = 0x7fffffff;
        }
        i1 = Math.min(j1, i1);
        if (i1 == 0x7fffffff)
        {
            k1.h = android.view.outManager.Dimension.h(0, 0);
            return;
        } else
        {
            k1.h = android.view.outManager.Dimension.h(i1, 0x80000000);
            return;
        }
    }

    static void a(h h1, boolean flag)
    {
        boolean flag1 = true;
        int i1;
        if (flag)
        {
            i1 = h1.c;
        } else
        {
            i1 = h1.b;
        }
        h1.d = i1;
        if ((h1.j == 1 || h1.j == 3) && !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h1.o = flag;
        if (h1.d > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h1.l = flag;
    }

    public final int a()
    {
        if (o)
        {
            return 0;
        } else
        {
            return h;
        }
    }

    final void a(h h1)
    {
        r = false;
        q = false;
        if (s > 0)
        {
            int i1;
            int j1;
            if (m)
            {
                i1 = g / s;
            } else
            {
                i1 = 0x7fffffff;
            }
            if (l)
            {
                j1 = d;
            } else
            {
                j1 = 0x7fffffff;
            }
            i1 = Math.min(j1, i1);
            j1 = h1.(i1);
            if (j1 == i1)
            {
                r = true;
            } else
            {
                q = true;
            }
            i = j1;
            p = true;
            if (n || o)
            {
                g = i * s;
                if (n)
                {
                    f = 0x40000000;
                    e = android.view.outManager.Dimension.e(g, f);
                }
            }
        }
    }

    public (int i1, int j1, int k1, int l1)
    {
        b = j1;
        c = k1;
        a = i1;
        j = l1;
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
    }
}
