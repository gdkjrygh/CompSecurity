// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            v, i, m, aa, 
//            ListMenuItemView

final class w extends BaseAdapter
{

    final v a;
    private i b;
    private int c;

    public w(v v1, i j)
    {
        a = v1;
        super();
        c = -1;
        b = j;
        a();
    }

    static i a(w w1)
    {
        return w1.b;
    }

    private void a()
    {
        m m1 = v.c(a).q();
        if (m1 != null)
        {
            ArrayList arraylist = v.c(a).n();
            int k = arraylist.size();
            for (int j = 0; j < k; j++)
            {
                if ((m)arraylist.get(j) == m1)
                {
                    c = j;
                    return;
                }
            }

        }
        c = -1;
    }

    public final m a(int j)
    {
        ArrayList arraylist;
        int k;
        if (v.a(a))
        {
            arraylist = b.n();
        } else
        {
            arraylist = b.k();
        }
        k = j;
        if (c >= 0)
        {
            k = j;
            if (j >= c)
            {
                k = j + 1;
            }
        }
        return (m)arraylist.get(k);
    }

    public final int getCount()
    {
        ArrayList arraylist;
        if (v.a(a))
        {
            arraylist = b.n();
        } else
        {
            arraylist = b.k();
        }
        if (c < 0)
        {
            return arraylist.size();
        } else
        {
            return arraylist.size() - 1;
        }
    }

    public final Object getItem(int j)
    {
        return a(j);
    }

    public final long getItemId(int j)
    {
        return (long)j;
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = v.b(a).inflate(v.a, viewgroup, false);
        }
        viewgroup = (aa)view;
        if (a.b)
        {
            ((ListMenuItemView)view).c();
        }
        viewgroup.a(a(j));
        return view;
    }

    public final void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
