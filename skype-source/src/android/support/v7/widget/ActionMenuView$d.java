// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.f;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView

private final class <init>
    implements android.support.v7.internal.view.menu.
{

    final ActionMenuView a;

    public final boolean onMenuItemSelected(f f, MenuItem menuitem)
    {
        return ActionMenuView.a(a) != null && ActionMenuView.a(a).a(menuitem);
    }

    public final void onMenuModeChange(f f)
    {
        if (ActionMenuView.b(a) != null)
        {
            ActionMenuView.b(a).nge(f);
        }
    }

    private (ActionMenuView actionmenuview)
    {
        a = actionmenuview;
        super();
    }

    a(ActionMenuView actionmenuview, byte byte0)
    {
        this(actionmenuview);
    }
}
