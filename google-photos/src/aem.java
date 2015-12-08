// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public final class aem
    implements abm
{

    private RecyclerView a;

    public aem(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    private void c(abn abn1)
    {
        switch (abn1.a)
        {
        default:
            return;

        case 0: // '\0'
            RecyclerView.d(a).onItemsAdded(a, abn1.b, abn1.d);
            return;

        case 1: // '\001'
            RecyclerView.d(a).onItemsRemoved(a, abn1.b, abn1.d);
            return;

        case 2: // '\002'
            RecyclerView.d(a).onItemsUpdated(a, abn1.b, abn1.d, abn1.c);
            return;

        case 3: // '\003'
            RecyclerView.d(a).onItemsMoved(a, abn1.b, abn1.d, 1);
            break;
        }
    }

    public final afn a(int i)
    {
        afn afn1;
        for (afn1 = a.a(i, true); afn1 == null || a.c.d(afn1.a);)
        {
            return null;
        }

        return afn1;
    }

    public final void a(int i, int j)
    {
        a.a(i, j, true);
        a.w = true;
        afl afl1 = a.v;
        afl1.h = afl1.h + j;
    }

    public final void a(int i, int j, Object obj)
    {
        RecyclerView recyclerview = a;
        int i1 = recyclerview.c.b();
        for (int k = 0; k < i1; k++)
        {
            View view = recyclerview.c.d(k);
            afn afn2 = RecyclerView.b(view);
            if (afn2 == null || afn2.b() || afn2.b < i || afn2.b >= i + j)
            {
                continue;
            }
            afn2.b(2);
            afn2.a(obj);
            if (recyclerview.h())
            {
                afn2.b(64);
            }
            ((aez)view.getLayoutParams()).e = true;
        }

        obj = recyclerview.a;
        for (int l = ((afe) (obj)).c.size() - 1; l >= 0; l--)
        {
            afn afn1 = (afn)((afe) (obj)).c.get(l);
            if (afn1 == null)
            {
                continue;
            }
            int j1 = afn1.d();
            if (j1 >= i && j1 < i + j)
            {
                afn1.b(2);
                ((afe) (obj)).c(l);
            }
        }

        a.x = true;
    }

    public final void a(abn abn1)
    {
        c(abn1);
    }

    public final void b(int i, int j)
    {
        a.a(i, j, false);
        a.w = true;
    }

    public final void b(abn abn1)
    {
        c(abn1);
    }

    public final void c(int i, int j)
    {
        RecyclerView recyclerview = a;
        int i1 = recyclerview.c.b();
        for (int k = 0; k < i1; k++)
        {
            afn afn1 = RecyclerView.b(recyclerview.c.d(k));
            if (afn1 != null && !afn1.b() && afn1.b >= i)
            {
                afn1.a(j, false);
                recyclerview.v.i = true;
            }
        }

        afe afe1 = recyclerview.a;
        i1 = afe1.c.size();
        for (int l = 0; l < i1; l++)
        {
            afn afn2 = (afn)afe1.c.get(l);
            if (afn2 != null && afn2.d() >= i)
            {
                afn2.a(j, true);
            }
        }

        recyclerview.requestLayout();
        a.w = true;
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
            afn afn1 = RecyclerView.b(recyclerview.c.d(i1));
            if (afn1 != null && afn1.b >= l && afn1.b <= k)
            {
                if (afn1.b == i)
                {
                    afn1.a(j - i, false);
                } else
                {
                    afn1.a(byte0, false);
                }
                recyclerview.v.i = true;
            }
            i1++;
        }
        afe afe1 = recyclerview.a;
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
        j1 = afe1.c.size();
        i1 = 0;
        while (i1 < j1) 
        {
            afn afn2 = (afn)afe1.c.get(i1);
            if (afn2 != null && afn2.b >= l && afn2.b <= k)
            {
                if (afn2.b == i)
                {
                    afn2.a(j - i, false);
                } else
                {
                    afn2.a(byte0, false);
                }
            }
            i1++;
        }
        recyclerview.requestLayout();
        a.w = true;
    }
}
