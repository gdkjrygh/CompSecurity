// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            d, i

private final class nit> extends d
    implements android.view.Item.OnMenuItemClickListener
{

    final i a;

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        return ((android.view.Item.OnMenuItemClickListener)d).onMenuItemClick(a.a(menuitem));
    }

    ner(i j, android.view.Item.OnMenuItemClickListener onmenuitemclicklistener)
    {
        a = j;
        super(onmenuitemclicklistener);
    }
}
