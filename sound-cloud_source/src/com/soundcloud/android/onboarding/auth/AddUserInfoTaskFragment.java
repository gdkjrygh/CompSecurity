// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.legacy.InvalidTokenException;
import com.soundcloud.android.onboarding.auth.tasks.AddUserInfoTask;
import com.soundcloud.android.onboarding.auth.tasks.AuthTask;
import com.soundcloud.android.onboarding.auth.tasks.AuthTaskResult;
import com.soundcloud.android.utils.ErrorUtils;
import java.io.File;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AuthTaskFragment

public class AddUserInfoTaskFragment extends AuthTaskFragment
{

    private static final String AVATAR_EXTRA = "avatar";
    private static final String USERNAME_EXTRA = "username";

    public AddUserInfoTaskFragment()
    {
    }

    public static AddUserInfoTaskFragment create(String s, File file)
    {
        Bundle bundle = new Bundle();
        bundle.putString("username", s);
        if (file != null && file.exists())
        {
            bundle.putSerializable("avatar", file.getAbsolutePath());
        }
        s = new AddUserInfoTaskFragment();
        s.setArguments(bundle);
        return s;
    }

    private boolean isLoginCredentialsException(Exception exception)
    {
        return ErrorUtils.removeTokenRetrievalException(exception) instanceof InvalidTokenException;
    }

    AuthTask createAuthTask()
    {
        SoundCloudApplication soundcloudapplication = (SoundCloudApplication)getActivity().getApplication();
        Object obj = accountOperations.getSoundCloudAccount();
        String s = getArguments().getString("username");
        File file;
        if (obj != null)
        {
            obj = ((Account) (obj)).name;
        } else
        {
            obj = s;
        }
        if (getArguments().containsKey("avatar"))
        {
            file = new File(getArguments().getString("avatar"));
        } else
        {
            file = null;
        }
        return new AddUserInfoTask(soundcloudapplication, ((String) (obj)), s, file, userStorage, apiClient, accountOperations);
    }

    protected String getErrorFromResult(Activity activity, AuthTaskResult authtaskresult)
    {
        if (isLoginCredentialsException(authtaskresult.getException()))
        {
            return activity.getString(0x7f070095);
        } else
        {
            return super.getErrorFromResult(activity, authtaskresult);
        }
    }
}
