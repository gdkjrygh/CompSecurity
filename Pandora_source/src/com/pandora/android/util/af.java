// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.pandora.android.provider.b;
import com.pandora.radio.util.k;
import java.util.Locale;
import p.cw.c;

// Referenced classes of package com.pandora.android.util:
//            p, s

public class af
{
    public static class a extends com.pandora.radio.util.b
    {

        private static volatile af a;

        public static af a()
        {
            if (a == null)
            {
                a = new af();
            }
            return a;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b a()
        {
            return values()[p.cw.c.z.s().getResources().getConfiguration().orientation];
        }

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/pandora/android/util/af$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("UNKNOWN", 0);
            b = new b("PORTRAIT", 1);
            c = new b("LANDSCAPE", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i)
        {
            super(s1, i);
        }
    }

    public static final class c extends Enum
    {

        public static final c A;
        public static final c B;
        public static final c C;
        public static final c D;
        public static final c E;
        public static final c F;
        public static final c G;
        public static final c H;
        public static final c I;
        public static final c J;
        public static final c K;
        public static final c L;
        public static final c M;
        public static final c N;
        public static final c O;
        public static final c P;
        public static final c Q;
        public static final c R;
        public static final c S;
        public static final c T;
        public static final c U;
        public static final c V;
        public static final c W;
        public static final c X;
        public static final c Y;
        public static final c Z;
        public static final c a;
        public static final c aa;
        private static final c ad[];
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c g;
        public static final c h;
        public static final c i;
        public static final c j;
        public static final c k;
        public static final c l;
        public static final c m;
        public static final c n;
        public static final c o;
        public static final c p;
        public static final c q;
        public static final c r;
        public static final c s;
        public static final c t;
        public static final c u;
        public static final c v;
        public static final c w;
        public static final c x;
        public static final c y;
        public static final c z;
        public final p ab;
        public final String ac;

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/pandora/android/util/af$c, s1);
        }

        public static c[] values()
        {
            return (c[])ad.clone();
        }

        static 
        {
            a = new c("HISTORY_CLASSIC", 0, p.F, "history_classic");
            b = new c("HISTORY_DETAILED", 1, p.F, "history_detailed");
            c = new c("NOW_PLAYING_TRACK_CLASSIC", 2, p.F, "now_playing_track_classic");
            d = new c("NOW_PLAYING_TRACK_DETAILED", 3, p.F, "now_playing_track_detailed");
            e = new c("THUMB_HISTORY", 4, p.H, "thumb_history");
            f = new c("STATION_PERSONALIZATION", 5, p.H, "station_personalization");
            g = new c("ADD_VARIETY", 6, p.H, "add_variety");
            h = new c("FEED_ACTIVITY", 7, p.j, "feed");
            i = new c("FEED_INBOX", 8, p.j, "inbox");
            j = new c("FIND_PEOPLE", 9, p.j, "find_people");
            k = new c("FEED_PROFILE", 10, p.j, "profile");
            l = new c("FEED_PROFILE_STATIONS", 11, p.j, "stations");
            m = new c("FEED_PROFILE_LIKES", 12, p.j, "likes");
            n = new c("FEED_PROFILE_FOLLOWERS", 13, p.j, "followers");
            o = new c("FEED_PROFILE_FOLLOWING", 14, p.j, "following");
            p = new c("FEED_TRACK", 15, p.j, "track");
            q = new c("FEED_ARTIST", 16, p.j, "artist");
            r = new c("FEED_ALBUM", 17, p.j, "album");
            s = new c("FEED_STATION", 18, p.j, "station");
            t = new c("PROFILE", 19, p.l, "profile");
            u = new c("PROFILE_BOOKMARKS", 20, p.l, "bookmarks");
            v = new c("PROFILE_EDIT", 21, p.l, "editProfile");
            w = new c("PROFILE_FOLLOWERS", 22, p.l, "followers");
            x = new c("PROFILE_FOLLOWING", 23, p.l, "following");
            y = new c("PROFILE_LIKES", 24, p.l, "likes");
            z = new c("PROFILE_TRACK", 25, p.l, "track");
            A = new c("PROFILE_ARTIST", 26, p.l, "artist");
            B = new c("PROFILE_ALBUM", 27, p.l, "album");
            C = new c("PROFILE_STATION", 28, p.l, "station");
            D = new c("SETTINGS", 29, p.r, "settings");
            E = new c("ACCOUNT_SETTINGS", 30, p.r, "account_settings");
            F = new c("P1_UPGRADE", 31, p.r, "p1_upgrade");
            G = new c("PRIVACY_SETTINGS", 32, p.r, "privacy_settings");
            H = new c("NOTIFICATIONS_SETTINGS", 33, p.r, "notifications_settings");
            I = new c("ADVANCED_SETTINGS", 34, p.r, "advanced_settings");
            J = new c("DEVICES_SETTINGS", 35, p.r, "devices_settings");
            K = new c("ARTIST_MESSAGE_SETTINGS", 36, p.r, "artist_audio_messsage_settings");
            L = new c("SLEEP_TIMER_SETTINGS", 37, p.r, "sleep_timer_settings");
            M = new c("ALARM_CLOCK_SETTINGS", 38, p.r, "alarm_clock_settings");
            N = new c("STATION_LIST", 39, p.a, "station_list");
            O = new c("SEARCH_RESULTS", 40, p.a, "search_results");
            P = new c("GENRE_CATEGORIES_LIST", 41, p.a, "genre_categories_list");
            Q = new c("GENRE_STATIONS_LIST", 42, p.a, "genre_stations_list");
            R = new c("RECOMMENDATIONS_LIST", 43, p.a, "recommendations_list");
            S = new c("SHARE_NOW_PLAYING_TRACK", 44, p.G, "now_playing_track");
            T = new c("SHARE_NOW_PLAYING_STATION", 45, p.G, "now_playing_station");
            U = new c("SHARE_PROFILE_TRACK", 46, p.G, "profile_track");
            V = new c("SHARE_FEED_TRACK", 47, p.G, "feed_track");
            W = new c("SHUFFLE_STATIONS", 48, p.g, "shuffle_stations");
            X = new c("BACKSTAGE_TRACK", 49, p.C, "track_detail");
            Y = new c("BACKSTAGE_ARTIST", 50, p.D, "artist_detail");
            Z = new c("BACKSTAGE_ALBUM", 51, p.E, "album_detail");
            aa = new c("NONE", 52, p.N, "none");
            ad = (new c[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B, C, D, 
                E, F, G, H, I, J, K, L, M, N, 
                O, P, Q, R, S, T, U, V, W, X, 
                Y, Z, aa
            });
        }

        private c(String s1, int i1, p p1, String s2)
        {
            super(s1, i1);
            ab = p1;
            ac = s2;
        }
    }

    public static interface d
    {

        public abstract c v();
    }


    protected b a;
    protected c b;
    protected k c;

    private af()
    {
        a = b.a;
        b = c.aa;
        c = com.pandora.android.provider.b.a.b().o();
    }


    public static c a(p p1, String s1)
    {
        p1 = p1.name().toLowerCase(Locale.US);
        s1 = s1.toLowerCase(Locale.US);
        c ac[] = c.values();
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            c c1 = ac[i];
            if (c1.ab.name().toLowerCase(Locale.US).equals(p1) && c1.ac.equals(s1))
            {
                return c1;
            }
        }

        return c.aa;
    }

    public static af a()
    {
        return a.a();
    }

    private boolean c()
    {
        while (s.u() || b == c.aa || b == c.X || b == c.Y || b == c.Z) 
        {
            return false;
        }
        return true;
    }

    public void a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (c1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("viewMode is null. viewMode is a required parameter");
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
        c c2 = c.aa;
        if (c1 != c2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (c1 == b && a == b.a()) goto _L1; else goto _L3
_L3:
        b = c1;
        a = b.a();
        if (c())
        {
            c.a(c1.ab.name().toLowerCase(Locale.US), c1.ac.toLowerCase(Locale.US), a.name().toLowerCase(Locale.US));
        }
          goto _L1
    }

    public c b()
    {
        return b;
    }
}
