// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v4.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuItemWrapperJB

class init> extends init>
    implements android.support.v4.view.viderWrapper
{

    android.view.er mListener;
    final MenuItemWrapperJB this$0;

    public boolean isVisible()
    {
        return mInner.isVisible();
    }

    public void onActionProviderVisibilityChanged(boolean flag)
    {
        if (mListener != null)
        {
            mListener.ProviderVisibilityChanged(flag);
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

    public void setVisibilityListener(android.view..ActionProviderWrapperJB actionproviderwrapperjb)
    {
        mListener = actionproviderwrapperjb;
        ActionProvider actionprovider = mInner;
        if (actionproviderwrapperjb != null)
        {
            actionproviderwrapperjb = this;
        } else
        {
            actionproviderwrapperjb = null;
        }
        actionprovider.setVisibilityListener(actionproviderwrapperjb);
    }

    public (ActionProvider actionprovider)
    {
        this$0 = MenuItemWrapperJB.this;
        super(MenuItemWrapperJB.this, actionprovider);
    }
}
