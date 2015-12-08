// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            o, p

public abstract class n
{

    public o a;
    public p b;
    private final Context c;

    public n(Context context)
    {
        c = context;
    }

    public abstract View a();

    public View a(MenuItem menuitem)
    {
        return a();
    }

    public void a(p p)
    {
        if (b != null)
        {
            (new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ")).append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?");
        }
        b = p;
    }

    public void a(SubMenu submenu)
    {
    }

    public final void a(boolean flag)
    {
        if (a != null)
        {
            a.a(flag);
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
}
