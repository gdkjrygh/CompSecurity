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
//            ImmutableMultimap, de, av, ImmutableMap, 
//            ImmutableList, aw, EmptyImmutableListMultimap, bc, 
//            eb, ea, ImmutableCollection

public class ImmutableListMultimap extends ImmutableMultimap
    implements de
{

    private static final long serialVersionUID = 0L;
    private transient ImmutableListMultimap a;

    ImmutableListMultimap(ImmutableMap immutablemap, int i)
    {
        super(immutablemap, i);
    }

    public static av builder()
    {
        return new av();
    }

    public static ImmutableListMultimap copyOf(de de1)
    {
        if (!de1.isEmpty()) goto _L2; else goto _L1
_L1:
        ImmutableListMultimap immutablelistmultimap = of();
_L4:
        return immutablelistmultimap;
_L2:
        ImmutableListMultimap immutablelistmultimap1;
        if (!(de1 instanceof ImmutableListMultimap))
        {
            break; /* Loop/switch isn't completed */
        }
        immutablelistmultimap1 = (ImmutableListMultimap)de1;
        immutablelistmultimap = immutablelistmultimap1;
        if (!immutablelistmultimap1.isPartialView()) goto _L4; else goto _L3
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
            java.util.Map.Entry entry = (java.util.Map.Entry)de1.next();
            ImmutableList immutablelist = ImmutableList.copyOf((Collection)entry.getValue());
            if (!immutablelist.isEmpty())
            {
                aw1.a(entry.getKey(), immutablelist);
                i = immutablelist.size() + i;
            }
        } while (true);
        return new ImmutableListMultimap(aw1.a(), i);
    }

    public static ImmutableListMultimap of()
    {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    public static ImmutableListMultimap of(Object obj, Object obj1)
    {
        av av1 = builder();
        av1.a(obj, obj1);
        return av1.a();
    }

    public static ImmutableListMultimap of(Object obj, Object obj1, Object obj2, Object obj3)
    {
        av av1 = builder();
        av1.a(obj, obj1);
        av1.a(obj2, obj3);
        return av1.a();
    }

    public static ImmutableListMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        av av1 = builder();
        av1.a(obj, obj1);
        av1.a(obj2, obj3);
        av1.a(obj4, obj5);
        return av1.a();
    }

    public static ImmutableListMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        av av1 = builder();
        av1.a(obj, obj1);
        av1.a(obj2, obj3);
        av1.a(obj4, obj5);
        av1.a(obj6, obj7);
        return av1.a();
    }

    public static ImmutableListMultimap of(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, 
            Object obj8, Object obj9)
    {
        av av1 = builder();
        av1.a(obj, obj1);
        av1.a(obj2, obj3);
        av1.a(obj4, obj5);
        av1.a(obj6, obj7);
        av1.a(obj8, obj9);
        return av1.a();
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
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

            aw1.a(obj, ImmutableList.copyOf(aobj));
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
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        ea.a(this, objectoutputstream);
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
        ImmutableListMultimap immutablelistmultimap = a;
        Object obj = immutablelistmultimap;
        if (immutablelistmultimap == null)
        {
            obj = builder();
            java.util.Map.Entry entry;
            for (Iterator iterator = entries().iterator(); iterator.hasNext(); ((av) (obj)).a(entry.getValue(), entry.getKey()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            obj = ((av) (obj)).a();
            obj.a = this;
            a = ((ImmutableListMultimap) (obj));
        }
        return ((ImmutableListMultimap) (obj));
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
}
