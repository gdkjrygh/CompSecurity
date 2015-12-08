// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.pandora.radio.data.ArtistSearchData;
import com.pandora.radio.data.GenreStationSearchData;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.PromotedStation;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.SongSearchData;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ab;
import com.pandora.radio.data.ae;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.data.aj;
import com.pandora.radio.data.ak;
import com.pandora.radio.data.j;
import com.pandora.radio.data.l;
import com.pandora.radio.data.q;
import com.pandora.radio.data.r;
import com.pandora.radio.data.v;
import com.pandora.radio.data.w;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.f;
import com.pandora.radio.provider.i;
import com.pandora.radio.util.k;
import com.pandora.radio.util.o;
import com.pandora.radio.util.p;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.Vector;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.b;
import p.cw.c;
import p.dc.e;
import p.dd.an;
import p.dd.ar;
import p.dd.as;
import p.dd.az;
import p.dd.ba;
import p.dd.bi;
import p.dd.bj;
import p.dd.bk;
import p.dd.bl;
import p.dd.bm;
import p.dd.bo;
import p.dd.bp;
import p.dd.bq;
import p.dd.br;
import p.dd.bs;
import p.dd.bt;
import p.dd.t;
import p.df.a;
import p.dg.d;

// Referenced classes of package p.cx:
//            n, q, y, u, 
//            r, p, f, b, 
//            ad, s, aa, l, 
//            j

public class x
{
    public static final class a extends Enum
    {

        public static final a a;
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
        private static final a n[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(p/cx/x$a, s1);
        }

        public static a[] values()
        {
            return (a[])n.clone();
        }

        static 
        {
            a = new a("Clicked", 0);
            b = new a("Dismissed", 1);
            c = new a("Ignored", 2);
            d = new a("ErrorParseIntent", 3);
            e = new a("ErrorBuildContent", 4);
            f = new a("ErrorBuildFeedbackIntent", 5);
            g = new a("ErrorSetIcon", 6);
            h = new a("ErrorNotify", 7);
            i = new a("ErrorLoadBitmap", 8);
            j = new a("Received", 9);
            k = new a("Viewed", 10);
            l = new a("ErrorBitmapNoNetwork", 11);
            m = new a("ErrorInboxPayload", 12);
            n = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(p/cx/x$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("Notification", 0);
            b = new b("Inbox", 1);
            c = new b("Feed", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class c
    {

        public aa a[];
        public String b;

        public c(aa aaa[], String s1)
        {
            a = aaa;
            b = s1;
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        private static final d f[];
        private final int e;

        public static d valueOf(String s1)
        {
            return (d)Enum.valueOf(p/cx/x$d, s1);
        }

        public static d[] values()
        {
            return (d[])f.clone();
        }

        public int a()
        {
            return e;
        }

        static 
        {
            a = new d("Unknown", 0, 0);
            b = new d("Unseen", 1, 1);
            c = new d("Seen", 2, 2);
            d = new d("Deleted", 3, 3);
            f = (new d[] {
                a, b, c, d
            });
        }

        private d(String s1, int i1, int j1)
        {
            super(s1, i1);
            e = j1;
        }
    }

    public static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        public static final e d;
        public static final e e;
        public static final e f;
        public static final e g;
        public static final e h;
        public static final e i;
        private static final e j[];

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(p/cx/x$e, s1);
        }

        public static e[] values()
        {
            return (e[])j.clone();
        }

        static 
        {
            a = new e("track_action", 0);
            b = new e("rec", 1);
            c = new e("search", 2);
            d = new e("auto_complete", 3);
            e = new e("genre", 4);
            f = new e("promo", 5);
            g = new e("smart_url", 6);
            h = new e("js_api", 7);
            i = new e("google_search_action", 8);
            j = (new e[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private e(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static class f
    {

        public boolean a;
        public boolean b;

        public f()
        {
        }
    }

    public static final class g extends Enum
    {

        public static final g a;
        public static final g b;
        private static final g c[];

        public static g valueOf(String s1)
        {
            return (g)Enum.valueOf(p/cx/x$g, s1);
        }

        public static g[] values()
        {
            return (g[])c.clone();
        }

        static 
        {
            a = new g("COMPLETED", 0);
            b = new g("INCOMPLETE", 1);
            c = (new g[] {
                a, b
            });
        }

        private g(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static final String a[] = {
        "highQuality", "mediumQuality", "lowQuality"
    };
    private static final String b[] = {
        "audioUrl", "bitrate", "encoding", "audioToken"
    };
    private final Object c = new Object();
    private boolean d;
    private boolean e;
    private boolean f;
    private af g;
    private q h;
    private final p.cw.c i;
    private final p.cw.b j;
    private final com.pandora.radio.data.o k;
    private final ag l;
    private final com.pandora.radio.data.f m;
    private final p.cx.f n;
    private final u o;
    private final boolean p;
    private com.pandora.radio.util.a.a q;
    private az r;
    private ArrayList s;
    private com.pandora.radio.util.a t;
    private p.cx.j u;
    private p.dh.a v;
    private p.cx.aa w;
    private r x;

    public x(p.cw.c c1, p.cx.f f1, u u1, p.dh.a a1, boolean flag, p.cx.l l1, p.cx.aa aa1, 
            r r1, com.pandora.radio.util.a a2, p.cx.j j1, boolean flag1)
    {
        f = false;
        s = null;
        i = c1;
        n = f1;
        o = u1;
        s = new ArrayList();
        a(l1);
        t = a2;
        u = j1;
        j = c1.d();
        k = c1.j();
        l = c1.k();
        m = c1.l();
        p = flag;
        v = a1;
        p();
        w = aa1;
        x = r1;
        e = flag1;
        c1.b(this);
    }

    private static MusicSearchData a(JSONObject jsonobject, SearchDescriptor searchdescriptor)
        throws JSONException
    {
        Object obj;
        SongSearchData asongsearchdata[];
        GenreStationSearchData agenrestationsearchdata[];
        Object obj1;
        GenreStationSearchData agenrestationsearchdata2[];
        SongSearchData asongsearchdata2[];
        ArtistSearchData aartistsearchdata1[];
        com.pandora.radio.data.t.a a3;
        Object obj2;
        JSONObject jsonobject1;
        JSONArray jsonarray = jsonobject.optJSONArray("artists");
        obj = new ArtistSearchData[0];
        if (jsonarray != null)
        {
            obj = new ArtistSearchData[jsonarray.length()];
            for (int i1 = 0; i1 < obj.length; i1++)
            {
                obj[i1] = l(jsonarray.getJSONObject(i1));
            }

        }
        JSONArray jsonarray1 = jsonobject.optJSONArray("songs");
        asongsearchdata = new SongSearchData[0];
        if (jsonarray1 != null)
        {
            asongsearchdata = new SongSearchData[jsonarray1.length()];
            for (int j1 = 0; j1 < asongsearchdata.length; j1++)
            {
                asongsearchdata[j1] = m(jsonarray1.getJSONObject(j1));
            }

        }
        jsonarray1 = jsonobject.optJSONArray("genreStations");
        agenrestationsearchdata = new GenreStationSearchData[0];
        if (jsonarray1 != null)
        {
            agenrestationsearchdata = new GenreStationSearchData[jsonarray1.length()];
            for (int k1 = 0; k1 < agenrestationsearchdata.length; k1++)
            {
                agenrestationsearchdata[k1] = n(jsonarray1.getJSONObject(k1));
            }

        }
        a3 = com.pandora.radio.data.t.a.g;
        obj2 = null;
        jsonobject1 = jsonobject.optJSONObject("exactMatch");
        aartistsearchdata1 = ((ArtistSearchData []) (obj));
        asongsearchdata2 = asongsearchdata;
        agenrestationsearchdata2 = agenrestationsearchdata;
        obj1 = a3;
        if (jsonobject1 == null) goto _L2; else goto _L1
_L1:
        aartistsearchdata1 = ((ArtistSearchData []) (obj));
        asongsearchdata2 = asongsearchdata;
        agenrestationsearchdata2 = agenrestationsearchdata;
        obj1 = a3;
        if (!jsonobject1.has("musicToken")) goto _L2; else goto _L3
_L3:
        SongSearchData asongsearchdata1[];
        GenreStationSearchData agenrestationsearchdata1[];
        ArtistSearchData aartistsearchdata[];
        if (jsonobject1.has("stationName"))
        {
            obj1 = com.pandora.radio.data.t.a.d;
            aartistsearchdata = ((ArtistSearchData []) (obj));
            asongsearchdata1 = asongsearchdata;
            agenrestationsearchdata1 = agenrestationsearchdata;
            jsonobject = ((JSONObject) (obj1));
            if (agenrestationsearchdata.length == 0)
            {
                agenrestationsearchdata1 = new GenreStationSearchData[1];
                agenrestationsearchdata1[0] = n(jsonobject1);
                jsonobject = ((JSONObject) (obj1));
                asongsearchdata1 = asongsearchdata;
                aartistsearchdata = ((ArtistSearchData []) (obj));
            }
        } else
        if (jsonobject1.has("songName"))
        {
            com.pandora.radio.data.t.a a1 = com.pandora.radio.data.t.a.c;
            aartistsearchdata = ((ArtistSearchData []) (obj));
            asongsearchdata1 = asongsearchdata;
            agenrestationsearchdata1 = agenrestationsearchdata;
            jsonobject = a1;
            if (asongsearchdata.length == 0)
            {
                asongsearchdata1 = new SongSearchData[1];
                asongsearchdata1[0] = m(jsonobject1);
                aartistsearchdata = ((ArtistSearchData []) (obj));
                agenrestationsearchdata1 = agenrestationsearchdata;
                jsonobject = a1;
            }
        } else
        {
            aartistsearchdata = ((ArtistSearchData []) (obj));
            asongsearchdata1 = asongsearchdata;
            agenrestationsearchdata1 = agenrestationsearchdata;
            jsonobject = a3;
            if (jsonobject1.has("artistName"))
            {
                com.pandora.radio.data.t.a a2 = com.pandora.radio.data.t.a.a;
                aartistsearchdata = ((ArtistSearchData []) (obj));
                asongsearchdata1 = asongsearchdata;
                agenrestationsearchdata1 = agenrestationsearchdata;
                jsonobject = a2;
                if (obj.length == 0)
                {
                    aartistsearchdata = new ArtistSearchData[1];
                    aartistsearchdata[0] = l(jsonobject1);
                    asongsearchdata1 = asongsearchdata;
                    agenrestationsearchdata1 = agenrestationsearchdata;
                    jsonobject = a2;
                }
            }
        }
        aartistsearchdata1 = aartistsearchdata;
        asongsearchdata2 = asongsearchdata1;
        agenrestationsearchdata2 = agenrestationsearchdata1;
        obj1 = jsonobject;
        if (jsonobject == null) goto _L2; else goto _L4
_L4:
        obj = jsonobject1.getString("musicToken");
        obj1 = jsonobject;
        jsonobject = ((JSONObject) (obj));
_L6:
        return new MusicSearchData(aartistsearchdata, asongsearchdata1, agenrestationsearchdata1, jsonobject, ((com.pandora.radio.data.t.a) (obj1)), searchdescriptor);
_L2:
        aartistsearchdata = aartistsearchdata1;
        asongsearchdata1 = asongsearchdata2;
        agenrestationsearchdata1 = agenrestationsearchdata2;
        jsonobject = obj2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private y a(Hashtable hashtable, Bundle bundle)
        throws n, p.cx.q, p.cx.y, JSONException, RemoteException, OperationApplicationException
    {
        Object obj = (String)hashtable.get("stationCreationSource");
        p.df.a.a("PublicApi", (new StringBuilder()).append("### createStationCommon: source = ").append(((String) (obj))).toString());
        d(hashtable);
        hashtable.put("resultCount", Integer.valueOf(1));
        hashtable.put("includeExtraParams", Boolean.TRUE);
        obj = o.d("station.createStation", hashtable, null, 2);
        hashtable = ((JSONObject) (obj)).getString("stationToken");
        a(((JSONObject) (obj)), bundle, ((String) (hashtable)));
        boolean flag = false;
        if (!i.y().d())
        {
            i();
            flag = true;
        }
        bundle = i.s();
        hashtable = i.y().a(bundle, hashtable);
        if (flag || hashtable == null)
        {
            if (hashtable == null)
            {
                hashtable = i.y().a(bundle, new y(((JSONObject) (obj))));
            }
            if (hashtable != null)
            {
                i.x().c();
                i.a(new as(hashtable));
            }
            return hashtable;
        } else
        {
            return hashtable;
        }
    }

    private HashMap a(JSONArray jsonarray, HashMap hashmap)
        throws JSONException
    {
        if (jsonarray != null)
        {
            for (int i1 = 0; i1 < jsonarray.length(); i1++)
            {
                p.cx.r r1 = new p.cx.r(jsonarray.getJSONObject(i1));
                if (r1.d())
                {
                    hashmap.put(r1.a(), r1);
                }
                p.df.a.c("PublicApi", "Optional feature: %s", new Object[] {
                    r1.toString()
                });
            }

        }
        return hashmap;
    }

    public static List a(p.cw.c c1, JSONArray jsonarray, boolean flag)
    {
        if (jsonarray != null)
        {
            if (!flag || (jsonarray = c1.k().V()) != null)
            {
                c1 = new ArrayList();
                int i1 = 0;
                while (i1 < jsonarray.length()) 
                {
                    try
                    {
                        c1.add(new p.dc.a(jsonarray.getJSONObject(i1)));
                    }
                    catch (Exception exception)
                    {
                        p.df.a.b("PublicApi", "Fail to retrieve ALaCarteActiveBenefit", exception);
                    }
                    i1++;
                }
                return c1;
            }
        }
        return null;
    }

    private Vector a(String s1, char c1)
    {
        Vector vector;
label0:
        {
            vector = new Vector();
            boolean flag = false;
            do
            {
                if (s1.length() <= 0)
                {
                    break label0;
                }
                int i1 = s1.indexOf(c1);
                if (i1 <= 0)
                {
                    break;
                }
                flag = true;
                vector.addElement(s1.substring(0, i1));
                s1 = s1.substring(i1 + 1, s1.length());
            } while (true);
            if (flag && s1.length() > 0)
            {
                vector.addElement(s1);
            }
        }
        return vector;
    }

    public static void a(Bundle bundle, Hashtable hashtable)
    {
        if (bundle != null)
        {
            Iterator iterator = bundle.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                String s2 = bundle.getString(s1);
                if (!com.pandora.radio.util.i.a(s2))
                {
                    hashtable.put(s1, s2);
                }
            } while (true);
        }
    }

    private void a(ArrayList arraylist, com.pandora.radio.data.v.a a1, ArrayList arraylist1)
    {
        if (!arraylist.isEmpty())
        {
            arraylist1.add(new v(null, a1, com.pandora.radio.data.t.a.f));
            arraylist1.addAll(arraylist);
        }
    }

    private void a(Hashtable hashtable, String s1, String s2)
        throws p.cx.y, JSONException, p.cx.q, n
    {
        if (!com.pandora.radio.util.i.a(s1))
        {
            hashtable.put("destinationUrl", s1);
        }
        hashtable.put("destinationStore", s2);
        o.d("user.clickBuy", hashtable, null, 2);
    }

    private void a(JSONArray jsonarray, String s1)
        throws JSONException, RemoteException, OperationApplicationException
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (jsonarray == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int i1 = 0;
_L2:
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(new y(jsonarray.getJSONObject(i1)));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        i.y().a(arraylist);
        if (!com.pandora.radio.util.i.a(s1))
        {
            i.x().a("STATION_LIST_CHECKSUM", s1);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        jsonarray;
        obj;
        JVM INSTR monitorexit ;
        throw jsonarray;
    }

    private void a(JSONObject jsonobject, Bundle bundle, String s1)
        throws JSONException
    {
        if (bundle != null)
        {
            bundle.clear();
            jsonobject = jsonobject.optJSONObject("trafficDrivingPartner");
            if (jsonobject != null)
            {
                String s2;
                for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); bundle.putString(s2, jsonobject.getString(s2)))
                {
                    s2 = (String)iterator.next();
                }

            }
            jsonobject = j.t();
            boolean flag;
            if (jsonobject != null && jsonobject.c().equals(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                bundle.remove("confirmationText");
                return;
            }
        }
    }

    private void a(JSONObject jsonobject, boolean flag, boolean flag1, int i1, String s1, String s2)
        throws JSONException, p.cx.q, p.cx.y, n, RemoteException, OperationApplicationException
    {
        i.o().a(jsonobject.optInt("statsCollectorBatchMinimumDelaySeconds", 60), jsonobject.optInt("statsCollectorBatchMaximumCount", 300));
        String s3 = jsonobject.getString("userId");
        l.e(s3);
        List list;
        int j1;
        if (flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = jsonobject.getBoolean("hasAudioAds");
            i1 = jsonobject.optInt("age", -1);
            s1 = jsonobject.optString("gender", "");
            s2 = jsonobject.optString("zip", "");
        }
        j1 = jsonobject.optInt("listeningTimeoutMinutes", -1);
        i.z().a(j1);
        try
        {
            String s4 = jsonobject.getString("hybridListeningTimeout");
            i.z().a(s4);
        }
        catch (Exception exception1) { }
        try
        {
            j1 = jsonobject.getInt("tileClassicIntegrationTime");
            com.pandora.radio.util.p.a().a(true);
            p.df.a.a("PublicApi", (new StringBuilder()).append("View-mode stat collection enabled with integration time of (in min): ").append(j1).toString());
        }
        catch (Exception exception)
        {
            com.pandora.radio.util.p.a().a(false);
            p.df.a.a("PublicApi", "View-mode stat collection is disabled!");
        }
        list = a(i, jsonobject.optJSONArray("aLaCarteActiveBenefits"), flag);
        j1 = jsonobject.optInt("complimentarySecondsRemaining", -1);
        g = new af(i, jsonobject.getBoolean("canListen"), flag1, jsonobject.getString("userAuthToken"), jsonobject.getString("username"), s3, jsonobject.optString("splashScreenAdUrl", null), jsonobject.optString("stationCreationAdUrl", null), jsonobject.optString("videoAdUrl", null), jsonobject.optString("pandoraOneUpgradeUrl", null), jsonobject.optString("pandoraOneUpgradeInfo", null), jsonobject.optString("listeningTimeoutAlertMsgUri", null), jsonobject.optBoolean("collectTrackLifetimeStats", false), jsonobject.optBoolean("isSubscriber", false), jsonobject.optString("webname", ""), i1, s1, s2, j1, jsonobject.optBoolean("hasUsedTrial", false), jsonobject.optString("accountMessageKey", null), jsonobject.optString("accountMessageUrl", null), jsonobject.optString("initialNowPlayingAdUrl", null), jsonobject.optInt("dailySkipLimitNonSubscriber", 12), jsonobject.optInt("dailySkipLimitSubscriber", 12), jsonobject.optInt("skipDelayMillisecondsAfterTrackStart", 0), jsonobject.optBoolean("showUserRecommendations", false), jsonobject.optBoolean("eligibleForPromotedStations", false), jsonobject.optBoolean("promotedStationsRecommendationFallback", false), jsonobject.optBoolean("isTrialAvailable", false), jsonobject.optBoolean("zeroVolumeAutoPauseEnabledFlag"), jsonobject.optInt("zeroVolumeNumMutedTracks"), jsonobject.optInt("promotedStationsPrefetchExpirationSeconds"), jsonobject.optString("aLaCarteAvailableProductsChecksum"), list, jsonobject.optInt("maxAdInitiatedRefreshDelaySeconds", 60));
        n.a(g);
        if (!p) goto _L2; else goto _L1
_L1:
        s1 = new l(jsonobject.optString("amazonAppStoreP2PSku"), jsonobject.optString("amazonAppStoreMonthlySku"), null);
_L3:
        i.a(new p.dd.v(s1));
        s1 = jsonobject.optJSONObject("thirdPartyTrackingUrls");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_505;
        }
        i.a(new ba(s1));
        e(jsonobject);
        h(jsonobject);
        k(jsonobject);
        f(jsonobject);
        g(jsonobject);
        a(jsonobject, flag);
        s1 = new ak(jsonobject);
        i.a(new bt(s1));
        i.i().b(new ae(jsonobject));
        if (g.i() && k.e())
        {
            k.a(false);
        }
        i.k().f(jsonobject.optBoolean("showArtistMessageSurvey", false));
        i.y().c();
        j(jsonobject);
        p(jsonobject);
        n.b();
        if (i.v().b() != null && !s3.equals(i.v().b()))
        {
            i.v().a(g);
        }
        s1 = g.e();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_1033;
        }
        if (!g.a())
        {
            break MISSING_BLOCK_LABEL_1033;
        }
_L4:
        i.x().a("KEY_SPLASH_SCREEN_URL", s1);
        if (!jsonobject.optBoolean("subscriptionHasExpired", false))
        {
            break MISSING_BLOCK_LABEL_855;
        }
        if (j1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = new az(flag, true);
        if (!f)
        {
            i.a(r);
        }
        l.c(null);
        i.a(new bp(false));
        if (jsonobject.has("pandoraOneRenewalUrl") && g.f() == null)
        {
            g.c(jsonobject.optString("pandoraOneRenewalUrl", null));
        }
        i.x().a("KEY_IS_P1", Boolean.valueOf(g.i()));
        i.x().a("KEY_IS_WITHIN_TRIAL", Boolean.valueOf(g.w()));
        return;
_L2:
        s1 = new l(jsonobject.optString("googleplayP2PSku"), jsonobject.optString("googleplayMonthlySku"), jsonobject.optString("googleplayApiKey"));
          goto _L3
        jsonobject;
        p.df.a.b("PublicApi", "setUserFromResult exception!!!", jsonobject);
        throw jsonobject;
        jsonobject;
        n.a(null);
        throw jsonobject;
        s1 = "";
          goto _L4
    }

    public static HashMap b(JSONObject jsonobject)
        throws JSONException
    {
        HashMap hashmap = new HashMap(a.length);
        for (int i1 = 0; i1 < a.length; i1++)
        {
            String s1 = a[i1];
            if (jsonobject == null || !jsonobject.has(s1))
            {
                continue;
            }
            JSONObject jsonobject1 = jsonobject.getJSONObject(s1);
            HashMap hashmap1 = new HashMap(b.length);
            for (int j1 = 0; j1 < b.length; j1++)
            {
                String s2 = b[j1];
                String s3 = jsonobject1.optString(s2);
                if (!com.pandora.radio.util.i.a(s3))
                {
                    hashmap1.put(s2, s3);
                }
            }

            hashmap.put(s1, hashmap1);
        }

        return hashmap;
    }

    private void b(JSONArray jsonarray, String s1)
    {
        p.df.a.c("PublicApi", "%s, unexpected number of value exchange items: %d", new Object[] {
            s1, Integer.valueOf(jsonarray.length())
        });
    }

    private void c(Hashtable hashtable)
    {
        hashtable.put("deviceId", m.e());
        hashtable.put("includePandoraOneInfo", Boolean.TRUE);
        hashtable.put("includeDemographics", Boolean.TRUE);
        hashtable.put("includeAdAttributes", Boolean.TRUE);
        hashtable.put("returnStationList", Boolean.TRUE);
        hashtable.put("includeStationArtUrl", Boolean.TRUE);
        hashtable.put("includeStationSeeds", Boolean.TRUE);
        hashtable.put("includeShuffleInsteadOfQuickMix", Boolean.TRUE);
        hashtable.put("stationArtSize", "W130H130");
        hashtable.put("returnCollectTrackLifetimeStats", Boolean.TRUE);
        hashtable.put("returnIsSubscriber", Boolean.TRUE);
        hashtable.put("xplatformAdCapable", Boolean.TRUE);
        hashtable.put("complimentarySponsorSupported", Boolean.TRUE);
        hashtable.put("includeSubscriptionExpiration", Boolean.TRUE);
        hashtable.put("returnHasUsedTrial", Boolean.TRUE);
        hashtable.put("returnUserstate", Boolean.TRUE);
        hashtable.put("includeAccountMessage", Boolean.TRUE);
        hashtable.put("includeUserWebname", Boolean.TRUE);
        hashtable.put("includeListeningHours", Boolean.TRUE);
        hashtable.put("includeFacebook", Boolean.TRUE);
        hashtable.put("includeTwitter", Boolean.TRUE);
        hashtable.put("includeDailySkipLimit", Boolean.TRUE);
        hashtable.put("includeSkipDelay", Boolean.TRUE);
        hashtable.put("includeGoogleplay", Boolean.TRUE);
        hashtable.put("includeShowUserRecommendations", Boolean.TRUE);
        hashtable.put("includeAdvertiserAttributes", Boolean.TRUE);
        hashtable.put("includeStatsCollectorConfig", Boolean.TRUE);
        hashtable.put("includeABTesting", Boolean.TRUE);
        hashtable.put("includeExtraParams", Boolean.TRUE);
        hashtable.put("shuffleIconVersion", Integer.valueOf(com.pandora.radio.util.i.a(e)));
        if (t != null)
        {
            q = t.a();
        }
        h(hashtable);
        d(hashtable);
        String s1 = i.x().b("STATION_LIST_CHECKSUM");
        if (!com.pandora.radio.util.i.a(s1))
        {
            hashtable.put("stationListChecksum", s1);
        }
        hashtable.put("returnGenreStations", Boolean.TRUE);
        s1 = i.x().b("GENRE_STATION_LIST_CHECKSUM");
        if (!com.pandora.radio.util.i.a(s1))
        {
            hashtable.put("genreStationsChecksum", s1);
        }
        hashtable.put("includeGenreCategoryAdUrl", Boolean.TRUE);
    }

    private void c(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.has("adRefreshInterval"))
        {
            int i1 = jsonobject.getInt("adRefreshInterval");
            i.a(new p.dd.f(i1));
        }
        if (jsonobject.has("videoAdStartInterval"))
        {
            i.a(new bs(jsonobject.getInt("videoAdStartInterval")));
        }
        if (jsonobject.has("videoAdRefreshInterval"))
        {
            i.a(new br(jsonobject.getInt("videoAdRefreshInterval")));
        }
        Object obj;
        p.cx.r r1;
        HashMap hashmap;
        if (jsonobject.has("tritonRollout"))
        {
            obj = new ad(jsonobject.getJSONObject("tritonRollout"));
        } else
        {
            obj = new ad();
        }
        r1 = new p.cx.r("tritonRollout", true, obj);
        hashmap = new HashMap();
        if (!jsonobject.has("optionalFeatures")) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONArray("optionalFeatures");
        jsonobject = ((JSONObject) (obj));
_L4:
        a(jsonobject, hashmap);
_L2:
        hashmap.put(r1.a(), r1);
        p.cx.s.a.a(hashmap);
        return;
        JSONException jsonexception;
        jsonexception;
        jsonobject = jsonobject.getJSONObject("optionalFeatures").getJSONArray("optionalFeature");
        if (true) goto _L4; else goto _L3
_L3:
    }

    private v[] c(Vector vector)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist3 = new ArrayList();
        ArrayList arraylist4 = new ArrayList();
        int i1 = 0;
        do
        {
            while (i1 < vector.size()) 
            {
                Object obj = a((String)vector.elementAt(i1), '\t');
                String s1 = (String)((Vector) (obj)).elementAt(0);
                if (s(s1))
                {
                    obj = new v(s1, (String)((Vector) (obj)).elementAt(1), (String)((Vector) (obj)).elementAt(2));
                } else
                if (t(s1))
                {
                    obj = new v(s1, (new StringBuilder()).append((String)((Vector) (obj)).elementAt(1)).append(" (Sponsored Station)").toString(), u(s1));
                } else
                if (r(s1))
                {
                    obj = new v(s1, (String)((Vector) (obj)).elementAt(1), u(s1));
                } else
                {
                    obj = new v(s1, (String)((Vector) (obj)).elementAt(1), u(s1));
                }
                if (i1 == 0)
                {
                    arraylist.add(obj);
                } else
                if (s(s1))
                {
                    arraylist3.add(obj);
                } else
                if (t(s1))
                {
                    arraylist1.add(obj);
                } else
                if (r(s1))
                {
                    arraylist2.add(obj);
                } else
                {
                    arraylist4.add(obj);
                }
                i1++;
            }
            vector = new ArrayList();
            a(arraylist, com.pandora.radio.data.v.a.a, vector);
            a(arraylist1, com.pandora.radio.data.v.a.b, vector);
            a(arraylist2, com.pandora.radio.data.v.a.c, vector);
            a(arraylist3, com.pandora.radio.data.v.a.d, vector);
            a(arraylist4, com.pandora.radio.data.v.a.e, vector);
            return (v[])vector.toArray(new v[vector.size()]);
        } while (true);
    }

    private void d(Hashtable hashtable)
    {
        hashtable.put("includePlaylistAttributes", Boolean.TRUE);
        hashtable.put("includeSkipAttributes", Boolean.TRUE);
        hashtable.put("includeStationExpirationTime", Boolean.TRUE);
        hashtable.put("includeStationDescription", Boolean.TRUE);
        hashtable.put("includeAdvertiserAttributes", Boolean.TRUE);
    }

    private void d(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getString("syncTime");
        jsonobject = w.b(jsonobject);
        if (jsonobject.length() > 0)
        {
            w.a(Long.parseLong(jsonobject));
        }
    }

    private void e(Hashtable hashtable)
    {
        String s1 = l.P();
        if (!com.pandora.radio.util.i.a(s1))
        {
            hashtable.put("testArtistMessage", s1);
        }
    }

    private void e(JSONObject jsonobject)
        throws JSONException, RemoteException, OperationApplicationException
    {
        jsonobject = jsonobject.optString("stationListResult");
        if (!com.pandora.radio.util.i.a(jsonobject))
        {
            jsonobject = new JSONObject(jsonobject);
            a(jsonobject.optJSONArray("stations"), jsonobject.optString("checksum"));
        }
    }

    private void f(Hashtable hashtable)
    {
        String s1 = l.T();
        if (!com.pandora.radio.util.i.a(s1))
        {
            hashtable.put("testFeaturedTrack", s1);
        }
    }

    private void f(JSONObject jsonobject)
        throws JSONException
    {
        i.a(new bk(jsonobject));
    }

    private void g(Hashtable hashtable)
    {
        Object obj = p.cy.b.c();
        hashtable.put("audioPath", ((p.cy.c) (obj)).k());
        if (s != null && !s.isEmpty())
        {
            new HashMap();
            Iterator iterator = s.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Map map = ((p.cx.l)iterator.next()).o();
                if (map != null && !map.isEmpty())
                {
                    hashtable.putAll(map);
                }
            } while (true);
        }
        hashtable.put("networkType", ((p.cy.c) (obj)).j());
        obj = ((p.cy.c) (obj)).h();
        if (obj != null)
        {
            hashtable.put("bluetoothDevice", obj);
        }
    }

    private void g(JSONObject jsonobject)
        throws JSONException
    {
        if (jsonobject.has("twitterShareConsumerKey"))
        {
            String s1 = jsonobject.optString("twitterShareConsumerKey");
            jsonobject = jsonobject.optString("twitterShareConsumerSecret");
            i.a(new bm(s1, jsonobject));
        }
    }

    private void h(Hashtable hashtable)
    {
        Vector vector = new Vector();
        String s1;
        if (m.e() != null)
        {
            s1 = m.e();
        } else
        {
            s1 = "";
        }
        vector.add(s1);
        if (m.d() != null)
        {
            s1 = m.d();
        } else
        {
            s1 = "";
        }
        vector.add(s1);
        if (q != null)
        {
            s1 = q.a();
        } else
        {
            s1 = "";
        }
        vector.add(s1);
        hashtable.put("deviceTrackingIds", vector);
        if (q != null)
        {
            if (q.b())
            {
                s1 = "NO";
            } else
            {
                s1 = "YES";
            }
        } else
        {
            s1 = "";
        }
        hashtable.put("advertisingTrackingEnabled", s1);
    }

    private void h(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optString("genreStationsResult");
        if (!com.pandora.radio.util.i.a(jsonobject))
        {
            i(new JSONObject(jsonobject));
        }
    }

    private void i(Hashtable hashtable)
    {
        int i1 = i.i().e();
        i.i().a(i1);
        hashtable.put("incrementalListening", Integer.valueOf(i1));
        hashtable.put("listeningTimestamp", (new StringBuilder()).append(i.i().d()).append("").toString());
    }

    private void i(JSONObject jsonobject)
        throws JSONException
    {
        JSONArray jsonarray = jsonobject.optJSONArray("categories");
        if (jsonarray != null)
        {
            ArrayList arraylist = new ArrayList(jsonarray.length());
            for (int i1 = 0; i1 < jsonarray.length(); i1++)
            {
                arraylist.add(new j(jsonarray.getJSONObject(i1)));
            }

            i.w().c().a(arraylist);
            i.a(new t());
        }
        jsonobject = jsonobject.optString("checksum");
        if (!com.pandora.radio.util.i.a(jsonobject))
        {
            i.x().a("GENRE_STATION_LIST_CHECKSUM", jsonobject);
        }
    }

    private void j(JSONObject jsonobject)
        throws JSONException
    {
        JSONArray jsonarray = jsonobject.optJSONArray("abTests");
        jsonobject = jsonobject.optJSONArray("abTestsWithExposureLogging");
        if (jsonarray != null)
        {
            ((p.dj.c)i.q()).a(jsonarray, jsonobject);
        }
    }

    private void k(JSONObject jsonobject)
    {
        l.h(jsonobject.optString("whyAdsText", null));
        l.i(jsonobject.optString("dismissAdText", null));
    }

    private static ArtistSearchData l(JSONObject jsonobject)
        throws JSONException
    {
        return new ArtistSearchData(jsonobject.getString("musicToken"), jsonobject.getString("artistName"), jsonobject.getInt("score"));
    }

    private static SongSearchData m(JSONObject jsonobject)
        throws JSONException
    {
        return new SongSearchData(jsonobject.getString("musicToken"), jsonobject.getString("songName"), jsonobject.getString("artistName"), jsonobject.getInt("score"));
    }

    private static GenreStationSearchData n(JSONObject jsonobject)
        throws JSONException
    {
        return new GenreStationSearchData(jsonobject.getString("musicToken"), jsonobject.getString("stationName"), jsonobject.getInt("score"));
    }

    private void o(JSONObject jsonobject)
        throws JSONException, p.cx.q, p.cx.y, n, RemoteException, OperationApplicationException
    {
        a(jsonobject, false, false, -1, ((String) (null)), ((String) (null)));
    }

    private void p(JSONObject jsonobject)
        throws JSONException
    {
        Bundle bundle = new Bundle();
        a(jsonobject, bundle, ((String) (null)));
        if (bundle.containsKey("timeOut"))
        {
            try
            {
                long l1 = Long.parseLong(bundle.getString("timeOut"));
                g.a(l1 * 1000L);
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                p.df.a.b("PublicApi", "handleTrafficDrivingPartnerData exception", jsonobject);
            }
        }
        if (bundle.containsKey("partnerCode"))
        {
            i.a(new bi(bundle));
        }
    }

    private boolean r(String s1)
    {
        boolean flag = false;
        char c1 = s1.charAt(0);
        if (c1 == 'R' || c1 == 'C')
        {
            flag = true;
        }
        return flag;
    }

    private boolean s(String s1)
    {
        boolean flag = false;
        if (s1.charAt(0) == 'S')
        {
            flag = true;
        }
        return flag;
    }

    private boolean t(String s1)
    {
        boolean flag = false;
        if (s1.charAt(0) == 'A')
        {
            flag = true;
        }
        return flag;
    }

    private com.pandora.radio.data.t.a u(String s1)
    {
        switch (s1.charAt(0))
        {
        default:
            return null;

        case 67: // 'C'
        case 82: // 'R'
            return com.pandora.radio.data.t.a.a;

        case 83: // 'S'
            return com.pandora.radio.data.t.a.c;

        case 71: // 'G'
            return com.pandora.radio.data.t.a.d;

        case 65: // 'A'
            return com.pandora.radio.data.t.a.e;
        }
    }

    private String v()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("includeGenreCategoryAdUrl", Boolean.valueOf(true));
        return o.d("station.getGenreStationsChecksum", hashtable, null, 2).getString("checksum");
    }

    public MusicSearchData a(String s1, boolean flag, SearchDescriptor searchdescriptor)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        if (searchdescriptor.c())
        {
            a(searchdescriptor.f, hashtable);
        }
        hashtable.put("searchText", s1);
        hashtable.put("includeExtraParams", Boolean.TRUE);
        hashtable.put("includeNearMatches", Boolean.TRUE);
        hashtable.put("includeGenreStations", Boolean.valueOf(flag));
        s1 = o.d("music.search", hashtable, null, 2);
        a(((JSONObject) (s1)), searchdescriptor.f, ((String) (null)));
        return a(((JSONObject) (s1)), searchdescriptor);
    }

    public StationRecommendations a(JSONObject jsonobject)
    {
        jsonobject = new StationRecommendations(i, jsonobject);
        v.a(jsonobject);
        return jsonobject;
    }

    public aj a(String s1, Hashtable hashtable, String s2, com.pandora.radio.data.b b1, g g1)
        throws p.cx.q, n, p.cx.y, JSONException
    {
        Hashtable hashtable1 = new Hashtable();
        hashtable1.put("offerName", s1);
        hashtable1.put("rewardProperties", hashtable);
        hashtable1.put("lineId", b1.b());
        hashtable1.put("creativeId", b1.a());
        hashtable1.put("adServerCorrelationId", s2);
        if (g1 != null)
        {
            boolean flag;
            if (g1 == p.cx.g.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hashtable1.put("engagementCompleted", Boolean.valueOf(flag));
        }
        return a(o.d("user.startValueExchange", hashtable1, null, 2), s2, "startValueExchange");
    }

    protected aj a(JSONObject jsonobject, String s1, String s2)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray("valueExchangeRewards");
        if (jsonobject == null)
        {
            return null;
        }
        if (jsonobject.length() == 0)
        {
            b(jsonobject, s2);
            return null;
        }
        if (jsonobject.length() > 1)
        {
            b(jsonobject, s2);
        }
        jsonobject = new aj(jsonobject.getJSONObject(0), s1);
        if (jsonobject.d() < 15L)
        {
            p.df.a.c("PublicApi", (new StringBuilder()).append("VEX - skipping reward as there are too few seconds remaining: ").append(jsonobject.d()).toString());
            return null;
        } else
        {
            i.k().j(s1);
            return jsonobject;
        }
    }

    public com.pandora.radio.data.d a(com.pandora.radio.data.d d1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        if (com.pandora.radio.util.i.a(d1.c()))
        {
            return d1;
        }
        p.df.a.c("AUDIO AD", (new StringBuilder()).append("fetching audio ad data from dart using token ").append(d1.c()).toString());
        Object obj = new Hashtable();
        ((Hashtable) (obj)).put("adToken", d1.c());
        ((Hashtable) (obj)).put("returnAdTrackingTokens", Boolean.TRUE);
        ((Hashtable) (obj)).put("supportAudioAds", Boolean.TRUE);
        ((Hashtable) (obj)).put("includeBannerAd", Boolean.TRUE);
        ((Hashtable) (obj)).put("includeListeningHours", Boolean.TRUE);
        h(((Hashtable) (obj)));
        Object obj1 = new Hashtable();
        if (j.e())
        {
            ((Hashtable) (obj1)).put("audioAdIndex", Integer.valueOf(j.w()));
            j.r();
        }
        obj1 = o.d("ad.getAdMetadata", ((Hashtable) (obj)), ((Hashtable) (obj1)), 2);
        if (((JSONObject) (obj1)).has("bannerAdMap"))
        {
            obj = (new com.pandora.radio.data.a.b(((JSONObject) (obj1)).optJSONObject("bannerAdMap"), true, i)).a();
            ((com.pandora.radio.data.a) (obj)).a(50);
        } else
        {
            p.df.a.c("AUDIO AD", "audio ad does not have a followon banner");
            obj = null;
        }
        d1.a(((JSONObject) (obj1)).optString("title"), ((JSONObject) (obj1)).optString("companyName"), ((JSONObject) (obj1)).optString("imageUrl"), ((JSONObject) (obj1)).optString("clickThroughUrl"), ((JSONObject) (obj1)).optJSONArray("adTrackingTokens"), b(((JSONObject) (obj1)).optJSONObject("audioUrlMap")), ((JSONObject) (obj1)).optString("trackGain"), ((com.pandora.radio.data.a) (obj)));
        p.df.a.c("AUDIO AD", (new StringBuilder()).append("dart returned an audio ad: ").append(d1.toString()).toString());
        return d1;
    }

    public y a(long l1, String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Object obj = new Hashtable();
        ((Hashtable) (obj)).put("trackToken", s1);
        s1 = o.d("station.deleteFeedback", ((Hashtable) (obj)), null, 2);
        obj = i.y().a(i.s(), l1);
        ((y) (obj)).b(s1);
        return ((y) (obj));
    }

    public y a(long l1, String s1, Boolean boolean1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("trackToken", s1);
        hashtable.put("isPositive", boolean1);
        s1 = o.d("station.addFeedback", hashtable, null, 2);
        boolean1 = i.y().a(i.s(), l1);
        boolean1.b(s1);
        return boolean1;
    }

    public y a(String s1, Integer integer, e e1, com.pandora.radio.data.b b1, SearchDescriptor searchdescriptor, String s2)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        boolean flag = true;
        if (s1 == null)
        {
            throw new IllegalArgumentException("createStationFromMusicToken: musicToken must be non-null");
        }
        Hashtable hashtable = new Hashtable();
        hashtable.put("musicToken", s1);
        hashtable.put("includeStationArtUrl", Boolean.TRUE);
        hashtable.put("stationArtSize", "W130H130");
        hashtable.put("includeStationSeeds", Boolean.TRUE);
        hashtable.put("includeAdAttributes", Boolean.TRUE);
        if (!com.pandora.radio.util.i.a(s2))
        {
            hashtable.put("adServerCorrelationId", s2);
        }
        if (integer != null)
        {
            hashtable.put("isPromotedStation", Boolean.valueOf(true));
            hashtable.put("promotedStationCampaignId", integer);
        }
        if (searchdescriptor == null || !searchdescriptor.c())
        {
            flag = false;
        }
        if (flag)
        {
            a(searchdescriptor.f, hashtable);
        }
        hashtable.put("stationCreationSource", e1.toString());
        if (b1 != null && b1.c())
        {
            hashtable.put("lineId", b1.b());
            hashtable.put("creativeId", b1.a());
        }
        if (flag)
        {
            s1 = searchdescriptor.f;
        } else
        {
            s1 = null;
        }
        return a(hashtable, ((Bundle) (s1)));
    }

    public y a(String s1, String s2, e e1)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("createStationFromTrackToken: trackToken must be non-null");
        }
        if (s2 == null)
        {
            throw new IllegalArgumentException("createStationFromTrackToken: musicType must be non-null");
        } else
        {
            Hashtable hashtable = new Hashtable();
            hashtable.put("trackToken", s1);
            hashtable.put("musicType", s2);
            hashtable.put("includeStationArtUrl", Boolean.valueOf(true));
            hashtable.put("stationArtSize", "W130H130");
            hashtable.put("includeAdAttributes", Boolean.TRUE);
            hashtable.put("includeStationSeeds", Boolean.TRUE);
            hashtable.put("stationCreationSource", e1.toString());
            return a(hashtable, ((Bundle) (null)));
        }
    }

    public y a(String s1, boolean flag)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        Hashtable hashtable = new Hashtable();
        if (!com.pandora.radio.util.i.a(s1))
        {
            hashtable.put("stationToken", s1);
        }
        hashtable.put("includeExtendedAttributes", Boolean.valueOf(true));
        hashtable.put("includeAdAttributes", Boolean.valueOf(true));
        hashtable.put("includeAdvertiserAttributes", Boolean.TRUE);
        hashtable.put("includeStationPersonalizationPercent", Boolean.valueOf(flag));
        hashtable.put("includeExtraParams", Boolean.TRUE);
        s1 = new y(o.d("station.getStation", hashtable, null, 2));
        if (flag)
        {
            i.y().b(s1);
        }
        return s1;
    }

    public JSONObject a(long l1, long l2, int i1)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        if (l1 > 0L)
        {
            hashtable.put("oldestTimestamp", Long.valueOf(l1));
        }
        if (l2 > 0L)
        {
            hashtable.put("newestTimestamp", Long.valueOf(l2));
        }
        if (i1 > 0)
        {
            hashtable.put("maxNumOfMsgs", Integer.valueOf(i1));
        }
        return o.d("user.inboxGetMessages", hashtable, null, 2);
    }

    public JSONObject a(Hashtable hashtable)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        hashtable.put("includeFacebook", Boolean.TRUE);
        hashtable.put("includeExtraParams", Boolean.TRUE);
        hashtable.put("deviceId", m.e());
        return o.c("user.changeSettings", hashtable, null, 2);
    }

    public JSONObject a(List list, d d1)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        int i1 = d1.a();
        d1 = new Hashtable();
        d1.put("messageIds", new Vector(list));
        d1.put("status", Integer.valueOf(i1));
        return o.d("user.inboxSetStatus", d1, null, 2);
    }

    public JSONObject a(Vector vector)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("settings", vector);
        vector = o.c("station.changeSettings", hashtable, null, 2);
        i.k().c(null);
        return vector;
    }

    public JSONObject a(JSONArray jsonarray)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("userAuthToken", g.b());
        hashtable.put("quickMixStationIds", jsonarray);
        hashtable.put("deviceProperties", m.g());
        hashtable.put("quickMixStationIds", jsonarray);
        return o.d("user.setQuickMix", hashtable, null, 2);
    }

    public c a(y y1, p.cw.b.b b1, com.pandora.radio.data.k k1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        String s2 = null;
        int i1 = 0;
        String s1;
        if (k1 != null)
        {
            s1 = k1.a();
        } else
        {
            s1 = null;
        }
        if (k1 != null)
        {
            s2 = k1.b();
        }
        if (s1 != null && s2 != null)
        {
            throw new InvalidParameterException("lastPlayedTrackToken and startingAtTrackId cannot both be set");
        }
        k1 = new Hashtable();
        k1.put("stationToken", y1.c());
        if (s1 != null)
        {
            k1.put("lastPlayedTrackToken", s1);
        }
        if (s2 != null)
        {
            k1.put("startingAtTrackId", s2);
        }
        aa aaa[];
        boolean flag;
        if (b1 != p.cw.b.b.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1.put("stationIsStarting", Boolean.valueOf(flag));
        k1.put("includeTrackLength", Boolean.TRUE);
        k1.put("includeAudioToken", Boolean.TRUE);
        k1.put("xplatformAdCapable", Boolean.TRUE);
        k1.put("includeAudioReceiptUrl", Boolean.TRUE);
        k1.put("includeAudioSkipUrl", Boolean.TRUE);
        k1.put("includeBackstageAdUrl", Boolean.TRUE);
        k1.put("includeSharingAdUrl", Boolean.TRUE);
        k1.put("includeSocialAdUrl", Boolean.TRUE);
        k1.put("includeCompetitiveSepIndicator", Boolean.TRUE);
        k1.put("includeCompletePlaylist", Boolean.TRUE);
        k1.put("includeTrackOptions", Boolean.TRUE);
        k1.put("audioAdPodCapable", Boolean.TRUE);
        k1.put("additionalAudioUrl", "HTTP_128_MP3");
        k1.put("includeExtraParams", Boolean.TRUE);
        k1.put("includeArtistMessages", Boolean.TRUE);
        e(k1);
        f(k1);
        b1 = new Hashtable();
        g(b1);
        h(k1);
        i(k1);
        b1 = o.d("station.getPlaylist", k1, b1, 2);
        if (b1.has("deviceProperties"))
        {
            c(b1.getJSONObject("deviceProperties"));
        }
        k1 = b1.getJSONArray("items");
        for (aaa = new aa[k1.length()]; i1 < aaa.length; i1++)
        {
            JSONObject jsonobject = k1.getJSONObject(i1);
            aaa[i1] = ab.a(y1.b(), jsonobject);
        }

        i.i().a(new ae(b1));
        return new c(aaa, b1.optString("checksum"));
    }

    public f a(String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Object obj = new Hashtable();
        ((Hashtable) (obj)).put("username", s1);
        ((Hashtable) (obj)).put("partnerAuthToken", h.b());
        s1 = o.c("user.validateUsername", ((Hashtable) (obj)), null, 2);
        obj = new f();
        obj.a = s1.optBoolean("isValid", false);
        obj.b = false;
        if (((f) (obj)).a)
        {
            obj.b = s1.optBoolean("isUnique", false);
        }
        return ((f) (obj));
    }

    public p.dc.e a(String s1, String s2, String s3, String s4, String s5)
        throws p.cx.q, p.cx.y, JSONException, n
    {
        Object obj = null;
        Hashtable hashtable = new Hashtable();
        hashtable.put("userAuthToken", g.b());
        hashtable.put("googleReceipt", s1);
        hashtable.put("googleFullReceipt", com.pandora.radio.util.i.c(s5));
        hashtable.put("googleUserId", s2);
        hashtable.put("googleSku", s3);
        hashtable.put("googleSignature", s4);
        h(hashtable);
        s2 = o.c("user.purchaseGoogleALaCarteProduct", hashtable, null, 2);
        s3 = s2.getString("userAuthToken");
        s1 = obj;
        if (!com.pandora.radio.util.i.a(s3))
        {
            s1 = obj;
            if (g != null)
            {
                g.a(s3);
                s1 = new p.dc.e(s2);
            }
        }
        return s1;
    }

    public void a(Intent intent)
        throws JSONException, p.cx.q, p.cx.y, n, RemoteException, OperationApplicationException
    {
        p/cx/x;
        JVM INSTR monitorenter ;
        if (d)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (g == null)
        {
            n.a(p.cx.e.a.a);
        }
        if (!a())
        {
            throw new p.cx.y(12, "", null, null);
        }
        break MISSING_BLOCK_LABEL_55;
        intent;
        p/cx/x;
        JVM INSTR monitorexit ;
        throw intent;
        d = true;
        af af1 = g;
        if (af1 != null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        f = true;
        b(false);
        f = false;
        p/cx/x;
        JVM INSTR monitorexit ;
        i.a(new ar(intent));
        return;
        intent;
        if (intent.a() != 1009 || i.C())
        {
            break MISSING_BLOCK_LABEL_152;
        }
        p.df.a.c("PublicApi", "deviceLogin exception, API_ERROR_DEVICE_NOT_FOUND!!!", intent);
        n.a(p.cx.e.a.d);
        f = false;
        p/cx/x;
        JVM INSTR monitorexit ;
        return;
        throw intent;
        intent;
        f = false;
        throw intent;
    }

    public void a(PromotedStation promotedstation)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("stationToken", promotedstation.n());
        hashtable.put("promotedStationCampaignId", Integer.valueOf(promotedstation.c()));
        o.d("station.dismissPromotedStation", hashtable, null, 2);
    }

    public void a(com.pandora.radio.data.c c1, String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("am_artistuid", c1.c());
        hashtable.put("am_id", Long.valueOf(c1.b()));
        hashtable.put("am_metric", s1);
        o.d("amp.insertArtistMessageMetric", hashtable, null, 2);
    }

    public void a(String s1, String s2)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("stationToken", s1);
        hashtable.put("musicToken", s2);
        s2 = o.d("station.addMusic", hashtable, null, 2);
        i.y().a(i.s(), s1, new w(s1, s2));
    }

    public void a(String s1, String s2, aa aa1)
        throws p.cx.y, JSONException, p.cx.q, n
    {
        if (aa1 == null)
        {
            return;
        }
        Hashtable hashtable = new Hashtable();
        if (aa1 != null)
        {
            hashtable.put("trackToken", aa1.w());
            hashtable.put("isFeatured", Boolean.valueOf(aa1.W()));
        }
        a(hashtable, s1, s2);
    }

    public void a(String s1, String s2, String s3)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("username", s1);
        hashtable.put("password", s2);
        hashtable.put("appSignature", s3);
        hashtable.put("loginType", "user");
        c(hashtable);
        s1 = o.c("auth.userLogin", hashtable, null, 1);
        o(s1);
        l.c(s1.toString());
    }

    public void a(String s1, String s2, String s3, int i1, String s4, boolean flag)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("username", s1);
        hashtable.put("password", s2);
        hashtable.put("gender", s3);
        hashtable.put("birthYear", Integer.valueOf(i1));
        hashtable.put("zipCode", s4);
        hashtable.put("emailOptIn", Boolean.valueOf(flag));
        hashtable.put("accountType", "registered");
        hashtable.put("registeredType", "user");
        c(hashtable);
        s1 = o.c("user.createUser", hashtable, null, 1);
        a(((JSONObject) (s1)), false, true, com.pandora.radio.util.i.a(i1), s3, s4);
        l.c(s1.toString());
    }

    public void a(String s1, String s2, String s3, Long long1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("facebookId", s1);
        hashtable.put("name", s2);
        hashtable.put("facebookAccessToken", s3);
        hashtable.put("facebookAccessTokenExpires", long1.toString());
        o.c("user.authorizeFacebook", hashtable, null, 2);
    }

    public void a(String s1, a a1, b b1)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("notificationId", s1);
        hashtable.put("action", a1.name());
        hashtable.put("from", b1.name());
        o.c("user.trackRemoteNotification", hashtable, null, 2);
    }

    public void a(List list, a a1, b b1)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("messageIds", new Vector(list));
        hashtable.put("action", a1.name());
        hashtable.put("from", b1.name());
        o.c("user.trackRemoteNotification", hashtable, null, 2);
    }

    public void a(Vector vector, boolean flag, String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        if (vector != null && !vector.isEmpty())
        {
            Hashtable hashtable = new Hashtable();
            hashtable.put("adTrackingTokens", vector);
            hashtable.put("stationId", s1);
            o.d("ad.registerAd", hashtable, null, 2);
        }
    }

    protected void a(JSONObject jsonobject, boolean flag)
        throws JSONException
    {
        if (!e) goto _L2; else goto _L1
_L1:
        p.df.a.a("PublicApi", "Skipping updateActiveValueExchangeRewards for tablets");
_L4:
        return;
_L2:
        aj aj1 = i.k().J();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (aj1 != null)
        {
            i.a(new bq(aj1));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        jsonobject = a(jsonobject, i.k().K(), "updateActiveValueExchangeRewards");
        i.k().a(jsonobject);
        if (jsonobject != null)
        {
            i.a(new bq(jsonobject));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void a(p.cx.l l1)
    {
        if (l1 != null)
        {
            s.add(l1);
        }
    }

    public void a(p.dj.b.a a1, String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("id", Integer.valueOf(a1.j));
        hashtable.put("library", s1);
        hashtable.put("libraryType", "googleMediaStore");
        hashtable.put("vendorId", n.c().a());
        o.e("test.experimentResults", hashtable, null, 0);
    }

    public void a(boolean flag)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        String s1 = i.k().r();
        Object obj;
        if (!flag && !com.pandora.radio.util.i.a(s1))
        {
            obj = new JSONObject(s1);
        } else
        {
            obj = new Hashtable();
            ((Hashtable) (obj)).put("username", x.b());
            ((Hashtable) (obj)).put("password", x.c());
            ((Hashtable) (obj)).put("version", "5");
            ((Hashtable) (obj)).put("deviceModel", m.c());
            ((Hashtable) (obj)).put("includeUrls", Boolean.TRUE);
            ((Hashtable) (obj)).put("returnDeviceType", Boolean.TRUE);
            ((Hashtable) (obj)).put("returnUpdatePromptVersions", Boolean.TRUE);
            obj = o.b("auth.partnerLogin", ((Hashtable) (obj)), null, 0);
            l.d(((JSONObject) (obj)).toString());
        }
        if (((JSONObject) (obj)).has("deviceProperties"))
        {
            c(((JSONObject) (obj)).getJSONObject("deviceProperties"));
        }
        if (((JSONObject) (obj)).has("updatePromptVersions"))
        {
            JSONObject jsonobject = new JSONObject(((JSONObject) (obj)).getString("updatePromptVersions"));
            i.a(new bl(jsonobject.getString("amazonAppStore"), jsonobject.getString("googleMarketplace")));
        } else
        {
            l.a(false);
            l.b(false);
        }
        n.a(new q(((JSONObject) (obj)).getString("partnerId"), ((JSONObject) (obj)).getString("partnerAuthToken"), ((JSONObject) (obj)).getInt("stationSkipLimit"), ((JSONObject) (obj)).getJSONObject("urls").getString("autoComplete"), ((JSONObject) (obj)).optString("deviceCategory"), ((JSONObject) (obj)).optString("deviceType")));
        try
        {
            d(((JSONObject) (obj)));
            return;
        }
        catch (Exception exception)
        {
            if (s1 != null)
            {
                l.c(null);
                l.d(null);
                l.e(null);
            }
            throw new p.cx.y(13, exception.getMessage(), ((JSONObject) (obj)), "auth.partnerLogin");
        }
    }

    public boolean a()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Object obj = new Hashtable();
        ((Hashtable) (obj)).put("includeExtraParams", Boolean.TRUE);
        obj = o.a("test.checkLicensing", ((Hashtable) (obj)), null, 0);
        i.a(new p.dd.l(((JSONObject) (obj)).getString("countryCode")));
        return ((JSONObject) (obj)).getBoolean("isAllowed");
    }

    public boolean a(String s1, String s2, String s3, String s4)
        throws p.cx.q, p.cx.y, JSONException, n
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("googleReceipt", s1);
        if (!com.pandora.radio.util.i.a(s4))
        {
            hashtable.put("googleFullReceipt", com.pandora.radio.util.i.c(s4));
        }
        hashtable.put("googleUserId", s2);
        hashtable.put("googleSku", s3);
        h(hashtable);
        s1 = o.c("user.purchaseGoogleSubscription", hashtable, null, 2);
        s2 = s1.getString("userAuthToken");
        if (!com.pandora.radio.util.i.a(s2) && g != null)
        {
            g.a(s2);
        }
        boolean flag = s1.getBoolean("isSubscriber");
        if (g != null)
        {
            g.b(flag);
        }
        return flag;
    }

    public v[] a(String s1, boolean flag, Hashtable hashtable)
        throws p.cx.q, n
    {
        HttpClient httpclient;
        if (hashtable != null)
        {
            v av[] = (v[])hashtable.get(s1);
            if (av != null)
            {
                return av;
            }
        }
        httpclient = o.b();
        Object obj = o.a(s1, httpclient, flag);
        if (obj == null)
        {
            httpclient.getConnectionManager().shutdown();
            return new v[0];
        }
        obj = a(((String) (obj)), '\n');
        if (((Vector) (obj)).size() == 0)
        {
            httpclient.getConnectionManager().shutdown();
            return new v[0];
        }
        v av1[] = c(((Vector) (obj)));
        if (hashtable == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        hashtable.put(s1, av1);
        httpclient.getConnectionManager().shutdown();
        return av1;
        s1;
        httpclient.getConnectionManager().shutdown();
        throw s1;
    }

    public PromotedStation b(Hashtable hashtable)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable1 = new Hashtable();
        hashtable1.put("includeStationArtUrl", Boolean.TRUE);
        hashtable1.put("includeAdAttributes", Boolean.TRUE);
        hashtable1.put("resultCount", Integer.valueOf(1));
        hashtable1.put("includeStationSeeds", Boolean.TRUE);
        hashtable1.put("includePlaylistAttributes", Boolean.TRUE);
        hashtable1.put("includeSkipAttributes", Boolean.TRUE);
        hashtable1.put("includeStationExpirationTime", Boolean.TRUE);
        hashtable1.put("includeStationDescription", Boolean.TRUE);
        hashtable1.put("includeAdvertiserAttributes", Boolean.TRUE);
        if (hashtable != null)
        {
            hashtable1.put("adTargetingParams", hashtable);
        }
        hashtable = o.d("station.getPromotedStations", hashtable1, null, 2).getJSONArray("stations");
        if (hashtable.length() > 0)
        {
            return new PromotedStation(hashtable.getJSONObject(0));
        } else
        {
            return new PromotedStation();
        }
    }

    public y b(String s1, String s2)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("seedId", s2);
        o.d("station.deleteMusic", hashtable, null, 2);
        return i.y().a(i.s(), s1, s2);
    }

    public y b(String s1, String s2, String s3)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("stationToken", s1);
        hashtable.put("stationName", s2);
        hashtable.put("stationDescription", s3);
        hashtable.put("includeStationArtUrl", Boolean.valueOf(true));
        hashtable.put("stationArtSize", "W130H130");
        hashtable.put("includeAdAttributes", Boolean.TRUE);
        hashtable.put("includeStationSeeds", Boolean.TRUE);
        hashtable.put("includeStationPersonalizationPercent", Boolean.TRUE);
        hashtable.put("includeExtendedAttributes", Boolean.TRUE);
        hashtable.put("includeAdvertiserAttributes", Boolean.TRUE);
        d(hashtable);
        s1 = new y(o.d("station.renameStation", hashtable, null, 2));
        i.y().a(s1);
        return s1;
    }

    public List b(Vector vector)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Object obj = null;
        Object obj1 = new Hashtable();
        ((Hashtable) (obj1)).put("supportedProductTypes", vector);
        ((Hashtable) (obj1)).put("userAuthToken", g.b());
        obj1 = o.d("user.getAvailableALaCarteProducts", ((Hashtable) (obj1)), null, 2);
        vector = obj;
        if (obj1 != null)
        {
            vector = obj;
            if (((JSONObject) (obj1)).has("aLaCarteAvailableProducts"))
            {
                vector = new ArrayList();
                JSONArray jsonarray = ((JSONObject) (obj1)).getJSONArray("aLaCarteAvailableProducts");
                int i1 = 0;
                while (i1 < jsonarray.length()) 
                {
                    try
                    {
                        vector.add(new p.dc.c(jsonarray.getJSONObject(i1)));
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        p.df.a.b("PublicApi", "Error occur while parsing product", illegalargumentexception);
                    }
                    i1++;
                }
            }
        }
        return vector;
    }

    public void b(String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("username", s1);
        o.c("user.emailPassword", hashtable, null, 1);
    }

    public void b(String s1, String s2, String s3, Long long1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        s1 = new Hashtable();
        if (s3 == null)
        {
            s3 = "";
        }
        s1.put("facebookAccessToken", s3);
        s1.put("facebookAccessTokenExpires", long1.toString());
        f(o.c("user.facebookAuthFailed", s1, null, 2));
    }

    public void b(boolean flag)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        boolean flag1 = true;
        a(flag);
        Object obj = l.q();
        if (!flag && !com.pandora.radio.util.i.a(((String) (obj))) && !m.a())
        {
            obj = new JSONObject(((String) (obj)));
            flag = flag1;
        } else
        {
            obj = new Hashtable();
            ((Hashtable) (obj)).put("loginType", "deviceId");
            ((Hashtable) (obj)).put("deviceId", m.e());
            c(((Hashtable) (obj)));
            obj = o.c("auth.userLogin", ((Hashtable) (obj)), null, 1);
            l.c(((JSONObject) (obj)).toString());
            flag = false;
        }
        try
        {
            a(((JSONObject) (obj)), flag, false, -1, ((String) (null)), ((String) (null)));
            return;
        }
        catch (JSONException jsonexception)
        {
            l.c(null);
            throw jsonexception;
        }
    }

    public boolean b()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Object obj = new Hashtable();
        ((Hashtable) (obj)).put("username", x.b());
        ((Hashtable) (obj)).put("password", x.c());
        ((Hashtable) (obj)).put("version", "5");
        obj = o.b("auth.partnerAdminLogin", ((Hashtable) (obj)), null, 0);
        n.a(new q(((JSONObject) (obj)).getString("partnerId"), ((JSONObject) (obj)).getString("partnerAdminAuthToken")));
        try
        {
            d(((JSONObject) (obj)));
        }
        catch (NumberFormatException numberformatexception)
        {
            p.df.a.f("PublicApi", "error parsing st", numberformatexception);
            return false;
        }
        return true;
    }

    public boolean b(String s1, String s2, String s3, String s4)
        throws p.cx.q, p.cx.y, JSONException, n
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("googleReceipt", s1);
        if (!com.pandora.radio.util.i.a(s4))
        {
            hashtable.put("googleFullReceipt", com.pandora.radio.util.i.c(s4));
        }
        hashtable.put("googleUserId", s2);
        hashtable.put("googleSku", s3);
        h(hashtable);
        s1 = o.c("user.purchaseGooglePayToPlay", hashtable, null, 2);
        s2 = s1.getString("userAuthToken");
        if (!com.pandora.radio.util.i.a(s2) && g != null)
        {
            g.a(s2);
        }
        return s1.getBoolean("isMonthlyPayer");
    }

    public JSONObject c(boolean flag)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashtable.put("isExplicitContentFilterEnabled", Boolean.valueOf(flag));
        return o.d("user.setExplicitContentFilter", hashtable, null, 2);
    }

    public void c()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("partnerAdminAuthToken", h.b());
        hashtable.put("deviceModel", m.c());
        hashtable.put("description", Build.MODEL);
        o.c("device.createDevice", hashtable, null, 3);
    }

    public void c(String s1)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("stationToken", s1);
        o.d("station.deleteStation", hashtable, null, 2);
        i.y().a(s1);
        i.x().c();
        if (i.y().a() == 1)
        {
            i();
        }
    }

    public void c(String s1, String s2)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("stationId", s1);
        hashtable.put("comment", s2);
        o.d("station.publishStationShare", hashtable, null, 2);
    }

    public boolean c(String s1, String s2, String s3)
        throws p.cx.q, p.cx.y, JSONException, n
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("amazonReceipt", s1);
        hashtable.put("amazonUserId", s2);
        hashtable.put("amazonSku", s3);
        h(hashtable);
        s1 = o.c("user.purchaseAmazonSubscription", hashtable, null, 2);
        s2 = s1.getString("userAuthToken");
        if (!com.pandora.radio.util.i.a(s2) && g != null)
        {
            g.a(s2);
        }
        boolean flag = s1.getBoolean("isSubscriber");
        if (g != null)
        {
            g.b(flag);
        }
        return flag;
    }

    public void d()
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        b(true);
    }

    public void d(String s1)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("musicToken", s1);
        o.d("music.dismissSearchRecommendation", hashtable, null, 2);
    }

    public void d(String s1, String s2)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        if (!com.pandora.radio.util.i.a(s1))
        {
            hashtable.put("trackToken", s1);
        }
        hashtable.put("comment", s2);
        o.d("music.publishSongShare", hashtable, null, 2);
    }

    public void d(boolean flag)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("makeProfilePrivate", Boolean.valueOf(flag));
        o.d("user.setAwareOfProfile", hashtable, null, 2);
    }

    public boolean d(String s1, String s2, String s3)
        throws p.cx.q, p.cx.y, JSONException, n
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("amazonReceipt", s1);
        hashtable.put("amazonUserId", s2);
        hashtable.put("amazonSku", s3);
        h(hashtable);
        s1 = o.c("user.purchaseAmazonPayToPlay", hashtable, null, 2);
        s2 = s1.getString("userAuthToken");
        if (!com.pandora.radio.util.i.a(s2) && g != null)
        {
            g.a(s2);
        }
        return s1.getBoolean("isMonthlyPayer");
    }

    public ai e()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("includeFacebook", Boolean.TRUE);
        hashtable.put("includeExtraParams", Boolean.TRUE);
        hashtable.put("deviceId", m.e());
        return new ai(o.c("user.getSettings", hashtable, null, 2));
    }

    public y e(String s1, String s2)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        Object obj = new Hashtable();
        ((Hashtable) (obj)).put("feedbackId", s2);
        s2 = o.d("station.deleteFeedback", ((Hashtable) (obj)), null, 2);
        obj = a(s1, true);
        s1 = i.y().a(i.s(), s1);
        if (s1 != null)
        {
            ((y) (obj)).a(s1.b());
        }
        ((y) (obj)).b(s2);
        return ((y) (obj));
    }

    public List e(String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("userAuthToken", g.b());
        hashtable.put("stationId", s1);
        JSONArray jsonarray = o.d("music.getSeedSuggestions", hashtable, null, 2).getJSONArray("artists");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j1 = jsonarray.length();
        for (int i1 = 0; i1 < j1; i1++)
        {
            JSONObject jsonobject = jsonarray.getJSONObject(i1);
            String s2 = jsonobject.getString("score");
            s1 = s2;
            if (s2.isEmpty())
            {
                s1 = "0";
            }
            arraylist.add(new ArtistSearchData(jsonobject.getString("musicToken"), jsonobject.getString("artistName"), Integer.valueOf(s1).intValue()));
        }

        return arraylist;
    }

    public p.dc.e e(String s1, String s2, String s3)
        throws p.cx.q, p.cx.y, JSONException, n
    {
        Object obj = null;
        Hashtable hashtable = new Hashtable();
        hashtable.put("amazonReceipt", s2);
        hashtable.put("amazonUserId", s1);
        hashtable.put("amazonSku", s3);
        h(hashtable);
        s2 = o.c("user.purchaseAmazonALaCarteProduct", hashtable, null, 2);
        s3 = s2.getString("userAuthToken");
        s1 = obj;
        if (!com.pandora.radio.util.i.a(s3))
        {
            s1 = obj;
            if (g != null)
            {
                g.a(s3);
                s1 = new p.dc.e(s2);
            }
        }
        return s1;
    }

    public aa f(String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        if (!com.pandora.radio.util.i.a(s1))
        {
            hashtable.put("musicId", s1);
        }
        hashtable.put("includeExtraParams", Boolean.TRUE);
        return ab.a(9999L, o.d("music.getTrack", hashtable, null, 2));
    }

    public void f()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("deviceId", i.l().e());
        o.c("user.associateDevice", hashtable, null, 2);
    }

    public void f(String s1, String s2)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("trackToken", s1);
        s1 = s2;
        if (s2 == null)
        {
            s1 = "";
        }
        hashtable.put("facebookSettingChecksum", s1);
        if (o.d("track.trackStarted", hashtable, null, 2).optBoolean("updateFacebookInfo", false))
        {
            t();
            i.a(new bj());
        }
    }

    public void f(String s1, String s2, String s3)
        throws p.cx.y, JSONException, p.cx.q, n
    {
        Hashtable hashtable = new Hashtable();
        if (!com.pandora.radio.util.i.a(s3))
        {
            hashtable.put("musicId", s3);
        }
        a(hashtable, s1, s2);
    }

    public y g(String s1)
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        return a(s1, false);
    }

    public String g()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        return o.c("device.associateDeviceForCasting", hashtable, null, 2).getString("deviceId");
    }

    public void h()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("deviceId", i.l().e());
        o.c("device.disassociateDevice", hashtable, null, 1);
        if (i.l().f() != null)
        {
            hashtable.put("deviceId", i.l().f());
            o.c("device.disassociateCastingDevice", hashtable, null, 1);
        }
    }

    public void h(String s1)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("trackToken", s1);
        o.d("user.sleepSong", hashtable, null, 2);
    }

    public void i(String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("trackToken", s1);
        o.d("bookmark.addSongBookmark", hashtable, null, 2);
    }

    public boolean i()
        throws p.cx.q, p.cx.y, n, JSONException, RemoteException, OperationApplicationException
    {
        Object obj = i.x().b("STATION_LIST_CHECKSUM");
        if (!com.pandora.radio.util.i.a(((String) (obj)))) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L3:
        Exception exception;
        String s1;
        boolean flag1;
        if (flag)
        {
            obj = j();
            if (obj != null)
            {
                a(((JSONObject) (obj)));
            }
            return true;
        } else
        {
            p.df.a.c("PublicApi", "Station list is up-to-date");
            return false;
        }
_L2:
        s1 = m();
        if (!i.y().d())
        {
            break MISSING_BLOCK_LABEL_74;
        }
        flag1 = s1.equals(obj);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = true;
          goto _L3
        flag = false;
          goto _L3
        exception;
        flag = true;
          goto _L3
    }

    public JSONObject j()
        throws n, p.cx.q, p.cx.y, JSONException, RemoteException, OperationApplicationException
    {
        Object obj = new Hashtable();
        ((Hashtable) (obj)).put("includeStationArtUrl", Boolean.TRUE);
        ((Hashtable) (obj)).put("stationArtSize", "W130H130");
        ((Hashtable) (obj)).put("includeAdAttributes", Boolean.TRUE);
        ((Hashtable) (obj)).put("includeStationSeeds", Boolean.TRUE);
        ((Hashtable) (obj)).put("includeShuffleInsteadOfQuickMix", Boolean.TRUE);
        ((Hashtable) (obj)).put("includeRecommendations", Boolean.TRUE);
        ((Hashtable) (obj)).put("includeExplanations", Boolean.TRUE);
        ((Hashtable) (obj)).put("shuffleIconVersion", Integer.valueOf(com.pandora.radio.util.i.a(e)));
        ((Hashtable) (obj)).put("includeExtraParams", Boolean.TRUE);
        d(((Hashtable) (obj)));
        obj = o.d("user.getStationList", ((Hashtable) (obj)), null, 2);
        a(((JSONObject) (obj)).optJSONArray("stations"), ((JSONObject) (obj)).optString("checksum"));
        return ((JSONObject) (obj)).optJSONObject("recommendations");
    }

    public void j(String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("trackToken", s1);
        o.d("bookmark.addArtistBookmark", hashtable, null, 2);
    }

    public StationRecommendations k()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("includeStationArtUrl", Boolean.TRUE);
        hashtable.put("stationArtSize", "W130H130");
        hashtable.put("includeExplanations", Boolean.TRUE);
        hashtable.put("includeExtras", Boolean.TRUE);
        return new StationRecommendations(i, o.d("music.getSearchRecommendations", hashtable, null, 2));
    }

    public String k(String s1)
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Object obj = new Hashtable();
        ((Hashtable) (obj)).put("trackToken", s1);
        s1 = o.d("track.explainTrack", ((Hashtable) (obj)), null, 2).getJSONArray("explanations");
        if (s1.length() == 0)
        {
            return null;
        }
        obj = new StringBuffer();
        int i1 = 0;
        while (i1 < s1.length()) 
        {
            String s2 = s1.getJSONObject(i1).getString("focusTraitName");
            if (i1 == s1.length() - 1)
            {
                ((StringBuffer) (obj)).append(" and ").append(s2).append(".");
            } else
            if (i1 == 0)
            {
                ((StringBuffer) (obj)).append(" ").append(s2);
            } else
            {
                ((StringBuffer) (obj)).append(", ").append(s2);
            }
            i1++;
        }
        return ((StringBuffer) (obj)).toString();
    }

    public ae l()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("userAuthToken", g.b());
        h(hashtable);
        return new ae(o.d("user.getUsageInfo", hashtable, null, 2));
    }

    public JSONObject l(String s1)
        throws p.cx.q, p.cx.y, JSONException, n
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("iapVendor", s1);
        return o.c("user.canSubscribe", hashtable, null, 2);
    }

    public String m()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        d(hashtable);
        return o.d("user.getStationListChecksum", hashtable, null, 2).getString("checksum");
    }

    public p.dc.d m(String s1)
        throws p.cx.q, p.cx.y, JSONException, n
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("sku", s1);
        hashtable.put("userAuthToken", g.b());
        h(hashtable);
        s1 = o.c("user.canPurchaseALaCarteProduct", hashtable, null, 2);
        return new p.dc.d(s1.getBoolean("canPurchase"), s1.optString("reason"));
    }

    public void n()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        String s1 = i.x().b("GENRE_STATION_LIST_CHECKSUM");
        if (v().equals(s1))
        {
            p.df.a.c("PublicApi", "Genre station list is up-to-date");
        } else
        {
            Object obj = new Hashtable();
            ((Hashtable) (obj)).put("includeChecksum", Boolean.valueOf(true));
            ((Hashtable) (obj)).put("includeStationArtUrl", Boolean.valueOf(true));
            ((Hashtable) (obj)).put("stationArtSize", "W130H130");
            ((Hashtable) (obj)).put("includeGenreCategoryAdUrl", Boolean.valueOf(true));
            obj = o.d("station.getGenreStations", ((Hashtable) (obj)), null, 2);
            if (obj != null)
            {
                i(((JSONObject) (obj)));
                return;
            }
        }
    }

    public void n(String s1)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("deviceId", m.e());
        hashtable.put("remoteToken", s1);
        hashtable.put("timezone", TimeZone.getDefault().getDisplayName(false, 0));
        o.c("user.updateRemoteNotificationToken", hashtable, null, 2);
    }

    public void o(String s1)
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("googleNowAuthCode", s1);
        o.c("user.setAuthCodeForGoogleNow", hashtable, null, 2);
    }

    public boolean o()
        throws n, p.cx.q, p.cx.y, JSONException
    {
        Hashtable hashtable = new Hashtable();
        return o.d("user.isValidRefreshTokenAvailable", hashtable, null, 2).getBoolean("isValidRefreshTokenAvailable");
    }

    public void onPartnerData(p.dd.ae ae1)
    {
        h = ae1.a;
    }

    public void onSignInState(an an1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.cx._cls1.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            d = false;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onUserData(bo bo1)
    {
        g = bo1.a;
    }

    public com.pandora.radio.data.x p(String s1)
        throws p.cx.q, n, JSONException, p.cx.y
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("complimentarySponsor", s1);
        return new com.pandora.radio.data.x(o.d("user.startComplimentaryTrial", hashtable, null, 2).optString("prerollVideoUrl"), s1);
    }

    public void p()
    {
        r = new az(false, false);
    }

    public az produceSubscriptionExpiredEvent()
    {
        return r;
    }

    public String q(String s1)
        throws p.cx.q, n, JSONException, p.cx.y
    {
        return o.a(s1, p.cx.t.a.b);
    }

    public void q()
        throws p.cx.q, n, JSONException, p.cx.y, RemoteException, OperationApplicationException
    {
        Object obj = new Hashtable();
        ((Hashtable) (obj)).put("returnHasUsedTrial", Boolean.TRUE);
        ((Hashtable) (obj)).put("xplatformAdCapable", Boolean.TRUE);
        c(((Hashtable) (obj)));
        obj = o.d("user.acknowledgeSubscriptionExpiration", ((Hashtable) (obj)), null, 2);
        o(((JSONObject) (obj)));
        l.c(((JSONObject) (obj)).toString());
    }

    public Hashtable r()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        if (g == null)
        {
            return hashtable;
        }
        Object obj = o.d("accessory.accessoryConnect", new Hashtable(), null, 2).optString("accessoryProperties");
        if (!com.pandora.radio.util.i.a(((String) (obj))))
        {
            obj = new JSONObject(((String) (obj)));
            String s1;
            for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext(); hashtable.put(s1, ((JSONObject) (obj)).get(s1)))
            {
                s1 = (String)iterator.next();
            }

        }
        return hashtable;
    }

    public void s()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        o.d("user.disconnectFacebook", hashtable, null, 2);
    }

    public void t()
        throws p.cx.q, p.cx.y, n, JSONException
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("includeFacebook", Boolean.TRUE);
        f(o.c("user.getFacebookInfo", hashtable, null, 2));
        l.c(null);
    }

    protected ArrayList u()
    {
        return s;
    }

}
