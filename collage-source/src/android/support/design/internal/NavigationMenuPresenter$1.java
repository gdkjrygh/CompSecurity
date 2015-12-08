// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.view.View;

// Referenced classes of package android.support.design.internal:
//            NavigationMenuPresenter, NavigationMenuItemView

class this._cls0
    implements android.view.ionMenuPresenter._cls1
{

    final NavigationMenuPresenter this$0;

    public void onClick(View view)
    {
        view = (NavigationMenuItemView)view;
        setUpdateSuspended(true);
        view = view.getItemData();
        boolean flag = NavigationMenuPresenter.access$000(NavigationMenuPresenter.this).performItemAction(view, NavigationMenuPresenter.this, 0);
        if (view != null && view.isCheckable() && flag)
        {
            NavigationMenuPresenter.access$100(NavigationMenuPresenter.this).setCheckedItem(view);
        }
        setUpdateSuspended(false);
        updateMenuView(false);
    }

    vigationMenuAdapter()
    {
        this$0 = NavigationMenuPresenter.this;
        super();
    }
}
