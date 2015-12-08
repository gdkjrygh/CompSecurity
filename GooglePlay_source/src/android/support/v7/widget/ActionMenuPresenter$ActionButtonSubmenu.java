// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.menu.MenuItemImpl;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private final class on extends MenuPopupHelper
{

    private SubMenuBuilder mSubMenu;
    final ActionMenuPresenter this$0;

    public final void onDismiss()
    {
        super.onDismiss();
        mActionButtonPopup = null;
        mOpenSubMenuId = 0;
    }

    public (Context context, SubMenuBuilder submenubuilder)
    {
        this$0 = ActionMenuPresenter.this;
        super(context, submenubuilder, null, false, 0x7f0100fb);
        mSubMenu = submenubuilder;
        int i;
        if (!((MenuItemImpl)submenubuilder.getItem()).isActionButton())
        {
            int j;
            boolean flag;
            boolean flag1;
            if (mOverflowButton == null)
            {
                context = (View)mMenuView;
            } else
            {
                context = mOverflowButton;
            }
            super.mAnchorView = context;
        }
        super.mPresenterCallback = mPopupPresenterCallback;
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
                super.mForceShowIcon = flag;
                return;
            }
            i++;
        } while (true);
    }
}
