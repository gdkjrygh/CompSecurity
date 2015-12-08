// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperICS

class _cls1.this._cls1 extends ActionProvider
{

    final android.support.v4.view.ActionProvider mInner;
    final MenuItemWrapperICS this$0;

    public boolean hasSubMenu()
    {
        return mInner.hasSubMenu();
    }

    public View onCreateActionView()
    {
        if (MenuItemWrapperICS.access$000(MenuItemWrapperICS.this))
        {
            checkActionProviderOverrideVisibility();
        }
        return mInner.onCreateActionView();
    }

    public boolean onPerformDefaultAction()
    {
        return mInner.onPerformDefaultAction();
    }

    public void onPrepareSubMenu(SubMenu submenu)
    {
        mInner.onPrepareSubMenu(getSubMenuWrapper(submenu));
    }

    public _cls1.val.this._cls0(android.support.v4.view.ActionProvider actionprovider)
    {
        this.this$0 = MenuItemWrapperICS.this;
        super(actionprovider.getContext());
        mInner = actionprovider;
        if (MenuItemWrapperICS.access$000(MenuItemWrapperICS.this))
        {
            mInner.setVisibilityListener(new android.support.v4.view.ActionProvider.VisibilityListener() {

                final MenuItemWrapperICS.ActionProviderWrapper this$1;
                final MenuItemWrapperICS val$this$0;

                public void onActionProviderVisibilityChanged(boolean flag)
                {
                    if (mInner.overridesItemVisibility() && MenuItemWrapperICS.access$100(MenuItemWrapperICS.ActionProviderWrapper.this.this$0))
                    {
                        wrappedSetVisible(flag);
                    }
                }

            
            {
                this$1 = MenuItemWrapperICS.ActionProviderWrapper.this;
                this$0 = menuitemwrapperics;
                super();
            }
            });
        }
    }
}
