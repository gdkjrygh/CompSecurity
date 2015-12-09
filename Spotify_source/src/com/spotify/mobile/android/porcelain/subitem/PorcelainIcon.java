// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.subitem;

import com.spotify.android.paste.graphics.SpotifyIcon;
import ctz;
import gdf;

public final class PorcelainIcon extends Enum
{

    private static PorcelainIcon A;
    private static PorcelainIcon B;
    private static final gdf C = gdf.a(com/spotify/mobile/android/porcelain/subitem/PorcelainIcon);
    private static final PorcelainIcon D[];
    public static final PorcelainIcon a;
    public static final PorcelainIcon b;
    public static final PorcelainIcon c;
    public static final PorcelainIcon d;
    public static final PorcelainIcon e;
    public static final PorcelainIcon f;
    public static final PorcelainIcon g;
    public static final PorcelainIcon h;
    public static final PorcelainIcon i;
    public static final PorcelainIcon j;
    public static final PorcelainIcon k;
    public static final PorcelainIcon l;
    public static final PorcelainIcon m;
    public static final PorcelainIcon n;
    public static final PorcelainIcon o;
    public static final PorcelainIcon p;
    public static final PorcelainIcon q;
    private static PorcelainIcon r;
    private static PorcelainIcon s;
    private static PorcelainIcon t;
    private static PorcelainIcon u;
    private static PorcelainIcon v;
    private static PorcelainIcon w;
    private static PorcelainIcon x;
    private static PorcelainIcon y;
    private static PorcelainIcon z;
    public final SpotifyIcon mIcon;

    private PorcelainIcon(String s1, int i1, SpotifyIcon spotifyicon)
    {
        super(s1, i1);
        mIcon = (SpotifyIcon)ctz.a(spotifyicon);
    }

    public static gdf a()
    {
        return C;
    }

    public static PorcelainIcon valueOf(String s1)
    {
        return (PorcelainIcon)Enum.valueOf(com/spotify/mobile/android/porcelain/subitem/PorcelainIcon, s1);
    }

    public static PorcelainIcon[] values()
    {
        return (PorcelainIcon[])D.clone();
    }

    static 
    {
        r = new PorcelainIcon("ALBUM", 0, SpotifyIcon.b);
        a = new PorcelainIcon("ARTIST", 1, SpotifyIcon.d);
        s = new PorcelainIcon("CALENDAR", 2, SpotifyIcon.an);
        b = new PorcelainIcon("CHART", 3, SpotifyIcon.bd);
        t = new PorcelainIcon("CONNECT", 4, SpotifyIcon.ap);
        c = new PorcelainIcon("DISCOVER", 5, SpotifyIcon.al);
        u = new PorcelainIcon("DOTDOTDOT", 6, SpotifyIcon.aM);
        v = new PorcelainIcon("EPISODE", 7, SpotifyIcon.ac);
        w = new PorcelainIcon("EVENT", 8, SpotifyIcon.aq);
        d = new PorcelainIcon("FLAG", 9, SpotifyIcon.s);
        e = new PorcelainIcon("GENRE", 10, SpotifyIcon.g);
        f = new PorcelainIcon("HIGHLIGHT", 11, SpotifyIcon.aY);
        x = new PorcelainIcon("HOME", 12, SpotifyIcon.ar);
        y = new PorcelainIcon("LIBRARY", 13, SpotifyIcon.aL);
        g = new PorcelainIcon("PARTY", 14, SpotifyIcon.bv);
        h = new PorcelainIcon("PAYMENTHISTORY", 15, SpotifyIcon.aZ);
        i = new PorcelainIcon("PLAY", 16, SpotifyIcon.C);
        j = new PorcelainIcon("PLAYLIST", 17, SpotifyIcon.E);
        z = new PorcelainIcon("PROFILE", 18, SpotifyIcon.ag);
        k = new PorcelainIcon("RADIO", 19, SpotifyIcon.K);
        A = new PorcelainIcon("RADIO_NEW", 20, SpotifyIcon.aP);
        l = new PorcelainIcon("RUNNING", 21, SpotifyIcon.bs);
        m = new PorcelainIcon("SHOW", 22, SpotifyIcon.aX);
        n = new PorcelainIcon("STARTPAGE", 23, SpotifyIcon.bp);
        o = new PorcelainIcon("TRACK", 24, SpotifyIcon.ac);
        p = new PorcelainIcon("TRENDING", 25, SpotifyIcon.ae);
        q = new PorcelainIcon("VIDEO", 26, SpotifyIcon.bk);
        B = new PorcelainIcon("X", 27, SpotifyIcon.ai);
        D = (new PorcelainIcon[] {
            r, a, s, b, t, c, u, v, w, d, 
            e, f, x, y, g, h, i, j, z, k, 
            A, l, m, n, o, p, q, B
        });
    }
}
