// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;

// Referenced classes of package com.google.android.gms.games.ui:
//            PlayHeaderListHelper

public static interface 
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
