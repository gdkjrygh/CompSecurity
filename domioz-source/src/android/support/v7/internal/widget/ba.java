// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bp;
import android.support.v4.view.cy;
import android.support.v7.a.b;
import android.support.v7.a.f;
import android.support.v7.a.g;
import android.support.v7.a.j;
import android.support.v7.a.l;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            ab, az, ax, bb, 
//            ah, bc, bd

public final class ba
    implements ab
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
    private final ax p;
    private int q;
    private Drawable r;

    public ba(Toolbar toolbar)
    {
        this(toolbar, j.a, f.j);
    }

    private ba(Toolbar toolbar, int i1, int j1)
    {
        o = 0;
        q = 0;
        a = toolbar;
        i = toolbar.i();
        j = toolbar.j();
        Object obj;
        int k1;
        int l1;
        boolean flag;
        if (i != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        g = toolbar.l();
        toolbar = az.a(toolbar.getContext(), null, l.a, b.c);
        obj = toolbar.c(l.t);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            h = true;
            b(((CharSequence) (obj)));
        }
        obj = toolbar.c(l.r);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            j = ((CharSequence) (obj));
            if ((b & 8) != 0)
            {
                a.b(((CharSequence) (obj)));
            }
        }
        obj = toolbar.a(l.p);
        if (obj != null)
        {
            f = ((Drawable) (obj));
            p();
        }
        obj = toolbar.a(l.o);
        if (g == null && obj != null)
        {
            e = ((Drawable) (obj));
            p();
        }
        obj = toolbar.a(l.n);
        if (obj != null)
        {
            g = ((Drawable) (obj));
            r();
        }
        a(toolbar.a(l.j, 0));
        k1 = toolbar.f(l.i, 0);
        if (k1 != 0)
        {
            View view = LayoutInflater.from(a.getContext()).inflate(k1, a, false);
            if (d != null && (b & 0x10) != 0)
            {
                a.removeView(d);
            }
            d = view;
            if (view != null && (b & 0x10) != 0)
            {
                a.addView(d);
            }
            a(b | 0x10);
        }
        k1 = toolbar.e(l.l, 0);
        if (k1 > 0)
        {
            android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
            layoutparams.height = k1;
            a.setLayoutParams(layoutparams);
        }
        k1 = toolbar.c(l.h, -1);
        l1 = toolbar.c(l.g, -1);
        if (k1 >= 0 || l1 >= 0)
        {
            a.a(Math.max(k1, 0), Math.max(l1, 0));
        }
        k1 = toolbar.f(l.u, 0);
        if (k1 != 0)
        {
            a.a(a.getContext(), k1);
        }
        k1 = toolbar.f(l.s, 0);
        if (k1 != 0)
        {
            a.b(a.getContext(), k1);
        }
        k1 = toolbar.f(l.q, 0);
        if (k1 != 0)
        {
            a.a(k1);
        }
        toolbar.b();
        p = toolbar.c();
        if (i1 != q)
        {
            q = i1;
            if (TextUtils.isEmpty(a.k()))
            {
                i1 = q;
                if (i1 == 0)
                {
                    toolbar = null;
                } else
                {
                    toolbar = a.getContext().getString(i1);
                }
                k = toolbar;
                q();
            }
        }
        k = a.k();
        toolbar = p.a(j1);
        if (r != toolbar)
        {
            r = toolbar;
            r();
        }
        a.a(new bb(this));
    }

    static Toolbar a(ba ba1)
    {
        return ba1.a;
    }

    static CharSequence b(ba ba1)
    {
        return ba1.i;
    }

    private void b(CharSequence charsequence)
    {
        i = charsequence;
        if ((b & 8) != 0)
        {
            a.a(charsequence);
        }
    }

    static android.view.Window.Callback c(ba ba1)
    {
        return ba1.l;
    }

    static boolean d(ba ba1)
    {
        return ba1.m;
    }

    private void p()
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
        a.a(drawable);
    }

    private void q()
    {
label0:
        {
            if ((b & 4) != 0)
            {
                if (!TextUtils.isEmpty(k))
                {
                    break label0;
                }
                Toolbar toolbar = a;
                int i1 = q;
                CharSequence charsequence;
                if (i1 != 0)
                {
                    charsequence = toolbar.getContext().getText(i1);
                } else
                {
                    charsequence = null;
                }
                toolbar.c(charsequence);
            }
            return;
        }
        a.c(k);
    }

    private void r()
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
            toolbar.b(drawable);
        }
    }

    public final ViewGroup a()
    {
        return a;
    }

    public final void a(int i1)
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
                        r();
                        q();
                    } else
                    {
                        a.b(null);
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
                        a.a(i);
                        a.b(j);
                    } else
                    {
                        a.a(null);
                        a.b(null);
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

    public final void a(ah ah1)
    {
        if (c != null && c.getParent() == a)
        {
            a.removeView(c);
        }
        c = ah1;
        if (ah1 != null && o == 2)
        {
            a.addView(c, 0);
            android.support.v7.widget.Toolbar.LayoutParams layoutparams = (android.support.v7.widget.Toolbar.LayoutParams)c.getLayoutParams();
            layoutparams.width = -2;
            layoutparams.height = -2;
            layoutparams.a = 0x800053;
            ah1.a(true);
        }
    }

    public final void a(Menu menu, y y)
    {
        if (n == null)
        {
            n = new ActionMenuPresenter(a.getContext());
            n.a(g.g);
        }
        n.a(y);
        a.a((i)menu, n);
    }

    public final void a(android.view.Window.Callback callback)
    {
        l = callback;
    }

    public final void a(CharSequence charsequence)
    {
        if (!h)
        {
            b(charsequence);
        }
    }

    public final void a(boolean flag)
    {
        a.a(flag);
    }

    public final Context b()
    {
        return a.getContext();
    }

    public final void b(int i1)
    {
        if (i1 == 8)
        {
            bp.o(a).a(0.0F).a(new bc(this));
        } else
        if (i1 == 0)
        {
            bp.o(a).a(1.0F).a(new bd(this));
            return;
        }
    }

    public final boolean c()
    {
        return a.g();
    }

    public final void d()
    {
        a.h();
    }

    public final void e()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void f()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
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
}
