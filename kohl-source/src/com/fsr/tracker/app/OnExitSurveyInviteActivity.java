// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import com.fsr.tracker.StringsProvider;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.domain.MeasureConfiguration;
import com.fsr.tracker.layouts.InviteView;
import com.fsr.tracker.layouts.InviteViewParams;
import com.fsr.tracker.layouts.OnExitDetailsView;
import com.fsr.tracker.layouts.SurveyInviteClickHandler;
import com.fsr.tracker.layouts.SurveyInviteView;
import com.fsr.tracker.service.Callback;
import com.fsr.tracker.service.ExitSurveyServiceClient;
import com.fsr.tracker.services.ExitSurveyServiceClientImpl;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.util.UUID;

// Referenced classes of package com.fsr.tracker.app:
//            SurveyInviteActivity, TrackingContext

public class OnExitSurveyInviteActivity extends SurveyInviteActivity
{
    private class LocalNotificationInvitedState
        implements OnExitInviteState
    {

        final OnExitSurveyInviteActivity this$0;

        public void onAccept(Activity activity, SurveyInviteClickHandler surveyinviteclickhandler)
        {
            TrackingContext.Instance().acceptInvitation();
            finish();
        }

        public void onDecline(SurveyInviteClickHandler surveyinviteclickhandler)
        {
            TrackingContext.Instance().declineInvitation();
            finish();
        }

        private LocalNotificationInvitedState()
        {
            this$0 = OnExitSurveyInviteActivity.this;
            super();
        }

    }

    private static interface OnExitInviteState
    {

        public abstract void onAccept(Activity activity, SurveyInviteClickHandler surveyinviteclickhandler);

        public abstract void onDecline(SurveyInviteClickHandler surveyinviteclickhandler);
    }

    private class RemoteNotificationDetailsPresented
        implements OnExitInviteState
    {

        final OnExitSurveyInviteActivity this$0;

        private void showNetworkError(Activity activity)
        {
            TrackingContext.Instance().onNetworkDisconnected(activity);
            inviteView.enable();
        }

        public void onAccept(Activity activity, final SurveyInviteClickHandler progressDialog)
        {
            logger.debug("Submitting detail form");
            detailsView.clearError();
            inviteView.disable();
            progressDialog = new ProgressDialog(activity, 1);
            progressDialog.setMessage(stringsProvider.getProgressMessage());
            progressDialog.show();
            if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isAvailable())
            {
                TrackingContext trackingcontext = TrackingContext.Instance();
                String s = UUID.randomUUID().toString();
                trackingcontext.setRespondentId(s);
                (new ExitSurveyServiceClientImpl()).initializeNotification(detailsView.getEditField().getText().toString(), s, trackingcontext.getApiKey(), measureConfiguration.getSurveyId(), getUserAgent(), activity. new Callback() {

                    final RemoteNotificationDetailsPresented this$1;
                    final Activity val$activity;
                    final ProgressDialog val$progressDialog;

                    public void onComplete(com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult validationresult)
                    {
                        progressDialog.cancel();
                        inviteView.enable();
                        logger.debug("Result = {}", validationresult);
                        Log.d("ForeSee Trigger Code", validationresult.name());
                        static class _cls1
                        {

                            static final int $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[];

                            static 
                            {
                                $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult = new int[com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.values().length];
                                try
                                {
                                    $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.VALID.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror3) { }
                                try
                                {
                                    $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.INVALID_FORMAT.ordinal()] = 2;
                                }
                                catch (NoSuchFieldError nosuchfielderror2) { }
                                try
                                {
                                    $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.REQUIRED_FIELD.ordinal()] = 3;
                                }
                                catch (NoSuchFieldError nosuchfielderror1) { }
                                try
                                {
                                    $SwitchMap$com$fsr$tracker$service$ExitSurveyServiceClient$ValidationResult[com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult.SERVER_ERROR.ordinal()] = 4;
                                }
                                catch (NoSuchFieldError nosuchfielderror)
                                {
                                    return;
                                }
                            }
                        }

                        switch (_cls1..SwitchMap.com.fsr.tracker.service.ExitSurveyServiceClient.ValidationResult[validationresult.ordinal()])
                        {
                        default:
                            return;

                        case 1: // '\001'
                            TrackingContext.Instance().completeSurvey();
                            finish();
                            return;

                        case 2: // '\002'
                            detailsView.setErrorText(stringsProvider.getInvalidFormatMessage());
                            return;

                        case 3: // '\003'
                            detailsView.setErrorText(stringsProvider.getRequiredFieldMessage());
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
                this$1 = final_remotenotificationdetailspresented;
                progressDialog = progressdialog;
                activity = Activity.this;
                super();
            }
                });
                return;
            } else
            {
                logger.warn("Network connection unavailable");
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


        private RemoteNotificationDetailsPresented()
        {
            this$0 = OnExitSurveyInviteActivity.this;
            super();
        }

    }

    private class RemoteNotificationInvitedState
        implements OnExitInviteState
    {

        final OnExitSurveyInviteActivity this$0;

        public void onAccept(Activity activity, SurveyInviteClickHandler surveyinviteclickhandler)
        {
            InviteViewParams inviteviewparams = new InviteViewParams(getWindowManager().getDefaultDisplay(), getResources().getConfiguration());
            detailsView = new OnExitDetailsView(activity, inviteviewparams, configuration.getCustomLogoPath(), surveyinviteclickhandler, stringsProvider);
            inviteView = detailsView;
            setContentView(inviteView);
            TrackingContext.Instance().acceptInvitation();
            state = new RemoteNotificationDetailsPresented(null);
        }

        public void onDecline(SurveyInviteClickHandler surveyinviteclickhandler)
        {
            TrackingContext.Instance().declineInvitation();
            finish();
        }

        private RemoteNotificationInvitedState()
        {
            this$0 = OnExitSurveyInviteActivity.this;
            super();
        }

    }


    private Configuration configuration;
    private OnExitDetailsView detailsView;
    private Logger logger;
    private OnExitInviteState state;

    public OnExitSurveyInviteActivity()
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
    }

    private String getUserAgent()
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return WebSettings.getDefaultUserAgent(this);
        } else
        {
            return (new WebView(this)).getSettings().getUserAgentString();
        }
    }

    protected SurveyInviteView getInviteView(Configuration configuration1, SurveyInviteClickHandler surveyinviteclickhandler)
    {
        configuration = configuration1;
        surveyinviteclickhandler = super.getInviteView(configuration1, surveyinviteclickhandler);
        if (configuration1.shouldUseLocalNotification())
        {
            surveyinviteclickhandler.setBody(stringsProvider.getOnExitLocalNotificationText());
            state = new LocalNotificationInvitedState(null);
            return surveyinviteclickhandler;
        } else
        {
            surveyinviteclickhandler.setBody(stringsProvider.getOnExitInviteText());
            state = new RemoteNotificationInvitedState(null);
            return surveyinviteclickhandler;
        }
    }

    public void onAccept()
    {
        state.onAccept(this, this);
    }

    public void onDecline()
    {
        state.onDecline(this);
    }



/*
    static OnExitDetailsView access$202(OnExitSurveyInviteActivity onexitsurveyinviteactivity, OnExitDetailsView onexitdetailsview)
    {
        onexitsurveyinviteactivity.detailsView = onexitdetailsview;
        return onexitdetailsview;
    }

*/



/*
    static OnExitInviteState access$402(OnExitSurveyInviteActivity onexitsurveyinviteactivity, OnExitInviteState onexitinvitestate)
    {
        onexitsurveyinviteactivity.state = onexitinvitestate;
        return onexitinvitestate;
    }

*/


}
