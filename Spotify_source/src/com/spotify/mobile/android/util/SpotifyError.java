// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.content.Context;

// Referenced classes of package com.spotify.mobile.android.util:
//            Assertion

public final class SpotifyError extends Enum
{

    private static SpotifyError A;
    private static SpotifyError B;
    private static SpotifyError C;
    private static SpotifyError D;
    private static SpotifyError E;
    private static SpotifyError F;
    private static SpotifyError G;
    private static SpotifyError H;
    private static SpotifyError I;
    private static SpotifyError J;
    private static SpotifyError K;
    private static SpotifyError L;
    private static SpotifyError M;
    private static SpotifyError N;
    private static SpotifyError O;
    private static SpotifyError P;
    private static SpotifyError Q;
    private static SpotifyError R;
    private static SpotifyError S;
    private static SpotifyError T;
    private static SpotifyError U;
    private static SpotifyError V;
    private static SpotifyError W;
    private static SpotifyError X;
    private static final SpotifyError Y[];
    public static final SpotifyError a;
    public static final SpotifyError b;
    public static final SpotifyError c;
    public static final SpotifyError d;
    public static final SpotifyError e;
    private static SpotifyError f;
    private static SpotifyError g;
    private static SpotifyError h;
    private static SpotifyError i;
    private static SpotifyError j;
    private static SpotifyError k;
    private static SpotifyError l;
    private static SpotifyError m;
    private static SpotifyError n;
    private static SpotifyError o;
    private static SpotifyError p;
    private static SpotifyError q;
    private static SpotifyError r;
    private static SpotifyError s;
    private static SpotifyError t;
    private static SpotifyError u;
    private static SpotifyError v;
    private static SpotifyError w;
    private static SpotifyError x;
    private static SpotifyError y;
    private static SpotifyError z;
    public int mCode;
    private int mResourceId;

    private SpotifyError(String s1, int i1, int j1, int k1)
    {
        super(s1, i1);
        mCode = j1;
        mResourceId = k1;
    }

    public static SpotifyError a(int i1)
    {
        SpotifyError aspotifyerror[] = values();
        int k1 = aspotifyerror.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            SpotifyError spotifyerror = aspotifyerror[j1];
            if (spotifyerror.mCode == i1)
            {
                return spotifyerror;
            }
        }

        Assertion.b((new StringBuilder("Have no definition for errorcode ")).append(i1).toString());
        return e;
    }

    public static SpotifyError valueOf(String s1)
    {
        return (SpotifyError)Enum.valueOf(com/spotify/mobile/android/util/SpotifyError, s1);
    }

    public static SpotifyError[] values()
    {
        return (SpotifyError[])Y.clone();
    }

    public final String a(Context context)
    {
        return context.getString(mResourceId);
    }

    static 
    {
        a = new SpotifyError("SUCCESS", 0, 0, 0);
        f = new SpotifyError("DNS", 1, 4, 0x7f08029f);
        g = new SpotifyError("OUT_OF_DISK_SPACE", 2, 8, 0x7f0802b2);
        h = new SpotifyError("OFFLINE_EXPIRED", 3, 14, 0x7f0802af);
        i = new SpotifyError("TOO_MANY_TRACKS", 4, 19, 0x7f0802b3);
        j = new SpotifyError("OFFLINE_LICENSE_SERVER_ERROR", 5, 21, 0x7f08029e);
        k = new SpotifyError("OFFLINE_LICENSE_LOST", 6, 22, 0x7f0802ae);
        b = new SpotifyError("OFFLINE_NOT_ALLOWED", 7, 23, 0x7f0802b0);
        l = new SpotifyError("OFFLINE_SYNC_CONNECTION_DISABLED", 8, 36, 0x7f0802b1);
        m = new SpotifyError("AP_SOCKET", 9, 101, 0x7f08029f);
        n = new SpotifyError("AP_PROTOCOL", 10, 102, 0x7f08029f);
        o = new SpotifyError("AP_UNKNOWN", 11, 103, 0x7f08029e);
        p = new SpotifyError("AP_NOT_AVAILABLE", 12, 104, 0x7f08029e);
        q = new SpotifyError("AP_CHANNEL", 13, 105, 0x7f08029e);
        r = new SpotifyError("AP_CHANNEL_TEMP", 14, 106, 0x7f08029e);
        s = new SpotifyError("AP_CHANNEL_UNKNOWN", 15, 107, 0x7f08029e);
        t = new SpotifyError("AP_CANT_RESOLVE_PROXY", 16, 108, 0x7f08029e);
        u = new SpotifyError("AP_NO_AUTHMETHOD", 17, 110, 0x7f08029e);
        v = new SpotifyError("AP_SIGNATURE", 18, 111, 0x7f08029e);
        w = new SpotifyError("AP_SOCKET_RESET", 19, 112, 0x7f08029e);
        x = new SpotifyError("AP_SOCKET_TIMEOUT", 20, 113, 0x7f08029e);
        y = new SpotifyError("AP_PING_TIMEOUT", 21, 114, 0x7f08029e);
        z = new SpotifyError("AP_ESTABLISH_TIMEOUT", 22, 115, 0x7f08029e);
        A = new SpotifyError("AP_LOGIN_TIMEOUT", 23, 116, 0x7f08029e);
        B = new SpotifyError("AP_TCPSOCKET_TIMEOUT", 24, 117, 0x7f08029e);
        C = new SpotifyError("AP_BAD_INTERLEAVE_SIZE", 25, 118, 0x7f08029e);
        D = new SpotifyError("AP_MISSING_SUBSTREAMSIZE", 26, 119, 0x7f08029e);
        E = new SpotifyError("AP_BAD_SUBSTREAMSIZE", 27, 120, 0x7f08029e);
        F = new SpotifyError("AP_GOT_TOO_LITTLE_DATA", 28, 121, 0x7f08029e);
        G = new SpotifyError("AP_GOT_TOO_MUCH_DATA", 29, 122, 0x7f08029e);
        H = new SpotifyError("AP_BLOCK_IDX_MISMATCH", 30, 123, 0x7f08029e);
        I = new SpotifyError("AP_BLOCK_IDX_TOOLARGE", 31, 124, 0x7f08029e);
        J = new SpotifyError("AP_BAD_MASK", 32, 125, 0x7f08029e);
        c = new SpotifyError("AP_NETWORK_DISABLED", 33, 126, 0x7f08029e);
        K = new SpotifyError("AP_PASSWORD_CHANGED", 34, 127, 0x7f08029e);
        L = new SpotifyError("LOGIN_USERPASS", 35, 401, 0x7f0802a3);
        M = new SpotifyError("LOGIN_TOO_OLD", 36, 402, 0x7f0802a9);
        N = new SpotifyError("LOGIN_USER_DISABLED", 37, 403, 0x7f0802ab);
        O = new SpotifyError("LOGIN_TEMP_APERROR", 38, 404, 0x7f08029e);
        P = new SpotifyError("LOGIN_PROTOCOL", 39, 405, 0x7f0802a7);
        Q = new SpotifyError("LOGIN_FORBIDDEN_SERVICE", 40, 406, 0x7f0802a4);
        R = new SpotifyError("LOGIN_MISSING_USER_INFO", 41, 407, 0x7f0802a5);
        S = new SpotifyError("LOGIN_REGION_MISMATCH", 42, 408, 0x7f0802a8);
        T = new SpotifyError("LOGIN_NEEDS_PREMIUM", 43, 409, 0x7f0802a6);
        U = new SpotifyError("LOGIN_BAD_CREDENTIALS", 44, 410, 0x7f0802a3);
        V = new SpotifyError("LOGIN_BAD_CONNECTION_ID", 45, 411, 0x7f08029e);
        W = new SpotifyError("LOGIN_INVALID_CREDENTIALS", 46, 412, 0x7f08029e);
        X = new SpotifyError("LOGIN_ACCOUNT_EXISTS", 47, 413, 0x7f0802a2);
        d = new SpotifyError("LOGIN_UNKNOWN_ERROR", 48, 417, 0x7f0802aa);
        e = new SpotifyError("UNKNOWN", 49, -1, 0x7f0802b4);
        Y = (new SpotifyError[] {
            a, f, g, h, i, j, k, b, l, m, 
            n, o, p, q, r, s, t, u, v, w, 
            x, y, z, A, B, C, D, E, F, G, 
            H, I, J, c, K, L, M, N, O, P, 
            Q, R, S, T, U, V, W, X, d, e
        });
    }
}
