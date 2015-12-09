// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class zzha extends Enum
{

    public static final zzha zzKD;
    public static final zzha zzKE;
    public static final zzha zzKF;
    public static final zzha zzKG;
    public static final zzha zzKH;
    public static final zzha zzKI;
    public static final zzha zzKJ;
    public static final zzha zzKK;
    public static final zzha zzKL;
    public static final zzha zzKM;
    public static final zzha zzKN;
    public static final zzha zzKO;
    public static final zzha zzKP;
    public static final zzha zzKQ;
    public static final zzha zzKR;
    public static final zzha zzKS;
    public static final zzha zzKT;
    public static final zzha zzKU;
    public static final zzha zzKV;
    public static final zzha zzKW;
    public static final zzha zzKX;
    public static final zzha zzKY;
    public static final zzha zzKZ;
    public static String zzLA = "status";
    private static final zzha zzLC[];
    public static final zzha zzLa;
    public static final zzha zzLb;
    public static final zzha zzLc;
    public static final zzha zzLd;
    public static final zzha zzLe;
    public static final zzha zzLf;
    public static final zzha zzLg;
    public static final zzha zzLh;
    public static final zzha zzLi;
    public static final zzha zzLj;
    public static final zzha zzLk;
    public static final zzha zzLl;
    public static final zzha zzLm;
    public static final zzha zzLn;
    public static final zzha zzLo;
    public static final zzha zzLp;
    public static final zzha zzLq;
    public static final zzha zzLr;
    public static final zzha zzLs;
    public static final zzha zzLt;
    public static final zzha zzLu;
    public static final zzha zzLv;
    public static final zzha zzLw;
    public static final zzha zzLx;
    public static final zzha zzLy;
    public static String zzLz = "Error";
    private final String zzLB;

    private zzha(String s, int i, String s1)
    {
        super(s, i);
        zzLB = s1;
    }

    public static zzha valueOf(String s)
    {
        return (zzha)Enum.valueOf(com/google/android/gms/internal/zzha, s);
    }

    public static zzha[] values()
    {
        return (zzha[])zzLC.clone();
    }

    public String zzjQ()
    {
        return zzLB;
    }

    static 
    {
        zzKD = new zzha("SUCCESS", 0, "Ok");
        zzKE = new zzha("BAD_AUTHENTICATION", 1, "BadAuthentication");
        zzKF = new zzha("EMPTY_CONSUMER_PKG_OR_SIG", 2, "EmptyConsumerPackageOrSig");
        zzKG = new zzha("NEEDS_2F", 3, "InvalidSecondFactor");
        zzKH = new zzha("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
        zzKI = new zzha("NOT_VERIFIED", 5, "NotVerified");
        zzKJ = new zzha("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
        zzKK = new zzha("UNKNOWN", 7, "Unknown");
        zzKL = new zzha("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
        zzKM = new zzha("ACCOUNT_DELETED", 9, "AccountDeleted");
        zzKN = new zzha("ACCOUNT_DISABLED", 10, "AccountDisabled");
        zzKO = new zzha("SERVICE_DISABLED", 11, "ServiceDisabled");
        zzKP = new zzha("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
        zzKQ = new zzha("CAPTCHA", 13, "CaptchaRequired");
        zzKR = new zzha("NETWORK_ERROR", 14, "NetworkError");
        zzKS = new zzha("USER_CANCEL", 15, "UserCancel");
        zzKT = new zzha("PERMISSION_DENIED", 16, "PermissionDenied");
        zzKU = new zzha("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
        zzKV = new zzha("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
        zzKW = new zzha("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
        zzKX = new zzha("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
        zzKY = new zzha("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
        zzKZ = new zzha("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
        zzLa = new zzha("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
        zzLb = new zzha("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
        zzLc = new zzha("DM_REQUIRED", 25, "DeviceManagementRequired");
        zzLd = new zzha("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
        zzLe = new zzha("NEED_PERMISSION", 27, "NeedPermission");
        zzLf = new zzha("BAD_PASSWORD", 28, "WeakPassword");
        zzLg = new zzha("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
        zzLh = new zzha("BAD_REQUEST", 30, "BadRequest");
        zzLi = new zzha("BAD_USERNAME", 31, "BadUsername");
        zzLj = new zzha("LOGIN_FAIL", 32, "LoginFail");
        zzLk = new zzha("NOT_LOGGED_IN", 33, "NotLoggedIn");
        zzLl = new zzha("NO_GMAIL", 34, "NoGmail");
        zzLm = new zzha("REQUEST_DENIED", 35, "RequestDenied");
        zzLn = new zzha("SERVER_ERROR", 36, "ServerError");
        zzLo = new zzha("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
        zzLp = new zzha("DELETED_GMAIL", 38, "DeletedGmail");
        zzLq = new zzha("SOCKET_TIMEOUT", 39, "SocketTimeout");
        zzLr = new zzha("EXISTING_USERNAME", 40, "ExistingUsername");
        zzLs = new zzha("NEEDS_BROWSER", 41, "NeedsBrowser");
        zzLt = new zzha("GPLUS_OTHER", 42, "GPlusOther");
        zzLu = new zzha("GPLUS_NICKNAME", 43, "GPlusNickname");
        zzLv = new zzha("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
        zzLw = new zzha("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
        zzLx = new zzha("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
        zzLy = new zzha("INVALID_SCOPE", 47, "INVALID_SCOPE");
        zzLC = (new zzha[] {
            zzKD, zzKE, zzKF, zzKG, zzKH, zzKI, zzKJ, zzKK, zzKL, zzKM, 
            zzKN, zzKO, zzKP, zzKQ, zzKR, zzKS, zzKT, zzKU, zzKV, zzKW, 
            zzKX, zzKY, zzKZ, zzLa, zzLb, zzLc, zzLd, zzLe, zzLf, zzLg, 
            zzLh, zzLi, zzLj, zzLk, zzLl, zzLm, zzLn, zzLo, zzLp, zzLq, 
            zzLr, zzLs, zzLt, zzLu, zzLv, zzLw, zzLx, zzLy
        });
    }
}
