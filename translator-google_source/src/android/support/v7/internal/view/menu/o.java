// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.n;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperICS

class o extends n
{

    final ActionProvider c;
    final MenuItemWrapperICS d;

    public o(MenuItemWrapperICS menuitemwrapperics, Context context, ActionProvider actionprovider)
    {
        d = menuitemwrapperics;
        super(context);
        c = actionprovider;
    }

    public final View a()
    {
        return c.onCreateActionView();
    }

    public final void a(SubMenu submenu)
    {
        c.onPrepareSubMenu(d.a(submenu));
    }

    public final boolean d()
    {
        return c.onPerformDefaultAction();
    }

    public final boolean e()
    {
        return c.hasSubMenu();
    }
}
