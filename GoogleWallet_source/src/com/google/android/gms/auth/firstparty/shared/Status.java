// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;


public final class Status extends Enum
{

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
    public static final Status EXISTING_USERNAME;
    public static String EXTRA_KEY_STATUS = "Error";
    public static final Status GPLUS_INTERSTITIAL;
    public static final Status GPLUS_INVALID_CHAR;
    public static final Status GPLUS_NICKNAME;
    public static final Status GPLUS_OTHER;
    public static final Status GPLUS_PROFILE_ERROR;
    public static final Status INVALID_SCOPE;
    private static final Status IP[];
    public static String JSON_KEY_STATUS = "status";
    public static final Status LOGIN_FAIL;
    public static final Status NEEDS_2F;
    public static final Status NEEDS_BROWSER;
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
    public static final Status UNKNOWN;
    public static final Status UNKNOWN_ERROR;
    public static final Status USERNAME_UNAVAILABLE;
    public static final Status USER_CANCEL;
    private final String IO;

    private Status(String s, int i, String s1)
    {
        super(s, i);
        IO = s1;
    }

    public static Status valueOf(String s)
    {
        return (Status)Enum.valueOf(com/google/android/gms/auth/firstparty/shared/Status, s);
    }

    public static Status[] values()
    {
        return (Status[])IP.clone();
    }

    public final String getWire()
    {
        return IO;
    }

    static 
    {
        SUCCESS = new Status("SUCCESS", 0, "Ok");
        BAD_AUTHENTICATION = new Status("BAD_AUTHENTICATION", 1, "BadAuthentication");
        NEEDS_2F = new Status("NEEDS_2F", 2, "InvalidSecondFactor");
        NOT_VERIFIED = new Status("NOT_VERIFIED", 3, "NotVerified");
        TERMS_NOT_AGREED = new Status("TERMS_NOT_AGREED", 4, "TermsNotAgreed");
        UNKNOWN = new Status("UNKNOWN", 5, "Unknown");
        UNKNOWN_ERROR = new Status("UNKNOWN_ERROR", 6, "UNKNOWN_ERR");
        ACCOUNT_DELETED = new Status("ACCOUNT_DELETED", 7, "AccountDeleted");
        ACCOUNT_DISABLED = new Status("ACCOUNT_DISABLED", 8, "AccountDisabled");
        SERVICE_DISABLED = new Status("SERVICE_DISABLED", 9, "ServiceDisabled");
        SERVICE_UNAVAILABLE = new Status("SERVICE_UNAVAILABLE", 10, "ServiceUnavailable");
        CAPTCHA = new Status("CAPTCHA", 11, "CaptchaRequired");
        NETWORK_ERROR = new Status("NETWORK_ERROR", 12, "NetworkError");
        USER_CANCEL = new Status("USER_CANCEL", 13, "UserCancel");
        PERMISSION_DENIED = new Status("PERMISSION_DENIED", 14, "PermissionDenied");
        DEVICE_MANAGEMENT_REQUIRED = new Status("DEVICE_MANAGEMENT_REQUIRED", 15, "DeviceManagementRequiredOrSyncDisabled");
        DM_INTERNAL_ERROR = new Status("DM_INTERNAL_ERROR", 16, "DeviceManagementInternalError");
        DM_SYNC_DISABLED = new Status("DM_SYNC_DISABLED", 17, "DeviceManagementSyncDisabled");
        DM_ADMIN_BLOCKED = new Status("DM_ADMIN_BLOCKED", 18, "DeviceManagementAdminBlocked");
        DM_ADMIN_PENDING_APPROVAL = new Status("DM_ADMIN_PENDING_APPROVAL", 19, "DeviceManagementAdminPendingApproval");
        DM_STALE_SYNC_REQUIRED = new Status("DM_STALE_SYNC_REQUIRED", 20, "DeviceManagementStaleSyncRequired");
        DM_DEACTIVATED = new Status("DM_DEACTIVATED", 21, "DeviceManagementDeactivated");
        DM_REQUIRED = new Status("DM_REQUIRED", 22, "DeviceManagementRequired");
        CLIENT_LOGIN_DISABLED = new Status("CLIENT_LOGIN_DISABLED", 23, "ClientLoginDisabled");
        NEED_PERMISSION = new Status("NEED_PERMISSION", 24, "NeedPermission");
        BAD_PASSWORD = new Status("BAD_PASSWORD", 25, "WeakPassword");
        ALREADY_HAS_GMAIL = new Status("ALREADY_HAS_GMAIL", 26, "ALREADY_HAS_GMAIL");
        BAD_REQUEST = new Status("BAD_REQUEST", 27, "BadRequest");
        BAD_USERNAME = new Status("BAD_USERNAME", 28, "BadUsername");
        LOGIN_FAIL = new Status("LOGIN_FAIL", 29, "LoginFail");
        NOT_LOGGED_IN = new Status("NOT_LOGGED_IN", 30, "NotLoggedIn");
        NO_GMAIL = new Status("NO_GMAIL", 31, "NoGmail");
        REQUEST_DENIED = new Status("REQUEST_DENIED", 32, "RequestDenied");
        SERVER_ERROR = new Status("SERVER_ERROR", 33, "ServerError");
        USERNAME_UNAVAILABLE = new Status("USERNAME_UNAVAILABLE", 34, "UsernameUnavailable");
        DELETED_GMAIL = new Status("DELETED_GMAIL", 35, "DeletedGmail");
        SOCKET_TIMEOUT = new Status("SOCKET_TIMEOUT", 36, "SocketTimeout");
        EXISTING_USERNAME = new Status("EXISTING_USERNAME", 37, "ExistingUsername");
        NEEDS_BROWSER = new Status("NEEDS_BROWSER", 38, "NeedsBrowser");
        GPLUS_OTHER = new Status("GPLUS_OTHER", 39, "GPlusOther");
        GPLUS_NICKNAME = new Status("GPLUS_NICKNAME", 40, "GPlusNickname");
        GPLUS_INVALID_CHAR = new Status("GPLUS_INVALID_CHAR", 41, "GPlusInvalidChar");
        GPLUS_INTERSTITIAL = new Status("GPLUS_INTERSTITIAL", 42, "GPlusInterstitial");
        GPLUS_PROFILE_ERROR = new Status("GPLUS_PROFILE_ERROR", 43, "ProfileUpgradeError");
        INVALID_SCOPE = new Status("INVALID_SCOPE", 44, "INVALID_SCOPE");
        IP = (new Status[] {
            SUCCESS, BAD_AUTHENTICATION, NEEDS_2F, NOT_VERIFIED, TERMS_NOT_AGREED, UNKNOWN, UNKNOWN_ERROR, ACCOUNT_DELETED, ACCOUNT_DISABLED, SERVICE_DISABLED, 
            SERVICE_UNAVAILABLE, CAPTCHA, NETWORK_ERROR, USER_CANCEL, PERMISSION_DENIED, DEVICE_MANAGEMENT_REQUIRED, DM_INTERNAL_ERROR, DM_SYNC_DISABLED, DM_ADMIN_BLOCKED, DM_ADMIN_PENDING_APPROVAL, 
            DM_STALE_SYNC_REQUIRED, DM_DEACTIVATED, DM_REQUIRED, CLIENT_LOGIN_DISABLED, NEED_PERMISSION, BAD_PASSWORD, ALREADY_HAS_GMAIL, BAD_REQUEST, BAD_USERNAME, LOGIN_FAIL, 
            NOT_LOGGED_IN, NO_GMAIL, REQUEST_DENIED, SERVER_ERROR, USERNAME_UNAVAILABLE, DELETED_GMAIL, SOCKET_TIMEOUT, EXISTING_USERNAME, NEEDS_BROWSER, GPLUS_OTHER, 
            GPLUS_NICKNAME, GPLUS_INVALID_CHAR, GPLUS_INTERSTITIAL, GPLUS_PROFILE_ERROR, INVALID_SCOPE
        });
    }
}
