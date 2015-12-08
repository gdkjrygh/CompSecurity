// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzjo extends Enum
{

    public static final zzjo zzHA;
    public static final zzjo zzHB;
    public static final zzjo zzHC;
    public static final zzjo zzHD;
    public static final zzjo zzHE;
    public static final zzjo zzHF;
    public static final zzjo zzHG;
    public static final zzjo zzHH;
    public static final zzjo zzHI;
    public static final zzjo zzHJ;
    public static final zzjo zzHK;
    public static final zzjo zzHL;
    public static final zzjo zzHM;
    public static final zzjo zzHN;
    public static final zzjo zzHO;
    public static final zzjo zzHP;
    public static final zzjo zzHQ;
    public static final zzjo zzHR;
    public static final zzjo zzHS;
    public static final zzjo zzHT;
    public static final zzjo zzHU;
    public static final zzjo zzHV;
    public static final zzjo zzHW;
    public static final zzjo zzHX;
    public static final zzjo zzHY;
    public static final zzjo zzHZ;
    public static final zzjo zzHn;
    public static final zzjo zzHo;
    public static final zzjo zzHp;
    public static final zzjo zzHq;
    public static final zzjo zzHr;
    public static final zzjo zzHs;
    public static final zzjo zzHt;
    public static final zzjo zzHu;
    public static final zzjo zzHv;
    public static final zzjo zzHw;
    public static final zzjo zzHx;
    public static final zzjo zzHy;
    public static final zzjo zzHz;
    public static final zzjo zzIa;
    public static final zzjo zzIb;
    public static final zzjo zzIc;
    public static final zzjo zzId;
    public static final zzjo zzIe;
    public static final zzjo zzIf;
    public static final zzjo zzIg;
    public static final zzjo zzIh;
    public static String zzIi = "Error";
    public static String zzIj = "status";
    private static final zzjo zzIl[];
    private final String zzIk;

    private zzjo(String s, int i, String s1)
    {
        super(s, i);
        zzIk = s1;
    }

    public static zzjo valueOf(String s)
    {
        return (zzjo)Enum.valueOf(com/google/android/gms/internal/zzjo, s);
    }

    public static zzjo[] values()
    {
        return (zzjo[])zzIl.clone();
    }

    public final String zzhg()
    {
        return zzIk;
    }

    static 
    {
        zzHn = new zzjo("SUCCESS", 0, "Ok");
        zzHo = new zzjo("BAD_AUTHENTICATION", 1, "BadAuthentication");
        zzHp = new zzjo("NEEDS_2F", 2, "InvalidSecondFactor");
        zzHq = new zzjo("NEEDS_POST_SIGN_IN_FLOW", 3, "PostSignInFlowRequired");
        zzHr = new zzjo("NOT_VERIFIED", 4, "NotVerified");
        zzHs = new zzjo("TERMS_NOT_AGREED", 5, "TermsNotAgreed");
        zzHt = new zzjo("UNKNOWN", 6, "Unknown");
        zzHu = new zzjo("UNKNOWN_ERROR", 7, "UNKNOWN_ERR");
        zzHv = new zzjo("ACCOUNT_DELETED", 8, "AccountDeleted");
        zzHw = new zzjo("ACCOUNT_DISABLED", 9, "AccountDisabled");
        zzHx = new zzjo("SERVICE_DISABLED", 10, "ServiceDisabled");
        zzHy = new zzjo("SERVICE_UNAVAILABLE", 11, "ServiceUnavailable");
        zzHz = new zzjo("CAPTCHA", 12, "CaptchaRequired");
        zzHA = new zzjo("NETWORK_ERROR", 13, "NetworkError");
        zzHB = new zzjo("USER_CANCEL", 14, "UserCancel");
        zzHC = new zzjo("PERMISSION_DENIED", 15, "PermissionDenied");
        zzHD = new zzjo("DEVICE_MANAGEMENT_REQUIRED", 16, "DeviceManagementRequiredOrSyncDisabled");
        zzHE = new zzjo("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 17, "ThirdPartyDeviceManagementRequired");
        zzHF = new zzjo("DM_INTERNAL_ERROR", 18, "DeviceManagementInternalError");
        zzHG = new zzjo("DM_SYNC_DISABLED", 19, "DeviceManagementSyncDisabled");
        zzHH = new zzjo("DM_ADMIN_BLOCKED", 20, "DeviceManagementAdminBlocked");
        zzHI = new zzjo("DM_ADMIN_PENDING_APPROVAL", 21, "DeviceManagementAdminPendingApproval");
        zzHJ = new zzjo("DM_STALE_SYNC_REQUIRED", 22, "DeviceManagementStaleSyncRequired");
        zzHK = new zzjo("DM_DEACTIVATED", 23, "DeviceManagementDeactivated");
        zzHL = new zzjo("DM_REQUIRED", 24, "DeviceManagementRequired");
        zzHM = new zzjo("CLIENT_LOGIN_DISABLED", 25, "ClientLoginDisabled");
        zzHN = new zzjo("NEED_PERMISSION", 26, "NeedPermission");
        zzHO = new zzjo("BAD_PASSWORD", 27, "WeakPassword");
        zzHP = new zzjo("ALREADY_HAS_GMAIL", 28, "ALREADY_HAS_GMAIL");
        zzHQ = new zzjo("BAD_REQUEST", 29, "BadRequest");
        zzHR = new zzjo("BAD_USERNAME", 30, "BadUsername");
        zzHS = new zzjo("LOGIN_FAIL", 31, "LoginFail");
        zzHT = new zzjo("NOT_LOGGED_IN", 32, "NotLoggedIn");
        zzHU = new zzjo("NO_GMAIL", 33, "NoGmail");
        zzHV = new zzjo("REQUEST_DENIED", 34, "RequestDenied");
        zzHW = new zzjo("SERVER_ERROR", 35, "ServerError");
        zzHX = new zzjo("USERNAME_UNAVAILABLE", 36, "UsernameUnavailable");
        zzHY = new zzjo("DELETED_GMAIL", 37, "DeletedGmail");
        zzHZ = new zzjo("SOCKET_TIMEOUT", 38, "SocketTimeout");
        zzIa = new zzjo("EXISTING_USERNAME", 39, "ExistingUsername");
        zzIb = new zzjo("NEEDS_BROWSER", 40, "NeedsBrowser");
        zzIc = new zzjo("GPLUS_OTHER", 41, "GPlusOther");
        zzId = new zzjo("GPLUS_NICKNAME", 42, "GPlusNickname");
        zzIe = new zzjo("GPLUS_INVALID_CHAR", 43, "GPlusInvalidChar");
        zzIf = new zzjo("GPLUS_INTERSTITIAL", 44, "GPlusInterstitial");
        zzIg = new zzjo("GPLUS_PROFILE_ERROR", 45, "ProfileUpgradeError");
        zzIh = new zzjo("INVALID_SCOPE", 46, "INVALID_SCOPE");
        zzIl = (new zzjo[] {
            zzHn, zzHo, zzHp, zzHq, zzHr, zzHs, zzHt, zzHu, zzHv, zzHw, 
            zzHx, zzHy, zzHz, zzHA, zzHB, zzHC, zzHD, zzHE, zzHF, zzHG, 
            zzHH, zzHI, zzHJ, zzHK, zzHL, zzHM, zzHN, zzHO, zzHP, zzHQ, 
            zzHR, zzHS, zzHT, zzHU, zzHV, zzHW, zzHX, zzHY, zzHZ, zzIa, 
            zzIb, zzIc, zzId, zzIe, zzIf, zzIg, zzIh
        });
    }
}
