// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.EditText;

// Referenced classes of package org.xbmc.kore.ui:
//            SendTextDialogFragment

class this._cls0
    implements android.content.stener
{

    final SendTextDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SendTextDialogFragment.access$000(SendTextDialogFragment.this).onSendTextFinished(SendTextDialogFragment.access$100(SendTextDialogFragment.this).getText().toString(), SendTextDialogFragment.access$200(SendTextDialogFragment.this).isChecked());
    }

    ndTextDialogListener()
    {
        this$0 = SendTextDialogFragment.this;
        super();
    }
}
