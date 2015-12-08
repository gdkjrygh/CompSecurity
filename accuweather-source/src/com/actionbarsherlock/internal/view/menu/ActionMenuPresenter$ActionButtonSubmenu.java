// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.view.View;
import com.actionbarsherlock.view.MenuItem;

// Referenced classes of package com.actionbarsherlock.internal.view.menu:
//            MenuPopupHelper, ActionMenuPresenter, SubMenuBuilder, MenuItemImpl

private class setForceShowIcon extends MenuPopupHelper
{

    final ActionMenuPresenter this$0;

    public void onDismiss()
    {
        super.onDismiss();
        ActionMenuPresenter.access$302(ActionMenuPresenter.this, null);
        mOpenSubMenuId = 0;
    }

    public (Context context, SubMenuBuilder submenubuilder)
    {
        this$0 = ActionMenuPresenter.this;
        super(context, submenubuilder);
        int i;
        if (!((MenuItemImpl)submenubuilder.getItem()).isActionButton())
        {
            int j;
            boolean flag;
            boolean flag1;
            if (ActionMenuPresenter.access$200(ActionMenuPresenter.this) == null)
            {
                context = (View)mMenuView;
            } else
            {
                context = ActionMenuPresenter.access$200(ActionMenuPresenter.this);
            }
            setAnchorView(context);
        }
        setCallback(mPopupPresenterCallback);
        flag1 = false;
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
