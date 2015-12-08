// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v7.a.b;
import android.support.v7.a.f;
import android.support.v7.a.g;
import android.support.v7.a.j;
import android.support.v7.a.l;
import android.support.v7.internal.view.menu.d;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.w;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bf;
import android.support.v7.widget.bg;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            y, an, al, ap, 
//            aq, ar, ScrollingTabContainerView

public final class ao
    implements y
{

    Toolbar a;
    CharSequence b;
    android.view.Window.Callback c;
    boolean d;
    private int e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private ActionMenuPresenter n;
    private int o;
    private final al p;
    private int q;
    private Drawable r;

    public ao(Toolbar toolbar)
    {
        this(toolbar, j.abc_action_bar_up_description, f.abc_ic_ab_back_mtrl_am_alpha);
    }

    private ao(Toolbar toolbar, int i1, int j1)
    {
        o = 0;
        q = 0;
        a = toolbar;
        b = toolbar.getTitle();
        l = toolbar.getSubtitle();
        Object obj;
        int k1;
        int l1;
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        j = toolbar.getNavigationIcon();
        toolbar = an.a(toolbar.getContext(), null, l.ActionBar, b.actionBarStyle);
        obj = toolbar.c(l.ActionBar_title);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            k = true;
            b(((CharSequence) (obj)));
        }
        obj = toolbar.c(l.ActionBar_subtitle);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            l = ((CharSequence) (obj));
            if ((e & 8) != 0)
            {
                a.setSubtitle(((CharSequence) (obj)));
            }
        }
        obj = toolbar.a(l.ActionBar_logo);
        if (obj != null)
        {
            b(((Drawable) (obj)));
        }
        obj = toolbar.a(l.ActionBar_icon);
        if (j == null && obj != null)
        {
            a(((Drawable) (obj)));
        }
        obj = toolbar.a(l.ActionBar_homeAsUpIndicator);
        if (obj != null)
        {
            j = ((Drawable) (obj));
            r();
        }
        c(toolbar.a(l.ActionBar_displayOptions, 0));
        k1 = toolbar.e(l.ActionBar_customNavigationLayout, 0);
        if (k1 != 0)
        {
            View view = LayoutInflater.from(a.getContext()).inflate(k1, a, false);
            if (g != null && (e & 0x10) != 0)
            {
                a.removeView(g);
            }
            g = view;
            if (view != null && (e & 0x10) != 0)
            {
                a.addView(g);
            }
            c(e | 0x10);
        }
        k1 = toolbar.d(l.ActionBar_height, 0);
        if (k1 > 0)
        {
            android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
            layoutparams.height = k1;
            a.setLayoutParams(layoutparams);
        }
        k1 = toolbar.b(l.ActionBar_contentInsetStart, -1);
        l1 = toolbar.b(l.ActionBar_contentInsetEnd, -1);
        if (k1 >= 0 || l1 >= 0)
        {
            a.setContentInsetsRelative(Math.max(k1, 0), Math.max(l1, 0));
        }
        k1 = toolbar.e(l.ActionBar_titleTextStyle, 0);
        if (k1 != 0)
        {
            a.setTitleTextAppearance(a.getContext(), k1);
        }
        k1 = toolbar.e(l.ActionBar_subtitleTextStyle, 0);
        if (k1 != 0)
        {
            a.setSubtitleTextAppearance(a.getContext(), k1);
        }
        k1 = toolbar.e(l.ActionBar_popupTheme, 0);
        if (k1 != 0)
        {
            a.setPopupTheme(k1);
        }
        ((an) (toolbar)).a.recycle();
        p = toolbar.a();
        if (i1 != q)
        {
            q = i1;
            if (TextUtils.isEmpty(a.getNavigationContentDescription()))
            {
                i1 = q;
                if (i1 == 0)
                {
                    toolbar = null;
                } else
                {
                    toolbar = a.getContext().getString(i1);
                }
                m = toolbar;
                q();
            }
        }
        m = a.getNavigationContentDescription();
        toolbar = p.a(j1, false);
        if (r != toolbar)
        {
            r = toolbar;
            r();
        }
        a.setNavigationOnClickListener(new ap(this));
    }

    private void b(Drawable drawable)
    {
        i = drawable;
        p();
    }

    private void b(CharSequence charsequence)
    {
        b = charsequence;
        if ((e & 8) != 0)
        {
            a.setTitle(charsequence);
        }
    }

    private void p()
    {
        Drawable drawable = null;
        if ((e & 2) != 0)
        {
            if ((e & 1) != 0)
            {
                if (i != null)
                {
                    drawable = i;
                } else
                {
                    drawable = h;
                }
            } else
            {
                drawable = h;
            }
        }
        a.setLogo(drawable);
    }

    private void q()
    {
label0:
        {
            if ((e & 4) != 0)
            {
                if (!TextUtils.isEmpty(m))
                {
                    break label0;
                }
                a.setNavigationContentDescription(q);
            }
            return;
        }
        a.setNavigationContentDescription(m);
    }

    private void r()
    {
        if ((e & 4) != 0)
        {
            Toolbar toolbar = a;
            Drawable drawable;
            if (j != null)
            {
                drawable = j;
            } else
            {
                drawable = r;
            }
            toolbar.setNavigationIcon(drawable);
        }
    }

    public final dq a(int i1, long l1)
    {
        if (i1 == 8)
        {
            dq dq1 = bt.l(a).a(0.0F);
            dq1.a(l1);
            dq1.a(new aq(this));
            return dq1;
        }
        if (i1 == 0)
        {
            dq dq2 = bt.l(a).a(1.0F);
            dq2.a(l1);
            dq2.a(new ar(this));
            return dq2;
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
            drawable = p.a(i1, false);
        } else
        {
            drawable = null;
        }
        a(drawable);
    }

    public final void a(Drawable drawable)
    {
        h = drawable;
        p();
    }

    public final void a(w w, android.support.v7.internal.view.menu.j j1)
    {
        a.setMenuCallbacks(w, j1);
    }

    public final void a(ScrollingTabContainerView scrollingtabcontainerview)
    {
        if (f != null && f.getParent() == a)
        {
            a.removeView(f);
        }
        f = scrollingtabcontainerview;
        if (scrollingtabcontainerview != null && o == 2)
        {
            a.addView(f, 0);
            bg bg1 = (bg)f.getLayoutParams();
            bg1.width = -2;
            bg1.height = -2;
            bg1.a = 0x800053;
            scrollingtabcontainerview.setAllowCollapse(true);
        }
    }

    public final void a(Menu menu, w w)
    {
        if (n == null)
        {
            n = new ActionMenuPresenter(a.getContext());
            n.h = g.action_menu_presenter;
        }
        n.f = w;
        a.setMenu((i)menu, n);
    }

    public final void a(android.view.Window.Callback callback)
    {
        c = callback;
    }

    public final void a(CharSequence charsequence)
    {
        if (!k)
        {
            b(charsequence);
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
            drawable = p.a(i1, false);
        } else
        {
            drawable = null;
        }
        b(drawable);
    }

    public final void c(int i1)
    {
label0:
        {
            int j1 = e ^ i1;
            e = i1;
            if (j1 != 0)
            {
                if ((j1 & 4) != 0)
                {
                    if ((i1 & 4) != 0)
                    {
                        r();
                        q();
                    } else
                    {
                        a.setNavigationIcon(null);
                    }
                }
                if ((j1 & 3) != 0)
                {
                    p();
                }
                if ((j1 & 8) != 0)
                {
                    if ((i1 & 8) != 0)
                    {
                        a.setTitle(b);
                        a.setSubtitle(l);
                    } else
                    {
                        a.setTitle(null);
                        a.setSubtitle(null);
                    }
                }
                if ((j1 & 0x10) != 0 && g != null)
                {
                    if ((i1 & 0x10) == 0)
                    {
                        break label0;
                    }
                    a.addView(g);
                }
            }
            return;
        }
        a.removeView(g);
    }

    public final boolean c()
    {
        Toolbar toolbar = a;
        return toolbar.d != null && toolbar.d.b != null;
    }

    public final void d()
    {
        a.c();
    }

    public final CharSequence e()
    {
        return a.getTitle();
    }

    public final boolean f()
    {
        Toolbar toolbar = a;
        return toolbar.getVisibility() == 0 && toolbar.a != null && toolbar.a.b;
    }

    public final boolean g()
    {
        return a.a();
    }

    public final boolean h()
    {
        Object obj = a;
        if (((Toolbar) (obj)).a == null) goto _L2; else goto _L1
_L1:
        obj = ((Toolbar) (obj)).a;
        if (((ActionMenuView) (obj)).c == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        obj = ((ActionMenuView) (obj)).c;
        if (((ActionMenuPresenter) (obj)).q != null || ((ActionMenuPresenter) (obj)).g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        flag = true;
_L6:
        if (flag)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L6; else goto _L2
_L2:
        return false;
    }

    public final boolean i()
    {
        return a.b();
    }

    public final boolean j()
    {
        Object obj = a;
        if (((Toolbar) (obj)).a != null)
        {
            obj = ((Toolbar) (obj)).a;
            boolean flag;
            if (((ActionMenuView) (obj)).c != null && ((ActionMenuView) (obj)).c.d())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void k()
    {
        d = true;
    }

    public final void l()
    {
        Toolbar toolbar = a;
        if (toolbar.a != null)
        {
            toolbar.a.b();
        }
    }

    public final int m()
    {
        return e;
    }

    public final int n()
    {
        return o;
    }

    public final Menu o()
    {
        return a.getMenu();
    }
}
