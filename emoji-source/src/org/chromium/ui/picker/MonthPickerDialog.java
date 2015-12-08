// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.content.Context;

// Referenced classes of package org.chromium.ui.picker:
//            TwoFieldDatePickerDialog, MonthPicker, TwoFieldDatePicker

public class MonthPickerDialog extends TwoFieldDatePickerDialog
{

    public MonthPickerDialog(Context context, TwoFieldDatePickerDialog.OnValueSetListener onvaluesetlistener, int i, int j, double d, double d1)
    {
        super(context, onvaluesetlistener, i, j, d, d1);
        setTitle(org.chromium.ui.R.string.month_picker_dialog_title);
    }

    protected TwoFieldDatePicker createPicker(Context context, double d, double d1)
    {
        return new MonthPicker(context, d, d1);
    }

    public MonthPicker getMonthPicker()
    {
        return (MonthPicker)mPicker;
    }
}
