// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, b

final class x
    implements a.a
{

    final RecyclerView a;

    x(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    private void c(a.b b1)
    {
        switch (b1.a)
        {
        default:
            return;

        case 0: // '\0'
            RecyclerView.e(a).a(b1.b, b1.c);
            return;

        case 1: // '\001'
            RecyclerView.e(a).b(b1.b, b1.c);
            return;

        case 2: // '\002'
            RecyclerView.e(a).c(b1.b, b1.c);
            return;

        case 3: // '\003'
            RecyclerView.e(a).d(b1.b, b1.c);
            break;
        }
    }

    public final RecyclerView.t a(int i)
    {
        RecyclerView recyclerview;
        int j;
        int k;
        recyclerview = a;
        k = recyclerview.c.b();
        j = 0;
_L6:
        if (j >= k) goto _L2; else goto _L1
_L1:
        RecyclerView.t t = RecyclerView.b(recyclerview.c.c(j));
        if (t == null || t.m() || t.b != i) goto _L4; else goto _L3
_L4:
        j++;
          goto _L5
_L2:
        t = null;
_L3:
        if (t == null || a.c.b(t.a))
        {
            return null;
        }
        return t;
_L5:
        if (true) goto _L6; else goto _L2
    }

    public final void a(int i, int j)
    {
        a.a(i, j, true);
        a.f = true;
        RecyclerView.q.a(a.e, j);
    }

    public final void a(a.b b1)
    {
        c(b1);
    }

    public final void b(int i, int j)
    {
        a.a(i, j, false);
        a.f = true;
    }

    public final void b(a.b b1)
    {
        c(b1);
    }

    public final void c(int i, int j)
    {
        a.b(i, j);
        a.g = true;
    }

    public final void d(int i, int j)
    {
        RecyclerView recyclerview = a;
        int i1 = recyclerview.c.b();
        for (int k = 0; k < i1; k++)
        {
            RecyclerView.t t = RecyclerView.b(recyclerview.c.c(k));
            if (t != null && !t.b() && t.b >= i)
            {
                t.a(j, false);
                RecyclerView.q.a(recyclerview.e, true);
            }
        }

        RecyclerView.m m = recyclerview.a;
        i1 = m.b.size();
        for (int l = 0; l < i1; l++)
        {
            RecyclerView.t t1 = (RecyclerView.t)m.b.get(l);
            if (t1 != null && t1.c() >= i)
            {
                t1.a(j, true);
            }
        }

        recyclerview.requestLayout();
        a.f = true;
    }

    public final void e(int i, int j)
    {
        int j1 = -1;
        RecyclerView recyclerview = a;
        int k1 = recyclerview.c.b();
        byte byte0;
        int k;
        int l;
        int i1;
        if (i < j)
        {
            byte0 = -1;
            k = j;
            l = i;
        } else
        {
            byte0 = 1;
            k = i;
            l = j;
        }
        i1 = 0;
        while (i1 < k1) 
        {
            RecyclerView.t t = RecyclerView.b(recyclerview.c.c(i1));
            if (t != null && t.b >= l && t.b <= k)
            {
                if (t.b == i)
                {
                    t.a(j - i, false);
                } else
                {
                    t.a(byte0, false);
                }
                RecyclerView.q.a(recyclerview.e, true);
            }
            i1++;
        }
        RecyclerView.m m = recyclerview.a;
        if (i < j)
        {
            k = j;
            l = i;
            byte0 = j1;
        } else
        {
            byte0 = 1;
            k = i;
            l = j;
        }
        j1 = m.b.size();
        i1 = 0;
        while (i1 < j1) 
        {
            RecyclerView.t t1 = (RecyclerView.t)m.b.get(i1);
            if (t1 != null && t1.b >= l && t1.b <= k)
            {
                if (t1.b == i)
                {
                    t1.a(j - i, false);
                } else
                {
                    t1.a(byte0, false);
                }
            }
            i1++;
        }
        recyclerview.requestLayout();
        a.f = true;
    }
}
