// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.play.animation.AnimationCompat;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.PlayHeaderListTabContainer;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import com.google.android.play.widget.ScrollProxyView;

public final class PlayHeaderListHelper
{
    private static final class GamesPlayHeaderListConfigurator extends com.google.android.play.headerlist.PlayHeaderListLayout.Configurator
    {

        PlayHeaderListWrappable mPlayHeaderListWrappable;

        protected final void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup)
        {
            mPlayHeaderListWrappable.addBackgroundView(layoutinflater, viewgroup);
        }

        protected final void addContentView(LayoutInflater layoutinflater, ViewGroup viewgroup)
        {
            mPlayHeaderListWrappable.addContentView(layoutinflater, viewgroup);
        }

        protected final void addHeroView(LayoutInflater layoutinflater, ViewGroup viewgroup)
        {
            mPlayHeaderListWrappable.addHeroView(layoutinflater, viewgroup);
        }

        protected final boolean alwaysUseFloatingBackground()
        {
            return mPlayHeaderListWrappable.alwaysUseFloatingBackground();
        }

        protected final float getBackgroundViewParallaxRatio()
        {
            return mPlayHeaderListWrappable.getBackgroundViewParallaxRatio();
        }

        protected final PlayHeaderListTabStrip getCustomTabStrip$78490773(Context context)
        {
            return mPlayHeaderListWrappable._mth78490773(context);
        }

        protected final int getHeaderHeight()
        {
            return mPlayHeaderListWrappable.getHeaderHeight(mPlayHeaderListWrappable.getPlayHeaderActivity());
        }

        protected final int getHeaderMode()
        {
            return mPlayHeaderListWrappable.getHeaderMode();
        }

        protected final int getHeaderShadowMode()
        {
            return mPlayHeaderListWrappable.getHeaderShadowMode();
        }

        protected final int getHeroAnimationMode()
        {
            return 3;
        }

        protected final int getListViewId()
        {
            return 0x102000a;
        }

        protected final int getTabMode()
        {
            return mPlayHeaderListWrappable.getPlayHeaderTabMode();
        }

        protected final int getTabPaddingMode()
        {
            return mPlayHeaderListWrappable.getTabPaddingMode();
        }

        protected final Toolbar getToolbar(LayoutInflater layoutinflater, ViewGroup viewgroup)
        {
            return (Toolbar)layoutinflater.inflate(0x7f040083, viewgroup, false);
        }

        protected final int getToolbarTitleMode()
        {
            return mPlayHeaderListWrappable.getToolbarTitleMode();
        }

        protected final int getViewPagerId()
        {
            return 0x7f0d01b7;
        }

        protected final boolean hasViewPager()
        {
            return mPlayHeaderListWrappable.hasViewPager();
        }

        protected final boolean useBuiltInActionBar()
        {
            return true;
        }

        public GamesPlayHeaderListConfigurator(PlayHeaderListWrappable playheaderlistwrappable)
        {
            super(playheaderlistwrappable.getPlayHeaderActivity());
            mPlayHeaderListWrappable = playheaderlistwrappable;
        }
    }

    private static final class GamesPlayHeaderPullToRefreshProvider extends com.google.android.play.headerlist.PlayHeaderListLayout.PullToRefreshProvider
    {

        PlayHeaderListWrappable mPlayHeaderListWrappable;

        public final boolean isPageRefreshing$134632()
        {
            return mPlayHeaderListWrappable._mth134632();
        }

        public final void onPulledToRefresh()
        {
            mPlayHeaderListWrappable.onPulledToRefresh();
        }

        public final boolean supportsPullToRefresh$134632()
        {
            return mPlayHeaderListWrappable._mth134632();
        }

        public GamesPlayHeaderPullToRefreshProvider(PlayHeaderListWrappable playheaderlistwrappable)
        {
            mPlayHeaderListWrappable = playheaderlistwrappable;
        }
    }

    public static interface PlayHeaderListWrappable
    {

        public abstract void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup);

        public abstract View addContentView(LayoutInflater layoutinflater, ViewGroup viewgroup);

        public abstract void addHeroView(LayoutInflater layoutinflater, ViewGroup viewgroup);

        public abstract boolean alwaysUseFloatingBackground();

        public abstract float getBackgroundViewParallaxRatio();

        public abstract PlayHeaderListTabStrip getCustomTabStrip$78490773(Context context);

        public abstract Drawable getFloatingControlsBackground();

        public abstract int getHeaderHeight(Context context);

        public abstract int getHeaderMode();

        public abstract int getHeaderShadowMode();

        public abstract Activity getPlayHeaderActivity();

        public abstract int getPlayHeaderTabMode();

        public abstract int getTabPaddingMode();

        public abstract int getToolbarTitleMode();

        public abstract float getVisibleHeaderHeight();

        public abstract boolean hasPlayHeader();

        public abstract boolean hasViewPager();

        public abstract boolean isPageRefreshing$134632();

        public abstract void onPlayHeaderListLayoutCreated(PlayHeaderListLayout playheaderlistlayout);

        public abstract void onPulledToRefresh();

        public abstract void showActionBar$1385ff();

        public abstract boolean supportsPullToRefresh$134632();
    }


    private PlayHeaderListWrappable mPlayHeaderListWrappable;

    PlayHeaderListHelper(PlayHeaderListWrappable playheaderlistwrappable)
    {
        mPlayHeaderListWrappable = playheaderlistwrappable;
    }

    final void configurePlayHeaderListLayout(PlayHeaderListLayout playheaderlistlayout)
    {
        boolean flag2;
        int i = 0x7f0d0053;
        flag2 = true;
        Object obj = new GamesPlayHeaderListConfigurator(mPlayHeaderListWrappable);
        playheaderlistlayout.mBackgroundParallaxRatio = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getBackgroundViewParallaxRatio();
        playheaderlistlayout.mListViewId = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getListViewId();
        playheaderlistlayout.mViewPagerId = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getViewPagerId();
        playheaderlistlayout.mSpacerId = 0x7f0d0053;
        LayoutInflater layoutinflater;
        Object obj2;
        boolean flag;
        if (playheaderlistlayout.mSpacerId != 0)
        {
            i = playheaderlistlayout.mSpacerId;
        }
        playheaderlistlayout.mSpacerId = i;
        playheaderlistlayout.mUseBuiltInToolbar = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).useBuiltInActionBar();
        playheaderlistlayout.mHasViewPager = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).hasViewPager();
        playheaderlistlayout.mTabMode = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getTabMode();
        playheaderlistlayout.mContentProtectionEnabled = false;
        playheaderlistlayout.mHeroAnimationMode = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getHeroAnimationMode();
        if (((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getToolbarTitleMode() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        playheaderlistlayout.mAutoHideToolbarTitle = flag;
        playheaderlistlayout.mHeaderMode = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getHeaderMode();
        playheaderlistlayout.mHeaderShadowMode = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getHeaderShadowMode();
        playheaderlistlayout.mAlwaysUseFloatingBackground = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).alwaysUseFloatingBackground();
        playheaderlistlayout.mAllowImmersiveBackground = false;
        if (PlayHeaderListLayout.USE_ANIMATIONS)
        {
            i = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getTabPaddingMode();
        } else
        {
            i = 1;
        }
        playheaderlistlayout.mTabPaddingMode = i;
        playheaderlistlayout.mTabA11yMode = 0;
        playheaderlistlayout.mTabBgMode = 0;
        layoutinflater = LayoutInflater.from(playheaderlistlayout.getContext());
        obj2 = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getCustomTabStrip$78490773(playheaderlistlayout.getContext());
        if (PlayHeaderListLayout.USE_ANIMATIONS)
        {
            i = 0x7f04011a;
        } else
        {
            i = 0x7f04011b;
        }
        layoutinflater.inflate(i, playheaderlistlayout);
        playheaderlistlayout.mBackgroundContainer = (FrameLayout)playheaderlistlayout.findViewById(0x7f0d0317);
        playheaderlistlayout.mBackgroundContainerCompat = new AnimationCompat(playheaderlistlayout.mBackgroundContainer);
        playheaderlistlayout.mAltPlayBackground = playheaderlistlayout.findViewById(0x7f0d0318);
        playheaderlistlayout.mAltPlayBackgroundCompat = new AnimationCompat(playheaderlistlayout.mAltPlayBackground);
        playheaderlistlayout.mContentContainer = playheaderlistlayout.findViewById(0x7f0d01fe);
        playheaderlistlayout.mContentContainerCompat = new AnimationCompat(playheaderlistlayout.mContentContainer);
        playheaderlistlayout.mControlsContainer = (ViewGroup)playheaderlistlayout.findViewById(0x7f0d0319);
        playheaderlistlayout.mControlsContainerCompat = new AnimationCompat(playheaderlistlayout.mControlsContainer);
        playheaderlistlayout.mHeaderShadow = playheaderlistlayout.findViewById(0x7f0d031f);
        playheaderlistlayout.mHeaderShadowCompat = new AnimationCompat(playheaderlistlayout.mHeaderShadow);
        playheaderlistlayout.mHeroContainer = (FrameLayout)playheaderlistlayout.findViewById(0x7f0d031a);
        playheaderlistlayout.mHeroContainerCompat = new AnimationCompat(playheaderlistlayout.mHeroContainer);
        playheaderlistlayout.mTabBar = playheaderlistlayout.findViewById(0x7f0d031b);
        playheaderlistlayout.mTabStrip = (PlayHeaderListTabStrip)playheaderlistlayout.findViewById(0x7f0d01f1);
        if (obj2 != null)
        {
            PlayHeaderListTabStrip playheaderlisttabstrip = playheaderlistlayout.mTabStrip;
            Object obj3 = playheaderlisttabstrip.getLayoutParams();
            ViewGroup viewgroup = (ViewGroup)playheaderlisttabstrip.getParent();
            i = viewgroup.indexOfChild(playheaderlisttabstrip);
            viewgroup.removeViewAt(i);
            viewgroup.addView(((View) (obj2)), i, ((android.view.ViewGroup.LayoutParams) (obj3)));
            obj3 = playheaderlisttabstrip.getChildAt(0);
            playheaderlisttabstrip.removeViewAt(0);
            ((PlayHeaderListTabStrip) (obj2)).addView(((View) (obj3)));
            ((PlayHeaderListTabStrip) (obj2)).getSubViewReferences();
            playheaderlistlayout.mTabStrip = ((PlayHeaderListTabStrip) (obj2));
        }
        playheaderlistlayout.mTabStrip.mExternalPageChangeListener = playheaderlistlayout.mOnPageChangeListener;
        obj2 = playheaderlistlayout.mTabStrip;
        if (((PlayHeaderListTabStrip) (obj2)).mTabBackgroundResId != 0x7f020205)
        {
            obj2.mTabBackgroundResId = 0x7f020205;
            int i1 = ((PlayHeaderListTabStrip) (obj2)).mTabContainer.getChildCount();
            for (i = 0; i < i1; i++)
            {
                ((PlayHeaderListTabStrip) (obj2)).mTabContainer.getChildAt(i).setBackgroundResource(0x7f020205);
            }

        }
        playheaderlistlayout.mTabBarTitleView = (TextView)playheaderlistlayout.findViewById(0x7f0d031e);
        playheaderlistlayout.mHeaderHeight = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getHeaderHeight();
        playheaderlistlayout.mHeaderBottomMargin = 0;
        i = playheaderlistlayout.mHeaderHeight;
        int j1 = playheaderlistlayout.mHeaderBottomMargin;
        obj2 = (android.widget.FrameLayout.LayoutParams)playheaderlistlayout.mControlsContainer.getLayoutParams();
        obj2.height = i - j1;
        playheaderlistlayout.mControlsContainer.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        if (!PlayHeaderListLayout.SUPPORT_ELEVATION)
        {
            int j = playheaderlistlayout.mHeaderHeight;
            int k1 = playheaderlistlayout.mHeaderBottomMargin;
            obj2 = (android.widget.FrameLayout.LayoutParams)playheaderlistlayout.mHeaderShadow.getLayoutParams();
            ((android.widget.FrameLayout.LayoutParams) (obj2)).setMargins(0, j - k1 - 1, 0, 0);
            playheaderlistlayout.mHeaderShadow.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        }
        if (playheaderlistlayout.mUseBuiltInToolbar)
        {
            playheaderlistlayout.mToolbar = ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).getToolbar(layoutinflater, playheaderlistlayout.getToolbarContainer());
            playheaderlistlayout.getToolbarContainer().addView(playheaderlistlayout.mToolbar);
            playheaderlistlayout.setSupportActionBar(playheaderlistlayout.mToolbar);
        } else
        {
            playheaderlistlayout.mToolbar = (Toolbar)((Activity)playheaderlistlayout.getContext()).getWindow().findViewById(0x7f0d00cb);
        }
        playheaderlistlayout.mToolbarHeight = PlayHeaderListLayout.getDefaultToolbarHeight(playheaderlistlayout.getContext());
        playheaderlistlayout.mToolbarContainer = playheaderlistlayout.getToolbarContainer();
        playheaderlistlayout.mToolbarContainerCompat = new AnimationCompat(playheaderlistlayout.mToolbarContainer);
        playheaderlistlayout.mBannerTextView = (TextView)playheaderlistlayout.findViewById(0x7f0d0322);
        playheaderlistlayout.mBannerTextViewCompat = new AnimationCompat(playheaderlistlayout.mBannerTextView);
        playheaderlistlayout.mSwipeRefreshLayout = (SwipeRefreshLayout)playheaderlistlayout.findViewById(0x7f0d0324);
        playheaderlistlayout.mSwipeRefreshLayoutCompat = new AnimationCompat(playheaderlistlayout.mSwipeRefreshLayout);
        playheaderlistlayout.mSwipeRefreshLayout.mListener = playheaderlistlayout;
        playheaderlistlayout.mScrollProxyView = (ScrollProxyView)playheaderlistlayout.findViewById(0x7f0d0325);
        playheaderlistlayout.setPullToRefreshEnabled(false);
        if (PlayHeaderListLayout.USE_ANIMATIONS)
        {
            ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).addHeroView(layoutinflater, playheaderlistlayout.mHeroContainer);
            ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).addBackgroundView(layoutinflater, playheaderlistlayout.mBackgroundContainer);
        } else
        if (!playheaderlistlayout.mAlwaysUseFloatingBackground)
        {
            ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).addBackgroundView(layoutinflater, playheaderlistlayout.mBackgroundContainer);
        }
        obj2 = (ViewGroup)playheaderlistlayout.mContentContainer;
        ((com.google.android.play.headerlist.PlayHeaderListLayout.Configurator) (obj)).addContentView(layoutinflater, ((ViewGroup) (obj2)));
        if (((ViewGroup) (obj2)).getChildCount() == 1)
        {
            obj = ((ViewGroup) (obj2)).getChildAt(0);
            int k = playheaderlistlayout.indexOfChild(playheaderlistlayout.mContentContainer);
            playheaderlistlayout.removeViewAt(k);
            ((ViewGroup) (obj2)).removeViewAt(0);
            playheaderlistlayout.addView(((View) (obj)), k);
            playheaderlistlayout.mContentContainer = ((View) (obj));
            playheaderlistlayout.mContentContainerCompat = new AnimationCompat(playheaderlistlayout.mContentContainer);
        }
        if (PlayHeaderListLayout.USE_ANIMATIONS && playheaderlistlayout.mUseBuiltInToolbar)
        {
            playheaderlistlayout.mToolbarContainerA11yOffset = (int)playheaderlistlayout.getResources().getDisplayMetrics().density * 2;
            playheaderlistlayout.mToolbarContainerCompat.setTranslationY(playheaderlistlayout.mToolbarContainerA11yOffset);
        }
        playheaderlistlayout.mTabMode;
        JVM INSTR tableswitch 0 2: default 1052
    //                   0 1126
    //                   1 1324
    //                   2 1351;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalStateException((new StringBuilder("Unexpected tab mode: ")).append(playheaderlistlayout.mTabMode).toString());
_L2:
        playheaderlistlayout.mTabBar.setVisibility(0);
        playheaderlistlayout.mTabBarTitleView.setVisibility(4);
        playheaderlistlayout.mTabStrip.setVisibility(0);
_L6:
        Object obj1;
        if (playheaderlistlayout.mContentProtectionEnabled)
        {
            playheaderlistlayout.mAltPlayBackground.setBackgroundDrawable(new ColorDrawable(playheaderlistlayout.getContext().getResources().getColor(0x7f0b0263)));
            playheaderlistlayout.mAltPlayBackground.setVisibility(0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            playheaderlistlayout.mControlsContainer.setOnHoverListener(new com.google.android.play.headerlist.PlayHeaderListLayout._cls5(playheaderlistlayout));
        }
        if (playheaderlistlayout.mAlwaysUseFloatingBackground)
        {
            playheaderlistlayout.setControlsBackground(playheaderlistlayout.mFloatingControlsBackground, false);
        }
        playheaderlistlayout.mBannerTextViewCompat.setTranslationY(-playheaderlistlayout.getBannerHeight());
        if (PlayHeaderListLayout.USE_ANIMATIONS)
        {
            PlayHeaderListLayout.setChildTopMargin(playheaderlistlayout.mToolbarContainer, -playheaderlistlayout.mToolbarContainerA11yOffset);
        }
        float f = playheaderlistlayout.mBannerFraction;
        if (f != playheaderlistlayout.mBannerFraction)
        {
            playheaderlistlayout.mBannerFraction = f;
            playheaderlistlayout.layout();
        }
        playheaderlistlayout.updateTabPadding(false);
        playheaderlistlayout.updateTabContrast();
        obj1 = new GamesPlayHeaderPullToRefreshProvider(mPlayHeaderListWrappable);
        if (playheaderlistlayout.mSwipeRefreshLayout == null)
        {
            throw new IllegalStateException("Cannot initialize pull to refresh before HeaderListLayout has been configured");
        }
        break; /* Loop/switch isn't completed */
_L3:
        playheaderlistlayout.mTabBar.setVisibility(0);
        playheaderlistlayout.mTabBarTitleView.setVisibility(0);
        playheaderlistlayout.mTabStrip.setVisibility(4);
        continue; /* Loop/switch isn't completed */
_L4:
        playheaderlistlayout.mTabBar.setVisibility(4);
        playheaderlistlayout.mTabBarTitleView.setVisibility(0);
        playheaderlistlayout.mTabStrip.setVisibility(0);
        if (true) goto _L6; else goto _L5
_L5:
        playheaderlistlayout.mSwipeRefreshLayout.setRefreshing(false);
        playheaderlistlayout.mSwipeRefreshLayoutCompat.setAlpha(1.0F);
        playheaderlistlayout.mSwipeRefreshLayoutCompat.setTranslationY(0.0F);
        playheaderlistlayout.mPullToRefreshProvider = ((com.google.android.play.headerlist.PlayHeaderListLayout.PullToRefreshProvider) (obj1));
        playheaderlistlayout.updateActiveListView();
        obj1 = playheaderlistlayout.findViewById(0x7f0d0323);
        int l;
        if (playheaderlistlayout.mPullToRefreshProvider != null)
        {
            l = 0;
        } else
        {
            l = 8;
        }
        ((View) (obj1)).setVisibility(l);
        if (playheaderlistlayout.mPullToRefreshProvider != null)
        {
            ((View) (obj1)).setPadding(0, 0, 0, 0);
            boolean flag1;
            if (playheaderlistlayout.mAbsoluteY == 0)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            playheaderlistlayout.setPullToRefreshEnabled(flag1);
        } else
        {
            playheaderlistlayout.setPullToRefreshEnabled(false);
        }
        playheaderlistlayout.mFloatingControlsBackground = mPlayHeaderListWrappable.getFloatingControlsBackground();
        if (playheaderlistlayout.mControlsContainer != null && playheaderlistlayout.mControlsAreFloating || playheaderlistlayout.mAlwaysUseFloatingBackground)
        {
            playheaderlistlayout.setControlsBackground(playheaderlistlayout.mFloatingControlsBackground, false);
        }
        return;
    }

    final PlayHeaderListLayout inflatePlayHeaderListLayout(LayoutInflater layoutinflater)
    {
        layoutinflater = (PlayHeaderListLayout)layoutinflater.inflate(0x7f040084, null, false);
        mPlayHeaderListWrappable.onPlayHeaderListLayoutCreated(layoutinflater);
        return layoutinflater;
    }
}
