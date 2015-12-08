// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.onboarding.auth.SignupVia;
import com.soundcloud.android.onboarding.auth.TokenInformationGenerator;
import com.soundcloud.android.onboarding.exceptions.TokenRetrievalException;
import com.soundcloud.android.profile.BirthdayInfo;
import com.soundcloud.android.storage.LegacyUserStorage;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.onboarding.auth.tasks:
//            AuthTask, AuthTaskResult

public class SignupTask extends AuthTask
{

    public static final String KEY_BIRTHDAY = "birthday";
    public static final String KEY_GENDER = "gender";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_USERNAME = "username";
    private ApiClient apiClient;
    private TokenInformationGenerator tokenUtils;

    public SignupTask(SoundCloudApplication soundcloudapplication, LegacyUserStorage legacyuserstorage, TokenInformationGenerator tokeninformationgenerator, ApiClient apiclient)
    {
        super(soundcloudapplication, legacyuserstorage);
        tokenUtils = tokeninformationgenerator;
        apiClient = apiclient;
    }

    private AuthTaskResult handleError(ApiRequestException apirequestexception)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.api.ApiRequestException.Reason[apirequestexception.reason().ordinal()])
        {
        default:
            return AuthTaskResult.failure(getString(0x7f0700a0), apirequestexception);

        case 1: // '\001'
            return handleUnprocessableEntity(apirequestexception.errorCode(), apirequestexception);

        case 2: // '\002'
            return AuthTaskResult.denied(apirequestexception);

        case 3: // '\003'
            return AuthTaskResult.failure(getString(0x7f07012c), apirequestexception);
        }
    }

    private AuthTaskResult handleUnprocessableEntity(int i, ApiRequestException apirequestexception)
    {
        switch (i)
        {
        default:
            return AuthTaskResult.failure(getString(0x7f0700a0), apirequestexception);

        case 101: // 'e'
            return AuthTaskResult.emailTaken(apirequestexception);

        case 102: // 'f'
            return AuthTaskResult.denied(apirequestexception);

        case 103: // 'g'
            return AuthTaskResult.spam(apirequestexception);

        case 104: // 'h'
            return AuthTaskResult.emailInvalid(apirequestexception);

        case 105: // 'i'
            return AuthTaskResult.failure(getString(0x7f070088), apirequestexception);
        }
    }

    private Map signupParameters(Bundle bundle)
    {
        BirthdayInfo birthdayinfo = (BirthdayInfo)bundle.getSerializable("birthday");
        ArrayMap arraymap = new ArrayMap(7);
        arraymap.put("user[email]", bundle.getString("username"));
        arraymap.put("user[password]", bundle.getString("password"));
        arraymap.put("user[password_confirmation]", bundle.getString("password"));
        arraymap.put("user[terms_of_use]", "1");
        bundle = bundle.getString("gender");
        if (bundle != null)
        {
            arraymap.put("user[gender]", bundle);
        }
        arraymap.put("user[date_of_birth][month]", String.valueOf(birthdayinfo.getMonth()));
        arraymap.put("user[date_of_birth][year]", String.valueOf(birthdayinfo.getYear()));
        return arraymap;
    }

    protected transient AuthTaskResult doInBackground(Bundle abundle[])
    {
        SoundCloudApplication soundcloudapplication = getSoundCloudApplication();
        AuthTaskResult authtaskresult1 = doSignup(abundle[0]);
        AuthTaskResult authtaskresult = authtaskresult1;
        if (!authtaskresult1.wasSuccess())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        try
        {
            abundle = tokenUtils.getToken(abundle[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle abundle[])
        {
            return AuthTaskResult.signUpFailedToLogin(abundle);
        }
        if (abundle == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        authtaskresult = authtaskresult1;
        if (soundcloudapplication.addUserAccountAndEnableSync(authtaskresult1.getUser(), abundle, SignupVia.API))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        authtaskresult = AuthTaskResult.failure(soundcloudapplication.getString(0x7f0700a0));
        return authtaskresult;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Bundle[])aobj);
    }

    AuthTaskResult doSignup(Bundle bundle)
    {
        try
        {
            bundle = ApiRequest.post(ApiEndpoints.LEGACY_USERS.path()).forPublicApi().withFormMap(signupParameters(bundle)).withToken(tokenUtils.verifyScopes(new String[] {
                "signup"
            })).build();
            bundle = AuthTaskResult.success((PublicApiUser)apiClient.fetchMappedResponse(bundle, com/soundcloud/android/api/legacy/model/PublicApiUser), SignupVia.API, false);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return AuthTaskResult.failure(getString(0x7f0701ec));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return AuthTaskResult.failure(getString(0x7f0700a0));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return handleError(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return AuthTaskResult.failure(bundle);
        }
        return bundle;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[];

        static 
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason = new int[com.soundcloud.android.api.ApiRequestException.Reason.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.VALIDATION_ERROR.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.NOT_ALLOWED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.SERVER_ERROR.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
