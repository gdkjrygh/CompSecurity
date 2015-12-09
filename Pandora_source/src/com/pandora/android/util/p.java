// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import java.util.Locale;

public final class p extends Enum
{

    public static final p A;
    public static final p B;
    public static final p C;
    public static final p D;
    public static final p E;
    public static final p F;
    public static final p G;
    public static final p H;
    public static final p I;
    public static final p J;
    public static final p K;
    public static final p L;
    public static final p M;
    public static final p N;
    private static final p P[];
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final p i;
    public static final p j;
    public static final p k;
    public static final p l;
    public static final p m;
    public static final p n;
    public static final p o;
    public static final p p;
    public static final p q;
    public static final p r;
    public static final p s;
    public static final p t;
    public static final p u;
    public static final p v;
    public static final p w;
    public static final p x;
    public static final p y;
    public static final p z;
    public final String O;

    private p(String s1, int i1)
    {
        super(s1, i1);
        O = name().toLowerCase(Locale.US);
    }

    public static p valueOf(String s1)
    {
        return (p)Enum.valueOf(com/pandora/android/util/p, s1);
    }

    public static p[] values()
    {
        return (p[])P.clone();
    }

    static 
    {
        a = new p("STATIONS", 0);
        b = new p("SEARCH_RESULTS", 1);
        c = new p("SEARCH_CREATE_STATION", 2);
        d = new p("SEARCH_ADD_MUSIC_SEED", 3);
        e = new p("STATION_DETAILS", 4);
        f = new p("EDIT_STATION", 5);
        g = new p("SHUFFLE_OPTIONS", 6);
        h = new p("GENRE_CATEGORIES_LIST", 7);
        i = new p("GENRE_STATIONS_LIST", 8);
        j = new p("FEED", 9);
        k = new p("FIND_PEOPLE", 10);
        l = new p("PROFILE", 11);
        m = new p("EDIT_PROFILE", 12);
        n = new p("BOOKMARKS", 13);
        o = new p("LIKES", 14);
        p = new p("FOLLOWING", 15);
        q = new p("FOLLOWERS", 16);
        r = new p("SETTINGS", 17);
        s = new p("P1_UPGRADE", 18);
        t = new p("PRIVACY_SETTINGS", 19);
        u = new p("ACCOUNT_SETTINGS", 20);
        v = new p("COMMUNICATIONS_SETTINGS", 21);
        w = new p("ADVANCED_SETTINGS", 22);
        x = new p("SLEEP_TIMER_SETTINGS", 23);
        y = new p("ALARM_CLOCK_SETTINGS", 24);
        z = new p("DEVICES_SETTINGS", 25);
        A = new p("ARTIST_MESSAGE_SETTINGS", 26);
        B = new p("NOTICES", 27);
        C = new p("TRACK_DETAIL", 28);
        D = new p("ARTIST_DETAIL", 29);
        E = new p("ALBUM_DETAIL", 30);
        F = new p("NOW_PLAYING", 31);
        G = new p("SHARING", 32);
        H = new p("STATION_PERSONALIZATION", 33);
        I = new p("COMMENT", 34);
        J = new p("THUMBED_UP_HISTORY", 35);
        K = new p("THUMBED_DOWN_HISTORY", 36);
        L = new p("ADD_VARIETY", 37);
        M = new p("LANDING_PAGE", 38);
        N = new p("NONE", 39);
        P = (new p[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r, s, t, 
            u, v, w, x, y, z, A, B, C, D, 
            E, F, G, H, I, J, K, L, M, N
        });
    }
}
