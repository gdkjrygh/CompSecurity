// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;

// Referenced classes of package com.QRBS.activity:
//            StartActivity

class this._cls0
    implements android.content.OnClickListener
{

    final StartActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        StartActivity.access$5(StartActivity.this).dismiss();
    }

    ClickListener()
    {
        this$0 = StartActivity.this;
        super();
    }
}
