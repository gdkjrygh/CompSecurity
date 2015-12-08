// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cuw;
import cuy;
import cva;
import cvb;
import cve;
import cvh;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableSortedSet, ImmutableList, SortedLists, ImmutableSortedAsList

final class RegularImmutableSortedSet extends ImmutableSortedSet
{

    private final transient ImmutableList b;

    RegularImmutableSortedSet(ImmutableList immutablelist, Comparator comparator)
    {
        super(comparator);
        b = immutablelist;
        boolean flag;
        if (!immutablelist.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
    }

    final int a(Object obj)
    {
        if (obj != null)
        {
            int i;
            try
            {
                i = SortedLists.a(b, obj, a, SortedLists.KeyPresentBehavior.a, SortedLists.KeyAbsentBehavior.b);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return -1;
            }
            if (i >= 0)
            {
                return i;
            }
        }
        return -1;
    }

    final int a(Object aobj[], int i)
    {
        return b.a(aobj, i);
    }

    final ImmutableSortedSet a(int i, int j)
    {
        if (i == 0 && j == size())
        {
            return this;
        }
        if (i < j)
        {
            return new RegularImmutableSortedSet(b.a(i, j), a);
        } else
        {
            return a(a);
        }
    }

    final ImmutableSortedSet a(Object obj, boolean flag)
    {
        return a(0, e(obj, flag));
    }

    final ImmutableSortedSet a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return b(obj, flag).a(obj1, flag1);
    }

    public final cvh a()
    {
        return b.a();
    }

    final ImmutableSortedSet b(Object obj, boolean flag)
    {
        return a(f(obj, flag), size());
    }

    public final cvh c()
    {
        return b.g().a();
    }

    public final Object ceiling(Object obj)
    {
        int i = f(obj, true);
        if (i == size())
        {
            return null;
        } else
        {
            return b.get(i);
        }
    }

    public final boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            int i;
            try
            {
                i = Collections.binarySearch(b, obj, a);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (i >= 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean containsAll(Collection collection)
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = collection;
        if (collection instanceof cuy)
        {
            obj = ((cuy)collection).a();
        }
        if (cve.a(comparator(), ((Iterable) (obj))) && ((Collection) (obj)).size() > 1) goto _L2; else goto _L1
_L1:
        boolean flag = super.containsAll(((Collection) (obj)));
_L7:
        return flag;
_L2:
        cvb cvb1;
        cvb1 = cuw.f(b.a());
        obj = ((Collection) (obj)).iterator();
        collection = ((Collection) (((Iterator) (obj)).next()));
_L4:
        int i;
        if (!cvb1.hasNext())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        i = a(cvb1.a(), collection);
        if (i < 0)
        {
            try
            {
                cvb1.next();
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        collection = ((Collection) (((Iterator) (obj)).next()));
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        if (i <= 0) goto _L4; else goto _L5
_L5:
        return false;
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    final ImmutableSortedSet d()
    {
        return new RegularImmutableSortedSet(b.g(), cva.a(a).a());
    }

    public final Iterator descendingIterator()
    {
        return c();
    }

    final int e(Object obj, boolean flag)
    {
        ImmutableList immutablelist = b;
        Object obj1 = ctz.a(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = SortedLists.KeyPresentBehavior.d;
        } else
        {
            obj = SortedLists.KeyPresentBehavior.c;
        }
        return SortedLists.a(immutablelist, obj1, comparator, ((SortedLists.KeyPresentBehavior) (obj)), SortedLists.KeyAbsentBehavior.a);
    }

    final boolean e()
    {
        return b.e();
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            return false;
        }
        obj = (Set)obj;
        if (size() != ((Set) (obj)).size())
        {
            return false;
        }
        if (!cve.a(a, ((Iterable) (obj))))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj = ((Set) (obj)).iterator();
        cvh cvh = b.a();
_L5:
        if (!cvh.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj1 = cvh.next();
        obj2 = ((Iterator) (obj)).next();
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i;
        try
        {
            i = a(obj1, obj2);
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
        if (i == 0) goto _L5; else goto _L4
_L4:
        return false;
        return containsAll(((Collection) (obj)));
    }

    final int f(Object obj, boolean flag)
    {
        ImmutableList immutablelist = b;
        Object obj1 = ctz.a(obj);
        Comparator comparator = comparator();
        if (flag)
        {
            obj = SortedLists.KeyPresentBehavior.c;
        } else
        {
            obj = SortedLists.KeyPresentBehavior.d;
        }
        return SortedLists.a(immutablelist, obj1, comparator, ((SortedLists.KeyPresentBehavior) (obj)), SortedLists.KeyAbsentBehavior.a);
    }

    final ImmutableList f()
    {
        return new ImmutableSortedAsList(this, b);
    }

    public final Object first()
    {
        return b.get(0);
    }

    public final Object floor(Object obj)
    {
        int i = e(obj, true) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return b.get(i);
        }
    }

    public final Object higher(Object obj)
    {
        int i = f(obj, false);
        if (i == size())
        {
            return null;
        } else
        {
            return b.get(i);
        }
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final Iterator iterator()
    {
        return b.a();
    }

    public final Object last()
    {
        return b.get(size() - 1);
    }

    public final Object lower(Object obj)
    {
        int i = e(obj, false) - 1;
        if (i == -1)
        {
            return null;
        } else
        {
            return b.get(i);
        }
    }

    public final int size()
    {
        return b.size();
    }
}
