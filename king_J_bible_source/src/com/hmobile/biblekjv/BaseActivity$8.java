// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity, HolyBibleApplication

class val.dialog
    implements android.view.tener
{

    final BaseActivity this$0;
    private final AlertDialog val$dialog;
    private final RelativeLayout val$rlRate;

    public void onClick(View view)
    {
        if (PreferenceManager.getDefaultSharedPreferences(BaseActivity.this).getInt("exit_alert", 1) == 1)
        {
            val$rlRate.setVisibility(0);
        } else
        {
            val$dialog.dismiss();
            finish();
        }
        HolyBibleApplication.stopBilllingService();
    }

    ation()
    {
        this$0 = final_baseactivity;
        val$rlRate = relativelayout;
        val$dialog = AlertDialog.this;
        super();
    }
}
