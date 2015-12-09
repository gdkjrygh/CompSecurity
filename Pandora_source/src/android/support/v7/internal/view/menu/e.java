// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, ExpandedMenuView, p, g, 
//            f, m, h

public class e
    implements l, android.widget.AdapterView.OnItemClickListener
{
    private class a extends BaseAdapter
    {

        final e a;
        private int b;

        public h a(int j)
        {
            ArrayList arraylist = a.c.l();
            int k = e.a(a) + j;
            j = k;
            if (b >= 0)
            {
                j = k;
                if (k >= b)
                {
                    j = k + 1;
                }
            }
            return (h)arraylist.get(j);
        }

        void a()
        {
            h h1 = a.c.r();
            if (h1 != null)
            {
                ArrayList arraylist = a.c.l();
                int k = arraylist.size();
                for (int j = 0; j < k; j++)
                {
                    if ((h)arraylist.get(j) == h1)
                    {
                        b = j;
                        return;
                    }
                }

            }
            b = -1;
        }

        public int getCount()
        {
            int j = a.c.l().size() - e.a(a);
            if (b < 0)
            {
                return j;
            } else
            {
                return j - 1;
            }
        }

        public Object getItem(int j)
        {
            return a(j);
        }

        public long getItemId(int j)
        {
            return (long)j;
        }

        public View getView(int j, View view, ViewGroup viewgroup)
        {
            if (view == null)
            {
                view = a.b.inflate(a.f, viewgroup, false);
            }
            ((m.a)view).a(a(j), 0);
            return view;
        }

        public void notifyDataSetChanged()
        {
            a();
            super.notifyDataSetChanged();
        }

        public a()
        {
            a = e.this;
            super();
            b = -1;
            a();
        }
    }


    Context a;
    LayoutInflater b;
    f c;
    ExpandedMenuView d;
    int e;
    int f;
    a g;
    private int h;
    private l.a i;

    public e(int j, int k)
    {
        f = j;
        e = k;
    }

    static int a(e e1)
    {
        return e1.h;
    }

    public m a(ViewGroup viewgroup)
    {
        if (g == null)
        {
            g = new a();
        }
        if (!g.isEmpty())
        {
            if (d == null)
            {
                d = (ExpandedMenuView)b.inflate(android.support.v7.appcompat.R.layout.abc_expanded_menu_layout, viewgroup, false);
                d.setAdapter(g);
                d.setOnItemClickListener(this);
            }
            return d;
        } else
        {
            return null;
        }
    }

    public ListAdapter a()
    {
        if (g == null)
        {
            g = new a();
        }
        return g;
    }

    public void a(Context context, f f1)
    {
        if (e == 0) goto _L2; else goto _L1
_L1:
        a = new ContextThemeWrapper(context, e);
        b = LayoutInflater.from(a);
_L4:
        c = f1;
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
        return;
_L2:
        if (a != null)
        {
            a = context;
            if (b == null)
            {
                b = LayoutInflater.from(a);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(f f1, boolean flag)
    {
        if (i != null)
        {
            i.a(f1, flag);
        }
    }

    public void a(l.a a1)
    {
        i = a1;
    }

    public boolean a(f f1, h h1)
    {
        return false;
    }

    public boolean a(p p1)
    {
        if (!p1.hasVisibleItems())
        {
            return false;
        }
        (new g(p1)).a(null);
        if (i != null)
        {
            i.b(p1);
        }
        return true;
    }

    public boolean b(f f1, h h1)
    {
        return false;
    }

    public void c(boolean flag)
    {
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
    }

    public boolean g()
    {
        return false;
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l1)
    {
        c.a(g.a(j), 0);
    }
}
