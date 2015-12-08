// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

// Referenced classes of package com.google.android.gms.googlehelp:
//            Help, GoogleHelp, GoogleHelpApi

public final class GoogleHelpLauncher
{

    public final Activity mActivity;
    public final GoogleApiClient mApiClient;

    public GoogleHelpLauncher(Activity activity)
    {
        this(activity, (new com.google.android.gms.common.api.GoogleApiClient.Builder(activity)).addApi(Help.API).build());
    }

    private GoogleHelpLauncher(Activity activity, GoogleApiClient googleapiclient)
    {
        mActivity = activity;
        mApiClient = googleapiclient;
    }

    public final void handlePlayServicesUnavailable(int i, Intent intent)
    {
        boolean flag = false;
        intent = (GoogleHelp)intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
        intent = (new Intent("android.intent.action.VIEW")).setData(((GoogleHelp) (intent)).mFallbackSupportUri);
        if (i != 7)
        {
            if (mActivity.getPackageManager().queryIntentActivities(intent, 0).size() > 0)
            {
                flag = true;
            }
            if (flag)
            {
                mActivity.startActivity(intent);
                return;
            }
        }
        GooglePlayServicesUtil.showErrorDialogFragment$70a48c07(i, mActivity);
    }

    // Unreferenced inner class com/google/android/gms/googlehelp/GoogleHelpLauncher$1

/* anonymous class */
    public final class _cls1
        implements Help.HelpApiInvokeListener
    {

        final GoogleHelpLauncher this$0;
        final Intent val$helpIntent;

        public final PendingResult onGoogleApiClientConnected$3946365()
        {
            return Help.GoogleHelpApi.startHelp(mApiClient, mActivity, helpIntent);
        }

        public final void onInvokeFailed()
        {
            handlePlayServicesUnavailable(16, helpIntent);
        }

            public 
            {
                this$0 = GoogleHelpLauncher.this;
                helpIntent = intent;
                super();
            }
    }

}
