// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.SubMenuBuilder;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private class setForceShowIcon extends MenuPopupHelper
{

    private SubMenuBuilder mSubMenu;
    final ActionMenuPresenter this$0;

    public void onDismiss()
    {
        super.onDismiss();
        ActionMenuPresenter.access$802(ActionMenuPresenter.this, null);
        mOpenSubMenuId = 0;
    }

    public (Context context, SubMenuBuilder submenubuilder)
    {
        boolean flag1 = false;
        this$0 = ActionMenuPresenter.this;
        super(context, submenubuilder, null, false, android.support.v7.appcompat.s._fld0);
        mSubMenu = submenubuilder;
        int i;
        if (!((MenuItemImpl)submenubuilder.getItem()).isActionButton())
        {
            int j;
            boolean flag;
            if (ActionMenuPresenter.access$600(ActionMenuPresenter.this) == null)
            {
                context = (View)ActionMenuPresenter.access$700(ActionMenuPresenter.this);
            } else
            {
                context = ActionMenuPresenter.access$600(ActionMenuPresenter.this);
            }
            setAnchorView(context);
        }
        setCallback(mPopupPresenterCallback);
        j = submenubuilder.size();
        i = 0;
        do
        {
label0:
            {
                flag = flag1;
                if (i < j)
                {
                    actionmenupresenter = submenubuilder.getItem(i);
                    if (!isVisible() || getIcon() == null)
                    {
                        break label0;
                    }
                    flag = true;
                }
                setForceShowIcon(flag);
                return;
            }
            i++;
        } while (true);
    }
}
