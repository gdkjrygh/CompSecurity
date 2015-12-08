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
//            s, g, j, x, 
//            ListMenuItemView

class t extends BaseAdapter
{

    final s a;
    private g b;
    private int c;

    public t(s s1, g g1)
    {
        a = s1;
        super();
        c = -1;
        b = g1;
        a();
    }

    static g a(t t1)
    {
        return t1.b;
    }

    public j a(int i)
    {
        ArrayList arraylist;
        int k;
        if (s.a(a))
        {
            arraylist = b.k();
        } else
        {
            arraylist = b.h();
        }
        k = i;
        if (c >= 0)
        {
            k = i;
            if (i >= c)
            {
                k = i + 1;
            }
        }
        return (j)arraylist.get(k);
    }

    void a()
    {
        j j1 = s.c(a).n();
        if (j1 != null)
        {
            ArrayList arraylist = s.c(a).k();
            int k = arraylist.size();
            for (int i = 0; i < k; i++)
            {
                if ((j)arraylist.get(i) == j1)
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
        if (s.a(a))
        {
            arraylist = b.k();
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
            view = s.b(a).inflate(s.a, viewgroup, false);
        }
        viewgroup = (x)view;
        if (a.b)
        {
            ((ListMenuItemView)view).setForceShowIcon(true);
        }
        viewgroup.a(a(i), 0);
        return view;
    }

    public void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }
}
