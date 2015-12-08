// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Collections2, Iterables, Iterators, Lists

static class predicate
    implements Collection
{

    final Predicate predicate;
    final Collection unfiltered;

    public boolean add(Object obj)
    {
        Preconditions.checkArgument(predicate.apply(obj));
        return unfiltered.add(obj);
    }

    public boolean addAll(Collection collection)
    {
        Object obj;
        for (Iterator iterator1 = collection.iterator(); iterator1.hasNext(); Preconditions.checkArgument(predicate.apply(obj)))
        {
            obj = iterator1.next();
        }

        return unfiltered.addAll(collection);
    }

    public void clear()
    {
        Iterables.removeIf(unfiltered, predicate);
    }

    public boolean contains(Object obj)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            boolean flag2;
            try
            {
                if (!predicate.apply(obj))
                {
                    break label0;
                }
                flag2 = unfiltered.contains(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean containsAll(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!contains(collection.next()))
            {
                return false;
            }
        }

        return true;
    }

    contains createCombined(Predicate predicate1)
    {
        return new <init>(unfiltered, Predicates.and(predicate, predicate1));
    }

    public boolean isEmpty()
    {
        return !Iterators.any(unfiltered.iterator(), predicate);
    }

    public Iterator iterator()
    {
        return Iterators.filter(unfiltered.iterator(), predicate);
    }

    public boolean remove(Object obj)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            boolean flag2;
            try
            {
                if (!predicate.apply(obj))
                {
                    break label0;
                }
                flag2 = unfiltered.remove(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (flag2)
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean removeAll(final Collection collection)
    {
        Preconditions.checkNotNull(collection);
        collection = new Predicate() {

            final Collections2.FilteredCollection this$0;
            final Collection val$collection;

            public boolean apply(Object obj)
            {
                return predicate.apply(obj) && collection.contains(obj);
            }

            
            {
                this$0 = Collections2.FilteredCollection.this;
                collection = collection1;
                super();
            }
        };
        return Iterables.removeIf(unfiltered, collection);
    }

    public boolean retainAll(final Collection collection)
    {
        Preconditions.checkNotNull(collection);
        collection = new Predicate() {

            final Collections2.FilteredCollection this$0;
            final Collection val$collection;

            public boolean apply(Object obj)
            {
                return predicate.apply(obj) && !collection.contains(obj);
            }

            
            {
                this$0 = Collections2.FilteredCollection.this;
                collection = collection1;
                super();
            }
        };
        return Iterables.removeIf(unfiltered, collection);
    }

    public int size()
    {
        return Iterators.size(iterator());
    }

    public Object[] toArray()
    {
        return Lists.newArrayList(iterator()).toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return Lists.newArrayList(iterator()).toArray(aobj);
    }

    public String toString()
    {
        return Iterators.toString(iterator());
    }

    _cls2.val.collection(Collection collection, Predicate predicate1)
    {
        unfiltered = collection;
        predicate = predicate1;
    }
}
