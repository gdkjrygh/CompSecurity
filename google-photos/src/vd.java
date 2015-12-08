// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class vd extends aav
    implements vv
{

    private Context c;
    private ActionBarContextView d;
    private aaw e;
    private WeakReference f;
    private boolean g;
    private vu h;

    public vd(Context context, ActionBarContextView actionbarcontextview, aaw aaw1, boolean flag)
    {
        c = context;
        d = actionbarcontextview;
        e = aaw1;
        context = new vu(actionbarcontextview.getContext());
        context.e = 1;
        h = context;
        h.a(this);
    }

    public final MenuInflater a()
    {
        return new MenuInflater(d.getContext());
    }

    public final void a(int j)
    {
        b(c.getString(j));
    }

    public final void a(View view)
    {
        d.a(view);
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
        d.b(charsequence);
    }

    public final void a(vu vu1)
    {
        d();
        d.a();
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        d.a(flag);
    }

    public final boolean a(vu vu1, MenuItem menuitem)
    {
        return e.a(this, menuitem);
    }

    public final Menu b()
    {
        return h;
    }

    public final void b(int j)
    {
        a(c.getString(j));
    }

    public final void b(CharSequence charsequence)
    {
        d.a(charsequence);
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
        e.b(this, h);
    }

    public final CharSequence f()
    {
        return d.f;
    }

    public final CharSequence g()
    {
        return d.g;
    }

    public final boolean h()
    {
        return d.i;
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
