// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.SpinnerAdapter;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.ResourcesCompat;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorListenerAdapter;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
import com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator;
import com.actionbarsherlock.internal.nineoldandroids.widget.NineFrameLayout;
import com.actionbarsherlock.internal.view.menu.MenuBuilder;
import com.actionbarsherlock.internal.view.menu.MenuPopupHelper;
import com.actionbarsherlock.internal.view.menu.SubMenuBuilder;
import com.actionbarsherlock.internal.widget.ActionBarContainer;
import com.actionbarsherlock.internal.widget.ActionBarContextView;
import com.actionbarsherlock.internal.widget.ActionBarView;
import com.actionbarsherlock.internal.widget.ScrollingTabContainerView;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ActionBarImpl extends ActionBar
{
    public class ActionModeImpl extends ActionMode
        implements com.actionbarsherlock.internal.view.menu.MenuBuilder.Callback
    {

        private com.actionbarsherlock.view.ActionMode.Callback mCallback;
        private WeakReference mCustomView;
        private MenuBuilder mMenu;
        final ActionBarImpl this$0;

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
            if (mActionMode == this)
            {
                if (mWasHiddenBeforeMode)
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

        public ActionModeImpl(com.actionbarsherlock.view.ActionMode.Callback callback)
        {
            this$0 = ActionBarImpl.this;
            super();
            mCallback = callback;
            mMenu = (new MenuBuilder(getThemedContext())).setDefaultShowAsAction(1);
            mMenu.setCallback(this);
        }
    }

    public class TabImpl extends com.actionbarsherlock.app.ActionBar.Tab
    {

        private com.actionbarsherlock.app.ActionBar.TabListener mCallback;
        private CharSequence mContentDesc;
        private View mCustomView;
        private Drawable mIcon;
        private int mPosition;
        private Object mTag;
        private CharSequence mText;
        final ActionBarImpl this$0;

        public com.actionbarsherlock.app.ActionBar.TabListener getCallback()
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

        public com.actionbarsherlock.app.ActionBar.Tab setContentDescription(int i)
        {
            return setContentDescription(mContext.getResources().getText(i));
        }

        public com.actionbarsherlock.app.ActionBar.Tab setContentDescription(CharSequence charsequence)
        {
            mContentDesc = charsequence;
            if (mPosition >= 0)
            {
                mTabScrollView.updateTab(mPosition);
            }
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setCustomView(int i)
        {
            return setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, null));
        }

        public com.actionbarsherlock.app.ActionBar.Tab setCustomView(View view)
        {
            mCustomView = view;
            if (mPosition >= 0)
            {
                mTabScrollView.updateTab(mPosition);
            }
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setIcon(int i)
        {
            return setIcon(mContext.getResources().getDrawable(i));
        }

        public com.actionbarsherlock.app.ActionBar.Tab setIcon(Drawable drawable)
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

        public com.actionbarsherlock.app.ActionBar.Tab setTabListener(com.actionbarsherlock.app.ActionBar.TabListener tablistener)
        {
            mCallback = tablistener;
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setTag(Object obj)
        {
            mTag = obj;
            return this;
        }

        public com.actionbarsherlock.app.ActionBar.Tab setText(int i)
        {
            return setText(mContext.getResources().getText(i));
        }

        public com.actionbarsherlock.app.ActionBar.Tab setText(CharSequence charsequence)
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
            this$0 = ActionBarImpl.this;
            super();
            mPosition = -1;
        }
    }


    private static final int CONTEXT_DISPLAY_NORMAL = 0;
    private static final int CONTEXT_DISPLAY_SPLIT = 1;
    private static final int INVALID_POSITION = -1;
    ActionModeImpl mActionMode;
    private ActionBarView mActionView;
    private Activity mActivity;
    private ActionBarContainer mContainerView;
    private NineFrameLayout mContentView;
    private Context mContext;
    private int mContextDisplayMode;
    private ActionBarContextView mContextView;
    private Animator mCurrentModeAnim;
    private Animator mCurrentShowAnim;
    ActionMode mDeferredDestroyActionMode;
    com.actionbarsherlock.view.ActionMode.Callback mDeferredModeDestroyCallback;
    final Handler mHandler;
    private boolean mHasEmbeddedTabs;
    final com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener mHideListener;
    private boolean mLastMenuVisibility;
    private ArrayList mMenuVisibilityListeners;
    private int mSavedTabPosition;
    private TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    final com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener mShowListener;
    private ActionBarContainer mSplitView;
    private ScrollingTabContainerView mTabScrollView;
    Runnable mTabSelector;
    private ArrayList mTabs;
    private Context mThemedContext;
    boolean mWasHiddenBeforeMode;

    public ActionBarImpl(Activity activity, int i)
    {
        mTabs = new ArrayList();
        mSavedTabPosition = -1;
        mMenuVisibilityListeners = new ArrayList();
        mHandler = new Handler();
        mHideListener = new AnimatorListenerAdapter() {

            final ActionBarImpl this$0;

            public void onAnimationEnd(Animator animator)
            {
                if (mContentView != null)
                {
                    mContentView.setTranslationY(0.0F);
                    mContainerView.setTranslationY(0.0F);
                }
                if (mSplitView != null && mContextDisplayMode == 1)
                {
                    mSplitView.setVisibility(8);
                }
                mContainerView.setVisibility(8);
                mContainerView.setTransitioning(false);
                mCurrentShowAnim = null;
                completeDeferredDestroyActionMode();
            }

            
            {
                this$0 = ActionBarImpl.this;
                super();
            }
        };
        mShowListener = new AnimatorListenerAdapter() {

            final ActionBarImpl this$0;

            public void onAnimationEnd(Animator animator)
            {
                mCurrentShowAnim = null;
                mContainerView.requestLayout();
            }

            
            {
                this$0 = ActionBarImpl.this;
                super();
            }
        };
        mActivity = activity;
        activity = activity.getWindow().getDecorView();
        init(activity);
        if ((i & 0x200) == 0)
        {
            mContentView = (NineFrameLayout)activity.findViewById(0x1020002);
        }
    }

    public ActionBarImpl(Dialog dialog)
    {
        mTabs = new ArrayList();
        mSavedTabPosition = -1;
        mMenuVisibilityListeners = new ArrayList();
        mHandler = new Handler();
        mHideListener = new _cls1();
        mShowListener = new _cls2();
        init(dialog.getWindow().getDecorView());
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

    private void configureTab(com.actionbarsherlock.app.ActionBar.Tab tab, int i)
    {
        tab = (TabImpl)tab;
        if (tab.getCallback() == null)
        {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        tab.setPosition(i);
        mTabs.add(i, tab);
        int j = mTabs.size();
        i++;
        do
        {
            if (i >= j)
            {
                return;
            }
            ((TabImpl)mTabs.get(i)).setPosition(i);
            i++;
        } while (true);
    }

    private void ensureTabsExist()
    {
        int i = 0;
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
            if (getNavigationMode() != 2)
            {
                i = 8;
            }
            scrollingtabcontainerview.setVisibility(i);
            mContainerView.setTabContainer(scrollingtabcontainerview);
        }
        mTabScrollView = scrollingtabcontainerview;
    }

    private void init(View view)
    {
        boolean flag = true;
        mContext = view.getContext();
        mActionView = (ActionBarView)view.findViewById(com.actionbarsherlock.R.id.abs__action_bar);
        mContextView = (ActionBarContextView)view.findViewById(com.actionbarsherlock.R.id.abs__action_context_bar);
        mContainerView = (ActionBarContainer)view.findViewById(com.actionbarsherlock.R.id.abs__action_bar_container);
        mSplitView = (ActionBarContainer)view.findViewById(com.actionbarsherlock.R.id.abs__split_action_bar);
        if (mActionView == null || mContextView == null || mContainerView == null)
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(" can only be used ").append("with a compatible window decor layout").toString());
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
        if (mContext.getApplicationInfo().targetSdkVersion < 14)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if ((mActionView.getDisplayOptions() & 4) == 0)
        {
            flag = false;
        }
        setHomeButtonEnabled(i | flag);
        setHasEmbeddedTabs(ResourcesCompat.getResources_getBoolean(mContext, com.actionbarsherlock.R.bool.abs__action_bar_embed_tabs));
    }

    private void setHasEmbeddedTabs(boolean flag)
    {
        boolean flag2 = true;
        mHasEmbeddedTabs = flag;
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
            Object obj = mTabScrollView;
            int i;
            if (flag1)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((ScrollingTabContainerView) (obj)).setVisibility(i);
        }
        obj = mActionView;
        if (!mHasEmbeddedTabs && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((ActionBarView) (obj)).setCollapsable(flag);
    }

    public void addOnMenuVisibilityListener(com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.add(onmenuvisibilitylistener);
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab)
    {
        addTab(tab, mTabs.isEmpty());
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab, int i)
    {
        addTab(tab, i, mTabs.isEmpty());
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab, int i, boolean flag)
    {
        ensureTabsExist();
        mTabScrollView.addTab(tab, i, flag);
        configureTab(tab, i);
        if (flag)
        {
            selectTab(tab);
        }
    }

    public void addTab(com.actionbarsherlock.app.ActionBar.Tab tab, boolean flag)
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
        if (flag)
        {
            show(false);
        }
        if (mCurrentModeAnim != null)
        {
            mCurrentModeAnim.end();
        }
        Object obj = mActionView;
        int i;
        if (flag)
        {
            i = 8;
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
            scrollingtabcontainerview.animateToVisibility(i);
        }
    }

    void completeDeferredDestroyActionMode()
    {
        if (mDeferredModeDestroyCallback != null)
        {
            mDeferredModeDestroyCallback.onDestroyActionMode(mDeferredDestroyActionMode);
            mDeferredDestroyActionMode = null;
            mDeferredModeDestroyCallback = null;
        }
    }

    public void dispatchMenuVisibilityChanged(boolean flag)
    {
        if (flag != mLastMenuVisibility)
        {
            mLastMenuVisibility = flag;
            int j = mMenuVisibilityListeners.size();
            int i = 0;
            while (i < j) 
            {
                ((com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
                i++;
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

    public com.actionbarsherlock.app.ActionBar.Tab getSelectedTab()
    {
        return mSelectedTab;
    }

    public CharSequence getSubtitle()
    {
        return mActionView.getSubtitle();
    }

    public com.actionbarsherlock.app.ActionBar.Tab getTabAt(int i)
    {
        return (com.actionbarsherlock.app.ActionBar.Tab)mTabs.get(i);
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
            mContext.getTheme().resolveAttribute(com.actionbarsherlock.R.attr.actionBarWidgetTheme, typedvalue, true);
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

    public void hide()
    {
        if (mCurrentShowAnim != null)
        {
            mCurrentShowAnim.end();
        }
        if (mContainerView.getVisibility() == 8)
        {
            return;
        }
        if (mShowHideAnimationEnabled)
        {
            mContainerView.setAlpha(1.0F);
            mContainerView.setTransitioning(true);
            AnimatorSet animatorset = new AnimatorSet();
            com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder builder = animatorset.play(ObjectAnimator.ofFloat(mContainerView, "alpha", new float[] {
                0.0F
            }));
            if (mContentView != null)
            {
                builder.with(ObjectAnimator.ofFloat(mContentView, "translationY", new float[] {
                    0.0F, (float)(-mContainerView.getHeight())
                }));
                builder.with(ObjectAnimator.ofFloat(mContainerView, "translationY", new float[] {
                    (float)(-mContainerView.getHeight())
                }));
            }
            if (mSplitView != null && mSplitView.getVisibility() == 0)
            {
                mSplitView.setAlpha(1.0F);
                builder.with(ObjectAnimator.ofFloat(mSplitView, "alpha", new float[] {
                    0.0F
                }));
            }
            animatorset.addListener(mHideListener);
            mCurrentShowAnim = animatorset;
            animatorset.start();
            return;
        } else
        {
            mHideListener.onAnimationEnd(null);
            return;
        }
    }

    public boolean isShowing()
    {
        return mContainerView.getVisibility() == 0;
    }

    public com.actionbarsherlock.app.ActionBar.Tab newTab()
    {
        return new TabImpl();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        setHasEmbeddedTabs(ResourcesCompat.getResources_getBoolean(mContext, com.actionbarsherlock.R.bool.abs__action_bar_embed_tabs));
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            mActionView.onConfigurationChanged(configuration);
            if (mContextView != null)
            {
                mContextView.onConfigurationChanged(configuration);
            }
        }
    }

    public void removeAllTabs()
    {
        cleanupTabs();
    }

    public void removeOnMenuVisibilityListener(com.actionbarsherlock.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.remove(onmenuvisibilitylistener);
    }

    public void removeTab(com.actionbarsherlock.app.ActionBar.Tab tab)
    {
        removeTabAt(tab.getPosition());
    }

    public void removeTabAt(int i)
    {
        if (mTabScrollView != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k;
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
        k = i;
_L4:
label0:
        {
            if (k < l)
            {
                break label0;
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
                selectTab(((com.actionbarsherlock.app.ActionBar.Tab) (obj)));
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        ((TabImpl)mTabs.get(k)).setPosition(k);
        k++;
          goto _L4
    }

    public void selectTab(com.actionbarsherlock.app.ActionBar.Tab tab)
    {
        int i = -1;
        if (getNavigationMode() == 2) goto _L2; else goto _L1
_L1:
        if (tab != null)
        {
            i = tab.getPosition();
        } else
        {
            i = -1;
        }
        mSavedTabPosition = i;
_L4:
        return;
_L2:
        FragmentTransaction fragmenttransaction;
        fragmenttransaction = null;
        if (mActivity instanceof FragmentActivity)
        {
            fragmenttransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        }
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
        if (fragmenttransaction != null && !fragmenttransaction.isEmpty())
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

    public void setCustomView(View view, com.actionbarsherlock.app.ActionBar.LayoutParams layoutparams)
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
        mActionView.setDisplayOptions(i);
    }

    public void setDisplayOptions(int i, int j)
    {
        int k = mActionView.getDisplayOptions();
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

    public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, com.actionbarsherlock.app.ActionBar.OnNavigationListener onnavigationlistener)
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
            throw new IllegalStateException("setSelectedNavigationItem not valid for current navigation mode");

        case 2: // '\002'
            selectTab((com.actionbarsherlock.app.ActionBar.Tab)mTabs.get(i));
            return;

        case 1: // '\001'
            mActionView.setDropdownSelectedPosition(i);
            return;
        }
    }

    public void setShowHideAnimationEnabled(boolean flag)
    {
        mShowHideAnimationEnabled = flag;
        if (!flag && mCurrentShowAnim != null)
        {
            mCurrentShowAnim.end();
        }
    }

    public void setSplitBackgroundDrawable(Drawable drawable)
    {
        if (mSplitView != null)
        {
            mSplitView.setSplitBackground(drawable);
        }
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
        show(true);
    }

    void show(boolean flag)
    {
        if (mCurrentShowAnim != null)
        {
            mCurrentShowAnim.end();
        }
        if (mContainerView.getVisibility() == 0)
        {
            if (flag)
            {
                mWasHiddenBeforeMode = false;
            }
            return;
        }
        mContainerView.setVisibility(0);
        if (mShowHideAnimationEnabled)
        {
            mContainerView.setAlpha(0.0F);
            AnimatorSet animatorset = new AnimatorSet();
            com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder builder = animatorset.play(ObjectAnimator.ofFloat(mContainerView, "alpha", new float[] {
                1.0F
            }));
            if (mContentView != null)
            {
                builder.with(ObjectAnimator.ofFloat(mContentView, "translationY", new float[] {
                    (float)(-mContainerView.getHeight()), 0.0F
                }));
                mContainerView.setTranslationY(-mContainerView.getHeight());
                builder.with(ObjectAnimator.ofFloat(mContainerView, "translationY", new float[] {
                    0.0F
                }));
            }
            if (mSplitView != null && mContextDisplayMode == 1)
            {
                mSplitView.setAlpha(0.0F);
                mSplitView.setVisibility(0);
                builder.with(ObjectAnimator.ofFloat(mSplitView, "alpha", new float[] {
                    1.0F
                }));
            }
            animatorset.addListener(mShowListener);
            mCurrentShowAnim = animatorset;
            animatorset.start();
            return;
        } else
        {
            mContainerView.setAlpha(1.0F);
            mContainerView.setTranslationY(0.0F);
            mShowListener.onAnimationEnd(null);
            return;
        }
    }

    public ActionMode startActionMode(com.actionbarsherlock.view.ActionMode.Callback callback)
    {
        boolean flag = false;
        if (mActionMode != null)
        {
            flag = mWasHiddenBeforeMode;
            mActionMode.finish();
        }
        mContextView.killMode();
        callback = new ActionModeImpl(callback);
        if (callback.dispatchOnCreate())
        {
            if (isShowing() && !flag)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            mWasHiddenBeforeMode = flag;
            callback.invalidate();
            mContextView.initForMode(callback);
            animateToMode(true);
            if (mSplitView != null && mContextDisplayMode == 1)
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
