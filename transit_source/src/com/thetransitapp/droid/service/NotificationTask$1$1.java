// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.thetransitapp.droid.service:
//            NotificationTask

class val.alertDialog
    implements android.view.tificationTask._cls1._cls1
{

    final ontext this$1;
    private final AlertDialog val$alertDialog;
    private final Pattern val$emailPattern;
    private final EditText val$input;

    public void onClick(View view)
    {
        NotificationTask.access$2(_fld0, val$input.getText().toString());
        if (val$emailPattern.matcher(NotificationTask.access$3(_fld0)).matches())
        {
            execute();
            val$alertDialog.dismiss();
            return;
        } else
        {
            val$input.selectAll();
            view = getContext().getString(0x7f0a0099);
            Toast.makeText(getContext(), view, 0).show();
            return;
        }
    }

    l.emailPattern()
    {
        this$1 = final_emailpattern;
        val$input = edittext;
        val$emailPattern = pattern;
        val$alertDialog = AlertDialog.this;
        super();
    }

    // Unreferenced inner class com/thetransitapp/droid/service/NotificationTask$1

/* anonymous class */
    class NotificationTask._cls1
        implements android.content.DialogInterface.OnShowListener
    {

        final NotificationTask this$0;
        private final AlertDialog val$alertDialog;
        private final Pattern val$emailPattern;
        private final EditText val$input;

        public void onShow(DialogInterface dialoginterface)
        {
            alertDialog.getButton(-1).setOnClickListener(alertDialog. new NotificationTask._cls1._cls1());
        }


            
            {
                this$0 = final_notificationtask;
                alertDialog = alertdialog;
                input = edittext;
                emailPattern = Pattern.this;
                super();
            }
    }

}
