// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.app;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuPopupHelper;
import com.actionbarsherlock.internal.view.menu.SubMenuBuilder;
import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.internal.widget.ActionBarView;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.lang.ref.WeakReference;

// Referenced classes of package com.actionbarsherlock.internal.app:
//            ActionBarImpl

public class  extends ActionMode
    implements com.actionbarsherlock.internal.view.menu.ction
{

    private com.actionbarsherlock.view.ew.setTitle mCallback;
    private WeakReference mCustomView;
    private MenuBuilder mMenu;
    final ActionBarImpl this$0;

    public boolean dispatchOnCreate()
    {
        mMenu.stopDispatchingItemsChanged();
        boolean flag = mCallback.ctionMode(this, mMenu);
        mMenu.startDispatchingItemsChanged();
        return flag;
        Exception exception;
        exception;
        mMenu.startDispatchingItemsChanged();
        throw exception;
    }

    public void finish()
    {
        if (mActionMode == this)
        {
            if (mWasHiddenBeforeMode)
            {
                mDeferredDestroyActionMode = this;
                mDeferredModeDestroyCallback = mCallback;
            } else
            {
                mCallback.ActionMode(this);
            }
            mCallback = null;
            animateToMode(false);
            ActionBarImpl.access$500(ActionBarImpl.this).closeMode();
            ActionBarImpl.access$600(ActionBarImpl.this).sendAccessibilityEvent(32);
            mActionMode = null;
            if (mWasHiddenBeforeMode)
            {
                hide();
                return;
            }
        }
    }

    public View getCustomView()
    {
        if (mCustomView != null)
        {
            return (View)mCustomView.get();
        } else
        {
            return null;
        }
    }

    public Menu getMenu()
    {
        return mMenu;
    }

    public MenuInflater getMenuInflater()
    {
        return new MenuInflater(getThemedContext());
    }

    public CharSequence getSubtitle()
    {
        return ActionBarImpl.access$500(ActionBarImpl.this).getSubtitle();
    }

    public CharSequence getTitle()
    {
        return ActionBarImpl.access$500(ActionBarImpl.this).getTitle();
    }

    public void invalidate()
    {
        mMenu.stopDispatchingItemsChanged();
        mCallback.ActionMode(this, mMenu);
        mMenu.startDispatchingItemsChanged();
        return;
        Exception exception;
        exception;
        mMenu.startDispatchingItemsChanged();
        throw exception;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    }

    public void onCloseSubMenu(SubMenuBuilder submenubuilder)
    {
    }

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        if (mCallback != null)
        {
            return mCallback.temClicked(this, menuitem);
        } else
        {
            return false;
        }
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
        if (mCallback == null)
        {
            return;
        } else
        {
            invalidate();
            ActionBarImpl.access$500(ActionBarImpl.this).showOverflowMenu();
            return;
        }
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        boolean flag = true;
        if (mCallback == null)
        {
            flag = false;
        } else
        if (submenubuilder.hasVisibleItems())
        {
            (new MenuPopupHelper(getThemedContext(), submenubuilder)).show();
            return true;
        }
        return flag;
    }

    public void setCustomView(View view)
    {
        ActionBarImpl.access$500(ActionBarImpl.this).setCustomView(view);
        mCustomView = new WeakReference(view);
    }

    public void setSubtitle(int i)
    {
        setSubtitle(((CharSequence) (ActionBarImpl.access$700(ActionBarImpl.this).getResources().getString(i))));
    }

    public void setSubtitle(CharSequence charsequence)
    {
        ActionBarImpl.access$500(ActionBarImpl.this).setSubtitle(charsequence);
    }

    public void setTitle(int i)
    {
        setTitle(((CharSequence) (ActionBarImpl.access$700(ActionBarImpl.this).getResources().getString(i))));
    }

    public void setTitle(CharSequence charsequence)
    {
        ActionBarImpl.access$500(ActionBarImpl.this).setTitle(charsequence);
    }

    public (com.actionbarsherlock.view.odeImpl odeimpl)
    {
        this$0 = ActionBarImpl.this;
        super();
        mCallback = odeimpl;
        mMenu = (new MenuBuilder(getThemedContext())).setDefaultShowAsAction(1);
        mMenu.setCallback(this);
    }
}
