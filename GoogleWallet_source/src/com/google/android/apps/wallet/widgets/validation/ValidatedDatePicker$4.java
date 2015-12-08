// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.content.Context;
import com.google.android.apps.wallet.widgets.date.SimpleDatePicker;
import com.google.android.apps.wallet.widgets.date.SimpleDatePickerDialog;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidatedDatePicker

final class eSetListener extends SimpleDatePickerDialog
{

    final ValidatedDatePicker this$0;

    public final void onDateChanged(SimpleDatePicker simpledatepicker, int i, int j, int k)
    {
        if (ValidatedDatePicker.access$200(ValidatedDatePicker.this) && getHint().length() > 0)
        {
            setTitle(getHint());
            return;
        } else
        {
            super.onDateChanged(simpledatepicker, i, j, k);
            return;
        }
    }

    eSetListener(Context context, com.google.android.apps.wallet.widgets.date..OnDateSetListener ondatesetlistener, int i, int j, int k)
    {
        this$0 = ValidatedDatePicker.this;
        super(context, ondatesetlistener, i, j, k);
    }
}
