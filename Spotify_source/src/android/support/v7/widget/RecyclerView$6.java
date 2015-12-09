// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import abd;
import abh;
import abm;
import abo;
import android.view.View;
import java.util.ArrayList;
import zj;
import zk;
import zu;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

final class a
    implements zj
{

    private RecyclerView a;

    private void c(zk zk1)
    {
        switch (zk1.a)
        {
        case 3: // '\003'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        default:
            return;

        case 1: // '\001'
            RecyclerView.f(a).a(a, zk1.b, zk1.d);
            return;

        case 2: // '\002'
            RecyclerView.f(a).b(a, zk1.b, zk1.d);
            return;

        case 4: // '\004'
            RecyclerView.f(a).c(a, zk1.b, zk1.d);
            return;

        case 8: // '\b'
            RecyclerView.f(a).a(a, zk1.b, zk1.d, 1);
            break;
        }
    }

    public final abo a(int i)
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
        abo abo1 = RecyclerView.b(recyclerview.c.c(j));
        if (abo1 == null || abo1.n() || abo1.b != i) goto _L4; else goto _L3
_L4:
        j++;
          goto _L5
_L2:
        abo1 = null;
_L3:
        if (abo1 == null || a.c.d(abo1.a))
        {
            return null;
        }
        return abo1;
_L5:
        if (true) goto _L6; else goto _L2
    }

    public final void a(int i, int j)
    {
        a.a(i, j, true);
        a.r = true;
        abm abm1 = a.q;
        abm1.d = abm1.d + j;
    }

    public final void a(int i, int j, Object obj)
    {
        RecyclerView recyclerview = a;
        int i1 = recyclerview.c.b();
        for (int k = 0; k < i1; k++)
        {
            View view = recyclerview.c.c(k);
            abo abo2 = RecyclerView.b(view);
            if (abo2 != null && !abo2.E_() && abo2.b >= i && abo2.b < i + j)
            {
                abo2.b(2);
                abo2.a(obj);
                ((youtParams)view.getLayoutParams()).e = true;
            }
        }

        obj = recyclerview.a;
        for (int l = ((abh) (obj)).c.size() - 1; l >= 0; l--)
        {
            abo abo1 = (abo)((abh) (obj)).c.get(l);
            if (abo1 == null)
            {
                continue;
            }
            int j1 = abo1.c();
            if (j1 >= i && j1 < i + j)
            {
                abo1.b(2);
                ((abh) (obj)).c(l);
            }
        }

        a.s = true;
    }

    public final void a(zk zk1)
    {
        c(zk1);
    }

    public final void b(int i, int j)
    {
        a.a(i, j, false);
        a.r = true;
    }

    public final void b(zk zk1)
    {
        c(zk1);
    }

    public final void c(int i, int j)
    {
        RecyclerView recyclerview = a;
        int i1 = recyclerview.c.b();
        for (int k = 0; k < i1; k++)
        {
            abo abo1 = RecyclerView.b(recyclerview.c.c(k));
            if (abo1 != null && !abo1.E_() && abo1.b >= i)
            {
                abo1.a(j, false);
                recyclerview.q.e = true;
            }
        }

        abh abh1 = recyclerview.a;
        i1 = abh1.c.size();
        for (int l = 0; l < i1; l++)
        {
            abo abo2 = (abo)abh1.c.get(l);
            if (abo2 != null && abo2.c() >= i)
            {
                abo2.a(j, true);
            }
        }

        recyclerview.requestLayout();
        a.r = true;
    }

    public final void d(int i, int j)
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
            abo abo1 = RecyclerView.b(recyclerview.c.c(i1));
            if (abo1 != null && abo1.b >= l && abo1.b <= k)
            {
                if (abo1.b == i)
                {
                    abo1.a(j - i, false);
                } else
                {
                    abo1.a(byte0, false);
                }
                recyclerview.q.e = true;
            }
            i1++;
        }
        abh abh1 = recyclerview.a;
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
        j1 = abh1.c.size();
        i1 = 0;
        while (i1 < j1) 
        {
            abo abo2 = (abo)abh1.c.get(i1);
            if (abo2 != null && abo2.b >= l && abo2.b <= k)
            {
                if (abo2.b == i)
                {
                    abo2.a(j - i, false);
                } else
                {
                    abo2.a(byte0, false);
                }
            }
            i1++;
        }
        recyclerview.requestLayout();
        a.r = true;
    }

    youtParams(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }
}
