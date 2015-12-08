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
    private ActionBarContextView d;
    private b e;
    private WeakReference f;
    private boolean g;
    private boolean h;
    private i i;

    public c(Context context, ActionBarContextView actionbarcontextview, b b1, boolean flag)
    {
        a = context;
        d = actionbarcontextview;
        e = b1;
        context = new i(actionbarcontextview.getContext());
        context.e = 1;
        i = context;
        i.a(this);
        h = flag;
    }

    public final MenuInflater a()
    {
        return new MenuInflater(d.getContext());
    }

    public final void a(int k)
    {
        b(a.getString(k));
    }

    public final void a(i k)
    {
        d();
        d.a();
    }

    public final void a(View view)
    {
        d.setCustomView(view);
        if (view != null)
        {
            view = new WeakReference(view);
        } else
        {
            view = null;
        }
        f = view;
    }

    public final void a(CharSequence charsequence)
    {
        d.setSubtitle(charsequence);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        d.setTitleOptional(flag);
    }

    public final boolean a(i k, MenuItem menuitem)
    {
        return e.a(this, menuitem);
    }

    public final Menu b()
    {
        return i;
    }

    public final void b(int k)
    {
        a(a.getString(k));
    }

    public final void b(CharSequence charsequence)
    {
        d.setTitle(charsequence);
    }

    public final void c()
    {
        if (g)
        {
            return;
        } else
        {
            g = true;
            d.sendAccessibilityEvent(32);
            e.a(this);
            return;
        }
    }

    public final void d()
    {
        e.b(this, i);
    }

    public final CharSequence f()
    {
        return d.getTitle();
    }

    public final CharSequence g()
    {
        return d.getSubtitle();
    }

    public final boolean h()
    {
        return d.h;
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
