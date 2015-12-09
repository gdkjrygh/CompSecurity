// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.ProgressDialog;
import android.content.DialogInterface;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            BusyJSI

class er
    implements android.content.rface.OnCancelListener
{

    final BusyJSI this$0;
    final android.content.rface.OnCancelListener val$onCancelListener;

    public void onCancel(DialogInterface dialoginterface)
    {
        BusyJSI.access$000().setOnCancelListener(null);
        val$onCancelListener.onCancel(dialoginterface);
    }

    er()
    {
        this$0 = final_busyjsi;
        val$onCancelListener = android.content.rface.OnCancelListener.this;
        super();
    }
}
