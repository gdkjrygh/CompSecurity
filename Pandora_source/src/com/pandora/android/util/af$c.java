// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;


// Referenced classes of package com.pandora.android.util:
//            af, p

public static final class ac extends Enum
{

    public static final aa A;
    public static final aa B;
    public static final aa C;
    public static final aa D;
    public static final aa E;
    public static final aa F;
    public static final aa G;
    public static final aa H;
    public static final aa I;
    public static final aa J;
    public static final aa K;
    public static final aa L;
    public static final aa M;
    public static final aa N;
    public static final aa O;
    public static final aa P;
    public static final aa Q;
    public static final aa R;
    public static final aa S;
    public static final aa T;
    public static final aa U;
    public static final aa V;
    public static final aa W;
    public static final aa X;
    public static final aa Y;
    public static final aa Z;
    public static final aa a;
    public static final aa aa;
    private static final aa ad[];
    public static final aa b;
    public static final aa c;
    public static final aa d;
    public static final aa e;
    public static final aa f;
    public static final aa g;
    public static final aa h;
    public static final aa i;
    public static final aa j;
    public static final aa k;
    public static final aa l;
    public static final aa m;
    public static final aa n;
    public static final aa o;
    public static final aa p;
    public static final aa q;
    public static final aa r;
    public static final aa s;
    public static final aa t;
    public static final aa u;
    public static final aa v;
    public static final aa w;
    public static final aa x;
    public static final aa y;
    public static final aa z;
    public final p ab;
    public final String ac;

    public static ac valueOf(String s1)
    {
        return (ac)Enum.valueOf(com/pandora/android/util/af$c, s1);
    }

    public static ac[] values()
    {
        return (ac[])ad.clone();
    }

    static 
    {
        a = new <init>("HISTORY_CLASSIC", 0, p.F, "history_classic");
        b = new <init>("HISTORY_DETAILED", 1, p.F, "history_detailed");
        c = new <init>("NOW_PLAYING_TRACK_CLASSIC", 2, p.F, "now_playing_track_classic");
        d = new <init>("NOW_PLAYING_TRACK_DETAILED", 3, p.F, "now_playing_track_detailed");
        e = new <init>("THUMB_HISTORY", 4, p.H, "thumb_history");
        f = new <init>("STATION_PERSONALIZATION", 5, p.H, "station_personalization");
        g = new <init>("ADD_VARIETY", 6, p.H, "add_variety");
        h = new <init>("FEED_ACTIVITY", 7, p.j, "feed");
        i = new <init>("FEED_INBOX", 8, p.j, "inbox");
        j = new <init>("FIND_PEOPLE", 9, p.j, "find_people");
        k = new <init>("FEED_PROFILE", 10, p.j, "profile");
        l = new <init>("FEED_PROFILE_STATIONS", 11, p.j, "stations");
        m = new <init>("FEED_PROFILE_LIKES", 12, p.j, "likes");
        n = new <init>("FEED_PROFILE_FOLLOWERS", 13, p.j, "followers");
        o = new <init>("FEED_PROFILE_FOLLOWING", 14, p.j, "following");
        p = new <init>("FEED_TRACK", 15, p.j, "track");
        q = new <init>("FEED_ARTIST", 16, p.j, "artist");
        r = new <init>("FEED_ALBUM", 17, p.j, "album");
        s = new <init>("FEED_STATION", 18, p.j, "station");
        t = new <init>("PROFILE", 19, p.l, "profile");
        u = new <init>("PROFILE_BOOKMARKS", 20, p.l, "bookmarks");
        v = new <init>("PROFILE_EDIT", 21, p.l, "editProfile");
        w = new <init>("PROFILE_FOLLOWERS", 22, p.l, "followers");
        x = new <init>("PROFILE_FOLLOWING", 23, p.l, "following");
        y = new <init>("PROFILE_LIKES", 24, p.l, "likes");
        z = new <init>("PROFILE_TRACK", 25, p.l, "track");
        A = new <init>("PROFILE_ARTIST", 26, p.l, "artist");
        B = new <init>("PROFILE_ALBUM", 27, p.l, "album");
        C = new <init>("PROFILE_STATION", 28, p.l, "station");
        D = new <init>("SETTINGS", 29, p.r, "settings");
        E = new <init>("ACCOUNT_SETTINGS", 30, p.r, "account_settings");
        F = new <init>("P1_UPGRADE", 31, p.r, "p1_upgrade");
        G = new <init>("PRIVACY_SETTINGS", 32, p.r, "privacy_settings");
        H = new <init>("NOTIFICATIONS_SETTINGS", 33, p.r, "notifications_settings");
        I = new <init>("ADVANCED_SETTINGS", 34, p.r, "advanced_settings");
        J = new <init>("DEVICES_SETTINGS", 35, p.r, "devices_settings");
        K = new <init>("ARTIST_MESSAGE_SETTINGS", 36, p.r, "artist_audio_messsage_settings");
        L = new <init>("SLEEP_TIMER_SETTINGS", 37, p.r, "sleep_timer_settings");
        M = new <init>("ALARM_CLOCK_SETTINGS", 38, p.r, "alarm_clock_settings");
        N = new <init>("STATION_LIST", 39, p.a, "station_list");
        O = new <init>("SEARCH_RESULTS", 40, p.a, "search_results");
        P = new <init>("GENRE_CATEGORIES_LIST", 41, p.a, "genre_categories_list");
        Q = new <init>("GENRE_STATIONS_LIST", 42, p.a, "genre_stations_list");
        R = new <init>("RECOMMENDATIONS_LIST", 43, p.a, "recommendations_list");
        S = new <init>("SHARE_NOW_PLAYING_TRACK", 44, p.G, "now_playing_track");
        T = new <init>("SHARE_NOW_PLAYING_STATION", 45, p.G, "now_playing_station");
        U = new <init>("SHARE_PROFILE_TRACK", 46, p.G, "profile_track");
        V = new <init>("SHARE_FEED_TRACK", 47, p.G, "feed_track");
        W = new <init>("SHUFFLE_STATIONS", 48, p.g, "shuffle_stations");
        X = new <init>("BACKSTAGE_TRACK", 49, p.C, "track_detail");
        Y = new <init>("BACKSTAGE_ARTIST", 50, p.D, "artist_detail");
        Z = new <init>("BACKSTAGE_ALBUM", 51, p.E, "album_detail");
        aa = new <init>("NONE", 52, p.N, "none");
        ad = (new ad[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N, 
            O, P, Q, R, S, T, U, V, W, X, 
            Y, Z, aa
        });
    }

    private (String s1, int i1, p p1, String s2)
    {
        super(s1, i1);
        ab = p1;
        ac = s2;
    }
}
