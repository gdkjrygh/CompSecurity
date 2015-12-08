// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.b;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.t;
import android.support.v7.internal.view.menu.w;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ai

public final class ag
    implements j, w
{

    public Context a;
    public i b;
    public View c;
    public t d;
    public ai e;
    public android.view.View.OnTouchListener f;

    public ag(Context context, View view)
    {
        this(context, view, (byte)0);
    }

    private ag(Context context, View view, byte byte0)
    {
        this(context, view, b.popupMenuStyle);
    }

    private ag(Context context, View view, int k)
    {
        a = context;
        b = new i(context);
        b.a(this);
        c = view;
        d = new t(context, b, view, false, k, (byte)0);
        d.f = 0;
        d.d = this;
    }

    public final void a(i k)
    {
    }

    public final void a(i k, boolean flag)
    {
    }

    public final boolean a(i k, MenuItem menuitem)
    {
        if (e != null)
        {
            return e.a(menuitem);
        } else
        {
            return false;
        }
    }

    public final boolean a_(i k)
    {
        boolean flag = true;
        if (k == null)
        {
            flag = false;
        } else
        if (k.hasVisibleItems())
        {
            (new t(a, k, c)).b();
            return true;
        }
        return flag;
    }
}
