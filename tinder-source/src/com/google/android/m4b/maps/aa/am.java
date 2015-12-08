// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ak, g, al, aq, 
//            n, af, aa, c

public class am extends ak
    implements g
{
    public static final class a extends ak.a
    {

        public a()
        {
            a = new b();
        }
    }

    static final class b extends c
    {

        private static final long serialVersionUID = 0L;

        final Collection f()
        {
            return new LinkedHashSet();
        }

        b()
        {
            super(new LinkedHashMap());
        }
    }


    private static final long serialVersionUID = 0L;
    private final transient al b = a(((Comparator) (null)));

    am(af af1, int i)
    {
        super(af1, i);
    }

    private static al a(Comparator comparator)
    {
        if (comparator == null)
        {
            return al.f();
        } else
        {
            return aq.a(comparator);
        }
    }

    private static al a(Comparator comparator, Collection collection)
    {
        if (comparator == null)
        {
            return al.a(collection);
        } else
        {
            return aq.a(comparator, collection);
        }
    }

    public static am a(g g1)
    {
        j.a(g1);
        if (!g1.e()) goto _L2; else goto _L1
_L1:
        Object obj = n.b;
_L4:
        return ((am) (obj));
_L2:
        am am1;
        if (!(g1 instanceof am))
        {
            break; /* Loop/switch isn't completed */
        }
        am1 = (am)g1;
        obj = am1;
        if (!((ak) (am1)).a.c()) goto _L4; else goto _L3
_L3:
        af.a a1 = af.e();
        g1 = g1.c().entrySet().iterator();
        int i = 0;
        do
        {
            if (!g1.hasNext())
            {
                break;
            }
            Object obj2 = (java.util.Map.Entry)g1.next();
            Object obj1 = ((java.util.Map.Entry) (obj2)).getKey();
            obj2 = a(null, (Collection)((java.util.Map.Entry) (obj2)).getValue());
            if (!((al) (obj2)).isEmpty())
            {
                a1.a(obj1, obj2);
                i = ((al) (obj2)).size() + i;
            }
        } while (true);
        return new am(a1.a(), i);
    }

    private al c(Object obj)
    {
        return (al)h.b((al)a.get(obj), b);
    }

    public static am f()
    {
        return n.b;
    }

    public static a g()
    {
        return new a();
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        Comparator comparator = (Comparator)objectinputstream.readObject();
        int i1 = objectinputstream.readInt();
        if (i1 < 0)
        {
            throw new InvalidObjectException((new StringBuilder("Invalid key count ")).append(i1).toString());
        }
        af.a a1 = af.e();
        int i = 0;
        int k = 0;
        for (; i < i1; i++)
        {
            Object obj = objectinputstream.readObject();
            int j1 = objectinputstream.readInt();
            if (j1 <= 0)
            {
                throw new InvalidObjectException((new StringBuilder("Invalid value count ")).append(j1).toString());
            }
            Object aobj[] = new Object[j1];
            for (int l = 0; l < j1; l++)
            {
                aobj[l] = objectinputstream.readObject();
            }

            al al1 = a(comparator, Arrays.asList(aobj));
            if (al1.size() != aobj.length)
            {
                throw new InvalidObjectException((new StringBuilder("Duplicate key-value pairs exist for key ")).append(obj).toString());
            }
            a1.a(obj, al1);
            k += j1;
        }

        try
        {
            objectinputstream = a1.a();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw (InvalidObjectException)(new InvalidObjectException(objectinputstream.getMessage())).initCause(objectinputstream);
        }
        ak.c.a.a(this, objectinputstream);
        objectinputstream = ak.c.b;
        try
        {
            ((s.a) (objectinputstream)).a.set(this, Integer.valueOf(k));
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw new AssertionError(objectinputstream);
        }
        ak.c.c.a(this, a(comparator));
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        Object obj;
        if (b instanceof aq)
        {
            obj = ((aq)b).comparator();
        } else
        {
            obj = null;
        }
        objectoutputstream.writeObject(obj);
        objectoutputstream.writeInt(c().size());
        for (obj = c().entrySet().iterator(); ((Iterator) (obj)).hasNext();)
        {
            Object obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            objectoutputstream.writeObject(((java.util.Map.Entry) (obj1)).getKey());
            objectoutputstream.writeInt(((Collection)((java.util.Map.Entry) (obj1)).getValue()).size());
            obj1 = ((Collection)((java.util.Map.Entry) (obj1)).getValue()).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                objectoutputstream.writeObject(((Iterator) (obj1)).next());
            }
        }

    }

    public final aa a(Object obj)
    {
        return c(obj);
    }

    public final Collection b(Object obj)
    {
        return c(obj);
    }
}
