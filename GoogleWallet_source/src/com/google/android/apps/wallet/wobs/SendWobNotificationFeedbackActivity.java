// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.feedback.Feedback;
import java.util.concurrent.Callable;

public class SendWobNotificationFeedbackActivity extends WalletActivity
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
{

    private static final String TAG = com/google/android/apps/wallet/wobs/SendWobNotificationFeedbackActivity.getSimpleName();
    String accountName;
    ActionExecutor actionExecutor;
    GeofencingServiceDebugInfo debugInfo;
    private GoogleApiClient googleApiClient;

    public SendWobNotificationFeedbackActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    static Intent createIntent(Context context, String s, String s1)
    {
        context = InternalIntents.forClass(context, com/google/android/apps/wallet/wobs/SendWobNotificationFeedbackActivity);
        context.putExtra("wob_instance", s);
        context.putExtra("reason", s1);
        return context;
    }

    public final void doOnCreate(Bundle bundle)
    {
        super.doOnCreate(bundle);
        googleApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(this)).addApi(Feedback.API).addConnectionCallbacks(this).build();
        googleApiClient.connect();
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onConnected(final Bundle context)
    {
        context = getApplicationContext();
        final String wobId = getIntent().getStringExtra("wob_instance");
        final String reason = getIntent().getStringExtra("reason");
        actionExecutor.executeAction(new Callable() {

            final SendWobNotificationFeedbackActivity this$0;
            final Context val$context;
            final String val$wobId;

            private String call()
                throws Exception
            {
                return debugInfo.outputDebugInfo(context, wobId);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = SendWobNotificationFeedbackActivity.this;
                context = context1;
                wobId = s;
                super();
            }
        }, new AsyncCallback() {

            final SendWobNotificationFeedbackActivity this$0;
            final String val$reason;

            private void onSuccess(String s)
            {
                Bundle bundle = new Bundle();
                bundle.putString("geofence_info", s);
                s = (new com.google.android.gms.feedback.FeedbackOptions.Builder()).addPsdBundle(bundle).setAccountInUse(accountName).setCategoryTag("com.google.android.apps.walletnfcrel.WOB_NOTIFICATION_FEEDBACK");
                if (!reason.equals(getResources().getString(com.google.android.apps.walletnfcrel.R.string.wobs_notification_feedback_reason_other)))
                {
                    s.setDescription(reason);
                }
                Feedback.startFeedback(googleApiClient, s.build());
                finish();
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(SendWobNotificationFeedbackActivity.TAG, "Error creating userFeedback.", exception);
                finish();
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((String)obj);
            }

            
            {
                this$0 = SendWobNotificationFeedbackActivity.this;
                reason = s;
                super();
            }
        });
    }

    public final void onConnectionSuspended(int i)
    {
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (googleApiClient != null && (googleApiClient.isConnected() || googleApiClient.isConnecting()))
        {
            googleApiClient.disconnect();
        }
    }

    protected final void onUpPressed()
    {
    }



}
