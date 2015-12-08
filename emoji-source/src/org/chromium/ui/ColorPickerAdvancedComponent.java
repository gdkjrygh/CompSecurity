// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import org.chromium.base.ApiCompatibilityUtils;

public class ColorPickerAdvancedComponent
{

    private int mGradientColors[];
    private GradientDrawable mGradientDrawable;
    private final View mGradientView;
    private final SeekBar mSeekBar;
    private final TextView mText;

    ColorPickerAdvancedComponent(View view, int i, int j, android.widget.SeekBar.OnSeekBarChangeListener onseekbarchangelistener)
    {
        mGradientView = view.findViewById(R.id.gradient);
        mText = (TextView)view.findViewById(R.id.text);
        mText.setText(i);
        mGradientDrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, null);
        mSeekBar = (SeekBar)view.findViewById(R.id.seek_bar);
        mSeekBar.setOnSeekBarChangeListener(onseekbarchangelistener);
        mSeekBar.setMax(j);
        i = view.getContext().getResources().getDrawable(R.drawable.color_picker_advanced_select_handle).getIntrinsicWidth();
        mSeekBar.setThumbOffset(i / 2);
    }

    public float getValue()
    {
        return (float)mSeekBar.getProgress();
    }

    public void setGradientColors(int ai[])
    {
        mGradientColors = (int[])ai.clone();
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            mGradientDrawable = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, mGradientColors);
        } else
        {
            mGradientDrawable.setColors(mGradientColors);
        }
        ApiCompatibilityUtils.setBackgroundForView(mGradientView, mGradientDrawable);
    }

    public void setValue(float f)
    {
        mSeekBar.setProgress((int)f);
    }
}
