// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultimap, SetMultimap, Multimap, ImmutableMap, 
//            ImmutableSet, ImmutableSortedSet, EmptyImmutableSetMultimap, Serialization, 
//            ImmutableCollection

public class ImmutableSetMultimap extends ImmutableMultimap
    implements SetMultimap
{

    private static final long serialVersionUID = 0L;
    private final transient ImmutableSet emptySet;
    private transient ImmutableSet entries;
    private transient ImmutableSetMultimap inverse;

    ImmutableSetMultimap(ImmutableMap immutablemap, int i, Comparator comparator)
    {
        super(immutablemap, i);
        emptySet = emptySet(comparator);
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
        multimap = multimap.asMap().entrySet().iterator();
        int i = 0;
        do
        {
            if (!multimap.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)multimap.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getKey();
            obj1 = valueSet(comparator, (Collection)((java.util.Map.Entry) (obj1)).getValue());
            if (!((ImmutableSet) (obj1)).isEmpty())
            {
                builder1.put(obj, obj1);
                i = ((ImmutableSet) (obj1)).size() + i;
            }
        } while (true);
        return new ImmutableSetMultimap(builder1.build(), i, comparator);
    }

    private static ImmutableSet emptySet(Comparator comparator)
    {
        if (comparator == null)
        {
            return ImmutableSet.of();
        } else
        {
            return ImmutableSortedSet.emptySet(comparator);
        }
    }

    private ImmutableSetMultimap invert()
    {
        Object obj = builder();
        java.util.Map.Entry entry;
        for (Iterator iterator = entries().iterator(); iterator.hasNext(); ((Builder) (obj)).put(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        obj = ((Builder) (obj)).build();
        obj.inverse = this;
        return ((ImmutableSetMultimap) (obj));
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
    {
        objectinputstream.defaultReadObject();
        Comparator comparator = (Comparator)objectinputstream.readObject();
        int l = objectinputstream.readInt();
        if (l < 0)
        {
            throw new InvalidObjectException((new StringBuilder(29)).append("Invalid key count ").append(l).toString());
        }
        ImmutableMap.Builder builder1 = ImmutableMap.builder();
        int i = 0;
        int j = 0;
        for (; i < l; i++)
        {
            Object obj = objectinputstream.readObject();
            int i1 = objectinputstream.readInt();
            if (i1 <= 0)
            {
                throw new InvalidObjectException((new StringBuilder(31)).append("Invalid value count ").append(i1).toString());
            }
            Object aobj[] = new Object[i1];
            for (int k = 0; k < i1; k++)
            {
                aobj[k] = objectinputstream.readObject();
            }

            ImmutableSet immutableset = valueSet(comparator, Arrays.asList(aobj));
            if (immutableset.size() != aobj.length)
            {
                objectinputstream = String.valueOf(String.valueOf(obj));
                throw new InvalidObjectException((new StringBuilder(objectinputstream.length() + 40)).append("Duplicate key-value pairs exist for key ").append(objectinputstream).toString());
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
        ImmutableMultimap.FieldSettersHolder.EMPTY_SET_FIELD_SETTER.set(this, emptySet(comparator));
    }

    private static ImmutableSet valueSet(Comparator comparator, Collection collection)
    {
        if (comparator == null)
        {
            return ImmutableSet.copyOf(collection);
        } else
        {
            return ImmutableSortedSet.copyOf(comparator, collection);
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(valueComparator());
        Serialization.writeMultimap(this, objectoutputstream);
    }

    public volatile ImmutableCollection entries()
    {
        return entries();
    }

    public ImmutableSet entries()
    {
        ImmutableSet immutableset = entries;
        Object obj = immutableset;
        if (immutableset == null)
        {
            obj = new EntrySet();
            entries = ((ImmutableSet) (obj));
        }
        return ((ImmutableSet) (obj));
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
        return (ImmutableSet)MoreObjects.firstNonNull((ImmutableSet)map.get(obj), emptySet);
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public volatile Set get(Object obj)
    {
        return get(obj);
    }

    public volatile ImmutableMultimap inverse()
    {
        return inverse();
    }

    public ImmutableSetMultimap inverse()
    {
        ImmutableSetMultimap immutablesetmultimap1 = inverse;
        ImmutableSetMultimap immutablesetmultimap = immutablesetmultimap1;
        if (immutablesetmultimap1 == null)
        {
            immutablesetmultimap = invert();
            inverse = immutablesetmultimap;
        }
        return immutablesetmultimap;
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

    Comparator valueComparator()
    {
        if (emptySet instanceof ImmutableSortedSet)
        {
            return ((ImmutableSortedSet)emptySet).comparator();
        } else
        {
            return null;
        }
    }


    /* member class not found */
    class Builder {}


    /* member class not found */
    class EntrySet {}

}
