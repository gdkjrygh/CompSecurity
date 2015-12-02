// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.menu.MenuWrapperFactory;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.app:
//            a, ActionBarActivity, h, ActionBar

class c extends android.support.v7.app.a
    implements android.support.v7.internal.view.menu.MenuBuilder.Callback, android.support.v7.internal.view.menu.MenuPresenter.Callback
{

    private static final int d[];
    private ActionBarView e;
    private ListMenuPresenter f;
    private MenuBuilder g;
    private a h;
    private boolean i;
    private CharSequence j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private Bundle p;

    c(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    private MenuView a(Context context, android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
    {
        if (g == null)
        {
            return null;
        }
        if (f == null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(android.support.v7.a.a.j.Theme);
            int i1 = typedarray.getResourceId(4, android.support.v7.a.a.i.Theme_AppCompat_CompactMenu);
            typedarray.recycle();
            f = new ListMenuPresenter(android.support.v7.a.a.g.abc_list_menu_item_layout, i1);
            f.setCallback(callback);
            g.addMenuPresenter(f);
        } else
        {
            f.updateMenuView(false);
        }
        return f.getMenuView(new FrameLayout(context));
    }

    private void a(MenuBuilder menubuilder, boolean flag)
    {
        if (e != null && e.isOverflowReserved())
        {
            if (!e.isOverflowMenuShowing() || !flag)
            {
                if (e.getVisibility() == 0)
                {
                    e.showOverflowMenu();
                }
                return;
            } else
            {
                e.hideOverflowMenu();
                return;
            }
        } else
        {
            menubuilder.close();
            return;
        }
    }

    private void l()
    {
        TypedValue typedvalue3 = null;
        DisplayMetrics displaymetrics = null;
        TypedArray typedarray = a.obtainStyledAttributes(android.support.v7.a.a.j.ActionBarWindow);
        TypedValue typedvalue;
        if (typedarray.hasValue(3))
        {
            TypedValue typedvalue1;
            TypedValue typedvalue2;
            int i1;
            int j1;
            if (true)
            {
                typedvalue = new TypedValue();
            } else
            {
                typedvalue = null;
            }
            typedarray.getValue(3, typedvalue);
        } else
        {
            typedvalue = null;
        }
        if (typedarray.hasValue(5))
        {
            if (true)
            {
                typedvalue1 = new TypedValue();
            } else
            {
                typedvalue1 = null;
            }
            typedarray.getValue(5, typedvalue1);
        } else
        {
            typedvalue1 = null;
        }
        if (typedarray.hasValue(6))
        {
            if (true)
            {
                typedvalue2 = new TypedValue();
            } else
            {
                typedvalue2 = null;
            }
            typedarray.getValue(6, typedvalue2);
        } else
        {
            typedvalue2 = null;
        }
        if (typedarray.hasValue(4))
        {
            typedvalue3 = displaymetrics;
            if (true)
            {
                typedvalue3 = new TypedValue();
            }
            typedarray.getValue(4, typedvalue3);
        }
        displaymetrics = a.getResources().getDisplayMetrics();
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0)
        {
            typedvalue1 = typedvalue;
        }
        if (typedvalue1 == null || typedvalue1.type == 0) goto _L2; else goto _L1
_L1:
        if (typedvalue1.type != 5) goto _L4; else goto _L3
_L3:
        i1 = (int)typedvalue1.getDimension(displaymetrics);
_L11:
        if (j1 == 0)
        {
            typedvalue2 = typedvalue3;
        }
        if (typedvalue2 == null || typedvalue2.type == 0) goto _L6; else goto _L5
_L5:
        if (typedvalue2.type != 5) goto _L8; else goto _L7
_L7:
        j1 = (int)typedvalue2.getDimension(displaymetrics);
_L9:
        if (i1 != -1 || j1 != -1)
        {
            a.getWindow().setLayout(i1, j1);
        }
        typedarray.recycle();
        return;
_L4:
        if (typedvalue1.type != 6)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = (int)typedvalue1.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
        continue; /* Loop/switch isn't completed */
_L8:
        if (typedvalue2.type == 6)
        {
            j1 = (int)typedvalue2.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
            continue; /* Loop/switch isn't completed */
        }
_L6:
        j1 = -1;
        if (true) goto _L9; else goto _L2
_L2:
        i1 = -1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private boolean m()
    {
        g = new MenuBuilder(j());
        g.setCallback(this);
        return true;
    }

    private boolean n()
    {
        if (n)
        {
            return true;
        }
        if (g == null || o)
        {
            if (g == null && (!m() || g == null))
            {
                return false;
            }
            if (e != null)
            {
                e.setMenu(g, this);
            }
            g.stopDispatchingItemsChanged();
            if (!a.a(0, g))
            {
                g = null;
                if (e != null)
                {
                    e.setMenu(null, this);
                }
                return false;
            }
            o = false;
        }
        g.stopDispatchingItemsChanged();
        if (p != null)
        {
            g.restoreActionViewStates(p);
            p = null;
        }
        if (!a.a(0, null, g))
        {
            if (e != null)
            {
                e.setMenu(null, this);
            }
            g.startDispatchingItemsChanged();
            return false;
        } else
        {
            g.startDispatchingItemsChanged();
            n = true;
            return true;
        }
    }

    public ActionBar a()
    {
        k();
        return new h(a, a);
    }

    public void a(int i1)
    {
        k();
        ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
        viewgroup.removeAllViews();
        a.getLayoutInflater().inflate(i1, viewgroup);
        a.h();
    }

    public void a(Configuration configuration)
    {
        if (b && i)
        {
            ((h)b()).a(configuration);
        }
    }

    public void a(View view)
    {
        k();
        ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        a.h();
    }

    public void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        k();
        ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        a.h();
    }

    public void a(CharSequence charsequence)
    {
        if (e != null)
        {
            e.setWindowTitle(charsequence);
            return;
        } else
        {
            j = charsequence;
            return;
        }
    }

    public boolean a(int i1, Menu menu)
    {
        if (i1 != 0)
        {
            return a.a(i1, menu);
        } else
        {
            return false;
        }
    }

    public boolean a(int i1, MenuItem menuitem)
    {
        MenuItem menuitem1 = menuitem;
        if (i1 == 0)
        {
            menuitem1 = MenuWrapperFactory.createMenuItemWrapper(menuitem);
        }
        return a.a(i1, menuitem1);
    }

    public boolean a(int i1, View view, Menu menu)
    {
        if (i1 != 0)
        {
            return a.a(i1, view, menu);
        } else
        {
            return false;
        }
    }

    public View b(int i1)
    {
        Object obj = null;
        View view = obj;
        if (i1 == 0)
        {
            view = obj;
            if (n())
            {
                view = (View)a(a, this);
            }
        }
        return view;
    }

    public void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        k();
        ((ViewGroup)a.findViewById(0x1020002)).addView(view, layoutparams);
        a.h();
    }

    public void d()
    {
        h h1 = (h)b();
        if (h1 != null)
        {
            h1.g(false);
        }
    }

    public void e()
    {
        h h1 = (h)b();
        if (h1 != null)
        {
            h1.g(true);
        }
    }

    public void f()
    {
        if (g != null)
        {
            Bundle bundle = new Bundle();
            g.saveActionViewStates(bundle);
            if (bundle.size() > 0)
            {
                p = bundle;
            }
            g.stopDispatchingItemsChanged();
            g.clear();
        }
        o = true;
        if (e != null)
        {
            n = false;
            n();
        }
    }

    public boolean g()
    {
        if (h != null)
        {
            h.finish();
            return true;
        }
        if (e != null && e.hasExpandedActionView())
        {
            e.collapseActionView();
            return true;
        } else
        {
            return false;
        }
    }

    public void h()
    {
    }

    final void k()
    {
        if (!i)
        {
            if (b)
            {
                ActionBarContainer actionbarcontainer;
                boolean flag;
                boolean flag1;
                if (c)
                {
                    a.a_(android.support.v7.a.a.g.abc_action_bar_decor_overlay);
                } else
                {
                    a.a_(android.support.v7.a.a.g.abc_action_bar_decor);
                }
                e = (ActionBarView)a.findViewById(android.support.v7.a.a.e.action_bar);
                e.setWindowCallback(a);
                if (k)
                {
                    e.initProgress();
                }
                if (l)
                {
                    e.initIndeterminateProgress();
                }
                flag1 = "splitActionBarWhenNarrow".equals(i());
                if (flag1)
                {
                    flag = a.getResources().getBoolean(android.support.v7.a.a.c.abc_split_action_bar_is_narrow);
                } else
                {
                    TypedArray typedarray = a.obtainStyledAttributes(android.support.v7.a.a.j.ActionBarWindow);
                    flag = typedarray.getBoolean(2, false);
                    typedarray.recycle();
                }
                actionbarcontainer = (ActionBarContainer)a.findViewById(android.support.v7.a.a.e.split_action_bar);
                if (actionbarcontainer != null)
                {
                    e.setSplitView(actionbarcontainer);
                    e.setSplitActionBar(flag);
                    e.setSplitWhenNarrow(flag1);
                    ActionBarContextView actionbarcontextview = (ActionBarContextView)a.findViewById(android.support.v7.a.a.e.action_context_bar);
                    actionbarcontextview.setSplitView(actionbarcontainer);
                    actionbarcontextview.setSplitActionBar(flag);
                    actionbarcontextview.setSplitWhenNarrow(flag1);
                }
            } else
            {
                a.a_(android.support.v7.a.a.g.abc_simple_decor);
            }
            a.findViewById(0x1020002).setId(-1);
            a.findViewById(android.support.v7.a.a.e.action_bar_activity_content).setId(0x1020002);
            if (j != null)
            {
                e.setWindowTitle(j);
                j = null;
            }
            l();
            i = true;
            a.getWindow().getDecorView().post(new Runnable() {

                final c a;

                public void run()
                {
                    a.f();
                }

            
            {
                a = c.this;
                super();
            }
            });
        }
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (m)
        {
            return;
        } else
        {
            m = true;
            a.closeOptionsMenu();
            e.dismissPopupMenus();
            m = false;
            return;
        }
    }

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return a.onMenuItemSelected(0, menuitem);
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
        a(menubuilder, true);
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        return false;
    }

    static 
    {
        d = (new int[] {
            android.support.v7.a.a.b.homeAsUpIndicator
        });
    }
}
