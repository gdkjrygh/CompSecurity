// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.view.ActionMode;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.TintManager;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//            ActionBar, NavItemSelectedListener

public class WindowDecorActionBar extends ActionBar
    implements android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
{
    public class ActionModeImpl extends ActionMode
        implements android.support.v7.view.menu.MenuBuilder.Callback
    {

        private final Context mActionModeContext;
        private android.support.v7.view.ActionMode.Callback mCallback;
        private WeakReference mCustomView;
        private final MenuBuilder mMenu;
        final WindowDecorActionBar this$0;

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
            return new SupportMenuInflater(mActionModeContext);
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
            if (mActionMode != this)
            {
                return;
            }
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

        public void setTitleOptionalHint(boolean flag)
        {
            super.setTitleOptionalHint(flag);
            mContextView.setTitleOptional(flag);
        }

        public ActionModeImpl(Context context, android.support.v7.view.ActionMode.Callback callback)
        {
            this$0 = WindowDecorActionBar.this;
            super();
            mActionModeContext = context;
            mCallback = callback;
            mMenu = (new MenuBuilder(context)).setDefaultShowAsAction(1);
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
        final WindowDecorActionBar this$0;

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
            return setIcon(getTintManager().getDrawable(i));
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
            this$0 = WindowDecorActionBar.this;
            super();
            mPosition = -1;
        }
    }


    static final boolean $assertionsDisabled;
    private static final boolean ALLOW_SHOW_HIDE_ANIMATIONS;
    private static final long FADE_IN_DURATION_MS = 200L;
    private static final long FADE_OUT_DURATION_MS = 100L;
    private static final int INVALID_POSITION = -1;
    private static final String TAG = "WindowDecorActionBar";
    private static final Interpolator sHideInterpolator = new AccelerateInterpolator();
    private static final Interpolator sShowInterpolator = new DecelerateInterpolator();
    ActionModeImpl mActionMode;
    private Activity mActivity;
    private ActionBarContainer mContainerView;
    private boolean mContentAnimations;
    private View mContentView;
    private Context mContext;
    private ActionBarContextView mContextView;
    private int mCurWindowVisibility;
    private ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    private DecorToolbar mDecorToolbar;
    ActionMode mDeferredDestroyActionMode;
    android.support.v7.view.ActionMode.Callback mDeferredModeDestroyCallback;
    private Dialog mDialog;
    private boolean mDisplayHomeAsUpSet;
    private boolean mHasEmbeddedTabs;
    private boolean mHiddenByApp;
    private boolean mHiddenBySystem;
    final ViewPropertyAnimatorListener mHideListener;
    boolean mHideOnContentScroll;
    private boolean mLastMenuVisibility;
    private ArrayList mMenuVisibilityListeners;
    private boolean mNowShowing;
    private ActionBarOverlayLayout mOverlayLayout;
    private int mSavedTabPosition;
    private TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    final ViewPropertyAnimatorListener mShowListener;
    private boolean mShowingForMode;
    private ScrollingTabContainerView mTabScrollView;
    private ArrayList mTabs;
    private Context mThemedContext;
    private TintManager mTintManager;
    final ViewPropertyAnimatorUpdateListener mUpdateListener;

    public WindowDecorActionBar(Activity activity, boolean flag)
    {
        mTabs = new ArrayList();
        mSavedTabPosition = -1;
        mMenuVisibilityListeners = new ArrayList();
        mCurWindowVisibility = 0;
        mContentAnimations = true;
        mNowShowing = true;
        mHideListener = new ViewPropertyAnimatorListenerAdapter() {

            final WindowDecorActionBar this$0;

            public void onAnimationEnd(View view)
            {
                if (mContentAnimations && mContentView != null)
                {
                    ViewCompat.setTranslationY(mContentView, 0.0F);
                    ViewCompat.setTranslationY(mContainerView, 0.0F);
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
        mShowListener = new ViewPropertyAnimatorListenerAdapter() {

            final WindowDecorActionBar this$0;

            public void onAnimationEnd(View view)
            {
                mCurrentShowAnim = null;
                mContainerView.requestLayout();
            }

            
            {
                this$0 = WindowDecorActionBar.this;
                super();
            }
        };
        mUpdateListener = new ViewPropertyAnimatorUpdateListener() {

            final WindowDecorActionBar this$0;

            public void onAnimationUpdate(View view)
            {
                ((View)mContainerView.getParent()).invalidate();
            }

            
            {
                this$0 = WindowDecorActionBar.this;
                super();
            }
        };
        mActivity = activity;
        activity = activity.getWindow().getDecorView();
        init(activity);
        if (!flag)
        {
            mContentView = activity.findViewById(0x1020002);
        }
    }

    public WindowDecorActionBar(Dialog dialog)
    {
        mTabs = new ArrayList();
        mSavedTabPosition = -1;
        mMenuVisibilityListeners = new ArrayList();
        mCurWindowVisibility = 0;
        mContentAnimations = true;
        mNowShowing = true;
        mHideListener = new _cls1();
        mShowListener = new _cls2();
        mUpdateListener = new _cls3();
        mDialog = dialog;
        init(dialog.getWindow().getDecorView());
    }

    public WindowDecorActionBar(View view)
    {
        mTabs = new ArrayList();
        mSavedTabPosition = -1;
        mMenuVisibilityListeners = new ArrayList();
        mCurWindowVisibility = 0;
        mContentAnimations = true;
        mNowShowing = true;
        mHideListener = new _cls1();
        mShowListener = new _cls2();
        mUpdateListener = new _cls3();
        if (!$assertionsDisabled && !view.isInEditMode())
        {
            throw new AssertionError();
        } else
        {
            init(view);
            return;
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
            mDecorToolbar.setEmbeddedTabView(scrollingtabcontainerview);
        } else
        {
            if (getNavigationMode() == 2)
            {
                scrollingtabcontainerview.setVisibility(0);
                if (mOverlayLayout != null)
                {
                    ViewCompat.requestApplyInsets(mOverlayLayout);
                }
            } else
            {
                scrollingtabcontainerview.setVisibility(8);
            }
            mContainerView.setTabContainer(scrollingtabcontainerview);
        }
        mTabScrollView = scrollingtabcontainerview;
    }

    private DecorToolbar getDecorToolbar(View view)
    {
        if (view instanceof DecorToolbar)
        {
            return (DecorToolbar)view;
        }
        if (view instanceof Toolbar)
        {
            return ((Toolbar)view).getWrapper();
        }
        if ((new StringBuilder()).append("Can't make a decor toolbar out of ").append(view).toString() != null)
        {
            view = view.getClass().getSimpleName();
        } else
        {
            view = "null";
        }
        throw new IllegalStateException(view);
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
        if (mDecorToolbar == null || mContextView == null || mContainerView == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with a compatible window decor layout").toString());
        }
        mContext = mDecorToolbar.getContext();
        int i;
        boolean flag;
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

    public void animateToMode(boolean flag)
    {
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat;
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat1;
        ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset;
        if (flag)
        {
            showForActionMode();
        } else
        {
            hideForActionMode();
        }
        if (flag)
        {
            viewpropertyanimatorcompat = mDecorToolbar.setupAnimatorToVisibility(4, 100L);
            viewpropertyanimatorcompat1 = mContextView.setupAnimatorToVisibility(0, 200L);
        } else
        {
            viewpropertyanimatorcompat1 = mDecorToolbar.setupAnimatorToVisibility(0, 200L);
            viewpropertyanimatorcompat = mContextView.setupAnimatorToVisibility(8, 100L);
        }
        viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
        viewpropertyanimatorcompatset.playSequentially(viewpropertyanimatorcompat, viewpropertyanimatorcompat1);
        viewpropertyanimatorcompatset.start();
    }

    public boolean collapseActionView()
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
                ((ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
                i++;
            }
        }
    }

    public void doHide(boolean flag)
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
            viewpropertyanimatorcompatset.setInterpolator(sHideInterpolator);
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

    public void doShow(boolean flag)
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
            viewpropertyanimatorcompatset.setInterpolator(sShowInterpolator);
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
            mShowListener.onAnimationEnd(null);
        }
        if (mOverlayLayout != null)
        {
            ViewCompat.requestApplyInsets(mOverlayLayout);
        }
    }

    public void enableContentAnimations(boolean flag)
    {
        mContentAnimations = flag;
    }

    public View getCustomView()
    {
        return mDecorToolbar.getCustomView();
    }

    public int getDisplayOptions()
    {
        return mDecorToolbar.getDisplayOptions();
    }

    public float getElevation()
    {
        return ViewCompat.getElevation(mContainerView);
    }

    public int getHeight()
    {
        return mContainerView.getHeight();
    }

    public int getHideOffset()
    {
        return mOverlayLayout.getActionBarHideOffset();
    }

    public int getNavigationItemCount()
    {
        switch (mDecorToolbar.getNavigationMode())
        {
        default:
            return 0;

        case 2: // '\002'
            return mTabs.size();

        case 1: // '\001'
            return mDecorToolbar.getDropdownItemCount();
        }
    }

    public int getNavigationMode()
    {
        return mDecorToolbar.getNavigationMode();
    }

    public int getSelectedNavigationIndex()
    {
        mDecorToolbar.getNavigationMode();
        JVM INSTR tableswitch 1 2: default 32
    //                   1 49
    //                   2 34;
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
        return mDecorToolbar.getDropdownSelectedPosition();
    }

    public ActionBar.Tab getSelectedTab()
    {
        return mSelectedTab;
    }

    public CharSequence getSubtitle()
    {
        return mDecorToolbar.getSubtitle();
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

    TintManager getTintManager()
    {
        if (mTintManager == null)
        {
            mTintManager = TintManager.get(mContext);
        }
        return mTintManager;
    }

    public CharSequence getTitle()
    {
        return mDecorToolbar.getTitle();
    }

    public boolean hasIcon()
    {
        return mDecorToolbar.hasIcon();
    }

    public boolean hasLogo()
    {
        return mDecorToolbar.hasLogo();
    }

    public void hide()
    {
        if (!mHiddenByApp)
        {
            mHiddenByApp = true;
            updateVisibility(false);
        }
    }

    public void hideForSystem()
    {
        if (!mHiddenBySystem)
        {
            mHiddenBySystem = true;
            updateVisibility(true);
        }
    }

    public boolean isHideOnContentScrollEnabled()
    {
        return mOverlayLayout.isHideOnContentScrollEnabled();
    }

    public boolean isShowing()
    {
        int i = getHeight();
        return mNowShowing && (i == 0 || getHideOffset() < i);
    }

    public boolean isTitleTruncated()
    {
        return mDecorToolbar != null && mDecorToolbar.isTitleTruncated();
    }

    public ActionBar.Tab newTab()
    {
        return new TabImpl();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
    }

    public void onContentScrollStarted()
    {
        if (mCurrentShowAnim != null)
        {
            mCurrentShowAnim.cancel();
            mCurrentShowAnim = null;
        }
    }

    public void onContentScrollStopped()
    {
    }

    public void onWindowVisibilityChanged(int i)
    {
        mCurWindowVisibility = i;
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
        } else
        {
            i = -1;
        }
        mSavedTabPosition = i;
_L4:
        return;
_L2:
        FragmentTransaction fragmenttransaction;
        if ((mActivity instanceof FragmentActivity) && !mDecorToolbar.getViewGroup().isInEditMode())
        {
            fragmenttransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        } else
        {
            fragmenttransaction = null;
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
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, mDecorToolbar.getViewGroup(), false));
    }

    public void setCustomView(View view)
    {
        mDecorToolbar.setCustomView(view);
    }

    public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
    {
        view.setLayoutParams(layoutparams);
        mDecorToolbar.setCustomView(view);
    }

    public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
    {
        if (!mDisplayHomeAsUpSet)
        {
            setDisplayHomeAsUpEnabled(flag);
        }
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
        mDecorToolbar.setDisplayOptions(i);
    }

    public void setDisplayOptions(int i, int j)
    {
        int k = mDecorToolbar.getDisplayOptions();
        if ((j & 4) != 0)
        {
            mDisplayHomeAsUpSet = true;
        }
        mDecorToolbar.setDisplayOptions(k & ~j | i & j);
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

    public void setElevation(float f)
    {
        ViewCompat.setElevation(mContainerView, f);
    }

    public void setHideOffset(int i)
    {
        if (i != 0 && !mOverlayLayout.isInOverlayMode())
        {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        } else
        {
            mOverlayLayout.setActionBarHideOffset(i);
            return;
        }
    }

    public void setHideOnContentScrollEnabled(boolean flag)
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

    public void setHomeActionContentDescription(int i)
    {
        mDecorToolbar.setNavigationContentDescription(i);
    }

    public void setHomeActionContentDescription(CharSequence charsequence)
    {
        mDecorToolbar.setNavigationContentDescription(charsequence);
    }

    public void setHomeAsUpIndicator(int i)
    {
        mDecorToolbar.setNavigationIcon(i);
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
        mDecorToolbar.setNavigationIcon(drawable);
    }

    public void setHomeButtonEnabled(boolean flag)
    {
        mDecorToolbar.setHomeButtonEnabled(flag);
    }

    public void setIcon(int i)
    {
        mDecorToolbar.setIcon(i);
    }

    public void setIcon(Drawable drawable)
    {
        mDecorToolbar.setIcon(drawable);
    }

    public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
    {
        mDecorToolbar.setDropdownParams(spinneradapter, new NavItemSelectedListener(onnavigationlistener));
    }

    public void setLogo(int i)
    {
        mDecorToolbar.setLogo(i);
    }

    public void setLogo(Drawable drawable)
    {
        mDecorToolbar.setLogo(drawable);
    }

    public void setNavigationMode(int i)
    {
        int j;
        boolean flag1;
        flag1 = true;
        j = mDecorToolbar.getNavigationMode();
        j;
        JVM INSTR tableswitch 2 2: default 32
    //                   2 144;
           goto _L1 _L2
_L1:
        if (j != i && !mHasEmbeddedTabs && mOverlayLayout != null)
        {
            ViewCompat.requestApplyInsets(mOverlayLayout);
        }
        mDecorToolbar.setNavigationMode(i);
        i;
        JVM INSTR tableswitch 2 2: default 88
    //                   2 169;
           goto _L3 _L4
_L3:
        Object obj = mDecorToolbar;
        boolean flag;
        if (i == 2 && !mHasEmbeddedTabs)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((DecorToolbar) (obj)).setCollapsible(flag);
        obj = mOverlayLayout;
        if (i == 2 && !mHasEmbeddedTabs)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
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
        switch (mDecorToolbar.getNavigationMode())
        {
        default:
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");

        case 2: // '\002'
            selectTab((ActionBar.Tab)mTabs.get(i));
            return;

        case 1: // '\001'
            mDecorToolbar.setDropdownSelectedPosition(i);
            return;
        }
    }

    public void setShowHideAnimationEnabled(boolean flag)
    {
        mShowHideAnimationEnabled = flag;
        if (!flag && mCurrentShowAnim != null)
        {
            mCurrentShowAnim.cancel();
        }
    }

    public void setSplitBackgroundDrawable(Drawable drawable)
    {
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
        mDecorToolbar.setSubtitle(charsequence);
    }

    public void setTitle(int i)
    {
        setTitle(((CharSequence) (mContext.getString(i))));
    }

    public void setTitle(CharSequence charsequence)
    {
        mDecorToolbar.setTitle(charsequence);
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        mDecorToolbar.setWindowTitle(charsequence);
    }

    public void show()
    {
        if (mHiddenByApp)
        {
            mHiddenByApp = false;
            updateVisibility(false);
        }
    }

    public void showForSystem()
    {
        if (mHiddenBySystem)
        {
            mHiddenBySystem = false;
            updateVisibility(true);
        }
    }

    public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        if (mActionMode != null)
        {
            mActionMode.finish();
        }
        mOverlayLayout.setHideOnContentScrollEnabled(false);
        mContextView.killMode();
        callback = new ActionModeImpl(mContextView.getContext(), callback);
        if (callback.dispatchOnCreate())
        {
            callback.invalidate();
            mContextView.initForMode(callback);
            animateToMode(true);
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
        if (!android/support/v7/app/WindowDecorActionBar.desiredAssertionStatus())
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
    static ViewPropertyAnimatorCompatSet access$302(WindowDecorActionBar windowdecoractionbar, ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset)
    {
        windowdecoractionbar.mCurrentShowAnim = viewpropertyanimatorcompatset;
        return viewpropertyanimatorcompatset;
    }

*/






}
