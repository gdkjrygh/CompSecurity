// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;


public final class mEvent extends Enum
{

    public static final aJ A;
    public static final aJ B;
    public static final aJ C;
    public static final aJ D;
    public static final aJ E;
    public static final aJ F;
    public static final aJ G;
    public static final aJ H;
    public static final aJ I;
    public static final aJ J;
    public static final aJ K;
    public static final aJ L;
    public static final aJ M;
    public static final aJ N;
    public static final aJ O;
    public static final aJ P;
    public static final aJ Q;
    public static final aJ R;
    public static final aJ S;
    public static final aJ T;
    public static final aJ U;
    public static final aJ V;
    public static final aJ W;
    public static final aJ X;
    public static final aJ Y;
    public static final aJ Z;
    public static final aJ a;
    public static final aJ aA;
    public static final aJ aB;
    public static final aJ aC;
    public static final aJ aD;
    public static final aJ aE;
    public static final aJ aF;
    public static final aJ aG;
    public static final aJ aH;
    public static final aJ aI;
    public static final aJ aJ;
    private static aJ aK;
    private static aJ aL;
    private static aJ aM;
    private static aJ aN;
    private static aJ aO;
    private static aJ aP;
    private static aJ aQ;
    private static aJ aR;
    private static aJ aS;
    private static aJ aT;
    private static aJ aU;
    private static aJ aV;
    private static aJ aW;
    private static aJ aX;
    private static aJ aY;
    private static aJ aZ;
    public static final aJ aa;
    public static final aJ ab;
    public static final aJ ac;
    public static final aJ ad;
    public static final aJ ae;
    public static final aJ af;
    public static final aJ ag;
    public static final aJ ah;
    public static final aJ ai;
    public static final aJ aj;
    public static final aJ ak;
    public static final aJ al;
    public static final aJ am;
    public static final aJ an;
    public static final aJ ao;
    public static final aJ ap;
    public static final aJ aq;
    public static final aJ ar;
    public static final aJ as;
    public static final aJ at;
    public static final aJ au;
    public static final aJ av;
    public static final aJ aw;
    public static final aJ ax;
    public static final aJ ay;
    public static final aJ az;
    public static final aJ b;
    private static aJ ba;
    private static aJ bb;
    private static final aJ bc[];
    public static final aJ c;
    public static final aJ d;
    public static final aJ e;
    public static final aJ f;
    public static final aJ g;
    public static final aJ h;
    public static final aJ i;
    public static final aJ j;
    public static final aJ k;
    public static final aJ l;
    public static final aJ m;
    public static final aJ n;
    public static final aJ o;
    public static final aJ p;
    public static final aJ q;
    public static final aJ r;
    public static final aJ s;
    public static final aJ t;
    public static final aJ u;
    public static final aJ v;
    public static final aJ w;
    public static final aJ x;
    public static final aJ y;
    public static final aJ z;
    private final String mEvent;

    public static mEvent valueOf(String s1)
    {
        return (mEvent)Enum.valueOf(com/spotify/mobile/android/util/ClientEvent$Event, s1);
    }

    public static mEvent[] values()
    {
        return (mEvent[])bc.clone();
    }

    public final String toString()
    {
        return mEvent;
    }

    static 
    {
        a = new <init>("SETTING_CHANGED", 0, "setting-changed");
        b = new <init>("PLAYBACK_ERROR", 1, "playback-error");
        c = new <init>("GET_PREMIUM", 2, "get-premium");
        d = new <init>("LOGGING_OUT", 3, "logging-out");
        e = new <init>("SETTINGS_INFO", 4, "settings-info");
        f = new <init>("PRESENTED", 5, "presented");
        g = new <init>("DISMISSED", 6, "dismissed");
        h = new <init>("NAVIGATE", 7, "navigate");
        aK = new <init>("STAR", 8, "star");
        aL = new <init>("UNSTAR", 9, "unstar");
        i = new <init>("SUBSCRIBE", 10, "subscribe");
        j = new <init>("DOWNLOAD", 11, "download");
        k = new <init>("MOBILE_DATA_USAGE", 12, "mobile-data-usage");
        l = new <init>("UNDOWNLOAD", 13, "undownload");
        m = new <init>("REMOVE", 14, "remove");
        n = new <init>("ADD_TO_PLAYLIST", 15, "add-to-playlist");
        o = new <init>("SHARE", 16, "share");
        p = new <init>("ADD_TO_QUEUE", 17, "add-to-queue");
        q = new <init>("BROWSE_ALBUM", 18, "browse-album");
        r = new <init>("BROWSE_ARTIST", 19, "browse-artist");
        s = new <init>("BROWSE_PLAYLIST", 20, "browse-playlist");
        t = new <init>("BROWSE_SHOW", 21, "browse-show");
        u = new <init>("BROWSE_USER", 22, "browse-user");
        v = new <init>("START_RADIO", 23, "start-radio");
        w = new <init>("DELETE_STATION", 24, "delete-station");
        x = new <init>("FOLLOW_STATION", 25, "follow-station");
        y = new <init>("UNFOLLOW_STATION", 26, "unfollow-station");
        aM = new <init>("CREATE_STATION", 27, "create-station");
        z = new <init>("CREATE_PLAYLIST", 28, "create-playlist");
        A = new <init>("SEARCH", 29, "search");
        B = new <init>("RENAME", 30, "rename");
        C = new <init>("REMOVE_FROM_QUEUE", 31, "remove-from-queue");
        aN = new <init>("SET_UNSEEN", 32, "unseen");
        aO = new <init>("SET_SEEN", 33, "seen");
        D = new <init>("UNSET_COLLABORATIVE", 34, "unset-collaborative");
        E = new <init>("SET_COLLABORATIVE", 35, "set-collaborative");
        F = new <init>("UNSET_PUBLISHED", 36, "unset-published");
        G = new <init>("SET_PUBLISHED", 37, "set-published");
        H = new <init>("ACCEPTED", 38, "accepted");
        I = new <init>("CACHE_DELETED", 39, "cache-deleted");
        J = new <init>("CHOOSE_CACHE_PATH", 40, "choose-cache-path");
        K = new <init>("ADD_TO_COLLECTION", 41, "add-to-collection");
        L = new <init>("COMPLETE_ALBUM_IN_COLLECTION", 42, "complete-album-in-collection");
        aP = new <init>("ADD_TO_COLLECTION_FROM_QUICK_ACTION", 43, "add-to-collection-from-quick-action");
        aQ = new <init>("ADDED_TO_COLLECTION_FROM_QUICK_ACTION", 44, "added-to-collection-from-quick-action");
        M = new <init>("REMOVE_FROM_COLLECTION", 45, "remove-from-collection");
        aR = new <init>("SEARCH_HISTORY", 46, "history");
        N = new <init>("ITEM_CLICK", 47, "item-click");
        aS = new <init>("PLAY_INLINE", 48, "play-inline");
        O = new <init>("USER_HIT", 49, "user:hit");
        aT = new <init>("USER_HOLD", 50, "user:hold");
        P = new <init>("INFO_TIMER", 51, "info:timer");
        Q = new <init>("INFO_DEFAULT", 52, "info:default");
        R = new <init>("USER_IMPRESSION", 53, "user:impression");
        S = new <init>("USER_DISMISSED", 54, "user:dismissed");
        T = new <init>("GCM_AVAILABILITY", 55, "gcm:availability");
        U = new <init>("PUSH_NOTIFICATION_WEB", 56, "pushnotif:web");
        V = new <init>("ERROR_DEFAULT", 57, "error:default");
        W = new <init>("STARTUP", 58, "startup");
        aU = new <init>("STARTUP_UI", 59, "startup-ui");
        aV = new <init>("STARTUP_NIGHTLY_UI", 60, "startup-nightly-ui");
        aW = new <init>("BROWSE_GENRE", 61, "browse-genre");
        aX = new <init>("BROWSE_SUBGENRE", 62, "browse-subgenre");
        aY = new <init>("USER_SWIPE", 63, "user-swipe");
        X = new <init>("DEVICE_INFO", 64, "device:info");
        Y = new <init>("LINK_TRACKING", 65, "link-tracking");
        Z = new <init>("FILTER", 66, "filter");
        aa = new <init>("SORT", 67, "filter");
        ab = new <init>("SHUFFLE_PLAY", 68, "shuffle-play");
        ac = new <init>("FOLLOW", 69, "follow");
        ad = new <init>("UNFOLLOW", 70, "unfollow");
        ae = new <init>("SIGNUP_SUCCESSFUL", 71, "signup-successful");
        af = new <init>("USER_SUBMITTED_SURVEY_FORM", 72, "User submitted survey form");
        ag = new <init>("USER_VIEWED_SURVEY", 73, "User viewed survey");
        aZ = new <init>("CLOSE_SURVEY_WITHOUT_SUBMITTING", 74, "Close survey without submitting");
        ah = new <init>("PLAYLIST_ANNOTATION_UPLOAD", 75, "playlist-annotation-upload");
        ai = new <init>("REPORT_ABUSE", 76, "playlist-annotation-report-abuse");
        aj = new <init>("EDIT_MODE", 77, "edit-mode");
        ak = new <init>("BACK", 78, "back");
        al = new <init>("HIDE_FROM_RECENTLY_PLAYED", 79, "hide-from-recently-played");
        am = new <init>("AD_SUBSCRIPTIONS_CREATED", 80, "ad-subscriptions-created");
        an = new <init>("AD_SUBSCRIPTIONS_PUB", 81, "ad-subscriptions-pub");
        ba = new <init>("AD_SUBSCRIPTIONS_COMPLETE", 82, "ad-subscriptions-complete");
        ao = new <init>("AD_SUBSCRIPTIONS_FLAG", 83, "ad-subscriptions-flag-change");
        ap = new <init>("AD_METADATA_STATUS", 84, "ad-metadata-status");
        aq = new <init>("INSTALL_REFERRER", 85, "install-referrer");
        ar = new <init>("MARK_AS_PLAYED", 86, "mark-as-played");
        bb = new <init>("MARK_AS_UNPLAYED", 87, "mark-as-unplayed");
        as = new <init>("SPOTIFY_SERVICE", 88, "spotify-service");
        at = new <init>("STATE_HANDLER", 89, "state-handler");
        au = new <init>("DONE", 90, "done");
        av = new <init>("CANCEL_SUBSCRIPTION", 91, "cancel-subscription");
        aw = new <init>("INTRO_VIDEO_UNKNOWN_FAILURE", 92, "intro-video-unknown-failure");
        ax = new <init>("SIM_INFORMATION", 93, "sim-information");
        ay = new <init>("MSISDN_LOOKUP", 94, "msisdn-lookup");
        az = new <init>("OPERATOR_ACTIVATION", 95, "operator-activation");
        aA = new <init>("DYNAMIC_UPSELL_NOT_SHOWN", 96, "dynamic-upsell-not-shown");
        aB = new <init>("OPT_IN_BANNER_ACCEPT", 97, "opt-in-banner-accept");
        aC = new <init>("OPT_IN_BANNER_DISMISSED", 98, "opt-in-banner-dismissed");
        aD = new <init>("OPT_IN_CONFIRM_ACCEPT", 99, "opt-in-confirm-accept");
        aE = new <init>("OPT_IN_CONFIRM_DISMISSED", 100, "opt-in-confirm-dismissed");
        aF = new <init>("OPT_IN_ERROR_ACCEPT", 101, "opt-in-error-accept");
        aG = new <init>("OPT_IN_ERROR_DISMISSED", 102, "opt-in-error-dismissed");
        aH = new <init>("OPT_IN_SUCCESS", 103, "opt-in-success");
        aI = new <init>("OPT_IN_ERROR", 104, "opt-in-error");
        aJ = new <init>("OPT_IN_NO_RESTART_FLOW_TOO_SLOW", 105, "opt-in-no-restart-flow-too-slow");
        bc = (new bc[] {
            a, b, c, d, e, f, g, h, aK, aL, 
            i, j, k, l, m, n, o, p, q, r, 
            s, t, u, v, w, x, y, aM, z, A, 
            B, C, aN, aO, D, E, F, G, H, I, 
            J, K, L, aP, aQ, M, aR, N, aS, O, 
            aT, P, Q, R, S, T, U, V, W, aU, 
            aV, aW, aX, aY, X, Y, Z, aa, ab, ac, 
            ad, ae, af, ag, aZ, ah, ai, aj, ak, al, 
            am, an, ba, ao, ap, aq, ar, bb, as, at, 
            au, av, aw, ax, ay, az, aA, aB, aC, aD, 
            aE, aF, aG, aH, aI, aJ
        });
    }

    private (String s1, int i1, String s2)
    {
        super(s1, i1);
        mEvent = s2;
    }
}
