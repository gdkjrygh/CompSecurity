// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.app.ProgressDialog;
import android.view.View;
import com.adobe.adobepass.accessenabler.utils.Log;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            TempPassResetActivity

class this._cls0
    implements android.view.empPassResetActivity._cls2
{

    final TempPassResetActivity this$0;

    public void onClick(View view)
    {
        view = getEnvironment();
        String s = TempPassResetActivity.access$100(TempPassResetActivity.this);
        if (TempPassResetActivity.access$200(TempPassResetActivity.this) == null || TempPassResetActivity.access$200(TempPassResetActivity.this).trim().equals(""))
        {
            alertDialog("Temp Pass Reset", "Please provide your Temp Pass Reset API Key");
            return;
        } else
        {
            Log.d("TempPassResetActivity", (new StringBuilder()).append("Resetting Temp Pass for device ID: ").append(s).toString());
            TempPassResetActivity.access$302(TempPassResetActivity.this, ProgressDialog.show(TempPassResetActivity.this, "", "Talking to backend server...", true));
            (new mpPassResetRunner(TempPassResetActivity.this, null)).execute(new String[] {
                view, TempPassResetActivity.access$200(TempPassResetActivity.this), s, TempPassResetActivity.access$400(TempPassResetActivity.this)
            });
            return;
        }
    }

    mpPassResetRunner()
    {
        this$0 = TempPassResetActivity.this;
        super();
    }
}
