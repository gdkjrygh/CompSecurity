// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.n;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarView;
import android.support.v7.internal.widget.ProgressBarICS;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import p.h.a;

// Referenced classes of package android.support.v7.app:
//            a, ActionBarActivity, h, ActionBar

class c extends android.support.v7.app.a
    implements android.support.v7.internal.view.menu.f.a, android.support.v7.internal.view.menu.l.a
{

    private static final int d[];
    private ActionBarView e;
    private e f;
    private f g;
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

    private m a(Context context, android.support.v7.internal.view.menu.l.a a1)
    {
        if (g == null)
        {
            return null;
        }
        if (f == null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
            int i1 = typedarray.getResourceId(4, android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu);
            typedarray.recycle();
            f = new e(android.support.v7.appcompat.R.layout.abc_list_menu_item_layout, i1);
            f.a(a1);
            g.a(f);
        } else
        {
            f.c(false);
        }
        return f.a(new FrameLayout(context));
    }

    private void a(ProgressBarICS progressbarics, ProgressBarICS progressbarics1)
    {
        if (l && progressbarics1.getVisibility() == 4)
        {
            progressbarics1.setVisibility(0);
        }
        if (k && progressbarics.getProgress() < 10000)
        {
            progressbarics.setVisibility(0);
        }
    }

    private void b(f f1, boolean flag)
    {
        if (e != null && e.e())
        {
            if (!e.d() || !flag)
            {
                if (e.getVisibility() == 0)
                {
                    e.a();
                }
                return;
            } else
            {
                e.c();
                return;
            }
        } else
        {
            f1.close();
            return;
        }
    }

    private void b(ProgressBarICS progressbarics, ProgressBarICS progressbarics1)
    {
        if (l && progressbarics1.getVisibility() == 0)
        {
            progressbarics1.setVisibility(4);
        }
        if (k && progressbarics.getVisibility() == 0)
        {
            progressbarics.setVisibility(4);
        }
    }

    private void c(int i1)
    {
        ProgressBarICS progressbarics;
        ProgressBarICS progressbarics1;
        progressbarics = m();
        progressbarics1 = n();
        if (i1 != -1) goto _L2; else goto _L1
_L1:
        if (k)
        {
            i1 = progressbarics1.getProgress();
            if (progressbarics1.a() || i1 < 10000)
            {
                i1 = 0;
            } else
            {
                i1 = 4;
            }
            progressbarics1.setVisibility(i1);
        }
        if (l)
        {
            progressbarics.setVisibility(0);
        }
_L4:
        return;
_L2:
        if (i1 != -2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k)
        {
            progressbarics1.setVisibility(8);
        }
        if (l)
        {
            progressbarics.setVisibility(8);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i1 == -3)
        {
            progressbarics1.setIndeterminate(true);
            return;
        }
        if (i1 == -4)
        {
            progressbarics1.setIndeterminate(false);
            return;
        }
        if (i1 >= 0 && i1 <= 10000)
        {
            progressbarics1.setProgress(i1 + 0);
            if (i1 < 10000)
            {
                a(progressbarics1, progressbarics);
                return;
            } else
            {
                b(progressbarics1, progressbarics);
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private void l()
    {
        TypedValue typedvalue3 = null;
        DisplayMetrics displaymetrics = null;
        TypedArray typedarray = a.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.ActionBarWindow);
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

    private ProgressBarICS m()
    {
        ProgressBarICS progressbarics = (ProgressBarICS)e.findViewById(android.support.v7.appcompat.R.id.progress_circular);
        if (progressbarics != null)
        {
            progressbarics.setVisibility(4);
        }
        return progressbarics;
    }

    private ProgressBarICS n()
    {
        ProgressBarICS progressbarics = (ProgressBarICS)e.findViewById(android.support.v7.appcompat.R.id.progress_horizontal);
        if (progressbarics != null)
        {
            progressbarics.setVisibility(4);
        }
        return progressbarics;
    }

    private boolean o()
    {
        g = new f(j());
        g.a(this);
        return true;
    }

    private boolean p()
    {
        if (n)
        {
            return true;
        }
        if (g == null || o)
        {
            if (g == null && (!o() || g == null))
            {
                return false;
            }
            if (e != null)
            {
                e.a(g, this);
            }
            g.g();
            if (!a.a(0, g))
            {
                g = null;
                if (e != null)
                {
                    e.a(null, this);
                }
                return false;
            }
            o = false;
        }
        g.g();
        if (p != null)
        {
            g.b(p);
            p = null;
        }
        if (!a.a(0, null, g))
        {
            if (e != null)
            {
                e.a(null, this);
            }
            g.h();
            return false;
        } else
        {
            g.h();
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
        a.j();
    }

    public void a(Configuration configuration)
    {
        if (b && i)
        {
            ((h)b()).a(configuration);
        }
    }

    public void a(f f1)
    {
        b(f1, true);
    }

    public void a(f f1, boolean flag)
    {
        if (m)
        {
            return;
        } else
        {
            m = true;
            a.closeOptionsMenu();
            e.f();
            m = false;
            return;
        }
    }

    public void a(View view)
    {
        k();
        ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        a.j();
    }

    public void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        k();
        ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        a.j();
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

    void a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = -1;
        } else
        {
            byte0 = -2;
        }
        c(byte0);
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
            menuitem1 = android.support.v7.internal.view.menu.n.a(menuitem);
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

    public boolean a(f f1, MenuItem menuitem)
    {
        return a.onMenuItemSelected(0, menuitem);
    }

    public View b(int i1)
    {
        Object obj = null;
        View view = obj;
        if (i1 == 0)
        {
            view = obj;
            if (p())
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
        a.j();
    }

    public boolean b(f f1)
    {
        return false;
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
            g.a(bundle);
            if (bundle.size() > 0)
            {
                p = bundle;
            }
            g.g();
            g.clear();
        }
        o = true;
        if (e != null)
        {
            n = false;
            p();
        }
    }

    public boolean g()
    {
        if (h != null)
        {
            h.a();
            return true;
        }
        if (e != null && e.j())
        {
            e.k();
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
                    a.a(android.support.v7.appcompat.R.layout.abc_action_bar_decor_overlay);
                } else
                {
                    a.a(android.support.v7.appcompat.R.layout.abc_action_bar_decor);
                }
                e = (ActionBarView)a.findViewById(android.support.v7.appcompat.R.id.action_bar);
                e.setWindowCallback(a);
                if (k)
                {
                    e.g();
                }
                if (l)
                {
                    e.h();
                }
                flag1 = "splitActionBarWhenNarrow".equals(i());
                if (flag1)
                {
                    flag = a.getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_split_action_bar_is_narrow);
                } else
                {
                    TypedArray typedarray = a.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.ActionBarWindow);
                    flag = typedarray.getBoolean(2, false);
                    typedarray.recycle();
                }
                actionbarcontainer = (ActionBarContainer)a.findViewById(android.support.v7.appcompat.R.id.split_action_bar);
                if (actionbarcontainer != null)
                {
                    e.setSplitView(actionbarcontainer);
                    e.setSplitActionBar(flag);
                    e.setSplitWhenNarrow(flag1);
                    ActionBarContextView actionbarcontextview = (ActionBarContextView)a.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
                    actionbarcontextview.setSplitView(actionbarcontainer);
                    actionbarcontextview.setSplitActionBar(flag);
                    actionbarcontextview.setSplitWhenNarrow(flag1);
                }
            } else
            {
                a.a(android.support.v7.appcompat.R.layout.abc_simple_decor);
            }
            a.findViewById(0x1020002).setId(-1);
            a.findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content).setId(0x1020002);
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

    static 
    {
        d = (new int[] {
            android.support.v7.appcompat.R.attr.homeAsUpIndicator
        });
    }
}
