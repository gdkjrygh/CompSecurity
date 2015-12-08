// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, MenuItemWrapperICS

final class q extends f
    implements android.view.MenuItem.OnMenuItemClickListener
{

    final MenuItemWrapperICS a;

    q(MenuItemWrapperICS menuitemwrapperics, android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        a = menuitemwrapperics;
        super(onmenuitemclicklistener);
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnMenuItemClickListener)d).onMenuItemClick(a.a(menuitem));
    }
}
