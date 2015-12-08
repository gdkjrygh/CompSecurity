// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.DatePicker;

class ChromeDatePickerDialog extends DatePickerDialog
{

    private final android.app.DatePickerDialog.OnDateSetListener mCallBack;

    public ChromeDatePickerDialog(Context context, android.app.DatePickerDialog.OnDateSetListener ondatesetlistener, int i, int j, int k)
    {
        super(context, 0, ondatesetlistener, i, j, k);
        mCallBack = ondatesetlistener;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1 && mCallBack != null)
        {
            dialoginterface = getDatePicker();
            dialoginterface.clearFocus();
            mCallBack.onDateSet(dialoginterface, dialoginterface.getYear(), dialoginterface.getMonth(), dialoginterface.getDayOfMonth());
        }
    }
}
