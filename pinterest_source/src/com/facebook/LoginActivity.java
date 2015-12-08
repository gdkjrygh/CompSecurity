// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

// Referenced classes of package com.facebook:
//            AuthorizationClient

public class LoginActivity extends Activity
{

    private static final String EXTRA_REQUEST = "request";
    private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
    static final String RESULT_KEY = "com.facebook.LoginActivity:Result";
    private static final String SAVED_AUTH_CLIENT = "authorizationClient";
    private static final String SAVED_CALLING_PKG_KEY = "callingPackage";
    private static final String TAG = com/facebook/LoginActivity.getName();
    private AuthorizationClient authorizationClient;
    private String callingPackage;
    private AuthorizationClient.AuthorizationRequest request;

    public LoginActivity()
    {
    }

    private void onAuthClientCompleted(AuthorizationClient.Result result)
    {
        request = null;
        Bundle bundle;
        int i;
        if (result.code == AuthorizationClient.Result.Code.CANCEL)
        {
            i = 0;
        } else
        {
            i = -1;
        }
        bundle = new Bundle();
        bundle.putSerializable("com.facebook.LoginActivity:Result", result);
        result = new Intent();
        result.putExtras(bundle);
        setResult(i, result);
        finish();
    }

    static Bundle populateIntentExtras(AuthorizationClient.AuthorizationRequest authorizationrequest)
    {
        Bundle bundle = new Bundle();
        bundle.putSerializable("request", authorizationrequest);
        return bundle;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        authorizationClient.onActivityResult(i, j, intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.facebook.android.R.layout.com_facebook_login_activity_layout);
        if (bundle != null)
        {
            callingPackage = bundle.getString("callingPackage");
            authorizationClient = (AuthorizationClient)bundle.getSerializable("authorizationClient");
        } else
        {
            callingPackage = getCallingPackage();
            authorizationClient = new AuthorizationClient();
            request = (AuthorizationClient.AuthorizationRequest)getIntent().getSerializableExtra("request");
        }
        authorizationClient.setContext(this);
        authorizationClient.setOnCompletedListener(new _cls1());
        authorizationClient.setBackgroundProcessingListener(new _cls2());
    }

    public void onPause()
    {
        super.onPause();
        authorizationClient.cancelCurrentHandler();
        findViewById(com.facebook.android.R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
    }

    public void onResume()
    {
        super.onResume();
        if (callingPackage == null)
        {
            Log.e(TAG, "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            finish();
            return;
        } else
        {
            authorizationClient.startOrContinueAuth(request);
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("callingPackage", callingPackage);
        bundle.putSerializable("authorizationClient", authorizationClient);
    }



    private class _cls1
        implements AuthorizationClient.OnCompletedListener
    {

        final LoginActivity this$0;

        public void onCompleted(AuthorizationClient.Result result)
        {
            onAuthClientCompleted(result);
        }

        _cls1()
        {
            this$0 = LoginActivity.this;
            super();
        }
    }


    private class _cls2
        implements AuthorizationClient.BackgroundProcessingListener
    {

        final LoginActivity this$0;

        public void onBackgroundProcessingStarted()
        {
            findViewById(com.facebook.android.R.id.com_facebook_login_activity_progress_bar).setVisibility(0);
        }

        public void onBackgroundProcessingStopped()
        {
            findViewById(com.facebook.android.R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
        }

        _cls2()
        {
            this$0 = LoginActivity.this;
            super();
        }
    }

}
