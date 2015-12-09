// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets;

import com.spotify.mobile.android.util.Assertion;
import ctz;
import gmt;

public class FeatureIdentifier extends Enum
{

    public static final FeatureIdentifier A;
    public static final FeatureIdentifier B;
    public static final FeatureIdentifier C;
    public static final FeatureIdentifier D;
    public static final FeatureIdentifier E;
    public static final FeatureIdentifier F;
    public static final FeatureIdentifier G;
    public static final FeatureIdentifier H;
    public static final FeatureIdentifier I;
    public static final FeatureIdentifier J;
    public static final FeatureIdentifier K;
    public static final FeatureIdentifier L;
    public static final FeatureIdentifier M;
    public static final FeatureIdentifier N;
    public static final FeatureIdentifier O;
    public static final FeatureIdentifier P;
    public static final FeatureIdentifier Q;
    public static final FeatureIdentifier R;
    public static final FeatureIdentifier S;
    public static final FeatureIdentifier T;
    public static final FeatureIdentifier U;
    public static final FeatureIdentifier V;
    public static final FeatureIdentifier W;
    public static final FeatureIdentifier X;
    public static final FeatureIdentifier Y;
    public static final FeatureIdentifier Z;
    public static final FeatureIdentifier a;
    public static final FeatureIdentifier aA;
    public static final FeatureIdentifier aB;
    public static final FeatureIdentifier aC;
    public static final FeatureIdentifier aD;
    public static final FeatureIdentifier aE;
    public static final FeatureIdentifier aF;
    private static FeatureIdentifier aG;
    private static FeatureIdentifier aH;
    private static FeatureIdentifier aI;
    private static FeatureIdentifier aJ;
    private static FeatureIdentifier aK;
    private static final FeatureIdentifier aL[];
    public static final FeatureIdentifier aa;
    public static final FeatureIdentifier ab;
    public static final FeatureIdentifier ac;
    public static final FeatureIdentifier ad;
    public static final FeatureIdentifier ae;
    public static final FeatureIdentifier af;
    public static final FeatureIdentifier ag;
    public static final FeatureIdentifier ah;
    public static final FeatureIdentifier ai;
    public static final FeatureIdentifier aj;
    public static final FeatureIdentifier ak;
    public static final FeatureIdentifier al;
    public static final FeatureIdentifier am;
    public static final FeatureIdentifier an;
    public static final FeatureIdentifier ao;
    public static final FeatureIdentifier ap;
    public static final FeatureIdentifier aq;
    public static final FeatureIdentifier ar;
    public static final FeatureIdentifier as;
    public static final FeatureIdentifier at;
    public static final FeatureIdentifier au;
    public static final FeatureIdentifier av;
    public static final FeatureIdentifier aw;
    public static final FeatureIdentifier ax;
    public static final FeatureIdentifier ay;
    public static final FeatureIdentifier az;
    public static final FeatureIdentifier b;
    public static final FeatureIdentifier c;
    public static final FeatureIdentifier d;
    public static final FeatureIdentifier e;
    public static final FeatureIdentifier f;
    public static final FeatureIdentifier g;
    public static final FeatureIdentifier h;
    public static final FeatureIdentifier i;
    public static final FeatureIdentifier j;
    public static final FeatureIdentifier k;
    public static final FeatureIdentifier l;
    public static final FeatureIdentifier m;
    public static final FeatureIdentifier n;
    public static final FeatureIdentifier o;
    public static final FeatureIdentifier p;
    public static final FeatureIdentifier q;
    public static final FeatureIdentifier r;
    public static final FeatureIdentifier s;
    public static final FeatureIdentifier t;
    public static final FeatureIdentifier u;
    public static final FeatureIdentifier v;
    public static final FeatureIdentifier w;
    public static final FeatureIdentifier x;
    public static final FeatureIdentifier y;
    public static final FeatureIdentifier z;
    private String mName;

    private FeatureIdentifier(String s1, int i1, String s2)
    {
        super(s1, i1);
        ctz.a(s2);
        mName = s2;
    }

    FeatureIdentifier(String s1, int i1, String s2, byte byte0)
    {
        this(s1, i1, s2);
    }

    public static FeatureIdentifier valueOf(String s1)
    {
        return (FeatureIdentifier)Enum.valueOf(com/spotify/music/spotlets/FeatureIdentifier, s1);
    }

    public static FeatureIdentifier[] values()
    {
        return (FeatureIdentifier[])aL.clone();
    }

    public String a()
    {
        return mName;
    }

    static 
    {
        aG = new FeatureIdentifier("UNKNOWN", "unknown") {

            public final String a()
            {
                Assertion.a("Using an unknown internal referrer, please use the actual one.");
                return a();
            }

        };
        aH = new FeatureIdentifier("ROBOLECTRIC", "only-for-robolectric") {

            public final String a()
            {
                Assertion.a(gmt.a(), "This can only be used from Robolectric");
                return a();
            }

        };
        a = new FeatureIdentifier("DEBUG", "debug") {

            public final String a()
            {
                Assertion.a("canary".equals("release"), "This can only be used from debug views");
                return a();
            }

        };
        b = new FeatureIdentifier("ADS", 3, "ads");
        c = new FeatureIdentifier("BROWSE", 4, "browse");
        d = new FeatureIdentifier("BROWSE_NEW_RELEASES", 5, "browse-new-releases");
        e = new FeatureIdentifier("BROWSE_PLAYLISTS", 6, "browse-playlists");
        f = new FeatureIdentifier("CHARTS_OVERVIEW", 7, "charts-overview");
        g = new FeatureIdentifier("CHARTS_BLOCK", 8, "charts-block");
        h = new FeatureIdentifier("CHART", 9, "chart");
        i = new FeatureIdentifier("COLLECTION", 10, "collection");
        j = new FeatureIdentifier("COLLECTION_ALBUM", 11, "collection-album");
        k = new FeatureIdentifier("COLLECTION_ALBUMS", 12, "collection-albums");
        l = new FeatureIdentifier("COLLECTION_ARTIST", 13, "collection-artist");
        m = new FeatureIdentifier("COLLECTION_ARTISTS", 14, "collection-artists");
        n = new FeatureIdentifier("COLLECTION_PLAYLISTS", 15, "collection-playlists");
        o = new FeatureIdentifier("COLLECTION_EPISODES", 16, "collection-episodes");
        p = new FeatureIdentifier("COLLECTION_EPISODES_OFFLINE_ONLY", 17, "collection-episodes-offline-only");
        q = new FeatureIdentifier("COLLECTION_RADIO", 18, "collection-radio");
        r = new FeatureIdentifier("COLLECTION_SHOWS", 19, "collection-shows");
        s = new FeatureIdentifier("COLLECTION_SONGS", 20, "collection-songs");
        t = new FeatureIdentifier("HUB_EVENTS", 21, "hub-events");
        u = new FeatureIdentifier("HUB_GENRE", 22, "hub-genre");
        v = new FeatureIdentifier("HUB_MOMENTS", 23, "hub-moments");
        w = new FeatureIdentifier("HUB_MUSIC", 24, "hub-music");
        x = new FeatureIdentifier("HUB_SHOWS", 25, "hub-shows");
        y = new FeatureIdentifier("HUB_SANDBOX", 26, "hub-sandbox");
        z = new FeatureIdentifier("PLAYLIST", 27, "playlist");
        A = new FeatureIdentifier("PLAYLIST_FOLDER", 28, "playlist-folder");
        B = new FeatureIdentifier("SEARCH", 29, "search");
        C = new FeatureIdentifier("SHOW", 30, "show");
        D = new FeatureIdentifier("SOCIAL_CHART", 31, "social-chart");
        E = new FeatureIdentifier("MOMENTS_START", 32, "spotify:internal:startpage");
        F = new FeatureIdentifier("RUNNING", 33, "running");
        G = new FeatureIdentifier("PARTY", 34, "party");
        H = new FeatureIdentifier("PLAYER", 35, "player");
        I = new FeatureIdentifier("NEW_PLAYER", 36, "new-player");
        J = new FeatureIdentifier("AUTO", 37, "auto");
        K = new FeatureIdentifier("ARTIST", 38, "artist");
        L = new FeatureIdentifier("ARTIST_BIOGRAPHY", 39, "artist-biography");
        M = new FeatureIdentifier("ARTIST_CONCERT", 40, "artist-convert");
        N = new FeatureIdentifier("ARTIST_GALLERY", 41, "artist-gallery");
        O = new FeatureIdentifier("ARTIST_PLAYLISTS", 42, "artist-playlists");
        P = new FeatureIdentifier("ARTIST_RELEATED_ARTISTS", 43, "artist-related-artists");
        Q = new FeatureIdentifier("ARTIST_RELEASES", 44, "artist-relases");
        R = new FeatureIdentifier("ALBUM", 45, "album");
        S = new FeatureIdentifier("RECENTLY_PLAYED", 46, "recently-played");
        T = new FeatureIdentifier("ROOT", 47, "root");
        U = new FeatureIdentifier("RADIO", 48, "radio");
        V = new FeatureIdentifier("DISCOVER", 49, "com.spotify.feature.recommendations");
        W = new FeatureIdentifier("INBOX", 50, "inbox");
        X = new FeatureIdentifier("WEB_VIEW_BRIDGE", 51, "web-view-bridge");
        Y = new FeatureIdentifier("OPEN_LINK", 52, "open-link");
        Z = new FeatureIdentifier("NAVIGATION_CATEGORIES_CHARTS", 53, "navigation-categories_charts");
        aa = new FeatureIdentifier("NAVIGATION_GENRES_INSPIRATION", 54, "navigation-genres_inspiration");
        ab = new FeatureIdentifier("NAVIGATION_MOODS_MOMENTS", 55, "navigation-moods-moments");
        ac = new FeatureIdentifier("NAVIGATION_PLAY_MUSIC", 56, "navigation-play_music");
        ad = new FeatureIdentifier("NOTIFICATION", 57, "notification");
        ae = new FeatureIdentifier("REMOTE_CONTROL", 58, "remote_control");
        af = new FeatureIdentifier("SERVICE", 59, "spotify:internal:service");
        ag = new FeatureIdentifier("WIDGET", 60, "widget");
        ah = new FeatureIdentifier("MEDIA_SERVICE", 61, "media-service");
        ai = new FeatureIdentifier("SOCIAL_FEED", 62, "social-feed");
        aI = new FeatureIdentifier("SITUATIONAL", 63, "situational");
        aj = new FeatureIdentifier("REACTORS", 64, "reactors");
        ak = new FeatureIdentifier("DEVICE", 65, "device");
        al = new FeatureIdentifier("FIND_FRIENDS", 66, "find-friends");
        am = new FeatureIdentifier("NOTIFICATIONS", 67, "notifications");
        an = new FeatureIdentifier("TASTE_GENRE", 68, "taste-genre");
        ao = new FeatureIdentifier("TASTE_ARTIST", 69, "taste-artist");
        ap = new FeatureIdentifier("TASTE_MIXING", 70, "taste-mixing");
        aq = new FeatureIdentifier("SHARE_POST_TO", 71, "share-post-to");
        ar = new FeatureIdentifier("INVITATION_CODES", 72, "invitation-codes");
        as = new FeatureIdentifier("USER_PLAYLISTS", 73, "user-playlists");
        at = new FeatureIdentifier("USER_PROFILE", 74, "user-profile");
        au = new FeatureIdentifier("USER_PROFILES", 75, "user-profiles");
        av = new FeatureIdentifier("USER_TOP_ARTISTS", 76, "user-top-artists");
        aw = new FeatureIdentifier("LICENSES", 77, "licenses");
        ax = new FeatureIdentifier("NOTIFICATION_SETTINGS", 78, "notification-settings");
        ay = new FeatureIdentifier("SETTINGS", 79, "settings");
        az = new FeatureIdentifier("SPONSORED_CONTEXT", 80, "sponsored-context");
        aA = new FeatureIdentifier("MINI_PLAYER", 81, "mini-player");
        aB = new FeatureIdentifier("PLAY_QUEUE", 82, "play-queue");
        aC = new FeatureIdentifier("VIDEOPLAYER", 83, "videoplayer");
        aJ = new FeatureIdentifier("TA", 84, "ta");
        aD = new FeatureIdentifier("STATION", 85, "station");
        aE = new FeatureIdentifier("CONCERTS_LOCATION_SEARCH", 86, "concerts-location_search");
        aK = new FeatureIdentifier("SCREENSAVER_AD", 87, "screensaver-ad");
        aF = new FeatureIdentifier("SCREENSAVER_AD_WEB_VIEW", 88, "screensaver-ad-web-view");
        aL = (new FeatureIdentifier[] {
            aG, aH, a, b, c, d, e, f, g, h, 
            i, j, k, l, m, n, o, p, q, r, 
            s, t, u, v, w, x, y, z, A, B, 
            C, D, E, F, G, H, I, J, K, L, 
            M, N, O, P, Q, R, S, T, U, V, 
            W, X, Y, Z, aa, ab, ac, ad, ae, af, 
            ag, ah, ai, aI, aj, ak, al, am, an, ao, 
            ap, aq, ar, as, at, au, av, aw, ax, ay, 
            az, aA, aB, aC, aJ, aD, aE, aK, aF
        });
    }
}
