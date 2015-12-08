// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;


public final class i extends Enum
{

    public static final i A;
    public static final i B;
    public static final i C;
    public static final i D;
    public static final i E;
    public static final i F;
    public static final i G;
    public static final i H;
    public static final i I;
    public static final i J;
    public static final i K;
    public static final i L;
    public static final i M;
    public static final i N;
    public static final i O;
    public static final i P;
    public static final i Q;
    public static final i R;
    public static final i S;
    public static final i T;
    public static final i U;
    public static final i V;
    private static final i X[];
    public static final i a;
    public static final i b;
    public static final i c;
    public static final i d;
    public static final i e;
    public static final i f;
    public static final i g;
    public static final i h;
    public static final i i;
    public static final i j;
    public static final i k;
    public static final i l;
    public static final i m;
    public static final i n;
    public static final i o;
    public static final i p;
    public static final i q;
    public static final i r;
    public static final i s;
    public static final i t;
    public static final i u;
    public static final i v;
    public static final i w;
    public static final i x;
    public static final i y;
    public static final i z;
    public final String W;

    private i(String s1, int i1, String s2)
    {
        super(s1, i1);
        W = s2;
    }

    public static i valueOf(String s1)
    {
        return (i)Enum.valueOf(com/google/android/gms/b/i, s1);
    }

    public static i[] values()
    {
        return (i[])X.clone();
    }

    static 
    {
        a = new i("SUCCESS", 0, "Ok");
        b = new i("BAD_AUTHENTICATION", 1, "BadAuthentication");
        c = new i("EMPTY_CONSUMER_PKG_OR_SIG", 2, "EmptyConsumerPackageOrSig");
        d = new i("NEEDS_2F", 3, "InvalidSecondFactor");
        e = new i("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
        f = new i("NOT_VERIFIED", 5, "NotVerified");
        g = new i("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
        h = new i("UNKNOWN", 7, "Unknown");
        i = new i("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
        j = new i("ACCOUNT_DELETED", 9, "AccountDeleted");
        k = new i("ACCOUNT_DISABLED", 10, "AccountDisabled");
        l = new i("SERVICE_DISABLED", 11, "ServiceDisabled");
        m = new i("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
        n = new i("CAPTCHA", 13, "CaptchaRequired");
        o = new i("NETWORK_ERROR", 14, "NetworkError");
        p = new i("USER_CANCEL", 15, "UserCancel");
        q = new i("PERMISSION_DENIED", 16, "PermissionDenied");
        r = new i("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
        s = new i("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
        t = new i("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
        u = new i("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
        v = new i("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
        w = new i("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
        x = new i("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
        y = new i("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
        z = new i("DM_REQUIRED", 25, "DeviceManagementRequired");
        A = new i("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
        B = new i("NEED_PERMISSION", 27, "NeedPermission");
        C = new i("BAD_PASSWORD", 28, "WeakPassword");
        D = new i("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
        E = new i("BAD_REQUEST", 30, "BadRequest");
        F = new i("BAD_USERNAME", 31, "BadUsername");
        G = new i("LOGIN_FAIL", 32, "LoginFail");
        H = new i("NOT_LOGGED_IN", 33, "NotLoggedIn");
        I = new i("NO_GMAIL", 34, "NoGmail");
        J = new i("REQUEST_DENIED", 35, "RequestDenied");
        K = new i("SERVER_ERROR", 36, "ServerError");
        L = new i("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
        M = new i("DELETED_GMAIL", 38, "DeletedGmail");
        N = new i("SOCKET_TIMEOUT", 39, "SocketTimeout");
        O = new i("EXISTING_USERNAME", 40, "ExistingUsername");
        P = new i("NEEDS_BROWSER", 41, "NeedsBrowser");
        Q = new i("GPLUS_OTHER", 42, "GPlusOther");
        R = new i("GPLUS_NICKNAME", 43, "GPlusNickname");
        S = new i("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
        T = new i("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
        U = new i("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
        V = new i("INVALID_SCOPE", 47, "INVALID_SCOPE");
        X = (new i[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V
        });
    }
}
