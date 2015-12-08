// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public final class uy extends aav
    implements vv
{

    private final Context c;
    private final vu d;
    private aaw e;
    private WeakReference f;
    private uu g;

    public uy(uu uu1, Context context, aaw aaw1)
    {
        g = uu1;
        super();
        c = context;
        e = aaw1;
        uu1 = new vu(context);
        uu1.e = 1;
        d = uu1;
        d.a(this);
    }

    public final MenuInflater a()
    {
        return new vg(c);
    }

    public final void a(int j)
    {
        b(uu.i(g).getResources().getString(j));
    }

    public final void a(View view)
    {
        uu.g(g).a(view);
        f = new WeakReference(view);
    }

    public final void a(CharSequence charsequence)
    {
        uu.g(g).b(charsequence);
    }

    public final void a(vu vu1)
    {
        if (e == null)
        {
            return;
        } else
        {
            d();
            uu.g(g).a();
            return;
        }
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        uu.g(g).a(flag);
    }

    public final boolean a(vu vu1, MenuItem menuitem)
    {
        if (e != null)
        {
            return e.a(this, menuitem);
        } else
        {
            return false;
        }
    }

    public final Menu b()
    {
        return d;
    }

    public final void b(int j)
    {
        a(uu.i(g).getResources().getString(j));
    }

    public final void b(CharSequence charsequence)
    {
        uu.g(g).a(charsequence);
    }

    public final void c()
    {
        if (g.a != this)
        {
            return;
        }
        ActionBarContextView actionbarcontextview;
        if (!uu.a(uu.e(g), uu.f(g), false))
        {
            g.b = this;
            g.c = e;
        } else
        {
            e.a(this);
        }
        e = null;
        g.i(false);
        actionbarcontextview = uu.g(g);
        if (actionbarcontextview.h == null)
        {
            actionbarcontextview.b();
        }
        uu.h(g).a().sendAccessibilityEvent(32);
        uu.d(g).a(g.d);
        g.a = null;
    }

    public final void d()
    {
        if (g.a != this)
        {
            return;
        }
        d.d();
        e.b(this, d);
        d.e();
        return;
        Exception exception;
        exception;
        d.e();
        throw exception;
    }

    public final boolean e()
    {
        d.d();
        boolean flag = e.a(this, d);
        d.e();
        return flag;
        Exception exception;
        exception;
        d.e();
        throw exception;
    }

    public final CharSequence f()
    {
        return uu.g(g).f;
    }

    public final CharSequence g()
    {
        return uu.g(g).g;
    }

    public final boolean h()
    {
        return uu.g(g).i;
    }

    public final View i()
    {
        if (f != null)
        {
            return (View)f.get();
        } else
        {
            return null;
        }
    }
}
