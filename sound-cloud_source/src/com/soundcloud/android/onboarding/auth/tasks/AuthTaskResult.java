// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import android.os.Bundle;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.onboarding.auth.SignupVia;
import java.util.EnumSet;

// Referenced classes of package com.soundcloud.android.onboarding.auth.tasks:
//            AuthTaskException

public final class AuthTaskResult
{
    private static final class Kind extends Enum
    {

        private static final Kind $VALUES[];
        public static final Kind DENIED;
        public static final Kind DEVICE_CONFLICT;
        public static final Kind EMAIL_INVALID;
        public static final Kind EMAIL_TAKEN;
        public static final Kind FAILURE;
        public static final Kind FLAKY_SIGNUP_ERROR;
        public static final Kind NETWORK_ERROR;
        public static final Kind SERVER_ERROR;
        public static final Kind SPAM;
        public static final Kind SUCCESS;
        public static final Kind UNAUTHORIZED;
        private static EnumSet UNEXPECTED_ERRORS;
        public static final Kind VALIDATION_ERROR;

        public static Kind valueOf(String s)
        {
            return (Kind)Enum.valueOf(com/soundcloud/android/onboarding/auth/tasks/AuthTaskResult$Kind, s);
        }

        public static Kind[] values()
        {
            return (Kind[])$VALUES.clone();
        }

        public final boolean isUnexpectedError()
        {
            return UNEXPECTED_ERRORS.contains(this);
        }

        static 
        {
            SUCCESS = new Kind("SUCCESS", 0);
            FAILURE = new Kind("FAILURE", 1);
            EMAIL_TAKEN = new Kind("EMAIL_TAKEN", 2);
            SPAM = new Kind("SPAM", 3);
            DENIED = new Kind("DENIED", 4);
            EMAIL_INVALID = new Kind("EMAIL_INVALID", 5);
            FLAKY_SIGNUP_ERROR = new Kind("FLAKY_SIGNUP_ERROR", 6);
            DEVICE_CONFLICT = new Kind("DEVICE_CONFLICT", 7);
            UNAUTHORIZED = new Kind("UNAUTHORIZED", 8);
            NETWORK_ERROR = new Kind("NETWORK_ERROR", 9);
            SERVER_ERROR = new Kind("SERVER_ERROR", 10);
            VALIDATION_ERROR = new Kind("VALIDATION_ERROR", 11);
            $VALUES = (new Kind[] {
                SUCCESS, FAILURE, EMAIL_TAKEN, SPAM, DENIED, EMAIL_INVALID, FLAKY_SIGNUP_ERROR, DEVICE_CONFLICT, UNAUTHORIZED, NETWORK_ERROR, 
                SERVER_ERROR, VALIDATION_ERROR
            });
            UNEXPECTED_ERRORS = EnumSet.of(FAILURE, FLAKY_SIGNUP_ERROR, SERVER_ERROR, VALIDATION_ERROR);
        }

        private Kind(String s, int i)
        {
            super(s, i);
        }
    }


    private final Exception exception;
    private final Kind kind;
    private final Bundle loginBundle;
    private String serverErrorMessage;
    private final boolean showFacebookSuggestions;
    private final SignupVia signupVia;
    private final PublicApiUser user;

    private AuthTaskResult(PublicApiUser publicapiuser, SignupVia signupvia, boolean flag)
    {
        this(Kind.SUCCESS, publicapiuser, signupvia, null, flag, null, null);
    }

    private AuthTaskResult(Kind kind1, PublicApiUser publicapiuser, SignupVia signupvia, Exception exception1, boolean flag, Bundle bundle, String s)
    {
        kind = kind1;
        user = publicapiuser;
        signupVia = signupvia;
        exception = exception1;
        showFacebookSuggestions = flag;
        loginBundle = bundle;
        serverErrorMessage = s;
    }

    private AuthTaskResult(Kind kind1, Exception exception1)
    {
        this(kind1, null, null, exception1, false, null, null);
    }

    private AuthTaskResult(Kind kind1, String s, ApiRequestException apirequestexception)
    {
        this(kind1, null, null, ((Exception) (apirequestexception)), false, null, s);
    }

    private AuthTaskResult(Exception exception1)
    {
        this(Kind.FAILURE, null, null, exception1, false, null, null);
    }

    public static AuthTaskResult denied(ApiRequestException apirequestexception)
    {
        return new AuthTaskResult(Kind.DENIED, apirequestexception);
    }

    public static AuthTaskResult deviceConflict(Bundle bundle)
    {
        return new AuthTaskResult(Kind.DEVICE_CONFLICT, null, null, null, false, bundle, null);
    }

    public static AuthTaskResult emailInvalid(ApiRequestException apirequestexception)
    {
        return new AuthTaskResult(Kind.EMAIL_INVALID, apirequestexception);
    }

    public static AuthTaskResult emailTaken(ApiRequestException apirequestexception)
    {
        return new AuthTaskResult(Kind.EMAIL_TAKEN, apirequestexception);
    }

    public static AuthTaskResult failure(ApiRequestException apirequestexception)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.api.ApiRequestException.Reason[apirequestexception.reason().ordinal()])
        {
        default:
            return new AuthTaskResult(apirequestexception);

        case 1: // '\001'
            return unauthorized(apirequestexception);

        case 2: // '\002'
            return validationError(apirequestexception.errorKey(), apirequestexception);

        case 3: // '\003'
            return networkError((Exception)apirequestexception.getCause());

        case 4: // '\004'
            return serverError(apirequestexception);
        }
    }

    public static AuthTaskResult failure(Exception exception1)
    {
        return new AuthTaskResult(exception1);
    }

    public static AuthTaskResult failure(String s)
    {
        return failure(((Exception) (new AuthTaskException(new String[] {
            s
        }))));
    }

    public static AuthTaskResult failure(String s, ApiRequestException apirequestexception)
    {
        return new AuthTaskResult(Kind.FAILURE, s, apirequestexception);
    }

    public static AuthTaskResult networkError(Exception exception1)
    {
        return new AuthTaskResult(Kind.NETWORK_ERROR, exception1);
    }

    public static AuthTaskResult serverError(ApiRequestException apirequestexception)
    {
        return new AuthTaskResult(Kind.SERVER_ERROR, apirequestexception);
    }

    public static AuthTaskResult signUpFailedToLogin(ApiRequestException apirequestexception)
    {
        return new AuthTaskResult(Kind.FLAKY_SIGNUP_ERROR, apirequestexception);
    }

    public static AuthTaskResult spam(ApiRequestException apirequestexception)
    {
        return new AuthTaskResult(Kind.SPAM, apirequestexception);
    }

    public static AuthTaskResult success(PublicApiUser publicapiuser, SignupVia signupvia, boolean flag)
    {
        return new AuthTaskResult(publicapiuser, signupvia, flag);
    }

    public static AuthTaskResult unauthorized(ApiRequestException apirequestexception)
    {
        return new AuthTaskResult(Kind.UNAUTHORIZED, apirequestexception);
    }

    public static AuthTaskResult validationError(String s, ApiRequestException apirequestexception)
    {
        return new AuthTaskResult(Kind.VALIDATION_ERROR, s, apirequestexception);
    }

    public final Exception getException()
    {
        return exception;
    }

    public final Bundle getLoginBundle()
    {
        return loginBundle;
    }

    public final String getServerErrorMessage()
    {
        return serverErrorMessage;
    }

    public final boolean getShowFacebookSuggestions()
    {
        return showFacebookSuggestions;
    }

    public final SignupVia getSignupVia()
    {
        return signupVia;
    }

    public final PublicApiUser getUser()
    {
        return user;
    }

    public final String toString()
    {
        boolean flag1 = true;
        Kind kind1 = kind;
        SignupVia signupvia;
        Exception exception1;
        boolean flag;
        if (user != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        signupvia = signupVia;
        exception1 = exception;
        if (loginBundle == null)
        {
            flag1 = false;
        }
        return String.format("Auth task result with\n\tkind: %s\n\tuser present: %b\n\tvia: %s\n\texception: %s\n\tbundle present: %b\n\tserver error: %s", new Object[] {
            kind1, Boolean.valueOf(flag), signupvia, exception1, Boolean.valueOf(flag1), serverErrorMessage
        });
    }

    public final boolean wasDenied()
    {
        return kind == Kind.DENIED;
    }

    public final boolean wasDeviceConflict()
    {
        return kind == Kind.DEVICE_CONFLICT;
    }

    public final boolean wasEmailInvalid()
    {
        return kind == Kind.EMAIL_INVALID;
    }

    public final boolean wasEmailTaken()
    {
        return kind == Kind.EMAIL_TAKEN;
    }

    public final boolean wasFailure()
    {
        return kind == Kind.FAILURE;
    }

    public final boolean wasNetworkError()
    {
        return kind == Kind.NETWORK_ERROR;
    }

    public final boolean wasServerError()
    {
        return kind == Kind.SERVER_ERROR;
    }

    public final boolean wasSignUpFailedToLogin()
    {
        return kind == Kind.FLAKY_SIGNUP_ERROR;
    }

    public final boolean wasSpam()
    {
        return kind == Kind.SPAM;
    }

    public final boolean wasSuccess()
    {
        return kind == Kind.SUCCESS;
    }

    public final boolean wasUnauthorized()
    {
        return kind == Kind.UNAUTHORIZED;
    }

    public final boolean wasUnexpectedError()
    {
        return kind.isUnexpectedError();
    }

    public final boolean wasValidationError()
    {
        return kind == Kind.VALIDATION_ERROR;
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[];

        static 
        {
            $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason = new int[com.soundcloud.android.api.ApiRequestException.Reason.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.AUTH_ERROR.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.VALIDATION_ERROR.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.NETWORK_ERROR.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$api$ApiRequestException$Reason[com.soundcloud.android.api.ApiRequestException.Reason.SERVER_ERROR.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
