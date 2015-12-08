// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuPresenter, SubMenuBuilder, MenuBuilder

private class <init>
    implements <init>
{

    final ActionMenuPresenter this$0;

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (menubuilder instanceof SubMenuBuilder)
        {
            ((SubMenuBuilder)menubuilder).getRootMenu().close(false);
        }
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        if (menubuilder == null)
        {
            return false;
        } else
        {
            mOpenSubMenuId = ((SubMenuBuilder)menubuilder).getItem().getItemId();
            return false;
        }
    }

    private ()
    {
        this$0 = ActionMenuPresenter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
