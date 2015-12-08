// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.widget.EditText;
import com.fsr.tracker.StringsProvider;
import com.fsr.tracker.domain.MeasureConfiguration;
import com.fsr.tracker.layouts.InviteView;
import com.fsr.tracker.layouts.OnExitDetailsView;
import com.fsr.tracker.layouts.SurveyInviteClickHandler;
import com.fsr.tracker.service.Callback;
import com.fsr.tracker.service.ExitSurveyServiceClient;
import com.fsr.tracker.services.ExitSurveyServiceClientImpl;
import fs.org.slf4j.Logger;
import java.util.UUID;

// Referenced classes of package com.fsr.tracker.app:
//            OnExitSurveyInviteActivity, TrackingContext

private class <init>
    implements <init>
{

    final OnExitSurveyInviteActivity this$0;

    private void showNetworkError(Activity activity)
    {
        TrackingContext.Instance().onNetworkDisconnected(activity);
        inviteView.enable();
    }

    public void onAccept(final Activity activity, final SurveyInviteClickHandler progressDialog)
    {
        OnExitSurveyInviteActivity.access$600(OnExitSurveyInviteActivity.this).debug("Submitting detail form");
        OnExitSurveyInviteActivity.access$200(OnExitSurveyInviteActivity.this).clearError();
        inviteView.disable();
        progressDialog = new ProgressDialog(activity, 1);
        progressDialog.setMessage(stringsProvider.getProgressMessage());
        progressDialog.show();
        if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isAvailable())
        {
            TrackingContext trackingcontext = TrackingContext.Instance();
            String s = UUID.randomUUID().toString();
            trackingcontext.setRespondentId(s);
            (new ExitSurveyServiceClientImpl()).initializeNotification(OnExitSurveyInviteActivity.access$200(OnExitSurveyInviteActivity.this).getEditField().getText().toString(), s, trackingcontext.getApiKey(), measureConfiguration.getSurveyId(), OnExitSurveyInviteActivity.access$700(OnExitSurveyInviteActivity.this), new Callback() {

                final OnExitSurveyInviteActivity.RemoteNotificationDetailsPresented this$1;
                final Activity val$activity;
                final ProgressDialog val$progressDialog;

                public void onComplete(com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult validationresult)
                {
                    progressDialog.cancel();
                    inviteView.enable();
                    OnExitSurveyInviteActivity.access$600(this$0).debug("Result = {}", validationresult);
                    Log.d("ForeSee Trigger Code", validationresult.name());
                    switch (OnExitSurveyInviteActivity._cls1.$SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[validationresult.ordinal()])
                    {
                    default:
                        return;

                    case 1: // '\001'
                        TrackingContext.Instance().completeSurvey();
                        finish();
                        return;

                    case 2: // '\002'
                        OnExitSurveyInviteActivity.access$200(this$0).setErrorText(stringsProvider.getInvalidFormatMessage());
                        return;

                    case 3: // '\003'
                        OnExitSurveyInviteActivity.access$200(this$0).setErrorText(stringsProvider.getRequiredFieldMessage());
                        return;

                    case 4: // '\004'
                        progressDialog.cancel();
                        break;
                    }
                    Log.w("ForeSee Trigger Code", "SERVER_ERROR");
                    showNetworkError(activity);
                }

                public volatile void onComplete(Object obj)
                {
                    onComplete((com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult)obj);
                }

                public void onFailure(Throwable throwable)
                {
                    progressDialog.cancel();
                    Log.w("ForeSee Trigger Code", "SERVER_ERROR");
                    showNetworkError(activity);
                }

            
            {
                this$1 = OnExitSurveyInviteActivity.RemoteNotificationDetailsPresented.this;
                progressDialog = progressdialog;
                activity = activity1;
                super();
            }
            });
            return;
        } else
        {
            OnExitSurveyInviteActivity.access$600(OnExitSurveyInviteActivity.this).warn("Network connection unavailable");
            Log.w("ForeSee Trigger Code", "Network connection unavailable");
            progressDialog.cancel();
            showNetworkError(activity);
            return;
        }
    }

    public void onDecline(SurveyInviteClickHandler surveyinviteclickhandler)
    {
        TrackingContext.Instance().abortSurvey();
        finish();
    }


    private _cls1.val.activity()
    {
        this$0 = OnExitSurveyInviteActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
