// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.view;

import android.content.Context;
import android.graphics.Point;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;

public class PeekViewPager extends FrameLayout
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    private static final int PAGER_MARGIN_MULTIPLIER = 8;
    private static final int PAGER_OFFSCREEN_LIMIT = 3;
    private static final int PAGE_MARGIN_MULTIPLIER = 2;
    private Point _center;
    private int _defaultMargin;
    private Point _initialTouch;
    private int _lastWidth;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener _layoutListener;
    private boolean _needsRedraw;
    ViewPager _pager;
    private int _pagerMarginPx;

    public PeekViewPager(Context context)
    {
        super(context);
        _center = new Point();
        _initialTouch = new Point();
        init(context);
    }

    public PeekViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _center = new Point();
        _initialTouch = new Point();
        init(context);
    }

    public PeekViewPager(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _center = new Point();
        _initialTouch = new Point();
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f030183, this);
        ButterKnife.a(this);
        setClipChildren(false);
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            setLayerType(1, null);
        }
        _defaultMargin = (int)Resources.dimension(0x7f0a0163);
        _pager.setOnPageChangeListener(this);
        _pager.setClipChildren(false);
        _pager.setPageMargin(_defaultMargin * 2);
        _pager.setOffscreenPageLimit(3);
        _pagerMarginPx = _defaultMargin * 8;
        updatePagerWidth((int)Device.getScreenWidth());
        _layoutListener = new _cls1();
    }

    private void updatePagerWidth(int i)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)_pager.getLayoutParams();
        layoutparams.width = i - _pagerMarginPx;
        _pager.setLayoutParams(layoutparams);
    }

    public ViewPager getViewPager()
    {
        return _pager;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(_layoutListener);
    }

    protected void onDetachedFromWindow()
    {
        getViewTreeObserver().removeGlobalOnLayoutListener(_layoutListener);
        super.onDetachedFromWindow();
    }

    public void onPageScrollStateChanged(int i)
    {
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _needsRedraw = flag;
    }

    public void onPageScrolled(int i, float f, int j)
    {
        if (_needsRedraw)
        {
            invalidate();
        }
    }

    public void onPageSelected(int i)
    {
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        _center.x = i / 2;
        _center.y = j / 2;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 0: default 24
    //                   0 69;
           goto _L1 _L2
_L1:
        motionevent.offsetLocation(_center.x - _initialTouch.x, _center.y - _initialTouch.y);
        return _pager.dispatchTouchEvent(motionevent);
_L2:
        _initialTouch.x = (int)motionevent.getX();
        _initialTouch.y = (int)motionevent.getY();
        if (true) goto _L1; else goto _L3
_L3:
    }



/*
    static int access$002(PeekViewPager peekviewpager, int i)
    {
        peekviewpager._lastWidth = i;
        return i;
    }

*/


    private class _cls1
        implements android.view.ViewTreeObserver.OnGlobalLayoutListener
    {

        final PeekViewPager this$0;

        public void onGlobalLayout()
        {
            if (_lastWidth == getWidth())
            {
                return;
            }
            if (_lastWidth == 0)
            {
                _lastWidth = getWidth();
                return;
            } else
            {
                updatePagerWidth(getWidth());
                _lastWidth = getWidth();
                return;
            }
        }

        _cls1()
        {
            this$0 = PeekViewPager.this;
            super();
        }
    }

}
