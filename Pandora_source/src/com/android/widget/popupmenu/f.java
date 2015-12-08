// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget.popupmenu;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package com.android.widget.popupmenu:
//            a, c

public class f
    implements a.a, d.a
{
    public static interface a
    {

        public abstract void a(f f1);
    }

    public static interface b
    {

        public abstract boolean onMenuItemClick(MenuItem menuitem);
    }


    private Context a;
    private com.android.widget.popupmenu.a b;
    private View c;
    private c d;
    private b e;
    private a f;

    public f(Context context, View view)
    {
        a = context;
        b = new com.android.widget.popupmenu.a(context);
        b.a(this);
        c = view;
        d = new c(context, b, view);
        d.a(this);
    }

    public Menu a()
    {
        return b;
    }

    public void a(int i)
    {
        b().inflate(i, b);
    }

    public void a(com.android.widget.popupmenu.a a1, boolean flag)
    {
        if (f != null)
        {
            f.a(this);
        }
    }

    public void a(a a1)
    {
        f = a1;
    }

    public void a(b b1)
    {
        e = b1;
    }

    public void a(boolean flag)
    {
        d.a(flag);
    }

    public boolean a(com.android.widget.popupmenu.a a1)
    {
        boolean flag = true;
        if (a1 == null)
        {
            flag = false;
        } else
        if (a1.hasVisibleItems())
        {
            (new c(a, a1, c)).a();
            return true;
        }
        return flag;
    }

    public boolean a(com.android.widget.popupmenu.a a1, MenuItem menuitem)
    {
        if (e != null)
        {
            return e.onMenuItemClick(menuitem);
        } else
        {
            return false;
        }
    }

    public MenuInflater b()
    {
        return new MenuInflater(a);
    }

    public void c()
    {
        d.a();
    }
}
