// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.af;
import android.support.v4.view.ak;
import android.support.v4.view.x;
import android.support.v7.internal.view.menu.a;
import android.support.v7.internal.view.menu.f;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            g, p, o, ScrollingTabContainerView

public final class q
    implements g
{

    private Toolbar a;
    private int b;
    private View c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    private CharSequence i;
    private CharSequence j;
    private CharSequence k;
    private android.view.Window.Callback l;
    private boolean m;
    private ActionMenuPresenter n;
    private int o;
    private final o p;
    private int q;
    private Drawable r;

    public q(Toolbar toolbar, boolean flag)
    {
        this(toolbar, flag, android.support.v7.appcompat.a.i.abc_action_bar_up_description, android.support.v7.appcompat.a.e.abc_ic_ab_back_mtrl_am_alpha);
    }

    private q(Toolbar toolbar, boolean flag, int i1, int j1)
    {
        o = 0;
        q = 0;
        a = toolbar;
        i = toolbar.i();
        j = toolbar.j();
        boolean flag1;
        if (i != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        h = flag1;
        g = toolbar.l();
        if (flag)
        {
            toolbar = android.support.v7.internal.widget.p.a(toolbar.getContext(), null, android.support.v7.appcompat.a.k.ActionBar, android.support.v7.appcompat.a.a.actionBarStyle);
            Object obj = toolbar.c(android.support.v7.appcompat.a.k.ActionBar_title);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b(((CharSequence) (obj)));
            }
            obj = toolbar.c(android.support.v7.appcompat.a.k.ActionBar_subtitle);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                j = ((CharSequence) (obj));
                if ((b & 8) != 0)
                {
                    a.setSubtitle(((CharSequence) (obj)));
                }
            }
            obj = toolbar.a(android.support.v7.appcompat.a.k.ActionBar_logo);
            if (obj != null)
            {
                d(((Drawable) (obj)));
            }
            obj = toolbar.a(android.support.v7.appcompat.a.k.ActionBar_icon);
            if (g == null && obj != null)
            {
                a(((Drawable) (obj)));
            }
            obj = toolbar.a(android.support.v7.appcompat.a.k.ActionBar_homeAsUpIndicator);
            if (obj != null)
            {
                b(((Drawable) (obj)));
            }
            c(toolbar.a(android.support.v7.appcompat.a.k.ActionBar_displayOptions, 0));
            int k1 = toolbar.f(android.support.v7.appcompat.a.k.ActionBar_customNavigationLayout, 0);
            if (k1 != 0)
            {
                a(LayoutInflater.from(a.getContext()).inflate(k1, a, false));
                c(b | 0x10);
            }
            k1 = toolbar.e(android.support.v7.appcompat.a.k.ActionBar_height, 0);
            if (k1 > 0)
            {
                android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
                layoutparams.height = k1;
                a.setLayoutParams(layoutparams);
            }
            k1 = toolbar.c(android.support.v7.appcompat.a.k.ActionBar_contentInsetStart, -1);
            int i2 = toolbar.c(android.support.v7.appcompat.a.k.ActionBar_contentInsetEnd, -1);
            if (k1 >= 0 || i2 >= 0)
            {
                a.setContentInsetsRelative(Math.max(k1, 0), Math.max(i2, 0));
            }
            k1 = toolbar.f(android.support.v7.appcompat.a.k.ActionBar_titleTextStyle, 0);
            if (k1 != 0)
            {
                a.setTitleTextAppearance(a.getContext(), k1);
            }
            k1 = toolbar.f(android.support.v7.appcompat.a.k.ActionBar_subtitleTextStyle, 0);
            if (k1 != 0)
            {
                a.setSubtitleTextAppearance(a.getContext(), k1);
            }
            k1 = toolbar.f(android.support.v7.appcompat.a.k.ActionBar_popupTheme, 0);
            if (k1 != 0)
            {
                a.setPopupTheme(k1);
            }
            toolbar.b();
            p = toolbar.c();
        } else
        {
            int l1 = 11;
            if (a.l() != null)
            {
                l1 = 15;
            }
            b = l1;
            p = android.support.v7.internal.widget.o.a(toolbar.getContext());
        }
        if (i1 != q)
        {
            q = i1;
            if (TextUtils.isEmpty(a.k()))
            {
                e(q);
            }
        }
        k = a.k();
        toolbar = p.a(j1);
        if (r != toolbar)
        {
            r = toolbar;
            v();
        }
        a.setNavigationOnClickListener(new android.view.View.OnClickListener() {

            final a a;
            final q b;

            public final void onClick(View view)
            {
                if (q.c(b) != null && q.d(b))
                {
                    q.c(b).onMenuItemSelected(0, a);
                }
            }

            
            {
                b = q.this;
                super();
                a = new a(android.support.v7.internal.widget.q.a(b).getContext(), q.b(b));
            }
        });
    }

    static Toolbar a(q q1)
    {
        return q1.a;
    }

    static CharSequence b(q q1)
    {
        return q1.i;
    }

    static android.view.Window.Callback c(q q1)
    {
        return q1.l;
    }

    private void c(CharSequence charsequence)
    {
        i = charsequence;
        if ((b & 8) != 0)
        {
            a.setTitle(charsequence);
        }
    }

    private void d(Drawable drawable)
    {
        f = drawable;
        t();
    }

    static boolean d(q q1)
    {
        return q1.m;
    }

    private void t()
    {
        Drawable drawable = null;
        if ((b & 2) != 0)
        {
            if ((b & 1) != 0)
            {
                if (f != null)
                {
                    drawable = f;
                } else
                {
                    drawable = e;
                }
            } else
            {
                drawable = e;
            }
        }
        a.setLogo(drawable);
    }

    private void u()
    {
label0:
        {
            if ((b & 4) != 0)
            {
                if (!TextUtils.isEmpty(k))
                {
                    break label0;
                }
                a.setNavigationContentDescription(q);
            }
            return;
        }
        a.setNavigationContentDescription(k);
    }

    private void v()
    {
        if ((b & 4) != 0)
        {
            Toolbar toolbar = a;
            Drawable drawable;
            if (g != null)
            {
                drawable = g;
            } else
            {
                drawable = r;
            }
            toolbar.setNavigationIcon(drawable);
        }
    }

    public final af a(int i1, long l1)
    {
        if (i1 == 8)
        {
            af af1 = x.s(a).a(0.0F);
            af1.a(l1);
            af1.a(new ak() {

                final q a;
                private boolean b;

                public final void b(View view)
                {
                    if (!b)
                    {
                        android.support.v7.internal.widget.q.a(a).setVisibility(8);
                    }
                }

                public final void c(View view)
                {
                    b = true;
                }

            
            {
                a = q.this;
                super();
                b = false;
            }
            });
            return af1;
        }
        if (i1 == 0)
        {
            af af2 = x.s(a).a(1.0F);
            af2.a(l1);
            af2.a(new ak() {

                final q a;

                public final void a(View view)
                {
                    android.support.v7.internal.widget.q.a(a).setVisibility(0);
                }

            
            {
                a = q.this;
                super();
            }
            });
            return af2;
        } else
        {
            return null;
        }
    }

    public final ViewGroup a()
    {
        return a;
    }

    public final void a(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = p.a(i1);
        } else
        {
            drawable = null;
        }
        a(drawable);
    }

    public final void a(Drawable drawable)
    {
        e = drawable;
        t();
    }

    public final void a(android.support.v7.internal.view.menu.l.a a1, android.support.v7.internal.view.menu.f.a a2)
    {
        a.setMenuCallbacks(a1, a2);
    }

    public final void a(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (c != null && c.getParent() == a)
        {
            a.removeView(c);
        }
        c = scrollingtabcontainerview;
        if (scrollingtabcontainerview != null && o == 2)
        {
            a.addView(c, 0);
            android.support.v7.widget.Toolbar.b b1 = (android.support.v7.widget.Toolbar.b)c.getLayoutParams();
            b1.width = -2;
            b1.height = -2;
            b1.a = 0x800053;
            scrollingtabcontainerview.setAllowCollapse(true);
        }
    }

    public final void a(Menu menu, android.support.v7.internal.view.menu.l.a a1)
    {
        if (n == null)
        {
            n = new ActionMenuPresenter(a.getContext());
            n.a(android.support.v7.appcompat.a.f.action_menu_presenter);
        }
        n.a(a1);
        a.setMenu((f)menu, n);
    }

    public final void a(View view)
    {
        if (d != null && (b & 0x10) != 0)
        {
            a.removeView(d);
        }
        d = view;
        if (view != null && (b & 0x10) != 0)
        {
            a.addView(d);
        }
    }

    public final void a(android.view.Window.Callback callback)
    {
        l = callback;
    }

    public final void a(CharSequence charsequence)
    {
        if (!h)
        {
            c(charsequence);
        }
    }

    public final void a(boolean flag)
    {
        a.setCollapsible(flag);
    }

    public final Context b()
    {
        return a.getContext();
    }

    public final void b(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = p.a(i1);
        } else
        {
            drawable = null;
        }
        d(drawable);
    }

    public final void b(Drawable drawable)
    {
        g = drawable;
        v();
    }

    public final void b(CharSequence charsequence)
    {
        h = true;
        c(charsequence);
    }

    public final void c(int i1)
    {
label0:
        {
            int j1 = b ^ i1;
            b = i1;
            if (j1 != 0)
            {
                if ((j1 & 4) != 0)
                {
                    if ((i1 & 4) != 0)
                    {
                        v();
                        u();
                    } else
                    {
                        a.setNavigationIcon(null);
                    }
                }
                if ((j1 & 3) != 0)
                {
                    t();
                }
                if ((j1 & 8) != 0)
                {
                    if ((i1 & 8) != 0)
                    {
                        a.setTitle(i);
                        a.setSubtitle(j);
                    } else
                    {
                        a.setTitle(null);
                        a.setSubtitle(null);
                    }
                }
                if ((j1 & 0x10) != 0 && d != null)
                {
                    if ((i1 & 0x10) == 0)
                    {
                        break label0;
                    }
                    a.addView(d);
                }
            }
            return;
        }
        a.removeView(d);
    }

    public final void c(Drawable drawable)
    {
        a.setBackgroundDrawable(drawable);
    }

    public final boolean c()
    {
        return a.g();
    }

    public final void d()
    {
        a.h();
    }

    public final void d(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = p.a(i1);
        } else
        {
            drawable = null;
        }
        b(drawable);
    }

    public final void e()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void e(int i1)
    {
        Object obj;
        if (i1 == 0)
        {
            obj = null;
        } else
        {
            obj = a.getContext().getString(i1);
        }
        k = ((CharSequence) (obj));
        u();
    }

    public final void f()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void f(int i1)
    {
        a.setVisibility(i1);
    }

    public final boolean g()
    {
        return a.a();
    }

    public final boolean h()
    {
        return a.b();
    }

    public final boolean i()
    {
        return a.c();
    }

    public final boolean j()
    {
        return a.d();
    }

    public final boolean k()
    {
        return a.e();
    }

    public final void l()
    {
        m = true;
    }

    public final void m()
    {
        a.f();
    }

    public final int n()
    {
        return b;
    }

    public final int o()
    {
        return o;
    }

    public final View p()
    {
        return d;
    }

    public final int q()
    {
        return a.getHeight();
    }

    public final int r()
    {
        return a.getVisibility();
    }

    public final Menu s()
    {
        return a.m();
    }
}
