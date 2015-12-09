// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.viewuri;

import ctz;

public final class mSubView extends Enum
{

    public static final Z A;
    public static final Z B;
    public static final Z C;
    public static final Z D;
    public static final Z E;
    public static final Z F;
    public static final Z G;
    public static final Z H;
    public static final Z I;
    public static final Z J;
    public static final Z K;
    public static final Z L;
    public static final Z M;
    public static final Z N;
    public static final Z O;
    public static final Z P;
    public static final Z Q;
    public static final Z R;
    public static final Z S;
    public static final Z T;
    public static final Z U;
    public static final Z V;
    public static final Z W;
    public static final Z X;
    public static final Z Y;
    public static final Z Z;
    public static final Z a;
    private static Z aa;
    private static Z ab;
    private static Z ac;
    private static Z ad;
    private static Z ae;
    private static Z af;
    private static Z ag;
    private static Z ah;
    private static Z ai;
    private static Z aj;
    private static Z ak;
    private static Z al;
    private static Z am;
    private static Z an;
    private static Z ao;
    private static Z ap;
    private static Z aq;
    private static Z ar;
    private static final Z as[];
    public static final Z b;
    public static final Z c;
    public static final Z d;
    public static final Z e;
    public static final Z f;
    public static final Z g;
    public static final Z h;
    public static final Z i;
    public static final Z j;
    public static final Z k;
    public static final Z l;
    public static final Z m;
    public static final Z n;
    public static final Z o;
    public static final Z p;
    public static final Z q;
    public static final Z r;
    public static final Z s;
    public static final Z t;
    public static final Z u;
    public static final Z v;
    public static final Z w;
    public static final Z x;
    public static final Z y;
    public static final Z z;
    private final String mSubView;

    public static mSubView valueOf(String s1)
    {
        return (mSubView)Enum.valueOf(com/spotify/mobile/android/util/viewuri/ViewUri$SubView, s1);
    }

    public static mSubView[] values()
    {
        return (mSubView[])as.clone();
    }

    public final String toString()
    {
        return mSubView;
    }

    static 
    {
        a = new <init>("NONE", 0, "");
        b = new <init>("ERROR", 1, "error_view");
        c = new <init>("YOUR_STATIONS", 2, "your-stations");
        d = new <init>("RECOMMENDED_STATIONS", 3, "recommended-stations");
        e = new <init>("SAVED_STATIONS", 4, "saved-stations");
        f = new <init>("GENRE_STATIONS", 5, "genre-stations");
        aa = new <init>("CLUSTER_STATIONS", 6, "cluster-stations");
        ab = new <init>("CURRENT_STATION", 7, "current-station");
        g = new <init>("STATION_ENTITY", 8, "station-entity");
        h = new <init>("HEADER_VIEW", 9, "header_view");
        i = new <init>("GRID_VIEW", 10, "grid_view");
        ac = new <init>("UPSELL_BANNER", 11, "upsell-banner");
        j = new <init>("SKIP_LIMIT_REACHED", 12, "skip_limit_reached");
        k = new <init>("SHOWCASE", 13, "showcase");
        l = new <init>("AVAILABLE_OFFLINE", 14, "available_offline");
        m = new <init>("ADD_TO_QUEUE", 15, "add_to_queue");
        n = new <init>("DISABLE_SHUFFLE", 16, "disable_shuffle");
        o = new <init>("CAPPING_REACHED", 17, "capping_reached");
        p = new <init>("CHOOSE_EXTREME_QUALITY", 18, "choose_extreme_quality");
        ad = new <init>("SUGGESTED_TRACKS", 19, "suggested_tracks");
        q = new <init>("PLAY_ON_DEMAND", 20, "play_on_demand");
        r = new <init>("RECENT_SEARCHES", 21, "history");
        ae = new <init>("TOP_HIT", 22, "top_hit");
        af = new <init>("TRACKS", 23, "tracks");
        ag = new <init>("GENRES", 24, "genres");
        ah = new <init>("SUGGESTIONS", 25, "suggestions");
        ai = new <init>("PLAYLISTS", 26, "playlists");
        aj = new <init>("ALBUMS", 27, "albums");
        ak = new <init>("PROFILES", 28, "profiles");
        al = new <init>("ARTISTS", 29, "artists");
        s = new <init>("NO_RESULTS", 30, "no_results");
        t = new <init>("CAST", 31, "cast");
        u = new <init>("ZEROCONF", 32, "zeroconf");
        v = new <init>("DIAL", 33, "dial");
        w = new <init>("GAIA", 34, "gaia");
        x = new <init>("LOCAL", 35, "local");
        am = new <init>("LOCAL_DEVICE_DETECTED", 36, "local:device-detected");
        an = new <init>("LOCAL_NO_DEVICE_DETECTED", 37, "local:no-device-detected");
        ao = new <init>("REMOTE", 38, "remote");
        y = new <init>("ACTIVE_PLAYER_CHANGE", 39, "active-player-change");
        z = new <init>("START_TRIAL", 40, "start-trial");
        ap = new <init>("NEW_SINGLE", 41, "new-single");
        A = new <init>("OPEN_ACCESS", 42, "open_access");
        B = new <init>("SURVEY", 43, "Survey");
        C = new <init>("SEARCH_RESULTS", 44, "results");
        D = new <init>("SEARCH_START", 45, "search_start");
        E = new <init>("UPSELL_LEAD", 46, "lead");
        F = new <init>("UPSELL_PLUS_LEAD", 47, "plus_lead");
        G = new <init>("UPSELL_PLUS_CONSUMABLE", 48, "plus_consumable");
        H = new <init>("UPSELL_PLAY_ANY_SONG", 49, "play_any_song");
        I = new <init>("UPSELL_LISTEN_OFFLINE", 50, "listen_offline");
        J = new <init>("UPSELL_NO_ADS", 51, "no_ads");
        K = new <init>("UPSELL_BETTER_SOUND_QUALITY", 52, "better_sound_quality");
        L = new <init>("CANCEL_STATE_INTERSTITIAL", 53, "cancel_state_interstitial");
        aq = new <init>("CONTEXT_MENU", 54, "context-menu");
        M = new <init>("SEE_LISTENERS", 55, "see-listeners");
        N = new <init>("PLAYLIST_ANNOTATE_UPLOAD", 56, "annotate_upload");
        O = new <init>("PLAYLIST_ANNOTATE_IMAGE", 57, "annotate_image");
        P = new <init>("PAYMENT_FAILURE_BANNER", 58, "payment-failure-banner");
        Q = new <init>("SHARE_MAIN_SCREEN", 59, "main_share_screen");
        R = new <init>("SHARE_POST_TO_SCREEN", 60, "post_to_screen");
        S = new <init>("SHARE_SEND_TO_SCREEN", 61, "send_to_screen");
        T = new <init>("NO_STREAMING", 62, "no_streaming");
        U = new <init>("NAVIGATION_FOOTER", 63, "navigation_footer");
        V = new <init>("OPT_IN_BANNER", 64, "opt-in-banner");
        W = new <init>("RUNNING_MANUAL_STEP", 65, "manual");
        X = new <init>("STATUS", 66, "status");
        ar = new <init>("EVENTS", 67, "events");
        Y = new <init>("EVENT", 68, "event");
        Z = new <init>("LOCATION_SEARCH", 69, "location_search");
        as = (new as[] {
            a, b, c, d, e, f, aa, ab, g, h, 
            i, ac, j, k, l, m, n, o, p, ad, 
            q, r, ae, af, ag, ah, ai, aj, ak, al, 
            s, t, u, v, w, x, am, an, ao, y, 
            z, ap, A, B, C, D, E, F, G, H, 
            I, J, K, L, aq, M, N, O, P, Q, 
            R, S, T, U, V, W, X, ar, Y, Z
        });
    }

    private (String s1, int i1, String s2)
    {
        super(s1, i1);
        mSubView = (String)ctz.a(s2);
    }
}
