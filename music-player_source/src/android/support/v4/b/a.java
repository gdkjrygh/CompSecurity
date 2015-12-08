// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.b:
//            l, b, f, h, 
//            i, k

public class a extends l
    implements Map
{

    f a;

    public a()
    {
    }

    private f b()
    {
        if (a == null)
        {
            a = new b(this);
        }
        return a;
    }

    public Set entrySet()
    {
        f f1 = b();
        if (f1.b == null)
        {
            f1.b = new h(f1);
        }
        return f1.b;
    }

    public Set keySet()
    {
        f f1 = b();
        if (f1.c == null)
        {
            f1.c = new i(f1);
        }
        return f1.c;
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
        f f1 = b();
        if (f1.d == null)
        {
            f1.d = new k(f1);
        }
        return f1.d;
    }
}
