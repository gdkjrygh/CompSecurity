// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.app.ActionBar;
import android.support.v7.internal.view.ActionBarPolicy;
import android.support.v7.internal.view.SupportMenuInflater;
import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.DecorToolbar;
import android.support.v7.view.ActionMode;
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
import android.view.animation.AnimationUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class WindowDecorActionBar extends ActionBar
    implements android.support.v7.internal.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
{
    public final class ActionModeImpl extends ActionMode
        implements android.support.v7.internal.view.menu.MenuBuilder.Callback
    {

        private final Context mActionModeContext;
        private android.support.v7.view.ActionMode.Callback mCallback;
        private WeakReference mCustomView;
        private final MenuBuilder mMenu;
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
            ActionBarContextView actionbarcontextview;
            if (!WindowDecorActionBar.checkShowingFlags(mHiddenByApp, mHiddenBySystem))
            {
                mDeferredDestroyActionMode = this;
                mDeferredModeDestroyCallback = mCallback;
            } else
            {
                mCallback.onDestroyActionMode(this);
            }
            mCallback = null;
            animateToMode(false);
            actionbarcontextview = mContextView;
            if (actionbarcontextview.mAnimationMode != 2)
            {
                if (actionbarcontextview.mClose == null)
                {
                    actionbarcontextview.killMode();
                } else
                {
                    actionbarcontextview.finishAnimation();
                    actionbarcontextview.mAnimationMode = 2;
                    actionbarcontextview.mCurrentAnimation = actionbarcontextview.makeOutAnimation();
                    actionbarcontextview.mCurrentAnimation.start();
                }
            }
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
            return new SupportMenuInflater(mActionModeContext);
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

        public final boolean isTitleOptional()
        {
            return mContextView.mTitleOptional;
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

        public ActionModeImpl(Context context, android.support.v7.view.ActionMode.Callback callback)
        {
            this$0 = WindowDecorActionBar.this;
            super();
            mActionModeContext = context;
            mCallback = callback;
            windowdecoractionbar = new MenuBuilder(context);
            mDefaultShowAsAction = 1;
            mMenu = WindowDecorActionBar.this;
            mMenu.setCallback(this);
        }
    }


    static final boolean $assertionsDisabled;
    private static final boolean ALLOW_SHOW_HIDE_ANIMATIONS;
    ActionModeImpl mActionMode;
    private Activity mActivity;
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
    private boolean mShowHideAnimationEnabled;
    final ViewPropertyAnimatorListener mShowListener;
    private boolean mShowingForMode;
    private ActionBarContainer mSplitView;
    private ArrayList mTabs;
    private Context mThemedContext;
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

            public final void onAnimationEnd(View view)
            {
                if (mContentAnimations && mContentView != null)
                {
                    ViewCompat.setTranslationY(mContentView, 0.0F);
                    ViewCompat.setTranslationY(mContainerView, 0.0F);
                }
                if (mSplitView != null && 0 == 1)
                {
                    mSplitView.setVisibility(8);
                }
                mContainerView.setVisibility(8);
                mContainerView.setTransitioning(false);
                mCurrentShowAnim;
                view = WindowDecorActionBar.this;
                if (((WindowDecorActionBar) (view)).mDeferredModeDestroyCallback != null)
                {
                    ((WindowDecorActionBar) (view)).mDeferredModeDestroyCallback.onDestroyActionMode(((WindowDecorActionBar) (view)).mDeferredDestroyActionMode);
                    view.mDeferredDestroyActionMode = null;
                    view.mDeferredModeDestroyCallback = null;
                }
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

            public final void onAnimationEnd(View view)
            {
                mCurrentShowAnim;
                mContainerView.requestLayout();
            }

            
            {
                this$0 = WindowDecorActionBar.this;
                super();
            }
        };
        mUpdateListener = new ViewPropertyAnimatorUpdateListener() {

            final WindowDecorActionBar this$0;

            public final void onAnimationUpdate$3c7ec8c3()
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

    private static boolean checkShowingFlags(boolean flag, boolean flag1, boolean flag2)
    {
        while (flag2 || !flag && !flag1) 
        {
            return true;
        }
        return false;
    }

    private void init(View view)
    {
        Object obj;
        mOverlayLayout = (ActionBarOverlayLayout)view.findViewById(0x7f0d00c9);
        if (mOverlayLayout != null)
        {
            ActionBarOverlayLayout actionbaroverlaylayout = mOverlayLayout;
            actionbaroverlaylayout.mActionBarVisibilityCallback = this;
            if (actionbaroverlaylayout.getWindowToken() != null)
            {
                actionbaroverlaylayout.mActionBarVisibilityCallback.onWindowVisibilityChanged(actionbaroverlaylayout.mWindowVisibility);
                if (actionbaroverlaylayout.mLastSystemUiVisibility != 0)
                {
                    actionbaroverlaylayout.onWindowSystemUiVisibilityChanged(actionbaroverlaylayout.mLastSystemUiVisibility);
                    ViewCompat.requestApplyInsets(actionbaroverlaylayout);
                }
            }
        }
        obj = view.findViewById(0x7f0d00cb);
        if (!(obj instanceof DecorToolbar)) goto _L2; else goto _L1
_L1:
        obj = (DecorToolbar)obj;
_L4:
        mDecorToolbar = ((DecorToolbar) (obj));
        mContextView = (ActionBarContextView)view.findViewById(0x7f0d00cc);
        mContainerView = (ActionBarContainer)view.findViewById(0x7f0d00ca);
        mSplitView = (ActionBarContainer)view.findViewById(0x7f0d0065);
        if (mDecorToolbar == null || mContextView == null || mContainerView == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with a compatible window decor layout").toString());
        }
        break MISSING_BLOCK_LABEL_248;
_L2:
        if (!(obj instanceof Toolbar))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Toolbar)obj).getWrapper();
        if (true) goto _L4; else goto _L3
_L3:
        if ((new StringBuilder("Can't make a decor toolbar out of ")).append(obj).toString() != null)
        {
            view = obj.getClass().getSimpleName();
        } else
        {
            view = "null";
        }
        throw new IllegalStateException(view);
        mContext = mDecorToolbar.getContext();
        mContextDisplayMode = 0;
        int i;
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
        i = ((ActionBarPolicy) (view)).mContext.getApplicationInfo().targetSdkVersion;
        setHasEmbeddedTabs(view.hasEmbeddedTabs());
        view = mContext.obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.ActionBar, 0x7f0100fd, 0);
        if (view.getBoolean(19, false))
        {
            if (!mOverlayLayout.mOverlayMode)
            {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            mHideOnContentScroll = true;
            mOverlayLayout.setHideOnContentScrollEnabled(true);
        }
        i = view.getDimensionPixelSize(24, 0);
        if (i != 0)
        {
            float f = i;
            ViewCompat.setElevation(mContainerView, f);
            if (mSplitView != null)
            {
                ViewCompat.setElevation(mSplitView, f);
            }
        }
        view.recycle();
        return;
    }

    private void setHasEmbeddedTabs(boolean flag)
    {
        mHasEmbeddedTabs = flag;
        if (!mHasEmbeddedTabs)
        {
            mDecorToolbar.setEmbeddedTabView(null);
            mContainerView.setTabContainer(null);
        } else
        {
            mContainerView.setTabContainer(null);
            mDecorToolbar.setEmbeddedTabView(null);
        }
        mDecorToolbar.setCollapsible(false);
        mOverlayLayout.mHasNonEmbeddedTabs = false;
    }

    private void updateVisibility(boolean flag)
    {
        if (checkShowingFlags(mHiddenByApp, mHiddenBySystem, mShowingForMode))
        {
            if (!mNowShowing)
            {
                mNowShowing = true;
                if (mCurrentShowAnim != null)
                {
                    mCurrentShowAnim.cancel();
                }
                mContainerView.setVisibility(0);
                if (mCurWindowVisibility == 0 && ALLOW_SHOW_HIDE_ANIMATIONS && (mShowHideAnimationEnabled || flag))
                {
                    ViewCompat.setTranslationY(mContainerView, 0.0F);
                    float f2 = -mContainerView.getHeight();
                    float f = f2;
                    if (flag)
                    {
                        int ai[] = new int[2];
                        int[] _tmp = ai;
                        ai[0] = 0;
                        ai[1] = 0;
                        mContainerView.getLocationInWindow(ai);
                        f = f2 - (float)ai[1];
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
                    viewpropertyanimatorcompatset.setInterpolator(AnimationUtils.loadInterpolator(mContext, 0x10a0006));
                    viewpropertyanimatorcompatset.setDuration$795ab51d();
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
        } else
        if (mNowShowing)
        {
            mNowShowing = false;
            if (mCurrentShowAnim != null)
            {
                mCurrentShowAnim.cancel();
            }
            if (mCurWindowVisibility == 0 && ALLOW_SHOW_HIDE_ANIMATIONS && (mShowHideAnimationEnabled || flag))
            {
                ViewCompat.setAlpha(mContainerView, 1.0F);
                mContainerView.setTransitioning(true);
                ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset1 = new ViewPropertyAnimatorCompatSet();
                float f3 = -mContainerView.getHeight();
                float f1 = f3;
                if (flag)
                {
                    int ai1[] = new int[2];
                    int[] _tmp1 = ai1;
                    ai1[0] = 0;
                    ai1[1] = 0;
                    mContainerView.getLocationInWindow(ai1);
                    f1 = f3 - (float)ai1[1];
                }
                ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = ViewCompat.animate(mContainerView).translationY(f1);
                viewpropertyanimatorcompat1.setUpdateListener(mUpdateListener);
                viewpropertyanimatorcompatset1.play(viewpropertyanimatorcompat1);
                if (mContentAnimations && mContentView != null)
                {
                    viewpropertyanimatorcompatset1.play(ViewCompat.animate(mContentView).translationY(f1));
                }
                if (mSplitView != null && mSplitView.getVisibility() == 0)
                {
                    ViewCompat.setAlpha(mSplitView, 1.0F);
                    viewpropertyanimatorcompatset1.play(ViewCompat.animate(mSplitView).translationY(mSplitView.getHeight()));
                }
                viewpropertyanimatorcompatset1.setInterpolator(AnimationUtils.loadInterpolator(mContext, 0x10a0005));
                viewpropertyanimatorcompatset1.setDuration$795ab51d();
                viewpropertyanimatorcompatset1.setListener(mHideListener);
                mCurrentShowAnim = viewpropertyanimatorcompatset1;
                viewpropertyanimatorcompatset1.start();
                return;
            } else
            {
                mHideListener.onAnimationEnd(null);
                return;
            }
        }
    }

    public final void animateToMode(boolean flag)
    {
        boolean flag1 = false;
        Object obj;
        int i;
        if (flag)
        {
            if (!mShowingForMode)
            {
                mShowingForMode = true;
                if (mOverlayLayout != null)
                {
                    ActionBarOverlayLayout.setShowingForActionMode$1385ff();
                }
                updateVisibility(false);
            }
        } else
        if (mShowingForMode)
        {
            mShowingForMode = false;
            if (mOverlayLayout != null)
            {
                ActionBarOverlayLayout.setShowingForActionMode$1385ff();
            }
            updateVisibility(false);
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

    public final void dispatchMenuVisibilityChanged(boolean flag)
    {
        if (flag != mLastMenuVisibility)
        {
            mLastMenuVisibility = flag;
            int j = mMenuVisibilityListeners.size();
            int i = 0;
            while (i < j) 
            {
                mMenuVisibilityListeners.get(i);
                i++;
            }
        }
    }

    public final void enableContentAnimations(boolean flag)
    {
        mContentAnimations = flag;
    }

    public final View getCustomView()
    {
        return mDecorToolbar.getCustomView();
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
            mContext.getTheme().resolveAttribute(0x7f010100, typedvalue, true);
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
        ActionBarContainer actionbarcontainer;
        boolean flag;
        flag = true;
        actionbarcontainer = mContainerView;
        if (actionbarcontainer.mBackground != null)
        {
            actionbarcontainer.mBackground.setCallback(null);
            actionbarcontainer.unscheduleDrawable(actionbarcontainer.mBackground);
        }
        actionbarcontainer.mBackground = drawable;
        if (drawable != null)
        {
            drawable.setCallback(actionbarcontainer);
            if (actionbarcontainer.mActionBarView != null)
            {
                actionbarcontainer.mBackground.setBounds(actionbarcontainer.mActionBarView.getLeft(), actionbarcontainer.mActionBarView.getTop(), actionbarcontainer.mActionBarView.getRight(), actionbarcontainer.mActionBarView.getBottom());
            }
        }
        if (!actionbarcontainer.mIsSplit) goto _L2; else goto _L1
_L1:
        if (actionbarcontainer.mSplitBackground != null)
        {
            flag = false;
        }
_L4:
        actionbarcontainer.setWillNotDraw(flag);
        actionbarcontainer.invalidate();
        return;
_L2:
        if (actionbarcontainer.mBackground != null || actionbarcontainer.mStackedBackground != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void setCustomView(int i)
    {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(0x7f04002f, mDecorToolbar.getViewGroup(), false));
    }

    public final void setCustomView(View view)
    {
        mDecorToolbar.setCustomView(view);
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

    public final void setDisplayShowTitleEnabled(boolean flag)
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

    public final void setHomeActionContentDescription(int i)
    {
        mDecorToolbar.setNavigationContentDescription(i);
    }

    public final void setHomeAsUpIndicator(Drawable drawable)
    {
        mDecorToolbar.setNavigationIcon(drawable);
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

    public final void setTitle$13462e()
    {
        setTitle(mContext.getString(0x7f100286));
    }

    public final void setWindowTitle(CharSequence charsequence)
    {
        mDecorToolbar.setWindowTitle(charsequence);
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
    static ViewPropertyAnimatorCompatSet access$502$906f40c(WindowDecorActionBar windowdecoractionbar)
    {
        windowdecoractionbar.mCurrentShowAnim = null;
        return null;
    }

*/




}
