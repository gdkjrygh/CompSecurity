// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.headerlist;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.play.headerlist:
//            PlayHeaderListLayout, PlayHeaderListTabStrip

public static abstract class mContext
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
        return !PlayHeaderListLayout.access$600();
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

    public (Context context)
    {
        mContext = context;
    }
}
