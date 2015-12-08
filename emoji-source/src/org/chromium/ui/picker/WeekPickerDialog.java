// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.content.Context;

// Referenced classes of package org.chromium.ui.picker:
//            TwoFieldDatePickerDialog, WeekPicker, TwoFieldDatePicker

public class WeekPickerDialog extends TwoFieldDatePickerDialog
{

    public WeekPickerDialog(Context context, int i, TwoFieldDatePickerDialog.OnValueSetListener onvaluesetlistener, int j, int k, double d, 
            double d1)
    {
        super(context, i, onvaluesetlistener, j, k, d, d1);
        setTitle(org.chromium.ui.R.string.week_picker_dialog_title);
    }

    public WeekPickerDialog(Context context, TwoFieldDatePickerDialog.OnValueSetListener onvaluesetlistener, int i, int j, double d, double d1)
    {
        this(context, 0, onvaluesetlistener, i, j, d, d1);
    }

    protected TwoFieldDatePicker createPicker(Context context, double d, double d1)
    {
        return new WeekPicker(context, d, d1);
    }

    public WeekPicker getWeekPicker()
    {
        return (WeekPicker)mPicker;
    }
}
