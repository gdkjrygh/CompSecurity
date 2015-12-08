// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AlertDialog;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l, ExpandedMenuView, f, p, 
//            g, m, h

public final class e
    implements l, android.widget.AdapterView.OnItemClickListener
{
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
            ArrayList arraylist = a.c.j();
            int i1 = e.a(a) + k;
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
            int k = a.c.j().size() - e.a(a);
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
            if (view == null)
            {
                view = a.b.inflate(a.f, viewgroup, false);
            }
            ((m.a)view).a(a(k));
            return view;
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
    public l.a g;
    a h;
    private int i;
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
        return e1.i;
    }

    public final m a(ViewGroup viewgroup)
    {
        if (d == null)
        {
            d = (ExpandedMenuView)b.inflate(android.support.v7.appcompat.R.layout.abc_expanded_menu_layout, viewgroup, false);
            if (h == null)
            {
                h = new a();
            }
            d.setAdapter(h);
            d.setOnItemClickListener(this);
        }
        return d;
    }

    public final ListAdapter a()
    {
        if (h == null)
        {
            h = new a();
        }
        return h;
    }

    public final boolean collapseItemActionView(f f1, h h1)
    {
        return false;
    }

    public final boolean expandItemActionView(f f1, h h1)
    {
        return false;
    }

    public final boolean flagActionItems()
    {
        return false;
    }

    public final int getId()
    {
        return j;
    }

    public final void initForMenu(Context context, f f1)
    {
        if (e == 0) goto _L2; else goto _L1
_L1:
        a = new ContextThemeWrapper(context, e);
        b = LayoutInflater.from(a);
_L4:
        c = f1;
        if (h != null)
        {
            h.notifyDataSetChanged();
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

    public final void onCloseMenu(f f1, boolean flag)
    {
        if (g != null)
        {
            g.onCloseMenu(f1, flag);
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int k, long l1)
    {
        c.a(h.a(k), this, 0);
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = ((Bundle)parcelable).getSparseParcelableArray("android:menu:list");
        if (parcelable != null)
        {
            d.restoreHierarchyState(parcelable);
        }
    }

    public final Parcelable onSaveInstanceState()
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

    public final boolean onSubMenuSelected(p p1)
    {
        if (!p1.hasVisibleItems())
        {
            return false;
        }
        g g1 = new g(p1);
        Object obj = g1.a;
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((f) (obj)).a);
        g1.c = new e(builder.getContext(), android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
        g1.c.g = g1;
        g1.a.a(g1.c);
        builder.setAdapter(g1.c.a(), g1);
        View view = ((f) (obj)).h;
        if (view != null)
        {
            builder.setCustomTitle(view);
        } else
        {
            builder.setIcon(((f) (obj)).g).setTitle(((f) (obj)).f);
        }
        builder.setOnKeyListener(g1);
        g1.b = builder.create();
        g1.b.setOnDismissListener(g1);
        obj = g1.b.getWindow().getAttributes();
        obj.type = 1003;
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        g1.b.show();
        if (g != null)
        {
            g.onOpenSubMenu(p1);
        }
        return true;
    }

    public final void updateMenuView(boolean flag)
    {
        if (h != null)
        {
            h.notifyDataSetChanged();
        }
    }
}
