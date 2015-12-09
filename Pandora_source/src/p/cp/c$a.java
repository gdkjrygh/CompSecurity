// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;


// Referenced classes of package p.cp:
//            c

static final class .String extends Enum
{

    public static final ag A;
    public static final ag B;
    public static final ag C;
    public static final ag D;
    public static final ag E;
    public static final ag F;
    public static final ag G;
    public static final ag H;
    public static final ag I;
    public static final ag J;
    public static final ag K;
    public static final ag L;
    public static final ag M;
    public static final ag N;
    public static final ag O;
    public static final ag P;
    public static final ag Q;
    public static final ag R;
    public static final ag S;
    public static final ag T;
    public static final ag U;
    public static final ag V;
    public static final ag W;
    public static final ag X;
    public static final ag Y;
    public static final ag Z;
    public static final ag a;
    public static final ag aa;
    public static final ag ab;
    public static final ag ac;
    public static final ag ad;
    public static final ag ae;
    public static final ag af;
    public static final ag ag;
    private static final ag ah[];
    public static final ag b;
    public static final ag c;
    public static final ag d;
    public static final ag e;
    public static final ag f;
    public static final ag g;
    public static final ag h;
    public static final ag i;
    public static final ag j;
    public static final ag k;
    public static final ag l;
    public static final ag m;
    public static final ag n;
    public static final ag o;
    public static final ag p;
    public static final ag q;
    public static final ag r;
    public static final ag s;
    public static final ag t;
    public static final ag u;
    public static final ag v;
    public static final ag w;
    public static final ag x;
    public static final ag y;
    public static final ag z;

    public static .String valueOf(String s1)
    {
        return (.String)Enum.valueOf(p/cp/c$a, s1);
    }

    public static .String[] values()
    {
        return (.String[])ah.clone();
    }

    static 
    {
        a = new <init>("check", 0);
        b = new <init>("echo", 1);
        c = new <init>("telephone", 2);
        d = new <init>("playMovie", 3);
        e = new <init>("preloadMovie", 4);
        f = new <init>("sendEmail", 5);
        g = new <init>("fetchURL", 6);
        h = new <init>("fetchWithAuth", 7);
        i = new <init>("eval", 8);
        j = new <init>("createStationFromStationId", 9);
        k = new <init>("createStationFromMusicId", 10);
        l = new <init>("openSafari", 11);
        m = new <init>("recordAdClick", 12);
        n = new <init>("offerTrial", 13);
        o = new <init>("canOpenURL", 14);
        p = new <init>("setViewportHeight", 15);
        q = new <init>("setNowPlayingFullSize", 16);
        r = new <init>("hideViewport", 17);
        s = new <init>("setStationCreationFollowOnURL", 18);
        t = new <init>("disableVideoAdsUntilNextStationChange", 19);
        u = new <init>("openLandingPage", 20);
        v = new <init>("closeLandingPage", 21);
        w = new <init>("offerUpgrade", 22);
        x = new <init>("getP1SubscriberState", 23);
        y = new <init>("getPersonalInfo", 24);
        z = new <init>("alert", 25);
        A = new <init>("share", 26);
        B = new <init>("openGenrePickerForGCat", 27);
        C = new <init>("openGenrePicker", 28);
        D = new <init>("launchGenrePanel", 29);
        E = new <init>("addCalendarItem", 30);
        F = new <init>("authorizeFacebook", 31);
        G = new <init>("closeCustomWebViewContainer", 32);
        H = new <init>("pause", 33);
        I = new <init>("play", 34);
        J = new <init>("pauseTrack", 35);
        K = new <init>("playTrack", 36);
        L = new <init>("closeAd", 37);
        M = new <init>("goToScreen", 38);
        N = new <init>("playSample", 39);
        O = new <init>("playSampleTrack", 40);
        P = new <init>("stopSample", 41);
        Q = new <init>("getNowPlayingTrackDetails", 42);
        R = new <init>("setCloseButtonVisibility", 43);
        S = new <init>("sendEvent", 44);
        T = new <init>("createStation", 45);
        U = new <init>("startValueExchange", 46);
        V = new <init>("delayAdRefresh", 47);
        W = new <init>("pingImpressionUrls", 48);
        X = new <init>("openExternalPage", 49);
        Y = new <init>("openPage", 50);
        Z = new <init>("openModalPage", 51);
        aa = new <init>("closeModalPage", 52);
        ab = new <init>("refreshAd", 53);
        ac = new <init>("showTextInput", 54);
        ad = new <init>("refreshStationList", 55);
        ae = new <init>("launchAddSeed", 56);
        af = new <init>("playlistUpdated", 57);
        ag = new <init>("buyAmazon", 58);
        ah = (new ah[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W, X, 
            Y, Z, aa, ab, ac, ad, ae, af, ag
        });
    }

    private .String(String s1, int i1)
    {
        super(s1, i1);
    }
}
