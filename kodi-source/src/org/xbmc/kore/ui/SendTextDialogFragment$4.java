// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.app.Dialog;
import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

// Referenced classes of package org.xbmc.kore.ui:
//            SendTextDialogFragment

class val.dialog
    implements android.widget.stener
{

    final SendTextDialogFragment this$0;
    final Dialog val$dialog;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            SendTextDialogFragment.access$000(SendTextDialogFragment.this).onSendTextFinished(SendTextDialogFragment.access$100(SendTextDialogFragment.this).getText().toString(), SendTextDialogFragment.access$200(SendTextDialogFragment.this).isChecked());
        }
        val$dialog.dismiss();
        return false;
    }

    ndTextDialogListener()
    {
        this$0 = final_sendtextdialogfragment;
        val$dialog = Dialog.this;
        super();
    }
}
