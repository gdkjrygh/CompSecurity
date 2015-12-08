// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class km
{

    public final Context a;
    public kn b;
    public ko c;

    public km(Context context)
    {
        a = context;
    }

    public abstract View a();

    public View a(MenuItem menuitem)
    {
        return a();
    }

    public void a(SubMenu submenu)
    {
    }

    public void a(ko ko1)
    {
        if (c != null)
        {
            Log.w("ActionProvider(support)", (new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ")).append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?").toString());
        }
        c = ko1;
    }

    public final void a(boolean flag)
    {
        if (b != null)
        {
            b.a(flag);
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

    public void d()
    {
        if (c != null && b())
        {
            ko ko1 = c;
            c();
            ko1.a();
        }
    }

    public boolean e()
    {
        return false;
    }

    public boolean f()
    {
        return false;
    }
}
