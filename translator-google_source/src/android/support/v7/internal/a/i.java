// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.internal.view.f;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.y;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.internal.a:
//            e

public final class i extends a
    implements j
{

    final e a;
    private final Context d;
    private final android.support.v7.internal.view.menu.i e;
    private b f;
    private WeakReference g;

    public i(e e1, Context context, b b1)
    {
        a = e1;
        super();
        d = context;
        f = b1;
        e1 = new android.support.v7.internal.view.menu.i(context);
        e1.e = 1;
        e = e1;
        e.a(this);
    }

    public final MenuInflater a()
    {
        return new f(d);
    }

    public final void a(int k)
    {
        b(android.support.v7.internal.a.e.j(a).getResources().getString(k));
    }

    public final void a(android.support.v7.internal.view.menu.i k)
    {
        if (f == null)
        {
            return;
        } else
        {
            d();
            android.support.v7.internal.a.e.h(a).a();
            return;
        }
    }

    public final void a(View view)
    {
        android.support.v7.internal.a.e.h(a).setCustomView(view);
        g = new WeakReference(view);
    }

    public final void a(CharSequence charsequence)
    {
        android.support.v7.internal.a.e.h(a).setSubtitle(charsequence);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        android.support.v7.internal.a.e.h(a).setTitleOptional(flag);
    }

    public final boolean a(android.support.v7.internal.view.menu.i k, MenuItem menuitem)
    {
        if (f != null)
        {
            return f.a(this, menuitem);
        } else
        {
            return false;
        }
    }

    public final Menu b()
    {
        return e;
    }

    public final void b(int k)
    {
        a(android.support.v7.internal.a.e.j(a).getResources().getString(k));
    }

    public final void b(CharSequence charsequence)
    {
        android.support.v7.internal.a.e.h(a).setTitle(charsequence);
    }

    public final void c()
    {
        if (a.a != this)
        {
            return;
        }
        ActionBarContextView actionbarcontextview;
        if (!android.support.v7.internal.a.e.a(android.support.v7.internal.a.e.f(a), android.support.v7.internal.a.e.g(a)))
        {
            a.b = this;
            a.c = f;
        } else
        {
            f.a(this);
        }
        f = null;
        a.e(false);
        actionbarcontextview = android.support.v7.internal.a.e.h(a);
        if (actionbarcontextview.g == null)
        {
            actionbarcontextview.b();
        }
        android.support.v7.internal.a.e.i(a).a().sendAccessibilityEvent(32);
        android.support.v7.internal.a.e.e(a).setHideOnContentScrollEnabled(a.d);
        a.a = null;
    }

    public final void d()
    {
        if (a.a != this)
        {
            return;
        }
        e.d();
        f.b(this, e);
        e.e();
        return;
        Exception exception;
        exception;
        e.e();
        throw exception;
    }

    public final boolean e()
    {
        e.d();
        boolean flag = f.a(this, e);
        e.e();
        return flag;
        Exception exception;
        exception;
        e.e();
        throw exception;
    }

    public final CharSequence f()
    {
        return android.support.v7.internal.a.e.h(a).getTitle();
    }

    public final CharSequence g()
    {
        return android.support.v7.internal.a.e.h(a).getSubtitle();
    }

    public final boolean h()
    {
        return android.support.v7.internal.a.e.h(a).h;
    }

    public final View i()
    {
        if (g != null)
        {
            return (View)g.get();
        } else
        {
            return null;
        }
    }
}
