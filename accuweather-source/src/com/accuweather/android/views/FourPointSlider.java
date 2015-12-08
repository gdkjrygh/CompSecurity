// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FourPointSlider extends RelativeLayout
    implements android.view.View.OnTouchListener
{

    private static final String DEBUG_TAG = "FourPointSlider";
    private ImageButton mMaxPrimaryIndicator;
    private float mMaxPrimaryValue;
    private LinearLayout mMaxPrimaryValueLayout;
    private TextView mMaxPrimaryValueText;
    private float mMaxSecondaryValue;
    private float mMaxValue;
    private ImageButton mMinPrimaryIndicator;
    private float mMinPrimaryValue;
    private LinearLayout mMinPrimaryValueLayout;
    private TextView mMinPrimaryValueText;
    private float mMinSecondaryValue;
    private float mMinValue;
    private LinearLayout mPrimaryBarLayout;
    private LinearLayout mPrimaryIndicatorLayout;
    private View mPrimaryIndicatorMaxSpacer;
    private View mPrimaryIndicatorMidSpacer;
    private View mPrimaryIndicatorMinSpacer;
    private View mPrimaryValueBar;
    private View mPrimaryValueBarMaxSpacer;
    private View mPrimaryValueBarMinSpacer;
    private LinearLayout mSecondaryBarLayout;
    private View mSecondaryValueBar;
    private View mSecondaryValueBarMaxSpacer;
    private View mSecondaryValueBarMinSpacer;
    private String mTextFormat;

    public FourPointSlider(Context context)
    {
        this(context, null);
    }

    public FourPointSlider(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mMaxPrimaryValue = 99F;
        mMinPrimaryValue = 1.0F;
        mMaxSecondaryValue = 60F;
        mMinSecondaryValue = 40F;
        mMaxValue = 100F;
        mMinValue = 0.0F;
        mTextFormat = "%d";
        init();
    }

    private void init()
    {
        ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(com.accuweather.android.R.layout.four_point_slider, this);
        mMinPrimaryIndicator = (ImageButton)findViewById(com.accuweather.android.R.id.min_primary_indicator);
        mMaxPrimaryIndicator = (ImageButton)findViewById(com.accuweather.android.R.id.max_primary_indicator);
        mPrimaryIndicatorMinSpacer = findViewById(com.accuweather.android.R.id.primary_indicator_min_spacer);
        mPrimaryIndicatorMidSpacer = findViewById(com.accuweather.android.R.id.primary_indicator_mid_spacer);
        mPrimaryIndicatorMaxSpacer = findViewById(com.accuweather.android.R.id.primary_indicator_max_spacer);
        mPrimaryIndicatorLayout = (LinearLayout)findViewById(com.accuweather.android.R.id.primary_indicator_layout);
        mMinPrimaryValueLayout = (LinearLayout)findViewById(com.accuweather.android.R.id.min_primary_indicator_layout);
        mMaxPrimaryValueLayout = (LinearLayout)findViewById(com.accuweather.android.R.id.max_primary_indicator_layout);
        mPrimaryBarLayout = (LinearLayout)findViewById(com.accuweather.android.R.id.primary_layout);
        mSecondaryBarLayout = (LinearLayout)findViewById(com.accuweather.android.R.id.secondary_layout);
        mPrimaryValueBar = findViewById(com.accuweather.android.R.id.primary_bar);
        mPrimaryValueBarMinSpacer = findViewById(com.accuweather.android.R.id.primary_bar_min_spacer);
        mPrimaryValueBarMaxSpacer = findViewById(com.accuweather.android.R.id.primary_bar_max_spacer);
        mSecondaryValueBar = findViewById(com.accuweather.android.R.id.secondary_bar);
        mSecondaryValueBarMinSpacer = findViewById(com.accuweather.android.R.id.secondary_bar_min_spacer);
        mSecondaryValueBarMaxSpacer = findViewById(com.accuweather.android.R.id.secondary_bar_max_spacer);
        mMaxPrimaryValueText = (TextView)findViewById(com.accuweather.android.R.id.max_primary_value);
        mMinPrimaryValueText = (TextView)findViewById(com.accuweather.android.R.id.min_primary_value);
        mMinPrimaryIndicator.setOnTouchListener(this);
        mMaxPrimaryIndicator.setOnTouchListener(this);
    }

    public float getPrimaryMaxValue()
    {
        return mMaxPrimaryValue;
    }

    public float getPrimaryMinValue()
    {
        return mMinPrimaryValue;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        float f = getWidth();
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        getParent().requestDisallowInterceptTouchEvent(true);
_L4:
        return true;
_L2:
        if (motionevent.getAction() == 2)
        {
            if (view.getId() != com.accuweather.android.R.id.max_primary_indicator)
            {
                continue; /* Loop/switch isn't completed */
            }
            f = (motionevent.getRawX() / f) * (mMaxValue - mMinValue) + mMinValue;
            if (f > mMinPrimaryValue)
            {
                setPrimaryValues(mMinPrimaryValue, f);
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (view.getId() != com.accuweather.android.R.id.min_primary_indicator) goto _L4; else goto _L3
_L3:
        f = (motionevent.getRawX() / f) * (mMaxValue - mMinValue) + mMinValue;
        if (f < mMaxPrimaryValue)
        {
            setPrimaryValues(f, mMaxPrimaryValue);
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void setBoundedValues(float f, float f1)
    {
        mMaxValue = f1;
        mMinValue = f;
        mPrimaryBarLayout.setWeightSum(f1 - f);
        mSecondaryBarLayout.setWeightSum(f1 - f);
    }

    public void setPrimaryValues(float f, float f1)
    {
        float f2 = f;
        if (f < mMinValue)
        {
            f2 = mMinValue;
        }
        f = f1;
        if (f1 > mMaxValue)
        {
            f = mMaxValue;
        }
        mMaxPrimaryValue = f;
        mMinPrimaryValue = f2;
        ((android.widget.LinearLayout.LayoutParams)mPrimaryValueBarMinSpacer.getLayoutParams()).weight = f2 - mMinValue;
        ((android.widget.LinearLayout.LayoutParams)mPrimaryValueBar.getLayoutParams()).weight = mMaxValue - mMinValue - (f2 - mMinValue) - (mMaxValue - f);
        ((android.widget.LinearLayout.LayoutParams)mPrimaryValueBarMaxSpacer.getLayoutParams()).weight = mMaxValue - f;
        ((android.widget.LinearLayout.LayoutParams)mPrimaryIndicatorMinSpacer.getLayoutParams()).weight = f2 - mMinValue;
        ((android.widget.LinearLayout.LayoutParams)mPrimaryIndicatorMidSpacer.getLayoutParams()).weight = mMaxValue - mMinValue - (f2 - mMinValue) - (mMaxValue - f);
        ((android.widget.LinearLayout.LayoutParams)mPrimaryIndicatorMaxSpacer.getLayoutParams()).weight = mMaxValue - f;
        mMinPrimaryValueText.setText(String.format(mTextFormat, new Object[] {
            Integer.valueOf((int)f2)
        }));
        mMaxPrimaryValueText.setText(String.format(mTextFormat, new Object[] {
            Integer.valueOf((int)f)
        }));
        setSecondaryValues(f2 - (mMaxValue - mMinValue) * 0.2F, (mMaxValue - mMinValue) * 0.2F + f);
    }

    public void setSecondaryValues(float f, float f1)
    {
        float f2 = f;
        if (f < mMinValue)
        {
            f2 = mMinValue;
        }
        f = f1;
        if (f1 > mMaxValue)
        {
            f = mMaxValue;
        }
        mMaxSecondaryValue = f;
        mMinSecondaryValue = f2;
        ((android.widget.LinearLayout.LayoutParams)mSecondaryValueBarMinSpacer.getLayoutParams()).weight = f2 - mMinValue;
        ((android.widget.LinearLayout.LayoutParams)mSecondaryValueBar.getLayoutParams()).weight = mMaxValue - mMinValue - (f2 - mMinValue) - (mMaxValue - f);
        ((android.widget.LinearLayout.LayoutParams)mSecondaryValueBarMaxSpacer.getLayoutParams()).weight = mMaxValue - f;
    }

    public void setTextFormat(String s)
    {
        mTextFormat = s;
    }
}
