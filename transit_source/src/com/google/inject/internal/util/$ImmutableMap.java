// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.inject.internal.util:
//            $Iterables, $Preconditions, $Maps, $ImmutableSet, 
//            $ImmutableCollection, $Lists, $Hashing, $Iterators, 
//            $UnmodifiableIterator, $AbstractIterator

public abstract class $ImmutableMap
    implements ConcurrentMap, Serializable
{
    public static class Builder
    {

        final List entries = $Lists.newArrayList();

        private static $ImmutableMap fromEntryList(List list)
        {
            switch (list.size())
            {
            default:
                return new RegularImmutableMap((java.util.Map.Entry[])list.toArray(new java.util.Map.Entry[list.size()]));

            case 0: // '\0'
                return $ImmutableMap.of();

            case 1: // '\001'
                return new SingletonImmutableMap((java.util.Map.Entry)$Iterables.getOnlyElement(list));
            }
        }

        public $ImmutableMap build()
        {
            return fromEntryList(entries);
        }

        public Builder put(Object obj, Object obj1)
        {
            entries.add($ImmutableMap.entryOf(obj, obj1));
            return this;
        }

        public Builder putAll(Map map)
        {
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
            }

            return this;
        }

        public Builder()
        {
        }
    }

    private static final class EmptyImmutableMap extends $ImmutableMap
    {

        public boolean containsKey(Object obj)
        {
            return false;
        }

        public boolean containsValue(Object obj)
        {
            return false;
        }

        public $ImmutableSet entrySet()
        {
            return $ImmutableSet.of();
        }

        public volatile Set entrySet()
        {
            return entrySet();
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof Map)
            {
                return ((Map)obj).isEmpty();
            } else
            {
                return false;
            }
        }

        public Object get(Object obj)
        {
            return null;
        }

        public int hashCode()
        {
            return 0;
        }

        public boolean isEmpty()
        {
            return true;
        }

        public $ImmutableSet keySet()
        {
            return $ImmutableSet.of();
        }

        public volatile Set keySet()
        {
            return keySet();
        }

        public int size()
        {
            return 0;
        }

        public String toString()
        {
            return "{}";
        }

        public $ImmutableCollection values()
        {
            return $ImmutableCollection.EMPTY_IMMUTABLE_COLLECTION;
        }

        public volatile Collection values()
        {
            return values();
        }

        private EmptyImmutableMap()
        {
        }

    }

    private static final class RegularImmutableMap extends $ImmutableMap
    {

        private final transient java.util.Map.Entry entries[];
        private transient $ImmutableSet entrySet;
        private transient $ImmutableSet keySet;
        private final transient int keySetHashCode;
        private final transient int mask;
        private final transient Object table[];
        private transient $ImmutableCollection values;

        public boolean containsKey(Object obj)
        {
            return get(obj) != null;
        }

        public boolean containsValue(Object obj)
        {
            if (obj != null)
            {
                java.util.Map.Entry aentry[] = entries;
                int j = aentry.length;
                int i = 0;
                while (i < j) 
                {
                    if (aentry[i].getValue().equals(obj))
                    {
                        return true;
                    }
                    i++;
                }
            }
            return false;
        }

        public $ImmutableSet entrySet()
        {
            $ImmutableSet $immutableset = entrySet;
            Object obj = $immutableset;
            if ($immutableset == null)
            {
                obj = new EntrySet(this);
                entrySet = (($ImmutableSet) (obj));
            }
            return (($ImmutableSet) (obj));
        }

        public volatile Set entrySet()
        {
            return entrySet();
        }

        public Object get(Object obj)
        {
            if (obj != null) goto _L2; else goto _L1
_L1:
            return null;
_L2:
            int i = $Hashing.smear(obj.hashCode());
            do
            {
                int j = (mask & i) * 2;
                Object obj1 = table[j];
                if (obj1 == null)
                {
                    continue;
                }
                if (obj1.equals(obj))
                {
                    return table[j + 1];
                }
                i++;
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
        }

        public boolean isEmpty()
        {
            return false;
        }

        public $ImmutableSet keySet()
        {
            $ImmutableSet $immutableset = keySet;
            Object obj = $immutableset;
            if ($immutableset == null)
            {
                obj = new KeySet(this);
                keySet = (($ImmutableSet) (obj));
            }
            return (($ImmutableSet) (obj));
        }

        public volatile Set keySet()
        {
            return keySet();
        }

        public int size()
        {
            return entries.length;
        }

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder(size() * 16)).append('{').append(entries[0]);
            for (int i = 1; i < entries.length; i++)
            {
                stringbuilder.append(", ").append(entries[i].toString());
            }

            return stringbuilder.append('}').toString();
        }

        public $ImmutableCollection values()
        {
            $ImmutableCollection $immutablecollection = values;
            Object obj = $immutablecollection;
            if ($immutablecollection == null)
            {
                obj = new Values(this);
                values = (($ImmutableCollection) (obj));
            }
            return (($ImmutableCollection) (obj));
        }

        public volatile Collection values()
        {
            return values();
        }



        private transient RegularImmutableMap(java.util.Map.Entry aentry[])
        {
            entries = (java.util.Map.Entry[])aentry;
            int i = $Hashing.chooseTableSize(aentry.length);
            table = new Object[i * 2];
            mask = i - 1;
            int j = 0;
            aentry = entries;
            int l = aentry.length;
            i = 0;
label0:
            do
            {
                if (i < l)
                {
                    Object obj1 = aentry[i];
                    Object obj = ((java.util.Map.Entry) (obj1)).getKey();
                    int i1 = obj.hashCode();
                    int k = $Hashing.smear(i1);
                    do
                    {
                        int j1 = (mask & k) * 2;
                        Object obj2 = table[j1];
                        if (obj2 == null)
                        {
                            obj1 = ((java.util.Map.Entry) (obj1)).getValue();
                            table[j1] = obj;
                            table[j1 + 1] = obj1;
                            j += i1;
                            i++;
                            continue label0;
                        }
                        if (obj2.equals(obj))
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("duplicate key: ").append(obj).toString());
                        }
                        k++;
                    } while (true);
                }
                keySetHashCode = j;
                return;
            } while (true);
        }

    }

    private static class RegularImmutableMap.EntrySet extends .ImmutableSet.ArrayImmutableSet
    {

        final RegularImmutableMap map;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                Object obj1 = map.get(((java.util.Map.Entry) (obj)).getKey());
                flag = flag1;
                if (obj1 != null)
                {
                    flag = flag1;
                    if (obj1.equals(((java.util.Map.Entry) (obj)).getValue()))
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        RegularImmutableMap.EntrySet(RegularImmutableMap regularimmutablemap)
        {
            super(regularimmutablemap.entries);
            map = regularimmutablemap;
        }
    }

    private static class RegularImmutableMap.KeySet extends .ImmutableSet.TransformedImmutableSet
    {

        final RegularImmutableMap map;

        public boolean contains(Object obj)
        {
            return map.containsKey(obj);
        }

        volatile Object transform(Object obj)
        {
            return transform((java.util.Map.Entry)obj);
        }

        Object transform(java.util.Map.Entry entry)
        {
            return entry.getKey();
        }

        RegularImmutableMap.KeySet(RegularImmutableMap regularimmutablemap)
        {
            super(regularimmutablemap.entries, regularimmutablemap.keySetHashCode);
            map = regularimmutablemap;
        }
    }

    private static class RegularImmutableMap.Values extends $ImmutableCollection
    {

        final RegularImmutableMap map;

        public boolean contains(Object obj)
        {
            return map.containsValue(obj);
        }

        public boolean isEmpty()
        {
            return false;
        }

        public $UnmodifiableIterator iterator()
        {
            return $Iterators.unmodifiableIterator(new $AbstractIterator() {

                int index;
                final RegularImmutableMap.Values this$0;

                protected Object computeNext()
                {
                    if (index < map.entries.length)
                    {
                        java.util.Map.Entry aentry[] = map.entries;
                        int i = index;
                        index = i + 1;
                        return aentry[i].getValue();
                    } else
                    {
                        return endOfData();
                    }
                }

            
            {
                this$0 = RegularImmutableMap.Values.this;
                super();
                index = 0;
            }
            });
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return map.entries.length;
        }

        RegularImmutableMap.Values(RegularImmutableMap regularimmutablemap)
        {
            map = regularimmutablemap;
        }
    }

    private static class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Object keys[];
        final Object values[];

        Object readResolve()
        {
            Builder builder1 = new Builder();
            for (int i = 0; i < keys.length; i++)
            {
                builder1.put(keys[i], values[i]);
            }

            return builder1.build();
        }

        SerializedForm($ImmutableMap $immutablemap)
        {
            keys = new Object[$immutablemap.size()];
            values = new Object[$immutablemap.size()];
            int i = 0;
            for ($immutablemap = $immutablemap.entrySet().iterator(); $immutablemap.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)$immutablemap.next();
                keys[i] = entry.getKey();
                values[i] = entry.getValue();
                i++;
            }

        }
    }

    private static final class SingletonImmutableMap extends $ImmutableMap
    {

        private transient java.util.Map.Entry entry;
        private transient $ImmutableSet entrySet;
        private transient $ImmutableSet keySet;
        private final transient Object singleKey;
        private final transient Object singleValue;
        private transient $ImmutableCollection values;

        private java.util.Map.Entry entry()
        {
            java.util.Map.Entry entry2 = entry;
            java.util.Map.Entry entry1 = entry2;
            if (entry2 == null)
            {
                entry1 = $Maps.immutableEntry(singleKey, singleValue);
                entry = entry1;
            }
            return entry1;
        }

        public boolean containsKey(Object obj)
        {
            return singleKey.equals(obj);
        }

        public boolean containsValue(Object obj)
        {
            return singleValue.equals(obj);
        }

        public $ImmutableSet entrySet()
        {
            $ImmutableSet $immutableset1 = entrySet;
            $ImmutableSet $immutableset = $immutableset1;
            if ($immutableset1 == null)
            {
                $immutableset = $ImmutableSet.of(entry());
                entrySet = $immutableset;
            }
            return $immutableset;
        }

        public volatile Set entrySet()
        {
            return entrySet();
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof Map)
                {
                    obj = (Map)obj;
                    if (((Map) (obj)).size() != 1)
                    {
                        return false;
                    }
                    obj = (java.util.Map.Entry)((Map) (obj)).entrySet().iterator().next();
                    if (!singleKey.equals(((java.util.Map.Entry) (obj)).getKey()) || !singleValue.equals(((java.util.Map.Entry) (obj)).getValue()))
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

        public Object get(Object obj)
        {
            if (singleKey.equals(obj))
            {
                return singleValue;
            } else
            {
                return null;
            }
        }

        public int hashCode()
        {
            return singleKey.hashCode() ^ singleValue.hashCode();
        }

        public boolean isEmpty()
        {
            return false;
        }

        public $ImmutableSet keySet()
        {
            $ImmutableSet $immutableset1 = keySet;
            $ImmutableSet $immutableset = $immutableset1;
            if ($immutableset1 == null)
            {
                $immutableset = $ImmutableSet.of(singleKey);
                keySet = $immutableset;
            }
            return $immutableset;
        }

        public volatile Set keySet()
        {
            return keySet();
        }

        public int size()
        {
            return 1;
        }

        public String toString()
        {
            return (new StringBuilder()).append('{').append(singleKey.toString()).append('=').append(singleValue.toString()).append('}').toString();
        }

        public $ImmutableCollection values()
        {
            $ImmutableCollection $immutablecollection = values;
            Object obj = $immutablecollection;
            if ($immutablecollection == null)
            {
                obj = new Values(singleValue);
                values = (($ImmutableCollection) (obj));
            }
            return (($ImmutableCollection) (obj));
        }

        public volatile Collection values()
        {
            return values();
        }

        private SingletonImmutableMap(Object obj, Object obj1)
        {
            singleKey = obj;
            singleValue = obj1;
        }


        private SingletonImmutableMap(java.util.Map.Entry entry1)
        {
            entry = entry1;
            singleKey = entry1.getKey();
            singleValue = entry1.getValue();
        }

    }

    private static class SingletonImmutableMap.Values extends $ImmutableCollection
    {

        final Object singleValue;

        public boolean contains(Object obj)
        {
            return singleValue.equals(obj);
        }

        public boolean isEmpty()
        {
            return false;
        }

        public $UnmodifiableIterator iterator()
        {
            return $Iterators.singletonIterator(singleValue);
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            return 1;
        }

        SingletonImmutableMap.Values(Object obj)
        {
            singleValue = obj;
        }
    }


    private static final $ImmutableMap EMPTY_IMMUTABLE_MAP = new EmptyImmutableMap();

    $ImmutableMap()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static $ImmutableMap copyOf(Map map)
    {
        if (map instanceof $ImmutableMap)
        {
            return ($ImmutableMap)map;
        }
        int i = map.size();
        java.util.Map.Entry aentry[];
        switch (i)
        {
        default:
            aentry = new java.util.Map.Entry[i];
            i = 0;
            for (map = map.entrySet().iterator(); map.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                aentry[i] = entryOf(entry.getKey(), entry.getValue());
                i++;
            }

            break;

        case 0: // '\0'
            return of();

        case 1: // '\001'
            map = (java.util.Map.Entry)$Iterables.getOnlyElement(map.entrySet());
            return of(map.getKey(), map.getValue());
        }
        return new RegularImmutableMap(aentry);
    }

    private static java.util.Map.Entry entryOf(Object obj, Object obj1)
    {
        return $Maps.immutableEntry($Preconditions.checkNotNull(obj), $Preconditions.checkNotNull(obj1));
    }

    public static $ImmutableMap of()
    {
        return EMPTY_IMMUTABLE_MAP;
    }

    public static $ImmutableMap of(Object obj, Object obj1)
    {
        return new SingletonImmutableMap($Preconditions.checkNotNull(obj), $Preconditions.checkNotNull(obj1));
    }

    public static $ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new RegularImmutableMap(new java.util.Map.Entry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3)
        });
    }

    public static $ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        return new RegularImmutableMap(new java.util.Map.Entry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5)
        });
    }

    public static $ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return new RegularImmutableMap(new java.util.Map.Entry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7)
        });
    }

    public static $ImmutableMap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        return new RegularImmutableMap(new java.util.Map.Entry[] {
            entryOf(obj, obj1), entryOf(obj2, obj3), entryOf(obj4, obj5), entryOf(obj6, obj7), entryOf(obj8, obj9)
        });
    }

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public abstract boolean containsKey(Object obj);

    public abstract boolean containsValue(Object obj);

    public abstract $ImmutableSet entrySet();

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return entrySet().hashCode();
    }

    public abstract $ImmutableSet keySet();

    public volatile Set keySet()
    {
        return keySet();
    }

    public final Object put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map)
    {
        throw new UnsupportedOperationException();
    }

    public final Object putIfAbsent(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final Object replace(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean replace(Object obj, Object obj1, Object obj2)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(size() * 16)).append('{');
        $UnmodifiableIterator $unmodifiableiterator = entrySet().iterator();
        stringbuilder.append($unmodifiableiterator.next());
        for (; $unmodifiableiterator.hasNext(); stringbuilder.append(", ").append($unmodifiableiterator.next())) { }
        return stringbuilder.append('}').toString();
    }

    public abstract $ImmutableCollection values();

    public volatile Collection values()
    {
        return values();
    }

    Object writeReplace()
    {
        return new SerializedForm(this);
    }


}
