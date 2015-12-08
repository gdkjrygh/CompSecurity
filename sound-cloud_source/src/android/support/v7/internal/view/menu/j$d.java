// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            d, j

private final class nit> extends d
    implements android.view.Item.OnMenuItemClickListener
{

    final j a;

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        return ((android.view.Item.OnMenuItemClickListener)d).onMenuItemClick(a.a(menuitem));
    }

    ner(j j1, android.view.Item.OnMenuItemClickListener onmenuitemclicklistener)
    {
        a = j1;
        super(onmenuitemclicklistener);
    }
}
