// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;

import android.content.DialogInterface;

// Referenced classes of package com.worklight.androidgap.directupdate:
//            WLDirectUpdateProgressDialog

class val.onCancel
    implements android.content.r
{

    final WLDirectUpdateProgressDialog this$0;
    final Runnable val$onCancel;

    public void onCancel(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
        val$onCancel.run();
    }

    ()
    {
        this$0 = final_wldirectupdateprogressdialog;
        val$onCancel = Runnable.this;
        super();
    }
}
