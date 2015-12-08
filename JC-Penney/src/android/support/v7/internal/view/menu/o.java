// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.view.ax;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            f, l

class o extends f
    implements ax
{

    final l a;

    o(l l1, android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        a = l1;
        super(onactionexpandlistener);
    }

    public boolean a(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnActionExpandListener)b).onMenuItemActionExpand(a.a(menuitem));
    }

    public boolean b(MenuItem menuitem)
    {
        return ((android.view.MenuItem.OnActionExpandListener)b).onMenuItemActionCollapse(a.a(menuitem));
    }
}
