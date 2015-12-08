// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import com.pandora.android.provider.b;
import com.pandora.radio.data.f;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

public class c
{
    static final class a extends Enum
    {

        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a W;
        public static final a X;
        public static final a Y;
        public static final a Z;
        public static final a a;
        public static final a aa;
        public static final a ab;
        public static final a ac;
        public static final a ad;
        public static final a ae;
        public static final a af;
        public static final a ag;
        private static final a ah[];
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(p/cp/c$a, s1);
        }

        public static a[] values()
        {
            return (a[])ah.clone();
        }

        static 
        {
            a = new a("check", 0);
            b = new a("echo", 1);
            c = new a("telephone", 2);
            d = new a("playMovie", 3);
            e = new a("preloadMovie", 4);
            f = new a("sendEmail", 5);
            g = new a("fetchURL", 6);
            h = new a("fetchWithAuth", 7);
            i = new a("eval", 8);
            j = new a("createStationFromStationId", 9);
            k = new a("createStationFromMusicId", 10);
            l = new a("openSafari", 11);
            m = new a("recordAdClick", 12);
            n = new a("offerTrial", 13);
            o = new a("canOpenURL", 14);
            p = new a("setViewportHeight", 15);
            q = new a("setNowPlayingFullSize", 16);
            r = new a("hideViewport", 17);
            s = new a("setStationCreationFollowOnURL", 18);
            t = new a("disableVideoAdsUntilNextStationChange", 19);
            u = new a("openLandingPage", 20);
            v = new a("closeLandingPage", 21);
            w = new a("offerUpgrade", 22);
            x = new a("getP1SubscriberState", 23);
            y = new a("getPersonalInfo", 24);
            z = new a("alert", 25);
            A = new a("share", 26);
            B = new a("openGenrePickerForGCat", 27);
            C = new a("openGenrePicker", 28);
            D = new a("launchGenrePanel", 29);
            E = new a("addCalendarItem", 30);
            F = new a("authorizeFacebook", 31);
            G = new a("closeCustomWebViewContainer", 32);
            H = new a("pause", 33);
            I = new a("play", 34);
            J = new a("pauseTrack", 35);
            K = new a("playTrack", 36);
            L = new a("closeAd", 37);
            M = new a("goToScreen", 38);
            N = new a("playSample", 39);
            O = new a("playSampleTrack", 40);
            P = new a("stopSample", 41);
            Q = new a("getNowPlayingTrackDetails", 42);
            R = new a("setCloseButtonVisibility", 43);
            S = new a("sendEvent", 44);
            T = new a("createStation", 45);
            U = new a("startValueExchange", 46);
            V = new a("delayAdRefresh", 47);
            W = new a("pingImpressionUrls", 48);
            X = new a("openExternalPage", 49);
            Y = new a("openPage", 50);
            Z = new a("openModalPage", 51);
            aa = new a("closeModalPage", 52);
            ab = new a("refreshAd", 53);
            ac = new a("showTextInput", 54);
            ad = new a("refreshStationList", 55);
            ae = new a("launchAddSeed", 56);
            af = new a("playlistUpdated", 57);
            ag = new a("buyAmazon", 58);
            ah = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z, A, B, C, D, 
                E, F, G, H, I, J, K, L, M, N, 
                O, P, Q, R, S, T, U, V, W, X, 
                Y, Z, aa, ab, ac, ad, ae, af, ag
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    static EnumSet a;
    static EnumSet b = EnumSet.allOf(p/cp/c$a);
    private static String c = "Pandora";
    private static String d = "PandoraApp";
    private static String e = "Stage";
    private String f;
    private a g;
    private String h;
    private HashMap i;
    private String j;

    public c(String s, String s1, HashMap hashmap, String s2)
    {
        f = s1;
        j = s;
        g = a(s, s1);
        i = hashmap;
        h = s2;
    }

    private a a(String s, String s1)
    {
        for (a a1 = a.valueOf(s1); "pandoraappinternal".equals(s) && a.contains(a1) || "pandora".equals(s) && a.contains(a1) || "pandorastage".equals(s) && b.contains(a1);)
        {
            return a1;
        }

        throw new IllegalArgumentException(String.format("%s is not a web command type for protocol %s", new Object[] {
            s1, s
        }));
    }

    public static String e()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("[");
        Iterator iterator = b.iterator();
        int k = 0;
        while (iterator.hasNext()) 
        {
            a a1 = (a)iterator.next();
            if (a.ag == a1 && b.a.b().l().l())
            {
                k++;
            } else
            if (a.N == a1)
            {
                k++;
            } else
            {
                if (k != 0)
                {
                    stringbuffer.append(",");
                }
                k++;
                stringbuffer.append("'");
                stringbuffer.append(a1);
                stringbuffer.append("'");
            }
        }
        stringbuffer.append("]");
        return stringbuffer.toString();
    }

    public String a()
    {
        return h;
    }

    public HashMap b()
    {
        return i;
    }

    public a c()
    {
        return g;
    }

    public String d()
    {
        if ("pandora".equals(j))
        {
            return c;
        }
        if ("pandorastage".equals(j))
        {
            return e;
        } else
        {
            return d;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("WebPageCommand {name='").append(f).append('\'').append(", callbackID='").append(h).append('\'').append(", webCommandType='").append(g.toString()).append('\'').append(", parameters='").append(i.toString()).append('\'').append('}').toString();
    }

    static 
    {
        a = EnumSet.range(a.a, a.X);
    }
}
