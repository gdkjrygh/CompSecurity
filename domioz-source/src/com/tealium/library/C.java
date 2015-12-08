// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package com.tealium.library:
//            A, z

final class C extends A
{

    public C()
    {
    }

    public C(String s)
    {
        super(s);
    }

    public C(Map map)
    {
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                c((String)entry.getKey(), entry.getValue());
            }
        }
    }

    private C b(String s, double d1)
    {
        s = s.toLowerCase(Locale.ROOT);
        if (!has(s))
        {
            super.a(s, d1);
        }
        return this;
    }

    private C b(String s, int i)
    {
        s = s.toLowerCase(Locale.ROOT);
        if (!has(s))
        {
            super.a(s, i);
        }
        return this;
    }

    private C b(String s, long l)
    {
        s = s.toLowerCase(Locale.ROOT);
        if (!has(s))
        {
            super.a(s, l);
        }
        return this;
    }

    private C b(String s, boolean flag)
    {
        s = s.toLowerCase(Locale.ROOT);
        if (!has(s))
        {
            super.a(s, flag);
        }
        return this;
    }

    private C e(String s, Object obj)
    {
        s = s.toLowerCase(Locale.ROOT);
        if (!has(s))
        {
            super.b(s, obj);
        }
        return this;
    }

    public final A a(String s, double d1)
    {
        return b(s, d1);
    }

    public final A a(String s, int i)
    {
        return b(s, i);
    }

    public final A a(String s, long l)
    {
        return b(s, l);
    }

    public final A a(String s, Object obj)
    {
        return e(s, obj);
    }

    public final A a(String s, boolean flag)
    {
        return b(s, flag);
    }

    public final C a()
    {
        Iterator iterator = keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = get(s);
            if (obj instanceof z)
            {
                ((z)obj).a();
            } else
            if (!(obj instanceof String))
            {
                d(s.toLowerCase(Locale.ROOT), obj.toString());
            }
        } while (true);
        return this;
    }

    public final A b(String s, Object obj)
    {
        return c(s, obj);
    }

    final String b()
    {
        return String.format(Locale.ROOT, "utag.track('%s',%s)", new Object[] {
            get("call_type"), toString()
        });
    }

    final void b(Map map)
    {
        if (map == null)
        {
            throw new IllegalArgumentException("Given map must not be null");
        }
        String s;
        for (Iterator iterator = keys(); iterator.hasNext(); map.put(s, get(s)))
        {
            s = (String)iterator.next();
        }

    }

    public final C c(String s, Object obj)
    {
        s = s.toLowerCase(Locale.ROOT);
        if (!has(s))
        {
            super.b(s, obj);
        }
        return this;
    }

    public final C d(String s, Object obj)
    {
        super.b(s.toLowerCase(Locale.ROOT), obj);
        return this;
    }

    public final JSONObject put(String s, double d1)
    {
        return b(s, d1);
    }

    public final JSONObject put(String s, int i)
    {
        return b(s, i);
    }

    public final JSONObject put(String s, long l)
    {
        return b(s, l);
    }

    public final JSONObject put(String s, Object obj)
    {
        return c(s, obj);
    }

    public final JSONObject put(String s, boolean flag)
    {
        return b(s, flag);
    }

    public final JSONObject putOpt(String s, Object obj)
    {
        return e(s, obj);
    }
}
