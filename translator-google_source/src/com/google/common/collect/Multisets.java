// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import com.google.common.c.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            dn, af, dl, ds, 
//            dm, bl, Ordering

public final class Multisets
{

    private static final Ordering a = new dn();

    static int a(dl dl1, Object obj, int i)
    {
        com.google.common.collect.af.a(i, "count");
        int j = dl1.count(obj);
        i -= j;
        if (i > 0)
        {
            dl1.add(obj, i);
        } else
        if (i < 0)
        {
            dl1.remove(obj, -i);
            return j;
        }
        return j;
    }

    static int a(Iterable iterable)
    {
        if (iterable instanceof dl)
        {
            return ((dl)iterable).elementSet().size();
        } else
        {
            return 11;
        }
    }

    public static dm a(Object obj, int i)
    {
        return new ImmutableEntry(obj, i);
    }

    static Iterator a(dl dl1)
    {
        return new ds(dl1, dl1.entrySet().iterator());
    }

    static boolean a(dl dl1, Object obj)
    {
        if (obj == dl1)
        {
            return true;
        }
        if (obj instanceof dl)
        {
            obj = (dl)obj;
            if (dl1.size() != ((dl) (obj)).size() || dl1.entrySet().size() != ((dl) (obj)).entrySet().size())
            {
                return false;
            }
            for (obj = ((dl) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext();)
            {
                dm dm1 = (dm)((Iterator) (obj)).next();
                if (dl1.count(dm1.getElement()) != dm1.getCount())
                {
                    return false;
                }
            }

            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(dl dl1, Object obj, int i, int j)
    {
        com.google.common.collect.af.a(i, "oldCount");
        com.google.common.collect.af.a(j, "newCount");
        if (dl1.count(obj) == i)
        {
            dl1.setCount(obj, j);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(dl dl1, Collection collection)
    {
        if (collection.isEmpty())
        {
            return false;
        }
        if (collection instanceof dl)
        {
            dm dm1;
            for (collection = ((dl)collection).entrySet().iterator(); collection.hasNext(); dl1.add(dm1.getElement(), dm1.getCount()))
            {
                dm1 = (dm)collection.next();
            }

        } else
        {
            com.google.common.collect.bl.a(dl1, collection.iterator());
        }
        return true;
    }

    static int b(dl dl1)
    {
        dl1 = dl1.entrySet().iterator();
        long l;
        for (l = 0L; dl1.hasNext(); l = (long)((dm)dl1.next()).getCount() + l) { }
        return com.google.common.c.a.a(l);
    }

    static dl b(Iterable iterable)
    {
        return (dl)iterable;
    }

    static boolean b(dl dl1, Collection collection)
    {
        Object obj = collection;
        if (collection instanceof dl)
        {
            obj = ((dl)collection).elementSet();
        }
        return dl1.elementSet().removeAll(((Collection) (obj)));
    }

    static boolean c(dl dl1, Collection collection)
    {
        p.a(collection);
        Object obj = collection;
        if (collection instanceof dl)
        {
            obj = ((dl)collection).elementSet();
        }
        return dl1.elementSet().retainAll(((Collection) (obj)));
    }


    private class ImmutableEntry extends do
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final int count;
        final Object element;

        public final int getCount()
        {
            return count;
        }

        public final Object getElement()
        {
            return element;
        }

        ImmutableEntry(Object obj, int i)
        {
            element = obj;
            count = i;
            com.google.common.collect.af.a(i, "count");
        }
    }

}
