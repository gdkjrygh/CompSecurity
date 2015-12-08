// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class gd extends Enum
{

    public static final gd yZ;
    public static final gd zA;
    public static final gd zB;
    public static final gd zC;
    public static final gd zD;
    public static final gd zE;
    public static final gd zF;
    public static final gd zG;
    public static final gd zH;
    public static final gd zI;
    public static final gd zJ;
    public static final gd zK;
    public static String zL = "Error";
    public static String zM = "status";
    private static final gd zO[];
    public static final gd za;
    public static final gd zb;
    public static final gd zc;
    public static final gd zd;
    public static final gd ze;
    public static final gd zf;
    public static final gd zg;
    public static final gd zh;
    public static final gd zi;
    public static final gd zj;
    public static final gd zk;
    public static final gd zl;
    public static final gd zm;
    public static final gd zn;
    public static final gd zo;
    public static final gd zp;
    public static final gd zq;
    public static final gd zr;
    public static final gd zs;
    public static final gd zt;
    public static final gd zu;
    public static final gd zv;
    public static final gd zw;
    public static final gd zx;
    public static final gd zy;
    public static final gd zz;
    private final String zN;

    private gd(String s, int i, String s1)
    {
        super(s, i);
        zN = s1;
    }

    public static gd valueOf(String s)
    {
        return (gd)Enum.valueOf(com/google/android/gms/internal/gd, s);
    }

    public static gd[] values()
    {
        return (gd[])zO.clone();
    }

    static 
    {
        yZ = new gd("SUCCESS", 0, "Ok");
        za = new gd("BAD_AUTHENTICATION", 1, "BadAuthentication");
        zb = new gd("NEEDS_2F", 2, "InvalidSecondFactor");
        zc = new gd("NOT_VERIFIED", 3, "NotVerified");
        zd = new gd("TERMS_NOT_AGREED", 4, "TermsNotAgreed");
        ze = new gd("UNKNOWN", 5, "Unknown");
        zf = new gd("UNKNOWN_ERROR", 6, "UNKNOWN_ERR");
        zg = new gd("ACCOUNT_DELETED", 7, "AccountDeleted");
        zh = new gd("ACCOUNT_DISABLED", 8, "AccountDisabled");
        zi = new gd("SERVICE_DISABLED", 9, "ServiceDisabled");
        zj = new gd("SERVICE_UNAVAILABLE", 10, "ServiceUnavailable");
        zk = new gd("CAPTCHA", 11, "CaptchaRequired");
        zl = new gd("NETWORK_ERROR", 12, "NetworkError");
        zm = new gd("USER_CANCEL", 13, "UserCancel");
        zn = new gd("PERMISSION_DENIED", 14, "PermissionDenied");
        zo = new gd("DEVICE_MANAGEMENT_REQUIRED", 15, "DeviceManagementRequiredOrSyncDisabled");
        zp = new gd("CLIENT_LOGIN_DISABLED", 16, "ClientLoginDisabled");
        zq = new gd("NEED_PERMISSION", 17, "NeedPermission");
        zr = new gd("BAD_PASSWORD", 18, "WeakPassword");
        zs = new gd("ALREADY_HAS_GMAIL", 19, "ALREADY_HAS_GMAIL");
        zt = new gd("BAD_REQUEST", 20, "BadRequest");
        zu = new gd("BAD_USERNAME", 21, "BadUsername");
        zv = new gd("LOGIN_FAIL", 22, "LoginFail");
        zw = new gd("NOT_LOGGED_IN", 23, "NotLoggedIn");
        zx = new gd("NO_GMAIL", 24, "NoGmail");
        zy = new gd("REQUEST_DENIED", 25, "RequestDenied");
        zz = new gd("SERVER_ERROR", 26, "ServerError");
        zA = new gd("USERNAME_UNAVAILABLE", 27, "UsernameUnavailable");
        zB = new gd("DELETED_GMAIL", 28, "DeletedGmail");
        zC = new gd("SOCKET_TIMEOUT", 29, "SocketTimeout");
        zD = new gd("EXISTING_USERNAME", 30, "ExistingUsername");
        zE = new gd("NEEDS_BROWSER", 31, "NeedsBrowser");
        zF = new gd("GPLUS_OTHER", 32, "GPlusOther");
        zG = new gd("GPLUS_NICKNAME", 33, "GPlusNickname");
        zH = new gd("GPLUS_INVALID_CHAR", 34, "GPlusInvalidChar");
        zI = new gd("GPLUS_INTERSTITIAL", 35, "GPlusInterstitial");
        zJ = new gd("GPLUS_PROFILE_ERROR", 36, "ProfileUpgradeError");
        zK = new gd("INVALID_SCOPE", 37, "INVALID_SCOPE");
        zO = (new gd[] {
            yZ, za, zb, zc, zd, ze, zf, zg, zh, zi, 
            zj, zk, zl, zm, zn, zo, zp, zq, zr, zs, 
            zt, zu, zv, zw, zx, zy, zz, zA, zB, zC, 
            zD, zE, zF, zG, zH, zI, zJ, zK
        });
    }
}
