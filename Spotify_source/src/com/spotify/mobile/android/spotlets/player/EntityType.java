// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.player;

import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import ctz;
import faj;
import fak;
import fiy;
import gjm;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class EntityType extends Enum
{

    public static final EntityType A;
    public static final EntityType B;
    private static EntityType C;
    private static EntityType D;
    private static EntityType E;
    private static EntityType F;
    private static EntityType G;
    private static EntityType H;
    private static EntityType I;
    private static EntityType J;
    private static EntityType K;
    private static EntityType L;
    private static EntityType M;
    private static EntityType N;
    private static EntityType O;
    private static EntityType P;
    private static Map Q;
    private static final EntityType R[];
    public static final EntityType a;
    public static final EntityType b;
    public static final EntityType c;
    public static final EntityType d;
    public static final EntityType e;
    public static final EntityType f;
    public static final EntityType g;
    public static final EntityType h;
    public static final EntityType i;
    public static final EntityType j;
    public static final EntityType k;
    public static final EntityType l;
    public static final EntityType m;
    public static final EntityType n;
    public static final EntityType o;
    public static final EntityType p;
    public static final EntityType q;
    public static final EntityType r;
    public static final EntityType s;
    public static final EntityType t;
    public static final EntityType u;
    public static final EntityType v;
    public static final EntityType w;
    public static final EntityType x;
    public static final EntityType y;
    public static final EntityType z;
    public final faj mSubtitleHolder;
    public final faj mTitleHolder;

    private EntityType(String s1, int i1, int j1)
    {
        this(s1, i1, j1, 0);
    }

    private EntityType(String s1, int i1, int j1, int k1)
    {
        super(s1, i1);
        mTitleHolder = new fak(j1);
        mSubtitleHolder = new fak(k1);
    }

    public static EntityType a(PlayerState playerstate, Flags flags)
    {
        ctz.a(playerstate);
        ctz.a(flags);
        Object obj = playerstate.track();
        Object obj1;
        if (obj != null)
        {
            obj = ((PlayerTrack) (obj)).provider();
            final class _cls1
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[EntityType.values().length];
                    try
                    {
                        b[EntityType.x.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        b[EntityType.v.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        b[EntityType.w.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        b[EntityType.y.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        b[EntityType.z.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        b[EntityType.B.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        b[EntityType.A.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.P.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aF.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            PlayOrigin playorigin;
            if (obj == null)
            {
                obj = "";
            }
            obj = (String)obj;
        } else
        {
            obj = "";
        }
        obj1 = C;
        if ("queue".equals(obj))
        {
            obj = I;
        } else
        if (((String) (obj)).startsWith("mft/"))
        {
            obj = L;
        } else
        if ("ad".equals(obj))
        {
            obj = a;
        } else
        {
            obj = obj1;
        }
        obj1 = obj;
        if (obj != C) goto _L2; else goto _L1
_L1:
        playorigin = playerstate.playOrigin();
        obj = playorigin.featureIdentifier();
        obj = (EntityType)Q.get(((String) (obj)).toLowerCase(Locale.US));
        obj1 = C;
        if (obj == null)
        {
            obj = obj1;
        }
        obj = (EntityType)obj;
        obj1 = obj;
        if (obj != C) goto _L2; else goto _L3
_L3:
        obj1 = playorigin.viewUri();
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        obj = C;
        if (!ViewUri.am.b(((String) (obj1)))) goto _L7; else goto _L6
_L6:
        obj = b;
_L5:
        obj1 = obj;
        if (obj != C) goto _L2; else goto _L8
_L8:
        playerstate = new SpotifyLink(playerstate.entityUri());
        _cls1.a[((SpotifyLink) (playerstate)).c.ordinal()];
        JVM INSTR tableswitch 1 4: default 204
    //                   1 791
    //                   2 791
    //                   3 798
    //                   4 798;
           goto _L9 _L10 _L10 _L11 _L11
_L9:
        obj1 = C;
_L2:
        if (!fiy.a(flags)) goto _L13; else goto _L12
_L12:
        _cls1.b[((EntityType) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 7: default 264
    //                   1 805
    //                   2 809
    //                   3 813
    //                   4 817
    //                   5 821
    //                   6 825
    //                   7 829;
           goto _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L13:
        return ((EntityType) (obj1));
_L7:
        if (ViewUri.ag.b(((String) (obj1))))
        {
            obj = g;
        } else
        if (ViewUri.ad.b(((String) (obj1))))
        {
            obj = e;
        } else
        if (ViewUri.ae.b(((String) (obj1))))
        {
            obj = d;
        } else
        if (ViewUri.af.b(((String) (obj1))))
        {
            obj = r;
        } else
        if (ViewUri.ah.b(((String) (obj1))))
        {
            obj = k;
        } else
        if (ViewUri.h.a(((String) (obj1))))
        {
            obj = l;
        } else
        if (ViewUri.ab.b(((String) (obj1))))
        {
            obj = g;
        } else
        if (ViewUri.Y.b(((String) (obj1))))
        {
            obj = e;
        } else
        if (ViewUri.Z.b(((String) (obj1))))
        {
            obj = d;
        } else
        if (ViewUri.aa.b(((String) (obj1))))
        {
            obj = r;
        } else
        if (ViewUri.ac.b(((String) (obj1))))
        {
            obj = k;
        } else
        if (ViewUri.V.b(((String) (obj1))))
        {
            obj = l;
        } else
        if (ViewUri.an.b(((String) (obj1))))
        {
            obj = c;
        } else
        if (ViewUri.G.a(((String) (obj1))))
        {
            obj = F;
        } else
        if (ViewUri.aj.b(((String) (obj1))))
        {
            if (((String) (obj1)).startsWith("starred") || ((String) (obj1)).matches("^spotify:user:[^:]+:(starred|publishedstarred)$"))
            {
                obj = p;
            } else
            {
                obj = i;
            }
        } else
        if (ViewUri.ak.b(((String) (obj1))))
        {
            obj = j;
        } else
        if (ViewUri.S.b(((String) (obj1))))
        {
            obj = n;
        } else
        if (ViewUri.bp.b(((String) (obj1))))
        {
            obj = v;
        } else
        if (ViewUri.bj.a(((String) (obj1))) || ViewUri.bk.a(((String) (obj1))) || ViewUri.bs.a(((String) (obj1))))
        {
            obj = x;
        } else
        if (ViewUri.bq.b(((String) (obj1))))
        {
            obj = w;
        } else
        if (ViewUri.br.a(((String) (obj1))))
        {
            obj = y;
        } else
        if (ViewUri.bu.a(((String) (obj1))))
        {
            obj = z;
        } else
        if (ViewUri.bv.a(((String) (obj1))))
        {
            obj = A;
        } else
        if (ViewUri.bw.a(((String) (obj1))))
        {
            obj = B;
        } else
        if (ViewUri.i.a(((String) (obj1))))
        {
            obj = q;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        obj1 = o;
          goto _L2
_L11:
        obj1 = m;
          goto _L2
_L14:
        return s;
_L15:
        return t;
_L16:
        return u;
_L17:
        return M;
_L18:
        return N;
_L19:
        return P;
_L20:
        return O;
        if (true) goto _L5; else goto _L21
_L21:
    }

    public static EntityType valueOf(String s1)
    {
        return (EntityType)Enum.valueOf(com/spotify/mobile/android/spotlets/player/EntityType, s1);
    }

    public static EntityType[] values()
    {
        return (EntityType[])R.clone();
    }

    static 
    {
        C = new EntityType("UNKNOWN", 0, 0, 0);
        a = new EntityType("ADVERTISEMENT", 1, 0x7f0803f4);
        b = new EntityType("ALBUM", 2, 0x7f08023f);
        c = new EntityType("ARTIST", 3, 0x7f080241);
        D = new EntityType("ACTIVITY", 4, 0x7f08023e, 0x7f08004d);
        d = new EntityType("ALBUM_RADIO", 5, 0x7f080240);
        e = new EntityType("ARTIST_RADIO", 6, 0x7f080242);
        E = new EntityType("BROWSE", 7, 0x7f080243);
        f = new EntityType("CHARTS", 8, 0x7f080244);
        g = new EntityType("GENRE_RADIO", 9, 0x7f080248);
        F = new EntityType("INBOX", 10, 0x7f080249, 0x7f08023d);
        G = new EntityType("LOCAL_FILES", 11, 0x7f080245, 0x7f080326);
        h = new EntityType("NEW_MUSIC_TUESDAY", 12, 0x7f08023f);
        H = new EntityType("PARTY", 13, 0x7f08024b);
        I = new EntityType("PLAY_QUEUE", 14, 0x7f08024c);
        i = new EntityType("PLAYLIST", 15, 0x7f08024d);
        j = new EntityType("PLAYLIST_FOLDER", 16, 0x7f080247);
        k = new EntityType("PLAYLIST_RADIO", 17, 0x7f08024e);
        J = new EntityType("PROFILE", 18, 0x7f08024f);
        l = new EntityType("RADIO", 19, 0x7f080250);
        m = new EntityType("RUNNING", 20, 0x7f080251);
        n = new EntityType("SEARCH", 21, 0x7f080252);
        K = new EntityType("SOCIAL_CHART", 22, 0x7f08024d, 0x7f08051b);
        o = new EntityType("SHOW", 23, 0x7f080253);
        p = new EntityType("STARRED_TRACKS_PLAYLIST", 24, 0x7f080254, 0x7f0803fa);
        q = new EntityType("START_PAGE", 25, 0x7f08024a);
        L = new EntityType("SUGGESTED_TRACK", 26, 0x7f080255);
        r = new EntityType("TRACK_RADIO", 27, 0x7f080256);
        s = new EntityType("YOUR_LIBRARY", 28, 0x7f080246, 0x7f0801a8);
        t = new EntityType("YOUR_LIBRARY_ALBUM", 29, 0x7f080246);
        u = new EntityType("YOUR_LIBRARY_ARTIST", 30, 0x7f080246);
        M = new EntityType("YOUR_LIBRARY_TRACKS", 31, 0x7f080246, 0x7f0801a8);
        N = new EntityType("YOUR_LIBRARY_OFFLINED_EPISODES", 32, 0x7f080246, 0x7f080193);
        O = new EntityType("YOUR_LIBRARY_UNPLAYED_EPISODES", 33, 0x7f080246, 0x7f080198);
        P = new EntityType("YOUR_LIBRARY_SAVED_EPISODES", 34, 0x7f080246, 0x7f080196);
        v = new EntityType("YOUR_MUSIC_ALBUM", 35, 0x7f080245);
        w = new EntityType("YOUR_MUSIC_ARTIST", 36, 0x7f080245);
        x = new EntityType("YOUR_MUSIC", 37, 0x7f080245, 0x7f0801a8);
        y = new EntityType("YOUR_MUSIC_TRACKS", 38, 0x7f080245, 0x7f0801a8);
        z = new EntityType("YOUR_MUSIC_OFFLINED_EPISODES", 39, 0x7f080245, 0x7f080193);
        A = new EntityType("YOUR_MUSIC_UNPLAYED_EPISODES", 40, 0x7f080245, 0x7f080198);
        B = new EntityType("YOUR_MUSIC_SAVED_EPISODES", 41, 0x7f080245, 0x7f080196);
        R = (new EntityType[] {
            C, a, b, c, D, d, e, E, f, g, 
            F, G, h, H, I, i, j, k, J, l, 
            m, n, K, o, p, q, L, r, s, t, 
            u, M, N, O, P, v, w, x, y, z, 
            A, B
        });
        HashMap hashmap = new HashMap();
        Q = hashmap;
        hashmap.put("album", b);
        Q.put("com.spotify.feature.album", b);
        Q.put(FeatureIdentifier.K.a(), c);
        Q.put("com.spotify.feature.artist", c);
        Q.put("chart", f);
        Q.put("inbox", F);
        Q.put("library", p);
        Q.put("library-collection", x);
        Q.put("library-collection-album", v);
        Q.put("library-collection-artist", w);
        Q.put("library-collection-missing-album", b);
        Q.put("localfiles", G);
        Q.put(FeatureIdentifier.z.a(), i);
        Q.put("playlistfolder", j);
        Q.put("playlists", j);
        Q.put("playqueue", I);
        Q.put("profile", J);
        Q.put("search", n);
        Q.put("com.spotify.feature.search", n);
        Q.put(FeatureIdentifier.D.a(), K);
        Q.put("social-charts", K);
        Q.put("com.spotify.feature.social-chart", K);
        Q.put("com.spotify.feature.profile", J);
        Q.put("social-feed", D);
        Q.put("com.spotify.feature.browse", E);
        Q.put("com.spotify.feature.newmusictuesday", h);
        Q.put("com.spotify.feature.chart", f);
        Q.put(FeatureIdentifier.F.a(), m);
        Q.put("com.spotify.feature.startpage", q);
        Q.put(FeatureIdentifier.E.a(), q);
        Q.put(FeatureIdentifier.G.a(), H);
    }
}
