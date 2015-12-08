// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tealium.library:
//            A, z

class <init>
{

    private final String a;
    private final String b;
    private final String c;
    private final String d;

    static IllegalStateException a(String s)
    {
        return new IllegalStateException(String.format(Locale.ROOT, "\"%s\" was called when the response has already been sent.", new Object[] {
            s
        }));
    }

    static Object a(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof Map)
        {
            return new A((Map)obj);
        }
        if (obj instanceof JSONObject)
        {
            return new A((JSONObject)obj);
        }
        if (obj instanceof Collection)
        {
            return new z((Collection)obj);
        }
        if (obj.getClass().isArray())
        {
            return new z(obj);
        }
        if (obj instanceof JSONArray)
        {
            return new z((JSONArray)obj);
        } else
        {
            return obj.toString();
        }
    }

    static String a(g g)
    {
        return g.d;
    }

    static String a(d d1, String s)
    {
        return String.format(Locale.ROOT, "ts_l_s_c_%s", new Object[] {
            s
        });
    }

    static String a(String s, JSONObject jsonobject)
    {
        String s1;
        try
        {
            s1 = String.format(Locale.ROOT, "Calling remote command \"%s\" with argument %s", new Object[] {
                s, jsonobject.toString(4)
            });
        }
        catch (JSONException jsonexception)
        {
            return String.format(Locale.ROOT, "Calling remote command \"%s\" with argument %s", new Object[] {
                s, jsonobject.toString()
            });
        }
        return s1;
    }

    static String b(ring ring)
    {
        return ring.a;
    }

    static String c(a a1)
    {
        return a1.b;
    }

    static String d(b b1)
    {
        return b1.c;
    }

    private ception(String s)
    {
        a = String.format(Locale.ROOT, "c_l_%s", new Object[] {
            s
        });
        b = String.format(Locale.ROOT, "c_s_%s", new Object[] {
            s
        });
        c = String.format(Locale.ROOT, "c_t_%s", new Object[] {
            s
        });
        d = String.format(Locale.ROOT, "c_w_%s", new Object[] {
            s
        });
    }

    d(String s, byte byte0)
    {
        this(s);
    }
}
