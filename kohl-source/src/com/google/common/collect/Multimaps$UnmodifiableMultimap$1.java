// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap, Multimaps

class val.unmodifiableMap extends ForwardingMap
{

    Collection asMapValues;
    Set entrySet;
    final asMapValues this$0;
    final Map val$unmodifiableMap;

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Map _mthdelegate()
    {
        return val$unmodifiableMap;
    }

    public Set entrySet()
    {
        Set set1 = entrySet;
        Set set = set1;
        if (set1 == null)
        {
            set = Multimaps.access$000(val$unmodifiableMap.entrySet());
            entrySet = set;
        }
        return set;
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public Collection get(Object obj)
    {
        obj = (Collection)val$unmodifiableMap.get(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return Multimaps.access$100(((Collection) (obj)));
        }
    }

    public Collection values()
    {
        Collection collection = asMapValues;
        Object obj = collection;
        if (collection == null)
        {
            obj = new (val$unmodifiableMap.values());
            asMapValues = ((Collection) (obj));
        }
        return ((Collection) (obj));
    }

    ()
    {
        this$0 = final_;
        val$unmodifiableMap = Map.this;
        super();
    }
}
