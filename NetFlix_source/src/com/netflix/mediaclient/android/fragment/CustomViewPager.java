// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ListView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.LoMoUtils;
import com.viewpagerindicator.android.osp.ViewPager;

public class CustomViewPager extends ViewPager
{

    private static final boolean ALLOW_OVERLAPPED_PAGES = true;
    private static final String TAG = "CustomViewPager";
    private final com.viewpagerindicator.android.osp.ViewPager.OnPageChangeListener onPageChangeListener;
    private int pageMarginOffsetPx;
    private final boolean shouldOverlapPagesByDefault;

    public CustomViewPager(Context context)
    {
        super(context);
        shouldOverlapPagesByDefault = true;
        onPageChangeListener = new com.viewpagerindicator.android.osp.ViewPager.OnPageChangeListener() {

            final CustomViewPager this$0;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                Log.v("CustomViewPager", (new StringBuilder()).append("onPageSelected, position: ").append(i).toString());
                CustomViewPager.this.onPageSelected(i);
            }

            
            {
                this$0 = CustomViewPager.this;
                super();
            }
        };
        init();
    }

    public CustomViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        shouldOverlapPagesByDefault = true;
        onPageChangeListener = new _cls1();
        init();
    }

    public static void applyContentOverlapPadding(NetflixActivity netflixactivity, View view)
    {
        view.setPadding(LoMoUtils.getLomoFragOffsetLeftPx(netflixactivity), 0, LoMoUtils.getLomoFragOffsetRightPx(netflixactivity), 0);
    }

    private ViewParent getListViewParent()
    {
        ViewParent viewparent;
        for (viewparent = getParent(); viewparent != null && !(viewparent instanceof ListView); viewparent = viewparent.getParent()) { }
        return viewparent;
    }

    private void init()
    {
        Log.v("CustomViewPager", "Created view pager");
        int i = LoMoUtils.getLomoFragOffsetLeftPx((NetflixActivity)getContext());
        pageMarginOffsetPx = (LoMoUtils.getLomoFragOffsetRightPx((NetflixActivity)getContext()) + i) * -1;
        setPagesToOverlap(true);
    }

    public com.viewpagerindicator.android.osp.ViewPager.OnPageChangeListener getOnPageChangeListener()
    {
        return onPageChangeListener;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.onInterceptTouchEvent(motionevent);
        if (flag)
        {
            motionevent = getListViewParent();
            if (motionevent != null)
            {
                motionevent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return flag;
    }

    protected void onPageSelected(int i)
    {
    }

    protected void setPagesToOverlap(boolean flag)
    {
        int i;
        if (flag)
        {
            i = pageMarginOffsetPx;
        } else
        {
            i = 0;
        }
        setPageMargin(i);
    }
}
