// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            Collections2, CollectPreconditions, ImmutableEntry, Iterators, 
//            MapMaker, ImmutableMap, UnmodifiableIterator, Sets, 
//            TransformedIterator

public final class Maps
{
    static abstract class EntryFunction extends Enum
        implements Function
    {

        private static final EntryFunction $VALUES[];
        public static final EntryFunction KEY;
        public static final EntryFunction VALUE;

        public static EntryFunction valueOf(String s)
        {
            return (EntryFunction)Enum.valueOf(com/google/common/collect/Maps$EntryFunction, s);
        }

        public static EntryFunction[] values()
        {
            return (EntryFunction[])$VALUES.clone();
        }

        static 
        {
            KEY = new EntryFunction("KEY", 0) {

                private static Object apply(java.util.Map.Entry entry)
                {
                    return entry.getKey();
                }

                public final volatile Object apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

            };
            VALUE = new EntryFunction("VALUE", 1) {

                private static Object apply(java.util.Map.Entry entry)
                {
                    return entry.getValue();
                }

                public final volatile Object apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

            };
            $VALUES = (new EntryFunction[] {
                KEY, VALUE
            });
        }

        private EntryFunction(String s, int i)
        {
            super(s, i);
        }

    }

    static abstract class EntrySet extends Sets.ImprovedAbstractSet
    {

        public void clear()
        {
            map().clear();
        }

        public boolean contains(Object obj)
        {
            boolean flag;
label0:
            {
                boolean flag1 = false;
                flag = flag1;
                if (!(obj instanceof java.util.Map.Entry))
                {
                    break label0;
                }
                obj = (java.util.Map.Entry)obj;
                Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                Object obj2 = Maps.safeGet(map(), obj1);
                flag = flag1;
                if (!Objects.equal(obj2, ((java.util.Map.Entry) (obj)).getValue()))
                {
                    break label0;
                }
                if (obj2 == null)
                {
                    flag = flag1;
                    if (!map().containsKey(obj1))
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            return flag;
        }

        public boolean isEmpty()
        {
            return map().isEmpty();
        }

        abstract Map map();

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                obj = (java.util.Map.Entry)obj;
                return map().keySet().remove(((java.util.Map.Entry) (obj)).getKey());
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.removeAll((Collection)Preconditions.checkNotNull(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                return Sets.removeAllImpl(this, collection.iterator());
            }
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.retainAll((Collection)Preconditions.checkNotNull(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                java.util.HashSet hashset = Sets.newHashSetWithExpectedSize(collection.size());
                collection = collection.iterator();
                do
                {
                    if (!collection.hasNext())
                    {
                        break;
                    }
                    Object obj = collection.next();
                    if (contains(obj))
                    {
                        hashset.add(((java.util.Map.Entry)obj).getKey());
                    }
                } while (true);
                return map().keySet().retainAll(hashset);
            }
            return flag;
        }

        public int size()
        {
            return map().size();
        }

        EntrySet()
        {
        }
    }

    static abstract class ImprovedAbstractMap extends AbstractMap
    {

        private transient Set entrySet;
        private transient Set keySet;
        private transient Collection values;

        private Collection createValues()
        {
            return new Values(this);
        }

        abstract Set createEntrySet();

        Set createKeySet()
        {
            return new KeySet(this);
        }

        public Set entrySet()
        {
            Set set1 = entrySet;
            Set set = set1;
            if (set1 == null)
            {
                set = createEntrySet();
                entrySet = set;
            }
            return set;
        }

        public Set keySet()
        {
            Set set1 = keySet;
            Set set = set1;
            if (set1 == null)
            {
                set = createKeySet();
                keySet = set;
            }
            return set;
        }

        public Collection values()
        {
            Collection collection1 = values;
            Collection collection = collection1;
            if (collection1 == null)
            {
                collection = createValues();
                values = collection;
            }
            return collection;
        }

        ImprovedAbstractMap()
        {
        }
    }

    static class KeySet extends Sets.ImprovedAbstractSet
    {

        final Map map;

        public void clear()
        {
            map().clear();
        }

        public boolean contains(Object obj)
        {
            return map().containsKey(obj);
        }

        public boolean isEmpty()
        {
            return map().isEmpty();
        }

        public Iterator iterator()
        {
            return Maps.keyIterator(map().entrySet().iterator());
        }

        final Map map()
        {
            return map;
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                map().remove(obj);
                return true;
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return map().size();
        }

        KeySet(Map map1)
        {
            map = (Map)Preconditions.checkNotNull(map1);
        }
    }

    static final class Values extends AbstractCollection
    {

        final Map map;

        private Map map()
        {
            return map;
        }

        public final void clear()
        {
            map().clear();
        }

        public final boolean contains(Object obj)
        {
            return map().containsValue(obj);
        }

        public final boolean isEmpty()
        {
            return map().isEmpty();
        }

        public final Iterator iterator()
        {
            return Maps.valueIterator(map().entrySet().iterator());
        }

        public final boolean remove(Object obj)
        {
            boolean flag;
            try
            {
                flag = super.remove(obj);
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                for (Iterator iterator1 = map().entrySet().iterator(); iterator1.hasNext();)
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    if (Objects.equal(obj, entry.getValue()))
                    {
                        map().remove(entry.getKey());
                        return true;
                    }
                }

                return false;
            }
            return flag;
        }

        public final boolean removeAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.removeAll((Collection)Preconditions.checkNotNull(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                java.util.HashSet hashset = Sets.newHashSet();
                Iterator iterator1 = map().entrySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    if (collection.contains(entry.getValue()))
                    {
                        hashset.add(entry.getKey());
                    }
                } while (true);
                return map().keySet().removeAll(hashset);
            }
            return flag;
        }

        public final boolean retainAll(Collection collection)
        {
            boolean flag;
            try
            {
                flag = super.retainAll((Collection)Preconditions.checkNotNull(collection));
            }
            catch (UnsupportedOperationException unsupportedoperationexception)
            {
                java.util.HashSet hashset = Sets.newHashSet();
                Iterator iterator1 = map().entrySet().iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                    if (collection.contains(entry.getValue()))
                    {
                        hashset.add(entry.getKey());
                    }
                } while (true);
                return map().keySet().retainAll(hashset);
            }
            return flag;
        }

        public final int size()
        {
            return map().size();
        }

        Values(Map map1)
        {
            map = (Map)Preconditions.checkNotNull(map1);
        }
    }


    static final com.google.common.base.Joiner.MapJoiner STANDARD_JOINER;

    static Iterator asMapEntryIterator(Set set, Function function)
    {
        return new TransformedIterator(set.iterator(), function) {

            final Function val$function;

            private java.util.Map.Entry transform(Object obj)
            {
                return Maps.immutableEntry(obj, function.apply(obj));
            }

            final volatile Object transform(Object obj)
            {
                return transform(obj);
            }

            
            {
                function = function1;
                super(iterator);
            }
        };
    }

    static int capacity(int i)
    {
        if (i < 3)
        {
            CollectPreconditions.checkNonnegative(i, "expectedSize");
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return i / 3 + i;
        } else
        {
            return 0x7fffffff;
        }
    }

    static boolean equalsImpl(Map map, Object obj)
    {
        if (map == obj)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return map.entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    public static java.util.Map.Entry immutableEntry(Object obj, Object obj1)
    {
        return new ImmutableEntry(obj, obj1);
    }

    private static Function keyFunction()
    {
        return EntryFunction.KEY;
    }

    static Iterator keyIterator(Iterator iterator)
    {
        return Iterators.transform(iterator, keyFunction());
    }

    public static ConcurrentMap newConcurrentMap()
    {
        return (new MapMaker()).makeMap();
    }

    public static HashMap newHashMap()
    {
        return new HashMap();
    }

    public static HashMap newHashMapWithExpectedSize(int i)
    {
        return new HashMap(capacity(i));
    }

    public static LinkedHashMap newLinkedHashMap()
    {
        return new LinkedHashMap();
    }

    static boolean safeContainsKey(Map map, Object obj)
    {
        Preconditions.checkNotNull(map);
        boolean flag;
        try
        {
            flag = map.containsKey(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        return flag;
    }

    static Object safeGet(Map map, Object obj)
    {
        Preconditions.checkNotNull(map);
        try
        {
            map = ((Map) (map.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    static Object safeRemove(Map map, Object obj)
    {
        Preconditions.checkNotNull(map);
        try
        {
            map = ((Map) (map.remove(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    static String toStringImpl(Map map)
    {
        StringBuilder stringbuilder = Collections2.newStringBuilderForCollection(map.size()).append('{');
        STANDARD_JOINER.appendTo(stringbuilder, map);
        return stringbuilder.append('}').toString();
    }

    public static ImmutableMap uniqueIndex(Iterable iterable, Function function)
    {
        return uniqueIndex(iterable.iterator(), function);
    }

    private static ImmutableMap uniqueIndex(Iterator iterator, Function function)
    {
        Preconditions.checkNotNull(function);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Object obj;
        for (; iterator.hasNext(); builder.put(function.apply(obj), obj))
        {
            obj = iterator.next();
        }

        return builder.build();
    }

    private static Function valueFunction()
    {
        return EntryFunction.VALUE;
    }

    static UnmodifiableIterator valueIterator(UnmodifiableIterator unmodifiableiterator)
    {
        return new UnmodifiableIterator(unmodifiableiterator) {

            final UnmodifiableIterator val$entryIterator;

            public final boolean hasNext()
            {
                return entryIterator.hasNext();
            }

            public final Object next()
            {
                return ((java.util.Map.Entry)entryIterator.next()).getValue();
            }

            
            {
                entryIterator = unmodifiableiterator;
                super();
            }
        };
    }

    static Iterator valueIterator(Iterator iterator)
    {
        return Iterators.transform(iterator, valueFunction());
    }

    static 
    {
        STANDARD_JOINER = Collections2.STANDARD_JOINER.withKeyValueSeparator("=");
    }
}
