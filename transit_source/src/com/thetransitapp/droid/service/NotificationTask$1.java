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

class val.emailPattern
    implements android.content.howListener
{

    final NotificationTask this$0;
    private final AlertDialog val$alertDialog;
    private final Pattern val$emailPattern;
    private final EditText val$input;

    public void onShow(DialogInterface dialoginterface)
    {
        val$alertDialog.getButton(-1).setOnClickListener(new android.view.View.OnClickListener() {

            final NotificationTask._cls1 this$1;
            private final AlertDialog val$alertDialog;
            private final Pattern val$emailPattern;
            private final EditText val$input;

            public void onClick(View view)
            {
                NotificationTask.access$2(this$0, input.getText().toString());
                if (emailPattern.matcher(NotificationTask.access$3(this$0)).matches())
                {
                    execute();
                    alertDialog.dismiss();
                    return;
                } else
                {
                    input.selectAll();
                    view = getContext().getString(0x7f0a0099);
                    Toast.makeText(getContext(), view, 0).show();
                    return;
                }
            }

            
            {
                this$1 = NotificationTask._cls1.this;
                input = edittext;
                emailPattern = pattern;
                alertDialog = alertdialog;
                super();
            }
        });
    }


    _cls1.val.alertDialog()
    {
        this$0 = final_notificationtask;
        val$alertDialog = alertdialog;
        val$input = edittext;
        val$emailPattern = Pattern.this;
        super();
    }
}
