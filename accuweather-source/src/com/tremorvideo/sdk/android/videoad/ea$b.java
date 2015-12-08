// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea

public static final class Z extends Enum
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
    public static final V a;
    private static final V aa[];
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
    private String W;
    private boolean X;
    private String Y;
    private V Z;

    public static Z a(String s1)
    {
        Z az[] = values();
        int j1 = az.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Z z1 = az[i1];
            if (z1.toString().equalsIgnoreCase(s1))
            {
                return z1;
            }
        }

        return V;
    }

    public static V valueOf(String s1)
    {
        return (V)Enum.valueOf(com/tremorvideo/sdk/android/videoad/ea$b, s1);
    }

    public static V[] values()
    {
        return (V[])aa.clone();
    }

    public boolean a()
    {
        return X;
    }

    public X b()
    {
        return Z;
    }

    public String c()
    {
        return Y;
    }

    public String toString()
    {
        return W;
    }

    static 
    {
        a = new <init>("Invalid", 0, "", false, "", null);
        b = new <init>("Web", 1, "click-to-web", true, "Web", a);
        c = new <init>("Call", 2, "click-to-call", true, "Call", b);
        d = new <init>("MP3Store", 3, "click-to-mp3store", true, "MP3", c);
        e = new <init>("Twitter", 4, "click-to-twitter", true, "Twitter", e);
        f = new <init>("Market", 5, "click-to-market", true, "Market", d);
        g = new <init>("Facebook", 6, "click-to-facebook", true, "Facebook", f);
        h = new <init>("Ticket", 7, "click-to-tickets", true, "Tickets", g);
        i = new <init>("Youtube", 8, "click-to-youtube", true, "Youtube", h);
        j = new <init>("Timer", 9, "timer", false, "", null);
        k = new <init>("ExternalSurveyIntiated", 10, "external-survey-init", false, "", null);
        l = new <init>("ExternalSurveyStart", 11, "external-survey-start", false, "", j);
        m = new <init>("ExternalSurveyEnd", 12, "external-survey-end", false, "", null);
        n = new <init>("ExternalSurveySkip", 13, "external-survey-skip", false, "", null);
        o = new <init>("ExternalSurveyButton", 14, "survey", false, "Survey", d);
        p = new <init>("TwitterTweet", 15, "twitter-tweet", true, "Tweet", e);
        q = new <init>("Map", 16, "click-to-map", true, "Map", m);
        r = new <init>("Share", 17, "click-to-share", true, "Share", k);
        s = new <init>("ShareEmail", 18, "share-email", true, "Share", k);
        t = new <init>("ShareSMS", 19, "share-sms", true, "Share", k);
        u = new <init>("PostToFacebook", 20, "post-to-facebook", true, "Post", f);
        v = new <init>("Skip", 21, "skip", false, "Skip", i);
        w = new <init>("Replay", 22, "replay", false, "Replay", v);
        x = new <init>("Vibrate", 23, "timer-vibration", false, "Vibrate", null);
        y = new <init>("AdStart", 24, "ad-start", false, "Ad Start", null);
        z = new <init>("AdComplete", 25, "ad-complete", false, "Ad Complete", null);
        A = new <init>("CouponSave", 26, "save-coupon", true, "Save", d);
        B = new <init>("CouponShow", 27, "show-coupon", true, "Coupon", n);
        C = new <init>("CouponAutoDisplay", 28, "coupon-auto-display", false, "", null);
        D = new <init>("CouponSkip", 29, "coupon-skip", true, "Done", i);
        E = new <init>("CouponBack", 30, "coupon-back", true, "Done", i);
        F = new <init>("Date", 31, "show-date", true, "Date", l);
        G = new <init>("Zip", 32, "show-zip", false, "Date", null);
        H = new <init>("AdChoices", 33, "ad-choices", false, "", null);
        I = new <init>("TMS", 34, "click-to-tms", false, "", null);
        J = new <init>("AgeGate", 35, "age-gate", false, "", null);
        K = new <init>("CouponShare", 36, "coupon-share", true, "Share", k);
        L = new <init>("CouponShareSMS", 37, "coupon-share-sms", true, "Share SMS", k);
        M = new <init>("CouponShareEmail", 38, "coupon-share-email", true, "Share Email", k);
        N = new <init>("InternalSurveyStart", 39, "internal-survey-start", false, "", null);
        O = new <init>("InternalSurveySkip", 40, "internal-survey-skip", false, "", null);
        P = new <init>("InternalSurveySubmit", 41, "internal-survey-submit", false, "", null);
        Q = new <init>("BuyItNow", 42, "buy-now", true, "", n);
        R = new <init>("BuyItNowStart", 43, "buy-now-start", false, "", null);
        S = new <init>("BuyItNowClick", 44, "buy-now-click", false, "", null);
        T = new <init>("BuyItNowSkip", 45, "buy-now-skip", false, "", null);
        U = new <init>("BuyItNowEnd", 46, "buy-now-end", false, "", null);
        V = new <init>("Custom", 47, "custom", false, "", null);
        aa = (new aa[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V
        });
    }

    private (String s1, int i1, String s2, boolean flag, String s3,  )
    {
        super(s1, i1);
        W = s2;
        X = flag;
        Y = s3;
        Z = ;
    }
}
