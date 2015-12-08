// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import acd;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import any;
import anz;
import aoa;
import aob;
import aoo;
import aoz;
import aph;
import apo;
import arb;
import arp;
import arr;
import ars;
import de;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook:
//            Session, Request, LoggingBehavior, FacebookRequestError

public class AppEventsLogger
{

    private static final String b = com/facebook/AppEventsLogger.getCanonicalName();
    private static Map d = new ConcurrentHashMap();
    private static ScheduledThreadPoolExecutor e;
    private static FlushBehavior f;
    private static boolean g;
    private static Context h;
    private static Object i = new Object();
    private static String j;
    private static String k;
    private static boolean l;
    final AccessTokenAppIdPair a;
    private final Context c;

    private AppEventsLogger(Context context, String s, Session session)
    {
        ars.a(context, "context");
        c = context;
        Session session1 = session;
        if (session == null)
        {
            session1 = Session.g();
        }
        if (session1 != null && (s == null || s.equals(session1.applicationId)))
        {
            a = new AccessTokenAppIdPair(session1);
        } else
        {
            session = s;
            if (s == null)
            {
                session = arp.a(context);
            }
            a = new AccessTokenAppIdPair(null, session);
            s = session;
        }
        synchronized (i)
        {
            if (j == null)
            {
                j = arp.b(context, s);
            }
            if (h == null)
            {
                h = context.getApplicationContext();
            }
        }
        synchronized (i)
        {
            if (e == null)
            {
                break MISSING_BLOCK_LABEL_145;
            }
        }
        return;
        context;
        session;
        JVM INSTR monitorexit ;
        throw context;
        e = new ScheduledThreadPoolExecutor(1);
        context;
        JVM INSTR monitorexit ;
        context = new Runnable() {

            public final void run()
            {
                if (AppEventsLogger.a() != FlushBehavior.b)
                {
                    AppEventsLogger.a(FlushReason.a);
                }
            }


            private class FlushBehavior extends Enum
            {

                public static final FlushBehavior a;
                public static final FlushBehavior b;
                private static final FlushBehavior c[];

                public static FlushBehavior valueOf(String s)
                {
                    return (FlushBehavior)Enum.valueOf(com/facebook/AppEventsLogger$FlushBehavior, s);
                }

                public static FlushBehavior[] values()
                {
                    return (FlushBehavior[])c.clone();
                }

                static 
                {
                    a = new FlushBehavior("AUTO", 0);
                    b = new FlushBehavior("EXPLICIT_ONLY", 1);
                    c = (new FlushBehavior[] {
                        a, b
                    });
                }

                private FlushBehavior(String s, int i1)
                {
                    super(s, i1);
                }
            }


            private class FlushReason extends Enum
            {

                public static final FlushReason a;
                public static final FlushReason b;
                private static FlushReason c;
                private static FlushReason d;
                private static FlushReason e;
                private static FlushReason f;
                private static final FlushReason g[];

                public static FlushReason valueOf(String s)
                {
                    return (FlushReason)Enum.valueOf(com/facebook/AppEventsLogger$FlushReason, s);
                }

                public static FlushReason[] values()
                {
                    return (FlushReason[])g.clone();
                }

                static 
                {
                    c = new FlushReason("EXPLICIT", 0);
                    a = new FlushReason("TIMER", 1);
                    d = new FlushReason("SESSION_CHANGE", 2);
                    e = new FlushReason("PERSISTED_EVENTS", 3);
                    b = new FlushReason("EVENT_THRESHOLD", 4);
                    f = new FlushReason("EAGER_FLUSHING_EVENT", 5);
                    g = (new FlushReason[] {
                        c, a, d, e, b, f
                    });
                }

                private FlushReason(String s, int i1)
                {
                    super(s, i1);
                }
            }

        };
        e.scheduleAtFixedRate(context, 0L, 15L, TimeUnit.SECONDS);
        context = new Runnable() {

            public final void run()
            {
                Object obj1 = new HashSet();
                Object obj = AppEventsLogger.c();
                obj;
                JVM INSTR monitorenter ;
                for (Iterator iterator1 = AppEventsLogger.d().keySet().iterator(); iterator1.hasNext(); ((Set) (obj1)).add(((AccessTokenAppIdPair)iterator1.next()).applicationId)) { }
                break MISSING_BLOCK_LABEL_64;
                obj1;
                obj;
                JVM INSTR monitorexit ;
                throw obj1;
                obj;
                JVM INSTR monitorexit ;
                for (Iterator iterator = ((Set) (obj1)).iterator(); iterator.hasNext(); arp.a((String)iterator.next(), true)) { }
                return;
            }

        };
        e.scheduleAtFixedRate(context, 0L, 0x15180L, TimeUnit.SECONDS);
        return;
        s;
        context;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static any a(FlushReason flushreason, Set set)
    {
        any any1 = new any((byte)0);
        boolean flag = aph.b(h);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = set.iterator();
        do
        {
            if (iterator.hasNext())
            {
                AccessTokenAppIdPair accesstokenappidpair = (AccessTokenAppIdPair)iterator.next();
                aob aob1 = a(accesstokenappidpair);
                if (aob1 != null)
                {
                    set = accesstokenappidpair.applicationId;
                    arr arr1 = arp.a(set, false);
                    Request request = Request.a(String.format("%s/activities", new Object[] {
                        set
                    }), null);
                    Bundle bundle = request.c;
                    set = bundle;
                    if (bundle == null)
                    {
                        set = new Bundle();
                    }
                    set.putString("access_token", accesstokenappidpair.accessToken);
                    request.c = set;
                    if (arr1 == null)
                    {
                        set = null;
                    } else
                    {
                        int i1 = aob1.a(request, arr1.b, arr1.a, flag);
                        if (i1 == 0)
                        {
                            set = null;
                        } else
                        {
                            any1.a = i1 + any1.a;
                            request.d = new aoo(accesstokenappidpair, request, aob1, any1) {

                                private AccessTokenAppIdPair a;
                                private aob b;
                                private any c;

                                public final void a(aoz aoz1)
                                {
                                    AppEventsLogger.a(a, aoz1, b, c);
                                }

            
            {
                a = accesstokenappidpair;
                b = aob1;
                c = any1;
                super();
            }
                            };
                            set = request;
                        }
                    }
                    if (set != null)
                    {
                        arraylist.add(set);
                    }
                }
            } else
            {
                if (arraylist.size() > 0)
                {
                    set = LoggingBehavior.e;
                    int j1 = any1.a;
                    flushreason.toString();
                    arb.b();
                    for (flushreason = arraylist.iterator(); flushreason.hasNext(); ((Request)flushreason.next()).a()) { }
                    return any1;
                }
                return null;
            }
        } while (true);
    }

    static aob a(Context context, AccessTokenAppIdPair accesstokenappidpair)
    {
        return b(context, accesstokenappidpair);
    }

    private static aob a(AccessTokenAppIdPair accesstokenappidpair)
    {
        synchronized (i)
        {
            accesstokenappidpair = (aob)d.get(accesstokenappidpair);
        }
        return accesstokenappidpair;
        accesstokenappidpair;
        obj;
        JVM INSTR monitorexit ;
        throw accesstokenappidpair;
    }

    public static FlushBehavior a()
    {
        FlushBehavior flushbehavior;
        synchronized (i)
        {
            flushbehavior = f;
        }
        return flushbehavior;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static AppEventsLogger a(Context context, Session session)
    {
        return new AppEventsLogger(context, null, session);
    }

    public static AppEventsLogger a(Context context, String s)
    {
        return new AppEventsLogger(context, s, null);
    }

    public static void a(Context context)
    {
        Object obj;
        aph.a(context);
        obj = arp.a(context);
        if (context == null || obj == null)
        {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        if (!(context instanceof Activity)) goto _L2; else goto _L1
_L1:
        Object obj1;
        Object obj2;
        obj1 = (Activity)context;
        obj2 = ((Activity) (obj1)).getCallingActivity();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        obj2 = ((ComponentName) (obj2)).getPackageName();
        if (!((String) (obj2)).equals(((Activity) (obj1)).getPackageName())) goto _L6; else goto _L5
_L5:
        k();
_L8:
        aph.a(context, ((String) (obj)));
        obj1 = new AppEventsLogger(context, ((String) (obj)), null);
        long l1 = System.currentTimeMillis();
        context = "Unclassified";
        if (l)
        {
            context = "Applink";
        }
        obj = context;
        if (k != null)
        {
            obj = (new StringBuilder()).append(context).append("(").append(k).append(")").toString();
        }
        e.execute(((_cls1) (obj1)). new Runnable(l1, ((String) (obj))) {

            private AppEventsLogger a;
            private long b;
            private String c;

            public final void run()
            {
                AppEventsLogger.a(a, b, c);
            }

            
            {
                a = AppEventsLogger.this;
                b = l1;
                c = s;
                super();
            }
        });
        return;
_L6:
        k = ((String) (obj2));
_L4:
        obj1 = ((Activity) (obj1)).getIntent();
        if (obj1 == null || ((Intent) (obj1)).getBooleanExtra("_fbSourceApplicationHasBeenSet", false))
        {
            k();
        } else
        {
            Bundle bundle = acd.a(((Intent) (obj1)));
            if (bundle == null)
            {
                k();
            } else
            {
                l = true;
                bundle = bundle.getBundle("referer_app_link");
                if (bundle == null)
                {
                    k = null;
                } else
                {
                    k = bundle.getString("package");
                    ((Intent) (obj1)).putExtra("_fbSourceApplicationHasBeenSet", true);
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        k();
        Log.d(com/facebook/AppEventsLogger.getName(), "To set source application the context of activateApp must be an instance of Activity");
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(AccessTokenAppIdPair accesstokenappidpair, aoz aoz1, aob aob1, any any1)
    {
        boolean flag = true;
        FacebookRequestError facebookrequesterror = aoz1.b;
        FlushResult flushresult = FlushResult.a;
        if (facebookrequesterror != null)
        {
            if (facebookrequesterror.b == -1)
            {
                flushresult = FlushResult.c;
            } else
            {
                String.format("Failed:\n  Response: %s\n  Error %s", new Object[] {
                    aoz1.toString(), facebookrequesterror.toString()
                });
                flushresult = FlushResult.b;
            }
        }
        aoz1 = LoggingBehavior.e;
        aph.a();
        if (facebookrequesterror == null)
        {
            flag = false;
        }
        aob1.a(flag);
        if (flushresult == FlushResult.c)
        {
            aoa.a(h, accesstokenappidpair, aob1);
        }
        if (flushresult != FlushResult.a && any1.b != FlushResult.c)
        {
            any1.b = flushresult;
        }
    }

    static void a(FlushReason flushreason)
    {
label0:
        {
            synchronized (i)
            {
                if (!g)
                {
                    break label0;
                }
            }
            return;
        }
        HashSet hashset;
        g = true;
        hashset = new HashSet(d.keySet());
        obj;
        JVM INSTR monitorexit ;
        j();
        obj = null;
        try
        {
            flushreason = a(flushreason, ((Set) (hashset)));
        }
        // Misplaced declaration of an exception variable
        catch (FlushReason flushreason)
        {
            arp.a(b, "Caught unexpected exception while flushing: ", flushreason);
            flushreason = ((FlushReason) (obj));
        }
        synchronized (i)
        {
            g = false;
        }
        if (flushreason != null)
        {
            obj = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", ((any) (flushreason)).a);
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ((any) (flushreason)).b);
            de.a(h).a(((Intent) (obj)));
            return;
        } else
        {
            return;
        }
        flushreason;
        obj;
        JVM INSTR monitorexit ;
        throw flushreason;
        flushreason;
        obj;
        JVM INSTR monitorexit ;
        throw flushreason;
    }

    static void a(AppEventsLogger appeventslogger, long l1, String s)
    {
        anz.a(h, appeventslogger.a, appeventslogger, l1, s);
    }

    private static aob b(Context context, AccessTokenAppIdPair accesstokenappidpair)
    {
        apo apo1;
        aob aob1 = (aob)d.get(accesstokenappidpair);
        apo1 = null;
        if (aob1 == null)
        {
            apo1 = apo.a(context);
        }
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        aob aob3 = (aob)d.get(accesstokenappidpair);
        aob aob2;
        aob2 = aob3;
        if (aob3 != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        aob2 = new aob(apo1, context.getPackageName(), j);
        d.put(accesstokenappidpair, aob2);
        obj;
        JVM INSTR monitorexit ;
        return aob2;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static AppEventsLogger b(Context context)
    {
        return new AppEventsLogger(context, null, null);
    }

    public static void b()
    {
        aoa.a(h, d);
    }

    static Object c()
    {
        return i;
    }

    static Map d()
    {
        return d;
    }

    static void e()
    {
        synchronized (i)
        {
            if (a() != FlushBehavior.b && i() > 100)
            {
                FlushReason flushreason = FlushReason.b;
                aph.c().execute(new Runnable(flushreason) {

                    private FlushReason a;

                    public final void run()
                    {
                        AppEventsLogger.a(a);
                    }

            
            {
                a = flushreason;
                super();
            }
                });
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Context f()
    {
        return h;
    }

    public static String g()
    {
        return b;
    }

    public static ScheduledThreadPoolExecutor h()
    {
        return e;
    }

    private static int i()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = d.values().iterator();
        int i1 = 0;
        while (iterator.hasNext()) 
        {
            i1 = ((aob)iterator.next()).a() + i1;
        }
        obj;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static int j()
    {
        aoa aoa1 = aoa.a(h);
        Iterator iterator = aoa1.a.keySet().iterator();
        Object obj;
        int i1;
        for (i1 = 0; iterator.hasNext(); i1 = ((List) (obj)).size() + i1)
        {
            obj = (AccessTokenAppIdPair)iterator.next();
            aob aob1 = b(h, ((AccessTokenAppIdPair) (obj)));
            obj = (List)aoa1.a.get(obj);
            aob1.a(((List) (obj)));
        }

        return i1;
    }

    private static void k()
    {
        k = null;
        l = false;
    }

    public final void a(String s, Bundle bundle)
    {
        a(s, ((Double) (null)), bundle, false);
    }

    public final void a(String s, Double double1, Bundle bundle, boolean flag)
    {
        s = new AppEvent(c, s, double1, bundle, flag);
        double1 = c;
        bundle = a;
        aph.c().execute(new Runnable(double1, bundle, s) {

            private Context a;
            private AccessTokenAppIdPair b;
            private AppEvent c;

            public final void run()
            {
                AppEventsLogger.a(a, b).a(c);
                AppEventsLogger.e();
            }

            
            {
                a = context;
                b = accesstokenappidpair;
                c = appevent;
                super();
            }
        });
    }

    public final void b(String s, Bundle bundle)
    {
        a(s, ((Double) (null)), bundle, true);
    }

    static 
    {
        f = FlushBehavior.a;
    }

    private class AccessTokenAppIdPair
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        final String accessToken;
        final String applicationId;

        private Object writeReplace()
        {
            class SerializationProxyV1
                implements Serializable
            {

                private static final long serialVersionUID = 0xdd772aee317ab613L;
                private final String accessToken;
                private final String appId;

                private Object readResolve()
                {
                    return new AccessTokenAppIdPair(accessToken, appId);
                }

                private SerializationProxyV1(String s, String s1)
                {
                    accessToken = s;
                    appId = s1;
                }

                SerializationProxyV1(String s, String s1, byte byte0)
                {
                    this(s, s1);
                }
            }

            return new SerializationProxyV1(accessToken, applicationId, (byte)0);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof AccessTokenAppIdPair)
            {
                if (arp.a(((AccessTokenAppIdPair) (obj = (AccessTokenAppIdPair)obj)).accessToken, accessToken) && arp.a(((AccessTokenAppIdPair) (obj)).applicationId, applicationId))
                {
                    return true;
                }
            }
            return false;
        }

        public int hashCode()
        {
            int j1 = 0;
            int i1;
            if (accessToken == null)
            {
                i1 = 0;
            } else
            {
                i1 = accessToken.hashCode();
            }
            if (applicationId != null)
            {
                j1 = applicationId.hashCode();
            }
            return i1 ^ j1;
        }

        AccessTokenAppIdPair(Session session)
        {
            this(session.d(), session.applicationId);
        }

        AccessTokenAppIdPair(String s, String s1)
        {
            String s2 = s;
            if (arp.a(s))
            {
                s2 = null;
            }
            accessToken = s2;
            applicationId = s1;
        }
    }


    private class FlushResult extends Enum
    {

        public static final FlushResult a;
        public static final FlushResult b;
        public static final FlushResult c;
        private static FlushResult d;
        private static final FlushResult e[];

        public static FlushResult valueOf(String s)
        {
            return (FlushResult)Enum.valueOf(com/facebook/AppEventsLogger$FlushResult, s);
        }

        public static FlushResult[] values()
        {
            return (FlushResult[])e.clone();
        }

        static 
        {
            a = new FlushResult("SUCCESS", 0);
            b = new FlushResult("SERVER_ERROR", 1);
            c = new FlushResult("NO_CONNECTIVITY", 2);
            d = new FlushResult("UNKNOWN_ERROR", 3);
            e = (new FlushResult[] {
                a, b, c, d
            });
        }

        private FlushResult(String s, int i1)
        {
            super(s, i1);
        }
    }


    private class AppEvent
        implements Serializable
    {

        private static final HashSet a = new HashSet();
        private static final long serialVersionUID = 1L;
        public boolean isImplicit;
        public JSONObject jsonObject;
        private String name;

        private static void a(String s)
        {
            if (s == null || s.length() == 0 || s.length() > 40)
            {
                String s1 = s;
                if (s == null)
                {
                    s1 = "<None Provided>";
                }
                throw new FacebookException(String.format("Identifier '%s' must be less than %d characters", new Object[] {
                    s1, Integer.valueOf(40)
                }));
            }
            boolean flag;
            synchronized (a)
            {
                flag = a.contains(s);
            }
            if (!flag)
            {
                if (!s.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$"))
                {
                    break MISSING_BLOCK_LABEL_114;
                }
                synchronized (a)
                {
                    a.add(s);
                }
            }
            return;
            s;
            hashset;
            JVM INSTR monitorexit ;
            throw s;
            s;
            hashset;
            JVM INSTR monitorexit ;
            throw s;
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[] {
                s
            }));
        }

        private Object writeReplace()
        {
            class SerializationProxyV1
                implements Serializable
            {

                private static final long serialVersionUID = 0xdd772aee317ab613L;
                private final boolean isImplicit;
                private final String jsonString;

                private Object readResolve()
                {
                    return new AppEvent(jsonString, isImplicit, (byte)0);
                }

                private SerializationProxyV1(String s, boolean flag)
                {
                    jsonString = s;
                    isImplicit = flag;
                }

                SerializationProxyV1(String s, boolean flag, byte byte0)
                {
                    this(s, flag);
                }
            }

            return new SerializationProxyV1(jsonObject.toString(), isImplicit, (byte)0);
        }

        public String toString()
        {
            return String.format("\"%s\", implicit: %b, json: %s", new Object[] {
                jsonObject.optString("_eventName"), Boolean.valueOf(isImplicit), jsonObject.toString()
            });
        }


        public AppEvent(Context context, String s, Double double1, Bundle bundle, boolean flag)
        {
            a(s);
            name = s;
            isImplicit = flag;
            jsonObject = new JSONObject();
            jsonObject.put("_eventName", s);
            jsonObject.put("_logTime", System.currentTimeMillis() / 1000L);
            jsonObject.put("_ui", arp.d(context));
            if (double1 == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            jsonObject.put("_valueToSum", double1.doubleValue());
            if (isImplicit)
            {
                jsonObject.put("_implicitlyLogged", "1");
            }
            context = aph.f();
            if (context == null)
            {
                break MISSING_BLOCK_LABEL_128;
            }
            jsonObject.put("_appVersion", context);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            context = bundle.keySet().iterator();
_L5:
            if (!context.hasNext()) goto _L2; else goto _L3
_L3:
            s = (String)context.next();
            a(s);
            double1 = ((Double) (bundle.get(s)));
            if (!(double1 instanceof String) && !(double1 instanceof Number))
            {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] {
                    double1, s
                }));
            }
              goto _L4
            context;
            s = LoggingBehavior.e;
            context.toString();
            arb.b();
            jsonObject = null;
_L7:
            return;
_L4:
            jsonObject.put(s, double1.toString());
              goto _L5
            context;
            s = LoggingBehavior.e;
            context.toString();
            arb.b();
            jsonObject = null;
            return;
_L2:
            if (isImplicit) goto _L7; else goto _L6
_L6:
            context = LoggingBehavior.e;
            jsonObject.toString();
            arb.b();
            return;
              goto _L5
        }

        private AppEvent(String s, boolean flag)
        {
            jsonObject = new JSONObject(s);
            isImplicit = flag;
        }

        AppEvent(String s, boolean flag, byte byte0)
        {
            this(s, flag);
        }
    }

}
