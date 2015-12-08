// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;

// Referenced classes of package com.fitbit.sleep.ui:
//            SleepTimePickerDialogFragment

private class a extends TimePickerDialog
{

    final SleepTimePickerDialogFragment b;

    private void a()
    {
        setButton(-1, getContext().getString(0x7f08042e), this);
        setButton(-2, getContext().getString(0x7f0802c2), this);
        setOnShowListener(new android.content.DialogInterface.OnShowListener() {

            final SleepTimePickerDialogFragment.a a;

            public void onShow(DialogInterface dialoginterface)
            {
                a.getButton(-2).setTextAppearance(a.b.getActivity(), 0x7f0c00e7);
                a.getButton(-1).setTextAppearance(a.b.getActivity(), 0x7f0c00e8);
            }

            
            {
                a = SleepTimePickerDialogFragment.a.this;
                super();
            }
        });
    }

    public void setTitle(int i)
    {
    }

    public void setTitle(CharSequence charsequence)
    {
    }

    public _cls1.a(SleepTimePickerDialogFragment sleeptimepickerdialogfragment, Context context, int i, android.app.er er, int j, int k, boolean flag)
    {
        b = sleeptimepickerdialogfragment;
        super(context, i, er, j, k, flag);
        a();
    }

    a(SleepTimePickerDialogFragment sleeptimepickerdialogfragment, Context context, android.app.er er, int i, int j, boolean flag)
    {
        b = sleeptimepickerdialogfragment;
        super(context, er, i, j, flag);
        a();
    }
}
