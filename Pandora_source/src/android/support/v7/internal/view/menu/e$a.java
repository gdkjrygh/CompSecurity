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

private class a extends BaseAdapter
{

    final e a;
    private int b;

    public h a(int i)
    {
        ArrayList arraylist = a.c.l();
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

    void a()
    {
        h h1 = a.c.r();
        if (h1 != null)
        {
            ArrayList arraylist = a.c.l();
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

    public int getCount()
    {
        int i = a.c.l().size() - e.a(a);
        if (b < 0)
        {
            return i;
        } else
        {
            return i - 1;
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
            view = a.b.inflate(a.f, viewgroup, false);
        }
        ((a)view).a(a(i), 0);
        return view;
    }

    public void notifyDataSetChanged()
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
