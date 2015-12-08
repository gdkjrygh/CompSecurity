// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.b.b;
import android.support.v7.b.e;
import android.support.v7.b.i;
import android.support.v7.b.k;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            u, am, ak, ao

public class an
    implements u
{

    private Toolbar a;
    private int b;
    private View c;
    private Drawable d;
    private Drawable e;
    private Drawable f;
    private boolean g;
    private CharSequence h;
    private CharSequence i;
    private CharSequence j;
    private android.view.Window.Callback k;
    private boolean l;
    private int m;
    private final ak n;
    private int o;
    private Drawable p;

    public an(Toolbar toolbar, boolean flag)
    {
        this(toolbar, flag, i.abc_action_bar_up_description, e.abc_ic_ab_back_mtrl_am_alpha);
    }

    public an(Toolbar toolbar, boolean flag, int i1, int j1)
    {
        m = 0;
        o = 0;
        a = toolbar;
        h = toolbar.getTitle();
        i = toolbar.getSubtitle();
        boolean flag1;
        if (h != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g = flag1;
        f = toolbar.getNavigationIcon();
        if (flag)
        {
            toolbar = am.a(toolbar.getContext(), null, k.ActionBar, b.actionBarStyle, 0);
            Object obj = toolbar.b(k.ActionBar_title);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b(((CharSequence) (obj)));
            }
            obj = toolbar.b(k.ActionBar_subtitle);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                c(((CharSequence) (obj)));
            }
            obj = toolbar.a(k.ActionBar_logo);
            if (obj != null)
            {
                c(((Drawable) (obj)));
            }
            obj = toolbar.a(k.ActionBar_icon);
            if (f == null && obj != null)
            {
                a(((Drawable) (obj)));
            }
            obj = toolbar.a(k.ActionBar_homeAsUpIndicator);
            if (obj != null)
            {
                d(((Drawable) (obj)));
            }
            d(toolbar.a(k.ActionBar_displayOptions, 0));
            int k1 = toolbar.g(k.ActionBar_customNavigationLayout, 0);
            if (k1 != 0)
            {
                a(LayoutInflater.from(a.getContext()).inflate(k1, a, false));
                d(b | 0x10);
            }
            k1 = toolbar.f(k.ActionBar_height, 0);
            if (k1 > 0)
            {
                android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
                layoutparams.height = k1;
                a.setLayoutParams(layoutparams);
            }
            k1 = toolbar.d(k.ActionBar_contentInsetStart, -1);
            int l1 = toolbar.d(k.ActionBar_contentInsetEnd, -1);
            if (k1 >= 0 || l1 >= 0)
            {
                a.a(Math.max(k1, 0), Math.max(l1, 0));
            }
            k1 = toolbar.g(k.ActionBar_titleTextStyle, 0);
            if (k1 != 0)
            {
                a.a(a.getContext(), k1);
            }
            k1 = toolbar.g(k.ActionBar_subtitleTextStyle, 0);
            if (k1 != 0)
            {
                a.b(a.getContext(), k1);
            }
            k1 = toolbar.g(k.ActionBar_popupTheme, 0);
            if (k1 != 0)
            {
                a.setPopupTheme(k1);
            }
            toolbar.b();
            n = toolbar.c();
        } else
        {
            b = c();
            n = ak.a(toolbar.getContext());
        }
        c(i1);
        j = a.getNavigationContentDescription();
        b(n.a(j1));
        a.setNavigationOnClickListener(new ao(this));
    }

    static Toolbar a(an an1)
    {
        return an1.a;
    }

    static CharSequence b(an an1)
    {
        return an1.h;
    }

    private int c()
    {
        byte byte0 = 11;
        if (a.getNavigationIcon() != null)
        {
            byte0 = 15;
        }
        return byte0;
    }

    static android.view.Window.Callback c(an an1)
    {
        return an1.k;
    }

    private void d()
    {
        Drawable drawable = null;
        if ((b & 2) != 0)
        {
            if ((b & 1) != 0)
            {
                if (e != null)
                {
                    drawable = e;
                } else
                {
                    drawable = d;
                }
            } else
            {
                drawable = d;
            }
        }
        a.setLogo(drawable);
    }

    static boolean d(an an1)
    {
        return an1.l;
    }

    private void e()
    {
label0:
        {
            if ((b & 4) != 0)
            {
                if (!TextUtils.isEmpty(j))
                {
                    break label0;
                }
                a.setNavigationContentDescription(o);
            }
            return;
        }
        a.setNavigationContentDescription(j);
    }

    private void e(CharSequence charsequence)
    {
        h = charsequence;
        if ((b & 8) != 0)
        {
            a.setTitle(charsequence);
        }
    }

    private void f()
    {
        if ((b & 4) != 0)
        {
            Toolbar toolbar = a;
            Drawable drawable;
            if (f != null)
            {
                drawable = f;
            } else
            {
                drawable = p;
            }
            toolbar.setNavigationIcon(drawable);
        }
    }

    public CharSequence a()
    {
        return a.getTitle();
    }

    public void a(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = n.a(i1);
        } else
        {
            drawable = null;
        }
        a(drawable);
    }

    public void a(Drawable drawable)
    {
        d = drawable;
        d();
    }

    public void a(View view)
    {
        if (c != null && (b & 0x10) != 0)
        {
            a.removeView(c);
        }
        c = view;
        if (view != null && (b & 0x10) != 0)
        {
            a.addView(c);
        }
    }

    public void a(android.view.Window.Callback callback)
    {
        k = callback;
    }

    public void a(CharSequence charsequence)
    {
        if (!g)
        {
            e(charsequence);
        }
    }

    public Context b()
    {
        return a.getContext();
    }

    public void b(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = n.a(i1);
        } else
        {
            drawable = null;
        }
        c(drawable);
    }

    public void b(Drawable drawable)
    {
        if (p != drawable)
        {
            p = drawable;
            f();
        }
    }

    public void b(CharSequence charsequence)
    {
        g = true;
        e(charsequence);
    }

    public void c(int i1)
    {
        if (i1 != o)
        {
            o = i1;
            if (TextUtils.isEmpty(a.getNavigationContentDescription()))
            {
                e(o);
                return;
            }
        }
    }

    public void c(Drawable drawable)
    {
        e = drawable;
        d();
    }

    public void c(CharSequence charsequence)
    {
        i = charsequence;
        if ((b & 8) != 0)
        {
            a.setSubtitle(charsequence);
        }
    }

    public void d(int i1)
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
                        f();
                        e();
                    } else
                    {
                        a.setNavigationIcon(null);
                    }
                }
                if ((j1 & 3) != 0)
                {
                    d();
                }
                if ((j1 & 8) != 0)
                {
                    if ((i1 & 8) != 0)
                    {
                        a.setTitle(h);
                        a.setSubtitle(i);
                    } else
                    {
                        a.setTitle(null);
                        a.setSubtitle(null);
                    }
                }
                if ((j1 & 0x10) != 0 && c != null)
                {
                    if ((i1 & 0x10) == 0)
                    {
                        break label0;
                    }
                    a.addView(c);
                }
            }
            return;
        }
        a.removeView(c);
    }

    public void d(Drawable drawable)
    {
        f = drawable;
        f();
    }

    public void d(CharSequence charsequence)
    {
        j = charsequence;
        e();
    }

    public void e(int i1)
    {
        Object obj;
        if (i1 == 0)
        {
            obj = null;
        } else
        {
            obj = b().getString(i1);
        }
        d(((CharSequence) (obj)));
    }
}
