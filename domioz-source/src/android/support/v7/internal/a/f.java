// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ab;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.internal.a:
//            b

public final class f extends a
    implements j
{

    final android.support.v7.internal.a.b a;
    private final Context b;
    private final i c;
    private b d;
    private WeakReference e;

    public f(android.support.v7.internal.a.b b1, Context context, b b2)
    {
        a = b1;
        super();
        b = context;
        d = b2;
        c = (new i(context)).a();
        c.a(this);
    }

    public final MenuInflater a()
    {
        return new android.support.v7.internal.view.f(b);
    }

    public final void a(int k)
    {
        b(android.support.v7.internal.a.b.l(a).getResources().getString(k));
    }

    public final void a(View view)
    {
        android.support.v7.internal.a.b.j(a).d(view);
        e = new WeakReference(view);
    }

    public final void a(CharSequence charsequence)
    {
        android.support.v7.internal.a.b.j(a).b(charsequence);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        android.support.v7.internal.a.b.j(a).a(flag);
    }

    public final boolean a(i k, MenuItem menuitem)
    {
        if (d != null)
        {
            return d.a(this, menuitem);
        } else
        {
            return false;
        }
    }

    public final Menu b()
    {
        return c;
    }

    public final void b(int k)
    {
        a(android.support.v7.internal.a.b.l(a).getResources().getString(k));
    }

    public final void b(CharSequence charsequence)
    {
        android.support.v7.internal.a.b.j(a).a(charsequence);
    }

    public final void c()
    {
        if (a.a != this)
        {
            return;
        }
        if (!android.support.v7.internal.a.b.a(android.support.v7.internal.a.b.h(a), android.support.v7.internal.a.b.i(a)))
        {
            a.b = this;
            a.c = d;
        } else
        {
            d.a(this);
        }
        d = null;
        a.e(false);
        android.support.v7.internal.a.b.j(a).d();
        android.support.v7.internal.a.b.k(a).a().sendAccessibilityEvent(32);
        android.support.v7.internal.a.b.g(a).b(a.d);
        a.a = null;
    }

    public final void d()
    {
        if (a.a != this)
        {
            return;
        }
        c.g();
        d.b(this, c);
        c.h();
        return;
        Exception exception;
        exception;
        c.h();
        throw exception;
    }

    public final boolean e()
    {
        c.g();
        boolean flag = d.a(this, c);
        c.h();
        return flag;
        Exception exception;
        exception;
        c.h();
        throw exception;
    }

    public final CharSequence f()
    {
        return android.support.v7.internal.a.b.j(a).b();
    }

    public final CharSequence g()
    {
        return android.support.v7.internal.a.b.j(a).c();
    }

    public final boolean h()
    {
        return android.support.v7.internal.a.b.j(a).f();
    }

    public final View i()
    {
        if (e != null)
        {
            return (View)e.get();
        } else
        {
            return null;
        }
    }

    public final void p()
    {
        if (d == null)
        {
            return;
        } else
        {
            d();
            android.support.v7.internal.a.b.j(a).a();
            return;
        }
    }
}
