// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.AdState;
import com.spotify.mobile.android.spotlets.ads.model.ExternalAccessoryData;
import com.spotify.mobile.android.spotlets.ads.model.State;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import dmx;
import dmz;
import eds;
import fos;
import gng;
import gni;
import java.util.HashMap;
import java.util.Map;

public class AdEventReporter
    implements dmx
{

    private final gng a;
    private Resolver b;
    private HandlerThread c;
    private Handler d;
    private int e;
    private final Object f = new Object();
    private final Context g;

    public AdEventReporter(Context context, gni gni1)
    {
        e = 0;
        g = context.getApplicationContext();
        a = gni1.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    static Context a(AdEventReporter adeventreporter)
    {
        return adeventreporter.g;
    }

    private void a(Request request, eds eds, String s)
    {
        synchronized (f)
        {
            e = e + 1;
        }
        String s1 = request.getUri();
        obj = new StringBuilder();
        if (s1 != null)
        {
            String as[] = s1.split("/");
            ((StringBuilder) (obj)).append(as[as.length - 1]);
        }
        obj = ((StringBuilder) (obj)).toString();
        request.getAction();
        if (b == null)
        {
            b = Cosmos.getResolver(g);
        }
        b.resolve(request, new com.spotify.cosmos.android.Resolver.CallbackReceiver(g(), request, ((String) (obj)), s, eds) {

            private Request a;
            private String b;
            private String c;
            private eds d;
            private AdEventReporter e;

            protected final void onError(Throwable throwable)
            {
                Logger.c("failed to resolve %s %s %s", new Object[] {
                    a.getAction(), b, c
                });
                if (d != null)
                {
                    d.a(throwable);
                }
                synchronized (AdEventReporter.b(e))
                {
                    if (AdEventReporter.c(e) == 0)
                    {
                        AdEventReporter.d(e);
                    }
                }
                return;
                exception;
                throwable;
                JVM INSTR monitorexit ;
                throw exception;
            }

            protected final void onResolved(Response response)
            {
                Logger.a("resolved %s %s %s", new Object[] {
                    a.getAction(), b, c
                });
                if (d != null)
                {
                    d.a(response);
                }
                synchronized (AdEventReporter.b(e))
                {
                    if (AdEventReporter.c(e) == 0)
                    {
                        AdEventReporter.d(e);
                    }
                }
                return;
                exception;
                response;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                e = AdEventReporter.this;
                a = request;
                b = s;
                c = s1;
                d = eds1;
                super(handler);
            }
        });
        return;
        request;
        obj;
        JVM INSTR monitorexit ;
        throw request;
    }

    static void a(AdEventReporter adeventreporter, Request request, String s)
    {
        adeventreporter.a(request, ((eds) (null)), s);
    }

    static Object b(AdEventReporter adeventreporter)
    {
        return adeventreporter.f;
    }

    static int c(AdEventReporter adeventreporter)
    {
        int i = adeventreporter.e - 1;
        adeventreporter.e = i;
        return i;
    }

    static void d(AdEventReporter adeventreporter)
    {
        adeventreporter.f();
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.destroy();
            b = null;
        }
        if (c != null)
        {
            c.quit();
            d = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private Handler g()
    {
        this;
        JVM INSTR monitorenter ;
        Handler handler;
        if (d == null)
        {
            c = new HandlerThread("background");
            c.start();
            d = new Handler(c.getLooper());
        }
        handler = d;
        this;
        JVM INSTR monitorexit ;
        return handler;
        Exception exception;
        exception;
        throw exception;
    }

    protected final Request a(String s, String s1, Map map)
    {
        byte abyte1[] = Request.EMPTY_BODY;
        byte abyte0[] = abyte1;
        if (map != null)
        {
            try
            {
                abyte0 = a.a().writeValueAsBytes(map);
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                Logger.c("Invalid request body for %s", new Object[] {
                    s1
                });
                abyte0 = abyte1;
            }
        }
        return new Request(s, s1, new HashMap(), abyte0);
    }

    public final void a()
    {
        a("/ad-product", "midroll-watch-now");
    }

    public final void a(Event event, String s)
    {
        a(event, s, ((Map) (null)));
    }

    public final void a(Event event, String s, Map map)
    {
        ctz.a(event);
        ctz.a(s);
        event = (new StringBuilder("sp://ads/v1/ads/")).append(s).append("/event/").append(event.mName).toString();
        s = new HashMap();
        if (map != null)
        {
            s.put("event_data", map);
        }
        a(a("POST", ((String) (event)), ((Map) (s))), ((eds) (null)), "reportEvent");
    }

    public final void a(Ad ad)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("intent", "clear");
        a(a("POST", "sp://ads/v1/adslots/watchnow", ((Map) (hashmap))), new eds() {

            private AdEventReporter a;

            public final void a(Response response)
            {
                dmz.a(fos);
                fos.b(AdEventReporter.a(a));
            }

            public final void a(Throwable throwable)
            {
                Logger.b(throwable, "problem in cosmos call during rejectPreroll (video)", new Object[0]);
            }

            
            {
                a = AdEventReporter.this;
                super();
            }
        }, String.format("rejectPreroll %s", new Object[] {
            ad
        }));
    }

    public final void a(AdSlot adslot)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("op", "replace");
        hashmap.put("path", "/inventory_enabled");
        hashmap.put("value", Boolean.toString(false));
        a(a("PATCH", (new StringBuilder("sp://ads/v1/settings/")).append(adslot.getSlotId()).toString(), ((Map) (hashmap))), ((eds) (null)), String.format("disableAdSlotConfiguration %s", new Object[] {
            adslot.getSlotId()
        }));
    }

    public final void a(ExternalAccessoryData externalaccessorydata)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("op", "replace");
        hashmap.put("path", "/device_info");
        hashmap.put("refresh_inventory", Boolean.valueOf(true));
        HashMap hashmap1 = new HashMap();
        hashmap1.put("accessory_id", Long.valueOf(externalaccessorydata.getmAccessoryId()));
        hashmap1.put("integration_type", externalaccessorydata.getmIntegrationType());
        hashmap1.put("attributes", externalaccessorydata);
        hashmap.put("attributes", hashmap1);
        a(a("PATCH", "sp://ads/v1/settings/lasertag_header", ((Map) (hashmap))), new eds() {

            public final void a(Response response)
            {
                response.toString();
            }

            public final void a(Throwable throwable)
            {
                throwable.toString();
            }

        }, "updateAccessoryData");
    }

    public final void a(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("intent", "clear");
        a(a("POST", s, ((Map) (hashmap))), ((eds) (null)), "clearSlot");
    }

    public final void a(String s, int i)
    {
        HashMap hashmap = new HashMap();
        if (s.equals("skip"))
        {
            hashmap.put("reward", "skip");
        } else
        if (s.equals("time"))
        {
            hashmap.put("reward", "time");
            hashmap.put("reward_time", Integer.valueOf(i));
        } else
        {
            hashmap.put("reward", "time");
            hashmap.put("reward_time", Integer.valueOf(0));
        }
        a(a("POST", "sp://ads/v1/adslots/watchnow", ((Map) (hashmap))), ((eds) (null)), "giveReward");
    }

    public final void a(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("op", "replace");
        hashmap.put("path", s);
        hashmap.put("value", s1);
        a(a("PATCH", "sp://ads/v1/targeting", ((Map) (hashmap))), ((eds) (null)), s);
    }

    public final void a(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        a("/focus", s);
    }

    public final void b()
    {
        a("/ad-product", "no-midroll-watch-now");
    }

    public final void b(AdSlot adslot)
    {
        a(a("GET", "sp://ads/v1/state", ((Map) (null))), new eds(adslot) {

            private AdSlot a;
            private AdEventReporter b;

            public final void a(Response response)
            {
                b.c(a).sendOnResolved(response);
            }

            public final void a(Throwable throwable)
            {
                b.c(a).sendOnError(throwable);
            }

            
            {
                b = AdEventReporter.this;
                a = adslot;
                super();
            }
        }, String.format("reenableAdSlotConfiguration %s", new Object[] {
            adslot.getSlotId()
        }));
    }

    public final void b(String s)
    {
        a(Event.a, s, ((Map) (null)));
        HashMap hashmap = new HashMap();
        hashmap.put("intent", "next_track");
        a(a("POST", "sp://ads/v1/adslots/watchnow", hashmap), new eds() {

            private AdEventReporter a;

            public final void a(Response response)
            {
                dmz.a(fos);
                fos.b(AdEventReporter.a(a));
            }

            public final void a(Throwable throwable)
            {
                Logger.b(throwable, "unable to resolve during acceptMidrollOffer (video)", new Object[0]);
            }

            
            {
                a = AdEventReporter.this;
                super();
            }
        }, String.format("acceptMidrollOffer %s", new Object[] {
            s
        }));
    }

    protected final com.spotify.cosmos.android.Resolver.CallbackReceiver c(AdSlot adslot)
    {
        return new JsonHttpCallbackReceiver(g(), com/spotify/mobile/android/spotlets/ads/model/AdState, adslot) {

            private AdSlot a;
            private AdEventReporter b;

            protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                if (errorcause == com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause.PARSING)
                {
                    errorcause = "parsing";
                } else
                if (errorcause == com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause.RESOLVING)
                {
                    errorcause = "resolving";
                } else
                {
                    errorcause = "unknown";
                }
                Logger.b(throwable, "problem in cosmos call during reenableAdSlotConfiguration ({}): {}", new Object[] {
                    a.getSlotId(), errorcause
                });
            }

            protected final void onResolved(Response response, Object obj)
            {
                if (((AdState)obj).getState().isAdsEnabled())
                {
                    response = new HashMap();
                    response.put("op", "replace");
                    response.put("path", "/inventory_enabled");
                    response.put("value", Boolean.toString(true));
                    response = b.a("PATCH", (new StringBuilder("sp://ads/v1/settings/")).append(a.getSlotId()).toString(), response);
                    AdEventReporter.a(b, response, "getState");
                }
            }

            
            {
                b = AdEventReporter.this;
                a = adslot;
                super(handler, class1);
            }
        };
    }

    public final void c()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("intent", "next_context");
        hashmap.put("targeting", new HashMap());
        a(a("POST", "sp://ads/v1/adslots/preroll", hashmap), ((eds) (null)), "requestPrerollOffer");
    }

    public final void d()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("intent", "next_track");
        hashmap.put("targeting", new HashMap());
        a(a("POST", "sp://ads/v1/adslots/watchnow", hashmap), ((eds) (null)), "acceptPrerollOffer");
    }

    public final void d(AdSlot adslot)
    {
        a(adslot.getCosmosEndpoint());
    }

    public final void e()
    {
        a("sp://ads/v1/adslots/stream");
    }

    public final void e(AdSlot adslot)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("intent", "now");
        a(a("POST", adslot.getCosmosEndpoint(), hashmap), ((eds) (null)), "now");
    }

    public final void f(AdSlot adslot)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("intent", "fetch");
        a(a("POST", adslot.getCosmosEndpoint(), hashmap), ((eds) (null)), "fetch");
    }

    private class Event extends Enum
    {

        public static final Event a;
        public static final Event b;
        public static final Event c;
        public static final Event d;
        public static final Event e;
        public static final Event f;
        public static final Event g;
        public static final Event h;
        public static final Event i;
        public static final Event j;
        private static Event k;
        private static Event l;
        private static Event m;
        private static Event n;
        private static Event o;
        private static final Event p[];
        final String mName;

        public static Event valueOf(String s)
        {
            return (Event)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/AdEventReporter$Event, s);
        }

        public static Event[] values()
        {
            return (Event[])p.clone();
        }

        static 
        {
            a = new Event("CLICK", 0, "clicked");
            b = new Event("START", 1, "started");
            c = new Event("IMPRESSION", 2, "viewed");
            d = new Event("FIRST_QUARTILE", 3, "first_quartile");
            e = new Event("MIDPOINT", 4, "midpoint");
            f = new Event("THIRD_QUARTILE", 5, "third_quartile");
            g = new Event("COMPLETE", 6, "ended");
            h = new Event("PAUSE", 7, "paused");
            i = new Event("RESUME", 8, "resumed");
            k = new Event("MUTE", 9, "muted");
            l = new Event("UNMUTE", 10, "unmuted");
            m = new Event("EXPAND", 11, "expanded");
            n = new Event("COLLAPSE", 12, "collapsed");
            o = new Event("SKIPPED", 13, "skipped");
            j = new Event("ERROR", 14, "errored");
            p = (new Event[] {
                a, b, c, d, e, f, g, h, i, k, 
                l, m, n, o, j
            });
        }

        private Event(String s, int i1, String s1)
        {
            super(s, i1);
            mName = s1;
        }
    }

}
