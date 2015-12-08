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
//            t, i, m, y, 
//            ListMenuItemView

final class u extends BaseAdapter
{

    final t a;
    private i b;
    private int c;

    public u(t t1, i j)
    {
        a = t1;
        super();
        c = -1;
        b = j;
        a();
    }

    static i a(u u1)
    {
        return u1.b;
    }

    private void a()
    {
        m m1 = t.c(a).j;
        if (m1 != null)
        {
            ArrayList arraylist = t.c(a).j();
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
        if (t.a(a))
        {
            arraylist = b.j();
        } else
        {
            arraylist = b.h();
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
        if (t.a(a))
        {
            arraylist = b.j();
        } else
        {
            arraylist = b.h();
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
            view = t.b(a).inflate(t.a, viewgroup, false);
        }
        viewgroup = (y)view;
        if (a.e)
        {
            ((ListMenuItemView)view).setForceShowIcon(true);
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
