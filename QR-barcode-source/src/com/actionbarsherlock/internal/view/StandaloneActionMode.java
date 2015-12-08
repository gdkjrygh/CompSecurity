// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view;

import android.content.Context;
import android.view.View;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuPopupHelper;
import com.actionbarsherlock.internal.view.menu.SubMenuBuilder;
import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.lang.ref.WeakReference;

public class StandaloneActionMode extends ActionMode
    implements com.actionbarsherlock.internal.view.menu.MenuBuilder.Callback
{

    private com.actionbarsherlock.view.ActionMode.Callback mCallback;
    private Context mContext;
    private ActionBarContextView mContextView;
    private WeakReference mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private MenuBuilder mMenu;

    public StandaloneActionMode(Context context, ActionBarContextView actionbarcontextview, com.actionbarsherlock.view.ActionMode.Callback callback, boolean flag)
    {
        mContext = context;
        mContextView = actionbarcontextview;
        mCallback = callback;
        mMenu = (new MenuBuilder(context)).setDefaultShowAsAction(1);
        mMenu.setCallback(this);
        mFocusable = flag;
    }

    public void finish()
    {
        if (mFinished)
        {
            return;
        } else
        {
            mFinished = true;
            mContextView.sendAccessibilityEvent(32);
            mCallback.onDestroyActionMode(this);
            return;
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
        return new MenuInflater(mContext);
    }

    public CharSequence getSubtitle()
    {
        return mContextView.getSubtitle();
    }

    public CharSequence getTitle()
    {
        return mContextView.getTitle();
    }

    public void invalidate()
    {
        mCallback.onPrepareActionMode(this, mMenu);
    }

    public boolean isUiFocusable()
    {
        return mFocusable;
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
    }

    public void onCloseSubMenu(SubMenuBuilder submenubuilder)
    {
    }

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return mCallback.onActionItemClicked(this, menuitem);
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
        invalidate();
        mContextView.showOverflowMenu();
    }

    public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
    {
        if (!submenubuilder.hasVisibleItems())
        {
            return true;
        } else
        {
            (new MenuPopupHelper(mContext, submenubuilder)).show();
            return true;
        }
    }

    public void setCustomView(View view)
    {
        mContextView.setCustomView(view);
        if (view != null)
        {
            view = new WeakReference(view);
        } else
        {
            view = null;
        }
        mCustomView = view;
    }

    public void setSubtitle(int i)
    {
        setSubtitle(((CharSequence) (mContext.getString(i))));
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mContextView.setSubtitle(charsequence);
    }

    public void setTitle(int i)
    {
        setTitle(((CharSequence) (mContext.getString(i))));
    }

    public void setTitle(CharSequence charsequence)
    {
        mContextView.setTitle(charsequence);
    }
}
