// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import com.tremorvideo.sdk.android.c.aa;
import com.tremorvideo.sdk.android.c.ab;
import com.tremorvideo.sdk.android.c.ac;
import com.tremorvideo.sdk.android.c.ad;
import com.tremorvideo.sdk.android.c.ae;
import com.tremorvideo.sdk.android.c.af;
import com.tremorvideo.sdk.android.c.ag;
import com.tremorvideo.sdk.android.c.ah;
import com.tremorvideo.sdk.android.c.ai;
import com.tremorvideo.sdk.android.c.aj;
import com.tremorvideo.sdk.android.c.ak;
import com.tremorvideo.sdk.android.c.al;
import com.tremorvideo.sdk.android.c.am;
import com.tremorvideo.sdk.android.c.an;
import com.tremorvideo.sdk.android.c.ao;
import com.tremorvideo.sdk.android.c.ap;
import com.tremorvideo.sdk.android.c.aq;
import com.tremorvideo.sdk.android.c.ar;
import com.tremorvideo.sdk.android.c.as;
import com.tremorvideo.sdk.android.c.at;
import com.tremorvideo.sdk.android.c.au;
import com.tremorvideo.sdk.android.c.av;
import com.tremorvideo.sdk.android.c.aw;
import com.tremorvideo.sdk.android.c.b;
import com.tremorvideo.sdk.android.c.c;
import com.tremorvideo.sdk.android.c.d;
import com.tremorvideo.sdk.android.c.e;
import com.tremorvideo.sdk.android.c.f;
import com.tremorvideo.sdk.android.c.g;
import com.tremorvideo.sdk.android.c.h;
import com.tremorvideo.sdk.android.c.i;
import com.tremorvideo.sdk.android.c.j;
import com.tremorvideo.sdk.android.c.k;
import com.tremorvideo.sdk.android.c.l;
import com.tremorvideo.sdk.android.c.m;
import com.tremorvideo.sdk.android.c.n;
import com.tremorvideo.sdk.android.c.o;
import com.tremorvideo.sdk.android.c.p;
import com.tremorvideo.sdk.android.c.q;
import com.tremorvideo.sdk.android.c.r;
import com.tremorvideo.sdk.android.c.t;
import com.tremorvideo.sdk.android.c.u;
import com.tremorvideo.sdk.android.c.v;
import com.tremorvideo.sdk.android.c.w;
import com.tremorvideo.sdk.android.c.x;
import com.tremorvideo.sdk.android.c.y;
import com.tremorvideo.sdk.android.c.z;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            gd

public static final class X extends Enum
{

    public static final V A;
    public static final V B;
    public static final V C;
    public static final V D;
    public static final V E;
    public static final V F;
    public static final V G;
    public static final V H;
    public static final V I;
    public static final V J;
    public static final V K;
    public static final V L;
    public static final V M;
    public static final V N;
    public static final V O;
    public static final V P;
    public static final V Q;
    public static final V R;
    public static final V S;
    public static final V T;
    public static final V U;
    public static final V V;
    private static final V Y[];
    public static final V a;
    public static final V b;
    public static final V c;
    public static final V d;
    public static final V e;
    public static final V f;
    public static final V g;
    public static final V h;
    public static final V i;
    public static final V j;
    public static final V k;
    public static final V l;
    public static final V m;
    public static final V n;
    public static final V o;
    public static final V p;
    public static final V q;
    public static final V r;
    public static final V s;
    public static final V t;
    public static final V u;
    public static final V v;
    public static final V w;
    public static final V x;
    public static final V y;
    public static final V z;
    public final byte W[];
    public final String X;

    public static X valueOf(String s1)
    {
        return (X)Enum.valueOf(com/tremorvideo/sdk/android/videoad/gd$b, s1);
    }

    public static X[] values()
    {
        return (X[])Y.clone();
    }

    static 
    {
        a = new <init>("IconWeb", 0, ae.a, "icon-web");
        b = new <init>("IconCall", 1, u.a, "icon-call");
        c = new <init>("IconMP3Store", 2, z.a, "icon-mp3store");
        d = new <init>("IconMarket", 3, w.a, "icon-market");
        e = new <init>("IconTwitter", 4, ad.a, "icon-twitter");
        f = new <init>("IconFacebook", 5, x.a, "icon-facebook");
        g = new <init>("IconTicket", 6, ac.a, "icon-ticket");
        h = new <init>("IconYoutube", 7, af.a, "icon-youtube");
        i = new <init>("IconSkip", 8, ab.a, "icon-skip");
        j = new <init>("IconSurvey", 9, w.a, "icon-survey");
        k = new <init>("IconShare", 10, aa.a, "icon-share");
        l = new <init>("IconCalendar", 11, t.a, "icon-calendar");
        m = new <init>("IconMap", 12, y.a, "icon-map");
        n = new <init>("IconCoupon", 13, v.a, "icon-coupon");
        o = new <init>("ButtonBarDivider", 14, b.a, "buttonbar-divider");
        p = new <init>("ButtonBarLeft", 15, c.a, "buttonbar-left");
        q = new <init>("ButtonBarMiddle", 16, e.a, "buttonbar-middle");
        r = new <init>("ButtonBarRight", 17, g.a, "buttonbar-right");
        s = new <init>("ButtonBarLeftPress", 18, d.a, "buttonbar-left-press");
        t = new <init>("ButtonBarMiddlePress", 19, f.a, "buttonbar-middle-press");
        u = new <init>("ButtonBarRightPress", 20, h.a, "buttonbar-right-press");
        v = new <init>("ReplayBig", 21, ak.a, "replay-big");
        w = new <init>("WatermarkLeft", 22, av.a, "watermark-left");
        x = new <init>("WatermarkMiddle", 23, aw.a, "watermark-middle");
        y = new <init>("DialogTopLeft", 24, p.a, "dialog-top-left");
        z = new <init>("DialogTopMiddle", 25, q.a, "dialog-top-middle");
        A = new <init>("DialogTopRight", 26, r.a, "dialog-top-right");
        B = new <init>("DialogMiddleLeft", 27, n.a, "dialog-middle-left");
        C = new <init>("DialogMiddleRight", 28, o.a, "dialog-middle-right");
        D = new <init>("DialogBottomLeft", 29, i.a, "dialog-bottom-left");
        E = new <init>("DialogBottomMiddle", 30, j.a, "dialog-bottom-middle");
        F = new <init>("DialogBottomRight", 31, k.a, "dialog-bottom-right");
        G = new <init>("TwitterLeftTop", 32, as.a, "twitter-left-top");
        H = new <init>("TwitterLeftBottom", 33, ar.a, "twitter-left-bottom");
        I = new <init>("TwitterMiddle", 34, at.a, "twitter-middle");
        J = new <init>("TwitterRight", 35, au.a, "twitter-right");
        K = new <init>("InputLeft", 36, ag.a, "input-left");
        L = new <init>("InputMiddle", 37, ah.a, "input-middle");
        M = new <init>("InputRight", 38, ai.a, "input-right");
        N = new <init>("DialogButton", 39, l.a, "dialog-button");
        O = new <init>("DialogButtonPress", 40, m.a, "dialog-button-press");
        P = new <init>("SurveyLeft", 41, ap.a, "survey-left");
        Q = new <init>("SurveyMiddle", 42, aq.a, "survey-middle");
        R = new <init>("SurveyButtonLeft", 43, al.a, "survey-button-left");
        S = new <init>("SurveyButtonMiddle", 44, am.a, "survey-button-middle");
        T = new <init>("SurveyButtonPressLeft", 45, an.a, "survey-button-press-left");
        U = new <init>("SurveyButtonPressMiddle", 46, ao.a, "survey-button-press-middle");
        V = new <init>("InternalSurveySkip", 47, aj.a, "internal-survey-skip");
        Y = (new Y[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V
        });
    }

    private (String s1, int i1, byte abyte0[], String s2)
    {
        super(s1, i1);
        W = abyte0;
        X = s2;
    }
}
