// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.view.menu:
//            MenuItemWrapperJB

class init> extends init>
    implements android.view.roviderWrapper
{

    android.support.v4.view.erJB.mInner mListener;
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

    public void setVisibilityListener(android.support.v4.view.erJB erjb)
    {
        mListener = erjb;
        ActionProvider actionprovider = mInner;
        if (erjb != null)
        {
            erjb = this;
        } else
        {
            erjb = null;
        }
        actionprovider.setVisibilityListener(erjb);
    }

    public (Context context, ActionProvider actionprovider)
    {
        this$0 = MenuItemWrapperJB.this;
        super(MenuItemWrapperJB.this, context, actionprovider);
    }
}
