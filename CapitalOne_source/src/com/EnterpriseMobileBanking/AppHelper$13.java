// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.app.AlertDialog;
import android.content.DialogInterface;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper

static final class val.messageDialog
    implements Runnable
{

    final String val$messageDialog;
    final String val$title;

    public void run()
    {
        android.app.uilder uilder = new android.app.uilder(AppHelper.access$000());
        uilder.setTitle(val$title);
        uilder.setMessage(val$messageDialog);
        uilder.setCancelable(true);
        uilder.setNegativeButton("OK", new android.content.DialogInterface.OnClickListener() {

            final AppHelper._cls13 this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                AppHelper.access$200().cancel();
                AlertDialog _tmp = AppHelper.access$202(null);
            }

            
            {
                this$0 = AppHelper._cls13.this;
                super();
            }
        });
        AlertDialog _tmp = AppHelper.access$202(uilder.create());
        AppHelper.access$200().show();
    }

    _cls1.this._cls0(String s, String s1)
    {
        val$title = s;
        val$messageDialog = s1;
        super();
    }
}
