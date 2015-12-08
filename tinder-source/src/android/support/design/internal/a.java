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
import android.support.v7.internal.view.menu.p;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.internal:
//            NavigationMenuView, NavigationMenuItemView

public final class android.support.design.internal.a
    implements l, android.widget.AdapterView.OnItemClickListener
{
    private final class a extends BaseAdapter
    {

        final ArrayList a;
        boolean b;
        final android.support.design.internal.a c;
        private ColorDrawable d;

        private void a(int i1, int j1)
        {
            for (; i1 < j1; i1++)
            {
                h h1 = ((b)a.get(i1)).a;
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

        public final b a(int i1)
        {
            return (b)a.get(i1);
        }

        final void a()
        {
            if (!b) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int i1;
            int j1;
            int k1;
            int l2;
            int j3;
            a.clear();
            k1 = -1;
            j3 = android.support.design.internal.a.e(c).h().size();
            l2 = 0;
            j1 = 0;
            i1 = 0;
_L6:
            if (l2 >= j3) goto _L1; else goto _L3
_L3:
            Object obj = (h)android.support.design.internal.a.e(c).h().get(l2);
            if (!((h) (obj)).hasSubMenu()) goto _L5; else goto _L4
_L4:
            SubMenu submenu = ((h) (obj)).getSubMenu();
            if (submenu.hasVisibleItems())
            {
                if (l2 != 0)
                {
                    a.add(b.a(android.support.design.internal.a.f(c), 0));
                }
                a.add(b.a(((h) (obj))));
                int k3 = a.size();
                int l3 = submenu.size();
                int i3 = 0;
                boolean flag;
                boolean flag1;
                for (flag = false; i3 < l3; flag = flag1)
                {
                    obj = submenu.getItem(i3);
                    flag1 = flag;
                    if (((MenuItem) (obj)).isVisible())
                    {
                        flag1 = flag;
                        if (!flag)
                        {
                            flag1 = flag;
                            if (((MenuItem) (obj)).getIcon() != null)
                            {
                                flag1 = true;
                            }
                        }
                        a.add(b.a((h)obj));
                    }
                    i3++;
                }

                if (flag)
                {
                    a(k3, a.size());
                }
            }
            int l1 = j1;
            j1 = i1;
            i1 = l1;
_L7:
            l2++;
            int i2 = j1;
            j1 = i1;
            i1 = i2;
              goto _L6
_L5:
            int j2;
label0:
            {
                int k2 = ((h) (obj)).getGroupId();
                if (k2 != k1)
                {
                    j1 = a.size();
                    if (((h) (obj)).getIcon() != null)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    j2 = i1;
                    k1 = j1;
                    if (l2 == 0)
                    {
                        break label0;
                    }
                    a.add(b.a(android.support.design.internal.a.f(c), android.support.design.internal.a.f(c)));
                    j1++;
                } else
                {
                    j2 = j1;
                    k1 = i1;
                    if (j1 != 0)
                    {
                        break label0;
                    }
                    j2 = j1;
                    k1 = i1;
                    if (((h) (obj)).getIcon() == null)
                    {
                        break label0;
                    }
                    a(i1, a.size());
                    k1 = 1;
                    j1 = i1;
                    i1 = k1;
                }
            }
_L8:
            if (i1 != 0 && ((h) (obj)).getIcon() == null)
            {
                ((h) (obj)).setIcon(0x106000d);
            }
            a.add(b.a(((h) (obj))));
            k1 = k2;
              goto _L7
            i1 = j2;
            j1 = k1;
              goto _L8
        }

        public final boolean areAllItemsEnabled()
        {
            return false;
        }

        public final Bundle b()
        {
            Bundle bundle = new Bundle();
            ArrayList arraylist = new ArrayList();
            Iterator iterator = a.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                h h1 = ((b)iterator.next()).a;
                if (h1 != null && h1.isChecked())
                {
                    arraylist.add(Integer.valueOf(h1.getItemId()));
                }
            } while (true);
            bundle.putIntegerArrayList("android:menu:checked", arraylist);
            return bundle;
        }

        public final int getCount()
        {
            return a.size();
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
            boolean flag = true;
            b b1 = a(i1);
            if (b1.a == null)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                i1 = 2;
            } else
            {
                i1 = ((flag) ? 1 : 0);
                if (!b1.a.hasSubMenu())
                {
                    return 0;
                }
            }
            return i1;
        }

        public final View getView(int i1, View view, ViewGroup viewgroup)
        {
            b b1 = a(i1);
            getItemViewType(i1);
            JVM INSTR tableswitch 0 2: default 40
        //                       0 42
        //                       1 139
        //                       2 176;
               goto _L1 _L2 _L3 _L4
_L1:
            return view;
_L2:
            if (view == null)
            {
                view = android.support.design.internal.a.a(c).inflate(android.support.design.e.design_navigation_item, viewgroup, false);
            }
            NavigationMenuItemView navigationmenuitemview = (NavigationMenuItemView)view;
            navigationmenuitemview.setIconTintList(android.support.design.internal.a.b(c));
            navigationmenuitemview.setTextColor(android.support.design.internal.a.c(c));
            if (android.support.design.internal.a.d(c) != null)
            {
                viewgroup = android.support.design.internal.a.d(c).getConstantState().newDrawable();
            } else
            {
                viewgroup = null;
            }
            navigationmenuitemview.setBackgroundDrawable(viewgroup);
            navigationmenuitemview.a(b1.a);
            return view;
_L3:
            if (view == null)
            {
                view = android.support.design.internal.a.a(c).inflate(android.support.design.e.design_navigation_item_subheader, viewgroup, false);
            }
            ((TextView)view).setText(b1.a.getTitle());
            return view;
_L4:
            View view1 = view;
            if (view == null)
            {
                view1 = android.support.design.internal.a.a(c).inflate(android.support.design.e.design_navigation_item_separator, viewgroup, false);
            }
            view1.setPadding(0, b1.b, 0, b1.c);
            view = view1;
            if (true) goto _L1; else goto _L5
_L5:
        }

        public final int getViewTypeCount()
        {
            return 3;
        }

        public final boolean isEnabled(int i1)
        {
            b b1 = a(i1);
            return b1.a != null && !b1.a.hasSubMenu() && b1.a.isEnabled();
        }

        public final void notifyDataSetChanged()
        {
            a();
            super.notifyDataSetChanged();
        }
    }

    private static final class b
    {

        final h a;
        final int b;
        final int c;

        public static b a(int i1, int j1)
        {
            return new b(null, i1, j1);
        }

        public static b a(h h1)
        {
            return new b(h1, 0, 0);
        }

        private b(h h1, int i1, int j1)
        {
            a = h1;
            b = i1;
            c = j1;
        }
    }


    public ColorStateList a;
    public ColorStateList b;
    public Drawable c;
    private NavigationMenuView d;
    private android.support.v7.internal.view.menu.l.a e;
    private f f;
    private int g;
    private a h;
    private LayoutInflater i;
    private int j;
    private int k;

    static LayoutInflater a(android.support.design.internal.a a1)
    {
        return a1.i;
    }

    static ColorStateList b(android.support.design.internal.a a1)
    {
        return a1.b;
    }

    static ColorStateList c(android.support.design.internal.a a1)
    {
        return a1.a;
    }

    static Drawable d(android.support.design.internal.a a1)
    {
        return a1.c;
    }

    static f e(android.support.design.internal.a a1)
    {
        return a1.f;
    }

    static int f(android.support.design.internal.a a1)
    {
        return a1.k;
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
        return g;
    }

    public final void initForMenu(Context context, f f1)
    {
        i = LayoutInflater.from(context);
        f = f1;
        context = context.getResources();
        j = context.getDimensionPixelOffset(android.support.design.c.navigation_padding_top_default);
        k = context.getDimensionPixelOffset(android.support.design.c.navigation_separator_vertical_padding);
    }

    public final void onCloseMenu(f f1, boolean flag)
    {
        if (e != null)
        {
            e.onCloseMenu(f1, flag);
        }
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        i1 -= d.getHeaderViewsCount();
        if (i1 >= 0)
        {
            f.a(h.a(i1).a, this, 0);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (Bundle)parcelable;
        Object obj = parcelable.getSparseParcelableArray("android:menu:list");
        if (obj != null)
        {
            d.restoreHierarchyState(((SparseArray) (obj)));
        }
        obj = parcelable.getBundle("android:menu:adapter");
        if (obj != null)
        {
            parcelable = h;
            obj = ((Bundle) (obj)).getIntegerArrayList("android:menu:checked");
            if (obj != null)
            {
                parcelable.b = true;
                Iterator iterator = ((a) (parcelable)).a.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    h h1 = ((b)iterator.next()).a;
                    if (h1 != null && ((ArrayList) (obj)).contains(Integer.valueOf(h1.getItemId())))
                    {
                        h1.setChecked(true);
                    }
                } while (true);
                parcelable.b = false;
                parcelable.a();
            }
        }
    }

    public final Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        if (d != null)
        {
            SparseArray sparsearray = new SparseArray();
            d.saveHierarchyState(sparsearray);
            bundle.putSparseParcelableArray("android:menu:list", sparsearray);
        }
        if (h != null)
        {
            bundle.putBundle("android:menu:adapter", h.b());
        }
        return bundle;
    }

    public final boolean onSubMenuSelected(p p)
    {
        return false;
    }

    public final void updateMenuView(boolean flag)
    {
        if (h != null)
        {
            h.notifyDataSetChanged();
        }
    }
}
