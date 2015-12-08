// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, l

final class k
    implements j
{

    final ActionMenuView a;

    k(ActionMenuView actionmenuview)
    {
        a = actionmenuview;
        super();
    }

    public final void a(i i)
    {
        if (ActionMenuView.b(a) != null)
        {
            ActionMenuView.b(a).a(i);
        }
    }

    public final boolean a(i i, MenuItem menuitem)
    {
        return ActionMenuView.a(a) != null && ActionMenuView.a(a).a();
    }
}
