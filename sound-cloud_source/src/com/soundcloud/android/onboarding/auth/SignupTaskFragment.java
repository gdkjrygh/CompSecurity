// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.onboarding.auth.tasks.AuthTask;
import com.soundcloud.android.onboarding.auth.tasks.AuthTaskResult;
import com.soundcloud.android.onboarding.auth.tasks.LoginTask;
import com.soundcloud.android.onboarding.auth.tasks.SignupTask;
import com.soundcloud.android.profile.BirthdayInfo;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthTaskFragment

public class SignupTaskFragment extends AuthTaskFragment
{

    private static final long DELAY_BEFORE_RETRY;
    private static final int MAX_LOGIN_RETRY = 3;
    private final Handler handler = new Handler();
    private final Runnable loginOperation = new _cls1();
    private int remainingLoginTries;

    public SignupTaskFragment()
    {
        remainingLoginTries = 0;
    }

    public static SignupTaskFragment create(Bundle bundle)
    {
        SignupTaskFragment signuptaskfragment = new SignupTaskFragment();
        signuptaskfragment.setArguments(bundle);
        return signuptaskfragment;
    }

    private LoginTask getLoginTask()
    {
        LoginTask logintask = new LoginTask((SoundCloudApplication)getActivity().getApplication(), configurationOperations, eventBus, accountOperations, tokenUtils, apiClient);
        logintask.setTaskOwner(this);
        return logintask;
    }

    public static Bundle getParams(String s, String s1, BirthdayInfo birthdayinfo, String s2)
    {
        Bundle bundle = new Bundle();
        bundle.putString("username", s);
        bundle.putString("password", s1);
        bundle.putSerializable("birthday", birthdayinfo);
        bundle.putString("gender", s2);
        return bundle;
    }

    private void retryToLogin()
    {
        remainingLoginTries = remainingLoginTries - 1;
        handler.postDelayed(loginOperation, DELAY_BEFORE_RETRY);
    }

    private void setRetryToLogin(int i)
    {
        remainingLoginTries = i;
    }

    private boolean shouldRetryLogin(AuthTaskResult authtaskresult)
    {
        return !authtaskresult.wasSuccess() && remainingLoginTries > 0;
    }

    AuthTask createAuthTask()
    {
        return new SignupTask((SoundCloudApplication)getActivity().getApplication(), userStorage, tokenUtils, apiClient);
    }

    public void onTaskResult(AuthTaskResult authtaskresult)
    {
        if (authtaskresult.wasSignUpFailedToLogin())
        {
            setRetryToLogin(3);
        }
        if (shouldRetryLogin(authtaskresult))
        {
            retryToLogin();
            return;
        } else
        {
            setRetryToLogin(0);
            super.onTaskResult(authtaskresult);
            return;
        }
    }

    static 
    {
        DELAY_BEFORE_RETRY = TimeUnit.SECONDS.toMillis(5L);
    }


    private class _cls1
        implements Runnable
    {

        final SignupTaskFragment this$0;

        public void run()
        {
            getLoginTask().executeOnThreadPool(new Bundle[] {
                getArguments()
            });
        }

        _cls1()
        {
            this$0 = SignupTaskFragment.this;
            super();
        }
    }

}
