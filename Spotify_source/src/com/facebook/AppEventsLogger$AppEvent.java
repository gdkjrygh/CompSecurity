// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.os.Bundle;
import aph;
import arb;
import arp;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            FacebookException, LoggingBehavior

public class <init>
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
                return new AppEventsLogger.AppEvent(jsonString, isImplicit, (byte)0);
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


    public SerializationProxyV1(Context context, String s, Double double1, Bundle bundle, boolean flag)
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

    private jsonObject(String s, boolean flag)
    {
        jsonObject = new JSONObject(s);
        isImplicit = flag;
    }

    isImplicit(String s, boolean flag, byte byte0)
    {
        this(s, flag);
    }
}
