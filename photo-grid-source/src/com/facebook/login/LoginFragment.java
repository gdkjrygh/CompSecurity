// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.facebook.login:
//            LoginClient

public class LoginFragment extends Fragment
{

    private static final String EXTRA_REQUEST = "request";
    private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
    static final String RESULT_KEY = "com.facebook.LoginFragment:Result";
    private static final String SAVED_LOGIN_CLIENT = "loginClient";
    private static final String TAG = "LoginActivityFragment";
    private String callingPackage;
    private LoginClient loginClient;
    private LoginClient.Request request;

    public LoginFragment()
    {
    }

    private void onLoginClientCompleted(LoginClient.Result result)
    {
        request = null;
        if (getActivity() == null)
        {
            return;
        }
        Bundle bundle;
        int i;
        if (result.code == LoginClient.Result.Code.CANCEL)
        {
            i = 0;
        } else
        {
            i = -1;
        }
        bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        result = new Intent();
        result.putExtras(bundle);
        getActivity().setResult(i, result);
        getActivity().finish();
    }

    static Bundle populateIntentExtras(LoginClient.Request request1)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request1);
        return bundle;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        loginClient.onActivityResult(i, j, intent);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            loginClient = (LoginClient)bundle.getParcelable("loginClient");
            loginClient.setFragment(this);
        } else
        {
            loginClient = new LoginClient(this);
        }
        if (getActivity() == null || getActivity().getCallingActivity() == null)
        {
            return;
        } else
        {
            callingPackage = getActivity().getCallingActivity().getPackageName();
            request = (LoginClient.Request)getActivity().getIntent().getParcelableExtra("request");
            loginClient.setOnCompletedListener(new _cls1());
            return;
        }
    }

    public View onCreateView(final LayoutInflater view, ViewGroup viewgroup, Bundle bundle)
    {
        view = view.inflate(com.facebook.R.layout.com_facebook_login_fragment, viewgroup, false);
        loginClient.setBackgroundProcessingListener(new _cls2());
        return view;
    }

    public void onDestroy()
    {
        loginClient.cancelCurrentHandler();
        super.onDestroy();
    }

    public void onPause()
    {
        super.onPause();
        getActivity().findViewById(com.facebook.R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
    }

    public void onResume()
    {
        super.onResume();
        if (callingPackage == null)
        {
            Log.e("LoginActivityFragment", "Cannot call LoginActivity with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        } else
        {
            loginClient.startOrContinueAuth(request);
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", loginClient);
    }


    private class _cls1
        implements LoginClient.OnCompletedListener
    {

        final LoginFragment this$0;

        public void onCompleted(LoginClient.Result result)
        {
            onLoginClientCompleted(result);
        }

        _cls1()
        {
            this$0 = LoginFragment.this;
            super();
        }
    }


    private class _cls2
        implements LoginClient.BackgroundProcessingListener
    {

        final LoginFragment this$0;
        final View val$view;

        public void onBackgroundProcessingStarted()
        {
            view.findViewById(com.facebook.R.id.com_facebook_login_activity_progress_bar).setVisibility(0);
        }

        public void onBackgroundProcessingStopped()
        {
            view.findViewById(com.facebook.R.id.com_facebook_login_activity_progress_bar).setVisibility(8);
        }

        _cls2()
        {
            this$0 = LoginFragment.this;
            view = view1;
            super();
        }
    }

}
