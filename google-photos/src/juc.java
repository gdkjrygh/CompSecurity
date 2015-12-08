// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class juc extends Enum
{

    private static juc A;
    private static juc B;
    private static juc C;
    private static juc D;
    private static juc E;
    private static juc F;
    private static juc G;
    private static juc H;
    private static juc I;
    private static juc J;
    private static juc K;
    private static juc L;
    private static juc M;
    private static juc N;
    private static juc O;
    private static juc P;
    private static juc Q;
    private static juc R;
    private static juc S;
    private static juc T;
    private static juc U;
    private static juc V;
    private static juc W;
    private static final juc X[];
    public static final juc a;
    public static final juc b;
    public static final juc c;
    public static final juc d;
    public static final juc e;
    public static final juc f;
    public static final juc g;
    private static juc i;
    private static juc j;
    private static juc k;
    private static juc l;
    private static juc m;
    private static juc n;
    private static juc o;
    private static juc p;
    private static juc q;
    private static juc r;
    private static juc s;
    private static juc t;
    private static juc u;
    private static juc v;
    private static juc w;
    private static juc x;
    private static juc y;
    private static juc z;
    public final String h;

    private juc(String s1, int i1, String s2)
    {
        super(s1, i1);
        h = s2;
    }

    public static juc valueOf(String s1)
    {
        return (juc)Enum.valueOf(juc, s1);
    }

    public static juc[] values()
    {
        return (juc[])X.clone();
    }

    static 
    {
        i = new juc("SUCCESS", 0, "Ok");
        j = new juc("BAD_AUTHENTICATION", 1, "BadAuthentication");
        k = new juc("EMPTY_CONSUMER_PKG_OR_SIG", 2, "EmptyConsumerPackageOrSig");
        l = new juc("NEEDS_2F", 3, "InvalidSecondFactor");
        m = new juc("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
        n = new juc("NOT_VERIFIED", 5, "NotVerified");
        o = new juc("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
        p = new juc("UNKNOWN", 7, "Unknown");
        q = new juc("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
        r = new juc("ACCOUNT_DELETED", 9, "AccountDeleted");
        s = new juc("ACCOUNT_DISABLED", 10, "AccountDisabled");
        t = new juc("SERVICE_DISABLED", 11, "ServiceDisabled");
        u = new juc("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
        v = new juc("CAPTCHA", 13, "CaptchaRequired");
        w = new juc("NETWORK_ERROR", 14, "NetworkError");
        x = new juc("USER_CANCEL", 15, "UserCancel");
        y = new juc("PERMISSION_DENIED", 16, "PermissionDenied");
        z = new juc("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
        a = new juc("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
        A = new juc("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
        b = new juc("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
        c = new juc("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
        d = new juc("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
        e = new juc("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
        f = new juc("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
        g = new juc("DM_REQUIRED", 25, "DeviceManagementRequired");
        B = new juc("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
        C = new juc("NEED_PERMISSION", 27, "NeedPermission");
        D = new juc("BAD_PASSWORD", 28, "WeakPassword");
        E = new juc("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
        F = new juc("BAD_REQUEST", 30, "BadRequest");
        G = new juc("BAD_USERNAME", 31, "BadUsername");
        H = new juc("LOGIN_FAIL", 32, "LoginFail");
        I = new juc("NOT_LOGGED_IN", 33, "NotLoggedIn");
        J = new juc("NO_GMAIL", 34, "NoGmail");
        K = new juc("REQUEST_DENIED", 35, "RequestDenied");
        L = new juc("SERVER_ERROR", 36, "ServerError");
        M = new juc("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
        N = new juc("DELETED_GMAIL", 38, "DeletedGmail");
        O = new juc("SOCKET_TIMEOUT", 39, "SocketTimeout");
        P = new juc("EXISTING_USERNAME", 40, "ExistingUsername");
        Q = new juc("NEEDS_BROWSER", 41, "NeedsBrowser");
        R = new juc("GPLUS_OTHER", 42, "GPlusOther");
        S = new juc("GPLUS_NICKNAME", 43, "GPlusNickname");
        T = new juc("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
        U = new juc("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
        V = new juc("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
        W = new juc("INVALID_SCOPE", 47, "INVALID_SCOPE");
        X = (new juc[] {
            i, j, k, l, m, n, o, p, q, r, 
            s, t, u, v, w, x, y, z, a, A, 
            b, c, d, e, f, g, B, C, D, E, 
            F, G, H, I, J, K, L, M, N, O, 
            P, Q, R, S, T, U, V, W
        });
    }
}
