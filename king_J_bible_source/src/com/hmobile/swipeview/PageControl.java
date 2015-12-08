// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.swipeview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class PageControl extends LinearLayout
{
    public static interface OnPageControlClickListener
    {

        public abstract void goBackwards();

        public abstract void goForwards();
    }


    private Drawable activeDrawable;
    private Drawable inactiveDrawable;
    private ArrayList indicators;
    private Context mContext;
    private int mCurrentPage;
    private int mIndicatorSize;
    private OnPageControlClickListener mOnPageControlClickListener;
    private int mPageCount;

    public PageControl(Context context)
    {
        super(context);
        mIndicatorSize = 7;
        mPageCount = 0;
        mCurrentPage = 0;
        mOnPageControlClickListener = null;
        mContext = context;
        initPageControl();
    }

    public PageControl(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mIndicatorSize = 7;
        mPageCount = 0;
        mCurrentPage = 0;
        mOnPageControlClickListener = null;
        mContext = context;
    }

    private void initPageControl()
    {
        Log.i("uk.co.jasonfry.android.tools.ui.PageControl", "Initialising PageControl");
        indicators = new ArrayList();
        activeDrawable = new ShapeDrawable();
        inactiveDrawable = new ShapeDrawable();
        activeDrawable.setBounds(0, 0, mIndicatorSize, mIndicatorSize);
        inactiveDrawable.setBounds(0, 0, mIndicatorSize, mIndicatorSize);
        OvalShape ovalshape = new OvalShape();
        ovalshape.resize(mIndicatorSize, mIndicatorSize);
        OvalShape ovalshape1 = new OvalShape();
        ovalshape1.resize(mIndicatorSize, mIndicatorSize);
        TypedArray typedarray = mContext.getTheme().obtainStyledAttributes(new int[] {
            0x1010038, 0x101003a
        });
        ((ShapeDrawable)activeDrawable).getPaint().setColor(typedarray.getColor(0, 0xff444444));
        ((ShapeDrawable)inactiveDrawable).getPaint().setColor(typedarray.getColor(1, 0xffcccccc));
        ((ShapeDrawable)activeDrawable).setShape(ovalshape);
        ((ShapeDrawable)inactiveDrawable).setShape(ovalshape1);
        mIndicatorSize = (int)((float)mIndicatorSize * getResources().getDisplayMetrics().density);
        setOnTouchListener(new android.view.View.OnTouchListener() {

            final PageControl this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (mOnPageControlClickListener == null) goto _L2; else goto _L1
_L1:
                motionevent.getAction();
                JVM INSTR tableswitch 1 1: default 32
            //                           1 34;
                   goto _L2 _L3
_L2:
                return true;
_L3:
                if (getOrientation() != 0) goto _L5; else goto _L4
_L4:
                if (motionevent.getX() >= (float)(getWidth() / 2)) goto _L7; else goto _L6
_L6:
                if (mCurrentPage > 0)
                {
                    mOnPageControlClickListener.goBackwards();
                }
_L9:
                return false;
_L7:
                if (mCurrentPage < mPageCount - 1)
                {
                    mOnPageControlClickListener.goForwards();
                }
                continue; /* Loop/switch isn't completed */
_L5:
                if (motionevent.getY() < (float)(getHeight() / 2))
                {
                    if (mCurrentPage > 0)
                    {
                        mOnPageControlClickListener.goBackwards();
                    }
                } else
                if (mCurrentPage < mPageCount - 1)
                {
                    mOnPageControlClickListener.goForwards();
                }
                if (true) goto _L9; else goto _L8
_L8:
            }

            
            {
                this$0 = PageControl.this;
                super();
            }
        });
    }

    public Drawable getActiveDrawable()
    {
        return activeDrawable;
    }

    public int getCurrentPage()
    {
        return mCurrentPage;
    }

    public Drawable getInactiveDrawable()
    {
        return inactiveDrawable;
    }

    public int getIndicatorSize()
    {
        return mIndicatorSize;
    }

    public OnPageControlClickListener getOnPageControlClickListener()
    {
        return mOnPageControlClickListener;
    }

    public int getPageCount()
    {
        return mPageCount;
    }

    protected void onFinishInflate()
    {
        initPageControl();
    }

    public void setActiveDrawable(Drawable drawable)
    {
        activeDrawable = drawable;
        ((ImageView)indicators.get(mCurrentPage)).setBackgroundDrawable(activeDrawable);
    }

    public void setCurrentPage(int i)
    {
        if (i < mPageCount)
        {
            ((ImageView)indicators.get(mCurrentPage)).setBackgroundDrawable(inactiveDrawable);
            ((ImageView)indicators.get(i)).setBackgroundDrawable(activeDrawable);
            mCurrentPage = i;
        }
    }

    public void setInactiveDrawable(Drawable drawable)
    {
        inactiveDrawable = drawable;
        int i = 0;
        do
        {
            if (i >= mPageCount)
            {
                ((ImageView)indicators.get(mCurrentPage)).setBackgroundDrawable(activeDrawable);
                return;
            }
            ((ImageView)indicators.get(i)).setBackgroundDrawable(inactiveDrawable);
            i++;
        } while (true);
    }

    public void setIndicatorSize(int i)
    {
        mIndicatorSize = i;
        i = 0;
        do
        {
            if (i >= mPageCount)
            {
                return;
            }
            ((ImageView)indicators.get(i)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(mIndicatorSize, mIndicatorSize));
            i++;
        } while (true);
    }

    public void setOnPageControlClickListener(OnPageControlClickListener onpagecontrolclicklistener)
    {
        mOnPageControlClickListener = onpagecontrolclicklistener;
    }

    public void setPageCount(int i)
    {
        mPageCount = i;
        int j = 0;
        do
        {
            if (j >= i)
            {
                return;
            }
            ImageView imageview = new ImageView(mContext);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(mIndicatorSize, mIndicatorSize);
            layoutparams.setMargins(mIndicatorSize / 2, mIndicatorSize, mIndicatorSize / 2, mIndicatorSize);
            imageview.setLayoutParams(layoutparams);
            imageview.setBackgroundDrawable(inactiveDrawable);
            indicators.add(imageview);
            addView(imageview);
            j++;
        } while (true);
    }



}
