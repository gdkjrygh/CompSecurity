// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class ii extends Enum
{

    public static final ii EA;
    public static final ii EB;
    public static final ii EC;
    public static final ii ED;
    public static final ii EE;
    public static final ii EF;
    public static final ii EG;
    public static final ii EH;
    public static final ii EI;
    public static final ii EJ;
    public static final ii EK;
    public static final ii EL;
    public static final ii EM;
    public static final ii EN;
    public static final ii EO;
    public static final ii EP;
    public static final ii EQ;
    public static final ii ER;
    public static final ii ES;
    public static final ii ET;
    public static final ii EU;
    public static final ii EV;
    public static final ii EW;
    public static final ii EX;
    public static final ii EY;
    public static final ii EZ;
    public static final ii Er;
    public static final ii Es;
    public static final ii Et;
    public static final ii Eu;
    public static final ii Ev;
    public static final ii Ew;
    public static final ii Ex;
    public static final ii Ey;
    public static final ii Ez;
    public static final ii Fa;
    public static final ii Fb;
    public static final ii Fc;
    public static final ii Fd;
    public static final ii Fe;
    public static final ii Ff;
    public static final ii Fg;
    public static final ii Fh;
    public static final ii Fi;
    public static final ii Fj;
    public static String Fk = "Error";
    public static String Fl = "status";
    private static final ii Fn[];
    private final String Fm;

    private ii(String s, int i, String s1)
    {
        super(s, i);
        Fm = s1;
    }

    public static ii valueOf(String s)
    {
        return (ii)Enum.valueOf(com/google/android/gms/internal/ii, s);
    }

    public static ii[] values()
    {
        return (ii[])Fn.clone();
    }

    public String fO()
    {
        return Fm;
    }

    static 
    {
        Er = new ii("SUCCESS", 0, "Ok");
        Es = new ii("BAD_AUTHENTICATION", 1, "BadAuthentication");
        Et = new ii("NEEDS_2F", 2, "InvalidSecondFactor");
        Eu = new ii("NOT_VERIFIED", 3, "NotVerified");
        Ev = new ii("TERMS_NOT_AGREED", 4, "TermsNotAgreed");
        Ew = new ii("UNKNOWN", 5, "Unknown");
        Ex = new ii("UNKNOWN_ERROR", 6, "UNKNOWN_ERR");
        Ey = new ii("ACCOUNT_DELETED", 7, "AccountDeleted");
        Ez = new ii("ACCOUNT_DISABLED", 8, "AccountDisabled");
        EA = new ii("SERVICE_DISABLED", 9, "ServiceDisabled");
        EB = new ii("SERVICE_UNAVAILABLE", 10, "ServiceUnavailable");
        EC = new ii("CAPTCHA", 11, "CaptchaRequired");
        ED = new ii("NETWORK_ERROR", 12, "NetworkError");
        EE = new ii("USER_CANCEL", 13, "UserCancel");
        EF = new ii("PERMISSION_DENIED", 14, "PermissionDenied");
        EG = new ii("DEVICE_MANAGEMENT_REQUIRED", 15, "DeviceManagementRequiredOrSyncDisabled");
        EH = new ii("DM_INTERNAL_ERROR", 16, "DeviceManagementInternalError");
        EI = new ii("DM_SYNC_DISABLED", 17, "DeviceManagementSyncDisabled");
        EJ = new ii("DM_ADMIN_BLOCKED", 18, "DeviceManagementAdminBlocked");
        EK = new ii("DM_ADMIN_PENDING_APPROVAL", 19, "DeviceManagementAdminPendingApproval");
        EL = new ii("DM_STALE_SYNC_REQUIRED", 20, "DeviceManagementStaleSyncRequired");
        EM = new ii("DM_DEACTIVATED", 21, "DeviceManagementDeactivated");
        EN = new ii("DM_REQUIRED", 22, "DeviceManagementRequired");
        EO = new ii("CLIENT_LOGIN_DISABLED", 23, "ClientLoginDisabled");
        EP = new ii("NEED_PERMISSION", 24, "NeedPermission");
        EQ = new ii("BAD_PASSWORD", 25, "WeakPassword");
        ER = new ii("ALREADY_HAS_GMAIL", 26, "ALREADY_HAS_GMAIL");
        ES = new ii("BAD_REQUEST", 27, "BadRequest");
        ET = new ii("BAD_USERNAME", 28, "BadUsername");
        EU = new ii("LOGIN_FAIL", 29, "LoginFail");
        EV = new ii("NOT_LOGGED_IN", 30, "NotLoggedIn");
        EW = new ii("NO_GMAIL", 31, "NoGmail");
        EX = new ii("REQUEST_DENIED", 32, "RequestDenied");
        EY = new ii("SERVER_ERROR", 33, "ServerError");
        EZ = new ii("USERNAME_UNAVAILABLE", 34, "UsernameUnavailable");
        Fa = new ii("DELETED_GMAIL", 35, "DeletedGmail");
        Fb = new ii("SOCKET_TIMEOUT", 36, "SocketTimeout");
        Fc = new ii("EXISTING_USERNAME", 37, "ExistingUsername");
        Fd = new ii("NEEDS_BROWSER", 38, "NeedsBrowser");
        Fe = new ii("GPLUS_OTHER", 39, "GPlusOther");
        Ff = new ii("GPLUS_NICKNAME", 40, "GPlusNickname");
        Fg = new ii("GPLUS_INVALID_CHAR", 41, "GPlusInvalidChar");
        Fh = new ii("GPLUS_INTERSTITIAL", 42, "GPlusInterstitial");
        Fi = new ii("GPLUS_PROFILE_ERROR", 43, "ProfileUpgradeError");
        Fj = new ii("INVALID_SCOPE", 44, "INVALID_SCOPE");
        Fn = (new ii[] {
            Er, Es, Et, Eu, Ev, Ew, Ex, Ey, Ez, EA, 
            EB, EC, ED, EE, EF, EG, EH, EI, EJ, EK, 
            EL, EM, EN, EO, EP, EQ, ER, ES, ET, EU, 
            EV, EW, EX, EY, EZ, Fa, Fb, Fc, Fd, Fe, 
            Ff, Fg, Fh, Fi, Fj
        });
    }
}
