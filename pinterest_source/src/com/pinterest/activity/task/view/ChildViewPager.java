// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;

import android.content.Context;
import android.support.v4.app.BetterFragmentStatePagerAdapter;
import android.support.v4.view.ModifiedViewPager;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;

public class ChildViewPager extends ModifiedViewPager
{

    private boolean _dragged;
    private android.support.v4.view.ModifiedViewPager.OnPageChangeListener _wrappedOnPageChanged;
    private android.support.v4.view.ModifiedViewPager.OnPageChangeListener onPageChanged;
    private android.support.v4.view.ModifiedViewPager.PageTransformer onPageTransform;

    public ChildViewPager(Context context)
    {
        super(context);
        onPageChanged = new _cls1();
        onPageTransform = new _cls2();
        init();
    }

    public ChildViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onPageChanged = new _cls1();
        onPageTransform = new _cls2();
        init();
    }

    private void init()
    {
        super.setOnPageChangeListener(onPageChanged);
        super.setPageTransformer(false, onPageTransform);
    }

    public BetterFragmentStatePagerAdapter getAdapter()
    {
        return (BetterFragmentStatePagerAdapter)super.getAdapter();
    }

    public volatile PagerAdapter getAdapter()
    {
        return getAdapter();
    }

    protected void onDetachedFromWindow()
    {
        _wrappedOnPageChanged = null;
        super.onDetachedFromWindow();
    }

    public void setOnPageChangeListener(android.support.v4.view.ModifiedViewPager.OnPageChangeListener onpagechangelistener)
    {
        _wrappedOnPageChanged = onpagechangelistener;
    }




/*
    static boolean access$102(ChildViewPager childviewpager, boolean flag)
    {
        childviewpager._dragged = flag;
        return flag;
    }

*/

    private class _cls1
        implements android.support.v4.view.ModifiedViewPager.OnPageChangeListener
    {

        final ChildViewPager this$0;

        public void onPageScrollStateChanged(int i)
        {
            i;
            JVM INSTR tableswitch 0 1: default 24
        //                       0 54
        //                       1 48;
               goto _L1 _L2 _L3
_L1:
            if (_wrappedOnPageChanged != null)
            {
                _wrappedOnPageChanged.onPageScrollStateChanged(i);
            }
            return;
_L3:
            Pinalytics.e();
            continue; /* Loop/switch isn't completed */
_L2:
            _dragged = false;
            if (true) goto _L1; else goto _L4
_L4:
        }

        public void onPageScrolled(int i, float f, int j)
        {
            if (_wrappedOnPageChanged != null)
            {
                _wrappedOnPageChanged.onPageScrolled(i, f, j);
            }
        }

        public void onPageSelected(int i)
        {
            if (_dragged)
            {
                Pinalytics.f();
            }
            Object obj = getAdapter().getFragments();
            for (int j = 0; j < ((List) (obj)).size(); j++)
            {
                Fragment fragment = (Fragment)((List) (obj)).get(j);
                if ((fragment instanceof BaseFragment) && i != j)
                {
                    ((BaseFragment)fragment).setActive(false);
                }
            }

            if (i < ((List) (obj)).size())
            {
                obj = (Fragment)((List) (obj)).get(i);
                if (obj instanceof BaseFragment)
                {
                    ((BaseFragment)obj).setActive(true);
                }
                if (_wrappedOnPageChanged != null)
                {
                    _wrappedOnPageChanged.onPageSelected(i);
                    return;
                }
            }
        }

        _cls1()
        {
            this$0 = ChildViewPager.this;
            super();
        }
    }


    private class _cls2
        implements android.support.v4.view.ModifiedViewPager.PageTransformer
    {

        final ChildViewPager this$0;

        public void transformPage(View view, float f, boolean flag, int i)
        {
            _dragged = flag;
        }

        _cls2()
        {
            this$0 = ChildViewPager.this;
            super();
        }
    }

}
