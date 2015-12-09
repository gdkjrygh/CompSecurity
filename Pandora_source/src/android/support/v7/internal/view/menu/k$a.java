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
//            k, f, h, ListMenuItemView

private class a extends BaseAdapter
{

    final k a;
    private f b;
    private int c;

    static f a(a a1)
    {
        return a1.b;
    }

    public h a(int i)
    {
        ArrayList arraylist;
        int j;
        if (k.a(a))
        {
            arraylist = b.l();
        } else
        {
            arraylist = b.i();
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
        return (h)arraylist.get(j);
    }

    void a()
    {
        h h1 = k.c(a).r();
        if (h1 != null)
        {
            ArrayList arraylist = k.c(a).l();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((h)arraylist.get(i) == h1)
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
        if (k.a(a))
        {
            arraylist = b.l();
        } else
        {
            arraylist = b.i();
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
            view = k.b(a).inflate(k.b, viewgroup, false);
        }
        viewgroup = (a)view;
        if (a.c)
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

    public MenuItemView(k k1, f f1)
    {
        a = k1;
        super();
        c = -1;
        b = f1;
        a();
    }
}
