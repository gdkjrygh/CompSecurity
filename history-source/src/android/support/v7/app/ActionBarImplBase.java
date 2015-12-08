// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.internal.view.ActionBarPolicy;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.SubMenuBuilder;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ActionBarView;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.support.v7.view.ActionMode;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.SpinnerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            ActionBar, ActionBarActivity

class ActionBarImplBase extends ActionBar
{
    class ActionModeImpl extends ActionMode
        implements android.support.v7.internal.view.menu.MenuBuilder.Callback
    {

        private android.support.v7.view.ActionMode.Callback mCallback;
        private WeakReference mCustomView;
        private MenuBuilder mMenu;
        final ActionBarImplBase this$0;

        public boolean dispatchOnCreate()
        {
            mMenu.stopDispatchingItemsChanged();
            boolean flag = mCallback.onCreateActionMode(this, mMenu);
            mMenu.startDispatchingItemsChanged();
            return flag;
            Exception exception;
            exception;
            mMenu.startDispatchingItemsChanged();
            throw exception;
        }

        public void finish()
        {
            if (mActionMode != this)
            {
                return;
            }
            if (!ActionBarImplBase.checkShowingFlags(mHiddenByApp, mHiddenBySystem, false))
            {
                mDeferredDestroyActionMode = this;
                mDeferredModeDestroyCallback = mCallback;
            } else
            {
                mCallback.onDestroyActionMode(this);
            }
            mCallback = null;
            animateToMode(false);
            mContextView.closeMode();
            mActionView.sendAccessibilityEvent(32);
            mActionMode = null;
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
            return new SupportMenuInflater(getThemedContext());
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
            mMenu.stopDispatchingItemsChanged();
            mCallback.onPrepareActionMode(this, mMenu);
            mMenu.startDispatchingItemsChanged();
            return;
            Exception exception;
            exception;
            mMenu.startDispatchingItemsChanged();
            throw exception;
        }

        public boolean isTitleOptional()
        {
            return mContextView.isTitleOptional();
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
                return mCallback.onActionItemClicked(this, menuitem);
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
                mContextView.showOverflowMenu();
                return;
            }
        }

        public void onMenuModeChange(Menu menu)
        {
            if (mCallback == null)
            {
                return;
            } else
            {
                invalidate();
                mContextView.showOverflowMenu();
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
            if (!submenubuilder.hasVisibleItems())
            {
                return true;
            }
            return flag;
        }

        public void setCustomView(View view)
        {
            mContextView.setCustomView(view);
            mCustomView = new WeakReference(view);
        }

        public void setSubtitle(int i)
        {
            setSubtitle(((CharSequence) (mContext.getResources().getString(i))));
        }

        public void setSubtitle(CharSequence charsequence)
        {
            mContextView.setSubtitle(charsequence);
        }

        public void setTitle(int i)
        {
            setTitle(((CharSequence) (mContext.getResources().getString(i))));
        }

        public void setTitle(CharSequence charsequence)
        {
            mContextView.setTitle(charsequence);
        }

        public void setTitleOptionalHint(boolean flag)
        {
            super.setTitleOptionalHint(flag);
            mContextView.setTitleOptional(flag);
        }

        public ActionModeImpl(android.support.v7.view.ActionMode.Callback callback)
        {
            this$0 = ActionBarImplBase.this;
            super();
            mCallback = callback;
            mMenu = (new MenuBuilder(getThemedContext())).setDefaultShowAsAction(1);
            mMenu.setCallback(this);
        }
    }

    public class TabImpl extends ActionBar.Tab
    {

        private ActionBar.TabListener mCallback;
        private CharSequence mContentDesc;
        private View mCustomView;
        private Drawable mIcon;
        private int mPosition;
        private Object mTag;
        private CharSequence mText;
        final ActionBarImplBase this$0;

        public ActionBar.TabListener getCallback()
        {
            return mCallback;
        }

        public CharSequence getContentDescription()
        {
            return mContentDesc;
        }

        public View getCustomView()
        {
            return mCustomView;
        }

        public Drawable getIcon()
        {
            return mIcon;
        }

        public int getPosition()
        {
            return mPosition;
        }

        public Object getTag()
        {
            return mTag;
        }

        public CharSequence getText()
        {
            return mText;
        }

        public void select()
        {
            selectTab(this);
        }

        public ActionBar.Tab setContentDescription(int i)
        {
            return setContentDescription(mContext.getResources().getText(i));
        }

        public ActionBar.Tab setContentDescription(CharSequence charsequence)
        {
            mContentDesc = charsequence;
            if (mPosition >= 0)
            {
                mTabScrollView.updateTab(mPosition);
            }
            return this;
        }

        public ActionBar.Tab setCustomView(int i)
        {
            return setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, null));
        }

        public ActionBar.Tab setCustomView(View view)
        {
            mCustomView = view;
            if (mPosition >= 0)
            {
                mTabScrollView.updateTab(mPosition);
            }
            return this;
        }

        public ActionBar.Tab setIcon(int i)
        {
            return setIcon(mContext.getResources().getDrawable(i));
        }

        public ActionBar.Tab setIcon(Drawable drawable)
        {
            mIcon = drawable;
            if (mPosition >= 0)
            {
                mTabScrollView.updateTab(mPosition);
            }
            return this;
        }

        public void setPosition(int i)
        {
            mPosition = i;
        }

        public ActionBar.Tab setTabListener(ActionBar.TabListener tablistener)
        {
            mCallback = tablistener;
            return this;
        }

        public ActionBar.Tab setTag(Object obj)
        {
            mTag = obj;
            return this;
        }

        public ActionBar.Tab setText(int i)
        {
            return setText(mContext.getResources().getText(i));
        }

        public ActionBar.Tab setText(CharSequence charsequence)
        {
            mText = charsequence;
            if (mPosition >= 0)
            {
                mTabScrollView.updateTab(mPosition);
            }
            return this;
        }

        public TabImpl()
        {
            this$0 = ActionBarImplBase.this;
            super();
            mPosition = -1;
        }
    }


    private static final int CONTEXT_DISPLAY_NORMAL = 0;
    private static final int CONTEXT_DISPLAY_SPLIT = 1;
    private static final int INVALID_POSITION = -1;
    ActionModeImpl mActionMode;
    private ActionBarView mActionView;
    private ActionBarActivity mActivity;
    private ActionBar.Callback mCallback;
    private ActionBarContainer mContainerView;
    private View mContentView;
    private Context mContext;
    private int mContextDisplayMode;
    private ActionBarContextView mContextView;
    private int mCurWindowVisibility;
    ActionMode mDeferredDestroyActionMode;
    android.support.v7.view.ActionMode.Callback mDeferredModeDestroyCallback;
    private Dialog mDialog;
    private boolean mDisplayHomeAsUpSet;
    final Handler mHandler = new Handler();
    private boolean mHasEmbeddedTabs;
    private boolean mHiddenByApp;
    private boolean mHiddenBySystem;
    private boolean mLastMenuVisibility;
    private ArrayList mMenuVisibilityListeners;
    private boolean mNowShowing;
    private ActionBarOverlayLayout mOverlayLayout;
    private int mSavedTabPosition;
    private TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    private boolean mShowingForMode;
    private ActionBarContainer mSplitView;
    private ScrollingTabContainerView mTabScrollView;
    Runnable mTabSelector;
    private ArrayList mTabs;
    private Context mThemedContext;
    private ViewGroup mTopVisibilityView;

    public ActionBarImplBase(ActionBarActivity actionbaractivity, ActionBar.Callback callback)
    {
        mTabs = new ArrayList();
        mSavedTabPosition = -1;
        mMenuVisibilityListeners = new ArrayList();
        mCurWindowVisibility = 0;
        mNowShowing = true;
        mActivity = actionbaractivity;
        mContext = actionbaractivity;
        mCallback = callback;
        init(mActivity);
    }

    private static boolean checkShowingFlags(boolean flag, boolean flag1, boolean flag2)
    {
        while (flag2 || !flag && !flag1) 
        {
            return true;
        }
        return false;
    }

    private void cleanupTabs()
    {
        if (mSelectedTab != null)
        {
            selectTab(null);
        }
        mTabs.clear();
        if (mTabScrollView != null)
        {
            mTabScrollView.removeAllTabs();
        }
        mSavedTabPosition = -1;
    }

    private void configureTab(ActionBar.Tab tab, int i)
    {
        tab = (TabImpl)tab;
        if (tab.getCallback() == null)
        {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        tab.setPosition(i);
        mTabs.add(i, tab);
        int j = mTabs.size();
        for (i++; i < j; i++)
        {
            ((TabImpl)mTabs.get(i)).setPosition(i);
        }

    }

    private void ensureTabsExist()
    {
        if (mTabScrollView != null)
        {
            return;
        }
        ScrollingTabContainerView scrollingtabcontainerview = new ScrollingTabContainerView(mContext);
        if (mHasEmbeddedTabs)
        {
            scrollingtabcontainerview.setVisibility(0);
            mActionView.setEmbeddedTabView(scrollingtabcontainerview);
        } else
        {
            if (getNavigationMode() == 2)
            {
                scrollingtabcontainerview.setVisibility(0);
            } else
            {
                scrollingtabcontainerview.setVisibility(8);
            }
            mContainerView.setTabContainer(scrollingtabcontainerview);
        }
        mTabScrollView = scrollingtabcontainerview;
    }

    private void init(ActionBarActivity actionbaractivity)
    {
        boolean flag = false;
        mOverlayLayout = (ActionBarOverlayLayout)actionbaractivity.findViewById(android.support.v7.appcompat.R.id.action_bar_overlay_layout);
        if (mOverlayLayout != null)
        {
            mOverlayLayout.setActionBar(this);
        }
        mActionView = (ActionBarView)actionbaractivity.findViewById(android.support.v7.appcompat.R.id.action_bar);
        mContextView = (ActionBarContextView)actionbaractivity.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
        mContainerView = (ActionBarContainer)actionbaractivity.findViewById(android.support.v7.appcompat.R.id.action_bar_container);
        mTopVisibilityView = (ViewGroup)actionbaractivity.findViewById(android.support.v7.appcompat.R.id.top_action_bar);
        if (mTopVisibilityView == null)
        {
            mTopVisibilityView = mContainerView;
        }
        mSplitView = (ActionBarContainer)actionbaractivity.findViewById(android.support.v7.appcompat.R.id.split_action_bar);
        if (mActionView == null || mContextView == null || mContainerView == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with a compatible window decor layout").toString());
        }
        mActionView.setContextView(mContextView);
        int i;
        if (mActionView.isSplitActionBar())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        mContextDisplayMode = i;
        if ((mActionView.getDisplayOptions() & 4) != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            mDisplayHomeAsUpSet = true;
        }
        actionbaractivity = ActionBarPolicy.get(mContext);
        if (actionbaractivity.enableHomeButtonByDefault() || i != 0)
        {
            flag = true;
        }
        setHomeButtonEnabled(flag);
        setHasEmbeddedTabs(actionbaractivity.hasEmbeddedTabs());
        setTitle(mActivity.getTitle());
    }

    private void setHasEmbeddedTabs(boolean flag)
    {
        boolean flag2 = true;
        mHasEmbeddedTabs = flag;
        ActionBarView actionbarview;
        boolean flag1;
        if (!mHasEmbeddedTabs)
        {
            mActionView.setEmbeddedTabView(null);
            mContainerView.setTabContainer(mTabScrollView);
        } else
        {
            mContainerView.setTabContainer(null);
            mActionView.setEmbeddedTabView(mTabScrollView);
        }
        if (getNavigationMode() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (mTabScrollView != null)
        {
            if (flag1)
            {
                mTabScrollView.setVisibility(0);
            } else
            {
                mTabScrollView.setVisibility(8);
            }
        }
        actionbarview = mActionView;
        if (!mHasEmbeddedTabs && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        actionbarview.setCollapsable(flag);
    }

    private void updateVisibility(boolean flag)
    {
        if (checkShowingFlags(mHiddenByApp, mHiddenBySystem, mShowingForMode))
        {
            if (!mNowShowing)
            {
                mNowShowing = true;
                doShow(flag);
            }
        } else
        if (mNowShowing)
        {
            mNowShowing = false;
            doHide(flag);
            return;
        }
    }

    public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.add(onmenuvisibilitylistener);
    }

    public void addTab(ActionBar.Tab tab)
    {
        addTab(tab, mTabs.isEmpty());
    }

    public void addTab(ActionBar.Tab tab, int i)
    {
        addTab(tab, i, mTabs.isEmpty());
    }

    public void addTab(ActionBar.Tab tab, int i, boolean flag)
    {
        ensureTabsExist();
        mTabScrollView.addTab(tab, i, flag);
        configureTab(tab, i);
        if (flag)
        {
            selectTab(tab);
        }
    }

    public void addTab(ActionBar.Tab tab, boolean flag)
    {
        ensureTabsExist();
        mTabScrollView.addTab(tab, flag);
        configureTab(tab, mTabs.size());
        if (flag)
        {
            selectTab(tab);
        }
    }

    void animateToMode(boolean flag)
    {
        byte byte0 = 8;
        Object obj;
        int i;
        if (flag)
        {
            showForActionMode();
        } else
        {
            hideForActionMode();
        }
        obj = mActionView;
        if (flag)
        {
            i = 4;
        } else
        {
            i = 0;
        }
        ((ActionBarView) (obj)).animateToVisibility(i);
        obj = mContextView;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ActionBarContextView) (obj)).animateToVisibility(i);
        if (mTabScrollView != null && !mActionView.hasEmbeddedTabs() && mActionView.isCollapsed())
        {
            ScrollingTabContainerView scrollingtabcontainerview = mTabScrollView;
            if (flag)
            {
                i = byte0;
            } else
            {
                i = 0;
            }
            scrollingtabcontainerview.setVisibility(i);
        }
    }

    public void doHide(boolean flag)
    {
        mTopVisibilityView.clearAnimation();
        if (mTopVisibilityView.getVisibility() != 8)
        {
            boolean flag1;
            if (isShowHideAnimationEnabled() || flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                android.view.animation.Animation animation = AnimationUtils.loadAnimation(mContext, android.support.v7.appcompat.R.anim.abc_slide_out_top);
                mTopVisibilityView.startAnimation(animation);
            }
            mTopVisibilityView.setVisibility(8);
            if (mSplitView != null && mSplitView.getVisibility() != 8)
            {
                if (flag1)
                {
                    android.view.animation.Animation animation1 = AnimationUtils.loadAnimation(mContext, android.support.v7.appcompat.R.anim.abc_slide_out_bottom);
                    mSplitView.startAnimation(animation1);
                }
                mSplitView.setVisibility(8);
                return;
            }
        }
    }

    public void doShow(boolean flag)
    {
        mTopVisibilityView.clearAnimation();
        if (mTopVisibilityView.getVisibility() != 0)
        {
            boolean flag1;
            if (isShowHideAnimationEnabled() || flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                android.view.animation.Animation animation = AnimationUtils.loadAnimation(mContext, android.support.v7.appcompat.R.anim.abc_slide_in_top);
                mTopVisibilityView.startAnimation(animation);
            }
            mTopVisibilityView.setVisibility(0);
            if (mSplitView != null && mSplitView.getVisibility() != 0)
            {
                if (flag1)
                {
                    android.view.animation.Animation animation1 = AnimationUtils.loadAnimation(mContext, android.support.v7.appcompat.R.anim.abc_slide_in_bottom);
                    mSplitView.startAnimation(animation1);
                }
                mSplitView.setVisibility(0);
                return;
            }
        }
    }

    public View getCustomView()
    {
        return mActionView.getCustomNavigationView();
    }

    public int getDisplayOptions()
    {
        return mActionView.getDisplayOptions();
    }

    public int getHeight()
    {
        return mContainerView.getHeight();
    }

    public int getNavigationItemCount()
    {
        mActionView.getNavigationMode();
        JVM INSTR tableswitch 1 2: default 28
    //                   1 38
    //                   2 30;
           goto _L1 _L2 _L3
_L1:
        return 0;
_L3:
        SpinnerAdapter spinneradapter;
        return mTabs.size();
_L2:
        if ((spinneradapter = mActionView.getDropdownAdapter()) != null)
        {
            return spinneradapter.getCount();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int getNavigationMode()
    {
        return mActionView.getNavigationMode();
    }

    public int getSelectedNavigationIndex()
    {
        mActionView.getNavigationMode();
        JVM INSTR tableswitch 1 2: default 28
    //                   1 45
    //                   2 30;
           goto _L1 _L2 _L3
_L1:
        return -1;
_L3:
        if (mSelectedTab != null)
        {
            return mSelectedTab.getPosition();
        }
          goto _L1
_L2:
        return mActionView.getDropdownSelectedPosition();
    }

    public ActionBar.Tab getSelectedTab()
    {
        return mSelectedTab;
    }

    public CharSequence getSubtitle()
    {
        return mActionView.getSubtitle();
    }

    public ActionBar.Tab getTabAt(int i)
    {
        return (ActionBar.Tab)mTabs.get(i);
    }

    public int getTabCount()
    {
        return mTabs.size();
    }

    public Context getThemedContext()
    {
        if (mThemedContext == null)
        {
            TypedValue typedvalue = new TypedValue();
            mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
            int i = typedvalue.resourceId;
            if (i != 0)
            {
                mThemedContext = new ContextThemeWrapper(mContext, i);
            } else
            {
                mThemedContext = mContext;
            }
        }
        return mThemedContext;
    }

    public CharSequence getTitle()
    {
        return mActionView.getTitle();
    }

    public boolean hasNonEmbeddedTabs()
    {
        return !mHasEmbeddedTabs && getNavigationMode() == 2;
    }

    public void hide()
    {
        if (!mHiddenByApp)
        {
            mHiddenByApp = true;
            updateVisibility(false);
        }
    }

    void hideForActionMode()
    {
        if (mShowingForMode)
        {
            mShowingForMode = false;
            updateVisibility(false);
        }
    }

    boolean isShowHideAnimationEnabled()
    {
        return mShowHideAnimationEnabled;
    }

    public boolean isShowing()
    {
        return mNowShowing;
    }

    public ActionBar.Tab newTab()
    {
        return new TabImpl();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
    }

    public void removeAllTabs()
    {
        cleanupTabs();
    }

    public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.remove(onmenuvisibilitylistener);
    }

    public void removeTab(ActionBar.Tab tab)
    {
        removeTabAt(tab.getPosition());
    }

    public void removeTabAt(int i)
    {
        if (mTabScrollView != null)
        {
            TabImpl tabimpl;
            int j;
            int l;
            if (mSelectedTab != null)
            {
                j = mSelectedTab.getPosition();
            } else
            {
                j = mSavedTabPosition;
            }
            mTabScrollView.removeTabAt(i);
            tabimpl = (TabImpl)mTabs.remove(i);
            if (tabimpl != null)
            {
                tabimpl.setPosition(-1);
            }
            l = mTabs.size();
            for (int k = i; k < l; k++)
            {
                ((TabImpl)mTabs.get(k)).setPosition(k);
            }

            if (j == i)
            {
                Object obj;
                if (mTabs.isEmpty())
                {
                    obj = null;
                } else
                {
                    obj = (TabImpl)mTabs.get(Math.max(0, i - 1));
                }
                selectTab(((ActionBar.Tab) (obj)));
                return;
            }
        }
    }

    public void selectTab(ActionBar.Tab tab)
    {
        int i = -1;
        if (getNavigationMode() == 2) goto _L2; else goto _L1
_L1:
        if (tab != null)
        {
            i = tab.getPosition();
        }
        mSavedTabPosition = i;
_L4:
        return;
_L2:
        FragmentTransaction fragmenttransaction;
        fragmenttransaction = mActivity.getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        if (mSelectedTab != tab)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mSelectedTab != null)
        {
            mSelectedTab.getCallback().onTabReselected(mSelectedTab, fragmenttransaction);
            mTabScrollView.animateToTab(tab.getPosition());
        }
_L5:
        if (!fragmenttransaction.isEmpty())
        {
            fragmenttransaction.commit();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        ScrollingTabContainerView scrollingtabcontainerview = mTabScrollView;
        if (tab != null)
        {
            i = tab.getPosition();
        }
        scrollingtabcontainerview.setTabSelected(i);
        if (mSelectedTab != null)
        {
            mSelectedTab.getCallback().onTabUnselected(mSelectedTab, fragmenttransaction);
        }
        mSelectedTab = (TabImpl)tab;
        if (mSelectedTab != null)
        {
            mSelectedTab.getCallback().onTabSelected(mSelectedTab, fragmenttransaction);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        mContainerView.setPrimaryBackground(drawable);
    }

    public void setCustomView(int i)
    {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, mActionView, false));
    }

    public void setCustomView(View view)
    {
        mActionView.setCustomNavigationView(view);
    }

    public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
    {
        view.setLayoutParams(layoutparams);
        mActionView.setCustomNavigationView(view);
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 4);
    }

    public void setDisplayOptions(int i)
    {
        if ((i & 4) != 0)
        {
            mDisplayHomeAsUpSet = true;
        }
        mActionView.setDisplayOptions(i);
    }

    public void setDisplayOptions(int i, int j)
    {
        int k = mActionView.getDisplayOptions();
        if ((j & 4) != 0)
        {
            mDisplayHomeAsUpSet = true;
        }
        mActionView.setDisplayOptions(i & j | ~j & k);
    }

    public void setDisplayShowCustomEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 16);
    }

    public void setDisplayShowHomeEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 2);
    }

    public void setDisplayShowTitleEnabled(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        setDisplayOptions(byte0, 8);
    }

    public void setDisplayUseLogoEnabled(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        setDisplayOptions(i, 1);
    }

    public void setHomeAsUpIndicator(int i)
    {
        mActionView.setHomeAsUpIndicator(i);
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        mActionView.setHomeAsUpIndicator(drawable);
    }

    public void setHomeButtonEnabled(boolean flag)
    {
        mActionView.setHomeButtonEnabled(flag);
    }

    public void setIcon(int i)
    {
        mActionView.setIcon(i);
    }

    public void setIcon(Drawable drawable)
    {
        mActionView.setIcon(drawable);
    }

    public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
    {
        mActionView.setDropdownAdapter(spinneradapter);
        mActionView.setCallback(onnavigationlistener);
    }

    public void setLogo(int i)
    {
        mActionView.setLogo(i);
    }

    public void setLogo(Drawable drawable)
    {
        mActionView.setLogo(drawable);
    }

    public void setNavigationMode(int i)
    {
        boolean flag1 = false;
        mActionView.getNavigationMode();
        JVM INSTR tableswitch 2 2: default 28
    //                   2 87;
           goto _L1 _L2
_L1:
        mActionView.setNavigationMode(i);
        i;
        JVM INSTR tableswitch 2 2: default 56
    //                   2 112;
           goto _L3 _L4
_L3:
        ActionBarView actionbarview = mActionView;
        boolean flag = flag1;
        if (i == 2)
        {
            flag = flag1;
            if (!mHasEmbeddedTabs)
            {
                flag = true;
            }
        }
        actionbarview.setCollapsable(flag);
        return;
_L2:
        mSavedTabPosition = getSelectedNavigationIndex();
        selectTab(null);
        mTabScrollView.setVisibility(8);
          goto _L1
_L4:
        ensureTabsExist();
        mTabScrollView.setVisibility(0);
        if (mSavedTabPosition != -1)
        {
            setSelectedNavigationItem(mSavedTabPosition);
            mSavedTabPosition = -1;
        }
          goto _L3
    }

    public void setSelectedNavigationItem(int i)
    {
        switch (mActionView.getNavigationMode())
        {
        default:
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");

        case 2: // '\002'
            selectTab((ActionBar.Tab)mTabs.get(i));
            return;

        case 1: // '\001'
            mActionView.setDropdownSelectedPosition(i);
            return;
        }
    }

    public void setShowHideAnimationEnabled(boolean flag)
    {
        mShowHideAnimationEnabled = flag;
        if (!flag)
        {
            mTopVisibilityView.clearAnimation();
            if (mSplitView != null)
            {
                mSplitView.clearAnimation();
            }
        }
    }

    public void setSplitBackgroundDrawable(Drawable drawable)
    {
        mContainerView.setSplitBackground(drawable);
    }

    public void setStackedBackgroundDrawable(Drawable drawable)
    {
        mContainerView.setStackedBackground(drawable);
    }

    public void setSubtitle(int i)
    {
        setSubtitle(((CharSequence) (mContext.getString(i))));
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mActionView.setSubtitle(charsequence);
    }

    public void setTitle(int i)
    {
        setTitle(((CharSequence) (mContext.getString(i))));
    }

    public void setTitle(CharSequence charsequence)
    {
        mActionView.setTitle(charsequence);
    }

    public void show()
    {
        if (mHiddenByApp)
        {
            mHiddenByApp = false;
            updateVisibility(false);
        }
    }

    void showForActionMode()
    {
        if (!mShowingForMode)
        {
            mShowingForMode = true;
            updateVisibility(false);
        }
    }

    public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        mContextView.killMode();
        callback = new ActionModeImpl(callback);
        if (callback.dispatchOnCreate())
        {
            callback.invalidate();
            mContextView.initForMode(callback);
            animateToMode(true);
            if (mSplitView != null && mContextDisplayMode == 1 && mSplitView.getVisibility() != 0)
            {
                mSplitView.setVisibility(0);
            }
            mContextView.sendAccessibilityEvent(32);
            mActionMode = callback;
            return callback;
        } else
        {
            return null;
        }
    }







}
