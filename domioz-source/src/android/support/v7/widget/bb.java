// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            l, m, RecyclerView, bj, 
//            n, bv, bs, bm

final class bb
    implements l
{

    final RecyclerView a;

    bb(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    private void c(m m1)
    {
        switch (m1.a)
        {
        default:
            return;

        case 0: // '\0'
            RecyclerView.e(a).a(m1.b, m1.c);
            return;

        case 1: // '\001'
            RecyclerView.e(a).b(m1.b, m1.c);
            return;

        case 2: // '\002'
            RecyclerView.e(a).c(m1.b, m1.c);
            return;

        case 3: // '\003'
            RecyclerView.e(a).d(m1.b, m1.c);
            break;
        }
    }

    public final bv a(int i)
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
        bv bv1 = RecyclerView.b(recyclerview.c.c(j));
        if (bv1 == null || bv1.isRemoved() || bv1.mPosition != i) goto _L4; else goto _L3
_L4:
        j++;
          goto _L5
_L2:
        bv1 = null;
_L3:
        if (bv1 == null || a.c.b(bv1.itemView))
        {
            return null;
        }
        return bv1;
_L5:
        if (true) goto _L6; else goto _L2
    }

    public final void a(int i, int j)
    {
        a.a(i, j, true);
        a.f = true;
        bs.a(a.e, j);
    }

    public final void a(m m1)
    {
        c(m1);
    }

    public final void b(int i, int j)
    {
        a.a(i, j, false);
        a.f = true;
    }

    public final void b(m m1)
    {
        c(m1);
    }

    public final void c(int i, int j)
    {
        a.b(i, j);
        a.g = true;
    }

    public final void d(int i, int j)
    {
        RecyclerView recyclerview = a;
        int j1 = recyclerview.c.b();
        for (int k = 0; k < j1; k++)
        {
            bv bv1 = RecyclerView.b(recyclerview.c.c(k));
            if (bv1 != null && !bv1.shouldIgnore() && bv1.mPosition >= i)
            {
                bv1.offsetPosition(j, false);
                bs.a(recyclerview.e, true);
            }
        }

        bm bm1 = recyclerview.a;
        j1 = bm1.b.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            bv bv2 = (bv)bm1.b.get(i1);
            if (bv2 != null && bv2.getLayoutPosition() >= i)
            {
                bv2.offsetPosition(j, true);
            }
        }

        recyclerview.requestLayout();
        a.f = true;
    }

    public final void e(int i, int j)
    {
        int k1 = -1;
        RecyclerView recyclerview = a;
        int l1 = recyclerview.c.b();
        byte byte0;
        int k;
        int i1;
        int j1;
        if (i < j)
        {
            byte0 = -1;
            k = j;
            i1 = i;
        } else
        {
            byte0 = 1;
            k = i;
            i1 = j;
        }
        j1 = 0;
        while (j1 < l1) 
        {
            bv bv1 = RecyclerView.b(recyclerview.c.c(j1));
            if (bv1 != null && bv1.mPosition >= i1 && bv1.mPosition <= k)
            {
                if (bv1.mPosition == i)
                {
                    bv1.offsetPosition(j - i, false);
                } else
                {
                    bv1.offsetPosition(byte0, false);
                }
                bs.a(recyclerview.e, true);
            }
            j1++;
        }
        bm bm1 = recyclerview.a;
        if (i < j)
        {
            k = j;
            i1 = i;
            byte0 = k1;
        } else
        {
            byte0 = 1;
            k = i;
            i1 = j;
        }
        k1 = bm1.b.size();
        j1 = 0;
        while (j1 < k1) 
        {
            bv bv2 = (bv)bm1.b.get(j1);
            if (bv2 != null && bv2.mPosition >= i1 && bv2.mPosition <= k)
            {
                if (bv2.mPosition == i)
                {
                    bv2.offsetPosition(j - i, false);
                } else
                {
                    bv2.offsetPosition(byte0, false);
                }
            }
            j1++;
        }
        recyclerview.requestLayout();
        a.f = true;
    }
}
