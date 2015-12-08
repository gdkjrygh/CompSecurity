// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.widget.DatePicker;

// Referenced classes of package org.chromium.ui.picker:
//            InputDialogContainer

private class mDialogType
    implements android.app.
{

    private final int mDialogType;
    final InputDialogContainer this$0;

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        setFieldDateTimeValue(mDialogType, i, j, k, 0, 0, 0, 0, 0);
    }

    (int i)
    {
        this$0 = InputDialogContainer.this;
        super();
        mDialogType = i;
    }
}
