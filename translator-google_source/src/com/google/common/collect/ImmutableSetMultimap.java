// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.h;
import com.google.common.base.p;
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
//            ImmutableMultimap, ec, ImmutableSet, ImmutableSortedSet, 
//            de, ImmutableMap, aw, bh, 
//            EmptyImmutableSetMultimap, bc, eb, ea, 
//            ImmutableCollection

public class ImmutableSetMultimap extends ImmutableMultimap
    implements ec
{

    private static final long serialVersionUID = 0L;
    private final transient ImmutableSet a;
    private transient ImmutableSetMultimap b;
    private transient ImmutableSet c;

    ImmutableSetMultimap(ImmutableMap immutablemap, int i, Comparator comparator)
    {
        super(immutablemap, i);
        a = a(comparator);
    }

    private static ImmutableSet a(Comparator comparator)
    {
        if (comparator == null)
        {
            return ImmutableSet.of();
        } else
        {
            return ImmutableSortedSet.emptySet(comparator);
        }
    }

    private static ImmutableSet a(Comparator comparator, Collection collection)
    {
        if (comparator == null)
        {
            return ImmutableSet.copyOf(collection);
        } else
        {
            return ImmutableSortedSet.copyOf(comparator, collection);
        }
    }

    private static ImmutableSetMultimap a(de de1, Comparator comparator)
    {
        p.a(de1);
        if (!de1.isEmpty() || comparator != null) goto _L2; else goto _L1
_L1:
        ImmutableSetMultimap immutablesetmultimap = of();
_L4:
        return immutablesetmultimap;
_L2:
        ImmutableSetMultimap immutablesetmultimap1;
        if (!(de1 instanceof ImmutableSetMultimap))
        {
            break; /* Loop/switch isn't completed */
        }
        immutablesetmultimap1 = (ImmutableSetMultimap)de1;
        immutablesetmultimap = immutablesetmultimap1;
        if (!immutablesetmultimap1.isPartialView()) goto _L4; else goto _L3
_L3:
        aw aw1 = ImmutableMap.builder();
        de1 = de1.asMap().entrySet().iterator();
        int i = 0;
        do
        {
            if (!de1.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)de1.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getKey();
            obj1 = a(comparator, (Collection)((java.util.Map.Entry) (obj1)).getValue());
            if (!((ImmutableSet) (obj1)).isEmpty())
            {
                aw1.a(obj, obj1);
                i = ((ImmutableSet) (obj1)).size() + i;
            }
        } while (true);
        return new ImmutableSetMultimap(aw1.a(), i, comparator);
    }

    public static bh builder()
    {
        return new bh();
    }

    public static ImmutableSetMultimap copyOf(de de1)
    {
        return a(de1, ((Comparator) (null)));
    }

    public static ImmutableSetMultimap of()
    {
        return EmptyImmutableSetMultimap.INSTANCE;
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1)
    {
        bh bh1 = builder();
        bh1.a(obj, obj1);
        return bh1.a();
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        bh bh1 = builder();
        bh1.a(obj, obj1);
        bh1.a(obj2, obj3);
        return bh1.a();
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        bh bh1 = builder();
        bh1.a(obj, obj1);
        bh1.a(obj2, obj3);
        bh1.a(obj4, obj5);
        return bh1.a();
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        bh bh1 = builder();
        bh1.a(obj, obj1);
        bh1.a(obj2, obj3);
        bh1.a(obj4, obj5);
        bh1.a(obj6, obj7);
        return bh1.a();
    }

    public static ImmutableSetMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        bh bh1 = builder();
        bh1.a(obj, obj1);
        bh1.a(obj2, obj3);
        bh1.a(obj4, obj5);
        bh1.a(obj6, obj7);
        bh1.a(obj8, obj9);
        return bh1.a();
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        Comparator comparator = (Comparator)objectinputstream.readObject();
        int l = objectinputstream.readInt();
        if (l < 0)
        {
            throw new InvalidObjectException((new StringBuilder("Invalid key count ")).append(l).toString());
        }
        aw aw1 = ImmutableMap.builder();
        int i = 0;
        int j = 0;
        for (; i < l; i++)
        {
            Object obj = objectinputstream.readObject();
            int i1 = objectinputstream.readInt();
            if (i1 <= 0)
            {
                throw new InvalidObjectException((new StringBuilder("Invalid value count ")).append(i1).toString());
            }
            Object aobj[] = new Object[i1];
            for (int k = 0; k < i1; k++)
            {
                aobj[k] = objectinputstream.readObject();
            }

            ImmutableSet immutableset = a(comparator, Arrays.asList(aobj));
            if (immutableset.size() != aobj.length)
            {
                throw new InvalidObjectException((new StringBuilder("Duplicate key-value pairs exist for key ")).append(obj).toString());
            }
            aw1.a(obj, immutableset);
            j += i1;
        }

        try
        {
            objectinputstream = aw1.a();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw (InvalidObjectException)(new InvalidObjectException(objectinputstream.getMessage())).initCause(objectinputstream);
        }
        bc.a.a(this, objectinputstream);
        bc.b.a(this, j);
        bc.c.a(this, a(comparator));
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(valueComparator());
        ea.a(this, objectoutputstream);
    }

    public volatile ImmutableCollection entries()
    {
        return entries();
    }

    public ImmutableSet entries()
    {
        ImmutableSet immutableset = c;
        Object obj = immutableset;
        if (immutableset == null)
        {
            obj = new EntrySet();
            c = ((ImmutableSet) (obj));
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
        return (ImmutableSet)h.a((ImmutableSet)map.get(obj), a);
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
        ImmutableSetMultimap immutablesetmultimap = b;
        Object obj = immutablesetmultimap;
        if (immutablesetmultimap == null)
        {
            obj = builder();
            java.util.Map.Entry entry;
            for (Iterator iterator = entries().iterator(); iterator.hasNext(); ((bh) (obj)).a(entry.getValue(), entry.getKey()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            obj = ((bh) (obj)).a();
            obj.b = this;
            b = ((ImmutableSetMultimap) (obj));
        }
        return ((ImmutableSetMultimap) (obj));
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
        if (a instanceof ImmutableSortedSet)
        {
            return ((ImmutableSortedSet)a).comparator();
        } else
        {
            return null;
        }
    }


    private class EntrySet extends ImmutableSet
    {

        private final transient ImmutableSetMultimap a;

        public final boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return a.containsEntry(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        final boolean isPartialView()
        {
            return false;
        }

        public final ej iterator()
        {
            return a.entryIterator();
        }

        public final volatile Iterator iterator()
        {
            return iterator();
        }

        public final int size()
        {
            return a.size();
        }

        EntrySet()
        {
            a = ImmutableSetMultimap.this;
        }
    }

}
