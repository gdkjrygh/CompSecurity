// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.feedback.Feedback;

public class SendFeedbackActivity extends WalletActivity
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks
{

    private GoogleApiClient googleApiClient;

    public SendFeedbackActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    static Intent createIntent(Context context, String s)
    {
        context = InternalIntents.forClass(context, com/google/android/apps/wallet/wobs/upload/SendFeedbackActivity);
        context.putExtra("log_message", s);
        return context;
    }

    public final void doOnCreate(Bundle bundle)
    {
        googleApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(this)).addApi(Feedback.API).addConnectionCallbacks(this).build();
        googleApiClient.connect();
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onConnected(Bundle bundle)
    {
        String s;
        if (getIntent().hasExtra("log_message"))
        {
            s = getIntent().getStringExtra("log_message");
        } else
        {
            s = "";
        }
        bundle.putString("log_message", s);
        bundle = (new com.google.android.gms.feedback.FeedbackOptions.Builder()).addPsdBundle(bundle).setCategoryTag("com.google.android.apps.walletnfcrel.IMAGE_UPLOAD").build();
        Feedback.startFeedback(googleApiClient, bundle);
        finish();
    }

    public final void onConnectionSuspended(int i)
    {
    }

    public void onDestroy()
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
