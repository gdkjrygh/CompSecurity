// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;

import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Patterns;
import com.pandora.android.data.d;
import com.pandora.android.data.n;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.f;
import com.pandora.radio.data.y;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p.cw.c;
import p.cx.x;
import p.df.a;

public class p.cp.b
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(p/cp/b$a, s1);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("AT", 0);
            b = new a("PAT", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static class b
    {

        private android.net.Uri.Builder a;

        private static String d()
        {
            switch (com.pandora.android.provider.b.a.h().getResources().getConfiguration().orientation)
            {
            default:
                return "landscape";

            case 1: // '\001'
                return "portrait";
            }
        }

        public b a()
        {
            a.appendQueryParameter("orientation", d());
            return this;
        }

        public b a(float f1)
        {
            a.appendQueryParameter("remaining_hours", String.format(Locale.US, "%.2f", new Object[] {
                Float.valueOf(f1)
            }));
            return this;
        }

        public b a(String s1)
        {
            if (!s.a(s1))
            {
                a.appendEncodedPath(s1);
            }
            return this;
        }

        public b a(a a1)
        {
            a.appendQueryParameter(a1.toString().toLowerCase(Locale.US), com.pandora.android.provider.b.a.d().b());
            return this;
        }

        public b a(boolean flag)
        {
            if (flag)
            {
                a.appendQueryParameter("testFeaturedTrack", "true");
            }
            return this;
        }

        public b b()
        {
            p.cp.b.a(a);
            return this;
        }

        public b b(String s1)
        {
            if (!s.a(s1))
            {
                a.appendEncodedPath((new StringBuilder()).append(s1).append(".vm").toString());
            }
            return this;
        }

        public b b(boolean flag)
        {
            if (flag)
            {
                a.appendQueryParameter("shareImp", "true");
            }
            return this;
        }

        public Uri c()
        {
            if (!s.m()) goto _L2; else goto _L1
_L1:
            a.appendQueryParameter("isAmazonBuild", "1");
            if (com.pandora.android.iap.d.d.a().e().d())
            {
                a.appendQueryParameter("isAmazonSubscriber", "1");
            }
_L4:
            if (s.u())
            {
                a.appendQueryParameter("is_tablet", "true");
            }
            a.appendQueryParameter("sp", "1");
            return a.build();
_L2:
            com.pandora.android.iap.c c1 = com.pandora.android.iap.d.d.a().d();
            if (c1.e())
            {
                a.appendQueryParameter("isGooglePlay", "1");
            }
            if (c1.g())
            {
                a.appendQueryParameter("isAndroidSubscriber", "1");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public b c(String s1)
        {
            if (!s.a(s1))
            {
                a.appendQueryParameter("webname", s1);
                return this;
            } else
            {
                a.appendQueryParameter("webname", "");
                return this;
            }
        }

        public b d(String s1)
        {
            if (!s.a(s1))
            {
                a.appendQueryParameter("stationId", s1);
            }
            return this;
        }

        public b e(String s1)
        {
            if (!s.a(s1))
            {
                a.appendQueryParameter("station", s1);
                return this;
            } else
            {
                a.appendQueryParameter("station", "");
                return this;
            }
        }

        public b f(String s1)
        {
            if (!s.a(s1))
            {
                a.appendQueryParameter("song", s1);
                return this;
            } else
            {
                a.appendQueryParameter("song", "");
                return this;
            }
        }

        public b g(String s1)
        {
            if (!s.a(s1))
            {
                a.appendQueryParameter("checksum", s1);
            }
            return this;
        }

        public b h(String s1)
        {
            if (!s.a(s1))
            {
                a.appendQueryParameter("token", s1);
            }
            return this;
        }

        public b i(String s1)
        {
            if (!s.a(s1))
            {
                a.appendQueryParameter("site", s1);
            }
            return this;
        }

        public b j(String s1)
        {
            if (!s.a(s1))
            {
                a.appendQueryParameter("seed", s1);
            }
            return this;
        }

        public b k(String s1)
        {
            if (!s.a(s1))
            {
                a.appendQueryParameter("referrer", s1);
            }
            return this;
        }

        public b l(String s1)
        {
            a.appendQueryParameter("purchaseSku", s1);
            return this;
        }

        public b m(String s1)
        {
            a.appendQueryParameter("alcSku", s1);
            return this;
        }

        public b n(String s1)
        {
            a.appendQueryParameter("thumbdown", s1);
            return this;
        }

        public b o(String s1)
        {
            a.appendQueryParameter("at_daily_limit", s1);
            return this;
        }

        public b(String s1, String s2)
        {
            if (s.a(s1))
            {
                throw new IllegalArgumentException("authority cannot be empty");
            }
            if (s.a(s2))
            {
                throw new IllegalArgumentException("basePath cannot be empty");
            } else
            {
                a = Uri.parse(s1).buildUpon().appendEncodedPath(s2);
                return;
            }
        }
    }

    public static class c
    {

        private Intent a;
        private AsyncTask b;

        public boolean a()
        {
            return a != null;
        }

        public boolean b()
        {
            return b != null;
        }

        public Intent c()
        {
            return a;
        }

        public AsyncTask d()
        {
            return b;
        }

        public c(Intent intent)
        {
            if (intent == null)
            {
                throw new InvalidParameterException("UriMatchAction: intent must not be null");
            } else
            {
                a = intent;
                return;
            }
        }

        public c(AsyncTask asynctask)
        {
            if (asynctask == null)
            {
                throw new InvalidParameterException("UriMatchAction: asyncTask must not be null");
            } else
            {
                b = asynctask;
                return;
            }
        }
    }


    protected static android.net.Uri.Builder a(android.net.Uri.Builder builder)
    {
        Hashtable hashtable = new Hashtable(com.pandora.android.provider.b.a.b().l().g());
        String s1;
        String s3;
        for (Iterator iterator = hashtable.keySet().iterator(); iterator.hasNext(); builder.appendQueryParameter(s3, s1))
        {
            s3 = iterator.next().toString();
            String s2 = hashtable.get(s3).toString();
            if (!"model".equalsIgnoreCase(s3))
            {
                s1 = s2;
                if (!"systemVersion".equalsIgnoreCase(s3))
                {
                    continue;
                }
            }
            s1 = Uri.decode(s2);
        }

        return builder;
    }

    public static String a()
    {
        return (new b(d.g, "mobile/capping/capped")).a(p.cp.a.a).b().c().toString();
    }

    public static String a(float f1)
    {
        return (new b(d.g, "mobile/capping/warn")).a(p.cp.a.a).a(f1).b().c().toString();
    }

    public static String a(aa aa1)
    {
        try
        {
            aa1 = (new URL(aa1.Q())).getPath().substring(1);
        }
        // Misplaced declaration of an exception variable
        catch (aa aa1)
        {
            p.df.a.a("PandoraUrlsUtil", (new StringBuilder()).append("Error constructing SEO path from trackData. Error:").append(aa1.getMessage()).toString());
            return "";
        }
        return aa1;
    }

    public static String a(y y1)
    {
        return (new b(d.g, "stations/play")).a(y1.c()).b(true).c().toString();
    }

    public static String a(y y1, aa aa1, boolean flag, boolean flag1)
    {
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        if (!y1.t())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        aa1 = (new b(d.g, "stations/play")).a(y1.c()).a(aa1.w()).b(flag1);
        if (flag)
        {
            y1 = "facebook";
        } else
        {
            y1 = null;
        }
        y1 = aa1.i(y1).j("song").k(com.pandora.android.provider.b.a.d().d()).c().toString();
_L1:
        p.df.a.a("PandoraUrlsUtil", (new StringBuilder()).append("PandoraUrlsUtil.getBackstageTrackDetailsUrl --> ").append(y1).toString());
        return y1;
        y1 = (new b(d.g, a(aa1))).b(flag1).c().toString();
          goto _L1
        aa1;
        y1 = "";
_L3:
        p.df.a.c("PandoraUrlsUtil", "Could not build Backstage Track Details URL", aa1);
        return y1;
        aa1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static String a(String s1)
    {
        af af1 = com.pandora.android.provider.b.a.d();
        Object obj;
        String s2;
        if (af1 != null)
        {
            s2 = s.b(af1.b());
        } else
        {
            s2 = "";
        }
        obj = s1;
        if (!s1.contains("pat="))
        {
            obj = (new StringBuilder()).append(s1);
            if (s1.contains("?"))
            {
                s1 = "&pat=";
            } else
            {
                s1 = "?pat=";
            }
            obj = ((StringBuilder) (obj)).append(s1).append(s2).toString();
        }
        s1 = ((String) (obj));
        if (s.u())
        {
            s1 = ((String) (obj));
            if (!((String) (obj)).contains("is_tablet="))
            {
                s1 = (new StringBuilder()).append(((String) (obj))).append("&is_tablet=true").toString();
            }
        }
        if (af1 != null)
        {
            obj = s.b(af1.j());
        } else
        {
            obj = "";
        }
        return s1.replaceAll("WEBNAME_URI_PLACEHOLDER", ((String) (obj)));
    }

    public static String a(String s1, p p1)
    {
        return (new b(d.g, "content/mobile")).b(p1.name().toLowerCase()).a(a.b).h(s1).b().c().toString();
    }

    public static String a(String s1, aa aa1, String s2, boolean flag)
    {
        String s3 = s2;
        if (s.a(s2))
        {
            s3 = aa1.r();
        }
        try
        {
            s2 = (new b(n.d, "short/song")).c(s1).e(s3);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.c("PandoraUrlsUtil", "PandoraUrlsUtil.getShortUrlForTrack --> Could not shorten url for track", s1);
            return null;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        s1 = (new StringBuilder()).append(s3).append("/").append(aa1.w()).toString();
_L4:
        s1 = s2.f(s1).c().toString();
        p.df.a.a("PandoraUrlsUtil", (new StringBuilder()).append("PandoraUrlsUtil.getShortUrlForTrack --> ").append(s1).toString());
        return com.pandora.android.provider.b.a.b().e().q(s1);
_L2:
        s1 = a(aa1);
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_39;
    }

    public static String a(String s1, String s2)
    {
        return (new b(d.g, "content/mobile")).b(s1).a(a.b).c(s2).b().c().toString();
    }

    public static String a(String s1, String s2, String s3, boolean flag)
    {
        if (s.a(s1))
        {
            return null;
        } else
        {
            return (new b(d.g, "content/mobile")).b("nowplaying_track_detail").a(a.b).d(s2).g(s3).h(s1).a(flag).a().b().c().toString();
        }
    }

    public static String a(boolean flag)
    {
        String s1;
        String s2;
        if (flag)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        if (com.pandora.android.provider.b.a.b().d().Y())
        {
            s2 = "1";
        } else
        {
            s2 = "0";
        }
        return (new b(d.g, "content/mobile")).b("modal_skip_limit_reached").a(a.b).n(s1).o(s2).b().c().toString();
    }

    static HashMap a(URL url)
    {
        HashMap hashmap = new HashMap();
        url = url.getQuery();
        if (!s.a(url))
        {
            url = url.split("&");
            int j1 = url.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                String as[] = url[i1].split("=");
                if (as.length == 2)
                {
                    hashmap.put(s.c(as[0]), s.c(as[1]));
                }
            }

        }
        return hashmap;
    }

    public static String b()
    {
        return (new b(d.g, "content/mobile")).b("modal_why_ads").a(a.b).b().c().toString();
    }

    public static String b(String s1)
    {
        return (new b(d.g, "content/mobile")).b("station_detail").a(a.b).d(s1).b().c().toString();
    }

    public static String b(String s1, String s2)
    {
        try
        {
            s1 = (new b(n.d, "short/station")).c(s1).e(s2).f("").c().toString();
            p.df.a.a("PandoraUrlsUtil", (new StringBuilder()).append("PandoraUrlsUtil.getShortUrlForStation --> ").append(s1).toString());
            s1 = com.pandora.android.provider.b.a.b().e().q(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.c("PandoraUrlsUtil", "PandoraUrlsUtil.getShortUrlForStation --> Could not shorten url for station", s1);
            return null;
        }
        return s1;
    }

    public static String c()
    {
        return (new b(d.g, "content/mobile")).b("modal_subscription_expired").a(a.b).b().c().toString();
    }

    public static String c(String s1)
    {
        return (new b(d.g, "content/mobile")).b("station_edit").a(a.b).d(s1).b().c().toString();
    }

    public static int d(String s1)
    {
        int i1;
        try
        {
            i1 = Uri.parse(s1).getPathSegments().size();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            p.df.a.a("PandoraUrlsUtil", (new StringBuilder()).append("Error constructing SEO path from trackData. Error:").append(s1.getMessage()).toString());
            return 0;
        }
        return i1;
    }

    public static String d()
    {
        return (new b(d.g, "mobile/share-facebook-confirm")).a(p.cp.a.a).b().c().toString();
    }

    public static String e()
    {
        b b1 = (new b(d.g, "content/mobile/p1")).a(p.cp.a.a);
        Object obj;
        Object obj1;
        if (s.m())
        {
            obj = com.pandora.android.iap.d.d.a().e().b();
        } else
        {
            obj = com.pandora.android.iap.d.d.a().d().c();
        }
        obj = b1.l(((String) (obj))).b();
        obj1 = com.pandora.android.iap.d.d.a().h();
        if (!s.u() && obj1 != null && !((List) (obj1)).isEmpty())
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); stringbuilder.append(((p.dc.c)((Iterator) (obj1)).next()).n())) { }
            if (stringbuilder.length() > 0)
            {
                ((b) (obj)).m(stringbuilder.toString());
            }
        }
        return ((b) (obj)).c().toString();
    }

    public static String e(String s1)
    {
        return a("profile", s1);
    }

    public static String f()
    {
        return null;
    }

    public static String f(String s1)
    {
        return a("newsfeed", s1);
    }

    public static String g()
    {
        return s.b(com.pandora.android.provider.b.a.h(), 0x7f070005);
    }

    public static String g(String s1)
    {
        return a(Uri.parse(s1).buildUpon()).toString();
    }

    public static String h()
    {
        return (new b(d.g, "mobile/modal-audio-messages-survey")).a(a.b).b().c().toString();
    }

    public static boolean h(String s1)
    {
        return s1 != null && Patterns.WEB_URL.matcher(s1).matches();
    }

    public static String i()
    {
        return a("profile_edit", ((String) (null)));
    }

    public static String j()
    {
        return a("profile_bookmarks", ((String) (null)));
    }

    public static String k()
    {
        return a("profile_likes", ((String) (null)));
    }

    public static String l()
    {
        return a("profile_following", ((String) (null)));
    }

    public static String m()
    {
        return a("profile_followers", ((String) (null)));
    }
}
