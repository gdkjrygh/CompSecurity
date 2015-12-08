// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;
import com.fsr.tracker.StringsProvider;
import com.fsr.tracker.layouts.InviteView;
import com.fsr.tracker.layouts.OnExitDetailsView;
import com.fsr.tracker.service.Callback;
import fs.org.slf4j.Logger;

// Referenced classes of package com.fsr.tracker.app:
//            OnExitSurveyInviteActivity, TrackingContext

class val.activity
    implements Callback
{

    final val.activity this$1;
    final Activity val$activity;
    final ProgressDialog val$progressDialog;

    public void onComplete(com.fsr.tracker.service.activity activity1)
    {
        val$progressDialog.cancel();
        inviteView.enable();
        OnExitSurveyInviteActivity.access$600(_fld0).debug("Result = {}", activity1);
        Log.d("ForeSee Trigger Code", activity1.());
        switch (ExitSurveyServiceClient.ValidationResult[activity1.ValidationResult()])
        {
        default:
            return;

        case 1: // '\001'
            TrackingContext.Instance().completeSurvey();
            finish();
            return;

        case 2: // '\002'
            OnExitSurveyInviteActivity.access$200(_fld0).setErrorText(stringsProvider.getInvalidFormatMessage());
            return;

        case 3: // '\003'
            OnExitSurveyInviteActivity.access$200(_fld0).setErrorText(stringsProvider.getRequiredFieldMessage());
            return;

        case 4: // '\004'
            val$progressDialog.cancel();
            break;
        }
        Log.w("ForeSee Trigger Code", "SERVER_ERROR");
        cess._mth800(this._cls1.this, val$activity);
    }

    public volatile void onComplete(Object obj)
    {
        onComplete((com.fsr.tracker.service.mplete)obj);
    }

    public void onFailure(Throwable throwable)
    {
        val$progressDialog.cancel();
        Log.w("ForeSee Trigger Code", "SERVER_ERROR");
        cess._mth800(this._cls1.this, val$activity);
    }

    Y()
    {
        this$1 = final_y;
        val$progressDialog = progressdialog;
        val$activity = Activity.this;
        super();
    }
}
