// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.h;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

static class <init>
    implements Serializable
{
    private static class SerializationProxyV1
        implements Serializable
    {

        private static final long serialVersionUID = 0xdd772aee317ab613L;
        private final String a;
        private final boolean b;

        private Object readResolve()
            throws JSONException
        {
            return new AppEventsLogger.AppEvent(a, b, (byte)0);
        }

        private SerializationProxyV1(String s, boolean flag)
        {
            a = s;
            b = flag;
        }

        SerializationProxyV1(String s, boolean flag, byte byte0)
        {
            this(s, flag);
        }
    }


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


    public SerializationProxyV1(String s, String s1, Double double1, Bundle bundle, boolean flag)
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
        h.a(LoggingBehavior.e, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] {
            s.toString()
        });
        a = null;
_L7:
        return;
_L4:
        a.put(s1, double1.toString());
          goto _L5
        s;
        h.a(LoggingBehavior.e, "AppEvents", "Invalid app event name or parameter:", new Object[] {
            s.toString()
        });
        a = null;
        return;
_L2:
        if (b) goto _L7; else goto _L6
_L6:
        h.a(LoggingBehavior.e, "AppEvents", "Created app event '%s'", new Object[] {
            a.toString()
        });
        return;
          goto _L5
    }

    private a(String s, boolean flag)
        throws JSONException
    {
        a = new JSONObject(s);
        b = flag;
    }

    b(String s, boolean flag, byte byte0)
        throws JSONException
    {
        this(s, flag);
    }
}
