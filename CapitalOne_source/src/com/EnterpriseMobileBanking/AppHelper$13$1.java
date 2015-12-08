// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.app.AlertDialog;
import android.content.DialogInterface;

// Referenced classes of package com.EnterpriseMobileBanking:
//            AppHelper

class this._cls0
    implements android.content..OnClickListener
{

    final s._cls202 this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        AppHelper.access$200().cancel();
        AlertDialog _tmp = AppHelper.access$202(null);
    }

    l.messageDialog()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class com/EnterpriseMobileBanking/AppHelper$13

/* anonymous class */
    static final class AppHelper._cls13
        implements Runnable
    {

        final String val$messageDialog;
        final String val$title;

        public void run()
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(AppHelper.access$000());
            builder.setTitle(title);
            builder.setMessage(messageDialog);
            builder.setCancelable(true);
            builder.setNegativeButton("OK", new AppHelper._cls13._cls1());
            AlertDialog _tmp = AppHelper.access$202(builder.create());
            AppHelper.access$200().show();
        }

            
            {
                title = s;
                messageDialog = s1;
                super();
            }
    }

}
