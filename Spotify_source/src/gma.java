// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONArray;

public final class gma
{

    public final String A;
    public final String B;
    public final int C;
    public final long D;
    public final String E;
    public final String F;
    public final boolean G;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final UUID Q;
    public final long R;
    private String S;
    private String T;
    private boolean U;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final long m;
    public final long n;
    public final long o;
    public final int p;
    public final long q;
    public final int r;
    public final long s;
    public final long t;
    public final long u;
    public final boolean v;
    public final long w;
    public final long x;
    public final String y;
    public final boolean z;

    private gma(gmb gmb1)
    {
        S = gmb.a(gmb1);
        T = gmb.b(gmb1);
        a = gmb.c(gmb1);
        b = gmb.d(gmb1);
        d = gmb.e(gmb1);
        c = gmb.f(gmb1);
        e = gmb.g(gmb1);
        f = gmb.h(gmb1);
        g = gmb.i(gmb1);
        h = gmb.j(gmb1);
        i = gmb.k(gmb1);
        j = gmb.l(gmb1);
        k = gmb.m(gmb1);
        l = gmb.n(gmb1);
        m = gmb.o(gmb1);
        n = gmb.p(gmb1);
        o = gmb.q(gmb1);
        p = gmb.r(gmb1);
        q = gmb.s(gmb1);
        r = gmb.t(gmb1);
        s = gmb.u(gmb1);
        t = gmb.v(gmb1);
        u = gmb.w(gmb1);
        v = gmb.x(gmb1);
        U = gmb.b();
        w = gmb.y(gmb1);
        x = gmb.z(gmb1);
        C = gmb.A(gmb1);
        D = gmb.B(gmb1);
        E = gmb.C(gmb1);
        F = gmb.D(gmb1);
        G = gmb.E(gmb1);
        H = gmb.F(gmb1);
        I = gmb.G(gmb1);
        J = gmb.H(gmb1);
        K = gmb.I(gmb1);
        L = gmb.J(gmb1);
        M = gmb.K(gmb1);
        N = gmb.L(gmb1);
        z = gmb.M(gmb1);
        y = gmb.N(gmb1);
        A = gmb.O(gmb1);
        B = gmb.P(gmb1);
        O = gmb.Q(gmb1);
        P = gmb.R(gmb1);
        Q = gmb.S(gmb1);
        R = gmb.T(gmb1);
    }

    gma(gmb gmb1, byte byte0)
    {
        this(gmb1);
    }

    public static String a(Throwable throwable)
    {
        ArrayList arraylist = new ArrayList();
        if (throwable != null)
        {
            for (throwable = throwable.getCause(); throwable != null; throwable = throwable.getCause())
            {
                arraylist.add(throwable.getClass().getSimpleName());
            }

        }
        return (new JSONArray(arraylist)).toString();
    }

    private static byte[] a(String s1)
    {
        int j1 = s1.length();
        byte abyte0[] = new byte[j1 / 2];
        for (int i1 = 0; i1 < j1; i1 += 2)
        {
            abyte0[i1 / 2] = (byte)((Character.digit(s1.charAt(i1), 16) << 4) + Character.digit(s1.charAt(i1 + 1), 16));
        }

        return abyte0;
    }

    public static gma d()
    {
        return (new gmb("N/A")).a();
    }

    public final byte[] a()
    {
        return a(T);
    }

    public final byte[] b()
    {
        return a(S);
    }

    public final boolean c()
    {
        return "N/A".equals(T);
    }

    public final String toString()
    {
        return (new StringBuilder("PlaybackReport{mManifestId='")).append(S).append('\'').append(", mPlaybackId='").append(T).append('\'').append(", mFeatureIdentifier='").append(a).append('\'').append(", mFeatureVersion='").append(b).append('\'').append(", mContextUri='").append(c).append('\'').append(", mViewUri='").append(d).append('\'').append(", mGaiaDeviceId='").append(e).append('\'').append(", mProvider='").append(f).append('\'').append(", mReferrer='").append(g).append('\'').append(", mReferrerVersion='").append(h).append('\'').append(", mReferrerVendor='").append(i).append('\'').append(", mStreamingRule='").append(j).append('\'').append(", mReasonEnd='").append(k).append('\'').append(", mReasonStart='").append(l).append('\'').append(", mMsPlayed=").append(m).append(", mMsTotalEstimated=").append(n).append(", mMsManifestLatency=").append(o).append(", mNSeekBack=").append(p).append(", mMsSeekBack=").append(q).append(", mNSeekForward=").append(r).append(", mMsSeekForward=").append(s).append(", mMsLatency=").append(t).append(", mMsUiLatency=").append(u).append(", mSkipped=").append(v).append(", mShuffle=").append(U).append(", mMsMaxContinuous=").append(w).append(", mMsUnionPlayed=").append(x).append(", mPlayedTrack='").append(y).append('\'').append(", mPrivateSession=").append(z).append(", mAudioCodec='").append(A).append('\'').append(", mVideoCodec='").append(B).append('\'').append(", mNStalls=").append(C).append(", mTimeWeightedBitrate=").append(D).append(", mStartConnectionType='").append(E).append('\'').append(", mEndConnectionType='").append(F).append('\'').append(", mIsTrackingOngoing=").append(G).append(", mMsStalled=").append(H).append(", mStartOffsetMs=").append(I).append(", mMsInitialBuffering=").append(J).append(", mMsSeekRebuffering=").append(K).append(", mMaxMsSeekRebuffering=").append(L).append(", mMaxMsStalled=").append(M).append(", mPrefetchedBytesLoaded=").append(N).append(", mInitialBitrate=").append(O).append(", mMsFullscreen=").append(P).append(", mDrmScheme=").append(Q).append(", mMsKeyLatency=").append(R).append('}').toString();
    }
}
