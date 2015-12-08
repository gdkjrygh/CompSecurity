// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.scannerfire.db.DbAdapter;
import java.io.File;

// Referenced classes of package com.QRBS.activity:
//            StartActivity

class val.a
    implements android.view.ner
{

    final StartActivity this$0;
    private final AlertDialog val$a;
    private final EditText val$editName;

    public void onClick(View view)
    {
        view = val$editName.getText().toString();
        if (view == null || view.length() == 0)
        {
            Toast.makeText(getParent(), 0x7f08010d, 0).show();
        } else
        {
            if (!view.endsWith(".csv"))
            {
                view = (new StringBuilder(String.valueOf(view))).append(".csv").toString();
            }
            if ((new DbAdapter(StartActivity.this)).saveCSV(view))
            {
                val$a.dismiss();
                Object obj = (new android.support.v4.app.t.Builder(StartActivity.this)).setSmallIcon(0x7f0200cd).setContentTitle(view).setContentText("Open Csv File");
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setDataAndType(Uri.fromFile(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), view)), "text/csv");
                Intent.createChooser(intent, "Open Csv with...");
                ((android.support.v4.app.t.Builder) (obj)).setContentIntent(PendingIntent.getActivity(StartActivity.this, 0, intent, 0));
                view = (NotificationManager)getSystemService("notification");
                obj = ((android.support.v4.app.t.Builder) (obj)).build();
                obj.flags = 16;
                view.notify(1, ((Notification) (obj)));
                return;
            }
        }
    }

    Compat.Builder()
    {
        this$0 = final_startactivity;
        val$editName = edittext;
        val$a = AlertDialog.this;
        super();
    }
}
