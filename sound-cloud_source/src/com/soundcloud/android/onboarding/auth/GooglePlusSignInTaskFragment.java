// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.auth.a;
import com.google.android.gms.auth.c;
import com.google.android.gms.auth.d;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.onboarding.auth.tasks.AuthTask;
import com.soundcloud.android.onboarding.auth.tasks.AuthTaskResult;
import com.soundcloud.android.onboarding.auth.tasks.GooglePlusSignInTask;
import com.soundcloud.android.utils.ErrorUtils;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthTaskFragment

public class GooglePlusSignInTaskFragment extends AuthTaskFragment
{

    public static final String ARG_ACCT_NAME = "account_name";
    public static final String ARG_REQ_CODE = "request_code";
    private static final String GOOGLE_PLUS_SCOPE = "oauth2:https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/userinfo.email";

    public GooglePlusSignInTaskFragment()
    {
    }

    public static GooglePlusSignInTaskFragment create(Bundle bundle)
    {
        GooglePlusSignInTaskFragment googleplussignintaskfragment = new GooglePlusSignInTaskFragment();
        googleplussignintaskfragment.setArguments(bundle);
        return googleplussignintaskfragment;
    }

    public static Bundle getParams(String s, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", s);
        bundle.putInt("request_code", i);
        return bundle;
    }

    AuthTask createAuthTask()
    {
        return new GooglePlusSignInTask((SoundCloudApplication)getActivity().getApplication(), getArguments().getString("account_name"), "oauth2:https://www.googleapis.com/auth/plus.login https://www.googleapis.com/auth/userinfo.email", configurationOperations, eventBus, accountOperations, tokenUtils, apiClient);
    }

    protected String getErrorFromResult(Activity activity, AuthTaskResult authtaskresult)
    {
        Throwable throwable = ErrorUtils.removeTokenRetrievalException(authtaskresult.getException());
        if (throwable instanceof c)
        {
            GooglePlayServicesUtil.getErrorDialog(((c)throwable).a, activity, 8004).show();
            return null;
        }
        if (throwable instanceof d)
        {
            authtaskresult = (d)throwable;
            if (((d) (authtaskresult)).b == null)
            {
                authtaskresult = null;
            } else
            {
                authtaskresult = new Intent(((d) (authtaskresult)).b);
            }
            activity.startActivityForResult(authtaskresult, getArguments().getInt("request_code"));
            return null;
        }
        if (authtaskresult.wasUnauthorized())
        {
            return activity.getString(0x7f070129);
        }
        if (throwable instanceof a)
        {
            return (new StringBuilder("Unrecoverable error ")).append(throwable.getMessage()).toString();
        } else
        {
            return super.getErrorFromResult(activity, authtaskresult);
        }
    }
}
