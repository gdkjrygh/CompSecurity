// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultimap, SetMultimap, ImmutableSortedSet, Multimap, 
//            ImmutableMap, ImmutableSet, EmptyImmutableSetMultimap, Serialization, 
//            ImmutableCollection, AbstractMultimap, Sets

public class ImmutableSetMultimap extends ImmutableMultimap
    implements SetMultimap
{
    public static final class Builder extends ImmutableMultimap.Builder
    {

        public volatile ImmutableMultimap build()
        {
            return build();
        }

        public ImmutableSetMultimap build()
        {
            return ImmutableSetMultimap.copyOf(builderMultimap, valueComparator);
        }

        public volatile ImmutableMultimap.Builder orderKeysBy(Comparator comparator)
        {
            return orderKeysBy(comparator);
        }

        public Builder orderKeysBy(Comparator comparator)
        {
            builderMultimap = new SortedKeyBuilderMultimap((Comparator)Preconditions.checkNotNull(comparator), builderMultimap);
            return this;
        }

        public volatile ImmutableMultimap.Builder orderValuesBy(Comparator comparator)
        {
            return orderValuesBy(comparator);
        }

        public Builder orderValuesBy(Comparator comparator)
        {
            super.orderValuesBy(comparator);
            return this;
        }

        public volatile ImmutableMultimap.Builder put(Object obj, Object obj1)
        {
            return put(obj, obj1);
        }

        public Builder put(Object obj, Object obj1)
        {
            builderMultimap.put(Preconditions.checkNotNull(obj), Preconditions.checkNotNull(obj1));
            return this;
        }

        public volatile ImmutableMultimap.Builder putAll(Multimap multimap)
        {
            return putAll(multimap);
        }

        public volatile ImmutableMultimap.Builder putAll(Object obj, Iterable iterable)
        {
            return putAll(obj, iterable);
        }

        public volatile ImmutableMultimap.Builder putAll(Object obj, Object aobj[])
        {
            return putAll(obj, aobj);
        }

        public Builder putAll(Multimap multimap)
        {
            java.util.Map.Entry entry;
            for (multimap = multimap.asMap().entrySet().iterator(); multimap.hasNext(); putAll(entry.getKey(), (Iterable)entry.getValue()))
            {
                entry = (java.util.Map.Entry)multimap.next();
            }

            return this;
        }

        public Builder putAll(Object obj, Iterable iterable)
        {
            obj = builderMultimap.get(Preconditions.checkNotNull(obj));
            for (iterable = iterable.iterator(); iterable.hasNext(); ((Collection) (obj)).add(Preconditions.checkNotNull(iterable.next()))) { }
            return this;
        }

        public transient Builder putAll(Object obj, Object aobj[])
        {
            return putAll(obj, ((Iterable) (Arrays.asList(aobj))));
        }

        public Builder()
        {
            builderMultimap = new BuilderMultimap();
        }
    }

    private static class BuilderMultimap extends AbstractMultimap
    {

        private static final long serialVersionUID = 0L;

        Collection createCollection()
        {
            return Sets.newLinkedHashSet();
        }

        BuilderMultimap()
        {
            super(new LinkedHashMap());
        }
    }

    private static class SortedKeyBuilderMultimap extends AbstractMultimap
    {

        private static final long serialVersionUID = 0L;

        Collection createCollection()
        {
            return Sets.newLinkedHashSet();
        }

        SortedKeyBuilderMultimap(Comparator comparator, Multimap multimap)
        {
            super(new TreeMap(comparator));
            putAll(multimap);
        }
    }


    private static final long serialVersionUID = 0L;
    private final transient ImmutableSortedSet emptySet;
    private transient ImmutableSet entries;

    ImmutableSetMultimap(ImmutableMap immutablemap, int i, Comparator comparator)
    {
        super(immutablemap, i);
        if (comparator == null)
        {
            immutablemap = null;
        } else
        {
            immutablemap = ImmutableSortedSet.emptySet(comparator);
        }
        emptySet = immutablemap;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableSetMultimap copyOf(Multimap multimap)
    {
        return copyOf(multimap, null);
    }

    private static ImmutableSetMultimap copyOf(Multimap multimap, Comparator comparator)
    {
        Preconditions.checkNotNull(multimap);
        if (!multimap.isEmpty() || comparator != null) goto _L2; else goto _L1
_L1:
        ImmutableSetMultimap immutablesetmultimap = of();
_L4:
        return immutablesetmultimap;
_L2:
        ImmutableSetMultimap immutablesetmultimap1;
        if (!(multimap instanceof ImmutableSetMultimap))
        {
            break; /* Loop/switch isn't completed */
        }
        immutablesetmultimap1 = (ImmutableSetMultimap)multimap;
        immutablesetmultimap = immutablesetmultimap1;
        if (!immutablesetmultimap1.isPartialView()) goto _L4; else goto _L3
_L3:
        ImmutableMap.Builder builder1 = ImmutableMap.builder();
        int i = 0;
        Iterator iterator = multimap.asMap().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            multimap = (java.util.Map.Entry)iterator.next();
            Object obj = multimap.getKey();
            multimap = (Collection)multimap.getValue();
            if (comparator == null)
            {
                multimap = ImmutableSet.copyOf(multimap);
            } else
            {
                multimap = ImmutableSortedSet.copyOf(comparator, multimap);
            }
            if (!multimap.isEmpty())
            {
                builder1.put(obj, multimap);
                i += multimap.size();
            }
        } while (true);
        return new ImmutableSetMultimap(builder1.build(), i, comparator);
    }

    public static ImmutableSetMultimap of()
    {
        return EmptyImmutableSetMultimap.INSTANCE;
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1)
    {
        Builder builder1 = builder();
        builder1.put(obj, obj1);
        return builder1.build();
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        Builder builder1 = builder();
        builder1.put(obj, obj1);
        builder1.put(obj2, obj3);
        return builder1.build();
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        Builder builder1 = builder();
        builder1.put(obj, obj1);
        builder1.put(obj2, obj3);
        builder1.put(obj4, obj5);
        return builder1.build();
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        Builder builder1 = builder();
        builder1.put(obj, obj1);
        builder1.put(obj2, obj3);
        builder1.put(obj4, obj5);
        builder1.put(obj6, obj7);
        return builder1.build();
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        Builder builder1 = builder();
        builder1.put(obj, obj1);
        builder1.put(obj2, obj3);
        builder1.put(obj4, obj5);
        builder1.put(obj6, obj7);
        builder1.put(obj8, obj9);
        return builder1.build();
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        int l = objectinputstream.readInt();
        if (l < 0)
        {
            throw new InvalidObjectException((new StringBuilder()).append("Invalid key count ").append(l).toString());
        }
        ImmutableMap.Builder builder1 = ImmutableMap.builder();
        int j = 0;
        for (int i = 0; i < l; i++)
        {
            Object obj = objectinputstream.readObject();
            int i1 = objectinputstream.readInt();
            if (i1 <= 0)
            {
                throw new InvalidObjectException((new StringBuilder()).append("Invalid value count ").append(i1).toString());
            }
            Object aobj[] = new Object[i1];
            for (int k = 0; k < i1; k++)
            {
                aobj[k] = objectinputstream.readObject();
            }

            ImmutableSet immutableset = ImmutableSet.copyOf(aobj);
            if (immutableset.size() != aobj.length)
            {
                throw new InvalidObjectException((new StringBuilder()).append("Duplicate key-value pairs exist for key ").append(obj).toString());
            }
            builder1.put(obj, immutableset);
            j += i1;
        }

        try
        {
            objectinputstream = builder1.build();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw (InvalidObjectException)(new InvalidObjectException(objectinputstream.getMessage())).initCause(objectinputstream);
        }
        ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set(this, objectinputstream);
        ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set(this, j);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        Serialization.writeMultimap(this, objectoutputstream);
    }

    public volatile ImmutableCollection entries()
    {
        return entries();
    }

    public ImmutableSet entries()
    {
        ImmutableSet immutableset1 = entries;
        ImmutableSet immutableset = immutableset1;
        if (immutableset1 == null)
        {
            immutableset = ImmutableSet.copyOf(super.entries());
            entries = immutableset;
        }
        return immutableset;
    }

    public volatile Collection entries()
    {
        return entries();
    }

    public volatile Set entries()
    {
        return entries();
    }

    public volatile ImmutableCollection get(Object obj)
    {
        return get(obj);
    }

    public ImmutableSet get(Object obj)
    {
        obj = (ImmutableSet)map.get(obj);
        if (obj != null)
        {
            return ((ImmutableSet) (obj));
        }
        if (emptySet != null)
        {
            return emptySet;
        } else
        {
            return ImmutableSet.of();
        }
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public volatile Set get(Object obj)
    {
        return get(obj);
    }

    public volatile ImmutableCollection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public ImmutableSet removeAll(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public volatile Set removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public volatile ImmutableCollection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public ImmutableSet replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public volatile Set replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

}
