// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Collections2, Iterators, Maps, Multiset

public final class Sets
{
    static abstract class ImprovedAbstractSet extends AbstractSet
    {

        public boolean removeAll(Collection collection)
        {
            return Sets.removeAllImpl(this, collection);
        }

        public boolean retainAll(Collection collection)
        {
            return super.retainAll((Collection)Preconditions.checkNotNull(collection));
        }

        ImprovedAbstractSet()
        {
        }
    }

    public static abstract class SetView extends AbstractSet
    {

        private SetView()
        {
        }

    }


    private static SetView difference(Set set, Set set1)
    {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set1, "set2");
        return new SetView(set, Predicates.not(Predicates.in(set1)), set1) {

            final Predicate val$notInSet2;
            final Set val$set1;
            final Set val$set2;

            public final boolean contains(Object obj)
            {
                return set1.contains(obj) && !set2.contains(obj);
            }

            public final boolean isEmpty()
            {
                return set2.containsAll(set1);
            }

            public final Iterator iterator()
            {
                return Iterators.filter(set1.iterator(), notInSet2);
            }

            public final int size()
            {
                return Iterators.size(iterator());
            }

            
            {
                set1 = set;
                notInSet2 = predicate;
                set2 = set3;
                super();
            }
        };
    }

    static boolean equalsImpl(Set set, Object obj)
    {
        if (set != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (Set)obj;
        boolean flag;
        try
        {
            if (set.size() != ((Set) (obj)).size())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = set.containsAll(((Collection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    static int hashCodeImpl(Set set)
    {
        int i = 0;
        set = set.iterator();
        while (set.hasNext()) 
        {
            Object obj = set.next();
            int j;
            if (obj != null)
            {
                j = obj.hashCode();
            } else
            {
                j = 0;
            }
            i = ~~(i + j);
        }
        return i;
    }

    private static SetView intersection(Set set, Set set1)
    {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set1, "set2");
        return new SetView(set, Predicates.in(set1), set1) {

            final Predicate val$inSet2;
            final Set val$set1;
            final Set val$set2;

            public final boolean contains(Object obj)
            {
                return set1.contains(obj) && set2.contains(obj);
            }

            public final boolean containsAll(Collection collection)
            {
                return set1.containsAll(collection) && set2.containsAll(collection);
            }

            public final boolean isEmpty()
            {
                return !iterator().hasNext();
            }

            public final Iterator iterator()
            {
                return Iterators.filter(set1.iterator(), inSet2);
            }

            public final int size()
            {
                return Iterators.size(iterator());
            }

            
            {
                set1 = set;
                inSet2 = predicate;
                set2 = set3;
                super();
            }
        };
    }

    public static HashSet newHashSet()
    {
        return new HashSet();
    }

    public static HashSet newHashSet(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new HashSet(Collections2.cast(iterable));
        } else
        {
            return newHashSet(iterable.iterator());
        }
    }

    private static HashSet newHashSet(Iterator iterator)
    {
        HashSet hashset = newHashSet();
        Iterators.addAll(hashset, iterator);
        return hashset;
    }

    public static transient HashSet newHashSet(Object aobj[])
    {
        HashSet hashset = newHashSetWithExpectedSize(aobj.length);
        Collections.addAll(hashset, aobj);
        return hashset;
    }

    public static HashSet newHashSetWithExpectedSize(int i)
    {
        return new HashSet(Maps.capacity(i));
    }

    static boolean removeAllImpl(Set set, Collection collection)
    {
        Preconditions.checkNotNull(collection);
        Object obj = collection;
        if (collection instanceof Multiset)
        {
            obj = ((Multiset)collection).elementSet();
        }
        if ((obj instanceof Set) && ((Collection) (obj)).size() > set.size())
        {
            return Iterators.removeAll(set.iterator(), ((Collection) (obj)));
        } else
        {
            return removeAllImpl(set, ((Collection) (obj)).iterator());
        }
    }

    static boolean removeAllImpl(Set set, Iterator iterator)
    {
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= set.remove(iterator.next())) { }
        return flag;
    }

    public static SetView symmetricDifference(Set set, Set set1)
    {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set1, "set2");
        return difference(union(set, set1), intersection(set, set1));
    }

    private static SetView union(Set set, Set set1)
    {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set1, "set2");
        return new SetView(set, difference(set1, set), set1) {

            final Set val$set1;
            final Set val$set2;
            final Set val$set2minus1;

            public final boolean contains(Object obj)
            {
                return set1.contains(obj) || set2.contains(obj);
            }

            public final boolean isEmpty()
            {
                return set1.isEmpty() && set2.isEmpty();
            }

            public final Iterator iterator()
            {
                return Iterators.unmodifiableIterator(Iterators.concat(set1.iterator(), set2minus1.iterator()));
            }

            public final int size()
            {
                return set1.size() + set2minus1.size();
            }

            
            {
                set1 = set;
                set2minus1 = set3;
                set2 = set4;
                super();
            }
        };
    }
}
