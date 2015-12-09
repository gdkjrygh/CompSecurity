// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class StandaloneActionMode extends ActionMode
    implements android.support.v7.internal.view.menu.MenuBuilder.Callback
{

    private android.support.v7.view.ActionMode.Callback mCallback;
    private Context mContext;
    private ActionBarContextView mContextView;
    private WeakReference mCustomView;
    private boolean mFinished;
    private boolean mFocusable;
    private MenuBuilder mMenu;

    public StandaloneActionMode(Context context, ActionBarContextView actionbarcontextview, android.support.v7.view.ActionMode.Callback callback, boolean flag)
    {
        mContext = context;
        mContextView = actionbarcontextview;
        mCallback = callback;
        context = new MenuBuilder(actionbarcontextview.getContext());
        context.mDefaultShowAsAction = 1;
        mMenu = context;
        mMenu.setCallback(this);
        mFocusable = flag;
    }

    public final void finish()
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

    public final View getCustomView()
    {
        if (mCustomView != null)
        {
            return (View)mCustomView.get();
        } else
        {
            return null;
        }
    }

    public final Menu getMenu()
    {
        return mMenu;
    }

    public final MenuInflater getMenuInflater()
    {
        return new MenuInflater(mContextView.getContext());
    }

    public final CharSequence getSubtitle()
    {
        return mContextView.mSubtitle;
    }

    public final CharSequence getTitle()
    {
        return mContextView.mTitle;
    }

    public final void invalidate()
    {
        mCallback.onPrepareActionMode(this, mMenu);
    }

    public final boolean isTitleOptional()
    {
        return mContextView.mTitleOptional;
    }

    public final boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return mCallback.onActionItemClicked(this, menuitem);
    }

    public final void onMenuModeChange(MenuBuilder menubuilder)
    {
        invalidate();
        mContextView.showOverflowMenu();
    }

    public final void setCustomView(View view)
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

    public final void setSubtitle(int i)
    {
        setSubtitle(((CharSequence) (mContext.getString(i))));
    }

    public final void setSubtitle(CharSequence charsequence)
    {
        mContextView.setSubtitle(charsequence);
    }

    public final void setTitle(int i)
    {
        setTitle(((CharSequence) (mContext.getString(i))));
    }

    public final void setTitle(CharSequence charsequence)
    {
        mContextView.setTitle(charsequence);
    }

    public final void setTitleOptionalHint(boolean flag)
    {
        super.setTitleOptionalHint(flag);
        mContextView.setTitleOptional(flag);
    }
}
