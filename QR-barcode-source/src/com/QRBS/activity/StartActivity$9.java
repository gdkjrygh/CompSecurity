// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.scannerfire.db.DbAdapter;
import com.scannerfire.fragment.FragmentCronology;

// Referenced classes of package com.QRBS.activity:
//            StartActivity

class this._cls0
    implements android.content.OnClickListener
{

    final StartActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new DbAdapter(StartActivity.this);
        dialoginterface.open();
        dialoginterface.deleteAll();
        java.util.ArrayList arraylist = dialoginterface.getValues();
        fc.updateList(arraylist, StartActivity.this);
        dialoginterface.close();
        StartActivity.access$5(StartActivity.this).dismiss();
    }

    ronology()
    {
        this$0 = StartActivity.this;
        super();
    }
}
