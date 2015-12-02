// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            f, d, a, c, 
//            k, ListMenuItemView

class g extends BaseAdapter
{

    final d a;
    private a b;
    private int c;

    public g(d d1, a a1)
    {
        a = d1;
        super();
        c = -1;
        b = a1;
        registerDataSetObserver(new f(d1, null));
        a();
    }

    static a a(g g1)
    {
        return g1.b;
    }

    public c a(int i)
    {
        ArrayList arraylist;
        int j;
        if (d.a(a))
        {
            arraylist = b.l();
        } else
        {
            arraylist = b.k();
        }
        j = i;
        if (c >= 0)
        {
            j = i;
            if (i >= c)
            {
                j = i + 1;
            }
        }
        return (c)arraylist.get(j);
    }

    void a()
    {
        c c1 = d.c(a).p();
        if (c1 != null)
        {
            ArrayList arraylist = d.c(a).l();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((c)arraylist.get(i) == c1)
                {
                    c = i;
                    return;
                }
            }

        }
        c = -1;
    }

    public int getCount()
    {
        ArrayList arraylist;
        if (d.a(a))
        {
            arraylist = b.l();
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

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = d.b(a).inflate(d.a, viewgroup, false);
        }
        viewgroup = (k)view;
        if (a.b)
        {
            ((ListMenuItemView)view).setForceShowIcon(true);
        }
        viewgroup.a(a(i), 0);
        return view;
    }
}
