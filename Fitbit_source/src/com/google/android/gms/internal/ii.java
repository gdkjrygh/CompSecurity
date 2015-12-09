// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class ii extends Enum
{

    public static final ii A;
    public static final ii B;
    public static final ii C;
    public static final ii D;
    public static final ii E;
    public static final ii F;
    public static final ii G;
    public static final ii H;
    public static final ii I;
    public static final ii J;
    public static final ii K;
    public static final ii L;
    public static final ii M;
    public static final ii N;
    public static final ii O;
    public static final ii P;
    public static final ii Q;
    public static final ii R;
    public static final ii S;
    public static String T = "Error";
    public static String U = "status";
    private static final ii V[];
    public static final ii a;
    public static final ii b;
    public static final ii c;
    public static final ii d;
    public static final ii e;
    public static final ii f;
    public static final ii g;
    public static final ii h;
    public static final ii i;
    public static final ii j;
    public static final ii k;
    public static final ii l;
    public static final ii m;
    public static final ii n;
    public static final ii o;
    public static final ii p;
    public static final ii q;
    public static final ii r;
    public static final ii s;
    public static final ii t;
    public static final ii u;
    public static final ii v;
    public static final ii w;
    public static final ii x;
    public static final ii y;
    public static final ii z;
    private final String Fm;

    private ii(String s1, int i1, String s2)
    {
        super(s1, i1);
        Fm = s2;
    }

    public static ii valueOf(String s1)
    {
        return (ii)Enum.valueOf(com/google/android/gms/internal/ii, s1);
    }

    public static ii[] values()
    {
        return (ii[])V.clone();
    }

    public String a()
    {
        return Fm;
    }

    static 
    {
        a = new ii("SUCCESS", 0, "Ok");
        b = new ii("BAD_AUTHENTICATION", 1, "BadAuthentication");
        c = new ii("NEEDS_2F", 2, "InvalidSecondFactor");
        d = new ii("NOT_VERIFIED", 3, "NotVerified");
        e = new ii("TERMS_NOT_AGREED", 4, "TermsNotAgreed");
        f = new ii("UNKNOWN", 5, "Unknown");
        g = new ii("UNKNOWN_ERROR", 6, "UNKNOWN_ERR");
        h = new ii("ACCOUNT_DELETED", 7, "AccountDeleted");
        i = new ii("ACCOUNT_DISABLED", 8, "AccountDisabled");
        j = new ii("SERVICE_DISABLED", 9, "ServiceDisabled");
        k = new ii("SERVICE_UNAVAILABLE", 10, "ServiceUnavailable");
        l = new ii("CAPTCHA", 11, "CaptchaRequired");
        m = new ii("NETWORK_ERROR", 12, "NetworkError");
        n = new ii("USER_CANCEL", 13, "UserCancel");
        o = new ii("PERMISSION_DENIED", 14, "PermissionDenied");
        p = new ii("DEVICE_MANAGEMENT_REQUIRED", 15, "DeviceManagementRequiredOrSyncDisabled");
        q = new ii("DM_INTERNAL_ERROR", 16, "DeviceManagementInternalError");
        r = new ii("DM_SYNC_DISABLED", 17, "DeviceManagementSyncDisabled");
        s = new ii("DM_ADMIN_BLOCKED", 18, "DeviceManagementAdminBlocked");
        t = new ii("DM_ADMIN_PENDING_APPROVAL", 19, "DeviceManagementAdminPendingApproval");
        u = new ii("DM_STALE_SYNC_REQUIRED", 20, "DeviceManagementStaleSyncRequired");
        v = new ii("DM_DEACTIVATED", 21, "DeviceManagementDeactivated");
        w = new ii("DM_REQUIRED", 22, "DeviceManagementRequired");
        x = new ii("CLIENT_LOGIN_DISABLED", 23, "ClientLoginDisabled");
        y = new ii("NEED_PERMISSION", 24, "NeedPermission");
        z = new ii("BAD_PASSWORD", 25, "WeakPassword");
        A = new ii("ALREADY_HAS_GMAIL", 26, "ALREADY_HAS_GMAIL");
        B = new ii("BAD_REQUEST", 27, "BadRequest");
        C = new ii("BAD_USERNAME", 28, "BadUsername");
        D = new ii("LOGIN_FAIL", 29, "LoginFail");
        E = new ii("NOT_LOGGED_IN", 30, "NotLoggedIn");
        F = new ii("NO_GMAIL", 31, "NoGmail");
        G = new ii("REQUEST_DENIED", 32, "RequestDenied");
        H = new ii("SERVER_ERROR", 33, "ServerError");
        I = new ii("USERNAME_UNAVAILABLE", 34, "UsernameUnavailable");
        J = new ii("DELETED_GMAIL", 35, "DeletedGmail");
        K = new ii("SOCKET_TIMEOUT", 36, "SocketTimeout");
        L = new ii("EXISTING_USERNAME", 37, "ExistingUsername");
        M = new ii("NEEDS_BROWSER", 38, "NeedsBrowser");
        N = new ii("GPLUS_OTHER", 39, "GPlusOther");
        O = new ii("GPLUS_NICKNAME", 40, "GPlusNickname");
        P = new ii("GPLUS_INVALID_CHAR", 41, "GPlusInvalidChar");
        Q = new ii("GPLUS_INTERSTITIAL", 42, "GPlusInterstitial");
        R = new ii("GPLUS_PROFILE_ERROR", 43, "ProfileUpgradeError");
        S = new ii("INVALID_SCOPE", 44, "INVALID_SCOPE");
        V = (new ii[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S
        });
    }
}
