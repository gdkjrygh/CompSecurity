// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import android.content.DialogInterface;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

// Referenced classes of package com.skype.android.crash:
//            ShakeBugReportDialog, ClientFeedbackAreas

final class g
    implements android.content.Listener
{

    final Spinner a;
    final ClientFeedbackAreas b;
    final EditText c;
    final EditText d;
    final EditText e;
    final EditText f;
    final CheckBox g;
    final ShakeBugReportDialog h;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.getSelectedItem().toString();
        String s = b.a(dialoginterface);
        String s1 = c.getText().toString();
        String s2 = d.getText().toString();
        String s3 = e.getText().toString();
        String s4 = f.getText().toString();
        ShakeBugReportDialog.a(h, dialoginterface, s, s1, s2, s3, s4, g.isChecked());
    }

    (ShakeBugReportDialog shakebugreportdialog, Spinner spinner, ClientFeedbackAreas clientfeedbackareas, EditText edittext, EditText edittext1, EditText edittext2, EditText edittext3, 
            CheckBox checkbox)
    {
        h = shakebugreportdialog;
        a = spinner;
        b = clientfeedbackareas;
        c = edittext;
        d = edittext1;
        e = edittext2;
        f = edittext3;
        g = checkbox;
        super();
    }
}
