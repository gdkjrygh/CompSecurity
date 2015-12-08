// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

public final class abj
    implements vv
{

    private ActionMenuView a;

    public abj(ActionMenuView actionmenuview)
    {
        a = actionmenuview;
        super();
    }

    public final void a(vu vu)
    {
        if (ActionMenuView.b(a) != null)
        {
            ActionMenuView.b(a).a(vu);
        }
    }

    public final boolean a(vu vu, MenuItem menuitem)
    {
        return ActionMenuView.a(a) != null && ActionMenuView.a(a).a(menuitem);
    }
}
