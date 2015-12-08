// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;


public final class Status extends Enum
{

    private static final Status $VALUES[];
    public static final Status ACCOUNT_DELETED;
    public static final Status ACCOUNT_DISABLED;
    public static final Status ALREADY_HAS_GMAIL;
    public static final Status BAD_AUTHENTICATION;
    public static final Status BAD_PASSWORD;
    public static final Status BAD_REQUEST;
    public static final Status BAD_USERNAME;
    public static final Status CAPTCHA;
    public static final Status CLIENT_LOGIN_DISABLED;
    public static final Status DELETED_GMAIL;
    public static final Status DEVICE_MANAGEMENT_REQUIRED;
    public static final Status DM_ADMIN_BLOCKED;
    public static final Status DM_ADMIN_PENDING_APPROVAL;
    public static final Status DM_DEACTIVATED;
    public static final Status DM_INTERNAL_ERROR;
    public static final Status DM_REQUIRED;
    public static final Status DM_STALE_SYNC_REQUIRED;
    public static final Status DM_SYNC_DISABLED;
    public static final Status EMPTY_CONSUMER_PKG_OR_SIG;
    public static final Status EXISTING_USERNAME;
    public static final Status GPLUS_INTERSTITIAL;
    public static final Status GPLUS_INVALID_CHAR;
    public static final Status GPLUS_NICKNAME;
    public static final Status GPLUS_OTHER;
    public static final Status GPLUS_PROFILE_ERROR;
    public static final Status INTNERNAL_ERROR;
    public static final Status INVALID_SCOPE;
    public static final Status LOGIN_FAIL;
    public static final Status NEEDS_2F;
    public static final Status NEEDS_BROWSER;
    public static final Status NEEDS_POST_SIGN_IN_FLOW;
    public static final Status NEED_PERMISSION;
    public static final Status NETWORK_ERROR;
    public static final Status NOT_LOGGED_IN;
    public static final Status NOT_VERIFIED;
    public static final Status NO_GMAIL;
    public static final Status PERMISSION_DENIED;
    public static final Status REQUEST_DENIED;
    public static final Status SERVER_ERROR;
    public static final Status SERVICE_DISABLED;
    public static final Status SERVICE_UNAVAILABLE;
    public static final Status SOCKET_TIMEOUT;
    public static final Status SUCCESS;
    public static final Status TERMS_NOT_AGREED;
    public static final Status THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED;
    public static final Status UNKNOWN;
    public static final Status UNKNOWN_ERROR;
    public static final Status USERNAME_UNAVAILABLE;
    public static final Status USER_CANCEL;
    private final String gaiaErrorCode;

    private Status(String s, int i, String s1)
    {
        super(s, i);
        gaiaErrorCode = s1;
    }

    public static final Status fromWireCode(String s)
    {
        Status status = null;
        Status astatus[] = values();
        int j = astatus.length;
        for (int i = 0; i < j; i++)
        {
            Status status1 = astatus[i];
            if (status1.gaiaErrorCode.equals(s))
            {
                status = status1;
            }
        }

        return status;
    }

    public static boolean isRetryableError(Status status)
    {
        return NETWORK_ERROR.equals(status) || SERVICE_UNAVAILABLE.equals(status);
    }

    public static boolean isUserRecoverableError(Status status)
    {
label0:
        {
            boolean flag1 = false;
            if (!BAD_AUTHENTICATION.equals(status) && !CAPTCHA.equals(status) && !NEED_PERMISSION.equals(status) && !NEEDS_BROWSER.equals(status) && !USER_CANCEL.equals(status) && !THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(status))
            {
                boolean flag;
                if (DEVICE_MANAGEMENT_REQUIRED.equals(status) || DM_INTERNAL_ERROR.equals(status) || DM_SYNC_DISABLED.equals(status) || DM_ADMIN_BLOCKED.equals(status) || DM_ADMIN_PENDING_APPROVAL.equals(status) || DM_STALE_SYNC_REQUIRED.equals(status) || DM_DEACTIVATED.equals(status) || DM_REQUIRED.equals(status))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    public static Status valueOf(String s)
    {
        return (Status)Enum.valueOf(com/google/android/gms/auth/firstparty/shared/Status, s);
    }

    public static Status[] values()
    {
        return (Status[])$VALUES.clone();
    }

    static 
    {
        CLIENT_LOGIN_DISABLED = new Status("CLIENT_LOGIN_DISABLED", 0, "ClientLoginDisabled");
        DEVICE_MANAGEMENT_REQUIRED = new Status("DEVICE_MANAGEMENT_REQUIRED", 1, "DeviceManagementRequiredOrSyncDisabled");
        SOCKET_TIMEOUT = new Status("SOCKET_TIMEOUT", 2, "SocketTimeout");
        SUCCESS = new Status("SUCCESS", 3, "Ok");
        UNKNOWN_ERROR = new Status("UNKNOWN_ERROR", 4, "UNKNOWN_ERR");
        NETWORK_ERROR = new Status("NETWORK_ERROR", 5, "NetworkError");
        SERVICE_UNAVAILABLE = new Status("SERVICE_UNAVAILABLE", 6, "ServiceUnavailable");
        INTNERNAL_ERROR = new Status("INTNERNAL_ERROR", 7, "InternalError");
        BAD_AUTHENTICATION = new Status("BAD_AUTHENTICATION", 8, "BadAuthentication");
        EMPTY_CONSUMER_PKG_OR_SIG = new Status("EMPTY_CONSUMER_PKG_OR_SIG", 9, "EmptyConsumerPackageOrSig");
        NEEDS_2F = new Status("NEEDS_2F", 10, "InvalidSecondFactor");
        NEEDS_POST_SIGN_IN_FLOW = new Status("NEEDS_POST_SIGN_IN_FLOW", 11, "PostSignInFlowRequired");
        NEEDS_BROWSER = new Status("NEEDS_BROWSER", 12, "NeedsBrowser");
        UNKNOWN = new Status("UNKNOWN", 13, "Unknown");
        NOT_VERIFIED = new Status("NOT_VERIFIED", 14, "NotVerified");
        TERMS_NOT_AGREED = new Status("TERMS_NOT_AGREED", 15, "TermsNotAgreed");
        ACCOUNT_DISABLED = new Status("ACCOUNT_DISABLED", 16, "AccountDisabled");
        CAPTCHA = new Status("CAPTCHA", 17, "CaptchaRequired");
        ACCOUNT_DELETED = new Status("ACCOUNT_DELETED", 18, "AccountDeleted");
        SERVICE_DISABLED = new Status("SERVICE_DISABLED", 19, "ServiceDisabled");
        NEED_PERMISSION = new Status("NEED_PERMISSION", 20, "NeedPermission");
        INVALID_SCOPE = new Status("INVALID_SCOPE", 21, "INVALID_SCOPE");
        USER_CANCEL = new Status("USER_CANCEL", 22, "UserCancel");
        PERMISSION_DENIED = new Status("PERMISSION_DENIED", 23, "PermissionDenied");
        THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED = new Status("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 24, "ThirdPartyDeviceManagementRequired");
        DM_INTERNAL_ERROR = new Status("DM_INTERNAL_ERROR", 25, "DeviceManagementInternalError");
        DM_SYNC_DISABLED = new Status("DM_SYNC_DISABLED", 26, "DeviceManagementSyncDisabled");
        DM_ADMIN_BLOCKED = new Status("DM_ADMIN_BLOCKED", 27, "DeviceManagementAdminBlocked");
        DM_ADMIN_PENDING_APPROVAL = new Status("DM_ADMIN_PENDING_APPROVAL", 28, "DeviceManagementAdminPendingApproval");
        DM_STALE_SYNC_REQUIRED = new Status("DM_STALE_SYNC_REQUIRED", 29, "DeviceManagementStaleSyncRequired");
        DM_DEACTIVATED = new Status("DM_DEACTIVATED", 30, "DeviceManagementDeactivated");
        DM_REQUIRED = new Status("DM_REQUIRED", 31, "DeviceManagementRequired");
        ALREADY_HAS_GMAIL = new Status("ALREADY_HAS_GMAIL", 32, "ALREADY_HAS_GMAIL");
        BAD_PASSWORD = new Status("BAD_PASSWORD", 33, "WeakPassword");
        BAD_REQUEST = new Status("BAD_REQUEST", 34, "BadRequest");
        BAD_USERNAME = new Status("BAD_USERNAME", 35, "BadUsername");
        DELETED_GMAIL = new Status("DELETED_GMAIL", 36, "DeletedGmail");
        EXISTING_USERNAME = new Status("EXISTING_USERNAME", 37, "ExistingUsername");
        LOGIN_FAIL = new Status("LOGIN_FAIL", 38, "LoginFail");
        NOT_LOGGED_IN = new Status("NOT_LOGGED_IN", 39, "NotLoggedIn");
        NO_GMAIL = new Status("NO_GMAIL", 40, "NoGmail");
        REQUEST_DENIED = new Status("REQUEST_DENIED", 41, "RequestDenied");
        SERVER_ERROR = new Status("SERVER_ERROR", 42, "ServerError");
        USERNAME_UNAVAILABLE = new Status("USERNAME_UNAVAILABLE", 43, "UsernameUnavailable");
        GPLUS_OTHER = new Status("GPLUS_OTHER", 44, "GPlusOther");
        GPLUS_NICKNAME = new Status("GPLUS_NICKNAME", 45, "GPlusNickname");
        GPLUS_INVALID_CHAR = new Status("GPLUS_INVALID_CHAR", 46, "GPlusInvalidChar");
        GPLUS_INTERSTITIAL = new Status("GPLUS_INTERSTITIAL", 47, "GPlusInterstitial");
        GPLUS_PROFILE_ERROR = new Status("GPLUS_PROFILE_ERROR", 48, "ProfileUpgradeError");
        $VALUES = (new Status[] {
            CLIENT_LOGIN_DISABLED, DEVICE_MANAGEMENT_REQUIRED, SOCKET_TIMEOUT, SUCCESS, UNKNOWN_ERROR, NETWORK_ERROR, SERVICE_UNAVAILABLE, INTNERNAL_ERROR, BAD_AUTHENTICATION, EMPTY_CONSUMER_PKG_OR_SIG, 
            NEEDS_2F, NEEDS_POST_SIGN_IN_FLOW, NEEDS_BROWSER, UNKNOWN, NOT_VERIFIED, TERMS_NOT_AGREED, ACCOUNT_DISABLED, CAPTCHA, ACCOUNT_DELETED, SERVICE_DISABLED, 
            NEED_PERMISSION, INVALID_SCOPE, USER_CANCEL, PERMISSION_DENIED, THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED, DM_INTERNAL_ERROR, DM_SYNC_DISABLED, DM_ADMIN_BLOCKED, DM_ADMIN_PENDING_APPROVAL, DM_STALE_SYNC_REQUIRED, 
            DM_DEACTIVATED, DM_REQUIRED, ALREADY_HAS_GMAIL, BAD_PASSWORD, BAD_REQUEST, BAD_USERNAME, DELETED_GMAIL, EXISTING_USERNAME, LOGIN_FAIL, NOT_LOGGED_IN, 
            NO_GMAIL, REQUEST_DENIED, SERVER_ERROR, USERNAME_UNAVAILABLE, GPLUS_OTHER, GPLUS_NICKNAME, GPLUS_INVALID_CHAR, GPLUS_INTERSTITIAL, GPLUS_PROFILE_ERROR
        });
    }
}
