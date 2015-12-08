// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.view.a;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class c extends a
    implements android.support.v7.internal.view.menu.f.a
{

    private Context a;
    private ActionBarContextView b;
    private android.support.v7.view.a.a c;
    private WeakReference d;
    private boolean e;
    private boolean f;
    private f g;

    public c(Context context, ActionBarContextView actionbarcontextview, android.support.v7.view.a.a a1, boolean flag)
    {
        a = context;
        b = actionbarcontextview;
        c = a1;
        g = (new f(actionbarcontextview.getContext())).a();
        g.a(this);
        f = flag;
    }

    public final MenuInflater a()
    {
        return new MenuInflater(b.getContext());
    }

    public final void a(int j)
    {
        b(a.getString(j));
    }

    public final void a(View view)
    {
        b.setCustomView(view);
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
        b.setSubtitle(charsequence);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        b.setTitleOptional(flag);
    }

    public final Menu b()
    {
        return g;
    }

    public final void b(int j)
    {
        a(a.getString(j));
    }

    public final void b(CharSequence charsequence)
    {
        b.setTitle(charsequence);
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

    public final boolean onMenuItemSelected(f f1, MenuItem menuitem)
    {
        return c.a(this, menuitem);
    }

    public final void onMenuModeChange(f f1)
    {
        d();
        b.a();
    }
}
