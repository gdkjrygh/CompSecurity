// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.widget.DatePicker;

// Referenced classes of package com.skype.android.app.account:
//            ChangeBirthdayDialog

final class this._cls0
    implements android.content.Listener
{

    final ChangeBirthdayDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        case -2: 
        default:
            return;

        case -3: 
            ChangeBirthdayDialog.access$000(ChangeBirthdayDialog.this, 0);
            return;

        case -1: 
            dialoginterface = ChangeBirthdayDialog.access$100(ChangeBirthdayDialog.this).getDatePicker();
            break;
        }
        ChangeBirthdayDialog.access$200(ChangeBirthdayDialog.this, dialoginterface.getYear(), dialoginterface.getMonth(), dialoginterface.getDayOfMonth());
    }

    ()
    {
        this$0 = ChangeBirthdayDialog.this;
        super();
    }
}
