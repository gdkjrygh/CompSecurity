// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget.popupmenu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

// Referenced classes of package com.android.widget.popupmenu:
//            c, a, b, ListMenuItemView

private class a extends BaseAdapter
{

    final c a;
    private a b;
    private int c;

    static a a(a a1)
    {
        return a1.b;
    }

    public b a(int i)
    {
        ArrayList arraylist;
        int j;
        if (com.android.widget.popupmenu.c.a(a))
        {
            arraylist = b.i();
        } else
        {
            arraylist = b.g();
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
        return (b)arraylist.get(j);
    }

    void a()
    {
        b b1 = com.android.widget.popupmenu.c.c(a).l();
        if (b1 != null)
        {
            ArrayList arraylist = com.android.widget.popupmenu.c.c(a).i();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((b)arraylist.get(i) == b1)
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
        if (com.android.widget.popupmenu.c.a(a))
        {
            arraylist = b.i();
        } else
        {
            arraylist = b.g();
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
            view = com.android.widget.popupmenu.c.b(a).inflate(0x7f040085, viewgroup, false);
        }
        viewgroup = (te)view;
        if (a.a)
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

    public MenuItemView(c c1, a a1)
    {
        a = c1;
        super();
        c = -1;
        b = a1;
        a();
    }
}
