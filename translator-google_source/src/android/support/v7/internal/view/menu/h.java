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
//            g, i, m, y

public final class h extends BaseAdapter
{

    final g a;
    private int b;

    public h(g g1)
    {
        a = g1;
        super();
        b = -1;
        a();
    }

    private void a()
    {
        m m1 = a.c.j;
        if (m1 != null)
        {
            ArrayList arraylist = a.c.j();
            int k = arraylist.size();
            for (int j = 0; j < k; j++)
            {
                if ((m)arraylist.get(j) == m1)
                {
                    b = j;
                    return;
                }
            }

        }
        b = -1;
    }

    public final m a(int j)
    {
        ArrayList arraylist = a.c.j();
        int k = g.a(a) + j;
        j = k;
        if (b >= 0)
        {
            j = k;
            if (k >= b)
            {
                j = k + 1;
            }
        }
        return (m)arraylist.get(j);
    }

    public final int getCount()
    {
        int j = a.c.j().size() - g.a(a);
        if (b < 0)
        {
            return j;
        } else
        {
            return j - 1;
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
            view = a.b.inflate(a.f, viewgroup, false);
        }
        ((y)view).a(a(j));
        return view;
    }

    public final void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
