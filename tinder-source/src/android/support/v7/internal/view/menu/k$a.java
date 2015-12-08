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

private final class a extends BaseAdapter
{

    final k a;
    private f b;
    private int c;

    static f a(a a1)
    {
        return a1.b;
    }

    private void a()
    {
        h h1 = k.access$300(a).j;
        if (h1 != null)
        {
            ArrayList arraylist = k.access$300(a).j();
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
        if (k.access$100(a))
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
        if (k.access$100(a))
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
            view = k.access$200(a).inflate(k.ITEM_LAYOUT, viewgroup, false);
        }
        viewgroup = (EM_LAYOUT)view;
        if (a.mForceShowIcon)
        {
            ((ListMenuItemView)view).setForceShowIcon(true);
        }
        viewgroup.a(a(i));
        return view;
    }

    public final void notifyDataSetChanged()
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
