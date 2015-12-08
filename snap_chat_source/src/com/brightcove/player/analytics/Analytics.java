// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.telephony.TelephonyManager;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.media.HttpService;
import com.brightcove.player.model.Video;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class Analytics extends AbstractComponent
{
    public static class Fields
    {

        public static final String BASE_PARAMS = "baseParams";

        public Fields()
        {
        }
    }

    final class a extends AsyncTask
    {

        private HttpService a;
        private Analytics b;

        private transient Void a(Map amap[])
        {
            Object obj = amap[0];
            amap = new HashMap();
            java.util.Map.Entry entry;
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); amap.put(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            }

            try
            {
                amap = HttpService.buildURIWithQueryParameters("https://metrics.brightcove.com/v2/tracker", amap);
                a.doGetRequest(amap);
            }
            // Misplaced declaration of an exception variable
            catch (Map amap[])
            {
                Analytics.A(b).emit("error", Collections.singletonMap("error", amap));
            }
            // Misplaced declaration of an exception variable
            catch (Map amap[])
            {
                Analytics.B(b).emit("error", Collections.singletonMap("error", amap));
            }
            // Misplaced declaration of an exception variable
            catch (Map amap[])
            {
                Analytics.C(b).emit("error", Collections.singletonMap("error", amap));
            }
            // Misplaced declaration of an exception variable
            catch (Map amap[])
            {
                Analytics.D(b).emit("error", Collections.singletonMap("error", amap));
            }
            return null;
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a((Map[])aobj);
        }

        public a()
        {
            b = Analytics.this;
            super();
            a = new HttpService(60000, 60000);
        }
    }


    public static final String TAG = com/brightcove/player/analytics/Analytics.getSimpleName();
    private static String g;
    private long A;
    private long B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private Event M;
    private final Map a;
    private int b;
    private int c;
    private int d;
    public String destination;
    private boolean e;
    private String f;
    private String h;
    private String i;
    private String j;
    private String k;
    private boolean l;
    private Context m;
    private Handler n;
    private Runnable o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private String v;
    private int w;
    private String x;
    private int y;
    private int z;

    public Analytics(EventEmitter eventemitter, Context context)
    {
        this(eventemitter, context, com/brightcove/player/analytics/Analytics);
    }

    private Analytics(EventEmitter eventemitter, Context context, Class class1)
    {
        super(eventemitter, class1);
        a = new HashMap();
        j = "android-native-sdk";
        H = false;
        I = false;
        J = false;
        K = false;
        L = false;
        m = context;
        d = 0;
        c = 0;
        e = false;
        r = 0L;
        q = 0L;
        p = 0L;
        u = 0L;
        s = 0L;
        t = 0L;
        x = "";
        v = "";
        E = 0;
        w = 0;
        z = 0;
        y = 0;
        C = 0;
        B = 0L;
        A = 0L;
        F = 0;
        G = 0;
        D = 0;
        if (context != null)
        {
            eventemitter = context.getApplicationContext();
            if (eventemitter != null)
            {
                eventemitter = eventemitter.getPackageManager();
                if (eventemitter != null)
                {
                    try
                    {
                        eventemitter = (String)eventemitter.getApplicationLabel(eventemitter.getApplicationInfo(context.getPackageName(), 0));
                        setDestination((new StringBuilder("bcsdk://")).append(eventemitter).append("/").append(context.getClass().getPackage().getName()).toString());
                    }
                    // Misplaced declaration of an exception variable
                    catch (EventEmitter eventemitter) { }
                }
            }
        }
        eventEmitter.on("addAnalyticsBaseParams", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                event = (Map)event.properties.get("baseParams");
                if (event != null)
                {
                    Analytics.a(a).putAll(event);
                }
                Analytics.b(a);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("setAnalyticsBaseParams", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                event = (Map)event.properties.get("baseParams");
                if (event != null)
                {
                    Analytics.a(a).clear();
                    Analytics.a(a).putAll(event);
                }
                Analytics.b(a);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("play", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                if (!Analytics.c(a))
                {
                    Analytics.a(a, System.currentTimeMillis());
                    Analytics.a(a, event, "play_request", null);
                }
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("didPlay", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                if (Analytics.d(a))
                {
                    Analytics.e(a);
                    Analytics.a(a, false);
                }
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("didPause", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                if (!Analytics.f(a))
                {
                    Analytics.g(a);
                    Analytics.a(a, event, Analytics.h(a), Analytics.i(a));
                    Analytics.a(a, Analytics.i(a));
                    Analytics.a(a, true);
                }
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("didSetVideo", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.b(a, System.currentTimeMillis());
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("analyticsCatalogRequest", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                URI uri = (URI)event.properties.get("catalogUrl");
                HashMap hashmap = new HashMap();
                hashmap.put("catalog_url", uri.toString());
                Analytics.a(a, event, "catalog_request", hashmap);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("analyticsCatalogResponse", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                URI uri = (URI)event.properties.get("catalogUrl");
                long l1 = ((Long)event.properties.get("responseTimeMs")).longValue();
                HashMap hashmap = new HashMap();
                hashmap.put("catalog_url", uri.toString());
                hashmap.put("response_time_ms", Long.toString(l1));
                Analytics.a(a, event, "catalog_response", hashmap);
                Analytics.c(a, System.currentTimeMillis());
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("willChangeVideo", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Video video = (Video)event.properties.get("currentVideo");
                if (video != null && Analytics.i(a) - Analytics.h(a) > 0)
                {
                    event.properties.put("video", video);
                    Analytics.a(a, event, Analytics.h(a), Analytics.i(a));
                }
                video = (Video)event.properties.get("nextVideo");
                if (video != null)
                {
                    event.properties.put("video", video);
                    Analytics.a(a, event, "video_impression", null);
                    event.properties.remove("video");
                }
                Analytics.b(a, Analytics.a(a, Analytics.c(a, 0)));
                Analytics.b(a, false);
                Analytics.c(a, false);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("didSeekTo", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                int i1 = event.getIntegerProperty("seekPosition");
                if (i1 <= 0 || i1 - Analytics.i(a) <= 1000)
                {
                    return;
                } else
                {
                    Analytics.a(a, event, Analytics.h(a), Analytics.i(a));
                    Analytics.a(a, Analytics.c(a, i1));
                    event = a;
                    Analytics analytics = a;
                    Analytics.k(a);
                    Analytics.d(event, Analytics.j(analytics));
                    return;
                }
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("progress", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Video video = (Video)event.properties.get("video");
                int i1 = event.getIntegerProperty("playheadPosition");
                Analytics.b(a, event.getIntegerProperty("duration"));
                if (event.properties.containsKey("forwardBufferSeconds"))
                {
                    Analytics.d(a, event.getIntegerProperty("forwardBufferSeconds"));
                }
                if (i1 >= 0)
                {
                    if (Math.abs(Analytics.i(a) - i1) > 5000)
                    {
                        Analytics.a(a, Analytics.c(a, i1));
                    } else
                    {
                        Analytics.a(a, event);
                        if (Analytics.i(a) - Analytics.h(a) >= 10000)
                        {
                            Analytics.a(a, Analytics.i(a));
                        }
                        Analytics.c(a, i1);
                        if (!Analytics.c(a) && video != null && Analytics.i(a) != 0)
                        {
                            Analytics.e(a, System.currentTimeMillis());
                            long l1 = Analytics.l(a);
                            long l2 = Analytics.m(a);
                            long l3 = Analytics.n(a);
                            long l4 = Analytics.o(a);
                            long l5 = Analytics.p(a);
                            long l6 = Analytics.q(a);
                            Analytics.a(a, event, l1 - l2, l3 - l4 - (l5 - l6));
                            Analytics.e(a);
                            Analytics.b(a, true);
                            return;
                        }
                    }
                }
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("completed", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                int i1 = event.getIntegerProperty("playheadPosition");
                if (i1 >= 0)
                {
                    Analytics.c(a, i1);
                    Analytics.a(a, event, Analytics.h(a), Analytics.i(a));
                    Analytics.a(a, Analytics.i(a));
                    Analytics.a(a, event, "video_complete", null);
                    Analytics.g(a);
                    Analytics.c(a, true);
                }
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("videoDurationChanged", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                int i1 = ((Integer)event.properties.get("duration")).intValue();
                if (i1 > 0)
                {
                    Analytics.b(a, i1);
                }
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("willInterruptContent", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.f(a, System.currentTimeMillis());
                Analytics.a(a, event, "ad_start", null);
                Analytics.g(a);
                Analytics.a(a, event, Analytics.h(a), Analytics.i(a));
                Analytics.d(a, true);
                Analytics.a(a, Analytics.i(a));
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("willResumeContent", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.g(a, System.currentTimeMillis());
                Analytics.a(a, event, "ad_end", null);
                Analytics.e(a);
                Analytics.d(a, false);
                if (Analytics.r(a))
                {
                    Analytics.g(a);
                    Analytics.c(a, false);
                }
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("version", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.a(a, (String)event.properties.get("buildVersion"));
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("analyticsVideoEngagement", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                if (event.properties.containsKey("renditionUrl"))
                {
                    Analytics.b(a, (String)event.properties.get("renditionUrl"));
                }
                if (event.properties.containsKey("renditionIndicatedBps"))
                {
                    Analytics.e(a, event.getIntegerProperty("renditionIndicatedBps"));
                }
                if (event.properties.containsKey("renditionMimeType"))
                {
                    Analytics.c(a, (String)event.properties.get("renditionMimeType"));
                }
                if (event.properties.containsKey("renditionHeight"))
                {
                    Analytics.f(a, event.getIntegerProperty("renditionHeight"));
                }
                if (event.properties.containsKey("renditionWidth"))
                {
                    Analytics.g(a, event.getIntegerProperty("renditionWidth"));
                }
                if (event.properties.containsKey("forwardBufferSeconds"))
                {
                    Analytics.d(a, event.getIntegerProperty("forwardBufferSeconds"));
                }
                if (event.properties.containsKey("measuredBps"))
                {
                    Analytics.h(a, event.getIntegerProperty("measuredBps"));
                }
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("bufferingStarted", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.s(a);
                Analytics.d(a, System.currentTimeMillis());
                Analytics.e(a, true);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("bufferingCompleted", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.h(a, System.currentTimeMillis() - Analytics.t(a));
                if (Analytics.u(a) < 1000L && Analytics.v(a) > 0)
                {
                    Analytics.w(a);
                }
                Analytics.e(a, false);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("account", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.d(a, (String)event.properties.get("value"));
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("videoSizeKnown", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.i(a, event.getIntegerProperty("width"));
                Analytics.j(a, event.getIntegerProperty("height"));
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("activityStopped", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.g(a);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("activityStarted", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.e(a);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("fragmentStopped", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.g(a);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("fragmentStarted", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                Analytics.e(a);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        eventEmitter.on("error", new EventListener() {

            private Analytics a;

            public final void processEvent(Event event)
            {
                String s1 = (String)event.properties.get("errorCode");
                String s2 = (String)event.properties.get("errorMessage");
                Analytics.a(a, event, s1, s2);
            }

            
            {
                a = Analytics.this;
                super();
            }
        });
        f = a(context);
        if (g == null)
        {
            g = UUID.randomUUID().toString();
        }
    }

    static EventEmitter A(Analytics analytics)
    {
        return analytics.eventEmitter;
    }

    static EventEmitter B(Analytics analytics)
    {
        return analytics.eventEmitter;
    }

    static EventEmitter C(Analytics analytics)
    {
        return analytics.eventEmitter;
    }

    static EventEmitter D(Analytics analytics)
    {
        return analytics.eventEmitter;
    }

    static int a(Analytics analytics, int i1)
    {
        analytics.c = i1;
        return i1;
    }

    static long a(Analytics analytics, long l1)
    {
        analytics.q = l1;
        return l1;
    }

    static Event a(Analytics analytics, Event event)
    {
        analytics.M = event;
        return event;
    }

    private static String a(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (((TelephonyManager)context.getSystemService("phone")).getPhoneType() != 0)
        {
            return "mobile";
        }
        break MISSING_BLOCK_LABEL_34;
        context;
        return "tablet";
        context;
        return "tablet";
        return "tablet";
    }

    static String a(Analytics analytics, String s1)
    {
        analytics.k = s1;
        return s1;
    }

    static Map a(Analytics analytics)
    {
        return analytics.a;
    }

    static void a(Analytics analytics, Event event, int i1, int j1)
    {
        int k1 = i1;
        if (i1 != 0)
        {
            k1 = (int)Math.ceil((double)i1 / 1000D);
        }
        i1 = (int)Math.floor((double)j1 / 1000D);
        if (i1 < k1 || i1 == 0)
        {
            return;
        }
        j1 = analytics.C;
        HashMap hashmap;
        long l1;
        if (analytics.K)
        {
            l1 = (System.currentTimeMillis() - analytics.A) / 1000L;
        } else
        {
            l1 = analytics.B / 1000L;
        }
        hashmap = new HashMap();
        if (l1 < 10L)
        {
            if (analytics.b > 0)
            {
                hashmap.put("range", String.format("%d..%d", new Object[] {
                    Integer.valueOf(k1), Integer.valueOf(i1)
                }));
            } else
            {
                hashmap.put("video_seconds_viewed", String.format("%d", new Object[] {
                    Integer.valueOf(i1 - k1)
                }));
            }
        }
        hashmap.put("rendition_url", analytics.v);
        hashmap.put("rendition_indicated_bps", Integer.toString(analytics.w));
        hashmap.put("rendition_mime_type", analytics.x);
        hashmap.put("rendition_height", Integer.toString(analytics.y));
        hashmap.put("rendition_width", Integer.toString(analytics.z));
        hashmap.put("rebuffering_seconds", Long.toString(l1));
        hashmap.put("rebuffering_count", Integer.toString(j1));
        hashmap.put("forward_buffer_seconds", Integer.toString(analytics.D));
        hashmap.put("measured_bps", Integer.toString(analytics.E));
        hashmap.put("player_width", Integer.toString(analytics.F));
        hashmap.put("player_height", Integer.toString(analytics.G));
        analytics.a(event, "video_engagement", ((Map) (hashmap)));
        analytics.c = analytics.d;
    }

    static void a(Analytics analytics, Event event, long l1, long l2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("load_time_ms", String.format("%d", new Object[] {
            Long.valueOf(l1)
        }));
        hashmap.put("start_time_ms", String.format("%d", new Object[] {
            Long.valueOf(l2)
        }));
        analytics.a(event, "video_view", ((Map) (hashmap)));
    }

    static void a(Analytics analytics, Event event, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        if (s1 != null && !s1.isEmpty())
        {
            hashmap.put("error_code", s1);
        }
        if (s2 != null && !s2.isEmpty())
        {
            hashmap.put("error_description", s2);
        }
        analytics.a(event, "error", ((Map) (hashmap)));
    }

    static void a(Analytics analytics, Event event, String s1, Map map)
    {
        analytics.a(event, s1, map);
    }

    private void a(Event event, String s1, Map map)
    {
label0:
        {
            Object obj = map;
            if (map == null)
            {
                obj = new HashMap();
            }
            map = (Video)event.properties.get("video");
            if (map != null)
            {
                String s2 = map.getId();
                if (!s2.isEmpty())
                {
                    ((Map) (obj)).put("video", s2);
                }
                if (h == null)
                {
                    map = map.getStringProperty("pubId");
                    if (map != null && !map.isEmpty())
                    {
                        setAccount(map);
                    }
                }
            }
            if (h != null)
            {
                ((Map) (obj)).put("account", h);
                map = new HashMap();
                map.putAll(a);
                if (obj != null)
                {
                    map.putAll(((Map) (obj)));
                }
                event = (Video)event.properties.get("video");
                if (event != null && event.getId() != null)
                {
                    event = event.getStringProperty("name");
                    if (event != null && event.isEmpty())
                    {
                        map.put("video_name", event);
                    }
                }
                if (b > 0)
                {
                    map.put("video_duration", (new StringBuilder()).append(b / 1000).toString());
                }
                map.put("session", g);
                map.put("event", s1);
                map.put("domain", "videocloud");
                map.put("device_os", "android");
                map.put("device_type", f);
                map.put("device_os_version", android.os.Build.VERSION.RELEASE);
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    map.put("device_cpu", Build.SUPPORTED_ABIS[0]);
                } else
                {
                    map.put("device_cpu", Build.CPU_ABI);
                }
                map.put("time", (new StringBuilder()).append((new Date()).getTime()).toString());
                map.put("platform", j);
                map.put("platform_version", k);
                if (destination != null)
                {
                    map.put("destination", destination);
                }
                if (i != null)
                {
                    map.put("source", i);
                }
                if (l)
                {
                    map.put("user", android.provider.Settings.Secure.getString(m.getContentResolver(), "android_id"));
                }
                event = new a();
                s1 = new HashMap[1];
                s1[0] = map;
                if (android.os.Build.VERSION.SDK_INT < 14)
                {
                    break label0;
                }
                event.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, s1);
            }
            return;
        }
        event.execute(s1);
    }

    static boolean a(Analytics analytics, boolean flag)
    {
        analytics.H = flag;
        return flag;
    }

    static int b(Analytics analytics, int i1)
    {
        analytics.b = i1;
        return i1;
    }

    static long b(Analytics analytics, long l1)
    {
        analytics.r = l1;
        return l1;
    }

    static String b(Analytics analytics, String s1)
    {
        analytics.v = s1;
        return s1;
    }

    static void b(Analytics analytics)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("baseParams", analytics.a);
        analytics.eventEmitter.emit("didSetAnalyticsBaseParams", hashmap);
    }

    static boolean b(Analytics analytics, boolean flag)
    {
        analytics.e = flag;
        return flag;
    }

    static int c(Analytics analytics, int i1)
    {
        analytics.d = i1;
        return i1;
    }

    static long c(Analytics analytics, long l1)
    {
        analytics.u = l1;
        return l1;
    }

    static String c(Analytics analytics, String s1)
    {
        analytics.x = s1;
        return s1;
    }

    static boolean c(Analytics analytics)
    {
        return analytics.e;
    }

    static boolean c(Analytics analytics, boolean flag)
    {
        analytics.L = flag;
        return flag;
    }

    static int d(Analytics analytics, int i1)
    {
        analytics.D = i1;
        return i1;
    }

    static long d(Analytics analytics, long l1)
    {
        analytics.A = l1;
        return l1;
    }

    static String d(Analytics analytics, String s1)
    {
        analytics.h = s1;
        return s1;
    }

    static boolean d(Analytics analytics)
    {
        return analytics.H;
    }

    static boolean d(Analytics analytics, boolean flag)
    {
        analytics.I = flag;
        return flag;
    }

    static int e(Analytics analytics, int i1)
    {
        analytics.w = i1;
        return i1;
    }

    static long e(Analytics analytics, long l1)
    {
        analytics.p = l1;
        return l1;
    }

    static void e(Analytics analytics)
    {
        if (!analytics.J)
        {
            analytics.n = new Handler();
            analytics.o = analytics. new Runnable() {

                private Analytics a;

                public final void run()
                {
                    if (Analytics.x(a) != null)
                    {
                        Analytics.a(a, Analytics.x(a), Analytics.h(a), Analytics.i(a));
                        Analytics.k(a);
                        if (Analytics.y(a))
                        {
                            Analytics.d(a, System.currentTimeMillis());
                        } else
                        {
                            Analytics.d(a, 0L);
                        }
                        Analytics.j(a);
                    }
                    Analytics.z(a).postDelayed(this, 10000L);
                }

            
            {
                a = Analytics.this;
                super();
            }
            };
            analytics.n.postDelayed(analytics.o, 10000L);
            analytics.J = true;
        }
    }

    static boolean e(Analytics analytics, boolean flag)
    {
        analytics.K = flag;
        return flag;
    }

    static int f(Analytics analytics, int i1)
    {
        analytics.y = i1;
        return i1;
    }

    static long f(Analytics analytics, long l1)
    {
        analytics.t = l1;
        return l1;
    }

    static boolean f(Analytics analytics)
    {
        return analytics.I;
    }

    static int g(Analytics analytics, int i1)
    {
        analytics.z = i1;
        return i1;
    }

    static long g(Analytics analytics, long l1)
    {
        analytics.s = l1;
        return l1;
    }

    static void g(Analytics analytics)
    {
        if (analytics.n != null)
        {
            analytics.n.removeCallbacks(analytics.o);
            analytics.J = false;
        }
    }

    static int h(Analytics analytics)
    {
        return analytics.c;
    }

    static int h(Analytics analytics, int i1)
    {
        analytics.E = i1;
        return i1;
    }

    static long h(Analytics analytics, long l1)
    {
        l1 = analytics.B + l1;
        analytics.B = l1;
        return l1;
    }

    static int i(Analytics analytics)
    {
        return analytics.d;
    }

    static int i(Analytics analytics, int i1)
    {
        analytics.F = i1;
        return i1;
    }

    static int j(Analytics analytics, int i1)
    {
        analytics.G = i1;
        return i1;
    }

    static long j(Analytics analytics)
    {
        analytics.B = 0L;
        return 0L;
    }

    static int k(Analytics analytics)
    {
        analytics.C = 0;
        return 0;
    }

    static long l(Analytics analytics)
    {
        return analytics.r;
    }

    static long m(Analytics analytics)
    {
        return analytics.u;
    }

    static long n(Analytics analytics)
    {
        return analytics.p;
    }

    static long o(Analytics analytics)
    {
        return analytics.q;
    }

    static long p(Analytics analytics)
    {
        return analytics.s;
    }

    static long q(Analytics analytics)
    {
        return analytics.t;
    }

    static boolean r(Analytics analytics)
    {
        return analytics.L;
    }

    static int s(Analytics analytics)
    {
        int i1 = analytics.C;
        analytics.C = i1 + 1;
        return i1;
    }

    static long t(Analytics analytics)
    {
        return analytics.A;
    }

    static long u(Analytics analytics)
    {
        return analytics.B;
    }

    static int v(Analytics analytics)
    {
        return analytics.C;
    }

    static int w(Analytics analytics)
    {
        int i1 = analytics.C - 1;
        analytics.C = i1;
        return i1;
    }

    static Event x(Analytics analytics)
    {
        return analytics.M;
    }

    static boolean y(Analytics analytics)
    {
        return analytics.K;
    }

    static Handler z(Analytics analytics)
    {
        return analytics.n;
    }

    public String getAccount()
    {
        return h;
    }

    public boolean getUniqueIdentifierEnabled()
    {
        return l;
    }

    public void setAccount(String s1)
    {
        h = s1;
        HashMap hashmap = new HashMap();
        hashmap.put("value", s1);
        eventEmitter.emit("account", hashmap);
    }

    public void setDestination(String s1)
    {
        destination = s1;
        s1 = Uri.parse(s1);
        s1.getScheme();
        s1.getAuthority();
    }

    public void setSource(String s1)
    {
        i = s1;
        s1 = Uri.parse(s1);
        s1.getScheme();
        s1.getAuthority();
    }

    public void setUniqueIdentifierEnabled(boolean flag)
    {
        l = flag;
    }

}
