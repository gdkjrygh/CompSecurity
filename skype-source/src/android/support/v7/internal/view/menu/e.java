// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, ExpandedMenuView, o, g, 
//            f, m, h

public final class e
    implements l, android.widget.AdapterView.OnItemClickListener
{
    private final class a extends BaseAdapter
    {

        final e a;
        private int b;

        private void a()
        {
            h h1 = a.c.q();
            if (h1 != null)
            {
                ArrayList arraylist = a.c.n();
                int i1 = arraylist.size();
                for (int k = 0; k < i1; k++)
                {
                    if ((h)arraylist.get(k) == h1)
                    {
                        b = k;
                        return;
                    }
                }

            }
            b = -1;
        }

        public final h a(int k)
        {
            ArrayList arraylist = a.c.n();
            int i1 = k + e.a(a);
            k = i1;
            if (b >= 0)
            {
                k = i1;
                if (i1 >= b)
                {
                    k = i1 + 1;
                }
            }
            return (h)arraylist.get(k);
        }

        public final int getCount()
        {
            int k = a.c.n().size() - e.a(a);
            if (b < 0)
            {
                return k;
            } else
            {
                return k - 1;
            }
        }

        public final Object getItem(int k)
        {
            return a(k);
        }

        public final long getItemId(int k)
        {
            return (long)k;
        }

        public final View getView(int k, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = a.b.inflate(a.f, viewgroup, false);
            }
            ((m.a)view1).a(a(k));
            return view1;
        }

        public final void notifyDataSetChanged()
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
    private int j;

    private e(int k)
    {
        f = k;
        e = 0;
    }

    public e(Context context, int k)
    {
        this(k);
        a = context;
        b = LayoutInflater.from(a);
    }

    static int a(e e1)
    {
        return e1.h;
    }

    public final m a(ViewGroup viewgroup)
    {
        if (d == null)
        {
            d = (ExpandedMenuView)b.inflate(android.support.v7.appcompat.a.h.abc_expanded_menu_layout, viewgroup, false);
            if (g == null)
            {
                g = new a();
            }
            d.setAdapter(g);
            d.setOnItemClickListener(this);
        }
        return d;
    }

    public final void a(Context context, f f1)
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

    public final void a(Parcelable parcelable)
    {
        parcelable = ((Bundle)parcelable).getSparseParcelableArray("android:menu:list");
        if (parcelable != null)
        {
            d.restoreHierarchyState(parcelable);
        }
    }

    public final void a(f f1, boolean flag)
    {
        if (i != null)
        {
            i.onCloseMenu(f1, flag);
        }
    }

    public final void a(l.a a1)
    {
        i = a1;
    }

    public final void a(boolean flag)
    {
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean a(h h1)
    {
        return false;
    }

    public final boolean a(o o1)
    {
        if (!o1.hasVisibleItems())
        {
            return false;
        }
        (new g(o1)).a();
        if (i != null)
        {
            i.onOpenSubMenu(o1);
        }
        return true;
    }

    public final int b()
    {
        return j;
    }

    public final boolean b(h h1)
    {
        return false;
    }

    public final ListAdapter c()
    {
        if (g == null)
        {
            g = new a();
        }
        return g;
    }

    public final Parcelable d()
    {
        if (d == null)
        {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray sparsearray = new SparseArray();
        if (d != null)
        {
            d.saveHierarchyState(sparsearray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparsearray);
        return bundle;
    }

    public final void onItemClick(AdapterView adapterview, View view, int k, long l1)
    {
        c.a(g.a(k), this, 0);
    }
}
