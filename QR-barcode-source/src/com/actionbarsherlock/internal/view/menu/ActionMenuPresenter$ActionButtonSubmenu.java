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
        ActionMenuPresenter.access$3(ActionMenuPresenter.this, null);
        mOpenSubMenuId = 0;
    }

    public (Context context, SubMenuBuilder submenubuilder)
    {
        int i;
        boolean flag;
        this$0 = ActionMenuPresenter.this;
        super(context, submenubuilder);
        if (!((MenuItemImpl)submenubuilder.getItem()).isActionButton())
        {
            int j;
            if (ActionMenuPresenter.access$2(ActionMenuPresenter.this) == null)
            {
                context = (View)mMenuView;
            } else
            {
                context = ActionMenuPresenter.access$2(ActionMenuPresenter.this);
            }
            setAnchorView(context);
        }
        setCallback(mPopupPresenterCallback);
        flag = false;
        j = submenubuilder.size();
        i = 0;
_L5:
        if (i < j) goto _L2; else goto _L1
_L1:
        setForceShowIcon(flag);
        return;
_L2:
        actionmenupresenter = submenubuilder.getItem(i);
        if (!isVisible() || getIcon() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
