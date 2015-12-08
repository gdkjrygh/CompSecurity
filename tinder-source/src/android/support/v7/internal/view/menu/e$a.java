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
//            e, f, h

private final class a extends BaseAdapter
{

    final e a;
    private int b;

    private void a()
    {
        h h1 = a.c.j;
        if (h1 != null)
        {
            ArrayList arraylist = a.c.j();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                if ((h)arraylist.get(i) == h1)
                {
                    b = i;
                    return;
                }
            }

        }
        b = -1;
    }

    public final h a(int i)
    {
        ArrayList arraylist = a.c.j();
        int j = e.a(a) + i;
        i = j;
        if (b >= 0)
        {
            i = j;
            if (j >= b)
            {
                i = j + 1;
            }
        }
        return (h)arraylist.get(i);
    }

    public final int getCount()
    {
        int i = a.c.j().size() - e.a(a);
        if (b < 0)
        {
            return i;
        } else
        {
            return i - 1;
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
            view = a.b.inflate(a.f, viewgroup, false);
        }
        ((a)view).a(a(i));
        return view;
    }

    public final void notifyDataSetChanged()
    {
        a();
        super.notifyDataSetChanged();
    }

    public (e e1)
    {
        a = e1;
        super();
        b = -1;
        a();
    }
}
