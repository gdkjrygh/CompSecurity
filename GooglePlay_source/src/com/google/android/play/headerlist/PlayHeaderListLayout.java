// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.Adapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.play.animation.AnimationCompat;
import com.google.android.play.widget.ScrollProxyView;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListOnScrollListener, PlayHeaderListRecyclerViewListener, PlayHeaderScrollableContentListener, PlayScrollableContentView, 
//            PlayHeaderListTabStrip, PlayHeaderListTabContainer

public class PlayHeaderListLayout extends FrameLayout
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
    private final class ActionBarTitleAlphaAnimation extends FloatAnimation
    {

        final PlayHeaderListLayout this$0;

        protected final void setValue(float f)
        {
            setActionBarTitleAlpha(f);
        }

        public ActionBarTitleAlphaAnimation(float f, float f1)
        {
            this$0 = PlayHeaderListLayout.this;
            super(f, f1);
        }
    }

    public static abstract class Configurator
    {

        protected final Context mContext;

        public void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup)
        {
        }

        public abstract void addContentView(LayoutInflater layoutinflater, ViewGroup viewgroup);

        public void addHeroView(LayoutInflater layoutinflater, ViewGroup viewgroup)
        {
        }

        public boolean alwaysUseFloatingBackground()
        {
            return !PlayHeaderListLayout.USE_ANIMATIONS;
        }

        public float getBackgroundViewParallaxRatio()
        {
            return 0.7F;
        }

        public PlayHeaderListTabStrip getCustomTabStrip$78490773(Context context)
        {
            return null;
        }

        public abstract int getHeaderHeight();

        public int getHeaderMode()
        {
            return 0;
        }

        public int getHeaderShadowMode()
        {
            return 0;
        }

        public int getHeroAnimationMode()
        {
            return 0;
        }

        public int getListViewId()
        {
            return 0x7f0d0052;
        }

        public abstract int getTabMode();

        public int getTabPaddingMode()
        {
            return !alwaysUseFloatingBackground() ? 0 : 1;
        }

        public Toolbar getToolbar(LayoutInflater layoutinflater, ViewGroup viewgroup)
        {
            return (Toolbar)layoutinflater.inflate(0x7f04011e, viewgroup, false);
        }

        public int getToolbarTitleMode()
        {
            return 0;
        }

        public int getViewPagerId()
        {
            return 0x7f0d0054;
        }

        public abstract boolean hasViewPager();

        public boolean useBuiltInActionBar()
        {
            return false;
        }

        public Configurator(Context context)
        {
            mContext = context;
        }
    }

    private abstract class FloatAnimation extends Animation
    {

        private final float mFrom;
        private final float mTo;
        final PlayHeaderListLayout this$0;

        protected void applyTransformation(float f, Transformation transformation)
        {
            super.applyTransformation(f, transformation);
            setValue((mTo - mFrom) * f + mFrom);
        }

        protected abstract void setValue(float f);

        protected FloatAnimation(float f, float f1)
        {
            this$0 = PlayHeaderListLayout.this;
            super();
            mFrom = f;
            mTo = f1;
        }
    }

    private final class FloatingFractionAnimation extends FloatAnimation
    {

        final PlayHeaderListLayout this$0;

        protected final void setValue(float f)
        {
            setFloatingFraction(f, true);
        }

        public FloatingFractionAnimation(float f, float f1)
        {
            this$0 = PlayHeaderListLayout.this;
            super(f, f1);
        }
    }

    public static interface LayoutListener
    {

        public abstract void onPlayHeaderListLayoutChanged();
    }

    public static abstract class PullToRefreshProvider
    {

        public boolean isPageRefreshing$134632()
        {
            return false;
        }

        public abstract void onPulledToRefresh();

        public boolean supportsPullToRefresh$134632()
        {
            return true;
        }

        public PullToRefreshProvider()
        {
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        final float mFloatingFraction;

        public String toString()
        {
            return String.format(Locale.US, "floatingFraction: %f", new Object[] {
                Float.valueOf(mFloatingFraction)
            });
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(mFloatingFraction);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            mFloatingFraction = parcel.readFloat();
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable, PlayHeaderListLayout playheaderlistlayout)
        {
            super(parcelable);
            mFloatingFraction = playheaderlistlayout.mFloatingFraction;
        }
    }


    static final boolean SUPPORT_DRAW_STATUS_BAR;
    public static final boolean SUPPORT_ELEVATION;
    public static final boolean USE_ANIMATIONS;
    private static Map sActionbarAttachedCount = new WeakHashMap();
    public int mAbsoluteY;
    private float mActionBarTitleAlpha;
    public boolean mAllowImmersiveBackground;
    public View mAltPlayBackground;
    public AnimationCompat mAltPlayBackgroundCompat;
    public boolean mAlwaysUseFloatingBackground;
    private Map mAnimatorMap;
    public android.support.v7.widget.RecyclerView.OnScrollListener mAppRecyclerViewOnScrollListener;
    private boolean mAttached;
    public boolean mAutoHideToolbarTitle;
    public FrameLayout mBackgroundContainer;
    public AnimationCompat mBackgroundContainerCompat;
    private final float mBackgroundFadeInOffsetThresholdPx;
    public float mBackgroundParallaxRatio;
    public float mBannerFraction;
    CharSequence mBannerText;
    public TextView mBannerTextView;
    public AnimationCompat mBannerTextViewCompat;
    boolean mBannerVisible;
    public View mContentContainer;
    public AnimationCompat mContentContainerCompat;
    public boolean mContentProtectionEnabled;
    public boolean mControlsAreFloating;
    public ViewGroup mControlsContainer;
    public AnimationCompat mControlsContainerCompat;
    public android.support.v4.view.ViewPager.OnPageChangeListener mExternalPageChangeListener;
    public Drawable mFloatingControlsBackground;
    private float mFloatingFraction;
    final Handler mHandler;
    private boolean mHasPullToRefresh;
    public boolean mHasViewPager;
    public int mHeaderBottomMargin;
    public int mHeaderHeight;
    public int mHeaderMode;
    public View mHeaderShadow;
    public AnimationCompat mHeaderShadowCompat;
    public int mHeaderShadowMode;
    private boolean mHeaderShadowVisible;
    public int mHeroAnimationMode;
    public FrameLayout mHeroContainer;
    public AnimationCompat mHeroContainerCompat;
    private boolean mHeroVisible;
    private boolean mLastScrollWasDown;
    public LayoutListener mLayoutListener;
    public int mListViewId;
    public final android.support.v4.view.ViewPager.OnPageChangeListener mOnPageChangeListener;
    int mPendingListSync;
    private SavedState mPendingSavedState;
    public int mPullToRefreshAdapterPage;
    public PullToRefreshProvider mPullToRefreshProvider;
    public ScrollProxyView mScrollProxyView;
    private final Runnable mSnapControlsDownIfNeededRunnable;
    private final Runnable mSnapControlsUpIfNeededRunnable;
    public int mSpacerId;
    private int mStatusBarHeight;
    private boolean mSuppressIdleOnScroll;
    public SwipeRefreshLayout mSwipeRefreshLayout;
    public AnimationCompat mSwipeRefreshLayoutCompat;
    public int mTabA11yMode;
    public View mTabBar;
    public TextView mTabBarTitleView;
    public int mTabBgMode;
    public int mTabMode;
    public int mTabPaddingMode;
    public PlayHeaderListTabStrip mTabStrip;
    Runnable mTemporaryBannerGoneRunnable;
    final Runnable mTemporaryBannerTimeoutRunnable;
    public Toolbar mToolbar;
    public ViewGroup mToolbarContainer;
    public int mToolbarContainerA11yOffset;
    public AnimationCompat mToolbarContainerCompat;
    public int mToolbarHeight;
    private final PlayHeaderScrollableContentListener mTrackedListContentViewScrollListener;
    private final PlayHeaderListRecyclerViewListener mTrackedListRecyclerViewScrollListener;
    private final PlayHeaderListOnScrollListener mTrackedListScrollListener;
    private ViewGroup mTrackedListView;
    private boolean mUpdateContentPositionOnLayout;
    public boolean mUseBuiltInToolbar;
    private ViewPager mViewPager;
    public int mViewPagerId;

    public PlayHeaderListLayout(Context context)
    {
        this(context, null);
    }

    public PlayHeaderListLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayHeaderListLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mHandler = new Handler();
        mOnPageChangeListener = new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final PlayHeaderListLayout this$0;

            public final void onPageScrollStateChanged(int j)
            {
                if (mExternalPageChangeListener != null)
                {
                    mExternalPageChangeListener.onPageScrollStateChanged(j);
                }
                if (j != 0 && (mHeaderMode == 0 || mHeaderMode == 2))
                {
                    snapControlsIfNeeded(true, true);
                }
            }

            public final void onPageScrolled(int j, float f, int k)
            {
                if (mPullToRefreshProvider != null)
                {
                    PullToRefreshProvider pulltorefreshprovider1;
                    int l;
                    boolean flag;
                    if (f > 0.5F)
                    {
                        l = 1;
                    } else
                    {
                        l = 0;
                    }
                    l += j;
                    flag = mSwipeRefreshLayout.mRefreshing;
                    if (l != mPullToRefreshAdapterPage)
                    {
                        mPullToRefreshAdapterPage = l;
                        PullToRefreshProvider pulltorefreshprovider = mPullToRefreshProvider;
                        int _tmp = mPullToRefreshAdapterPage;
                        boolean flag1 = pulltorefreshprovider._mth134632();
                        mSwipeRefreshLayout.setRefreshing(flag1);
                        pulltorefreshprovider = mPullToRefreshProvider;
                        SwipeRefreshLayout _tmp1 = mSwipeRefreshLayout;
                    }
                    pulltorefreshprovider1 = mPullToRefreshProvider;
                }
                if (mExternalPageChangeListener != null)
                {
                    mExternalPageChangeListener.onPageScrolled(j, f, k);
                }
            }

            public final void onPageSelected(int j)
            {
                updateActiveListView();
                if (mExternalPageChangeListener != null)
                {
                    mExternalPageChangeListener.onPageSelected(j);
                }
            }

            
            {
                this$0 = PlayHeaderListLayout.this;
                super();
            }
        };
        mHeroAnimationMode = 0;
        mPullToRefreshAdapterPage = -1;
        mHeroVisible = true;
        mActionBarTitleAlpha = 0.5F;
        mLastScrollWasDown = true;
        mTrackedListScrollListener = new PlayHeaderListOnScrollListener(this);
        mTrackedListRecyclerViewScrollListener = new PlayHeaderListRecyclerViewListener(this);
        mTrackedListContentViewScrollListener = new PlayHeaderScrollableContentListener(this);
        mAnimatorMap = new HashMap();
        mSnapControlsUpIfNeededRunnable = new Runnable() {

            final PlayHeaderListLayout this$0;

            public final void run()
            {
                snapControlsIfNeeded(false, false);
            }

            
            {
                this$0 = PlayHeaderListLayout.this;
                super();
            }
        };
        mSnapControlsDownIfNeededRunnable = new Runnable() {

            final PlayHeaderListLayout this$0;

            public final void run()
            {
                snapControlsIfNeeded(true, false);
            }

            
            {
                this$0 = PlayHeaderListLayout.this;
                super();
            }
        };
        mTemporaryBannerTimeoutRunnable = new Runnable() {

            final PlayHeaderListLayout this$0;

            public final void run()
            {
                if (null != null)
                {
                    null.run();
                    mTemporaryBannerGoneRunnable;
                }
                PlayHeaderListLayout playheaderlistlayout = PlayHeaderListLayout.this;
                playheaderlistlayout.mHandler.removeCallbacks(playheaderlistlayout.mTemporaryBannerTimeoutRunnable);
                playheaderlistlayout.mTemporaryBannerGoneRunnable = null;
                playheaderlistlayout.mBannerText = null;
                if (!playheaderlistlayout.mBannerVisible)
                {
                    return;
                }
                playheaderlistlayout.mBannerVisible = false;
                android.widget.FrameLayout.LayoutParams layoutparams;
                if (PlayHeaderListLayout.USE_ANIMATIONS)
                {
                    playheaderlistlayout.getFloatAnimator("bannerFraction", playheaderlistlayout.mBannerFraction, 0.0F).setDuration(200L).start();
                } else
                {
                    playheaderlistlayout.mBannerTextView.setVisibility(8);
                }
                layoutparams = (android.widget.FrameLayout.LayoutParams)playheaderlistlayout.mContentContainer.getLayoutParams();
                layoutparams.setMargins(0, 0, 0, 0);
                playheaderlistlayout.mContentContainer.setLayoutParams(layoutparams);
            }

            
            {
                this$0 = PlayHeaderListLayout.this;
                super();
            }
        };
        mBackgroundFadeInOffsetThresholdPx = context.getResources().getDisplayMetrics().density * 20F;
    }

    private float getContentPosition()
    {
        if (mAbsoluteY == -1)
        {
            return (float)mHeaderBottomMargin;
        } else
        {
            return (float)Math.max(mHeaderBottomMargin, mHeaderHeight - mAbsoluteY);
        }
    }

    public static int getDefaultToolbarHeight(Context context)
    {
        return context.getResources().getDimensionPixelSize(0x7f0c0001);
    }

    private float getFloatingFraction()
    {
        if (mControlsAreFloating)
        {
            return mFloatingFraction;
        } else
        {
            return 0.0F;
        }
    }

    private float getFullFloatingHeaderHeight()
    {
        return (float)mToolbarHeight + getVisibleTabBarHeight();
    }

    private ViewGroup getListView(int i)
    {
        int j;
        if (mViewPager == null && i == 1)
        {
            return validateListView(mContentContainer.findViewById(mListViewId));
        }
        j = relativeToAbsolute(i);
        if (mViewPager != null && mViewPager.mAdapter != null && j >= 0 && j < mViewPager.mAdapter.getCount()) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        if (view != null)
        {
            return validateListView(view.findViewById(mListViewId));
        } else
        {
            return null;
        }
_L2:
        i = 0;
_L5:
        if (i >= mViewPager.getChildCount())
        {
            break MISSING_BLOCK_LABEL_157;
        }
        view = mViewPager.getChildAt(i);
        Object obj = mViewPager.infoForChild(view);
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = Integer.valueOf(((android.support.v4.view.ViewPager.ItemInfo) (obj)).position);
        }
        if (obj != null && ((Integer) (obj)).intValue() == j) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
        view = null;
          goto _L4
    }

    public static int getMinimumHeaderHeight(Context context, int i, int j)
    {
        j = getDefaultToolbarHeight(context);
        return getTabBarHeight(context, i) + 0 + j;
    }

    private float getNonScrollingFloatingHeaderHeight()
    {
        switch (mHeaderMode)
        {
        default:
            return 0.0F;

        case 1: // '\001'
            return 0.0F + getVisibleTabBarHeight();

        case 2: // '\002'
            return 0.0F + (float)mToolbarHeight;

        case 3: // '\003'
            return 0.0F + (getVisibleTabBarHeight() + (float)mToolbarHeight);
        }
    }

    private float getScrollingFloatingHeaderHeight()
    {
        switch (mHeaderMode)
        {
        default:
            throw new IllegalStateException();

        case 0: // '\0'
            return getVisibleTabBarHeight() + (float)mToolbarHeight;

        case 1: // '\001'
            return (float)mToolbarHeight;

        case 2: // '\002'
            return getVisibleTabBarHeight();

        case 3: // '\003'
            return 0.0F;
        }
    }

    private static int getTabBarHeight(Context context, int i)
    {
        switch (i)
        {
        default:
            throw new IllegalStateException();

        case 0: // '\0'
        case 1: // '\001'
            return context.getResources().getDimensionPixelSize(0x7f0c02ff);

        case 2: // '\002'
            return 0;
        }
    }

    private float getVisibleTabBarHeight()
    {
        return (float)getTabBarHeight(getContext(), mTabMode);
    }

    private boolean isListViewReady(ViewGroup viewgroup)
    {
label0:
        {
            if (viewgroup != null)
            {
                int i;
                if (viewgroup instanceof ListView)
                {
                    ListAdapter listadapter = ((ListView)viewgroup).getAdapter();
                    if (listadapter == null)
                    {
                        i = 0;
                    } else
                    {
                        i = listadapter.getCount();
                    }
                } else
                if (viewgroup instanceof RecyclerView)
                {
                    android.support.v7.widget.RecyclerView.Adapter adapter = ((RecyclerView)viewgroup).mAdapter;
                    if (adapter == null)
                    {
                        i = 0;
                    } else
                    {
                        i = adapter.getItemCount();
                    }
                } else
                if (viewgroup instanceof PlayScrollableContentView)
                {
                    Adapter adapter1 = ((PlayScrollableContentView)viewgroup).getAdapter();
                    if (adapter1 == null)
                    {
                        i = 0;
                    } else
                    {
                        i = adapter1.getCount();
                    }
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Unexpected listview type: ")).append(viewgroup).toString());
                }
                if (i > 1)
                {
                    break label0;
                }
            }
            return false;
        }
        if (viewgroup.getChildCount() > 1)
        {
            return true;
        }
        if (viewgroup.getChildCount() == 1)
        {
            return viewgroup.getChildAt(0).getId() != mSpacerId;
        } else
        {
            return false;
        }
    }

    private static Drawable makeNonFloatingBackground()
    {
        return new ColorDrawable(0);
    }

    private int relativeToAbsolute(int i)
    {
        int k = mViewPager.mCurItem;
        int j = k;
        if (i == 0)
        {
            j = k - 1;
        }
        k = j;
        if (i == 2)
        {
            k = j + 1;
        }
        return k;
    }

    private boolean setActiveListView(ViewGroup viewgroup)
    {
        if (mTrackedListView == viewgroup)
        {
            return mTrackedListView != null;
        }
        int i;
        boolean flag;
        if (mTrackedListView != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (mTrackedListView == null) goto _L2; else goto _L1
_L1:
        if (!(mTrackedListView instanceof ListView)) goto _L4; else goto _L3
_L3:
        ((ListView)mTrackedListView).setOnScrollListener(null);
        mTrackedListScrollListener.reset(true);
_L6:
        mSuppressIdleOnScroll = true;
          goto _L2
_L4:
        if (mTrackedListView instanceof RecyclerView)
        {
            ((RecyclerView)mTrackedListView).mScrollListener = null;
            mTrackedListRecyclerViewScrollListener.reset(true);
        } else
        if (mTrackedListView instanceof PlayScrollableContentView)
        {
            mTrackedListContentViewScrollListener.reset(true);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        mTrackedListView = viewgroup;
        if (mTrackedListView != null)
        {
            flag = mSuppressIdleOnScroll;
            if (!mSuppressIdleOnScroll)
            {
                mSuppressIdleOnScroll = mTrackedListView.isLayoutRequested();
            }
            if (mTrackedListView instanceof ListView)
            {
                ((ListView)mTrackedListView).setOnScrollListener(mTrackedListScrollListener);
            } else
            if (mTrackedListView instanceof RecyclerView)
            {
                ((RecyclerView)mTrackedListView).mScrollListener = mTrackedListRecyclerViewScrollListener;
            }
            mSuppressIdleOnScroll = flag;
            if (i != 0)
            {
                syncListViews(true);
            }
            if (mPullToRefreshProvider != null)
            {
                viewgroup = mPullToRefreshProvider;
                if (mHasViewPager)
                {
                    i = mViewPager.mCurItem;
                }
                mHasPullToRefresh = viewgroup._mth134632();
                return true;
            } else
            {
                mHasPullToRefresh = false;
                return true;
            }
        }
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void setChildTopMargin(View view, int i)
    {
        ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()).topMargin = i;
        view.requestLayout();
    }

    private void setControlsFloating(boolean flag, boolean flag1)
    {
        float f = 1.0F;
        if (mControlsAreFloating == flag)
        {
            return;
        }
        if (flag)
        {
            float f1 = getVisibleHeaderHeight();
            float f2 = getNonScrollingFloatingHeaderHeight();
            float f3 = getScrollingFloatingHeaderHeight();
            if (f3 == 0.0F)
            {
                mFloatingFraction = 1.0F;
            } else
            {
                mFloatingFraction = Math.max(0.0F, Math.min(1.0F, (f1 - f2) / f3));
            }
        } else
        {
            mFloatingFraction = 0.0F;
        }
        mControlsAreFloating = flag;
        if (!mAlwaysUseFloatingBackground)
        {
            if (mControlsAreFloating)
            {
                setControlsBackground(mFloatingControlsBackground, flag1);
            } else
            {
                setControlsBackground(makeNonFloatingBackground(), flag1);
            }
        }
        if (mAutoHideToolbarTitle)
        {
            if (!mControlsAreFloating)
            {
                f = 0.0F;
            }
            if (flag1)
            {
                if (f != mActionBarTitleAlpha)
                {
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        getFloatAnimator("actionBarTitleAlpha", mActionBarTitleAlpha, f).setDuration(200L).start();
                    } else
                    {
                        ActionBarTitleAlphaAnimation actionbartitlealphaanimation = new ActionBarTitleAlphaAnimation(mActionBarTitleAlpha, f);
                        actionbartitlealphaanimation.setDuration(200L);
                        startAnimation(actionbartitlealphaanimation);
                    }
                }
            } else
            {
                setActionBarTitleAlpha(f);
            }
        }
        updateHeaderShadow();
        updateTabPadding(flag1);
        updateTabContrast();
    }

    private void setHeroAnimationValue(float f, boolean flag)
    {
        if (flag)
        {
            switch (mHeroAnimationMode)
            {
            case 0: // '\0'
                AnimationCompat animationcompat = mHeroContainerCompat;
                if (animationcompat.mView == null)
                {
                    animationcompat.mScale = f;
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT >= 12)
                {
                    animationcompat.mView.animate().scaleX(f).scaleY(f).setDuration(100L);
                    return;
                }
                ScaleAnimation scaleanimation = new ScaleAnimation(animationcompat.mScale, f, animationcompat.mScale, f);
                scaleanimation.setDuration(100L);
                scaleanimation.setFillAfter(true);
                if (android.os.Build.VERSION.SDK_INT < 12)
                {
                    scaleanimation.setAnimationListener(new com.google.android.play.animation.AnimationCompat._cls2(animationcompat, f));
                }
                animationcompat.mView.startAnimation(scaleanimation);
                return;

            case 1: // '\001'
            case 2: // '\002'
                mHeroContainerCompat.animateAlpha$2549578(f);
                return;
            }
        } else
        {
            switch (mHeroAnimationMode)
            {
            default:
                return;

            case 0: // '\0'
                AnimationCompat animationcompat1 = mHeroContainerCompat;
                if (animationcompat1.mView == null)
                {
                    animationcompat1.mScale = f;
                    return;
                }
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    animationcompat1.mView.setScaleX(f);
                    animationcompat1.mView.setScaleY(f);
                    return;
                }
                if (animationcompat1.mScale != f)
                {
                    animationcompat1.mScale = f;
                    ScaleAnimation scaleanimation1 = new ScaleAnimation(animationcompat1.mScale, animationcompat1.mScale, animationcompat1.mScale, animationcompat1.mScale);
                    scaleanimation1.setDuration(0L);
                    scaleanimation1.setFillAfter(true);
                    animationcompat1.mView.startAnimation(scaleanimation1);
                    return;
                }
                break;

            case 1: // '\001'
            case 2: // '\002'
                mHeroContainerCompat.setAlpha(f);
                return;
            }
        }
        while (true) 
        {
            return;
        }
    }

    private void setupViewPagerIfNeeded()
    {
        if (mHasViewPager && mViewPager == null)
        {
            ViewPager viewpager = (ViewPager)mContentContainer.findViewById(mViewPagerId);
            if (viewpager != null)
            {
                mViewPager = viewpager;
                PlayHeaderListTabStrip playheaderlisttabstrip = mTabStrip;
                if (playheaderlisttabstrip.mPager != null)
                {
                    playheaderlisttabstrip.mPager.mOnPageChangeListener = null;
                }
                playheaderlisttabstrip.mPager = viewpager;
                if (playheaderlisttabstrip.mPager != null)
                {
                    playheaderlisttabstrip.mPager.mOnPageChangeListener = playheaderlisttabstrip.mPageListener;
                }
                playheaderlisttabstrip.notifyPagerAdapterChanged();
            }
        }
    }

    private void syncListViews(boolean flag)
    {
        int i = 2;
        if (mViewPager == null)
        {
            return;
        }
        boolean flag1 = false;
        if (flag)
        {
            flag = syncViewPagerListView(1);
            flag1 = flag;
            if (!flag)
            {
                mSuppressIdleOnScroll = false;
                flag1 = flag;
            }
        }
        if (syncViewPagerListView(0) | flag1 | syncViewPagerListView(2))
        {
            if (!flag1)
            {
                i = 1;
            }
            mPendingListSync = i;
            return;
        } else
        {
            mPendingListSync = 0;
            return;
        }
    }

    private boolean syncViewPagerListView(int i)
    {
        if (mViewPager != null && mViewPager.mAdapter != null) goto _L2; else goto _L1
_L1:
        int j;
        return false;
_L2:
        if ((j = relativeToAbsolute(i)) < 0 || j >= mViewPager.mAdapter.getCount()) goto _L1; else goto _L3
_L3:
        Object obj;
        int k;
        obj = getListView(i);
        if (i == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!isListViewReady(((ViewGroup) (obj))))
        {
            return true;
        }
        k = tryGetContentTop(((ViewGroup) (obj)));
        if (k != -1) goto _L5; else goto _L4
_L4:
        if (mControlsAreFloating) goto _L1; else goto _L6
_L6:
        mSuppressIdleOnScroll = true;
        if (!(obj instanceof ListView)) goto _L8; else goto _L7
_L7:
        ((ListView)obj).setSelectionFromTop(0, 0);
_L9:
        mSuppressIdleOnScroll = false;
        return true;
_L8:
        if (obj instanceof RecyclerView)
        {
            ((RecyclerView)obj).scrollToPosition(0);
        }
        if (true) goto _L9; else goto _L5
_L5:
        float f;
        if (mControlsAreFloating && (mHeaderMode == 0 || mHeaderMode == 2))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            f = getFullFloatingHeaderHeight();
        } else
        {
            f = getVisibleHeaderHeight();
        }
        j = k - ((int)f + mHeaderBottomMargin);
        if (mControlsAreFloating && j < 0) goto _L1; else goto _L10
_L10:
        if (Math.abs(j) <= 0 || !ViewCompat.canScrollVertically(((View) (obj)), j))
        {
            continue; /* Loop/switch isn't completed */
        }
        mSuppressIdleOnScroll = true;
        if (obj instanceof ListView)
        {
            obj = (ListView)obj;
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                ((ListView) (obj)).scrollListBy(j);
            } else
            {
                ((ListView) (obj)).smoothScrollBy(j, 0);
            }
        } else
        if (obj instanceof RecyclerView)
        {
            ((RecyclerView)obj).scrollBy(0, j);
        }
        mSuppressIdleOnScroll = false;
        if (i == 0) goto _L1; else goto _L11
_L11:
        mUpdateContentPositionOnLayout = true;
        return false;
        if (i == 0) goto _L1; else goto _L12
_L12:
        updateContentPosition(true);
        return false;
    }

    private View tryFindHeaderSpacerView(ViewGroup viewgroup)
    {
        for (int i = 0; i < viewgroup.getChildCount(); i++)
        {
            View view = viewgroup.getChildAt(i);
            if (view.getId() == mSpacerId)
            {
                return view;
            }
        }

        return null;
    }

    private int tryGetContentTop(ViewGroup viewgroup)
    {
        int i = -1;
        viewgroup = tryFindHeaderSpacerView(viewgroup);
        if (viewgroup != null)
        {
            i = viewgroup.getBottom();
        }
        return i;
    }

    private void updateContentPosition(boolean flag)
    {
        if (isListViewReady(mTrackedListView))
        {
            mAbsoluteY = tryGetCollectionViewAbsoluteY(mTrackedListView);
            if (mPullToRefreshProvider != null)
            {
                boolean flag1;
                if (mAbsoluteY == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                setPullToRefreshEnabled(flag1);
            }
            updateFloatingState();
            if (flag)
            {
                layout();
                return;
            }
        }
    }

    private boolean updateFloatingState()
    {
        boolean flag;
        if (mControlsAreFloating)
        {
            float f = mHeaderHeight;
            float f2 = getFullFloatingHeaderHeight();
            float f4 = mHeaderBottomMargin;
            if (mAbsoluteY == -1 || Math.round(mAbsoluteY) > Math.round(f - f2 - f4))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            float f1 = mHeaderHeight - mHeaderBottomMargin;
            float f3 = getNonScrollingFloatingHeaderHeight();
            if (Math.round(mAbsoluteY) >= Math.round(f1 - f3) || mAbsoluteY == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (flag != mControlsAreFloating)
        {
            setControlsFloating(flag, true);
            return true;
        } else
        {
            return false;
        }
    }

    private void updateHeaderShadow()
    {
        int j;
        int k;
        j = 0;
        k = 0;
        mHeaderShadowMode;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 235
    //                   2 208
    //                   3 214;
           goto _L1 _L2 _L3 _L4
_L1:
        if (!mControlsAreFloating && !mAlwaysUseFloatingBackground || getVisibleHeaderHeight() <= 0.0F) goto _L6; else goto _L5
_L5:
        if (mBackgroundContainer.getVisibility() == 0) goto _L8; else goto _L7
_L7:
        boolean flag = false;
_L13:
        if (flag) goto _L6; else goto _L9
_L9:
        boolean flag1 = true;
_L11:
        if (mHeaderShadowVisible != flag1)
        {
            mHeaderShadowVisible = flag1;
            if (!SUPPORT_ELEVATION)
            {
                break; /* Loop/switch isn't completed */
            }
            float f = getFloatingFraction();
            float f1;
            AnimationCompat animationcompat;
            if (flag1 && (double)f > 0.25D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1)
            {
                f = getResources().getDimensionPixelSize(0x7f0c02fb);
            } else
            {
                f = 0.0F;
            }
            if (flag1)
            {
                j = 150;
            } else
            {
                j = 0;
            }
            if (flag)
            {
                k = 100;
            }
            mControlsContainerCompat.animateZ(f, j, k);
            mToolbarContainerCompat.animateZ(f, j, k);
            mBannerTextView.animate().z(f).setStartDelay(k).setDuration(j);
        }
        return;
_L3:
        flag1 = false;
        continue; /* Loop/switch isn't completed */
_L4:
        if (getVisibleHeaderHeight() > 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (mControlsAreFloating && getVisibleHeaderHeight() > 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (getMeasuredHeight() != 0 && (mControlsAreFloating || mAlwaysUseFloatingBackground))
        {
            f1 = mBackgroundContainer.getMeasuredHeight();
            animationcompat = mBackgroundContainerCompat;
            if (animationcompat.mView != null && android.os.Build.VERSION.SDK_INT >= 11)
            {
                f = animationcompat.mView.getTranslationY();
            } else
            {
                f = animationcompat.mTranslationY;
            }
            if (Math.max(0.0F, Math.max(0.0F, f + f1) - getVisibleHeaderHeight()) <= 0.0F)
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = true;
        continue; /* Loop/switch isn't completed */
_L6:
        flag1 = false;
        if (true) goto _L11; else goto _L10
_L10:
        View view = mHeaderShadow;
        int i;
        if (flag1)
        {
            i = j;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private static ViewGroup validateListView(View view)
    {
        if (view == null || (view instanceof ListView) || (view instanceof RecyclerView) || (view instanceof PlayScrollableContentView))
        {
            return (ViewGroup)view;
        } else
        {
            throw new IllegalStateException("Found a view that isn't a ListView or a RecyclerView or a PlayScrollableContentView implementation");
        }
    }

    public final View getActionBarView()
    {
        if (mUseBuiltInToolbar)
        {
            return mToolbar;
        } else
        {
            return getToolbarContainer();
        }
    }

    public int getBannerHeight()
    {
        return getResources().getDimensionPixelSize(0x7f0c02fa);
    }

    ObjectAnimator getFloatAnimator(String s, float f, float f1)
    {
        ObjectAnimator objectanimator = (ObjectAnimator)mAnimatorMap.get(s);
        if (objectanimator != null)
        {
            objectanimator.cancel();
        }
        objectanimator = ObjectAnimator.ofFloat(this, s, new float[] {
            f, f1
        });
        mAnimatorMap.put(s, objectanimator);
        return objectanimator;
    }

    public final int getTabBarHeight()
    {
        return getTabBarHeight(getContext(), mTabMode);
    }

    public ViewGroup getToolbarContainer()
    {
        ViewGroup viewgroup;
        if (mToolbarContainer != null)
        {
            viewgroup = mToolbarContainer;
        } else
        {
            if (mUseBuiltInToolbar)
            {
                viewgroup = (ViewGroup)findViewById(0x7f0d0320);
                viewgroup.setVisibility(0);
                return viewgroup;
            }
            ViewGroup viewgroup1 = (ViewGroup)((Activity)getContext()).getWindow().findViewById(0x7f0d00ca);
            viewgroup = viewgroup1;
            if (!USE_ANIMATIONS)
            {
                findViewById(0x7f0d0320).setMinimumHeight(mToolbarHeight);
                return viewgroup1;
            }
        }
        return viewgroup;
    }

    public final float getVisibleHeaderHeight()
    {
        if (mControlsAreFloating)
        {
            float f = getNonScrollingFloatingHeaderHeight();
            float f1 = getScrollingFloatingHeaderHeight();
            return f + mFloatingFraction * f1;
        } else
        {
            return getContentPosition() - (float)mHeaderBottomMargin;
        }
    }

    public void layout()
    {
        float f;
        float f2;
        float f3;
        float f5;
        float f6;
        float f7;
        int i = getBannerHeight();
        f = mBannerFraction * (float)(i + 0);
        f2 = i;
        mBannerTextViewCompat.setTranslationY(f - f2);
        f2 = Math.max(0.0F, f - (float)0);
        mContentContainerCompat.setTranslationY(f2);
        f5 = getContentPosition();
        f6 = getScrollingFloatingHeaderHeight();
        if (mControlsAreFloating)
        {
            f3 = f2 + ((float)(-mHeaderHeight) + getNonScrollingFloatingHeaderHeight() + mFloatingFraction * f6 + (float)mHeaderBottomMargin);
        } else
        {
            f3 = f2 + (f5 - (float)mHeaderHeight);
        }
        mControlsContainerCompat.setTranslationY(f3);
        mHeaderShadowCompat.setTranslationY(f3);
        f = f2;
        if (mHeaderMode == 0 || mHeaderMode == 1)
        {
            if (mControlsAreFloating)
            {
                f = f2 - (1.0F - mFloatingFraction) * f6;
            } else
            {
                f = Math.min(f2, ((f5 - (float)mHeaderBottomMargin) + f2) - getVisibleTabBarHeight() - (float)mToolbarHeight);
            }
        }
        mToolbarContainerCompat.setTranslationY((float)mToolbarContainerA11yOffset + f);
        if (!USE_ANIMATIONS) goto _L2; else goto _L1
_L1:
        f5 = mHeroContainer.getMeasuredHeight();
        f6 = mHeaderHeight;
        f7 = mHeaderBottomMargin;
        mHeroAnimationMode;
        JVM INSTR tableswitch 0 2: default 220
    //                   0 350
    //                   1 350
    //                   2 421;
           goto _L3 _L4 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_421;
_L2:
        f = f2;
        if (mContentProtectionEnabled)
        {
            f3 = f;
            if (mTrackedListView != null)
            {
                i = tryGetContentTop(mTrackedListView);
                f3 = f;
                if (i != -1)
                {
                    f3 = f2 + (float)i;
                }
            }
            mAltPlayBackgroundCompat.setTranslationY(f3);
        }
        boolean flag1;
        if (mAbsoluteY == -1)
        {
            mBackgroundContainer.setVisibility(4);
        } else
        {
            boolean flag = false;
            if (mBackgroundContainer.getVisibility() == 4)
            {
                mBackgroundContainer.setVisibility(0);
                flag = true;
            }
            float f1 = Math.max((float)(-mBackgroundContainer.getMeasuredHeight()) / mBackgroundParallaxRatio, f2 + (float)(-mAbsoluteY) * mBackgroundParallaxRatio);
            mBackgroundContainerCompat.setTranslationY(f1);
            float f4 = mBackgroundContainer.getMeasuredHeight();
            if (flag && (f4 + f1) - f2 > mBackgroundFadeInOffsetThresholdPx)
            {
                mBackgroundContainerCompat.setAlpha(0.0F);
                mBackgroundContainerCompat.animateAlpha$2549578(1.0F);
            }
        }
        updateHeaderShadow();
        if (mLayoutListener != null)
        {
            mLayoutListener.onPlayHeaderListLayoutChanged();
        }
        return;
_L4:
        if (f3 + (f6 - f5 - f7) * 0.5F >= f + (float)mToolbarHeight)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (mHeroVisible != flag1)
        {
            mHeroVisible = flag1;
            if (mHeroVisible)
            {
                f = 1.0F;
            } else
            {
                f = 0.0F;
            }
            setHeroAnimationValue(f, true);
        }
          goto _L2
        f = Math.max(0.0F, (f5 + f3) / f5);
        if (f > 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mHeroVisible = flag1;
        setHeroAnimationValue(f, false);
          goto _L2
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowinsets)
    {
        mStatusBarHeight = Math.max(windowinsets.getSystemWindowInsetTop(), mStatusBarHeight);
        return super.onApplyWindowInsets(windowinsets);
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!mAttached)
        {
            mAttached = true;
            Integer integer = (Integer)sActionbarAttachedCount.get(mToolbar);
            int i;
            if (integer == null)
            {
                i = 1;
            } else
            {
                i = integer.intValue() + 1;
            }
            sActionbarAttachedCount.put(mToolbar, Integer.valueOf(i));
            setupViewPagerIfNeeded();
            updateHeaderShadow();
            if (mAutoHideToolbarTitle)
            {
                setActionBarTitleAlpha(0.0F);
            } else
            {
                setActionBarTitleAlpha(1.0F);
            }
            updateActiveListView();
        }
    }

    public void onDetachedFromWindow()
    {
        if (mAttached)
        {
            mAttached = false;
            Integer integer = (Integer)sActionbarAttachedCount.get(mToolbar);
            int i;
            if (integer == null)
            {
                i = 0;
            } else
            {
                i = integer.intValue() - 1;
            }
            integer = Integer.valueOf(i);
            if (integer.intValue() == 0)
            {
                sActionbarAttachedCount.remove(mToolbar);
            } else
            {
                sActionbarAttachedCount.put(mToolbar, integer);
            }
            setActiveListView(null);
            mHandler.removeCallbacksAndMessages(null);
            if (!mUseBuiltInToolbar && integer.intValue() == 0)
            {
                mToolbarContainerCompat.setTranslationY(0.0F);
            }
            mTemporaryBannerGoneRunnable = null;
        }
        super.onDetachedFromWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (mHasPullToRefresh)
        {
            motionevent = MotionEvent.obtain(motionevent);
            boolean flag = mSwipeRefreshLayout.onInterceptTouchEvent(motionevent);
            motionevent.recycle();
            if (flag)
            {
                motionevent = mSwipeRefreshLayoutCompat;
                float f;
                if (((AnimationCompat) (motionevent)).mView != null && android.os.Build.VERSION.SDK_INT >= 11)
                {
                    f = ((AnimationCompat) (motionevent)).mView.getAlpha();
                } else
                {
                    f = ((AnimationCompat) (motionevent)).mAlpha;
                }
                if (f < 1.0F)
                {
                    mSwipeRefreshLayoutCompat.setAlpha(1.0F);
                }
            }
            return flag;
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        setupViewPagerIfNeeded();
        updateActiveListView();
        if (mPendingSavedState != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (mPendingSavedState != null && mTrackedListView != null)
        {
            updateContentPosition(false);
            setFloatingFraction(mPendingSavedState.mFloatingFraction, false);
            layout();
            syncListViews(false);
            mPendingSavedState = null;
            mSuppressIdleOnScroll = false;
        }
        if (i == 0)
        {
            if (flag)
            {
                mPendingListSync = 2;
            }
            if (mUpdateContentPositionOnLayout)
            {
                updateContentPosition(true);
                mUpdateContentPositionOnLayout = false;
            }
        }
        mPendingListSync;
        JVM INSTR tableswitch 1 2: default 136
    //                   1 150
    //                   2 158;
           goto _L1 _L2 _L3
_L1:
        if (flag)
        {
            updateHeaderShadow();
        }
        return;
_L2:
        syncListViews(false);
        continue; /* Loop/switch isn't completed */
_L3:
        syncListViews(true);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void onRefresh()
    {
        if (mPullToRefreshProvider != null)
        {
            mPullToRefreshProvider.onPulledToRefresh();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            mPendingSavedState = parcelable;
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), this);
    }

    final void onScroll(int i, int j, int k)
    {
        boolean flag2;
        flag2 = false;
        if (mPullToRefreshProvider != null)
        {
            boolean flag;
            if (k == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            setPullToRefreshEnabled(flag);
        }
        if (!mSuppressIdleOnScroll || i != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        mAbsoluteY = k;
        i;
        JVM INSTR tableswitch 0 1: default 68
    //                   0 110
    //                   1 122;
           goto _L3 _L4 _L5
_L3:
        boolean flag1;
        if (!updateFloatingState() && mControlsAreFloating)
        {
            if (getScrollingFloatingHeaderHeight() == 0.0F)
            {
                mFloatingFraction = 1.0F;
            } else
            {
                mFloatingFraction = mFloatingFraction - (float)j / getScrollingFloatingHeaderHeight();
                mFloatingFraction = Math.min(1.0F, Math.max(0.0F, mFloatingFraction));
            }
        }
        layout();
        if (j == 0)
        {
            mPendingListSync = 1;
            return;
        }
          goto _L1
_L4:
        flag1 = true;
_L6:
        mLastScrollWasDown = flag1;
          goto _L3
_L5:
        if ((float)j <= 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = flag2;
        }
          goto _L6
    }

    final void onScrollStateChanged(int i)
    {
        mHandler.removeCallbacks(mSnapControlsUpIfNeededRunnable);
        mHandler.removeCallbacks(mSnapControlsDownIfNeededRunnable);
        if (i == 0)
        {
            Runnable runnable;
            if (getContentPosition() > (float)mHeaderBottomMargin)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (mLastScrollWasDown)
            {
                float f = mToolbarHeight;
                float f1 = getVisibleHeaderHeight();
                Handler handler;
                if (i != 0 || f1 >= f * 0.5F)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
            }
            handler = mHandler;
            if (i != 0)
            {
                runnable = mSnapControlsDownIfNeededRunnable;
            } else
            {
                runnable = mSnapControlsUpIfNeededRunnable;
            }
            handler.postDelayed(runnable, 50L);
            syncListViews(false);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (mHasPullToRefresh)
        {
            motionevent = MotionEvent.obtain(motionevent);
            boolean flag = mSwipeRefreshLayout.onTouchEvent(motionevent);
            motionevent.recycle();
            return flag;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    protected final void setActionBarTitleAlpha(float f)
    {
        if (mActionBarTitleAlpha != f)
        {
            mActionBarTitleAlpha = f;
            Toolbar toolbar = mToolbar;
            int i = Math.max(0, Math.min(255, Math.round(255F * f))) << 24 | 0xffffff;
            toolbar.mTitleTextColor = i;
            if (toolbar.mTitleTextView != null)
            {
                toolbar.mTitleTextView.setTextColor(i);
            }
            toolbar.mSubtitleTextColor = i;
            if (toolbar.mSubtitleTextView != null)
            {
                toolbar.mSubtitleTextView.setTextColor(i);
            }
        }
    }

    public final void setControlsBackground(Drawable drawable, boolean flag)
    {
        if (flag && USE_ANIMATIONS)
        {
            Drawable drawable2 = mControlsContainer.getBackground();
            Drawable drawable1 = drawable2;
            if (drawable2 == null)
            {
                drawable1 = makeNonFloatingBackground();
            }
            drawable2 = drawable;
            if (drawable == null)
            {
                drawable2 = makeNonFloatingBackground();
            }
            if (drawable1 == drawable2)
            {
                return;
            } else
            {
                drawable = new TransitionDrawable(new Drawable[] {
                    drawable1, drawable2
                }) {

                    final PlayHeaderListLayout this$0;

                    public final void getOutline(Outline outline)
                    {
                        outline.setRect(getBounds());
                        outline.setAlpha(1.0F);
                    }

            
            {
                this$0 = PlayHeaderListLayout.this;
                super(adrawable);
            }
                };
                drawable.setCrossFadeEnabled(true);
                drawable.startTransition(300);
                mControlsContainer.setBackgroundDrawable(drawable);
                return;
            }
        } else
        {
            mControlsContainer.setBackgroundDrawable(drawable);
            return;
        }
    }

    void setFloatingFraction(float f, boolean flag)
    {
        if (mControlsAreFloating && mFloatingFraction != f)
        {
            mFloatingFraction = f;
            if (flag)
            {
                layout();
                syncListViews(false);
            }
        }
    }

    public final void setPullToRefreshEnabled(boolean flag)
    {
        int i = 1;
        boolean flag1;
        if (mScrollProxyView.getScrollY() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            ScrollProxyView scrollproxyview = mScrollProxyView;
            if (flag)
            {
                i = 0;
            }
            scrollproxyview.scrollTo(0, i);
        }
    }

    public final void setSupportActionBar(Toolbar toolbar)
    {
        ((ActionBarActivity)getContext()).setSupportActionBar(toolbar);
    }

    public void snapControlsIfNeeded(boolean flag, boolean flag1, boolean flag2)
    {
        if (mHeaderMode != 3)
        {
            mHandler.removeCallbacks(mSnapControlsUpIfNeededRunnable);
            mHandler.removeCallbacks(mSnapControlsDownIfNeededRunnable);
            float f = getVisibleHeaderHeight();
            float f2 = getNonScrollingFloatingHeaderHeight();
            float f3 = getFullFloatingHeaderHeight();
            if ((flag1 || f > f2) && f < f3)
            {
                float f1;
                if (flag)
                {
                    f1 = 1.0F;
                } else
                {
                    f1 = 0.0F;
                }
                if (!mControlsAreFloating)
                {
                    setControlsFloating(true, flag2);
                }
                if (flag2)
                {
                    if (android.os.Build.VERSION.SDK_INT >= 11)
                    {
                        getFloatAnimator("floatingFraction", getFloatingFraction(), f1).setDuration(200L).start();
                        return;
                    } else
                    {
                        FloatingFractionAnimation floatingfractionanimation = new FloatingFractionAnimation(getFloatingFraction(), f1);
                        floatingfractionanimation.setDuration(200L);
                        startAnimation(floatingfractionanimation);
                        return;
                    }
                } else
                {
                    setFloatingFraction(f1, true);
                    return;
                }
            }
        }
    }

    public final int tryGetCollectionViewAbsoluteY(ViewGroup viewgroup)
    {
        byte byte0 = -1;
        if (!(viewgroup instanceof ListView)) goto _L2; else goto _L1
_L1:
        int i;
        viewgroup = (ListView)viewgroup;
        int j = viewgroup.getFirstVisiblePosition();
        int k = viewgroup.getChildCount();
        i = byte0;
        if (j == 0)
        {
            i = byte0;
            if (k > 0)
            {
                i = -viewgroup.getChildAt(0).getTop();
            }
        }
_L4:
        return i;
_L2:
        if (viewgroup instanceof RecyclerView)
        {
            break; /* Loop/switch isn't completed */
        }
        i = byte0;
        if (!(viewgroup instanceof PlayScrollableContentView)) goto _L4; else goto _L3
_L3:
        viewgroup = tryFindHeaderSpacerView(viewgroup);
        i = byte0;
        if (viewgroup != null)
        {
            return -viewgroup.getTop();
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void updateActiveListView()
    {
        setActiveListView(getListView(1));
    }

    public void updateTabContrast()
    {
        PlayHeaderListTabStrip playheaderlisttabstrip = mTabStrip;
        if (playheaderlisttabstrip.mUseHighContrast)
        {
            playheaderlisttabstrip.mUseHighContrast = false;
            int k = playheaderlisttabstrip.mTabContainer.getChildCount();
            int i = 0;
            while (i < k) 
            {
                TextView textview = (TextView)playheaderlisttabstrip.mTabContainer.getChildAt(i);
                playheaderlisttabstrip.applyTabContrastMode(textview, playheaderlisttabstrip.mUseHighContrast);
                int j;
                if (playheaderlisttabstrip.mUseHighContrast)
                {
                    j = playheaderlisttabstrip.mTabBackgroundResId;
                } else
                {
                    j = 0;
                }
                textview.setBackgroundResource(j);
                i++;
            }
        }
    }

    public void updateTabPadding(boolean flag)
    {
        if (mTabMode != 0) goto _L2; else goto _L1
_L1:
        mTabPaddingMode;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 47
    //                   2 52;
           goto _L3 _L4 _L5
_L3:
        boolean flag1 = mControlsAreFloating;
_L7:
        mTabStrip.setUseFloatingTabPadding(flag1, flag);
_L2:
        return;
_L4:
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L5:
        flag1 = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        USE_ANIMATIONS = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SUPPORT_ELEVATION = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        SUPPORT_DRAW_STATUS_BAR = flag;
    }









/*
    static int access$502(PlayHeaderListLayout playheaderlistlayout, int i)
    {
        playheaderlistlayout.mPullToRefreshAdapterPage = i;
        return i;
    }

*/




/*
    static Runnable access$902$6938b6e4(PlayHeaderListLayout playheaderlistlayout)
    {
        playheaderlistlayout.mTemporaryBannerGoneRunnable = null;
        return null;
    }

*/

    // Unreferenced inner class com/google/android/play/headerlist/PlayHeaderListLayout$5

/* anonymous class */
    public final class _cls5
        implements android.view.View.OnHoverListener
    {

        final PlayHeaderListLayout this$0;

        public final boolean onHover(View view, MotionEvent motionevent)
        {
            view = PlayHeaderListLayout.this;
            return ((PlayHeaderListLayout) (view)).mControlsAreFloating || ((PlayHeaderListLayout) (view)).mAlwaysUseFloatingBackground;
        }

            public 
            {
                this$0 = PlayHeaderListLayout.this;
                super();
            }
    }

}
