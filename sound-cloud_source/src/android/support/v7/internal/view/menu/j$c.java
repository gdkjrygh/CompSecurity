// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            d, j

private final class nit> extends d
    implements android.support.v4.view.ItemCompat.OnActionExpandListener
{

    final j a;

    public final boolean onMenuItemActionCollapse(MenuItem menuitem)
    {
        return ((android.view.Item.OnActionExpandListener)d).onMenuItemActionCollapse(a.a(menuitem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuitem)
    {
        return ((android.view.Item.OnActionExpandListener)d).onMenuItemActionExpand(a.a(menuitem));
    }

    er(j j1, android.view.Item.OnActionExpandListener onactionexpandlistener)
    {
        a = j1;
        super(onactionexpandlistener);
    }
}
