// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;


public final class d extends Enum
{

    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;
    public static final d G;
    public static final d H;
    public static final d I;
    public static final d J;
    public static final d K;
    public static final d L;
    public static final d M;
    public static final d N;
    public static final d O;
    public static final d P;
    public static final d Q;
    public static final d R;
    public static final d S;
    public static final d T;
    public static final d U;
    public static final d V;
    public static final d W;
    private static final d Y[];
    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final d r;
    public static final d s;
    public static final d t;
    public static final d u;
    public static final d v;
    public static final d w;
    public static final d x;
    public static final d y;
    public static final d z;
    private final String X;

    private d(String s1, int i1, String s2)
    {
        super(s1, i1);
        X = s2;
    }

    public static final d a(String s1)
    {
        d d1 = null;
        d ad[] = values();
        int j1 = ad.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            d d2 = ad[i1];
            if (d2.X.equals(s1))
            {
                d1 = d2;
            }
        }

        return d1;
    }

    public static boolean a(d d1)
    {
label0:
        {
            boolean flag1 = false;
            if (!i.equals(d1) && !r.equals(d1) && !u.equals(d1) && !m.equals(d1) && !w.equals(d1) && !y.equals(d1))
            {
                boolean flag;
                if (b.equals(d1) || z.equals(d1) || A.equals(d1) || B.equals(d1) || C.equals(d1) || D.equals(d1) || E.equals(d1) || F.equals(d1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    public static boolean b(d d1)
    {
        return f.equals(d1) || g.equals(d1);
    }

    public static d valueOf(String s1)
    {
        return (d)Enum.valueOf(com/google/android/gms/auth/firstparty/shared/d, s1);
    }

    public static d[] values()
    {
        return (d[])Y.clone();
    }

    static 
    {
        a = new d("CLIENT_LOGIN_DISABLED", 0, "ClientLoginDisabled");
        b = new d("DEVICE_MANAGEMENT_REQUIRED", 1, "DeviceManagementRequiredOrSyncDisabled");
        c = new d("SOCKET_TIMEOUT", 2, "SocketTimeout");
        d = new d("SUCCESS", 3, "Ok");
        e = new d("UNKNOWN_ERROR", 4, "UNKNOWN_ERR");
        f = new d("NETWORK_ERROR", 5, "NetworkError");
        g = new d("SERVICE_UNAVAILABLE", 6, "ServiceUnavailable");
        h = new d("INTNERNAL_ERROR", 7, "InternalError");
        i = new d("BAD_AUTHENTICATION", 8, "BadAuthentication");
        j = new d("EMPTY_CONSUMER_PKG_OR_SIG", 9, "EmptyConsumerPackageOrSig");
        k = new d("NEEDS_2F", 10, "InvalidSecondFactor");
        l = new d("NEEDS_POST_SIGN_IN_FLOW", 11, "PostSignInFlowRequired");
        m = new d("NEEDS_BROWSER", 12, "NeedsBrowser");
        n = new d("UNKNOWN", 13, "Unknown");
        o = new d("NOT_VERIFIED", 14, "NotVerified");
        p = new d("TERMS_NOT_AGREED", 15, "TermsNotAgreed");
        q = new d("ACCOUNT_DISABLED", 16, "AccountDisabled");
        r = new d("CAPTCHA", 17, "CaptchaRequired");
        s = new d("ACCOUNT_DELETED", 18, "AccountDeleted");
        t = new d("SERVICE_DISABLED", 19, "ServiceDisabled");
        u = new d("NEED_PERMISSION", 20, "NeedPermission");
        v = new d("INVALID_SCOPE", 21, "INVALID_SCOPE");
        w = new d("USER_CANCEL", 22, "UserCancel");
        x = new d("PERMISSION_DENIED", 23, "PermissionDenied");
        y = new d("THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED", 24, "ThirdPartyDeviceManagementRequired");
        z = new d("DM_INTERNAL_ERROR", 25, "DeviceManagementInternalError");
        A = new d("DM_SYNC_DISABLED", 26, "DeviceManagementSyncDisabled");
        B = new d("DM_ADMIN_BLOCKED", 27, "DeviceManagementAdminBlocked");
        C = new d("DM_ADMIN_PENDING_APPROVAL", 28, "DeviceManagementAdminPendingApproval");
        D = new d("DM_STALE_SYNC_REQUIRED", 29, "DeviceManagementStaleSyncRequired");
        E = new d("DM_DEACTIVATED", 30, "DeviceManagementDeactivated");
        F = new d("DM_REQUIRED", 31, "DeviceManagementRequired");
        G = new d("ALREADY_HAS_GMAIL", 32, "ALREADY_HAS_GMAIL");
        H = new d("BAD_PASSWORD", 33, "WeakPassword");
        I = new d("BAD_REQUEST", 34, "BadRequest");
        J = new d("BAD_USERNAME", 35, "BadUsername");
        K = new d("DELETED_GMAIL", 36, "DeletedGmail");
        L = new d("EXISTING_USERNAME", 37, "ExistingUsername");
        M = new d("LOGIN_FAIL", 38, "LoginFail");
        N = new d("NOT_LOGGED_IN", 39, "NotLoggedIn");
        O = new d("NO_GMAIL", 40, "NoGmail");
        P = new d("REQUEST_DENIED", 41, "RequestDenied");
        Q = new d("SERVER_ERROR", 42, "ServerError");
        R = new d("USERNAME_UNAVAILABLE", 43, "UsernameUnavailable");
        S = new d("GPLUS_OTHER", 44, "GPlusOther");
        T = new d("GPLUS_NICKNAME", 45, "GPlusNickname");
        U = new d("GPLUS_INVALID_CHAR", 46, "GPlusInvalidChar");
        V = new d("GPLUS_INTERSTITIAL", 47, "GPlusInterstitial");
        W = new d("GPLUS_PROFILE_ERROR", 48, "ProfileUpgradeError");
        Y = (new d[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W
        });
    }
}
