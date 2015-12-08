// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import com.google.android.apps.wallet.widgets.date.SimpleDatePicker;
import java.util.GregorianCalendar;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidatedDatePicker

final class this._cls0
    implements com.google.android.apps.wallet.widgets.date..OnDateSetListener
{

    final ValidatedDatePicker this$0;

    public final void onDateSet(SimpleDatePicker simpledatepicker, int i, int j, int k)
    {
        ValidatedDatePicker.access$002(ValidatedDatePicker.this, new GregorianCalendar(i, j, k));
        ValidatedDatePicker.access$100(ValidatedDatePicker.this);
        checkForError();
    }

    eSetListener()
    {
        this$0 = ValidatedDatePicker.this;
        super();
    }
}
