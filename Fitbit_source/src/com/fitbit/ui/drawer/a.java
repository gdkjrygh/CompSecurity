// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.drawer;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.fitbit.home.ui.NavigationDrawerState;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.ui.drawer:
//            NavigationItem, c, NavigationDrawerActivity

public class com.fitbit.ui.drawer.a
{
    public static interface a
    {

        public abstract void a(NavigationItem navigationitem, int k);

        public abstract void i();

        public abstract void j();
    }


    public static final String a = "com.fitbit.ui.drawer.ACTION_BROADCAST_NAV_DRAVER_OPENING";
    public static final String b = "com.fitbit.ui.drawer.EXTRA_DRAVER_OPENING";
    protected NavigationDrawerActivity c;
    protected ListView d;
    protected DrawerLayout e;
    private ActionBarDrawerToggle f;
    private a g;
    private int h;
    private Boolean i;
    private int j;

    public com.fitbit.ui.drawer.a()
    {
        h = -1;
        i = null;
    }

    static int a(com.fitbit.ui.drawer.a a1)
    {
        return a1.h;
    }

    static int a(com.fitbit.ui.drawer.a a1, int k)
    {
        a1.j = k;
        return k;
    }

    static Boolean a(com.fitbit.ui.drawer.a a1, Boolean boolean1)
    {
        a1.i = boolean1;
        return boolean1;
    }

    static a b(com.fitbit.ui.drawer.a a1)
    {
        return a1.g;
    }

    private void b(int k, boolean flag)
    {
        d.setItemChecked(k, true);
        e.closeDrawer(d);
        Object obj = d.getItemAtPosition(k);
        if (obj instanceof NavigationItem)
        {
            obj = (NavigationItem)obj;
        } else
        {
            obj = null;
        }
        if (obj == null || NavigationItem.RunAs.a == ((NavigationItem) (obj)).d())
        {
            h = k;
        }
        if (flag && g != null)
        {
            g.a(((NavigationItem) (obj)), k);
        }
    }

    static int c(com.fitbit.ui.drawer.a a1)
    {
        return a1.j;
    }

    static Boolean d(com.fitbit.ui.drawer.a a1)
    {
        return a1.i;
    }

    private void g()
    {
        if (com.fitbit.util.b.a.a(21))
        {
            int k = (int)d.getResources().getDimension(0x7f0a014c);
            ((android.view.ViewGroup.MarginLayoutParams)d.getLayoutParams()).setMargins(0, k, 0, 0);
        }
    }

    private void h()
    {
        if (NavigationDrawerState.a() == com.fitbit.home.ui.NavigationDrawerState.State.b || NavigationDrawerState.a() == com.fitbit.home.ui.NavigationDrawerState.State.d)
        {
            e.closeDrawer(d);
            NavigationDrawerState.a(com.fitbit.home.ui.NavigationDrawerState.State.b);
        }
    }

    public final NavigationItem a(Object obj)
    {
        c c1 = (c)d.getAdapter();
        if (c1 != null && obj != null)
        {
            for (int k = 0; k < c1.getCount(); k++)
            {
                NavigationItem navigationitem = (NavigationItem)c1.get(k);
                if (obj.equals(navigationitem.b()))
                {
                    return navigationitem;
                }
            }

        }
        return null;
    }

    protected final void a()
    {
        g();
        DrawerLayout drawerlayout = e;
        ActionBarDrawerToggle actionbardrawertoggle = new ActionBarDrawerToggle(c, e, c.e(), 0x7f08042e, 0x7f0802c2) {

            final com.fitbit.ui.drawer.a a;

            public void onDrawerClosed(View view)
            {
                super.onDrawerClosed(view);
                NavigationDrawerState.a(com.fitbit.home.ui.NavigationDrawerState.State.b);
                com.fitbit.ui.drawer.a.b(a).j();
            }

            public void onDrawerOpened(View view)
            {
                super.onDrawerOpened(view);
                NavigationDrawerState.a(com.fitbit.home.ui.NavigationDrawerState.State.a);
                com.fitbit.ui.drawer.a.b(a).i();
                a.d.setItemChecked(com.fitbit.ui.drawer.a.a(a), true);
            }

            public void onDrawerSlide(View view, float f1)
            {
                boolean flag = true;
                super.onDrawerSlide(view, f1);
                view = a;
                if (a.e.isDrawerOpen(a.d) || com.fitbit.ui.drawer.a.c(a) == 1)
                {
                    flag = false;
                }
                com.fitbit.ui.drawer.a.a(view, Boolean.valueOf(flag));
                if (Boolean.TRUE.equals(com.fitbit.ui.drawer.a.d(a)))
                {
                    z.a(new Intent("com.fitbit.ui.drawer.ACTION_BROADCAST_NAV_DRAVER_OPENING"));
                }
                NavigationDrawerState.c();
            }

            public void onDrawerStateChanged(int k)
            {
                super.onDrawerStateChanged(k);
                com.fitbit.ui.drawer.a.a(a, k);
                a.d.setItemChecked(com.fitbit.ui.drawer.a.a(a), true);
                a.c.supportInvalidateOptionsMenu();
            }

            
            {
                a = com.fitbit.ui.drawer.a.this;
                super(activity, drawerlayout, toolbar, k, l);
            }
        };
        f = actionbardrawertoggle;
        drawerlayout.setDrawerListener(actionbardrawertoggle);
    }

    protected final void a(int k)
    {
        b(k, true);
    }

    public final void a(int k, boolean flag)
    {
        ListAdapter listadapter = d.getAdapter();
        if (listadapter != null && k >= 0 && k < listadapter.getCount())
        {
            b(k, flag);
        }
    }

    public final void a(a a1)
    {
        g = a1;
    }

    public final void a(c c1)
    {
        d.setAdapter(c1);
    }

    public final ActionBarDrawerToggle b()
    {
        return f;
    }

    public final void c()
    {
        d.setItemChecked(h, true);
        h();
    }

    public final void d()
    {
        c c1 = (c)d.getAdapter();
        if (c1 != null)
        {
            c1.notifyDataSetChanged();
        }
    }

    public final boolean e()
    {
        return j == 1 || j == 2 || e.isDrawerOpen(d);
    }

    public final boolean f()
    {
        if (j == 1 || j == 2)
        {
            if (NavigationDrawerState.a() == com.fitbit.home.ui.NavigationDrawerState.State.d || NavigationDrawerState.a() == com.fitbit.home.ui.NavigationDrawerState.State.b)
            {
                e.openDrawer(d);
                return true;
            } else
            {
                e.closeDrawer(d);
                return true;
            }
        }
        if (e.isDrawerOpen(d))
        {
            e.closeDrawer(d);
            return true;
        } else
        {
            e.openDrawer(d);
            return true;
        }
    }
}
