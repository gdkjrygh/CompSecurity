// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            SetMultimap, Multimaps, Maps, Multimap, 
//            Multisets, Collections2, Multiset, AbstractMapEntry

private static class l
    implements SetMultimap, Serializable
{
    class AsMap extends Maps.ImprovedAbstractMap
    {

        final Multimaps.MapMultimap this$0;

        public boolean containsKey(Object obj)
        {
            return map.containsKey(obj);
        }

        protected Set createEntrySet()
        {
            return new AsMapEntries();
        }

        public volatile Object get(Object obj)
        {
            return get(obj);
        }

        public Collection get(Object obj)
        {
            Set set = Multimaps.MapMultimap.this.get(obj);
            obj = set;
            if (set.isEmpty())
            {
                obj = null;
            }
            return ((Collection) (obj));
        }

        public volatile Object remove(Object obj)
        {
            return remove(obj);
        }

        public Collection remove(Object obj)
        {
            Set set = removeAll(obj);
            obj = set;
            if (set.isEmpty())
            {
                obj = null;
            }
            return ((Collection) (obj));
        }

        AsMap()
        {
            this$0 = Multimaps.MapMultimap.this;
            super();
        }
    }

    class AsMapEntries extends AbstractSet
    {

        final Multimaps.MapMultimap this$0;

        public boolean contains(Object obj)
        {
            boolean flag = true;
            if (obj instanceof java.util.Map.Entry)
            {
                if (((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getValue() instanceof Set)
                {
                    Set set = (Set)((java.util.Map.Entry) (obj)).getValue();
                    if (set.size() != 1 || !containsEntry(((java.util.Map.Entry) (obj)).getKey(), set.iterator().next()))
                    {
                        flag = false;
                    }
                    return flag;
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return new Iterator() {

                final Iterator keys;
                final AsMapEntries this$1;

                public boolean hasNext()
                {
                    return keys.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return ((_cls1) (keys.next())). new AbstractMapEntry() {

                        final AsMapEntries._cls1 this$2;
                        final Object val$key;

                        public Object getKey()
                        {
                            return key;
                        }

                        public volatile Object getValue()
                        {
                            return getValue();
                        }

                        public Collection getValue()
                        {
                            return get(key);
                        }

            
            {
                this$2 = final__pcls1;
                key = Object.this;
                super();
            }
                    };
                }

                public void remove()
                {
                    keys.remove();
                }

            
            {
                this$1 = AsMapEntries.this;
                super();
                keys = map.keySet().iterator();
            }
            };
        }

        public boolean remove(Object obj)
        {
            boolean flag = true;
            if (obj instanceof java.util.Map.Entry)
            {
                if (((java.util.Map.Entry) (obj = (java.util.Map.Entry)obj)).getValue() instanceof Set)
                {
                    Set set = (Set)((java.util.Map.Entry) (obj)).getValue();
                    if (set.size() != 1 || !map.entrySet().remove(Maps.immutableEntry(((java.util.Map.Entry) (obj)).getKey(), set.iterator().next())))
                    {
                        flag = false;
                    }
                    return flag;
                }
            }
            return false;
        }

        public int size()
        {
            return map.size();
        }

        AsMapEntries()
        {
            this$0 = Multimaps.MapMultimap.this;
            super();
        }
    }


    private static final com.google.common.base.ap.map JOINER = Joiner.on("], ").withKeyValueSeparator("=[").rNull("null");
    private static final long serialVersionUID = 0x6cdfd44a398c560fL;
    transient Map asMap;
    final Map map;

    public Map asMap()
    {
        Map map1 = asMap;
        Object obj = map1;
        if (map1 == null)
        {
            obj = new AsMap();
            asMap = ((Map) (obj));
        }
        return ((Map) (obj));
    }

    public void clear()
    {
        map.clear();
    }

    public boolean containsEntry(Object obj, Object obj1)
    {
        return map.entrySet().contains(Maps.immutableEntry(obj, obj1));
    }

    public boolean containsKey(Object obj)
    {
        return map.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return map.containsValue(obj);
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public Set entries()
    {
        return map.entrySet();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof Multimap)
            {
                if (size() != ((Multimap) (obj = (Multimap)obj)).size() || !asMap().equals(((Multimap) (obj)).asMap()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public Set get(final Object key)
    {
        return new AbstractSet() {

            final Multimaps.MapMultimap this$0;
            final Object val$key;

            public Iterator iterator()
            {
                return new Iterator() {

                    int i;
                    final _cls1 this$1;

                    public boolean hasNext()
                    {
                        return i == 0 && map.containsKey(key);
                    }

                    public Object next()
                    {
                        if (!hasNext())
                        {
                            throw new NoSuchElementException();
                        } else
                        {
                            i = i + 1;
                            return map.get(key);
                        }
                    }

                    public void remove()
                    {
                        boolean flag = true;
                        if (i != 1)
                        {
                            flag = false;
                        }
                        Preconditions.checkState(flag);
                        i = -1;
                        map.remove(key);
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                };
            }

            public int size()
            {
                return !map.containsKey(key) ? 0 : 1;
            }

            
            {
                this$0 = Multimaps.MapMultimap.this;
                key = obj;
                super();
            }
        };
    }

    public int hashCode()
    {
        return map.hashCode();
    }

    public boolean isEmpty()
    {
        return map.isEmpty();
    }

    public Set keySet()
    {
        return map.keySet();
    }

    public Multiset keys()
    {
        return Multisets.forSet(map.keySet());
    }

    public boolean put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Multimap multimap)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj, Object obj1)
    {
        return map.entrySet().remove(Maps.immutableEntry(obj, obj1));
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public Set removeAll(Object obj)
    {
        HashSet hashset = new HashSet(2);
        if (!map.containsKey(obj))
        {
            return hashset;
        } else
        {
            hashset.add(map.remove(obj));
            return hashset;
        }
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public Set replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return map.size();
    }

    public String toString()
    {
        if (map.isEmpty())
        {
            return "{}";
        } else
        {
            StringBuilder stringbuilder = Collections2.newStringBuilderForCollection(map.size()).append('{');
            JOINER.dTo(stringbuilder, map);
            return stringbuilder.append("]}").toString();
        }
    }

    public Collection values()
    {
        return map.values();
    }


    _cls1.val.key(Map map1)
    {
        map = (Map)Preconditions.checkNotNull(map1);
    }
}
