// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import android.os.Bundle;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.configuration.ConfigurationOperations;
import com.soundcloud.android.configuration.DeviceManagement;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.OnboardingEvent;
import com.soundcloud.android.onboarding.auth.SignupVia;
import com.soundcloud.android.onboarding.auth.TokenInformationGenerator;
import com.soundcloud.android.onboarding.exceptions.AddAccountException;
import com.soundcloud.android.onboarding.exceptions.TokenRetrievalException;
import com.soundcloud.android.storage.LegacyUserStorage;
import com.soundcloud.android.tasks.FetchUserTask;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.onboarding.auth.tasks:
//            AuthTask, AuthTaskResult

public class LoginTask extends AuthTask
{

    static String CONFLICTING_DEVICE_KEY = "conflictingDeviceKey";
    protected final AccountOperations accountOperations;
    private final ConfigurationOperations configurationOperations;
    private final EventBus eventBus;
    private FetchUserTask fetchUserTask;
    protected final TokenInformationGenerator tokenUtils;

    public LoginTask(SoundCloudApplication soundcloudapplication, ConfigurationOperations configurationoperations, EventBus eventbus, AccountOperations accountoperations, TokenInformationGenerator tokeninformationgenerator, ApiClient apiclient)
    {
        this(soundcloudapplication, tokeninformationgenerator, new FetchUserTask(apiclient), new LegacyUserStorage(), configurationoperations, eventbus, accountoperations);
    }

    protected LoginTask(SoundCloudApplication soundcloudapplication, TokenInformationGenerator tokeninformationgenerator, FetchUserTask fetchusertask, LegacyUserStorage legacyuserstorage, ConfigurationOperations configurationoperations, EventBus eventbus, AccountOperations accountoperations)
    {
        super(soundcloudapplication, legacyuserstorage);
        tokenUtils = tokeninformationgenerator;
        fetchUserTask = fetchusertask;
        configurationOperations = configurationoperations;
        eventBus = eventbus;
        accountOperations = accountoperations;
    }

    protected transient AuthTaskResult doInBackground(Bundle abundle[])
    {
        return login(abundle[0]);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Bundle[])aobj);
    }

    protected AuthTaskResult login(Bundle bundle)
    {
        SignupVia signupvia;
        Token token;
        com.soundcloud.android.api.legacy.model.PublicApiUser publicapiuser;
        try
        {
            token = tokenUtils.getToken(bundle);
            Object obj = bundle.getString(CONFLICTING_DEVICE_KEY);
            if (Strings.isBlank(((CharSequence) (obj))))
            {
                obj = configurationOperations.registerDevice(token);
                if (((DeviceManagement) (obj)).isNotAuthorized())
                {
                    bundle.putString(CONFLICTING_DEVICE_KEY, ((DeviceManagement) (obj)).getConflictingDeviceId());
                    return AuthTaskResult.deviceConflict(bundle);
                }
            } else
            if (configurationOperations.forceRegisterDevice(token, ((String) (obj))).isNotAuthorized())
            {
                return AuthTaskResult.failure(getString(0x7f07012c));
            }
            accountOperations.updateToken(token);
            publicapiuser = fetchUserTask.currentUser();
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            ErrorUtils.log(4, "ScOnboarding", (new StringBuilder("error logging in: ")).append(bundle.getMessage()).toString());
            return AuthTaskResult.failure(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            ErrorUtils.log(4, "ScOnboarding", (new StringBuilder("error retrieving SC API token: ")).append(bundle.getMessage()).toString());
            return AuthTaskResult.failure(new TokenRetrievalException(bundle));
        }
        if (publicapiuser != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        return AuthTaskResult.failure(getString(0x7f07008e));
        if (token.getSignup() != null)
        {
            signupvia = SignupVia.fromString(token.getSignup());
        } else
        {
            signupvia = SignupVia.NONE;
        }
        if (!addAccount(publicapiuser, token, signupvia).booleanValue())
        {
            ErrorUtils.handleSilentException(new AddAccountException());
            return AuthTaskResult.failure(getString(0x7f070094));
        }
        eventBus.publish(EventQueue.ONBOARDING, OnboardingEvent.authComplete());
        bundle = AuthTaskResult.success(publicapiuser, signupvia, tokenUtils.isFromFacebook(bundle));
        return bundle;
    }

}
