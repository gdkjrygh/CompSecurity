// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragment;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.widget.finsky.PlayTabContainer;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            GamesFragmentPagerAdapter, TabSpec

public static class mTabContainer
    implements android.support.v4.view.angeListener
{

    private final GamesFragmentPagerAdapter mPagerAdapter;
    private final PlayTabContainer mTabContainer;
    private final ViewPager mViewPager;

    public final void logClick(int i)
    {
        Object obj = mPagerAdapter.getTabSpecAt(i);
        if (obj != null && ((TabSpec) (obj)).args != null && ((TabSpec) (obj)).args.containsKey("FRAGMENT_TAGS"))
        {
            int j = ((TabSpec) (obj)).args.getInt("FRAGMENT_TAGS");
            obj = mPagerAdapter.getFragmentAt(i);
            if (obj != null)
            {
                Asserts.checkState(obj instanceof GamesFragment);
                GamesFragmentActivity gamesfragmentactivity = (GamesFragmentActivity)((Fragment) (obj)).mActivity;
                gamesfragmentactivity.startNewImpression(((Fragment) (obj)).mView);
                gamesfragmentactivity.logClickEvent(j, ((Fragment) (obj)).mView);
            }
        }
    }

    public final void onPageScrollStateChanged(int i)
    {
        mTabContainer.mScrollState = i;
        i;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 65
    //                   1 64
    //                   2 64;
           goto _L1 _L2 _L3 _L3
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        GamesLog.wtf(mPagerAdapter.mContext, "GFragmentPageChangeListener", (new StringBuilder("onPageScrollStateChanged(): unexpected state:")).append(i).toString());
_L5:
        return;
_L2:
        i = mViewPager.mCurItem;
        Fragment fragment = mPagerAdapter.getFragmentAt(i);
        if (fragment instanceof mPagerAdapter)
        {
            ((mPagerAdapter)fragment).crolledTo();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void onPageScrolled(int i, float f, int j)
    {
        mTabContainer.onPageScrolled(i, f, j);
        for (Iterator iterator = mPagerAdapter.getFragments().iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public void onPageSelected(int i)
    {
        Fragment fragment = mPagerAdapter.getFragmentAt(i);
        if (fragment instanceof mPagerAdapter)
        {
            ((mPagerAdapter)fragment).elected();
        }
        logClick(i);
        mTabContainer.onPageSelected(i);
        if (PlatformVersion.checkVersion(16))
        {
            mViewPager.getRootView().announceForAccessibility(mPagerAdapter.mContext.getString(0x7f100089, new Object[] {
                mPagerAdapter.getPageTitle(i)
            }));
        }
    }

    public (ViewPager viewpager, GamesFragmentPagerAdapter gamesfragmentpageradapter, PlayTabContainer playtabcontainer)
    {
        mViewPager = viewpager;
        mPagerAdapter = gamesfragmentpageradapter;
        mTabContainer = playtabcontainer;
    }
}
