// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultimap, ListMultimap, Multimap, ImmutableMap, 
//            ImmutableList, ImmutableCollection, EmptyImmutableListMultimap, Serialization

public class ImmutableListMultimap extends ImmutableMultimap
    implements ListMultimap
{

    private static final long serialVersionUID = 0L;
    private transient ImmutableListMultimap inverse;

    ImmutableListMultimap(ImmutableMap immutablemap, int i)
    {
        super(immutablemap, i);
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static ImmutableListMultimap copyOf(Multimap multimap)
    {
        if (!multimap.isEmpty()) goto _L2; else goto _L1
_L1:
        ImmutableListMultimap immutablelistmultimap = of();
_L4:
        return immutablelistmultimap;
_L2:
        ImmutableListMultimap immutablelistmultimap1;
        if (!(multimap instanceof ImmutableListMultimap))
        {
            break; /* Loop/switch isn't completed */
        }
        immutablelistmultimap1 = (ImmutableListMultimap)multimap;
        immutablelistmultimap = immutablelistmultimap1;
        if (!immutablelistmultimap1.isPartialView()) goto _L4; else goto _L3
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
            java.util.Map.Entry entry = (java.util.Map.Entry)multimap.next();
            ImmutableList immutablelist = ImmutableList.copyOf((Collection)entry.getValue());
            if (!immutablelist.isEmpty())
            {
                builder1.put(entry.getKey(), immutablelist);
                i = immutablelist.size() + i;
            }
        } while (true);
        return new ImmutableListMultimap(builder1.build(), i);
    }

    private ImmutableListMultimap invert()
    {
        Object obj = builder();
        java.util.Map.Entry entry;
        for (Iterator iterator = entries().iterator(); iterator.hasNext(); ((Builder) (obj)).put(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        obj = ((Builder) (obj)).build();
        obj.inverse = this;
        return ((ImmutableListMultimap) (obj));
    }

    public static ImmutableListMultimap of()
    {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    public static ImmutableListMultimap of(Object obj, Object obj1)
    {
        Builder builder1 = builder();
        builder1.put(obj, obj1);
        return builder1.build();
    }

    public static ImmutableListMultimap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        Builder builder1 = builder();
        builder1.put(obj, obj1);
        builder1.put(obj2, obj3);
        return builder1.build();
    }

    public static ImmutableListMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        Builder builder1 = builder();
        builder1.put(obj, obj1);
        builder1.put(obj2, obj3);
        builder1.put(obj4, obj5);
        return builder1.build();
    }

    public static ImmutableListMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        Builder builder1 = builder();
        builder1.put(obj, obj1);
        builder1.put(obj2, obj3);
        builder1.put(obj4, obj5);
        builder1.put(obj6, obj7);
        return builder1.build();
    }

    public static ImmutableListMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
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

            builder1.put(obj, ImmutableList.copyOf(aobj));
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
    {
        objectoutputstream.defaultWriteObject();
        Serialization.writeMultimap(this, objectoutputstream);
    }

    public volatile ImmutableCollection get(Object obj)
    {
        return get(obj);
    }

    public ImmutableList get(Object obj)
    {
        ImmutableList immutablelist = (ImmutableList)map.get(obj);
        obj = immutablelist;
        if (immutablelist == null)
        {
            obj = ImmutableList.of();
        }
        return ((ImmutableList) (obj));
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public volatile List get(Object obj)
    {
        return get(obj);
    }

    public ImmutableListMultimap inverse()
    {
        ImmutableListMultimap immutablelistmultimap1 = inverse;
        ImmutableListMultimap immutablelistmultimap = immutablelistmultimap1;
        if (immutablelistmultimap1 == null)
        {
            immutablelistmultimap = invert();
            inverse = immutablelistmultimap;
        }
        return immutablelistmultimap;
    }

    public volatile ImmutableMultimap inverse()
    {
        return inverse();
    }

    public volatile ImmutableCollection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public ImmutableList removeAll(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public volatile List removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public volatile ImmutableCollection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public ImmutableList replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public volatile List replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    /* member class not found */
    class Builder {}

}
