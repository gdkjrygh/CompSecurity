// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class d
{
    public static interface a
    {

        public abstract void b(boolean flag);
    }

    public static interface b
    {

        public abstract void a();
    }


    private final Context a;
    private a b;
    private b c;

    public d(Context context)
    {
        a = context;
    }

    public abstract View a();

    public View a(MenuItem menuitem)
    {
        return a();
    }

    public final void a(a a1)
    {
        b = a1;
    }

    public void a(b b1)
    {
        if (c != null)
        {
            Log.w("ActionProvider(support)", (new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ")).append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?").toString());
        }
        c = b1;
    }

    public void a(SubMenu submenu)
    {
    }

    public final void a(boolean flag)
    {
        if (b != null)
        {
            b.b(flag);
        }
    }

    public boolean b()
    {
        return false;
    }

    public boolean c()
    {
        return true;
    }

    public boolean d()
    {
        return false;
    }

    public boolean e()
    {
        return false;
    }

    public final void f()
    {
        c = null;
        b = null;
    }
}
