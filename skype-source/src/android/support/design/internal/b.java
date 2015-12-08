// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.l;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.o;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.internal:
//            NavigationMenuView, NavigationMenuItemView

public final class android.support.design.internal.b
    implements l, android.widget.AdapterView.OnItemClickListener
{
    private final class a extends BaseAdapter
    {

        final android.support.design.internal.b a;
        private final ArrayList b = new ArrayList();
        private h c;
        private ColorDrawable d;
        private boolean e;

        private void a(int i1, int j1)
        {
            for (; i1 < j1; i1++)
            {
                h h1 = ((b)b.get(i1)).d();
                if (h1.getIcon() != null)
                {
                    continue;
                }
                if (d == null)
                {
                    d = new ColorDrawable(0x106000d);
                }
                h1.setIcon(d);
            }

        }

        private void b()
        {
            if (e)
            {
                return;
            }
            e = true;
            b.clear();
            int j2 = -1;
            int k1 = 0;
            int l1 = 0;
            int i2 = 0;
            int i3 = android.support.design.internal.b.g(a).k().size();
            while (i2 < i3) 
            {
                h h1 = (h)android.support.design.internal.b.g(a).k().get(i2);
                if (h1.isChecked())
                {
                    a(h1);
                }
                if (h1.isCheckable())
                {
                    h1.a(false);
                }
                int j1;
                int k2;
                int l2;
                if (h1.hasSubMenu())
                {
                    SubMenu submenu = h1.getSubMenu();
                    j1 = l1;
                    k2 = j2;
                    l2 = k1;
                    if (submenu.hasVisibleItems())
                    {
                        if (i2 != 0)
                        {
                            b.add(b.a(android.support.design.internal.b.h(a), 0));
                        }
                        b.add(b.a(h1));
                        boolean flag = false;
                        int j3 = b.size();
                        k2 = 0;
                        for (l2 = submenu.size(); k2 < l2;)
                        {
                            h h2 = (h)submenu.getItem(k2);
                            j1 = ((flag) ? 1 : 0);
                            if (h2.isVisible())
                            {
                                j1 = ((flag) ? 1 : 0);
                                if (!flag)
                                {
                                    j1 = ((flag) ? 1 : 0);
                                    if (h2.getIcon() != null)
                                    {
                                        j1 = 1;
                                    }
                                }
                                if (h2.isCheckable())
                                {
                                    h2.a(false);
                                }
                                if (h1.isChecked())
                                {
                                    a(h1);
                                }
                                b.add(b.a(h2));
                            }
                            k2++;
                            flag = j1;
                        }

                        j1 = l1;
                        k2 = j2;
                        l2 = k1;
                        if (flag)
                        {
                            a(j3, b.size());
                            l2 = k1;
                            k2 = j2;
                            j1 = l1;
                        }
                    }
                } else
                {
                    k2 = h1.getGroupId();
                    int i1;
                    if (k2 != j2)
                    {
                        l1 = b.size();
                        if (h1.getIcon() != null)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        j1 = k1;
                        i1 = l1;
                        if (i2 != 0)
                        {
                            i1 = l1 + 1;
                            b.add(b.a(android.support.design.internal.b.h(a), android.support.design.internal.b.h(a)));
                            j1 = k1;
                        }
                    } else
                    {
                        j1 = l1;
                        i1 = k1;
                        if (l1 == 0)
                        {
                            j1 = l1;
                            i1 = k1;
                            if (h1.getIcon() != null)
                            {
                                j1 = 1;
                                a(k1, b.size());
                                i1 = k1;
                            }
                        }
                    }
                    if (j1 != 0 && h1.getIcon() == null)
                    {
                        h1.setIcon(0x106000d);
                    }
                    b.add(b.a(h1));
                    l2 = i1;
                }
                i2++;
                l1 = j1;
                j2 = k2;
                k1 = l2;
            }
            e = false;
        }

        public final Bundle a()
        {
            Bundle bundle = new Bundle();
            if (c != null)
            {
                bundle.putInt("android:menu:checked", c.getItemId());
            }
            return bundle;
        }

        public final b a(int i1)
        {
            return (b)b.get(i1);
        }

        public final void a(Bundle bundle)
        {
            int i1 = bundle.getInt("android:menu:checked", 0);
            if (i1 != 0)
            {
                e = true;
                bundle = b.iterator();
                do
                {
                    if (!bundle.hasNext())
                    {
                        break;
                    }
                    h h1 = ((b)bundle.next()).d();
                    if (h1 == null || h1.getItemId() != i1)
                    {
                        continue;
                    }
                    a(h1);
                    break;
                } while (true);
                e = false;
                b();
            }
        }

        public final void a(h h1)
        {
            if (c == h1 || !h1.isCheckable())
            {
                return;
            }
            if (c != null)
            {
                c.setChecked(false);
            }
            c = h1;
            h1.setChecked(true);
        }

        public final void a(boolean flag)
        {
            e = flag;
        }

        public final boolean areAllItemsEnabled()
        {
            return false;
        }

        public final int getCount()
        {
            return b.size();
        }

        public final Object getItem(int i1)
        {
            return a(i1);
        }

        public final long getItemId(int i1)
        {
            return (long)i1;
        }

        public final int getItemViewType(int i1)
        {
            b b1 = a(i1);
            if (b1.a())
            {
                return 2;
            }
            return !b1.d().hasSubMenu() ? 0 : 1;
        }

        public final View getView(int i1, View view, ViewGroup viewgroup)
        {
            b b1 = a(i1);
            View view3;
            switch (getItemViewType(i1))
            {
            default:
                return view;

            case 0: // '\0'
                View view1 = view;
                if (view == null)
                {
                    view1 = android.support.design.internal.b.a(a).inflate(android.support.design.a.g.design_navigation_item, viewgroup, false);
                }
                viewgroup = (NavigationMenuItemView)view1;
                viewgroup.a(android.support.design.internal.b.b(a));
                if (android.support.design.internal.b.c(a))
                {
                    viewgroup.setTextAppearance(viewgroup.getContext(), android.support.design.internal.b.d(a));
                }
                if (android.support.design.internal.b.e(a) != null)
                {
                    viewgroup.setTextColor(android.support.design.internal.b.e(a));
                }
                if (android.support.design.internal.b.f(a) != null)
                {
                    view = android.support.design.internal.b.f(a).getConstantState().newDrawable();
                } else
                {
                    view = null;
                }
                viewgroup.setBackgroundDrawable(view);
                viewgroup.a(b1.d());
                return view1;

            case 1: // '\001'
                View view2 = view;
                if (view == null)
                {
                    view2 = android.support.design.internal.b.a(a).inflate(android.support.design.a.g.design_navigation_item_subheader, viewgroup, false);
                }
                ((TextView)view2).setText(b1.d().getTitle());
                return view2;

            case 2: // '\002'
                view3 = view;
                break;
            }
            if (view == null)
            {
                view3 = android.support.design.internal.b.a(a).inflate(android.support.design.a.g.design_navigation_item_separator, viewgroup, false);
            }
            view3.setPadding(0, b1.b(), 0, b1.c());
            return view3;
        }

        public final int getViewTypeCount()
        {
            return 3;
        }

        public final boolean isEnabled(int i1)
        {
            return a(i1).e();
        }

        public final void notifyDataSetChanged()
        {
            b();
            super.notifyDataSetChanged();
        }

        a()
        {
            a = android.support.design.internal.b.this;
            super();
            b();
        }
    }

    private static final class b
    {

        private final h a;
        private final int b;
        private final int c;

        public static b a(int i1, int j1)
        {
            return new b(null, i1, j1);
        }

        public static b a(h h1)
        {
            return new b(h1, 0, 0);
        }

        public final boolean a()
        {
            return a == null;
        }

        public final int b()
        {
            return b;
        }

        public final int c()
        {
            return c;
        }

        public final h d()
        {
            return a;
        }

        public final boolean e()
        {
            return a != null && !a.hasSubMenu() && a.isEnabled();
        }

        private b(h h1, int i1, int j1)
        {
            a = h1;
            b = i1;
            c = j1;
        }
    }


    private NavigationMenuView a;
    private LinearLayout b;
    private android.support.v7.internal.view.menu.l.a c;
    private f d;
    private int e;
    private a f;
    private LayoutInflater g;
    private int h;
    private boolean i;
    private ColorStateList j;
    private ColorStateList k;
    private Drawable l;
    private int m;
    private int n;

    public android.support.design.internal.b()
    {
    }

    static LayoutInflater a(android.support.design.internal.b b1)
    {
        return b1.g;
    }

    static ColorStateList b(android.support.design.internal.b b1)
    {
        return b1.k;
    }

    static boolean c(android.support.design.internal.b b1)
    {
        return b1.i;
    }

    static int d(android.support.design.internal.b b1)
    {
        return b1.h;
    }

    static ColorStateList e(android.support.design.internal.b b1)
    {
        return b1.j;
    }

    static Drawable f(android.support.design.internal.b b1)
    {
        return b1.l;
    }

    static f g(android.support.design.internal.b b1)
    {
        return b1.d;
    }

    static int h(android.support.design.internal.b b1)
    {
        return b1.n;
    }

    public final m a(ViewGroup viewgroup)
    {
        if (a == null)
        {
            a = (NavigationMenuView)g.inflate(android.support.design.a.g.design_navigation_menu, viewgroup, false);
            if (f == null)
            {
                f = new a();
            }
            b = (LinearLayout)g.inflate(android.support.design.a.g.design_navigation_item_header, a, false);
            a.addHeaderView(b, null, false);
            a.setAdapter(f);
            a.setOnItemClickListener(this);
        }
        return a;
    }

    public final View a(int i1)
    {
        View view = g.inflate(i1, b, false);
        b.addView(view);
        a.setPadding(0, 0, 0, a.getPaddingBottom());
        return view;
    }

    public final void a(Context context, f f1)
    {
        g = LayoutInflater.from(context);
        d = f1;
        context = context.getResources();
        m = context.getDimensionPixelOffset(android.support.design.a.d.design_navigation_padding_top_default);
        n = context.getDimensionPixelOffset(android.support.design.a.d.design_navigation_separator_vertical_padding);
    }

    public final void a(ColorStateList colorstatelist)
    {
        k = colorstatelist;
        a(false);
    }

    public final void a(Drawable drawable)
    {
        l = drawable;
    }

    public final void a(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        SparseArray sparsearray = parcelable.getSparseParcelableArray("android:menu:list");
        if (sparsearray != null)
        {
            a.restoreHierarchyState(sparsearray);
        }
        parcelable = parcelable.getBundle("android:menu:adapter");
        if (parcelable != null)
        {
            f.a(parcelable);
        }
    }

    public final void a(f f1, boolean flag)
    {
        if (c != null)
        {
            c.onCloseMenu(f1, flag);
        }
    }

    public final void a(boolean flag)
    {
        if (f != null)
        {
            f.notifyDataSetChanged();
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

    public final boolean a(o o)
    {
        return false;
    }

    public final int b()
    {
        return e;
    }

    public final void b(int i1)
    {
        h = i1;
        i = true;
        a(false);
    }

    public final void b(ColorStateList colorstatelist)
    {
        j = colorstatelist;
        a(false);
    }

    public final void b(boolean flag)
    {
        if (f != null)
        {
            f.a(flag);
        }
    }

    public final boolean b(h h1)
    {
        return false;
    }

    public final void c()
    {
        e = 1;
    }

    public final void c(h h1)
    {
        f.a(h1);
    }

    public final Parcelable d()
    {
        Bundle bundle = new Bundle();
        if (a != null)
        {
            SparseArray sparsearray = new SparseArray();
            a.saveHierarchyState(sparsearray);
            bundle.putSparseParcelableArray("android:menu:list", sparsearray);
        }
        if (f != null)
        {
            bundle.putBundle("android:menu:adapter", f.a());
        }
        return bundle;
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        i1 -= a.getHeaderViewsCount();
        if (i1 >= 0)
        {
            b(true);
            adapterview = f.a(i1).d();
            if (adapterview != null && adapterview.isCheckable())
            {
                f.a(adapterview);
            }
            d.a(adapterview, this, 0);
            b(false);
            a(false);
        }
    }
}
