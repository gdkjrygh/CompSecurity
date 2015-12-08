// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class el extends Enum
{

    public static final el wR;
    public static final el wS;
    public static final el wT;
    public static final el wU;
    public static final el wV;
    public static final el wW;
    public static final el wX;
    public static final el wY;
    public static final el wZ;
    public static final el xA;
    public static final el xB;
    public static final el xC;
    public static String xD = "Error";
    public static String xE = "status";
    private static final el xG[];
    public static final el xa;
    public static final el xb;
    public static final el xc;
    public static final el xd;
    public static final el xe;
    public static final el xf;
    public static final el xg;
    public static final el xh;
    public static final el xi;
    public static final el xj;
    public static final el xk;
    public static final el xl;
    public static final el xm;
    public static final el xn;
    public static final el xo;
    public static final el xp;
    public static final el xq;
    public static final el xr;
    public static final el xs;
    public static final el xt;
    public static final el xu;
    public static final el xv;
    public static final el xw;
    public static final el xx;
    public static final el xy;
    public static final el xz;
    private final String xF;

    private el(String s, int i, String s1)
    {
        super(s, i);
        xF = s1;
    }

    public static el valueOf(String s)
    {
        return (el)Enum.valueOf(com/google/android/gms/internal/el, s);
    }

    public static el[] values()
    {
        return (el[])xG.clone();
    }

    static 
    {
        wR = new el("SUCCESS", 0, "Ok");
        wS = new el("BAD_AUTHENTICATION", 1, "BadAuthentication");
        wT = new el("NEEDS_2F", 2, "InvalidSecondFactor");
        wU = new el("NOT_VERIFIED", 3, "NotVerified");
        wV = new el("TERMS_NOT_AGREED", 4, "TermsNotAgreed");
        wW = new el("UNKNOWN", 5, "Unknown");
        wX = new el("UNKNOWN_ERROR", 6, "UNKNOWN_ERR");
        wY = new el("ACCOUNT_DELETED", 7, "AccountDeleted");
        wZ = new el("ACCOUNT_DISABLED", 8, "AccountDisabled");
        xa = new el("SERVICE_DISABLED", 9, "ServiceDisabled");
        xb = new el("SERVICE_UNAVAILABLE", 10, "ServiceUnavailable");
        xc = new el("CAPTCHA", 11, "CaptchaRequired");
        xd = new el("NETWORK_ERROR", 12, "NetworkError");
        xe = new el("USER_CANCEL", 13, "UserCancel");
        xf = new el("PERMISSION_DENIED", 14, "PermissionDenied");
        xg = new el("DEVICE_MANAGEMENT_REQUIRED", 15, "DeviceManagementRequiredOrSyncDisabled");
        xh = new el("CLIENT_LOGIN_DISABLED", 16, "ClientLoginDisabled");
        xi = new el("NEED_PERMISSION", 17, "NeedPermission");
        xj = new el("BAD_PASSWORD", 18, "WeakPassword");
        xk = new el("ALREADY_HAS_GMAIL", 19, "ALREADY_HAS_GMAIL");
        xl = new el("BAD_REQUEST", 20, "BadRequest");
        xm = new el("BAD_USERNAME", 21, "BadUsername");
        xn = new el("LOGIN_FAIL", 22, "LoginFail");
        xo = new el("NOT_LOGGED_IN", 23, "NotLoggedIn");
        xp = new el("NO_GMAIL", 24, "NoGmail");
        xq = new el("REQUEST_DENIED", 25, "RequestDenied");
        xr = new el("SERVER_ERROR", 26, "ServerError");
        xs = new el("USERNAME_UNAVAILABLE", 27, "UsernameUnavailable");
        xt = new el("DELETED_GMAIL", 28, "DeletedGmail");
        xu = new el("SOCKET_TIMEOUT", 29, "SocketTimeout");
        xv = new el("EXISTING_USERNAME", 30, "ExistingUsername");
        xw = new el("NEEDS_BROWSER", 31, "NeedsBrowser");
        xx = new el("GPLUS_OTHER", 32, "GPlusOther");
        xy = new el("GPLUS_NICKNAME", 33, "GPlusNickname");
        xz = new el("GPLUS_INVALID_CHAR", 34, "GPlusInvalidChar");
        xA = new el("GPLUS_INTERSTITIAL", 35, "GPlusInterstitial");
        xB = new el("GPLUS_PROFILE_ERROR", 36, "ProfileUpgradeError");
        xC = new el("INVALID_SCOPE", 37, "INVALID_SCOPE");
        xG = (new el[] {
            wR, wS, wT, wU, wV, wW, wX, wY, wZ, xa, 
            xb, xc, xd, xe, xf, xg, xh, xi, xj, xk, 
            xl, xm, xn, xo, xp, xq, xr, xs, xt, xu, 
            xv, xw, xx, xy, xz, xA, xB, xC
        });
    }
}
