// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.Context;
import android.os.Bundle;
import com.facebook.aq;
import com.facebook.b.al;
import com.facebook.b.z;
import com.facebook.m;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class i
    implements Serializable
{

    private static final HashSet c = new HashSet();
    private JSONObject a;
    private boolean b;
    private String d;

    public i(Context context, String s, Double double1, Bundle bundle, boolean flag)
    {
        a(s);
        d = s;
        b = flag;
        a = new JSONObject();
        a.put("_eventName", s);
        a.put("_logTime", System.currentTimeMillis() / 1000L);
        a.put("_ui", al.c(context));
        if (double1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        a.put("_valueToSum", double1.doubleValue());
        if (b)
        {
            a.put("_implicitlyLogged", "1");
        }
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
            throw new m(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[] {
                double1, s
            }));
        }
          goto _L4
        context;
        z.a(aq.e, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] {
            context.toString()
        });
        a = null;
_L7:
        return;
_L4:
        a.put(s, double1.toString());
          goto _L5
        context;
        z.a(aq.e, "AppEvents", "Invalid app event name or parameter:", new Object[] {
            context.toString()
        });
        a = null;
        return;
_L2:
        if (b) goto _L7; else goto _L6
_L6:
        z.a(aq.e, "AppEvents", "Created app event '%s'", new Object[] {
            a.toString()
        });
        return;
          goto _L5
    }

    private void a(String s)
    {
        if (s == null || s.length() == 0 || s.length() > 40)
        {
            String s1 = s;
            if (s == null)
            {
                s1 = "<None Provided>";
            }
            throw new m(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[] {
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
        throw new m(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[] {
            s
        }));
    }

    public boolean a()
    {
        return b;
    }

    public JSONObject b()
    {
        return a;
    }

    public String toString()
    {
        return String.format("\"%s\", implicit: %b, json: %s", new Object[] {
            a.optString("_eventName"), Boolean.valueOf(b), a.toString()
        });
    }

}
