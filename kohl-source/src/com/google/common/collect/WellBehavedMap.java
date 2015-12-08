// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap, Sets, AbstractMapEntry

final class WellBehavedMap extends ForwardingMap
{
    private static class KeyToEntryConverter extends Sets.InvertibleFunction
    {

        final Map map;

        public volatile Object apply(Object obj)
        {
            return apply(obj);
        }

        public java.util.Map.Entry apply(Object obj)
        {
            return ((_cls1) (obj)). new AbstractMapEntry() {

                final KeyToEntryConverter this$0;
                final Object val$key;

                public Object getKey()
                {
                    return key;
                }

                public Object getValue()
                {
                    return map.get(key);
                }

                public Object setValue(Object obj)
                {
                    return map.put(key, obj);
                }

            
            {
                this$0 = final_keytoentryconverter;
                key = Object.this;
                super();
            }
            };
        }

        public volatile Object invert(Object obj)
        {
            return invert((java.util.Map.Entry)obj);
        }

        public Object invert(java.util.Map.Entry entry)
        {
            return entry.getKey();
        }

        KeyToEntryConverter(Map map1)
        {
            map = map1;
        }
    }


    private final Map _flddelegate;
    private Set entrySet;

    private WellBehavedMap(Map map)
    {
        _flddelegate = map;
    }

    static WellBehavedMap wrap(Map map)
    {
        return new WellBehavedMap(map);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Map _mthdelegate()
    {
        return _flddelegate;
    }

    public Set entrySet()
    {
        Set set = entrySet;
        if (set != null)
        {
            return set;
        } else
        {
            Set set1 = Sets.transform(_flddelegate.keySet(), new KeyToEntryConverter(this));
            entrySet = set1;
            return set1;
        }
    }
}
