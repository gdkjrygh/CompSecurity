// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.b.d;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.g;
import com.facebook.internal.AppEventsLoggerUtility;
import com.facebook.internal.a;
import com.facebook.internal.h;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.j;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents:
//            FacebookTimeSpentData

public class AppEventsLogger
{
    private static class AccessTokenAppIdPair
        implements Serializable
    {

        private static final long serialVersionUID = 1L;
        final String a;
        final String b;

        private Object writeReplace()
        {
            return new SerializationProxyV1(a, b, (byte)0);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof AccessTokenAppIdPair)
            {
                if (m.a(((AccessTokenAppIdPair) (obj = (AccessTokenAppIdPair)obj)).a, a) && m.a(((AccessTokenAppIdPair) (obj)).b, b))
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
            if (a == null)
            {
                i1 = 0;
            } else
            {
                i1 = a.hashCode();
            }
            if (b != null)
            {
                j1 = b.hashCode();
            }
            return i1 ^ j1;
        }

        AccessTokenAppIdPair(AccessToken accesstoken)
        {
            this(accesstoken.d, com.facebook.g.j());
        }

        AccessTokenAppIdPair(String s, String s1)
        {
            String s2 = s;
            if (m.a(s))
            {
                s2 = null;
            }
            a = s2;
            b = s1;
        }
    }

    private static class AccessTokenAppIdPair.SerializationProxyV1
        implements Serializable
    {

        private static final long serialVersionUID = 0xdd772aee317ab613L;
        private final String a;
        private final String b;

        private Object readResolve()
        {
            return new AccessTokenAppIdPair(a, b);
        }

        private AccessTokenAppIdPair.SerializationProxyV1(String s, String s1)
        {
            a = s;
            b = s1;
        }

        AccessTokenAppIdPair.SerializationProxyV1(String s, String s1, byte byte0)
        {
            this(s, s1);
        }
    }

    static class AppEvent
        implements Serializable
    {

        private static final HashSet c = new HashSet();
        private static final long serialVersionUID = 1L;
        JSONObject a;
        boolean b;
        private String d;

        private static void a(String s)
            throws FacebookException
        {
            if (s == null || s.length() == 0 || s.length() > 40)
            {
                String s1 = s;
                if (s == null)
                {
                    s1 = "<None Provided>";
                }
                throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] {
                    s1, Integer.valueOf(40)
                }));
            }
            boolean flag;
            synchronized (c)
            {
                flag = c.contains(s);
            }
            if (!flag)
            {
                if (!s.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$"))
                {
                    break MISSING_BLOCK_LABEL_117;
                }
                synchronized (c)
                {
                    c.add(s);
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
            return new SerializationProxyV1(a.toString(), b, (byte)0);
        }

        public String toString()
        {
            return String.format("\"%s\", implicit: %b, json: %s", new Object[] {
                a.optString("_eventName"), Boolean.valueOf(b), a.toString()
            });
        }


        public AppEvent(String s, String s1, Double double1, Bundle bundle, boolean flag)
        {
            a(s1);
            d = s1;
            b = flag;
            a = new JSONObject();
            a.put("_eventName", s1);
            a.put("_logTime", System.currentTimeMillis() / 1000L);
            a.put("_ui", s);
            if (double1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            a.put("_valueToSum", double1.doubleValue());
            if (b)
            {
                a.put("_implicitlyLogged", "1");
            }
            if (bundle == null) goto _L2; else goto _L1
_L1:
            s = bundle.keySet().iterator();
_L5:
            if (!s.hasNext()) goto _L2; else goto _L3
_L3:
            s1 = (String)s.next();
            a(s1);
            double1 = ((Double) (bundle.get(s1)));
            if (!(double1 instanceof String) && !(double1 instanceof Number))
            {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] {
                    double1, s1
                }));
            }
              goto _L4
            s;
            com.facebook.internal.h.a(LoggingBehavior.e, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] {
                s.toString()
            });
            a = null;
_L7:
            return;
_L4:
            a.put(s1, double1.toString());
              goto _L5
            s;
            com.facebook.internal.h.a(LoggingBehavior.e, "AppEvents", "Invalid app event name or parameter:", new Object[] {
                s.toString()
            });
            a = null;
            return;
_L2:
            if (b) goto _L7; else goto _L6
_L6:
            com.facebook.internal.h.a(LoggingBehavior.e, "AppEvents", "Created app event '%s'", new Object[] {
                a.toString()
            });
            return;
              goto _L5
        }

        private AppEvent(String s, boolean flag)
            throws JSONException
        {
            a = new JSONObject(s);
            b = flag;
        }

        AppEvent(String s, boolean flag, byte byte0)
            throws JSONException
        {
            this(s, flag);
        }
    }

    private static class AppEvent.SerializationProxyV1
        implements Serializable
    {

        private static final long serialVersionUID = 0xdd772aee317ab613L;
        private final String a;
        private final boolean b;

        private Object readResolve()
            throws JSONException
        {
            return new AppEvent(a, b, (byte)0);
        }

        private AppEvent.SerializationProxyV1(String s, boolean flag)
        {
            a = s;
            b = flag;
        }

        AppEvent.SerializationProxyV1(String s, boolean flag, byte byte0)
        {
            this(s, flag);
        }
    }

    public static final class FlushBehavior extends Enum
    {

        public static final FlushBehavior a;
        public static final FlushBehavior b;
        private static final FlushBehavior c[];

        public static FlushBehavior valueOf(String s)
        {
            return (FlushBehavior)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushBehavior, s);
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

    private static final class FlushReason extends Enum
    {

        public static final FlushReason a;
        public static final FlushReason b;
        public static final FlushReason c;
        public static final FlushReason d;
        public static final FlushReason e;
        public static final FlushReason f;
        private static final FlushReason g[];

        public static FlushReason valueOf(String s)
        {
            return (FlushReason)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushReason, s);
        }

        public static FlushReason[] values()
        {
            return (FlushReason[])g.clone();
        }

        static 
        {
            a = new FlushReason("EXPLICIT", 0);
            b = new FlushReason("TIMER", 1);
            c = new FlushReason("SESSION_CHANGE", 2);
            d = new FlushReason("PERSISTED_EVENTS", 3);
            e = new FlushReason("EVENT_THRESHOLD", 4);
            f = new FlushReason("EAGER_FLUSHING_EVENT", 5);
            g = (new FlushReason[] {
                a, b, c, d, e, f
            });
        }

        private FlushReason(String s, int i1)
        {
            super(s, i1);
        }
    }

    private static final class FlushResult extends Enum
    {

        public static final FlushResult a;
        public static final FlushResult b;
        public static final FlushResult c;
        public static final FlushResult d;
        private static final FlushResult e[];

        public static FlushResult valueOf(String s)
        {
            return (FlushResult)Enum.valueOf(com/facebook/appevents/AppEventsLogger$FlushResult, s);
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

    private static final class a
    {

        public int a;
        public FlushResult b;

        private a()
        {
            a = 0;
            b = com.facebook.appevents.FlushResult.a;
        }

        a(byte byte0)
        {
            this();
        }
    }

    static final class b
    {

        private static final Object a = new Object();
        private static boolean b = false;
        private static boolean c = false;
        private static Map d;
        private static final Runnable e = new Runnable() {

            public final void run()
            {
                com.facebook.appevents.b.a(AppEventsLogger.f());
            }

        };

        private static FacebookTimeSpentData a(Context context, AccessTokenAppIdPair accesstokenappidpair)
        {
            Object obj1 = null;
            Object obj2 = a;
            obj2;
            JVM INSTR monitorenter ;
            boolean flag = c;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            Object obj = new ObjectInputStream(context.openFileInput("AppEventsLogger.persistedsessioninfo"));
            obj1 = obj;
            d = (HashMap)((ObjectInputStream) (obj)).readObject();
            obj1 = obj;
            com.facebook.internal.h.a(LoggingBehavior.e, "AppEvents", "App session info loaded");
            m.a(((java.io.Closeable) (obj)));
            context.deleteFile("AppEventsLogger.persistedsessioninfo");
            if (d == null)
            {
                d = new HashMap();
            }
            c = true;
            b = false;
_L1:
            obj2;
            JVM INSTR monitorexit ;
            obj = (FacebookTimeSpentData)d.get(accesstokenappidpair);
            context = ((Context) (obj));
            if (obj == null)
            {
                context = new FacebookTimeSpentData();
                d.put(accesstokenappidpair, context);
            }
            return context;
            obj;
            obj = obj1;
_L4:
            m.a(((java.io.Closeable) (obj)));
            context.deleteFile("AppEventsLogger.persistedsessioninfo");
            if (d == null)
            {
                d = new HashMap();
            }
            c = true;
            b = false;
              goto _L1
            context;
            obj2;
            JVM INSTR monitorexit ;
            throw context;
            Exception exception;
            exception;
            obj = null;
_L3:
            obj1 = obj;
            Log.d(com.facebook.appevents.AppEventsLogger.g(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
            m.a(((java.io.Closeable) (obj)));
            context.deleteFile("AppEventsLogger.persistedsessioninfo");
            if (d == null)
            {
                d = new HashMap();
            }
            c = true;
            b = false;
              goto _L1
_L2:
            m.a(((java.io.Closeable) (obj1)));
            context.deleteFile("AppEventsLogger.persistedsessioninfo");
            if (d == null)
            {
                d = new HashMap();
            }
            c = true;
            b = false;
            throw accesstokenappidpair;
            accesstokenappidpair;
              goto _L2
            exception;
              goto _L3
            obj1;
              goto _L4
            accesstokenappidpair;
            obj1 = null;
              goto _L2
        }

        private static void a()
        {
            if (!b)
            {
                b = true;
                com.facebook.appevents.AppEventsLogger.h().schedule(e, 30L, TimeUnit.SECONDS);
            }
        }

        static void a(Context context)
        {
            Object obj = a;
            obj;
            JVM INSTR monitorenter ;
            boolean flag = b;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_69;
            }
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(new BufferedOutputStream(context.openFileOutput("AppEventsLogger.persistedsessioninfo", 0)));
            context = objectoutputstream;
            objectoutputstream.writeObject(d);
            context = objectoutputstream;
            b = false;
            context = objectoutputstream;
            com.facebook.internal.h.a(LoggingBehavior.e, "AppEvents", "App session info saved");
            m.a(objectoutputstream);
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            Exception exception1;
            exception1;
            objectoutputstream = null;
_L4:
            context = objectoutputstream;
            Log.d(com.facebook.appevents.AppEventsLogger.g(), (new StringBuilder("Got unexpected exception: ")).append(exception1.toString()).toString());
            m.a(objectoutputstream);
              goto _L1
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
            Exception exception;
            exception;
            context = null;
_L3:
            m.a(context);
            throw exception;
            exception;
            if (true) goto _L3; else goto _L2
_L2:
            exception1;
              goto _L4
        }

        static void a(Context context, AccessTokenAppIdPair accesstokenappidpair, long l1)
        {
            long l2 = 0L;
            Object obj = a;
            obj;
            JVM INSTR monitorenter ;
            context = a(context, accesstokenappidpair);
            if (((FacebookTimeSpentData) (context)).c) goto _L2; else goto _L1
_L1:
            com.facebook.internal.h.a(LoggingBehavior.e, com.facebook.appevents.FacebookTimeSpentData.a, "Suspend for inactive app");
_L3:
            a();
            return;
_L2:
            long l3 = l1 - ((FacebookTimeSpentData) (context)).e;
            if (l3 >= 0L)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            com.facebook.internal.h.a(LoggingBehavior.e, com.facebook.appevents.FacebookTimeSpentData.a, "Clock skew detected");
_L4:
            context.g = l2 + ((FacebookTimeSpentData) (context)).g;
            context.f = l1;
            context.c = false;
              goto _L3
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
            l2 = l3;
              goto _L4
        }

        static void a(Context context, AccessTokenAppIdPair accesstokenappidpair, AppEventsLogger appeventslogger, long l1, String s)
        {
            Object obj = a;
            obj;
            JVM INSTR monitorenter ;
            context = a(context, accesstokenappidpair);
            boolean flag;
            long l2;
            long l3;
            if (!((FacebookTimeSpentData) (context)).b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            context.b = true;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            if (l1 - ((FacebookTimeSpentData) (context)).d <= 0x493e0L)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            accesstokenappidpair = new Bundle();
            accesstokenappidpair.putString("fb_mobile_launch_source", s);
            appeventslogger.a("fb_mobile_activate_app", accesstokenappidpair);
            context.d = l1;
            if (!((FacebookTimeSpentData) (context)).c) goto _L2; else goto _L1
_L1:
            com.facebook.internal.h.a(LoggingBehavior.e, com.facebook.appevents.FacebookTimeSpentData.a, "Resume for active app");
_L7:
            a();
            obj;
            JVM INSTR monitorexit ;
            return;
_L2:
            if (((FacebookTimeSpentData) (context)).f != -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag) goto _L4; else goto _L3
_L3:
            l2 = l1 - ((FacebookTimeSpentData) (context)).f;
_L8:
            l3 = l2;
            if (l2 >= 0L)
            {
                break MISSING_BLOCK_LABEL_152;
            }
            com.facebook.internal.h.a(LoggingBehavior.e, com.facebook.appevents.FacebookTimeSpentData.a, "Clock skew detected");
            l3 = 0L;
            if (l3 <= 60000L) goto _L6; else goto _L5
_L5:
            accesstokenappidpair = new Bundle();
            accesstokenappidpair.putInt("fb_mobile_app_interruptions", ((FacebookTimeSpentData) (context)).h);
            accesstokenappidpair.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[] {
                Integer.valueOf(com.facebook.appevents.FacebookTimeSpentData.a(l3))
            }));
            accesstokenappidpair.putString("fb_mobile_launch_source", ((FacebookTimeSpentData) (context)).i);
            appeventslogger.a("fb_mobile_deactivate_app", ((FacebookTimeSpentData) (context)).g / 1000L, accesstokenappidpair);
            context.a();
_L10:
            if (((FacebookTimeSpentData) (context)).h == 0)
            {
                context.i = s;
            }
            context.e = l1;
            context.c = true;
              goto _L7
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
_L4:
            l2 = 0L;
              goto _L8
_L6:
            if (l3 <= 1000L) goto _L10; else goto _L9
_L9:
            context.h = ((FacebookTimeSpentData) (context)).h + 1;
              goto _L10
        }

    }

    static final class c
    {

        private static Object b = new Object();
        HashMap a;
        private Context c;

        public static c a(Context context)
        {
            Object obj1 = b;
            obj1;
            JVM INSTR monitorenter ;
            c c1 = new c(context);
            Object obj = null;
            context = new ObjectInputStream(new BufferedInputStream(c1.c.openFileInput("AppEventsLogger.persistedevents")));
            obj = context;
            HashMap hashmap = (HashMap)context.readObject();
            obj = context;
            c1.c.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            obj = context;
            c1.a = hashmap;
            m.a(context);
_L1:
            obj1;
            JVM INSTR monitorexit ;
            return c1;
_L4:
            m.a(context);
              goto _L1
            context;
            obj1;
            JVM INSTR monitorexit ;
            throw context;
            Exception exception;
            exception;
            context = null;
_L3:
            obj = context;
            Log.d(com.facebook.appevents.AppEventsLogger.g(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
            m.a(context);
              goto _L1
_L2:
            m.a(((java.io.Closeable) (obj)));
            throw context;
            context;
              goto _L2
            exception;
              goto _L3
            obj;
              goto _L4
            context;
            context = ((Context) (obj));
              goto _L4
            context;
            obj = null;
              goto _L2
        }

        public static void a(Context context, AccessTokenAppIdPair accesstokenappidpair, d d1)
        {
            HashMap hashmap = new HashMap();
            hashmap.put(accesstokenappidpair, d1);
            a(context, ((Map) (hashmap)));
        }

        private static void a(Context context, Map map)
        {
            Object obj = b;
            obj;
            JVM INSTR monitorenter ;
            c c1;
            c1 = a(context);
            context = map.entrySet().iterator();
            do
            {
                if (!context.hasNext())
                {
                    break;
                }
                Object obj1 = (java.util.Map.Entry)context.next();
                map = ((d)((java.util.Map.Entry) (obj1)).getValue()).b();
                if (map.size() != 0)
                {
                    obj1 = (AccessTokenAppIdPair)((java.util.Map.Entry) (obj1)).getKey();
                    if (!c1.a.containsKey(obj1))
                    {
                        c1.a.put(obj1, new ArrayList());
                    }
                    ((List)c1.a.get(obj1)).addAll(map);
                }
            } while (true);
            break MISSING_BLOCK_LABEL_134;
            context;
            obj;
            JVM INSTR monitorexit ;
            throw context;
            map = new ObjectOutputStream(new BufferedOutputStream(c1.c.openFileOutput("AppEventsLogger.persistedevents", 0)));
            context = map;
            map.writeObject(c1.a);
            m.a(map);
_L1:
            obj;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            map = null;
_L3:
            context = map;
            Log.d(com.facebook.appevents.AppEventsLogger.g(), (new StringBuilder("Got unexpected exception: ")).append(exception.toString()).toString());
            m.a(map);
              goto _L1
_L2:
            m.a(context);
            throw map;
            map;
              goto _L2
            exception;
              goto _L3
            map;
            context = null;
              goto _L2
        }


        private c(Context context)
        {
            a = new HashMap();
            c = context;
        }
    }

    static final class d
    {

        private List a;
        private List b;
        private int c;
        private com.facebook.internal.a d;
        private String e;
        private String f;
        private final int g = 1000;

        private static byte[] a(String s)
        {
            try
            {
                s = s.getBytes("UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                m.a("Encoding exception: ", s);
                return null;
            }
            return s;
        }

        public final int a()
        {
            this;
            JVM INSTR monitorenter ;
            int i1 = a.size();
            this;
            JVM INSTR monitorexit ;
            return i1;
            Exception exception;
            exception;
            throw exception;
        }

        public final int a(GraphRequest graphrequest, boolean flag, boolean flag1)
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            JSONArray jsonarray;
            int i1;
            i1 = c;
            b.addAll(a);
            a.clear();
            jsonarray = new JSONArray();
            obj = b.iterator();
_L3:
            Object obj1;
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_104;
            }
            obj1 = (AppEvent)((Iterator) (obj)).next();
            if (flag) goto _L2; else goto _L1
_L1:
            if (((AppEvent) (obj1)).b) goto _L3; else goto _L2
_L2:
            jsonarray.put(((AppEvent) (obj1)).a);
              goto _L3
            graphrequest;
            this;
            JVM INSTR monitorexit ;
            throw graphrequest;
            if (jsonarray.length() != 0)
            {
                break MISSING_BLOCK_LABEL_116;
            }
            this;
            JVM INSTR monitorexit ;
            return 0;
            this;
            JVM INSTR monitorexit ;
            obj1 = AppEventsLoggerUtility.a(com.facebook.internal.AppEventsLoggerUtility.GraphAPIActivityType.b, d, f, flag1, AppEventsLogger.f());
            obj = obj1;
            if (c <= 0)
            {
                break MISSING_BLOCK_LABEL_163;
            }
            ((JSONObject) (obj1)).put("num_skipped_events", i1);
            obj = obj1;
_L5:
            graphrequest.c = ((JSONObject) (obj));
            Object obj2 = graphrequest.d;
            obj = obj2;
            if (obj2 == null)
            {
                obj = new Bundle();
            }
            obj2 = jsonarray.toString();
            if (obj2 != null)
            {
                ((Bundle) (obj)).putByteArray("custom_events_file", a(((String) (obj2))));
                graphrequest.f = obj2;
            }
            graphrequest.d = ((Bundle) (obj));
            return jsonarray.length();
            JSONException jsonexception;
            jsonexception;
            jsonexception = new JSONObject();
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void a(AppEvent appevent)
        {
            this;
            JVM INSTR monitorenter ;
            if (a.size() + b.size() < 1000) goto _L2; else goto _L1
_L1:
            c = c + 1;
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            a.add(appevent);
            if (true) goto _L4; else goto _L3
_L3:
            appevent;
            throw appevent;
        }

        public final void a(List list)
        {
            this;
            JVM INSTR monitorenter ;
            a.addAll(list);
            this;
            JVM INSTR monitorexit ;
            return;
            list;
            throw list;
        }

        public final void a(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_20;
            }
            a.addAll(b);
            b.clear();
            c = 0;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final List b()
        {
            this;
            JVM INSTR monitorenter ;
            List list;
            list = a;
            a = new ArrayList();
            this;
            JVM INSTR monitorexit ;
            return list;
            Exception exception;
            exception;
            throw exception;
        }

        public d(com.facebook.internal.a a1, String s, String s1)
        {
            a = new ArrayList();
            b = new ArrayList();
            d = a1;
            e = s;
            f = s1;
        }
    }


    private static final String a = com/facebook/appevents/AppEventsLogger.getCanonicalName();
    private static Map d = new ConcurrentHashMap();
    private static ScheduledThreadPoolExecutor e;
    private static FlushBehavior f;
    private static boolean g;
    private static Context h;
    private static Object i = new Object();
    private static String j;
    private static String k;
    private static boolean l;
    private final String b;
    private final AccessTokenAppIdPair c;

    private AppEventsLogger(Context context, String s)
    {
        n.a(context, "context");
        b = m.c(context);
        AccessToken accesstoken = AccessToken.a();
        if (accesstoken != null && (s == null || s.equals(accesstoken.g)))
        {
            c = new AccessTokenAppIdPair(accesstoken);
        } else
        {
            String s1 = s;
            if (s == null)
            {
                s1 = m.a(context);
            }
            c = new AccessTokenAppIdPair(null, s1);
        }
        synchronized (i)
        {
            if (h == null)
            {
                h = context.getApplicationContext();
            }
        }
        synchronized (i)
        {
            if (e == null)
            {
                break MISSING_BLOCK_LABEL_121;
            }
        }
        return;
        context;
        s;
        JVM INSTR monitorexit ;
        throw context;
        e = new ScheduledThreadPoolExecutor(1);
        context;
        JVM INSTR monitorexit ;
        context = new Runnable() {

            public final void run()
            {
                if (com.facebook.appevents.AppEventsLogger.a() != FlushBehavior.b)
                {
                    AppEventsLogger.b(FlushReason.b);
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
                for (Iterator iterator1 = com.facebook.appevents.AppEventsLogger.d().keySet().iterator(); iterator1.hasNext(); ((Set) (obj1)).add(((AccessTokenAppIdPair)iterator1.next()).b)) { }
                break MISSING_BLOCK_LABEL_64;
                obj1;
                obj;
                JVM INSTR monitorexit ;
                throw obj1;
                obj;
                JVM INSTR monitorexit ;
                for (Iterator iterator = ((Set) (obj1)).iterator(); iterator.hasNext(); m.a((String)iterator.next(), true)) { }
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

    private static a a(FlushReason flushreason, Set set)
    {
        a a1 = new a((byte)0);
        boolean flag = com.facebook.g.b(h);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = set.iterator();
        do
        {
            if (iterator.hasNext())
            {
                AccessTokenAppIdPair accesstokenappidpair = (AccessTokenAppIdPair)iterator.next();
                d d1 = a(accesstokenappidpair);
                if (d1 != null)
                {
                    set = accesstokenappidpair.b;
                    com.facebook.internal.m.b b1 = m.a(set, false);
                    GraphRequest graphrequest = GraphRequest.a(String.format("%s/activities", new Object[] {
                        set
                    }), null);
                    Bundle bundle = graphrequest.d;
                    set = bundle;
                    if (bundle == null)
                    {
                        set = new Bundle();
                    }
                    set.putString("access_token", accesstokenappidpair.a);
                    graphrequest.d = set;
                    if (b1 == null)
                    {
                        set = null;
                    } else
                    {
                        int i1 = d1.a(graphrequest, b1.a, flag);
                        if (i1 == 0)
                        {
                            set = null;
                        } else
                        {
                            a1.a = i1 + a1.a;
                            graphrequest.a(new com.facebook.GraphRequest.b(accesstokenappidpair, graphrequest, d1, a1) {

                                final AccessTokenAppIdPair a;
                                final GraphRequest b;
                                final d c;
                                final a d;

                                public final void a(j j1)
                                {
                                    com.facebook.appevents.AppEventsLogger.a(a, b, j1, c, d);
                                }

            
            {
                a = accesstokenappidpair;
                b = graphrequest;
                c = d1;
                d = a1;
                super();
            }
                            });
                            set = graphrequest;
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
                    com.facebook.internal.h.a(LoggingBehavior.e, a, "Flushing %d events due to %s.", new Object[] {
                        Integer.valueOf(a1.a), flushreason.toString()
                    });
                    for (flushreason = arraylist.iterator(); flushreason.hasNext(); ((GraphRequest)flushreason.next()).a()) { }
                    return a1;
                }
                return null;
            }
        } while (true);
    }

    static d a(Context context, AccessTokenAppIdPair accesstokenappidpair)
    {
        return b(context, accesstokenappidpair);
    }

    private static d a(AccessTokenAppIdPair accesstokenappidpair)
    {
        synchronized (i)
        {
            accesstokenappidpair = (d)d.get(accesstokenappidpair);
        }
        return accesstokenappidpair;
        accesstokenappidpair;
        obj;
        JVM INSTR monitorexit ;
        throw accesstokenappidpair;
    }

    public static AppEventsLogger a(Context context, String s)
    {
        return new AppEventsLogger(context, s);
    }

    public static void a(Context context)
    {
        Object obj;
        com.facebook.g.a(context);
        obj = m.a(context);
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
        com.facebook.g.a(context, ((String) (obj)));
        obj1 = new AppEventsLogger(context, ((String) (obj)));
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
        e.execute(new Runnable(((AppEventsLogger) (obj1)), l1, ((String) (obj))) {

            final AppEventsLogger a;
            final long b;
            final String c;

            public final void run()
            {
                com.facebook.appevents.AppEventsLogger.a(a, b, c);
            }

            
            {
                a = appeventslogger;
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
            Bundle bundle = ((Intent) (obj1)).getBundleExtra("al_applink_data");
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
        Log.d(com/facebook/appevents/AppEventsLogger.getName(), "To set source application the context of activateApp must be an instance of Activity");
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void a(AccessTokenAppIdPair accesstokenappidpair, GraphRequest graphrequest, j j1, d d1, a a1)
    {
        FacebookRequestError facebookrequesterror = j1.b;
        Object obj = com.facebook.appevents.FlushResult.a;
        String s;
        boolean flag;
        if (facebookrequesterror != null)
        {
            if (facebookrequesterror.c == -1)
            {
                j1 = FlushResult.c;
                s = "Failed: No Connectivity";
            } else
            {
                s = String.format("Failed:\n  Response: %s\n  Error %s", new Object[] {
                    j1.toString(), facebookrequesterror.toString()
                });
                j1 = FlushResult.b;
            }
        } else
        {
            s = "Success";
            j1 = ((j) (obj));
        }
        if (com.facebook.g.a(LoggingBehavior.e))
        {
            obj = (String)graphrequest.f;
            try
            {
                obj = (new JSONArray(((String) (obj)))).toString(2);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = "<Can't encode events for debug logging>";
            }
            com.facebook.internal.h.a(LoggingBehavior.e, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", new Object[] {
                graphrequest.c.toString(), s, obj
            });
        }
        if (facebookrequesterror != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d1.a(flag);
        if (j1 == FlushResult.c)
        {
            com.facebook.appevents.c.a(h, accesstokenappidpair, d1);
        }
        if (j1 != com.facebook.appevents.FlushResult.a && a1.b != FlushResult.c)
        {
            a1.b = j1;
        }
    }

    public static void a(FlushReason flushreason)
    {
        com.facebook.g.e().execute(new Runnable(flushreason) {

            final FlushReason a;

            public final void run()
            {
                AppEventsLogger.b(a);
            }

            
            {
                a = flushreason;
                super();
            }
        });
    }

    static void a(AppEventsLogger appeventslogger, long l1)
    {
        com.facebook.appevents.b.a(h, appeventslogger.c, l1);
    }

    static void a(AppEventsLogger appeventslogger, long l1, String s)
    {
        com.facebook.appevents.b.a(h, appeventslogger.c, appeventslogger, l1, s);
    }

    public static void a(String s)
    {
        com.facebook.internal.h.a(LoggingBehavior.f, "AppEvents", s);
    }

    private void a(String s, Double double1, Bundle bundle, boolean flag)
    {
        s = new AppEvent(b, s, double1, bundle, flag);
        double1 = h;
        bundle = c;
        com.facebook.g.e().execute(new Runnable(double1, bundle, s) {

            final Context a;
            final AccessTokenAppIdPair b;
            final AppEvent c;

            public final void run()
            {
                com.facebook.appevents.AppEventsLogger.a(a, b).a(c);
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

    private static d b(Context context, AccessTokenAppIdPair accesstokenappidpair)
    {
        com.facebook.internal.a a1;
        d d1 = (d)d.get(accesstokenappidpair);
        a1 = null;
        if (d1 == null)
        {
            a1 = com.facebook.internal.a.a(context);
        }
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        d d3 = (d)d.get(accesstokenappidpair);
        d d2;
        d2 = d3;
        if (d3 != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        d2 = new d(a1, context.getPackageName(), d(context));
        d.put(accesstokenappidpair, d2);
        obj;
        JVM INSTR monitorexit ;
        return d2;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void b()
    {
        a(com.facebook.appevents.FlushReason.a);
    }

    public static void b(Context context)
    {
        String s = m.a(context);
        if (context == null || s == null)
        {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        } else
        {
            k();
            context = new AppEventsLogger(context, s);
            long l1 = System.currentTimeMillis();
            e.execute(new Runnable(context, l1) {

                final AppEventsLogger a;
                final long b;

                public final void run()
                {
                    com.facebook.appevents.AppEventsLogger.a(a, b);
                }

            
            {
                a = appeventslogger;
                b = l1;
                super();
            }
            });
            return;
        }
    }

    static void b(FlushReason flushreason)
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
            flushreason = a(flushreason, hashset);
        }
        // Misplaced declaration of an exception variable
        catch (FlushReason flushreason)
        {
            m.a(a, "Caught unexpected exception while flushing: ", flushreason);
            flushreason = ((FlushReason) (obj));
        }
        synchronized (i)
        {
            g = false;
        }
        if (flushreason != null)
        {
            obj = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", ((a) (flushreason)).a);
            ((Intent) (obj)).putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", ((a) (flushreason)).b);
            android.support.v4.b.d.a(h).a(((Intent) (obj)));
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

    public static AppEventsLogger c(Context context)
    {
        return new AppEventsLogger(context, null);
    }

    static Object c()
    {
        return i;
    }

    public static String d(Context context)
    {
        if (j != null) goto _L2; else goto _L1
_L1:
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        String s;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        s = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
        j = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        j = (new StringBuilder("XZ")).append(UUID.randomUUID().toString()).toString();
        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", j).apply();
        obj;
        JVM INSTR monitorexit ;
_L2:
        return j;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
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
                a(FlushReason.e);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static Context f()
    {
        return h;
    }

    static String g()
    {
        return a;
    }

    static ScheduledThreadPoolExecutor h()
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
            i1 = ((d)iterator.next()).a() + i1;
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
        c c1 = com.facebook.appevents.c.a(h);
        Iterator iterator = c1.a.keySet().iterator();
        Object obj;
        int i1;
        for (i1 = 0; iterator.hasNext(); i1 = ((List) (obj)).size() + i1)
        {
            obj = (AccessTokenAppIdPair)iterator.next();
            d d1 = b(h, ((AccessTokenAppIdPair) (obj)));
            obj = (List)c1.a.get(obj);
            d1.a(((List) (obj)));
        }

        return i1;
    }

    private static void k()
    {
        k = null;
        l = false;
    }

    public final void a(String s, double d1, Bundle bundle)
    {
        a(s, Double.valueOf(d1), bundle, false);
    }

    public final void a(String s, Bundle bundle)
    {
        a(s, null, bundle, false);
    }

    public final void b(String s, Bundle bundle)
    {
        a(s, null, bundle, true);
    }

    static 
    {
        f = com.facebook.appevents.FlushBehavior.a;
    }
}
