// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.onboarding.auth.tasks.AuthTask;
import com.soundcloud.android.onboarding.auth.tasks.AuthTaskResult;
import com.soundcloud.android.onboarding.auth.tasks.LoginTask;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthTaskFragment

public class LoginTaskFragment extends AuthTaskFragment
{

    private static final String PASSWORD_EXTRA = "password";
    private static final String USERNAME_EXTRA = "username";

    public LoginTaskFragment()
    {
    }

    public static LoginTaskFragment create(Bundle bundle)
    {
        LoginTaskFragment logintaskfragment = new LoginTaskFragment();
        logintaskfragment.setArguments(bundle);
        return logintaskfragment;
    }

    public static LoginTaskFragment create(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("username", s);
        bundle.putString("password", s1);
        return create(bundle);
    }

    AuthTask createAuthTask()
    {
        return new LoginTask((SoundCloudApplication)getActivity().getApplication(), configurationOperations, eventBus, accountOperations, tokenUtils, apiClient);
    }

    protected String getErrorFromResult(Activity activity, AuthTaskResult authtaskresult)
    {
        if (authtaskresult.wasUnauthorized())
        {
            return activity.getString(0x7f070095);
        } else
        {
            return super.getErrorFromResult(activity, authtaskresult);
        }
    }
}
