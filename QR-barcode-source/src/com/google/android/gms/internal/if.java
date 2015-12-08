// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class if extends Enum
{

    public static final if DC;
    public static final if DD;
    public static final if DE;
    public static final if DF;
    public static final if DG;
    public static final if DH;
    public static final if DI;
    public static final if DJ;
    public static final if DK;
    public static final if DL;
    public static final if DM;
    public static final if DN;
    public static final if DO;
    public static final if DP;
    public static final if DQ;
    public static final if DR;
    public static final if DS;
    public static final if DT;
    public static final if DU;
    public static final if DV;
    public static final if DW;
    public static final if DX;
    public static final if DY;
    public static final if DZ;
    public static final if Ea;
    public static final if Eb;
    public static final if Ec;
    public static final if Ed;
    public static final if Ee;
    public static final if Ef;
    public static final if Eg;
    public static final if Eh;
    public static final if Ei;
    public static final if Ej;
    public static final if Ek;
    public static final if El;
    public static final if Em;
    public static final if En;
    public static final if Eo;
    public static final if Ep;
    public static final if Eq;
    public static final if Er;
    public static final if Es;
    public static final if Et;
    public static final if Eu;
    public static String Ev = "Error";
    public static String Ew = "status";
    private static final if Ey[];
    private final String Ex;

    private if(String s, int i, String s1)
    {
        super(s, i);
        Ex = s1;
    }

    public static if valueOf(String s)
    {
        return (if)Enum.valueOf(com/google/android/gms/internal/if, s);
    }

    public static if[] values()
    {
        return (if[])Ey.clone();
    }

    public String ft()
    {
        return Ex;
    }

    static 
    {
        DC = new if("SUCCESS", 0, "Ok");
        DD = new if("BAD_AUTHENTICATION", 1, "BadAuthentication");
        DE = new if("NEEDS_2F", 2, "InvalidSecondFactor");
        DF = new if("NOT_VERIFIED", 3, "NotVerified");
        DG = new if("TERMS_NOT_AGREED", 4, "TermsNotAgreed");
        DH = new if("UNKNOWN", 5, "Unknown");
        DI = new if("UNKNOWN_ERROR", 6, "UNKNOWN_ERR");
        DJ = new if("ACCOUNT_DELETED", 7, "AccountDeleted");
        DK = new if("ACCOUNT_DISABLED", 8, "AccountDisabled");
        DL = new if("SERVICE_DISABLED", 9, "ServiceDisabled");
        DM = new if("SERVICE_UNAVAILABLE", 10, "ServiceUnavailable");
        DN = new if("CAPTCHA", 11, "CaptchaRequired");
        DO = new if("NETWORK_ERROR", 12, "NetworkError");
        DP = new if("USER_CANCEL", 13, "UserCancel");
        DQ = new if("PERMISSION_DENIED", 14, "PermissionDenied");
        DR = new if("DEVICE_MANAGEMENT_REQUIRED", 15, "DeviceManagementRequiredOrSyncDisabled");
        DS = new if("DM_INTERNAL_ERROR", 16, "DeviceManagementInternalError");
        DT = new if("DM_SYNC_DISABLED", 17, "DeviceManagementSyncDisabled");
        DU = new if("DM_ADMIN_BLOCKED", 18, "DeviceManagementAdminBlocked");
        DV = new if("DM_ADMIN_PENDING_APPROVAL", 19, "DeviceManagementAdminPendingApproval");
        DW = new if("DM_STALE_SYNC_REQUIRED", 20, "DeviceManagementStaleSyncRequired");
        DX = new if("DM_DEACTIVATED", 21, "DeviceManagementDeactivated");
        DY = new if("DM_REQUIRED", 22, "DeviceManagementRequired");
        DZ = new if("CLIENT_LOGIN_DISABLED", 23, "ClientLoginDisabled");
        Ea = new if("NEED_PERMISSION", 24, "NeedPermission");
        Eb = new if("BAD_PASSWORD", 25, "WeakPassword");
        Ec = new if("ALREADY_HAS_GMAIL", 26, "ALREADY_HAS_GMAIL");
        Ed = new if("BAD_REQUEST", 27, "BadRequest");
        Ee = new if("BAD_USERNAME", 28, "BadUsername");
        Ef = new if("LOGIN_FAIL", 29, "LoginFail");
        Eg = new if("NOT_LOGGED_IN", 30, "NotLoggedIn");
        Eh = new if("NO_GMAIL", 31, "NoGmail");
        Ei = new if("REQUEST_DENIED", 32, "RequestDenied");
        Ej = new if("SERVER_ERROR", 33, "ServerError");
        Ek = new if("USERNAME_UNAVAILABLE", 34, "UsernameUnavailable");
        El = new if("DELETED_GMAIL", 35, "DeletedGmail");
        Em = new if("SOCKET_TIMEOUT", 36, "SocketTimeout");
        En = new if("EXISTING_USERNAME", 37, "ExistingUsername");
        Eo = new if("NEEDS_BROWSER", 38, "NeedsBrowser");
        Ep = new if("GPLUS_OTHER", 39, "GPlusOther");
        Eq = new if("GPLUS_NICKNAME", 40, "GPlusNickname");
        Er = new if("GPLUS_INVALID_CHAR", 41, "GPlusInvalidChar");
        Es = new if("GPLUS_INTERSTITIAL", 42, "GPlusInterstitial");
        Et = new if("GPLUS_PROFILE_ERROR", 43, "ProfileUpgradeError");
        Eu = new if("INVALID_SCOPE", 44, "INVALID_SCOPE");
        Ey = (new if[] {
            DC, DD, DE, DF, DG, DH, DI, DJ, DK, DL, 
            DM, DN, DO, DP, DQ, DR, DS, DT, DU, DV, 
            DW, DX, DY, DZ, Ea, Eb, Ec, Ed, Ee, Ef, 
            Eg, Eh, Ei, Ej, Ek, El, Em, En, Eo, Ep, 
            Eq, Er, Es, Et, Eu
        });
    }
}
