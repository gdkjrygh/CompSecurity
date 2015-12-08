// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.pin.PinVerifier;

// Referenced classes of package com.netflix.mediaclient.android.activity:
//            NetflixActivity

class this._cls0 extends BroadcastReceiver
{

    final NetflixActivity this$0;

    private void logWithClassName(String s)
    {
        if (Log.isLoggable("NetflixActivity", 3))
        {
            Log.d("NetflixActivity", (new StringBuilder()).append(getClass().getSimpleName()).append(": ").append(s).toString());
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null)
        {
            logWithClassName("Null intent");
            return;
        }
        context = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE".equals(context))
        {
            logWithClassName("User profile activated - restarting app");
            PinVerifier.getInstance().clearState();
            handleProfileActivated();
            return;
        }
        if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE".equals(context))
        {
            logWithClassName("Account deactivated - restarting app");
            handleAccountDeactivated();
            return;
        }
        if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_READY_TO_SELECT".equals(context))
        {
            logWithClassName("Ready to select profile - calling children");
            handleProfileReadyToSelect();
            return;
        }
        if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT".equals(context))
        {
            int i = intent.getIntExtra("com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_INT", 0);
            context = intent.getStringExtra("com.netflix.mediaclient.intent.action.EXTRA_USER_PROFILE_SELECTION_RESULT_STRING");
            logWithClassName((new StringBuilder()).append("Profile selection status: ").append(i).toString());
            handleProfileSelectionResult(i, context);
            return;
        } else
        {
            logWithClassName((new StringBuilder()).append("No action taken for intent: ").append(context).toString());
            return;
        }
    }

    ()
    {
        this$0 = NetflixActivity.this;
        super();
    }
}
