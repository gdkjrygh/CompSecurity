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
//            l, f, h, ListMenuItemView

private final class a extends BaseAdapter
{

    final l a;
    private f b;
    private int c;

    static f a(a a1)
    {
        return a1.b;
    }

    private void a()
    {
        h h1 = l.access$300(a).j;
        if (h1 != null)
        {
            ArrayList arraylist = l.access$300(a).j();
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

    public final h a(int i)
    {
        ArrayList arraylist;
        int j;
        if (l.access$100(a))
        {
            arraylist = b.j();
        } else
        {
            arraylist = b.h();
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

    public final int getCount()
    {
        ArrayList arraylist;
        if (l.access$100(a))
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

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = l.access$200(a).inflate(l.ITEM_LAYOUT, viewgroup, false);
        }
        viewgroup = (EM_LAYOUT)view;
        if (a.mForceShowIcon)
        {
            ListMenuItemView listmenuitemview = (ListMenuItemView)view;
            listmenuitemview.b = true;
            listmenuitemview.a = true;
        }
        viewgroup.initialize(a(i), 0);
        return view;
    }

    public final void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }

    public MenuItemView(l l1, f f1)
    {
        a = l1;
        super();
        c = -1;
        b = f1;
        a();
    }
}
