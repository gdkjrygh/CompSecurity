// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.h;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, o, j

class n
    implements h
{

    final ActionMenuView a;

    private n(ActionMenuView actionmenuview)
    {
        a = actionmenuview;
        super();
    }

    n(ActionMenuView actionmenuview, j j)
    {
        this(actionmenuview);
    }

    public void a(g g)
    {
        if (ActionMenuView.b(a) != null)
        {
            ActionMenuView.b(a).a(g);
        }
    }

    public boolean a(g g, MenuItem menuitem)
    {
        return ActionMenuView.a(a) != null && ActionMenuView.a(a).a(menuitem);
    }
}
