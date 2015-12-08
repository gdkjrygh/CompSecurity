// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private class <init>
    implements android.support.v7.view.menu.it>
{

    final ActionMenuPresenter this$0;

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (menubuilder instanceof SubMenuBuilder)
        {
            ((SubMenuBuilder)menubuilder).getRootMenu().close(false);
        }
        android.support.v7.view.menu.it> it> = getCallback();
        if (it> != null)
        {
            it>.it>(menubuilder, flag);
        }
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        if (menubuilder == null)
        {
            return false;
        }
        mOpenSubMenuId = ((SubMenuBuilder)menubuilder).getItem().getItemId();
        android.support.v7.view.menu.it> it> = getCallback();
        boolean flag;
        if (it> != null)
        {
            flag = it>.it>(menubuilder);
        } else
        {
            flag = false;
        }
        return flag;
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
