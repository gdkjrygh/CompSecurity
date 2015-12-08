// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;

// Referenced classes of package com.google.android.gms.games.ui:
//            PlayHeaderListHelper

private static final class mPlayHeaderListWrappable extends com.google.android.play.headerlist.ayHeaderListWrappable
{

    ager mPlayHeaderListWrappable;

    protected final void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        mPlayHeaderListWrappable.roundView(layoutinflater, viewgroup);
    }

    protected final void addContentView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        mPlayHeaderListWrappable.ntView(layoutinflater, viewgroup);
    }

    protected final void addHeroView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        mPlayHeaderListWrappable.iew(layoutinflater, viewgroup);
    }

    protected final boolean alwaysUseFloatingBackground()
    {
        return mPlayHeaderListWrappable.eFloatingBackground();
    }

    protected final float getBackgroundViewParallaxRatio()
    {
        return mPlayHeaderListWrappable.roundViewParallaxRatio();
    }

    protected final PlayHeaderListTabStrip getCustomTabStrip$78490773(Context context)
    {
        return mPlayHeaderListWrappable._mth78490773(context);
    }

    protected final int getHeaderHeight()
    {
        return mPlayHeaderListWrappable.rHeight(mPlayHeaderListWrappable.eaderActivity());
    }

    protected final int getHeaderMode()
    {
        return mPlayHeaderListWrappable.rMode();
    }

    protected final int getHeaderShadowMode()
    {
        return mPlayHeaderListWrappable.rShadowMode();
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
        return mPlayHeaderListWrappable.eaderTabMode();
    }

    protected final int getTabPaddingMode()
    {
        return mPlayHeaderListWrappable.ddingMode();
    }

    protected final Toolbar getToolbar(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        return (Toolbar)layoutinflater.inflate(0x7f040083, viewgroup, false);
    }

    protected final int getToolbarTitleMode()
    {
        return mPlayHeaderListWrappable.arTitleMode();
    }

    protected final int getViewPagerId()
    {
        return 0x7f0d01b7;
    }

    protected final boolean hasViewPager()
    {
        return mPlayHeaderListWrappable.ager();
    }

    protected final boolean useBuiltInActionBar()
    {
        return true;
    }

    public ( )
    {
        super(.eaderActivity());
        mPlayHeaderListWrappable = ;
    }
}
