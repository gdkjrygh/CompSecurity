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
        h h1 = k.c(a).q();
        if (h1 != null)
        {
            ArrayList arraylist = k.c(a).n();
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
        if (k.a(a))
        {
            arraylist = b.n();
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
        return (h)arraylist.get(j);
    }

    public final int getCount()
    {
        ArrayList arraylist;
        if (k.a(a))
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
        View view1 = view;
        if (view == null)
        {
            view1 = k.b(a).inflate(k.a, viewgroup, false);
        }
        view = (a)view1;
        if (a.b)
        {
            ((ListMenuItemView)view1).setForceShowIcon(true);
        }
        view.a(a(i));
        return view1;
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
