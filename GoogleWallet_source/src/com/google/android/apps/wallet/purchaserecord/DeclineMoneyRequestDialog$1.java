// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.CheckBox;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            DeclineMoneyRequestDialog

final class this._cls0
    implements android.content.ner
{

    final DeclineMoneyRequestDialog this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (-1 == i)
        {
            dialoginterface = (CheckBox)getDialog().findViewById(com.google.android.apps.walletnfcrel.Dialog.getDialog);
            DeclineMoneyRequestDialog declinemoneyrequestdialog = DeclineMoneyRequestDialog.this;
            if (dialoginterface.isChecked())
            {
                i = 3;
            } else
            {
                i = 2;
            }
            DeclineMoneyRequestDialog.access$000(declinemoneyrequestdialog, i);
        }
    }

    ()
    {
        this$0 = DeclineMoneyRequestDialog.this;
        super();
    }
}
