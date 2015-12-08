// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public final class aeh
    implements vv, wk
{

    public vu a;
    public wh b;
    public abk c;
    private Context d;
    private View e;

    public aeh(Context context, View view)
    {
        this(context, view, 0);
    }

    private aeh(Context context, View view, int i)
    {
        this(context, view, 0, b.N, 0);
    }

    private aeh(Context context, View view, int i, int j, int k)
    {
        d = context;
        a = new vu(context);
        a.a(this);
        e = view;
        b = new wh(context, a, view, false, j, 0);
        b.f = i;
        b.d = this;
    }

    public final void a(int i)
    {
        (new vg(d)).inflate(i, a);
    }

    public final void a(vu vu1)
    {
    }

    public final void a(vu vu1, boolean flag)
    {
    }

    public final boolean a(vu vu1, MenuItem menuitem)
    {
        if (c != null)
        {
            return c.a(menuitem);
        } else
        {
            return false;
        }
    }

    public final boolean a_(vu vu1)
    {
        boolean flag = true;
        if (vu1 == null)
        {
            flag = false;
        } else
        if (vu1.hasVisibleItems())
        {
            (new wh(d, vu1, e)).b();
            return true;
        }
        return flag;
    }
}
