// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.view.menu:
//            MenuItemWrapperICS

class MenuItemWrapperJB extends MenuItemWrapperICS
{
    class ActionProviderWrapperJB extends MenuItemWrapperICS.ActionProviderWrapper
        implements android.view.ActionProvider.VisibilityListener
    {

        android.support.v4.view.ActionProvider.VisibilityListener mListener;
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

        public void setVisibilityListener(android.support.v4.view.ActionProvider.VisibilityListener visibilitylistener)
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

        public ActionProviderWrapperJB(Context context, ActionProvider actionprovider)
        {
            this$0 = MenuItemWrapperJB.this;
            super(MenuItemWrapperJB.this, context, actionprovider);
        }
    }


    MenuItemWrapperJB(Context context, SupportMenuItem supportmenuitem)
    {
        super(context, supportmenuitem);
    }

    MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
    {
        return new ActionProviderWrapperJB(mContext, actionprovider);
    }
}
