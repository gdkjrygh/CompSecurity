// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class ge extends Enum
{

    public static final ge yW;
    public static final ge yX;
    public static final ge yY;
    public static final ge yZ;
    public static final ge zA;
    public static final ge zB;
    public static final ge zC;
    public static final ge zD;
    public static final ge zE;
    public static final ge zF;
    public static final ge zG;
    public static final ge zH;
    public static String zI = "Error";
    public static String zJ = "status";
    private static final ge zL[];
    public static final ge za;
    public static final ge zb;
    public static final ge zc;
    public static final ge zd;
    public static final ge ze;
    public static final ge zf;
    public static final ge zg;
    public static final ge zh;
    public static final ge zi;
    public static final ge zj;
    public static final ge zk;
    public static final ge zl;
    public static final ge zm;
    public static final ge zn;
    public static final ge zo;
    public static final ge zp;
    public static final ge zq;
    public static final ge zr;
    public static final ge zs;
    public static final ge zt;
    public static final ge zu;
    public static final ge zv;
    public static final ge zw;
    public static final ge zx;
    public static final ge zy;
    public static final ge zz;
    private final String zK;

    private ge(String s, int i, String s1)
    {
        super(s, i);
        zK = s1;
    }

    public static ge valueOf(String s)
    {
        return (ge)Enum.valueOf(com/google/android/gms/internal/ge, s);
    }

    public static ge[] values()
    {
        return (ge[])zL.clone();
    }

    static 
    {
        yW = new ge("SUCCESS", 0, "Ok");
        yX = new ge("BAD_AUTHENTICATION", 1, "BadAuthentication");
        yY = new ge("NEEDS_2F", 2, "InvalidSecondFactor");
        yZ = new ge("NOT_VERIFIED", 3, "NotVerified");
        za = new ge("TERMS_NOT_AGREED", 4, "TermsNotAgreed");
        zb = new ge("UNKNOWN", 5, "Unknown");
        zc = new ge("UNKNOWN_ERROR", 6, "UNKNOWN_ERR");
        zd = new ge("ACCOUNT_DELETED", 7, "AccountDeleted");
        ze = new ge("ACCOUNT_DISABLED", 8, "AccountDisabled");
        zf = new ge("SERVICE_DISABLED", 9, "ServiceDisabled");
        zg = new ge("SERVICE_UNAVAILABLE", 10, "ServiceUnavailable");
        zh = new ge("CAPTCHA", 11, "CaptchaRequired");
        zi = new ge("NETWORK_ERROR", 12, "NetworkError");
        zj = new ge("USER_CANCEL", 13, "UserCancel");
        zk = new ge("PERMISSION_DENIED", 14, "PermissionDenied");
        zl = new ge("DEVICE_MANAGEMENT_REQUIRED", 15, "DeviceManagementRequiredOrSyncDisabled");
        zm = new ge("CLIENT_LOGIN_DISABLED", 16, "ClientLoginDisabled");
        zn = new ge("NEED_PERMISSION", 17, "NeedPermission");
        zo = new ge("BAD_PASSWORD", 18, "WeakPassword");
        zp = new ge("ALREADY_HAS_GMAIL", 19, "ALREADY_HAS_GMAIL");
        zq = new ge("BAD_REQUEST", 20, "BadRequest");
        zr = new ge("BAD_USERNAME", 21, "BadUsername");
        zs = new ge("LOGIN_FAIL", 22, "LoginFail");
        zt = new ge("NOT_LOGGED_IN", 23, "NotLoggedIn");
        zu = new ge("NO_GMAIL", 24, "NoGmail");
        zv = new ge("REQUEST_DENIED", 25, "RequestDenied");
        zw = new ge("SERVER_ERROR", 26, "ServerError");
        zx = new ge("USERNAME_UNAVAILABLE", 27, "UsernameUnavailable");
        zy = new ge("DELETED_GMAIL", 28, "DeletedGmail");
        zz = new ge("SOCKET_TIMEOUT", 29, "SocketTimeout");
        zA = new ge("EXISTING_USERNAME", 30, "ExistingUsername");
        zB = new ge("NEEDS_BROWSER", 31, "NeedsBrowser");
        zC = new ge("GPLUS_OTHER", 32, "GPlusOther");
        zD = new ge("GPLUS_NICKNAME", 33, "GPlusNickname");
        zE = new ge("GPLUS_INVALID_CHAR", 34, "GPlusInvalidChar");
        zF = new ge("GPLUS_INTERSTITIAL", 35, "GPlusInterstitial");
        zG = new ge("GPLUS_PROFILE_ERROR", 36, "ProfileUpgradeError");
        zH = new ge("INVALID_SCOPE", 37, "INVALID_SCOPE");
        zL = (new ge[] {
            yW, yX, yY, yZ, za, zb, zc, zd, ze, zf, 
            zg, zh, zi, zj, zk, zl, zm, zn, zo, zp, 
            zq, zr, zs, zt, zu, zv, zw, zx, zy, zz, 
            zA, zB, zC, zD, zE, zF, zG, zH
        });
    }
}
