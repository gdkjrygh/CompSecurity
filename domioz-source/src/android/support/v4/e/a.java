// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.e:
//            p, b, g, i, 
//            j, l

public class a extends p
    implements Map
{

    g a;

    public a()
    {
    }

    private g a()
    {
        if (a == null)
        {
            a = new b(this);
        }
        return a;
    }

    public final boolean a(Collection collection)
    {
        return g.a(this, collection);
    }

    public Set entrySet()
    {
        g g1 = a();
        if (g1.b == null)
        {
            g1.b = new i(g1);
        }
        return g1.b;
    }

    public Set keySet()
    {
        g g1 = a();
        if (g1.c == null)
        {
            g1.c = new j(g1);
        }
        return g1.c;
    }

    public void putAll(Map map)
    {
        a(h + map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        g g1 = a();
        if (g1.d == null)
        {
            g1.d = new l(g1);
        }
        return g1.d;
    }
}
