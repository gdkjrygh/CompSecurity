// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class alc extends Enum
{

    public static final alc A;
    public static final alc B;
    public static final alc C;
    public static final alc D;
    public static final alc E;
    public static final alc F;
    public static final alc G;
    public static final alc H;
    public static final alc I;
    public static final alc J;
    public static final alc K;
    public static final alc L;
    public static final alc M;
    public static final alc N;
    public static final alc O;
    public static final alc P;
    public static final alc Q;
    public static final alc R;
    public static final alc S;
    public static final alc T;
    public static final alc U;
    public static final alc V;
    public static String W = "Error";
    public static String X = "status";
    private static final alc Z[];
    public static final alc a;
    public static final alc b;
    public static final alc c;
    public static final alc d;
    public static final alc e;
    public static final alc f;
    public static final alc g;
    public static final alc h;
    public static final alc i;
    public static final alc j;
    public static final alc k;
    public static final alc l;
    public static final alc m;
    public static final alc n;
    public static final alc o;
    public static final alc p;
    public static final alc q;
    public static final alc r;
    public static final alc s;
    public static final alc t;
    public static final alc u;
    public static final alc v;
    public static final alc w;
    public static final alc x;
    public static final alc y;
    public static final alc z;
    private final String Y;

    private alc(String s1, int i1, String s2)
    {
        super(s1, i1);
        Y = s2;
    }

    public static alc valueOf(String s1)
    {
        return (alc)Enum.valueOf(alc, s1);
    }

    public static alc[] values()
    {
        return (alc[])Z.clone();
    }

    public final String a()
    {
        return Y;
    }

    static 
    {
        a = new alc("SUCCESS", 0, "Ok");
        b = new alc("BAD_AUTHENTICATION", 1, "BadAuthentication");
        c = new alc("EMPTY_CONSUMER_PKG_OR_SIG", 2, "EmptyConsumerPackageOrSig");
        d = new alc("NEEDS_2F", 3, "InvalidSecondFactor");
        e = new alc("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
        f = new alc("NOT_VERIFIED", 5, "NotVerified");
        g = new alc("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
        h = new alc("UNKNOWN", 7, "Unknown");
        i = new alc("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
        j = new alc("ACCOUNT_DELETED", 9, "AccountDeleted");
        k = new alc("ACCOUNT_DISABLED", 10, "AccountDisabled");
        l = new alc("SERVICE_DISABLED", 11, "ServiceDisabled");
        m = new alc("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
        n = new alc("CAPTCHA", 13, "CaptchaRequired");
        o = new alc("NETWORK_ERROR", 14, "NetworkError");
        p = new alc("USER_CANCEL", 15, "UserCancel");
        q = new alc("PERMISSION_DENIED", 16, "PermissionDenied");
        r = new alc("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
        s = new alc("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
        t = new alc("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
        u = new alc("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
        v = new alc("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
        w = new alc("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
        x = new alc("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
        y = new alc("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
        z = new alc("DM_REQUIRED", 25, "DeviceManagementRequired");
        A = new alc("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
        B = new alc("NEED_PERMISSION", 27, "NeedPermission");
        C = new alc("BAD_PASSWORD", 28, "WeakPassword");
        D = new alc("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
        E = new alc("BAD_REQUEST", 30, "BadRequest");
        F = new alc("BAD_USERNAME", 31, "BadUsername");
        G = new alc("LOGIN_FAIL", 32, "LoginFail");
        H = new alc("NOT_LOGGED_IN", 33, "NotLoggedIn");
        I = new alc("NO_GMAIL", 34, "NoGmail");
        J = new alc("REQUEST_DENIED", 35, "RequestDenied");
        K = new alc("SERVER_ERROR", 36, "ServerError");
        L = new alc("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
        M = new alc("DELETED_GMAIL", 38, "DeletedGmail");
        N = new alc("SOCKET_TIMEOUT", 39, "SocketTimeout");
        O = new alc("EXISTING_USERNAME", 40, "ExistingUsername");
        P = new alc("NEEDS_BROWSER", 41, "NeedsBrowser");
        Q = new alc("GPLUS_OTHER", 42, "GPlusOther");
        R = new alc("GPLUS_NICKNAME", 43, "GPlusNickname");
        S = new alc("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
        T = new alc("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
        U = new alc("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
        V = new alc("INVALID_SCOPE", 47, "INVALID_SCOPE");
        Z = (new alc[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V
        });
    }
}
