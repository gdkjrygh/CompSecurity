// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            b, c, RecyclerView, au, 
//            d, bi, bf, az

final class ak
    implements b
{

    final RecyclerView a;

    ak(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    private void c(c c1)
    {
        switch (c1.a)
        {
        default:
            return;

        case 0: // '\0'
            RecyclerView.e(a).a(c1.b, c1.c);
            return;

        case 1: // '\001'
            RecyclerView.e(a).b(c1.b, c1.c);
            return;

        case 2: // '\002'
            RecyclerView.e(a).c(c1.b, c1.c);
            return;

        case 3: // '\003'
            RecyclerView.e(a).d(c1.b, c1.c);
            break;
        }
    }

    public final bi a(int i)
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
        bi bi1 = RecyclerView.b(recyclerview.c.c(j));
        if (bi1 == null || bi1.n() || bi1.b != i) goto _L4; else goto _L3
_L4:
        j++;
          goto _L5
_L2:
        bi1 = null;
_L3:
        if (bi1 == null || a.c.b(bi1.a))
        {
            return null;
        }
        return bi1;
_L5:
        if (true) goto _L6; else goto _L2
    }

    public final void a(int i, int j)
    {
        a.a(i, j, true);
        a.f = true;
        bf.a(a.e, j);
    }

    public final void a(c c1)
    {
        c(c1);
    }

    public final void b(int i, int j)
    {
        a.a(i, j, false);
        a.f = true;
    }

    public final void b(c c1)
    {
        c(c1);
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
            bi bi1 = RecyclerView.b(recyclerview.c.c(k));
            if (bi1 != null && !bi1.b() && bi1.b >= i)
            {
                bi1.a(j, false);
                bf.a(recyclerview.e, true);
            }
        }

        az az1 = recyclerview.a;
        i1 = az1.b.size();
        for (int l = 0; l < i1; l++)
        {
            bi bi2 = (bi)az1.b.get(l);
            if (bi2 != null && bi2.c() >= i)
            {
                bi2.a(j, true);
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
            bi bi1 = RecyclerView.b(recyclerview.c.c(i1));
            if (bi1 != null && bi1.b >= l && bi1.b <= k)
            {
                if (bi1.b == i)
                {
                    bi1.a(j - i, false);
                } else
                {
                    bi1.a(byte0, false);
                }
                bf.a(recyclerview.e, true);
            }
            i1++;
        }
        az az1 = recyclerview.a;
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
        j1 = az1.b.size();
        i1 = 0;
        while (i1 < j1) 
        {
            bi bi2 = (bi)az1.b.get(i1);
            if (bi2 != null && bi2.b >= l && bi2.b <= k)
            {
                if (bi2.b == i)
                {
                    bi2.a(j - i, false);
                } else
                {
                    bi2.a(byte0, false);
                }
            }
            i1++;
        }
        recyclerview.requestLayout();
        a.f = true;
    }
}
