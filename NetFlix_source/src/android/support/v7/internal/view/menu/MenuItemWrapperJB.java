// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperICS

class MenuItemWrapperJB extends MenuItemWrapperICS
{
    class ActionProviderWrapperJB extends MenuItemWrapperICS.ActionProviderWrapper
        implements android.support.v4.view.ActionProvider.VisibilityListener
    {

        android.view.ActionProvider.VisibilityListener mListener;
        final MenuItemWrapperJB this$0;

        public boolean isVisible()
        {
            return mInner.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean flag)
        {
            if (mListener != null)
            {
                mListener.onActionProviderVisibilityChanged(flag);
            }
        }

        public View onCreateActionView(MenuItem menuitem)
        {
            return mInner.onCreateActionView(menuitem);
        }

        public boolean overridesItemVisibility()
        {
            return mInner.overridesItemVisibility();
        }

        public void refreshVisibility()
        {
            mInner.refreshVisibility();
        }

        public void setVisibilityListener(android.view.ActionProvider.VisibilityListener visibilitylistener)
        {
            mListener = visibilitylistener;
            ActionProvider actionprovider = mInner;
            if (visibilitylistener != null)
            {
                visibilitylistener = this;
            } else
            {
                visibilitylistener = null;
            }
            actionprovider.setVisibilityListener(visibilitylistener);
        }

        public ActionProviderWrapperJB(ActionProvider actionprovider)
        {
            this$0 = MenuItemWrapperJB.this;
            super(MenuItemWrapperJB.this, actionprovider);
        }
    }


    MenuItemWrapperJB(MenuItem menuitem)
    {
        super(menuitem, false);
    }

    MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
    {
        return new ActionProviderWrapperJB(actionprovider);
    }
}
