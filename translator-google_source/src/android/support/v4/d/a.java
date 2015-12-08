// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.d:
//            m, b, g, i, 
//            j, l

public class a extends m
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
        int k = h + map.size();
        if (super.f.length < k)
        {
            int ai[] = super.f;
            Object aobj[] = super.g;
            super.a(k);
            if (super.h > 0)
            {
                System.arraycopy(ai, 0, super.f, 0, super.h);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (super.g)), 0, super.h << 1);
            }
            m.a(ai, aobj, super.h);
        }
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
