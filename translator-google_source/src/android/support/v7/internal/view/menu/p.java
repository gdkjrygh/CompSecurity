// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.view.as;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, MenuItemWrapperICS

final class p extends f
    implements as
{

    final MenuItemWrapperICS a;

    p(MenuItemWrapperICS menuitemwrapperics, android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        a = menuitemwrapperics;
        super(onactionexpandlistener);
    }

    public final boolean a(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnActionExpandListener)d).onMenuItemActionExpand(a.a(menuitem));
    }

    public final boolean b(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnActionExpandListener)d).onMenuItemActionCollapse(a.a(menuitem));
    }
}
