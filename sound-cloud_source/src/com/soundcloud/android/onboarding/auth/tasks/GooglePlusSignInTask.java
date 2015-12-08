// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import android.os.Bundle;
import android.text.TextUtils;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.configuration.ConfigurationOperations;
import com.soundcloud.android.onboarding.auth.TokenInformationGenerator;
import com.soundcloud.android.onboarding.exceptions.TokenRetrievalException;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.android.tasks.FetchUserTask;
import com.soundcloud.rx.eventbus.EventBus;
import java.io.IOException;

// Referenced classes of package com.soundcloud.android.onboarding.auth.tasks:
//            LoginTask, AuthTaskResult

public class GooglePlusSignInTask extends LoginTask
{

    private static final String ADD_ACTIVITY = "http://schemas.google.com/AddActivity";
    private static final String CREATE_ACTIVITY = "http://schemas.google.com/CreateActivity";
    private static final String LISTEN_ACTIVITY = "http://schemas.google.com/ListenActivity";
    private static final String REQUEST_ACTIVITIES[] = {
        "http://schemas.google.com/AddActivity", "http://schemas.google.com/CreateActivity", "http://schemas.google.com/ListenActivity"
    };
    protected String accountName;
    private Bundle extras;
    protected String scope;

    public GooglePlusSignInTask(SoundCloudApplication soundcloudapplication, String s, String s1, ConfigurationOperations configurationoperations, EventBus eventbus, AccountOperations accountoperations, TokenInformationGenerator tokeninformationgenerator, 
            ApiClient apiclient)
    {
        this(soundcloudapplication, s, s1, tokeninformationgenerator, new FetchUserTask(apiclient), new LegacyUserStorage(), accountoperations, configurationoperations, eventbus);
    }

    protected GooglePlusSignInTask(SoundCloudApplication soundcloudapplication, String s, String s1, TokenInformationGenerator tokeninformationgenerator, FetchUserTask fetchusertask, LegacyUserStorage legacyuserstorage, AccountOperations accountoperations, 
            ConfigurationOperations configurationoperations, EventBus eventbus)
    {
        super(soundcloudapplication, tokeninformationgenerator, fetchusertask, legacyuserstorage, configurationoperations, eventbus, accountoperations);
        accountName = s;
        scope = s1;
        extras = new Bundle();
        extras.putString("request_visible_actions", TextUtils.join(" ", REQUEST_ACTIVITIES));
    }

    protected transient AuthTaskResult doInBackground(Bundle abundle[])
    {
        boolean flag;
        int i;
        abundle = null;
        i = 2;
        flag = false;
_L2:
        byte byte0;
        byte byte1;
        if (i <= 0 || flag)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = flag;
        byte1 = flag;
        String s2 = accountOperations.getGoogleAccountToken(accountName, scope, extras);
        byte0 = flag;
        byte1 = flag;
        AuthTaskResult authtaskresult = login(s2);
        byte0 = flag;
        byte1 = flag;
        if (!(authtaskresult.getException() instanceof TokenRetrievalException))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        byte1 = i;
        byte0 = flag;
        abundle = authtaskresult;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        byte0 = flag;
        byte1 = flag;
        accountOperations.invalidateGoogleAccountToken(s2);
        abundle = authtaskresult;
        byte0 = flag;
        byte1 = i;
_L3:
        i = byte1 - 1;
        flag = byte0;
        if (true) goto _L2; else goto _L1
        abundle;
        String s = SoundCloudApplication.TAG;
        abundle = AuthTaskResult.networkError(abundle);
        byte1 = 0;
          goto _L3
        abundle;
        String s1 = SoundCloudApplication.TAG;
        abundle = AuthTaskResult.failure(abundle);
        byte0 = byte1;
        byte1 = 0;
          goto _L3
_L1:
        return abundle;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Bundle[])aobj);
    }

    protected AuthTaskResult login(String s)
    {
        return login(tokenUtils.getGrantBundle("urn:soundcloud:oauth2:grant-type:google_plus&access_token=", s));
    }

}
