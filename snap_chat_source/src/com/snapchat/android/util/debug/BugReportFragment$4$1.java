// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import II;
import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.util.AlertDialogUtils;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportFragment

final class val.existingSendToSelfEmail
    implements android.content.kListener
{

    final is._cls0 this$1;
    final String val$existingSendToSelfEmail;
    final EditText val$input;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = val$input.getText().toString();
        if (dialoginterface.endsWith("@snapchat.com"))
        {
            if (!dialoginterface.equals(val$existingSendToSelfEmail))
            {
                II.a("SHAKE_TO_REPORT_SEND_TO_SELF_EMAIL", dialoginterface);
            }
            BugReportFragment.c(_fld0).setText(dialoginterface);
            BugReportFragment.a(_fld0, true);
            return;
        } else
        {
            AlertDialogUtils.a(BugReportFragment.d(_fld0), "Please enter a valid @snapchat email!!");
            return;
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$input = edittext;
        val$existingSendToSelfEmail = String.this;
        super();
    }

    // Unreferenced inner class com/snapchat/android/util/debug/BugReportFragment$4

/* anonymous class */
    final class BugReportFragment._cls4
        implements android.view.View.OnClickListener
    {

        final BugReportFragment this$0;

        public final void onClick(View view)
        {
            if (BugReportFragment.b(BugReportFragment.this))
            {
                BugReportFragment.a(BugReportFragment.this, false);
                BugReportFragment.c(BugReportFragment.this).setText("Send this report only to yourself?");
                return;
            }
            view = new android.app.AlertDialog.Builder(BugReportFragment.d(BugReportFragment.this));
            final EditText input = new EditText(BugReportFragment.d(BugReportFragment.this));
            String s = II.a("SHAKE_TO_REPORT_SEND_TO_SELF_EMAIL");
            if (s != null)
            {
                input.setText(s);
                input.setSelection(s.length() - 13);
            } else
            {
                input.setText("@snapchat.com");
                input.setSelection(0);
            }
            view.setTitle("Please enter your email").setView(input).setPositiveButton("Okay", s. new BugReportFragment._cls4._cls1()).show();
        }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }
    }

}
