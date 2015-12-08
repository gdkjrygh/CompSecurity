// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.splunk.mint.Mint;

// Referenced classes of package com.QRBS.activity:
//            StartActivity

class this._cls0
    implements android.content.OnClickListener
{

    final StartActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse("http://www.qrbarcodescanner.com/redir"));
        try
        {
            startActivity(dialoginterface);
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            Mint.logException(dialoginterface);
        }
        StartActivity.access$5(StartActivity.this).dismiss();
    }

    ception()
    {
        this$0 = StartActivity.this;
        super();
    }
}
