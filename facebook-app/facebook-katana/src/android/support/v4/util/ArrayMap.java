// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package android.support.v4.util:
//            SimpleArrayMap, MapCollections

public class ArrayMap extends SimpleArrayMap
    implements Map
{

    MapCollections a;

    public ArrayMap()
    {
    }

    public ArrayMap(int i)
    {
        super(i);
    }

    private MapCollections a()
    {
        if (a == null)
        {
            a = new _cls1();
        }
        return a;
    }

    public final boolean a(Collection collection)
    {
        return MapCollections.c(this, collection);
    }

    public Set entrySet()
    {
        return a().d();
    }

    public Set keySet()
    {
        return a().e();
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
        return a().f();
    }

    private class _cls1 extends MapCollections
    {

        final ArrayMap a;

        protected final int a()
        {
            return a.h;
        }

        protected final int a(Object obj)
        {
            return a.a(obj);
        }

        protected final Object a(int i, int j)
        {
            return a.g[(i << 1) + j];
        }

        protected final Object a(int i, Object obj)
        {
            return a.a(i, obj);
        }

        protected final void a(int i)
        {
            a.d(i);
        }

        protected final void a(Object obj, Object obj1)
        {
            a.put(obj, obj1);
        }

        protected final int b(Object obj)
        {
            return a.b(obj);
        }

        protected final Map b()
        {
            return a;
        }

        protected final void c()
        {
            a.clear();
        }

        _cls1()
        {
            a = ArrayMap.this;
            super();
        }
    }

}
