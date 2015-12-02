// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.internal.view.ActionBarPolicy;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ActionBarView;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            ActionBar, ActionBarActivity

class h extends ActionBar
{

    final Handler a = new Handler();
    private Context b;
    private Context c;
    private ActionBarActivity d;
    private ActionBarOverlayLayout e;
    private ActionBarContainer f;
    private ViewGroup g;
    private ActionBarView h;
    private ActionBarContextView i;
    private ActionBarContainer j;
    private ScrollingTabContainerView k;
    private ArrayList l;
    private int m;
    private boolean n;
    private ArrayList o;
    private int p;
    private boolean q;
    private int r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private ActionBar.a x;

    public h(ActionBarActivity actionbaractivity, ActionBar.a a1)
    {
        l = new ArrayList();
        m = -1;
        o = new ArrayList();
        r = 0;
        v = true;
        d = actionbaractivity;
        b = actionbaractivity;
        x = a1;
        a(d);
    }

    private void a(ActionBarActivity actionbaractivity)
    {
        boolean flag = false;
        e = (ActionBarOverlayLayout)actionbaractivity.findViewById(android.support.v7.a.a.e.action_bar_overlay_layout);
        if (e != null)
        {
            e.setActionBar(this);
        }
        h = (ActionBarView)actionbaractivity.findViewById(android.support.v7.a.a.e.action_bar);
        i = (ActionBarContextView)actionbaractivity.findViewById(android.support.v7.a.a.e.action_context_bar);
        f = (ActionBarContainer)actionbaractivity.findViewById(android.support.v7.a.a.e.action_bar_container);
        g = (ViewGroup)actionbaractivity.findViewById(android.support.v7.a.a.e.top_action_bar);
        if (g == null)
        {
            g = f;
        }
        j = (ActionBarContainer)actionbaractivity.findViewById(android.support.v7.a.a.e.split_action_bar);
        if (h == null || i == null || f == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with a compatible window decor layout").toString());
        }
        h.setContextView(i);
        int i1;
        if (h.isSplitActionBar())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        p = i1;
        if ((h.getDisplayOptions() & 4) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            n = true;
        }
        actionbaractivity = ActionBarPolicy.get(b);
        if (actionbaractivity.enableHomeButtonByDefault() || i1 != 0)
        {
            flag = true;
        }
        f(flag);
        j(actionbaractivity.hasEmbeddedTabs());
        a(d.getTitle());
    }

    private static boolean a(boolean flag, boolean flag1, boolean flag2)
    {
        while (flag2 || !flag && !flag1) 
        {
            return true;
        }
        return false;
    }

    private void j(boolean flag)
    {
        boolean flag2 = true;
        q = flag;
        ActionBarView actionbarview;
        boolean flag1;
        if (!q)
        {
            h.setEmbeddedTabView(null);
            f.setTabContainer(k);
        } else
        {
            f.setTabContainer(null);
            h.setEmbeddedTabView(k);
        }
        if (e() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (k != null)
        {
            if (flag1)
            {
                k.setVisibility(0);
            } else
            {
                k.setVisibility(8);
            }
        }
        actionbarview = h;
        if (!q && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        actionbarview.setCollapsable(flag);
    }

    private void k(boolean flag)
    {
        if (a(s, t, u))
        {
            if (!v)
            {
                v = true;
                h(flag);
            }
        } else
        if (v)
        {
            v = false;
            i(flag);
            return;
        }
    }

    public View a()
    {
        return h.getCustomNavigationView();
    }

    public void a(int i1)
    {
        a(LayoutInflater.from(d()).inflate(i1, h, false));
    }

    public void a(int i1, int j1)
    {
        int k1 = h.getDisplayOptions();
        if ((j1 & 4) != 0)
        {
            n = true;
        }
        h.setDisplayOptions(k1 & ~j1 | i1 & j1);
    }

    public void a(Configuration configuration)
    {
        j(ActionBarPolicy.get(b).hasEmbeddedTabs());
    }

    public void a(Drawable drawable)
    {
        f.setPrimaryBackground(drawable);
    }

    public void a(View view)
    {
        h.setCustomNavigationView(view);
    }

    public void a(View view, ActionBar.LayoutParams layoutparams)
    {
        view.setLayoutParams(layoutparams);
        h.setCustomNavigationView(view);
    }

    public void a(CharSequence charsequence)
    {
        h.setTitle(charsequence);
    }

    public void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        a(i1, 1);
    }

    public CharSequence b()
    {
        return h.getTitle();
    }

    public void b(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 2);
    }

    public int c()
    {
        return h.getDisplayOptions();
    }

    public void c(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 4);
    }

    public Context d()
    {
        if (c == null)
        {
            TypedValue typedvalue = new TypedValue();
            b.getTheme().resolveAttribute(android.support.v7.a.a.b.actionBarWidgetTheme, typedvalue, true);
            int i1 = typedvalue.resourceId;
            if (i1 != 0)
            {
                c = new ContextThemeWrapper(b, i1);
            } else
            {
                c = b;
            }
        }
        return c;
    }

    public void d(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 8);
    }

    public int e()
    {
        return h.getNavigationMode();
    }

    public void e(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 16);
    }

    void f()
    {
        if (!u)
        {
            u = true;
            k(false);
        }
    }

    public void f(boolean flag)
    {
        h.setHomeButtonEnabled(flag);
    }

    void g()
    {
        if (u)
        {
            u = false;
            k(false);
        }
    }

    public void g(boolean flag)
    {
        w = flag;
        if (!flag)
        {
            g.clearAnimation();
            if (j != null)
            {
                j.clearAnimation();
            }
        }
    }

    public void h(boolean flag)
    {
        g.clearAnimation();
        if (g.getVisibility() != 0)
        {
            boolean flag1;
            if (h() || flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                android.view.animation.Animation animation = AnimationUtils.loadAnimation(b, android.support.v7.a.a.a.abc_slide_in_top);
                g.startAnimation(animation);
            }
            g.setVisibility(0);
            if (j != null && j.getVisibility() != 0)
            {
                if (flag1)
                {
                    android.view.animation.Animation animation1 = AnimationUtils.loadAnimation(b, android.support.v7.a.a.a.abc_slide_in_bottom);
                    j.startAnimation(animation1);
                }
                j.setVisibility(0);
                return;
            }
        }
    }

    boolean h()
    {
        return w;
    }

    public void i(boolean flag)
    {
        g.clearAnimation();
        if (g.getVisibility() != 8)
        {
            boolean flag1;
            if (h() || flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                android.view.animation.Animation animation = AnimationUtils.loadAnimation(b, android.support.v7.a.a.a.abc_slide_out_top);
                g.startAnimation(animation);
            }
            g.setVisibility(8);
            if (j != null && j.getVisibility() != 8)
            {
                if (flag1)
                {
                    android.view.animation.Animation animation1 = AnimationUtils.loadAnimation(b, android.support.v7.a.a.a.abc_slide_out_bottom);
                    j.startAnimation(animation1);
                }
                j.setVisibility(8);
                return;
            }
        }
    }
}
