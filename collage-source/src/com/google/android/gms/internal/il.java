// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class il extends Enum
{

    public static final il A;
    public static final il B;
    public static final il C;
    public static final il D;
    public static final il E;
    public static final il F;
    public static final il G;
    public static final il H;
    public static final il I;
    public static final il J;
    public static final il K;
    public static final il L;
    public static final il M;
    public static final il N;
    public static final il O;
    public static final il P;
    public static final il Q;
    public static final il R;
    public static final il S;
    public static final il T;
    public static final il U;
    public static final il V;
    private static final il X[];
    public static final il a;
    public static final il b;
    public static final il c;
    public static final il d;
    public static final il e;
    public static final il f;
    public static final il g;
    public static final il h;
    public static final il i;
    public static final il j;
    public static final il k;
    public static final il l;
    public static final il m;
    public static final il n;
    public static final il o;
    public static final il p;
    public static final il q;
    public static final il r;
    public static final il s;
    public static final il t;
    public static final il u;
    public static final il v;
    public static final il w;
    public static final il x;
    public static final il y;
    public static final il z;
    private final String W;

    private il(String s1, int i1, String s2)
    {
        super(s1, i1);
        W = s2;
    }

    public static il valueOf(String s1)
    {
        return (il)Enum.valueOf(com/google/android/gms/internal/il, s1);
    }

    public static il[] values()
    {
        return (il[])X.clone();
    }

    public String a()
    {
        return W;
    }

    static 
    {
        a = new il("SUCCESS", 0, "Ok");
        b = new il("BAD_AUTHENTICATION", 1, "BadAuthentication");
        c = new il("EMPTY_CONSUMER_PKG_OR_SIG", 2, "EmptyConsumerPackageOrSig");
        d = new il("NEEDS_2F", 3, "InvalidSecondFactor");
        e = new il("NEEDS_POST_SIGN_IN_FLOW", 4, "PostSignInFlowRequired");
        f = new il("NOT_VERIFIED", 5, "NotVerified");
        g = new il("TERMS_NOT_AGREED", 6, "TermsNotAgreed");
        h = new il("UNKNOWN", 7, "Unknown");
        i = new il("UNKNOWN_ERROR", 8, "UNKNOWN_ERR");
        j = new il("ACCOUNT_DELETED", 9, "AccountDeleted");
        k = new il("ACCOUNT_DISABLED", 10, "AccountDisabled");
        l = new il("SERVICE_DISABLED", 11, "ServiceDisabled");
        m = new il("SERVICE_UNAVAILABLE", 12, "ServiceUnavailable");
        n = new il("CAPTCHA", 13, "CaptchaRequired");
        o = new il("NETWORK_ERROR", 14, "NetworkError");
        p = new il("USER_CANCEL", 15, "UserCancel");
        q = new il("PERMISSION_DENIED", 16, "PermissionDenied");
        r = new il("DEVICE_MANAGEMENT_REQUIRED", 17, "DeviceManagementRequiredOrSyncDisabled");
        s = new il("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 18, "ThirdPartyDeviceManagementRequired");
        t = new il("DM_INTERNAL_ERROR", 19, "DeviceManagementInternalError");
        u = new il("DM_SYNC_DISABLED", 20, "DeviceManagementSyncDisabled");
        v = new il("DM_ADMIN_BLOCKED", 21, "DeviceManagementAdminBlocked");
        w = new il("DM_ADMIN_PENDING_APPROVAL", 22, "DeviceManagementAdminPendingApproval");
        x = new il("DM_STALE_SYNC_REQUIRED", 23, "DeviceManagementStaleSyncRequired");
        y = new il("DM_DEACTIVATED", 24, "DeviceManagementDeactivated");
        z = new il("DM_REQUIRED", 25, "DeviceManagementRequired");
        A = new il("CLIENT_LOGIN_DISABLED", 26, "ClientLoginDisabled");
        B = new il("NEED_PERMISSION", 27, "NeedPermission");
        C = new il("BAD_PASSWORD", 28, "WeakPassword");
        D = new il("ALREADY_HAS_GMAIL", 29, "ALREADY_HAS_GMAIL");
        E = new il("BAD_REQUEST", 30, "BadRequest");
        F = new il("BAD_USERNAME", 31, "BadUsername");
        G = new il("LOGIN_FAIL", 32, "LoginFail");
        H = new il("NOT_LOGGED_IN", 33, "NotLoggedIn");
        I = new il("NO_GMAIL", 34, "NoGmail");
        J = new il("REQUEST_DENIED", 35, "RequestDenied");
        K = new il("SERVER_ERROR", 36, "ServerError");
        L = new il("USERNAME_UNAVAILABLE", 37, "UsernameUnavailable");
        M = new il("DELETED_GMAIL", 38, "DeletedGmail");
        N = new il("SOCKET_TIMEOUT", 39, "SocketTimeout");
        O = new il("EXISTING_USERNAME", 40, "ExistingUsername");
        P = new il("NEEDS_BROWSER", 41, "NeedsBrowser");
        Q = new il("GPLUS_OTHER", 42, "GPlusOther");
        R = new il("GPLUS_NICKNAME", 43, "GPlusNickname");
        S = new il("GPLUS_INVALID_CHAR", 44, "GPlusInvalidChar");
        T = new il("GPLUS_INTERSTITIAL", 45, "GPlusInterstitial");
        U = new il("GPLUS_PROFILE_ERROR", 46, "ProfileUpgradeError");
        V = new il("INVALID_SCOPE", 47, "INVALID_SCOPE");
        X = (new il[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V
        });
    }
}
