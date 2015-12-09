// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.internal.view.ActionBarPolicy;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class WindowDecorActionBar extends ActionBar
    implements android.support.v7.internal.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
{
    public final class ActionModeImpl extends ActionMode
        implements android.support.v7.internal.view.menu.MenuBuilder.Callback
    {

        private android.support.v7.view.ActionMode.Callback mCallback;
        private WeakReference mCustomView;
        private MenuBuilder mMenu;
        final WindowDecorActionBar this$0;

        public final boolean dispatchOnCreate()
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

        public final void finish()
        {
            if (mActionMode != this)
            {
                return;
            }
            if (!WindowDecorActionBar.checkShowingFlags(mHiddenByApp, mHiddenBySystem, false))
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
            mDecorToolbar.getViewGroup().sendAccessibilityEvent(32);
            mOverlayLayout.setHideOnContentScrollEnabled(mHideOnContentScroll);
            mActionMode = null;
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
            return new SupportMenuInflater(getThemedContext());
        }

        public final CharSequence getSubtitle()
        {
            return mContextView.getSubtitle();
        }

        public final CharSequence getTitle()
        {
            return mContextView.getTitle();
        }

        public final void invalidate()
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

        public final boolean isTitleOptional()
        {
            return mContextView.isTitleOptional();
        }

        public final boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
        {
            if (mCallback != null)
            {
                return mCallback.onActionItemClicked(this, menuitem);
            } else
            {
                return false;
            }
        }

        public final void onMenuModeChange(MenuBuilder menubuilder)
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

        public final void setCustomView(View view)
        {
            mContextView.setCustomView(view);
            mCustomView = new WeakReference(view);
        }

        public final void setSubtitle(int i)
        {
            setSubtitle(((CharSequence) (mContext.getResources().getString(i))));
        }

        public final void setSubtitle(CharSequence charsequence)
        {
            mContextView.setSubtitle(charsequence);
        }

        public final void setTitle(int i)
        {
            setTitle(((CharSequence) (mContext.getResources().getString(i))));
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

        public ActionModeImpl(android.support.v7.view.ActionMode.Callback callback)
        {
            this$0 = WindowDecorActionBar.this;
            super();
            mCallback = callback;
            mMenu = (new MenuBuilder(getThemedContext())).setDefaultShowAsAction(1);
            mMenu.setCallback(this);
        }
    }


    static final boolean $assertionsDisabled;
    private static final boolean ALLOW_SHOW_HIDE_ANIMATIONS;
    ActionModeImpl mActionMode;
    private FragmentActivity mActivity;
    private ActionBarContainer mContainerView;
    private boolean mContentAnimations;
    private View mContentView;
    private Context mContext;
    private int mContextDisplayMode;
    private ActionBarContextView mContextView;
    private int mCurWindowVisibility;
    private ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    private DecorToolbar mDecorToolbar;
    ActionMode mDeferredDestroyActionMode;
    android.support.v7.view.ActionMode.Callback mDeferredModeDestroyCallback;
    private boolean mDisplayHomeAsUpSet;
    private boolean mHasEmbeddedTabs;
    private boolean mHiddenByApp;
    private boolean mHiddenBySystem;
    final ViewPropertyAnimatorListener mHideListener = new ViewPropertyAnimatorListenerAdapter() {

        final WindowDecorActionBar this$0;

        public final void onAnimationEnd(View view)
        {
            if (mContentAnimations && mContentView != null)
            {
                ViewCompat.setTranslationY(mContentView, 0.0F);
                ViewCompat.setTranslationY(mContainerView, 0.0F);
            }
            if (mSplitView != null && mContextDisplayMode == 1)
            {
                mSplitView.setVisibility(8);
            }
            mContainerView.setVisibility(8);
            mContainerView.setTransitioning(false);
            mCurrentShowAnim = null;
            completeDeferredDestroyActionMode();
            if (mOverlayLayout != null)
            {
                ViewCompat.requestApplyInsets(mOverlayLayout);
            }
        }

            
            {
                this$0 = WindowDecorActionBar.this;
                super();
            }
    };
    boolean mHideOnContentScroll;
    private boolean mLastMenuVisibility;
    private ArrayList mMenuVisibilityListeners;
    private boolean mNowShowing;
    private ActionBarOverlayLayout mOverlayLayout;
    private int mSavedTabPosition;
    private boolean mShowHideAnimationEnabled;
    final ViewPropertyAnimatorListener mShowListener = new ViewPropertyAnimatorListenerAdapter() {

        final WindowDecorActionBar this$0;

        public final void onAnimationEnd(View view)
        {
            mCurrentShowAnim = null;
            mContainerView.requestLayout();
        }

            
            {
                this$0 = WindowDecorActionBar.this;
                super();
            }
    };
    private boolean mShowingForMode;
    private ActionBarContainer mSplitView;
    private ScrollingTabContainerView mTabScrollView;
    private ArrayList mTabs;
    private Context mThemedContext;
    final ViewPropertyAnimatorUpdateListener mUpdateListener = new ViewPropertyAnimatorUpdateListener() {

        final WindowDecorActionBar this$0;

        public final void onAnimationUpdate(View view)
        {
            ((View)mContainerView.getParent()).invalidate();
        }

            
            {
                this$0 = WindowDecorActionBar.this;
                super();
            }
    };

    public WindowDecorActionBar(ActionBarActivity actionbaractivity, boolean flag)
    {
        mTabs = new ArrayList();
        mSavedTabPosition = -1;
        mMenuVisibilityListeners = new ArrayList();
        mCurWindowVisibility = 0;
        mContentAnimations = true;
        mNowShowing = true;
        mActivity = actionbaractivity;
        actionbaractivity = actionbaractivity.getWindow().getDecorView();
        init(actionbaractivity);
        if (!flag)
        {
            mContentView = actionbaractivity.findViewById(0x1020002);
        }
    }

    private static boolean checkShowingFlags(boolean flag, boolean flag1, boolean flag2)
    {
        while (flag2 || !flag && !flag1) 
        {
            return true;
        }
        return false;
    }

    private void doHide(boolean flag)
    {
        if (mCurrentShowAnim != null)
        {
            mCurrentShowAnim.cancel();
        }
        if (mCurWindowVisibility == 0 && ALLOW_SHOW_HIDE_ANIMATIONS && (mShowHideAnimationEnabled || flag))
        {
            ViewCompat.setAlpha(mContainerView, 1.0F);
            mContainerView.setTransitioning(true);
            ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
            float f1 = -mContainerView.getHeight();
            float f = f1;
            if (flag)
            {
                int ai[] = new int[2];
                int[] _tmp = ai;
                ai[0] = 0;
                ai[1] = 0;
                mContainerView.getLocationInWindow(ai);
                f = f1 - (float)ai[1];
            }
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(mContainerView).translationY(f);
            viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
            viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat);
            if (mContentAnimations && mContentView != null)
            {
                viewpropertyanimatorcompatset.play(ViewCompat.animate(mContentView).translationY(f));
            }
            if (mSplitView != null && mSplitView.getVisibility() == 0)
            {
                ViewCompat.setAlpha(mSplitView, 1.0F);
                viewpropertyanimatorcompatset.play(ViewCompat.animate(mSplitView).translationY(mSplitView.getHeight()));
            }
            viewpropertyanimatorcompatset.setInterpolator(AnimationUtils.loadInterpolator(mContext, 0x10a0005));
            viewpropertyanimatorcompatset.setDuration(250L);
            viewpropertyanimatorcompatset.setListener(mHideListener);
            mCurrentShowAnim = viewpropertyanimatorcompatset;
            viewpropertyanimatorcompatset.start();
            return;
        } else
        {
            mHideListener.onAnimationEnd(null);
            return;
        }
    }

    private void doShow(boolean flag)
    {
        if (mCurrentShowAnim != null)
        {
            mCurrentShowAnim.cancel();
        }
        mContainerView.setVisibility(0);
        if (mCurWindowVisibility == 0 && ALLOW_SHOW_HIDE_ANIMATIONS && (mShowHideAnimationEnabled || flag))
        {
            ViewCompat.setTranslationY(mContainerView, 0.0F);
            float f1 = -mContainerView.getHeight();
            float f = f1;
            if (flag)
            {
                int ai[] = new int[2];
                int[] _tmp = ai;
                ai[0] = 0;
                ai[1] = 0;
                mContainerView.getLocationInWindow(ai);
                f = f1 - (float)ai[1];
            }
            ViewCompat.setTranslationY(mContainerView, f);
            ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(mContainerView).translationY(0.0F);
            viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
            viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat);
            if (mContentAnimations && mContentView != null)
            {
                ViewCompat.setTranslationY(mContentView, f);
                viewpropertyanimatorcompatset.play(ViewCompat.animate(mContentView).translationY(0.0F));
            }
            if (mSplitView != null && mContextDisplayMode == 1)
            {
                ViewCompat.setTranslationY(mSplitView, mSplitView.getHeight());
                mSplitView.setVisibility(0);
                viewpropertyanimatorcompatset.play(ViewCompat.animate(mSplitView).translationY(0.0F));
            }
            viewpropertyanimatorcompatset.setInterpolator(AnimationUtils.loadInterpolator(mContext, 0x10a0006));
            viewpropertyanimatorcompatset.setDuration(250L);
            viewpropertyanimatorcompatset.setListener(mShowListener);
            mCurrentShowAnim = viewpropertyanimatorcompatset;
            viewpropertyanimatorcompatset.start();
        } else
        {
            ViewCompat.setAlpha(mContainerView, 1.0F);
            ViewCompat.setTranslationY(mContainerView, 0.0F);
            if (mContentAnimations && mContentView != null)
            {
                ViewCompat.setTranslationY(mContentView, 0.0F);
            }
            if (mSplitView != null && mContextDisplayMode == 1)
            {
                ViewCompat.setAlpha(mSplitView, 1.0F);
                ViewCompat.setTranslationY(mSplitView, 0.0F);
                mSplitView.setVisibility(0);
            }
            mShowListener.onAnimationEnd(null);
        }
        if (mOverlayLayout != null)
        {
            ViewCompat.requestApplyInsets(mOverlayLayout);
        }
    }

    private static DecorToolbar getDecorToolbar(View view)
    {
        if (view instanceof DecorToolbar)
        {
            return (DecorToolbar)view;
        }
        if (view instanceof Toolbar)
        {
            return ((Toolbar)view).getWrapper();
        } else
        {
            throw new IllegalStateException((new StringBuilder("Can't make a decor toolbar out of ")).append(view.getClass().getSimpleName()).toString());
        }
    }

    private int getNavigationMode()
    {
        return mDecorToolbar.getNavigationMode();
    }

    private void hideForActionMode()
    {
        if (mShowingForMode)
        {
            mShowingForMode = false;
            if (mOverlayLayout != null)
            {
                mOverlayLayout.setShowingForActionMode(false);
            }
            updateVisibility(false);
        }
    }

    private void init(View view)
    {
        mOverlayLayout = (ActionBarOverlayLayout)view.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
        if (mOverlayLayout != null)
        {
            mOverlayLayout.setActionBarVisibilityCallback(this);
        }
        mDecorToolbar = getDecorToolbar(view.findViewById(android.support.v7.appcompat.R.id.action_bar));
        mContextView = (ActionBarContextView)view.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
        mContainerView = (ActionBarContainer)view.findViewById(android.support.v7.appcompat.R.id.action_bar_container);
        mSplitView = (ActionBarContainer)view.findViewById(android.support.v7.appcompat.R.id.split_action_bar);
        if (mDecorToolbar == null || mContextView == null || mContainerView == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with a compatible window decor layout").toString());
        }
        mContext = mDecorToolbar.getContext();
        int i;
        boolean flag;
        if (mDecorToolbar.isSplit())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        mContextDisplayMode = i;
        if ((mDecorToolbar.getDisplayOptions() & 4) != 0)
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
        view = ActionBarPolicy.get(mContext);
        if (view.enableHomeButtonByDefault() || i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setHomeButtonEnabled(flag);
        setHasEmbeddedTabs(view.hasEmbeddedTabs());
        view = mContext.obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
        if (view.getBoolean(android.support.v7.appcompat.R.styleable.ActionBar_hideOnContentScroll, false))
        {
            setHideOnContentScrollEnabled(true);
        }
        i = view.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_elevation, 0);
        if (i != 0)
        {
            setElevation(i);
        }
        view.recycle();
    }

    private void setHasEmbeddedTabs(boolean flag)
    {
        boolean flag2 = true;
        mHasEmbeddedTabs = flag;
        Object obj;
        boolean flag1;
        if (!mHasEmbeddedTabs)
        {
            mDecorToolbar.setEmbeddedTabView(null);
            mContainerView.setTabContainer(mTabScrollView);
        } else
        {
            mContainerView.setTabContainer(null);
            mDecorToolbar.setEmbeddedTabView(mTabScrollView);
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
                if (mOverlayLayout != null)
                {
                    ViewCompat.requestApplyInsets(mOverlayLayout);
                }
            } else
            {
                mTabScrollView.setVisibility(8);
            }
        }
        obj = mDecorToolbar;
        if (!mHasEmbeddedTabs && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((DecorToolbar) (obj)).setCollapsible(flag);
        obj = mOverlayLayout;
        if (!mHasEmbeddedTabs && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
    }

    private void showForActionMode()
    {
        if (!mShowingForMode)
        {
            mShowingForMode = true;
            if (mOverlayLayout != null)
            {
                mOverlayLayout.setShowingForActionMode(true);
            }
            updateVisibility(false);
        }
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

    public final void addOnMenuVisibilityListener(android.support.v7.app.ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mMenuVisibilityListeners.add(onmenuvisibilitylistener);
    }

    public final void animateToMode(boolean flag)
    {
        boolean flag1 = false;
        Object obj;
        int i;
        if (flag)
        {
            showForActionMode();
        } else
        {
            hideForActionMode();
        }
        obj = mDecorToolbar;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((DecorToolbar) (obj)).animateToVisibility(i);
        obj = mContextView;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((ActionBarContextView) (obj)).animateToVisibility(i);
    }

    public final boolean collapseActionView()
    {
        if (mDecorToolbar != null && mDecorToolbar.hasExpandedActionView())
        {
            mDecorToolbar.collapseActionView();
            return true;
        } else
        {
            return false;
        }
    }

    final void completeDeferredDestroyActionMode()
    {
        if (mDeferredModeDestroyCallback != null)
        {
            mDeferredModeDestroyCallback.onDestroyActionMode(mDeferredDestroyActionMode);
            mDeferredDestroyActionMode = null;
            mDeferredModeDestroyCallback = null;
        }
    }

    public final void dispatchMenuVisibilityChanged(boolean flag)
    {
        if (flag != mLastMenuVisibility)
        {
            mLastMenuVisibility = flag;
            int j = mMenuVisibilityListeners.size();
            int i = 0;
            while (i < j) 
            {
                ((android.support.v7.app.ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
                i++;
            }
        }
    }

    public final void enableContentAnimations(boolean flag)
    {
        mContentAnimations = flag;
    }

    public final int getDisplayOptions()
    {
        return mDecorToolbar.getDisplayOptions();
    }

    public final Context getThemedContext()
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

    public final void hide()
    {
        if (!mHiddenByApp)
        {
            mHiddenByApp = true;
            updateVisibility(false);
        }
    }

    public final void hideForSystem()
    {
        if (!mHiddenBySystem)
        {
            mHiddenBySystem = true;
            updateVisibility(true);
        }
    }

    public final void onConfigurationChanged(Configuration configuration)
    {
        setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
    }

    public final void onContentScrollStarted()
    {
        if (mCurrentShowAnim != null)
        {
            mCurrentShowAnim.cancel();
            mCurrentShowAnim = null;
        }
    }

    public final void onWindowVisibilityChanged(int i)
    {
        mCurWindowVisibility = i;
    }

    public final void setBackgroundDrawable(Drawable drawable)
    {
        mContainerView.setPrimaryBackground(drawable);
    }

    public final void setDefaultDisplayHomeAsUpEnabled(boolean flag)
    {
        if (!mDisplayHomeAsUpSet)
        {
            setDisplayHomeAsUpEnabled(flag);
        }
    }

    public final void setDisplayHomeAsUpEnabled(boolean flag)
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

    public final void setDisplayOptions(int i, int j)
    {
        int k = mDecorToolbar.getDisplayOptions();
        if ((j & 4) != 0)
        {
            mDisplayHomeAsUpSet = true;
        }
        mDecorToolbar.setDisplayOptions(i & j | ~j & k);
    }

    public final void setElevation(float f)
    {
        ViewCompat.setElevation(mContainerView, f);
        if (mSplitView != null)
        {
            ViewCompat.setElevation(mSplitView, f);
        }
    }

    public final void setHideOnContentScrollEnabled(boolean flag)
    {
        if (flag && !mOverlayLayout.isInOverlayMode())
        {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        } else
        {
            mHideOnContentScroll = flag;
            mOverlayLayout.setHideOnContentScrollEnabled(flag);
            return;
        }
    }

    public final void setHomeActionContentDescription(int i)
    {
        mDecorToolbar.setNavigationContentDescription(i);
    }

    public final void setHomeAsUpIndicator(Drawable drawable)
    {
        mDecorToolbar.setNavigationIcon(drawable);
    }

    public final void setHomeButtonEnabled(boolean flag)
    {
        DecorToolbar decortoolbar = mDecorToolbar;
    }

    public final void setLogo(Drawable drawable)
    {
        mDecorToolbar.setLogo(drawable);
    }

    public final void setShowHideAnimationEnabled(boolean flag)
    {
        mShowHideAnimationEnabled = flag;
        if (!flag && mCurrentShowAnim != null)
        {
            mCurrentShowAnim.cancel();
        }
    }

    public final void setSubtitle(CharSequence charsequence)
    {
        mDecorToolbar.setSubtitle(charsequence);
    }

    public final void setTitle(CharSequence charsequence)
    {
        mDecorToolbar.setTitle(charsequence);
    }

    public final void setWindowTitle(CharSequence charsequence)
    {
        mDecorToolbar.setWindowTitle(charsequence);
    }

    public final void show()
    {
        if (mHiddenByApp)
        {
            mHiddenByApp = false;
            updateVisibility(false);
        }
    }

    public final void showForSystem()
    {
        if (mHiddenBySystem)
        {
            mHiddenBySystem = false;
            updateVisibility(true);
        }
    }

    public final ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        mOverlayLayout.setHideOnContentScrollEnabled(false);
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
                if (mOverlayLayout != null)
                {
                    ViewCompat.requestApplyInsets(mOverlayLayout);
                }
            }
            mContextView.sendAccessibilityEvent(32);
            mActionMode = callback;
            return callback;
        } else
        {
            return null;
        }
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (!android/support/v7/internal/app/WindowDecorActionBar.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ALLOW_SHOW_HIDE_ANIMATIONS = flag;
    }










/*
    static ViewPropertyAnimatorCompatSet access$502(WindowDecorActionBar windowdecoractionbar, ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset)
    {
        windowdecoractionbar.mCurrentShowAnim = viewpropertyanimatorcompatset;
        return viewpropertyanimatorcompatset;
    }

*/




}
