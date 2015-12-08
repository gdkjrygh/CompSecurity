// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.fitbit.sleep.ui:
//            SleepTimePickerDialogFragment

class <init> extends <init>
{

    final SleepTimePickerDialogFragment a;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        super.onClick(dialoginterface, i);
        if (i == -1)
        {
            SleepTimePickerDialogFragment.d(a).onTimeSet(SleepTimePickerDialogFragment.a(a), SleepTimePickerDialogFragment.b(a), SleepTimePickerDialogFragment.c(a));
        }
    }

    _cls9(SleepTimePickerDialogFragment sleeptimepickerdialogfragment, Context context, android.app.er er, int i, int j, boolean flag)
    {
        a = sleeptimepickerdialogfragment;
        super(sleeptimepickerdialogfragment, context, er, i, j, flag);
    }
}
