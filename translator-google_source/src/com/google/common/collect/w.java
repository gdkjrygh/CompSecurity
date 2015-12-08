// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            de, ec, y, x, 
//            dc, dh, z, bl, 
//            Maps, dl

abstract class w
    implements de
{

    private transient Collection a;
    private transient Set b;
    private transient dl c;
    private transient Collection d;
    private transient Map e;

    w()
    {
    }

    public Map asMap()
    {
        Map map1 = e;
        Map map = map1;
        if (map1 == null)
        {
            map = createAsMap();
            e = map;
        }
        return map;
    }

    public boolean containsEntry(Object obj, Object obj1)
    {
        obj = (Collection)asMap().get(obj);
        return obj != null && ((Collection) (obj)).contains(obj1);
    }

    public boolean containsValue(Object obj)
    {
        for (Iterator iterator = asMap().values().iterator(); iterator.hasNext();)
        {
            if (((Collection)iterator.next()).contains(obj))
            {
                return true;
            }
        }

        return false;
    }

    abstract Map createAsMap();

    Collection createEntries()
    {
        if (this instanceof ec)
        {
            return new y(this);
        } else
        {
            return new x(this, (byte)0);
        }
    }

    Set createKeySet()
    {
        return new dc(asMap());
    }

    dl createKeys()
    {
        return new dh(this);
    }

    Collection createValues()
    {
        return new z(this);
    }

    public Collection entries()
    {
        Collection collection1 = a;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createEntries();
            a = collection;
        }
        return collection;
    }

    abstract Iterator entryIterator();

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof de)
        {
            obj = (de)obj;
            return asMap().equals(((de) (obj)).asMap());
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return asMap().hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Set keySet()
    {
        Set set1 = b;
        Set set = set1;
        if (set1 == null)
        {
            set = createKeySet();
            b = set;
        }
        return set;
    }

    public dl keys()
    {
        dl dl1 = c;
        dl dl = dl1;
        if (dl1 == null)
        {
            dl = createKeys();
            c = dl;
        }
        return dl;
    }

    public boolean put(Object obj, Object obj1)
    {
        return get(obj).add(obj1);
    }

    public boolean putAll(de de1)
    {
        de1 = de1.entries().iterator();
        java.util.Map.Entry entry;
        boolean flag;
        for (flag = false; de1.hasNext(); flag = put(entry.getKey(), entry.getValue()) | flag)
        {
            entry = (java.util.Map.Entry)de1.next();
        }

        return flag;
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        p.a(iterable);
        if (!(iterable instanceof Collection)) goto _L2; else goto _L1
_L1:
        iterable = (Collection)iterable;
        if (iterable.isEmpty() || !get(obj).addAll(iterable)) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        iterable = iterable.iterator();
        if (!iterable.hasNext() || !bl.a(get(obj), iterable))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean remove(Object obj, Object obj1)
    {
        obj = (Collection)asMap().get(obj);
        return obj != null && ((Collection) (obj)).remove(obj1);
    }

    public Collection replaceValues(Object obj, Iterable iterable)
    {
        p.a(iterable);
        Collection collection = removeAll(obj);
        putAll(obj, iterable);
        return collection;
    }

    public String toString()
    {
        return asMap().toString();
    }

    Iterator valueIterator()
    {
        return Maps.b(entries().iterator());
    }

    public Collection values()
    {
        Collection collection1 = d;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createValues();
            d = collection;
        }
        return collection;
    }
}
