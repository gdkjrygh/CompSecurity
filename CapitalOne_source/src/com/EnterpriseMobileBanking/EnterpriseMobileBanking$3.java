// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.app.ProgressDialog;
import android.os.Looper;

// Referenced classes of package com.EnterpriseMobileBanking:
//            EnterpriseMobileBanking

class val.firstTime
    implements Runnable
{

    final EnterpriseMobileBanking this$0;
    final boolean val$firstTime;

    public void run()
    {
        Looper.prepare();
        Looper looper = Looper.myLooper();
        EnterpriseMobileBanking.access$402(EnterpriseMobileBanking.this, new ProgressDialog(getContext()));
        EnterpriseMobileBanking.access$400(EnterpriseMobileBanking.this).setIndeterminate(true);
        EnterpriseMobileBanking.access$400(EnterpriseMobileBanking.this).setCancelable(false);
        EnterpriseMobileBanking.access$400(EnterpriseMobileBanking.this).setCanceledOnTouchOutside(false);
        ProgressDialog progressdialog = EnterpriseMobileBanking.access$400(EnterpriseMobileBanking.this);
        EnterpriseMobileBanking enterprisemobilebanking = EnterpriseMobileBanking.this;
        int i;
        if (val$firstTime)
        {
            i = 0x7f0900fa;
        } else
        {
            i = 0x7f0900f9;
        }
        progressdialog.setMessage(enterprisemobilebanking.getString(i));
        EnterpriseMobileBanking.access$400(EnterpriseMobileBanking.this).show();
        Looper.loop();
        looper.quit();
    }

    ()
    {
        this$0 = final_enterprisemobilebanking;
        val$firstTime = Z.this;
        super();
    }
}
