// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.widget.DatePicker;
import android.widget.TimePicker;

// Referenced classes of package org.chromium.ui.picker:
//            InputDialogContainer

private class mDialogType
    implements ener
{

    private final int mDialogType;
    private final boolean mLocal;
    final InputDialogContainer this$0;

    public void onDateTimeSet(DatePicker datepicker, TimePicker timepicker, int i, int j, int k, int l, int i1)
    {
        setFieldDateTimeValue(mDialogType, i, j, k, l, i1, 0, 0, 0);
    }

    public ener(int i)
    {
        this$0 = InputDialogContainer.this;
        super();
        boolean flag;
        if (i == InputDialogContainer.access$300())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mLocal = flag;
        mDialogType = i;
    }
}
