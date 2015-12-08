// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class c extends a
    implements j
{

    private Context a;
    private ActionBarContextView b;
    private b c;
    private WeakReference d;
    private boolean e;
    private boolean f;
    private i g;

    public c(Context context, ActionBarContextView actionbarcontextview, b b1, boolean flag)
    {
        a = context;
        b = actionbarcontextview;
        c = b1;
        g = (new i(actionbarcontextview.getContext())).a();
        g.a(this);
        f = flag;
    }

    public final MenuInflater a()
    {
        return new MenuInflater(b.getContext());
    }

    public final void a(int k)
    {
        b(a.getString(k));
    }

    public final void a(View view)
    {
        b.d(view);
        if (view != null)
        {
            view = new WeakReference(view);
        } else
        {
            view = null;
        }
        d = view;
    }

    public final void a(CharSequence charsequence)
    {
        b.b(charsequence);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        b.a(flag);
    }

    public final boolean a(i k, MenuItem menuitem)
    {
        return c.a(this, menuitem);
    }

    public final Menu b()
    {
        return g;
    }

    public final void b(int k)
    {
        a(a.getString(k));
    }

    public final void b(CharSequence charsequence)
    {
        b.a(charsequence);
    }

    public final void c()
    {
        if (e)
        {
            return;
        } else
        {
            e = true;
            b.sendAccessibilityEvent(32);
            c.a(this);
            return;
        }
    }

    public final void d()
    {
        c.b(this, g);
    }

    public final CharSequence f()
    {
        return b.b();
    }

    public final CharSequence g()
    {
        return b.c();
    }

    public final boolean h()
    {
        return b.f();
    }

    public final View i()
    {
        if (d != null)
        {
            return (View)d.get();
        } else
        {
            return null;
        }
    }

    public final void p()
    {
        d();
        b.a();
    }
}
