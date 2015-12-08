// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.ListMenuPresenter;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuView;
import android.support.v7.internal.view.menu.MenuWrapperFactory;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarView;
import android.support.v7.internal.widget.ProgressBarICS;
import android.support.v7.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegate, ActionBarActivity, ActionBarImplBase, ActionBar

class ActionBarActivityDelegateBase extends ActionBarActivityDelegate
    implements android.support.v7.internal.view.menu.MenuPresenter.Callback, android.support.v7.internal.view.menu.MenuBuilder.Callback
{
    private class ActionBarDrawableToggleImpl
        implements android.support.v4.app.ActionBarDrawerToggle.Delegate
    {

        final ActionBarActivityDelegateBase this$0;

        public Drawable getThemeUpIndicator()
        {
            TypedArray typedarray = mActivity.obtainStyledAttributes(ActionBarActivityDelegateBase.ACTION_BAR_DRAWABLE_TOGGLE_ATTRS);
            Drawable drawable = typedarray.getDrawable(0);
            typedarray.recycle();
            return drawable;
        }

        public void setActionBarDescription(int i)
        {
        }

        public void setActionBarUpIndicator(Drawable drawable, int i)
        {
            if (mActionBarView != null)
            {
                mActionBarView.setHomeAsUpIndicator(drawable);
            }
        }

        private ActionBarDrawableToggleImpl()
        {
            this$0 = ActionBarActivityDelegateBase.this;
            super();
        }

    }

    private class ActionModeCallbackWrapper
        implements android.support.v7.view.ActionMode.Callback
    {

        private android.support.v7.view.ActionMode.Callback mWrapped;
        final ActionBarActivityDelegateBase this$0;

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            return mWrapped.onActionItemClicked(actionmode, menuitem);
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrapped.onCreateActionMode(actionmode, menu);
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
            mWrapped.onDestroyActionMode(actionmode);
            mActivity.onSupportActionModeFinished(actionmode);
            mActionMode = null;
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrapped.onPrepareActionMode(actionmode, menu);
        }

        public ActionModeCallbackWrapper(android.support.v7.view.ActionMode.Callback callback)
        {
            this$0 = ActionBarActivityDelegateBase.this;
            super();
            mWrapped = callback;
        }
    }


    private static final int ACTION_BAR_DRAWABLE_TOGGLE_ATTRS[];
    private static final String TAG = "ActionBarActivityDelegateBase";
    private ActionBarView mActionBarView;
    private ActionMode mActionMode;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mInvalidateMenuPosted;
    private final Runnable mInvalidateMenuRunnable = new Runnable() {

        final ActionBarActivityDelegateBase this$0;

        public void run()
        {
            MenuBuilder menubuilder = createMenu();
            if (mActivity.superOnCreatePanelMenu(0, menubuilder) && mActivity.superOnPreparePanel(0, null, menubuilder))
            {
                setMenu(menubuilder);
            } else
            {
                setMenu(null);
            }
            mInvalidateMenuPosted = false;
        }

            
            {
                this$0 = ActionBarActivityDelegateBase.this;
                super();
            }
    };
    private ListMenuPresenter mListMenuPresenter;
    private MenuBuilder mMenu;
    private boolean mSubDecorInstalled;
    private CharSequence mTitleToSet;

    ActionBarActivityDelegateBase(ActionBarActivity actionbaractivity)
    {
        super(actionbaractivity);
    }

    private MenuBuilder createMenu()
    {
        MenuBuilder menubuilder = new MenuBuilder(getActionBarThemedContext());
        menubuilder.setCallback(this);
        return menubuilder;
    }

    private ProgressBarICS getCircularProgressBar()
    {
        ProgressBarICS progressbarics = (ProgressBarICS)mActionBarView.findViewById(android.support.v7.appcompat.R.id.progress_circular);
        if (progressbarics != null)
        {
            progressbarics.setVisibility(4);
        }
        return progressbarics;
    }

    private ProgressBarICS getHorizontalProgressBar()
    {
        ProgressBarICS progressbarics = (ProgressBarICS)mActionBarView.findViewById(android.support.v7.appcompat.R.id.progress_horizontal);
        if (progressbarics != null)
        {
            progressbarics.setVisibility(4);
        }
        return progressbarics;
    }

    private MenuView getListMenuView(Context context, android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
    {
        if (mMenu == null)
        {
            return null;
        }
        if (mListMenuPresenter == null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.Theme);
            int i = typedarray.getResourceId(4, android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu);
            typedarray.recycle();
            mListMenuPresenter = new ListMenuPresenter(android.support.v7.appcompat.R.layout.abc_list_menu_item_layout, i);
            mListMenuPresenter.setCallback(callback);
            mMenu.addMenuPresenter(mListMenuPresenter);
        } else
        {
            mListMenuPresenter.updateMenuView(false);
        }
        return mListMenuPresenter.getMenuView(new FrameLayout(context));
    }

    private void hideProgressBars(ProgressBarICS progressbarics, ProgressBarICS progressbarics1)
    {
        if (mFeatureIndeterminateProgress && progressbarics1.getVisibility() == 0)
        {
            progressbarics1.setVisibility(4);
        }
        if (mFeatureProgress && progressbarics.getVisibility() == 0)
        {
            progressbarics.setVisibility(4);
        }
    }

    private void reopenMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (mActionBarView != null && mActionBarView.isOverflowReserved())
        {
            if (!mActionBarView.isOverflowMenuShowing() || !flag)
            {
                if (mActionBarView.getVisibility() == 0)
                {
                    mActionBarView.showOverflowMenu();
                }
                return;
            } else
            {
                mActionBarView.hideOverflowMenu();
                return;
            }
        } else
        {
            menubuilder.close();
            return;
        }
    }

    private void setMenu(MenuBuilder menubuilder)
    {
        if (menubuilder != mMenu)
        {
            if (mMenu != null)
            {
                mMenu.removeMenuPresenter(mListMenuPresenter);
            }
            mMenu = menubuilder;
            if (menubuilder != null && mListMenuPresenter != null)
            {
                menubuilder.addMenuPresenter(mListMenuPresenter);
            }
            if (mActionBarView != null)
            {
                mActionBarView.setMenu(menubuilder, this);
                return;
            }
        }
    }

    private void showProgressBars(ProgressBarICS progressbarics, ProgressBarICS progressbarics1)
    {
        if (mFeatureIndeterminateProgress && progressbarics1.getVisibility() == 4)
        {
            progressbarics1.setVisibility(0);
        }
        if (mFeatureProgress && progressbarics.getProgress() < 10000)
        {
            progressbarics.setVisibility(0);
        }
    }

    private void updateProgressBars(int i)
    {
        ProgressBarICS progressbarics;
        ProgressBarICS progressbarics1;
        progressbarics = getCircularProgressBar();
        progressbarics1 = getHorizontalProgressBar();
        if (i != -1) goto _L2; else goto _L1
_L1:
        if (mFeatureProgress)
        {
            i = progressbarics1.getProgress();
            if (progressbarics1.isIndeterminate() || i < 10000)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            progressbarics1.setVisibility(i);
        }
        if (mFeatureIndeterminateProgress)
        {
            progressbarics.setVisibility(0);
        }
_L4:
        return;
_L2:
        if (i != -2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mFeatureProgress)
        {
            progressbarics1.setVisibility(8);
        }
        if (mFeatureIndeterminateProgress)
        {
            progressbarics.setVisibility(8);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i == -3)
        {
            progressbarics1.setIndeterminate(true);
            return;
        }
        if (i == -4)
        {
            progressbarics1.setIndeterminate(false);
            return;
        }
        if (i >= 0 && i <= 10000)
        {
            progressbarics1.setProgress(i + 0);
            if (i < 10000)
            {
                showProgressBars(progressbarics1, progressbarics);
                return;
            } else
            {
                hideProgressBars(progressbarics1, progressbarics);
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ensureSubDecor();
        if (mHasActionBar)
        {
            ((ViewGroup)mActivity.findViewById(0x1020002)).addView(view, layoutparams);
        } else
        {
            mActivity.superSetContentView(view, layoutparams);
        }
        mActivity.onSupportContentChanged();
    }

    public ActionBar createSupportActionBar()
    {
        ensureSubDecor();
        return new ActionBarImplBase(mActivity, mActivity);
    }

    final void ensureSubDecor()
    {
        if (mHasActionBar && !mSubDecorInstalled)
        {
            ActionBarContainer actionbarcontainer;
            boolean flag;
            boolean flag1;
            if (mOverlayActionBar)
            {
                mActivity.superSetContentView(android.support.v7.appcompat.R.layout.abc_action_bar_decor_overlay);
            } else
            {
                mActivity.superSetContentView(android.support.v7.appcompat.R.layout.abc_action_bar_decor);
            }
            mActionBarView = (ActionBarView)mActivity.findViewById(android.support.v7.appcompat.R.id.action_bar);
            mActionBarView.setWindowCallback(mActivity);
            if (mFeatureProgress)
            {
                mActionBarView.initProgress();
            }
            if (mFeatureIndeterminateProgress)
            {
                mActionBarView.initIndeterminateProgress();
            }
            flag1 = "splitActionBarWhenNarrow".equals(getUiOptionsFromMetadata());
            if (flag1)
            {
                flag = mActivity.getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_split_action_bar_is_narrow);
            } else
            {
                TypedArray typedarray = mActivity.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.ActionBarWindow);
                flag = typedarray.getBoolean(2, false);
                typedarray.recycle();
            }
            actionbarcontainer = (ActionBarContainer)mActivity.findViewById(android.support.v7.appcompat.R.id.split_action_bar);
            if (actionbarcontainer != null)
            {
                mActionBarView.setSplitView(actionbarcontainer);
                mActionBarView.setSplitActionBar(flag);
                mActionBarView.setSplitWhenNarrow(flag1);
                ActionBarContextView actionbarcontextview = (ActionBarContextView)mActivity.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
                actionbarcontextview.setSplitView(actionbarcontainer);
                actionbarcontextview.setSplitActionBar(flag);
                actionbarcontextview.setSplitWhenNarrow(flag1);
            }
            mActivity.findViewById(0x1020002).setId(-1);
            mActivity.findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content).setId(0x1020002);
            if (mTitleToSet != null)
            {
                mActionBarView.setWindowTitle(mTitleToSet);
                mTitleToSet = null;
            }
            mSubDecorInstalled = true;
            supportInvalidateOptionsMenu();
        }
    }

    android.support.v4.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
    {
        return new ActionBarDrawableToggleImpl();
    }

    public boolean onBackPressed()
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
            return true;
        }
        if (mActionBarView != null && mActionBarView.hasExpandedActionView())
        {
            mActionBarView.collapseActionView();
            return true;
        } else
        {
            return false;
        }
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        mActivity.closeOptionsMenu();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (mHasActionBar && mSubDecorInstalled)
        {
            ((ActionBarImplBase)getSupportActionBar()).onConfigurationChanged(configuration);
        }
    }

    public void onContentChanged()
    {
    }

    public boolean onCreatePanelMenu(int i, Menu menu)
    {
        if (i != 0)
        {
            return mActivity.superOnCreatePanelMenu(i, menu);
        } else
        {
            return false;
        }
    }

    public View onCreatePanelView(int i)
    {
label0:
        {
            Object obj = null;
            if (i == 0)
            {
                boolean flag = true;
                boolean flag1 = true;
                MenuBuilder menubuilder = mMenu;
                Object obj1 = menubuilder;
                if (mActionMode == null)
                {
                    obj = menubuilder;
                    if (menubuilder == null)
                    {
                        obj = createMenu();
                        setMenu(((MenuBuilder) (obj)));
                        ((MenuBuilder) (obj)).stopDispatchingItemsChanged();
                        flag1 = mActivity.superOnCreatePanelMenu(0, ((Menu) (obj)));
                    }
                    obj1 = obj;
                    flag = flag1;
                    if (flag1)
                    {
                        ((MenuBuilder) (obj)).stopDispatchingItemsChanged();
                        flag = mActivity.superOnPreparePanel(0, null, ((Menu) (obj)));
                        obj1 = obj;
                    }
                }
                if (!flag)
                {
                    break label0;
                }
                obj = (View)getListMenuView(mActivity, this);
                ((MenuBuilder) (obj1)).startDispatchingItemsChanged();
            }
            return ((View) (obj));
        }
        setMenu(null);
        return null;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuitem)
    {
        MenuItem menuitem1 = menuitem;
        if (i == 0)
        {
            menuitem1 = MenuWrapperFactory.createMenuItemWrapper(menuitem);
        }
        return mActivity.superOnMenuItemSelected(i, menuitem1);
    }

    public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
    {
        return mActivity.onMenuItemSelected(0, menuitem);
    }

    public void onMenuModeChange(MenuBuilder menubuilder)
    {
        reopenMenu(menubuilder, true);
    }

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        return false;
    }

    public void onPostResume()
    {
        ActionBarImplBase actionbarimplbase = (ActionBarImplBase)getSupportActionBar();
        if (actionbarimplbase != null)
        {
            actionbarimplbase.setShowHideAnimationEnabled(true);
        }
    }

    public boolean onPreparePanel(int i, View view, Menu menu)
    {
        if (i != 0)
        {
            return mActivity.superOnPreparePanel(i, view, menu);
        } else
        {
            return false;
        }
    }

    public void onStop()
    {
        ActionBarImplBase actionbarimplbase = (ActionBarImplBase)getSupportActionBar();
        if (actionbarimplbase != null)
        {
            actionbarimplbase.setShowHideAnimationEnabled(false);
        }
    }

    public void onTitleChanged(CharSequence charsequence)
    {
        if (mActionBarView != null)
        {
            mActionBarView.setWindowTitle(charsequence);
            return;
        } else
        {
            mTitleToSet = charsequence;
            return;
        }
    }

    public void setContentView(int i)
    {
        ensureSubDecor();
        if (mHasActionBar)
        {
            ViewGroup viewgroup = (ViewGroup)mActivity.findViewById(0x1020002);
            viewgroup.removeAllViews();
            mActivity.getLayoutInflater().inflate(i, viewgroup);
        } else
        {
            mActivity.superSetContentView(i);
        }
        mActivity.onSupportContentChanged();
    }

    public void setContentView(View view)
    {
        ensureSubDecor();
        if (mHasActionBar)
        {
            ViewGroup viewgroup = (ViewGroup)mActivity.findViewById(0x1020002);
            viewgroup.removeAllViews();
            viewgroup.addView(view);
        } else
        {
            mActivity.superSetContentView(view);
        }
        mActivity.onSupportContentChanged();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        ensureSubDecor();
        if (mHasActionBar)
        {
            ViewGroup viewgroup = (ViewGroup)mActivity.findViewById(0x1020002);
            viewgroup.removeAllViews();
            viewgroup.addView(view, layoutparams);
        } else
        {
            mActivity.superSetContentView(view, layoutparams);
        }
        mActivity.onSupportContentChanged();
    }

    void setSupportProgress(int i)
    {
        updateProgressBars(i + 0);
    }

    void setSupportProgressBarIndeterminate(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = -3;
        } else
        {
            byte0 = -4;
        }
        updateProgressBars(byte0);
    }

    void setSupportProgressBarIndeterminateVisibility(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = -1;
        } else
        {
            byte0 = -2;
        }
        updateProgressBars(byte0);
    }

    void setSupportProgressBarVisibility(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = -1;
        } else
        {
            byte0 = -2;
        }
        updateProgressBars(byte0);
    }

    public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        if (callback == null)
        {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        callback = new ActionModeCallbackWrapper(callback);
        ActionBarImplBase actionbarimplbase = (ActionBarImplBase)getSupportActionBar();
        if (actionbarimplbase != null)
        {
            mActionMode = actionbarimplbase.startActionMode(callback);
        }
        if (mActionMode != null)
        {
            mActivity.onSupportActionModeStarted(mActionMode);
        }
        return mActionMode;
    }

    public void supportInvalidateOptionsMenu()
    {
        if (!mInvalidateMenuPosted)
        {
            mInvalidateMenuPosted = true;
            mActivity.getWindow().getDecorView().post(mInvalidateMenuRunnable);
        }
    }

    public boolean supportRequestWindowFeature(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
        default:
            return mActivity.requestWindowFeature(i);

        case 8: // '\b'
            mHasActionBar = true;
            return true;

        case 9: // '\t'
            mOverlayActionBar = true;
            return true;

        case 2: // '\002'
            mFeatureProgress = true;
            return true;

        case 5: // '\005'
            mFeatureIndeterminateProgress = true;
            return true;
        }
    }

    static 
    {
        ACTION_BAR_DRAWABLE_TOGGLE_ATTRS = (new int[] {
            android.support.v7.appcompat.R.attr.homeAsUpIndicator
        });
    }




/*
    static boolean access$202(ActionBarActivityDelegateBase actionbaractivitydelegatebase, boolean flag)
    {
        actionbaractivitydelegatebase.mInvalidateMenuPosted = flag;
        return flag;
    }

*/


/*
    static ActionMode access$402(ActionBarActivityDelegateBase actionbaractivitydelegatebase, ActionMode actionmode)
    {
        actionbaractivitydelegatebase.mActionMode = actionmode;
        return actionmode;
    }

*/


}
