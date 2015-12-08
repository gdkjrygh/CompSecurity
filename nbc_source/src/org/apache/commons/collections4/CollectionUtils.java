// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.collection.UnmodifiableCollection;

// Referenced classes of package org.apache.commons.collections4:
//            Transformer, Predicate

public class CollectionUtils
{

    public static final Collection EMPTY_COLLECTION = UnmodifiableCollection.unmodifiableCollection(new ArrayList());

    public static Collection collect(Iterable iterable, Transformer transformer)
    {
        ArrayList arraylist;
        if (iterable instanceof Collection)
        {
            arraylist = new ArrayList(((Collection)iterable).size());
        } else
        {
            arraylist = new ArrayList();
        }
        return collect(iterable, transformer, ((Collection) (arraylist)));
    }

    public static Collection collect(Iterable iterable, Transformer transformer, Collection collection)
    {
        Collection collection1 = collection;
        if (iterable != null)
        {
            collection1 = collect(iterable.iterator(), transformer, collection);
        }
        return collection1;
    }

    public static Collection collect(Iterator iterator, Transformer transformer)
    {
        return collect(iterator, transformer, ((Collection) (new ArrayList())));
    }

    public static Collection collect(Iterator iterator, Transformer transformer, Collection collection)
    {
        if (iterator != null && transformer != null)
        {
            for (; iterator.hasNext(); collection.add(transformer.transform(iterator.next()))) { }
        }
        return collection;
    }

    public static int countMatches(Iterable iterable, Predicate predicate)
    {
        boolean flag = false;
        int i = 0;
        int j = ((flag) ? 1 : 0);
        if (iterable != null)
        {
            j = ((flag) ? 1 : 0);
            if (predicate != null)
            {
                iterable = iterable.iterator();
                do
                {
                    j = i;
                    if (!iterable.hasNext())
                    {
                        break;
                    }
                    if (predicate.evaluate(iterable.next()))
                    {
                        i++;
                    }
                } while (true);
            }
        }
        return j;
    }

    public static boolean filter(Iterable iterable, Predicate predicate)
    {
        boolean flag2 = false;
        boolean flag = false;
        boolean flag1 = flag2;
        if (iterable != null)
        {
            flag1 = flag2;
            if (predicate != null)
            {
                iterable = iterable.iterator();
                do
                {
                    flag1 = flag;
                    if (!iterable.hasNext())
                    {
                        break;
                    }
                    if (!predicate.evaluate(iterable.next()))
                    {
                        iterable.remove();
                        flag = true;
                    }
                } while (true);
            }
        }
        return flag1;
    }

    public static Object find(Iterable iterable, Predicate predicate)
    {
label0:
        {
            if (iterable == null || predicate == null)
            {
                break label0;
            }
            iterable = iterable.iterator();
            Object obj;
            do
            {
                if (!iterable.hasNext())
                {
                    break label0;
                }
                obj = iterable.next();
            } while (!predicate.evaluate(obj));
            return obj;
        }
        return null;
    }

    public static boolean isEmpty(Collection collection)
    {
        return collection == null || collection.isEmpty();
    }

    public static void reverseArray(Object aobj[])
    {
        int i = 0;
        for (int j = aobj.length - 1; j > i; i++)
        {
            Object obj = aobj[j];
            aobj[j] = aobj[i];
            aobj[i] = obj;
            j--;
        }

    }

}
