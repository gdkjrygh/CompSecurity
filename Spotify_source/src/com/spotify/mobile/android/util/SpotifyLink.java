// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.content.UriMatcher;
import android.net.Uri;
import android.text.TextUtils;
import cty;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SpotifyLink
{

    private static final UriMatcher d = new UriMatcher(-1);
    private static final Pattern e = Pattern.compile("user:([^:]+)");
    public final Uri a;
    public String b;
    public final LinkType c;
    private final String f;

    public SpotifyLink(String s)
    {
        if (s == null)
        {
            a = Uri.EMPTY;
            c = LinkType.O;
            f = null;
            return;
        }
        if (s.startsWith("spotify://"))
        {
            f = "spotify://";
        } else
        if (s.startsWith("spotify:"))
        {
            f = "spotify:";
        } else
        if (s.startsWith("http://open.spotify.com/"))
        {
            f = "http://open.spotify.com/";
        } else
        if (s.startsWith("https://open.spotify.com/"))
        {
            f = "https://open.spotify.com/";
        } else
        if (s.startsWith("https://r.spotify.com/"))
        {
            int j = s.indexOf("/app_android/");
            String s1 = s;
            if (j > 0)
            {
                b = s.substring(j + 13);
                b = b.replaceFirst("([^/?]+).*", "$1");
                s1 = s.substring(0, j);
            }
            f = "https://r.spotify.com/";
            s = s1;
        } else
        {
            f = null;
        }
        if (f == null)
        {
            a = Uri.EMPTY;
            c = LinkType.O;
            return;
        }
        s = Uri.parse(s.substring(f.length()).replace(':', '/'));
        Uri uri = Uri.EMPTY;
        int k;
        if (s == null)
        {
            s = uri;
        }
        a = (Uri)s;
        k = d.match(a);
        if (k == -1)
        {
            c = LinkType.O;
            return;
        } else
        {
            c = LinkType.a(k);
            return;
        }
    }

    public static SpotifyLink a(String s)
    {
        return new SpotifyLink((new StringBuilder("spotify:user:")).append(s).toString());
    }

    private String a(int j, int k)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("spotify:");
        List list = a.getPathSegments();
        for (int l = 0; l < list.size(); l++)
        {
            if (l >= j && l <= k)
            {
                continue;
            }
            if (stringbuilder.charAt(stringbuilder.length() - 1) != ':')
            {
                stringbuilder.append(':');
            }
            stringbuilder.append(Uri.encode((String)list.get(l)));
        }

        return stringbuilder.toString();
    }

    private static void a(String s, LinkType linktype)
    {
        d.addURI("*", s, linktype.ordinal());
    }

    public static transient boolean a(String s, LinkType alinktype[])
    {
        boolean flag1 = false;
        s = new SpotifyLink(s);
        int k = alinktype.length;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < k)
                {
                    LinkType linktype = alinktype[j];
                    if (((SpotifyLink) (s)).c != linktype)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    private String b(int j)
    {
        String s = a(j);
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return (new StringBuilder("spotify:track:")).append(Uri.encode(s)).toString();
        }
    }

    public static boolean b(String s)
    {
        return (new SpotifyLink(s)).c != LinkType.O;
    }

    public final String a()
    {
        Matcher matcher = e.matcher(d());
        if (matcher.find())
        {
            return Uri.decode(matcher.group(1));
        } else
        {
            return null;
        }
    }

    public final String a(int j)
    {
        if (d.match(a) == -1 || j < 0 || j >= a.getPathSegments().size())
        {
            return null;
        }
        String s;
        try
        {
            s = URLDecoder.decode(a.getEncodedPath().split("/")[j], "utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError();
        }
        return s;
    }

    public final String a(int j, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("spotify:");
        List list = a.getPathSegments();
        for (int k = 0; k < list.size(); k++)
        {
            if (stringbuilder.charAt(stringbuilder.length() - 1) != ':')
            {
                stringbuilder.append(':');
            }
            if (k == j)
            {
                stringbuilder.append(Uri.encode(s));
            }
            stringbuilder.append(Uri.encode((String)list.get(k)));
        }

        if (j >= list.size())
        {
            stringbuilder.append(':');
            stringbuilder.append(Uri.encode(s));
        }
        return stringbuilder.toString();
    }

    public final String b()
    {
        public final class _cls1
        {

            public static final int a[];

            static 
            {
                a = new int[LinkType.values().length];
                try
                {
                    a[LinkType.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    a[LinkType.v.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    a[LinkType.g.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[LinkType.x.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[LinkType.an.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[LinkType.s.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[LinkType.r.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[LinkType.aJ.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[LinkType.P.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[LinkType.i.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[LinkType.k.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[LinkType.j.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[LinkType.aD.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[LinkType.d.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[LinkType.aK.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[LinkType.f.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[LinkType.G.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[LinkType.h.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[LinkType.e.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[LinkType.ap.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[LinkType.Q.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[LinkType.ay.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[c.ordinal()])
        {
        default:
            throw new UnsupportedOperationException("URI is does not contain an ID");

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return a.getLastPathSegment();
        }
    }

    public final String c()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (f != null)
        {
            s = f;
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(a.toString()).toString();
    }

    public final String c(String s)
    {
        if (d.match(a) == -1 || 1 >= a.getPathSegments().size())
        {
            return null;
        }
        String as[];
        int j;
        try
        {
            as = a.getEncodedPath().split("/");
            as = (String[])Arrays.copyOfRange(as, 1, as.length);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError();
        }
        j = 0;
        if (j >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        as[j] = URLDecoder.decode(as[j], "utf-8");
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_59;
_L1:
        s = TextUtils.join(s, as);
        return s;
    }

    public final String d()
    {
        if (Uri.EMPTY.equals(a))
        {
            return null;
        } else
        {
            return (new StringBuilder("spotify:")).append(a.getEncodedPath().replace('/', ':')).toString();
        }
    }

    public final String e()
    {
        if (Uri.EMPTY.equals(a))
        {
            return null;
        } else
        {
            return (new StringBuilder("https://open.spotify.com/")).append(a.getEncodedPath()).toString();
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SpotifyLink)obj;
            if (!cty.a(a, ((SpotifyLink) (obj)).a) || !cty.a(b, ((SpotifyLink) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final boolean f()
    {
        return !TextUtils.isEmpty(b);
    }

    public final boolean g()
    {
        switch (_cls1.a[c.ordinal()])
        {
        default:
            return false;

        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
            return true;
        }
    }

    public final String h()
    {
        switch (_cls1.a[c.ordinal()])
        {
        default:
            return null;

        case 19: // '\023'
            return b(3);

        case 18: // '\022'
            return b(3);

        case 20: // '\024'
            return b(5);
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b
        });
    }

    public final String i()
    {
        switch (_cls1.a[c.ordinal()])
        {
        default:
            return d();

        case 19: // '\023'
            return a(2, 3);

        case 18: // '\022'
            return a(2, 3);

        case 20: // '\024'
            return a(4, 5);

        case 21: // '\025'
            return a(2, 2);
        }
    }

    public final String toString()
    {
        return a.toString();
    }

    static 
    {
        a("ad/*", LinkType.m);
        a("album/*", LinkType.c);
        a("album/*/play", LinkType.e);
        a("album/*/play/*", LinkType.e);
        a("app/browse", LinkType.o);
        a("app/browse/new_releases", LinkType.p);
        a("app/browse/*", LinkType.q);
        a("app/browse/*/*", LinkType.Z);
        a("app/browse/*/*/*", LinkType.Z);
        a("app/browse/*/*/*/*", LinkType.Z);
        a("app/browse/*/*/*/*/*", LinkType.Z);
        a("app/chart/*", LinkType.r);
        a("app/concerts", LinkType.R);
        a("app/magic", LinkType.aL);
        a("app/magic/*", LinkType.aL);
        a("artist/*", LinkType.g);
        a("artist/*/albums", LinkType.d);
        a("artist/*/appears_on", LinkType.f);
        a("artist/*/biography", LinkType.i);
        a("artist/*/compilations", LinkType.G);
        a("artist/*/concert", LinkType.j);
        a("artist/*/gallery", LinkType.k);
        a("artist/*/play", LinkType.h);
        a("artist/*/play/*", LinkType.h);
        a("artist/*/playlists", LinkType.l);
        a("artist/*/related", LinkType.aD);
        a("artist/*/singles", LinkType.aK);
        a("autologin", LinkType.n);
        a("chart/*", LinkType.r);
        a("charts/root", LinkType.t);
        a("charts/*", LinkType.s);
        a("collection", LinkType.u);
        a("episode/*", LinkType.P);
        a("episode/*/play", LinkType.Q);
        a("findfriends", LinkType.S);
        a("follow/artists", LinkType.V);
        a("follow/facebook", LinkType.W);
        a("genre/*", LinkType.X);
        a("genre/*/*", LinkType.X);
        a("genre/*/*/*", LinkType.X);
        a("genre/*/*/*/*", LinkType.X);
        a("genre/*/*/*/*/*", LinkType.X);
        a("hub/moments", LinkType.aa);
        a("hub/moments/*", LinkType.aa);
        a("hub/moments/*/*", LinkType.aa);
        a("hub/moments/*/*/*", LinkType.aa);
        a("hub/moments/*/*/*/*", LinkType.aa);
        a("hub/moments/*/*/*/*/*", LinkType.aa);
        a("hub/music", LinkType.ab);
        a("hub/music/*", LinkType.ab);
        a("hub/music/*/*", LinkType.ab);
        a("hub/music/*/*/*", LinkType.ab);
        a("hub/music/*/*/*/*", LinkType.ab);
        a("hub/music/*/*/*/*/*", LinkType.ab);
        a("hub/sandbox/*", LinkType.ac);
        a("hub/sandbox/*/*", LinkType.ac);
        a("hub/sandbox/*/*/*", LinkType.ac);
        a("hub/sandbox/*/*/*/*", LinkType.ac);
        a("hub/sandbox/*/*/*/*/*", LinkType.ac);
        a("hub/shows", LinkType.ad);
        a("hub/shows/*", LinkType.ad);
        a("hub/shows/*/*", LinkType.ad);
        a("hub/shows/*/*/*", LinkType.ad);
        a("hub/shows/*/*/*/*", LinkType.ad);
        a("hub/shows/*/*/*/*/*", LinkType.ad);
        a("internal/collection/albums", LinkType.w);
        a("internal/collection/artists", LinkType.y);
        a("internal/collection/offlined-episodes", LinkType.z);
        a("internal/collection/playlists", LinkType.A);
        a("internal/collection/radio", LinkType.B);
        a("internal/collection/saved-episodes", LinkType.C);
        a("internal/collection/shows", LinkType.D);
        a("internal/collection/tracks", LinkType.E);
        a("internal/collection/unplayed-episodes", LinkType.F);
        a("internal/concerts-location-search", LinkType.H);
        a("internal/cosmos_test", LinkType.K);
        a("internal/debug", LinkType.L);
        a("internal/debug/*", LinkType.L);
        a("internal/devices", LinkType.M);
        a("internal/discover", LinkType.N);
        a("internal/inbox", LinkType.ae);
        a("internal/licenses", LinkType.af);
        a("internal/notification_webview/*", LinkType.ay);
        a("internal/party", LinkType.al);
        a("internal/party/*", LinkType.am);
        a("internal/playlists", LinkType.ao);
        a("internal/preferences", LinkType.I);
        a("internal/preferences/push_notification", LinkType.J);
        a("internal/premium_signup", LinkType.ar);
        a("internal/radio", LinkType.az);
        a("internal/recent-shares", LinkType.aC);
        a("internal/running", LinkType.aE);
        a("internal/running/*/*", LinkType.aF);
        a("internal/running/*/*/tempo/*", LinkType.aF);
        a("internal/screensaver-ad-web-view", LinkType.aG);
        a("internal/social-chart", LinkType.aM);
        a("internal/social-chart/listeners", LinkType.aN);
        a("internal/social-feed", LinkType.a);
        a("internal/social-feed/reactors", LinkType.b);
        a("internal/startpage", LinkType.Y);
        a("internal/station_migration", LinkType.aR);
        a("internal/video_debug", LinkType.aV);
        a("local/*", LinkType.aT);
        a("local/*/*", LinkType.aT);
        a("local/*/*/*", LinkType.aT);
        a("local/*/*/*/*", LinkType.aT);
        a("local/*/*/*/*/*", LinkType.aT);
        a("navigation/categories-charts", LinkType.ag);
        a("navigation/genres-inspiration", LinkType.ah);
        a("navigation/moods-moments", LinkType.ai);
        a("navigation/play-music", LinkType.aj);
        a("notifications", LinkType.ak);
        a("party", LinkType.al);
        a("party/*", LinkType.am);
        a("premium-destination", LinkType.aq);
        a("radio/album/*", LinkType.aA);
        a("radio/artist/*", LinkType.aA);
        a("radio/genre/*", LinkType.aA);
        a("radio/playlist/*", LinkType.aA);
        a("radio/track/*", LinkType.aA);
        a("radio/user/*/*/*", LinkType.aA);
        a("recently_played", LinkType.aB);
        a("running", LinkType.aE);
        a("running/*/*", LinkType.aE);
        a("running/*/*/tempo/*", LinkType.aE);
        a("search", LinkType.aH);
        a("search/*", LinkType.aH);
        a("search/*/*", LinkType.aH);
        a("share/post", LinkType.aI);
        a("show/*", LinkType.aJ);
        a("start_trial_upsell", LinkType.aP);
        a("station/*/*", LinkType.aQ);
        a("station/*/*/*", LinkType.aQ);
        a("station/*/*/*/*", LinkType.aQ);
        a("track/*", LinkType.aT);
        a("upsell/premium", LinkType.aU);
        a("user/*", LinkType.as);
        a("user/*/artists", LinkType.at);
        a("user/*/collection", LinkType.u);
        a("user/*/collection/album/*", LinkType.v);
        a("user/*/collection/artist/*", LinkType.x);
        a("user/*/folder/*", LinkType.T);
        a("user/*/folder/*/tracks", LinkType.U);
        a("user/*/followers", LinkType.au);
        a("user/*/following", LinkType.av);
        a("user/*/inbox", LinkType.ae);
        a("user/*/invitationcodes", LinkType.aw);
        a("user/*/playlist/*", LinkType.an);
        a("user/*/playlist/*/play", LinkType.ap);
        a("user/*/playlist/*/play/*", LinkType.ap);
        a("user/*/playlists", LinkType.ax);
        a("user/*/publishedstarred", LinkType.aO);
        a("user/*/rootlist", LinkType.ao);
        a("user/*/starred", LinkType.aO);
        a("user/*/top/tracks", LinkType.aS);
        a("user/*/toplist", LinkType.aS);
    }

    private class LinkType extends Enum
    {

        public static final LinkType A;
        public static final LinkType B;
        public static final LinkType C;
        public static final LinkType D;
        public static final LinkType E;
        public static final LinkType F;
        public static final LinkType G;
        public static final LinkType H;
        public static final LinkType I;
        public static final LinkType J;
        public static final LinkType K;
        public static final LinkType L;
        public static final LinkType M;
        public static final LinkType N;
        public static final LinkType O;
        public static final LinkType P;
        public static final LinkType Q;
        public static final LinkType R;
        public static final LinkType S;
        public static final LinkType T;
        public static final LinkType U;
        public static final LinkType V;
        public static final LinkType W;
        public static final LinkType X;
        public static final LinkType Y;
        public static final LinkType Z;
        public static final LinkType a;
        public static final LinkType aA;
        public static final LinkType aB;
        public static final LinkType aC;
        public static final LinkType aD;
        public static final LinkType aE;
        public static final LinkType aF;
        public static final LinkType aG;
        public static final LinkType aH;
        public static final LinkType aI;
        public static final LinkType aJ;
        public static final LinkType aK;
        public static final LinkType aL;
        public static final LinkType aM;
        public static final LinkType aN;
        public static final LinkType aO;
        public static final LinkType aP;
        public static final LinkType aQ;
        public static final LinkType aR;
        public static final LinkType aS;
        public static final LinkType aT;
        public static final LinkType aU;
        public static final LinkType aV;
        private static final LinkType aW[] = values();
        private static final LinkType aX[];
        public static final LinkType aa;
        public static final LinkType ab;
        public static final LinkType ac;
        public static final LinkType ad;
        public static final LinkType ae;
        public static final LinkType af;
        public static final LinkType ag;
        public static final LinkType ah;
        public static final LinkType ai;
        public static final LinkType aj;
        public static final LinkType ak;
        public static final LinkType al;
        public static final LinkType am;
        public static final LinkType an;
        public static final LinkType ao;
        public static final LinkType ap;
        public static final LinkType aq;
        public static final LinkType ar;
        public static final LinkType as;
        public static final LinkType at;
        public static final LinkType au;
        public static final LinkType av;
        public static final LinkType aw;
        public static final LinkType ax;
        public static final LinkType ay;
        public static final LinkType az;
        public static final LinkType b;
        public static final LinkType c;
        public static final LinkType d;
        public static final LinkType e;
        public static final LinkType f;
        public static final LinkType g;
        public static final LinkType h;
        public static final LinkType i;
        public static final LinkType j;
        public static final LinkType k;
        public static final LinkType l;
        public static final LinkType m;
        public static final LinkType n;
        public static final LinkType o;
        public static final LinkType p;
        public static final LinkType q;
        public static final LinkType r;
        public static final LinkType s;
        public static final LinkType t;
        public static final LinkType u;
        public static final LinkType v;
        public static final LinkType w;
        public static final LinkType x;
        public static final LinkType y;
        public static final LinkType z;

        public static LinkType a(int i1)
        {
            return aW[i1];
        }

        public static LinkType valueOf(String s1)
        {
            return (LinkType)Enum.valueOf(com/spotify/mobile/android/util/SpotifyLink$LinkType, s1);
        }

        public static LinkType[] values()
        {
            return (LinkType[])aX.clone();
        }

        static 
        {
            a = new LinkType("ACTIVITY_FEED", 0);
            b = new LinkType("ACTIVITY_FEED_REACTORS", 1);
            c = new LinkType("ALBUM", 2);
            d = new LinkType("ALBUMS", 3);
            e = new LinkType("ALBUM_AUTOPLAY", 4);
            f = new LinkType("APPEARS_ON", 5);
            g = new LinkType("ARTIST", 6);
            h = new LinkType("ARTIST_AUTOPLAY", 7);
            i = new LinkType("ARTIST_BIO", 8);
            j = new LinkType("ARTIST_CONCERT", 9);
            k = new LinkType("ARTIST_GALLERY", 10);
            l = new LinkType("ARTIST_PLAYLISTS", 11);
            m = new LinkType("AUDIO_AD", 12);
            n = new LinkType("AUTOLOGIN", 13);
            o = new LinkType("BROWSE", 14);
            p = new LinkType("BROWSE_NEW_RELEASES", 15);
            q = new LinkType("BROWSE_PLAYLISTS", 16);
            r = new LinkType("CHART", 17);
            s = new LinkType("CHARTS_BLOCK", 18);
            t = new LinkType("CHARTS_OVERVIEW", 19);
            u = new LinkType("COLLECTION", 20);
            v = new LinkType("COLLECTION_ALBUM", 21);
            w = new LinkType("COLLECTION_ALBUMS", 22);
            x = new LinkType("COLLECTION_ARTIST", 23);
            y = new LinkType("COLLECTION_ARTISTS", 24);
            z = new LinkType("COLLECTION_OFFLINED_EPISODES", 25);
            A = new LinkType("COLLECTION_PLAYLISTS", 26);
            B = new LinkType("COLLECTION_RADIO", 27);
            C = new LinkType("COLLECTION_SAVED_EPISODES", 28);
            D = new LinkType("COLLECTION_SHOWS", 29);
            E = new LinkType("COLLECTION_TRACKS", 30);
            F = new LinkType("COLLECTION_UNPLAYED_EPISODES", 31);
            G = new LinkType("COMPILATIONS", 32);
            H = new LinkType("CONCERTS_LOCATION_SEARCH", 33);
            I = new LinkType("CONFIG", 34);
            J = new LinkType("CONFIG_PUSH_NOTIFICATION", 35);
            K = new LinkType("COSMOS_TEST", 36);
            L = new LinkType("DEBUG", 37);
            M = new LinkType("DEVICES", 38);
            N = new LinkType("DISCOVER", 39);
            O = new LinkType("DUMMY", 40);
            P = new LinkType("EPISODE", 41);
            Q = new LinkType("EPISODE_AUTOPLAY", 42);
            R = new LinkType("EVENTS", 43);
            S = new LinkType("FINDFRIENDS", 44);
            T = new LinkType("FOLDER", 45);
            U = new LinkType("FOLDER_TRACKS", 46);
            V = new LinkType("FOLLOW_ARTISTS", 47);
            W = new LinkType("FOLLOW_FACEBOOK", 48);
            X = new LinkType("GENRE", 49);
            Y = new LinkType("HOME", 50);
            Z = new LinkType("HUB_BROWSE", 51);
            aa = new LinkType("HUB_MOMENTS", 52);
            ab = new LinkType("HUB_MUSIC", 53);
            ac = new LinkType("HUB_SANDBOX", 54);
            ad = new LinkType("HUB_SHOWS", 55);
            ae = new LinkType("INBOX", 56);
            af = new LinkType("LICENSES", 57);
            ag = new LinkType("NAVIGATION_CATEGORIES_CHARTS", 58);
            ah = new LinkType("NAVIGATION_GENRES_INSPIRATION", 59);
            ai = new LinkType("NAVIGATION_MOODS_MOMENTS", 60);
            aj = new LinkType("NAVIGATION_PLAY_MUSIC", 61);
            ak = new LinkType("NOTIFICATIONS", 62);
            al = new LinkType("PARTY", 63);
            am = new LinkType("PARTY_PRESET", 64);
            an = new LinkType("PLAYLIST", 65);
            ao = new LinkType("PLAYLISTS", 66);
            ap = new LinkType("PLAYLIST_AUTOPLAY", 67);
            aq = new LinkType("PREMIUM_IN_APP_DESTINATION", 68);
            ar = new LinkType("PREMIUM_SIGNUP", 69);
            as = new LinkType("PROFILE", 70);
            at = new LinkType("PROFILE_ARTISTS", 71);
            au = new LinkType("PROFILE_FOLLOWERS", 72);
            av = new LinkType("PROFILE_FOLLOWING", 73);
            aw = new LinkType("PROFILE_INVITATION_CODES", 74);
            ax = new LinkType("PROFILE_PLAYLISTS", 75);
            ay = new LinkType("PUSH_NOTIFICATION_WEBVIEW", 76);
            az = new LinkType("RADIO", 77);
            aA = new LinkType("RADIO_START", 78);
            aB = new LinkType("RECENTLY_PLAYED", 79);
            aC = new LinkType("RECENT_SHARES", 80);
            aD = new LinkType("RELATED_ARTISTS", 81);
            aE = new LinkType("RUNNING", 82);
            aF = new LinkType("RUNNING_TEMPO", 83);
            aG = new LinkType("SCREENSAVER_AD_WEB_VIEW", 84);
            aH = new LinkType("SEARCH", 85);
            aI = new LinkType("SHARE_POST", 86);
            aJ = new LinkType("SHOW", 87);
            aK = new LinkType("SINGLES", 88);
            aL = new LinkType("SITUATIONAL_AWARE", 89);
            aM = new LinkType("SOCIAL_CHART", 90);
            aN = new LinkType("SOCIAL_CHART_LISTENERS", 91);
            aO = new LinkType("STARRED", 92);
            aP = new LinkType("START_TRIAL_UPSELL", 93);
            aQ = new LinkType("STATION", 94);
            aR = new LinkType("STATION_MIGRATION", 95);
            aS = new LinkType("TOPLIST", 96);
            aT = new LinkType("TRACK", 97);
            aU = new LinkType("UPSELL_PREMIUM", 98);
            aV = new LinkType("VIDEO_DEBUG", 99);
            aX = (new LinkType[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B, C, D, 
                E, F, G, H, I, J, K, L, M, N, 
                O, P, Q, R, S, T, U, V, W, X, 
                Y, Z, aa, ab, ac, ad, ae, af, ag, ah, 
                ai, aj, ak, al, am, an, ao, ap, aq, ar, 
                as, at, au, av, aw, ax, ay, az, aA, aB, 
                aC, aD, aE, aF, aG, aH, aI, aJ, aK, aL, 
                aM, aN, aO, aP, aQ, aR, aS, aT, aU, aV
            });
        }

        private LinkType(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
