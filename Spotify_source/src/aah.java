// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

public final class aah
{

    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public List j;

    public aah()
    {
        a = true;
        h = 0;
        j = null;
    }

    public final View a(abh abh1)
    {
        if (j != null)
        {
            int l = j.size();
            for (int k = 0; k < l; k++)
            {
                abh1 = ((abo)j.get(k)).a;
                android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)abh1.getLayoutParams();
                if (!layoutparams.c.n() && d == layoutparams.c.c())
                {
                    a(((View) (abh1)));
                    return abh1;
                }
            }

            return null;
        } else
        {
            abh1 = abh1.b(d);
            d = d + e;
            return abh1;
        }
    }

    public final void a(View view)
    {
        int j1 = j.size();
        View view1 = null;
        int k = 0x7fffffff;
        for (int l = 0; l < j1; l++)
        {
            View view2 = ((abo)j.get(l)).a;
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view2.getLayoutParams();
            if (view2 == view || layoutparams.c.n())
            {
                continue;
            }
            int i1 = (layoutparams.c.c() - d) * e;
            if (i1 < 0 || i1 >= k)
            {
                continue;
            }
            view1 = view2;
            if (i1 == 0)
            {
                break;
            }
            view1 = view2;
            k = i1;
        }

        if (view1 == null)
        {
            d = -1;
            return;
        } else
        {
            d = ((android.support.v7.widget.RecyclerView.LayoutParams)view1.getLayoutParams()).c.c();
            return;
        }
    }

    public final boolean a(abm abm1)
    {
        return d >= 0 && d < abm1.b();
    }
}
