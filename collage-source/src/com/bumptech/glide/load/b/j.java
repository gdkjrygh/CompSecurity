// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load.b:
//            e, i

public final class j
    implements e
{
    public static final class a
    {

        private static final String a = System.getProperty("http.agent");
        private static final Map b;
        private boolean c;
        private boolean d;
        private Map e;
        private boolean f;

        public j a()
        {
            c = true;
            return new j(e);
        }

        static 
        {
            HashMap hashmap = new HashMap(2);
            if (!TextUtils.isEmpty(a))
            {
                hashmap.put("User-Agent", Collections.singletonList(new b(a)));
            }
            hashmap.put("Accept-Encoding", Collections.singletonList(new b("identity")));
            b = Collections.unmodifiableMap(hashmap);
        }

        public a()
        {
            c = true;
            d = true;
            e = b;
            f = e.containsKey(a);
        }
    }

    static final class b
        implements i
    {

        private final String a;

        public String a()
        {
            return a;
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof b)
            {
                obj = (b)obj;
                return a.equals(((b) (obj)).a);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return a.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("StringHeaderFactory{value='").append(a).append('\'').append('}').toString();
        }

        b(String s)
        {
            a = s;
        }
    }


    private final Map c;
    private volatile Map d;

    j(Map map)
    {
        c = Collections.unmodifiableMap(map);
    }

    private Map b()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        StringBuilder stringbuilder;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); hashmap.put(entry.getKey(), stringbuilder.toString()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            stringbuilder = new StringBuilder();
            List list = (List)entry.getValue();
            for (int k = 0; k < list.size(); k++)
            {
                stringbuilder.append(((i)list.get(k)).a());
                if (k != list.size() - 1)
                {
                    stringbuilder.append(',');
                }
            }

        }

        return hashmap;
    }

    public Map a()
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = Collections.unmodifiableMap(b());
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return d;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof j)
        {
            obj = (j)obj;
            return c.equals(((j) (obj)).c);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return c.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("LazyHeaders{headers=").append(c).append('}').toString();
    }
}
