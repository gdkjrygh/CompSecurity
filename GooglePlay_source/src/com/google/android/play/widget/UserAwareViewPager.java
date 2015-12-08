// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.widget;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;
import com.google.android.libraries.bind.bidi.BidiAwareViewPager;

public class UserAwareViewPager extends BidiAwareViewPager
{
    public static class UserAwareOnPageChangeListener extends android.support.v4.view.ViewPager.SimpleOnPageChangeListener
    {

        private final UserAwareViewPager viewPager;

        public final void onPageSelected(int i)
        {
            boolean flag;
            if (!viewPager.isSettingCurrentItem())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            onPageSelected(i, flag);
        }

        public void onPageSelected(int i, boolean flag)
        {
        }

        public UserAwareOnPageChangeListener(UserAwareViewPager userawareviewpager)
        {
            viewPager = userawareviewpager;
        }
    }


    protected boolean mFirstLayout;
    private boolean mIsSettingCurrentItem;

    public UserAwareViewPager(Context context)
    {
        super(context);
        mFirstLayout = true;
    }

    public UserAwareViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mFirstLayout = true;
    }

    public final boolean isSettingCurrentItem()
    {
        return mFirstLayout || mIsSettingCurrentItem;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mFirstLayout = false;
    }

    public final void setAdapter(PagerAdapter pageradapter)
    {
        mFirstLayout = true;
        super.setAdapter(pageradapter);
    }

    public final void setCurrentItem(int i)
    {
        mIsSettingCurrentItem = true;
        super.setCurrentItem(i);
        mIsSettingCurrentItem = false;
    }

    public final void setCurrentItem(int i, boolean flag)
    {
        mIsSettingCurrentItem = true;
        super.setCurrentItem(i, flag);
        mIsSettingCurrentItem = false;
    }
}
