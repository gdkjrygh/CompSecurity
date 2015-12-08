// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.SeekBar;

// Referenced classes of package org.chromium.ui:
//            OnColorChangedListener, ColorPickerAdvancedComponent

public class ColorPickerAdvanced extends LinearLayout
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    private static final int HUE_COLOR_COUNT = 7;
    private static final int HUE_SEEK_BAR_MAX = 360;
    private static final int SATURATION_COLOR_COUNT = 2;
    private static final int SATURATION_SEEK_BAR_MAX = 100;
    private static final int VALUE_COLOR_COUNT = 2;
    private static final int VALUE_SEEK_BAR_MAX = 100;
    private int mCurrentColor;
    private final float mCurrentHsvValues[];
    ColorPickerAdvancedComponent mHueDetails;
    private OnColorChangedListener mOnColorChangedListener;
    ColorPickerAdvancedComponent mSaturationDetails;
    ColorPickerAdvancedComponent mValueDetails;

    public ColorPickerAdvanced(Context context)
    {
        super(context);
        mCurrentHsvValues = new float[3];
        init();
    }

    public ColorPickerAdvanced(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mCurrentHsvValues = new float[3];
        init();
    }

    public ColorPickerAdvanced(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mCurrentHsvValues = new float[3];
        init();
    }

    private void init()
    {
        setOrientation(1);
        mHueDetails = createAndAddNewGradient(R.string.color_picker_hue, 360, this);
        mSaturationDetails = createAndAddNewGradient(R.string.color_picker_saturation, 100, this);
        mValueDetails = createAndAddNewGradient(R.string.color_picker_value, 100, this);
        refreshGradientComponents();
    }

    private void notifyColorChanged()
    {
        if (mOnColorChangedListener != null)
        {
            mOnColorChangedListener.onColorChanged(getColor());
        }
    }

    private void refreshGradientComponents()
    {
        int i = Math.max(Math.min(Math.round(mCurrentHsvValues[1] * 100F), 100), 0);
        int j = Math.max(Math.min(Math.round(mCurrentHsvValues[2] * 100F), 100), 0);
        mHueDetails.setValue(mCurrentHsvValues[0]);
        mSaturationDetails.setValue(i);
        mValueDetails.setValue(j);
        updateHueGradient();
        updateSaturationGradient();
        updateValueGradient();
    }

    private void updateHueGradient()
    {
        float af[] = new float[3];
        af[1] = mCurrentHsvValues[1];
        af[2] = mCurrentHsvValues[2];
        int ai[] = new int[7];
        for (int i = 0; i < 7; i++)
        {
            af[0] = (float)i * 60F;
            ai[i] = Color.HSVToColor(af);
        }

        mHueDetails.setGradientColors(ai);
    }

    private void updateSaturationGradient()
    {
        float af[] = new float[3];
        af[0] = mCurrentHsvValues[0];
        af[1] = 0.0F;
        af[2] = mCurrentHsvValues[2];
        int i = Color.HSVToColor(af);
        af[1] = 1.0F;
        int j = Color.HSVToColor(af);
        mSaturationDetails.setGradientColors(new int[] {
            i, j
        });
    }

    private void updateValueGradient()
    {
        float af[] = new float[3];
        af[0] = mCurrentHsvValues[0];
        af[1] = mCurrentHsvValues[1];
        af[2] = 0.0F;
        int i = Color.HSVToColor(af);
        af[2] = 1.0F;
        int j = Color.HSVToColor(af);
        mValueDetails.setGradientColors(new int[] {
            i, j
        });
    }

    public ColorPickerAdvancedComponent createAndAddNewGradient(int i, int j, android.widget.SeekBar.OnSeekBarChangeListener onseekbarchangelistener)
    {
        android.view.View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(R.layout.color_picker_advanced_component, null);
        addView(view);
        return new ColorPickerAdvancedComponent(view, i, j, onseekbarchangelistener);
    }

    public int getColor()
    {
        return mCurrentColor;
    }

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            mCurrentHsvValues[0] = mHueDetails.getValue();
            mCurrentHsvValues[1] = mSaturationDetails.getValue() / 100F;
            mCurrentHsvValues[2] = mValueDetails.getValue() / 100F;
            mCurrentColor = Color.HSVToColor(mCurrentHsvValues);
            updateHueGradient();
            updateSaturationGradient();
            updateValueGradient();
            notifyColorChanged();
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    public void setColor(int i)
    {
        mCurrentColor = i;
        Color.colorToHSV(mCurrentColor, mCurrentHsvValues);
        refreshGradientComponents();
    }

    public void setListener(OnColorChangedListener oncolorchangedlistener)
    {
        mOnColorChangedListener = oncolorchangedlistener;
    }
}
