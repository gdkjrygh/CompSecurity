// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.richmedia;


// Referenced classes of package com.tremorvideo.sdk.android.richmedia:
//            i

public static final class  extends Enum
{

    public static final R A;
    public static final R B;
    public static final R C;
    public static final R D;
    public static final R E;
    public static final R F;
    public static final R G;
    public static final R H;
    public static final R I;
    public static final R J;
    public static final R K;
    public static final R L;
    public static final R M;
    public static final R N;
    public static final R O;
    public static final R P;
    public static final R Q;
    public static final R R;
    private static final R S[];
    public static final R a;
    public static final R b;
    public static final R c;
    public static final R d;
    public static final R e;
    public static final R f;
    public static final R g;
    public static final R h;
    public static final R i;
    public static final R j;
    public static final R k;
    public static final R l;
    public static final R m;
    public static final R n;
    public static final R o;
    public static final R p;
    public static final R q;
    public static final R r;
    public static final R s;
    public static final R t;
    public static final R u;
    public static final R v;
    public static final R w;
    public static final R x;
    public static final R y;
    public static final R z;

    public static  valueOf(String s1)
    {
        return ()Enum.valueOf(com/tremorvideo/sdk/android/richmedia/i$b, s1);
    }

    public static [] values()
    {
        return ([])S.clone();
    }

    static 
    {
        a = new <init>("None", 0);
        b = new <init>("GotoScene", 1);
        c = new <init>("GotoKeyFrame", 2);
        d = new <init>("StartVideo", 3);
        e = new <init>("StartVideo1", 4);
        f = new <init>("StartVideo2", 5);
        g = new <init>("StartVideo3", 6);
        h = new <init>("PauseVideo", 7);
        i = new <init>("ResumeVideo", 8);
        j = new <init>("PauseHideVideo", 9);
        k = new <init>("StopVideo", 10);
        l = new <init>("Exit", 11);
        m = new <init>("Impression", 12);
        n = new <init>("Vibration", 13);
        o = new <init>("Replay", 14);
        p = new <init>("VideoStart", 15);
        q = new <init>("VideoMidpoint", 16);
        r = new <init>("VideoEnd", 17);
        s = new <init>("VideoFirstquartile", 18);
        t = new <init>("VideoThirdquartile", 19);
        u = new <init>("Skip", 20);
        v = new <init>("ClickToWeb", 21);
        w = new <init>("ClickToAppstore", 22);
        x = new <init>("ClickToCall", 23);
        y = new <init>("ClickToItunes", 24);
        z = new <init>("ClickToMarket", 25);
        A = new <init>("ClickToMp3store", 26);
        B = new <init>("ClickToFacebook", 27);
        C = new <init>("ClickToTwitter", 28);
        D = new <init>("ClickToTickets", 29);
        E = new <init>("ClickToBlackberrymarket", 30);
        F = new <init>("ClickToMap", 31);
        G = new <init>("PostToFacebook", 32);
        H = new <init>("AddToCalendar", 33);
        I = new <init>("AddToContacts", 34);
        J = new <init>("ShareEmail", 35);
        K = new <init>("ShareSms", 36);
        L = new <init>("ClickToCoupon", 37);
        M = new <init>("ClickToYoutube", 38);
        N = new <init>("TwitterTweet", 39);
        O = new <init>("ShowDate", 40);
        P = new <init>("AdChoices", 41);
        Q = new <init>("AgeGate", 42);
        R = new <init>("ShowBuyNow", 43);
        S = (new S[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R
        });
    }

    private (String s1, int i1)
    {
        super(s1, i1);
    }
}
