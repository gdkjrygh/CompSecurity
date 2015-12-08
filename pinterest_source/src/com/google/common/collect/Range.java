// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.io.Serializable;
import java.util.Iterator;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            Cut, BoundType, ContiguousSet, Ordering, 
//            Iterables, DiscreteDomain

public final class Range
    implements Predicate, Serializable
{

    private static final Range ALL = new Range(Cut.belowAll(), Cut.aboveAll());
    private static final Function LOWER_BOUND_FN = new _cls1();
    static final Ordering RANGE_LEX_ORDERING = new _cls3();
    private static final Function UPPER_BOUND_FN = new _cls2();
    private static final long serialVersionUID = 0L;
    final Cut lowerBound;
    final Cut upperBound;

    private Range(Cut cut, Cut cut1)
    {
        if (cut.compareTo(cut1) > 0 || cut == Cut.aboveAll() || cut1 == Cut.belowAll())
        {
            cut = String.valueOf(toString(cut, cut1));
            if (cut.length() != 0)
            {
                cut = "Invalid range: ".concat(cut);
            } else
            {
                cut = new String("Invalid range: ");
            }
            throw new IllegalArgumentException(cut);
        } else
        {
            lowerBound = (Cut)Preconditions.checkNotNull(cut);
            upperBound = (Cut)Preconditions.checkNotNull(cut1);
            return;
        }
    }

    public static Range all()
    {
        return ALL;
    }

    public static Range atLeast(Comparable comparable)
    {
        return create(Cut.belowValue(comparable), Cut.aboveAll());
    }

    public static Range atMost(Comparable comparable)
    {
        return create(Cut.belowAll(), Cut.aboveValue(comparable));
    }

    private static SortedSet cast(Iterable iterable)
    {
        return (SortedSet)iterable;
    }

    public static Range closed(Comparable comparable, Comparable comparable1)
    {
        return create(Cut.belowValue(comparable), Cut.aboveValue(comparable1));
    }

    public static Range closedOpen(Comparable comparable, Comparable comparable1)
    {
        return create(Cut.belowValue(comparable), Cut.belowValue(comparable1));
    }

    static int compareOrThrow(Comparable comparable, Comparable comparable1)
    {
        return comparable.compareTo(comparable1);
    }

    static Range create(Cut cut, Cut cut1)
    {
        return new Range(cut, cut1);
    }

    public static Range downTo(Comparable comparable, BoundType boundtype)
    {
        switch (_cls4..SwitchMap.com.google.common.collect.BoundType[boundtype.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            return greaterThan(comparable);

        case 2: // '\002'
            return atLeast(comparable);
        }
    }

    public static Range encloseAll(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof ContiguousSet)
        {
            return ((ContiguousSet)iterable).range();
        }
        Iterator iterator = iterable.iterator();
        Comparable comparable = (Comparable)Preconditions.checkNotNull(iterator.next());
        Comparable comparable1;
        for (iterable = comparable; iterator.hasNext(); iterable = (Comparable)Ordering.natural().max(iterable, comparable1))
        {
            comparable1 = (Comparable)Preconditions.checkNotNull(iterator.next());
            comparable = (Comparable)Ordering.natural().min(comparable, comparable1);
        }

        return closed(comparable, iterable);
    }

    public static Range greaterThan(Comparable comparable)
    {
        return create(Cut.aboveValue(comparable), Cut.aboveAll());
    }

    public static Range lessThan(Comparable comparable)
    {
        return create(Cut.belowAll(), Cut.belowValue(comparable));
    }

    static Function lowerBoundFn()
    {
        return LOWER_BOUND_FN;
    }

    public static Range open(Comparable comparable, Comparable comparable1)
    {
        return create(Cut.aboveValue(comparable), Cut.belowValue(comparable1));
    }

    public static Range openClosed(Comparable comparable, Comparable comparable1)
    {
        return create(Cut.aboveValue(comparable), Cut.aboveValue(comparable1));
    }

    public static Range range(Comparable comparable, BoundType boundtype, Comparable comparable1, BoundType boundtype1)
    {
        Preconditions.checkNotNull(boundtype);
        Preconditions.checkNotNull(boundtype1);
        if (boundtype == BoundType.OPEN)
        {
            comparable = Cut.aboveValue(comparable);
        } else
        {
            comparable = Cut.belowValue(comparable);
        }
        if (boundtype1 == BoundType.OPEN)
        {
            boundtype = Cut.belowValue(comparable1);
        } else
        {
            boundtype = Cut.aboveValue(comparable1);
        }
        return create(comparable, boundtype);
    }

    public static Range singleton(Comparable comparable)
    {
        return closed(comparable, comparable);
    }

    private static String toString(Cut cut, Cut cut1)
    {
        StringBuilder stringbuilder = new StringBuilder(16);
        cut.describeAsLowerBound(stringbuilder);
        stringbuilder.append('\u2025');
        cut1.describeAsUpperBound(stringbuilder);
        return stringbuilder.toString();
    }

    public static Range upTo(Comparable comparable, BoundType boundtype)
    {
        switch (_cls4..SwitchMap.com.google.common.collect.BoundType[boundtype.ordinal()])
        {
        default:
            throw new AssertionError();

        case 1: // '\001'
            return lessThan(comparable);

        case 2: // '\002'
            return atMost(comparable);
        }
    }

    static Function upperBoundFn()
    {
        return UPPER_BOUND_FN;
    }

    public final boolean apply(Comparable comparable)
    {
        return contains(comparable);
    }

    public final volatile boolean apply(Object obj)
    {
        return apply((Comparable)obj);
    }

    public final Range canonical(DiscreteDomain discretedomain)
    {
        Preconditions.checkNotNull(discretedomain);
        Cut cut = lowerBound.canonical(discretedomain);
        discretedomain = upperBound.canonical(discretedomain);
        if (cut == lowerBound && discretedomain == upperBound)
        {
            return this;
        } else
        {
            return create(cut, discretedomain);
        }
    }

    public final boolean contains(Comparable comparable)
    {
        Preconditions.checkNotNull(comparable);
        return lowerBound.isLessThan(comparable) && !upperBound.isLessThan(comparable);
    }

    public final boolean containsAll(Iterable iterable)
    {
        if (Iterables.isEmpty(iterable))
        {
            return true;
        }
        if (iterable instanceof SortedSet)
        {
            SortedSet sortedset = cast(iterable);
            java.util.Comparator comparator = sortedset.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null)
            {
                return contains((Comparable)sortedset.first()) && contains((Comparable)sortedset.last());
            }
        }
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (!contains((Comparable)iterable.next()))
            {
                return false;
            }
        }

        return true;
    }

    public final boolean encloses(Range range1)
    {
        return lowerBound.compareTo(range1.lowerBound) <= 0 && upperBound.compareTo(range1.upperBound) >= 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Range)
        {
            obj = (Range)obj;
            flag = flag1;
            if (lowerBound.equals(((Range) (obj)).lowerBound))
            {
                flag = flag1;
                if (upperBound.equals(((Range) (obj)).upperBound))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final boolean hasLowerBound()
    {
        return lowerBound != Cut.belowAll();
    }

    public final boolean hasUpperBound()
    {
        return upperBound != Cut.aboveAll();
    }

    public final int hashCode()
    {
        return lowerBound.hashCode() * 31 + upperBound.hashCode();
    }

    public final Range intersection(Range range1)
    {
        int i = lowerBound.compareTo(range1.lowerBound);
        int j = upperBound.compareTo(range1.upperBound);
        if (i >= 0 && j <= 0)
        {
            return this;
        }
        if (i <= 0 && j >= 0)
        {
            return range1;
        }
        Cut cut;
        if (i >= 0)
        {
            cut = lowerBound;
        } else
        {
            cut = range1.lowerBound;
        }
        if (j <= 0)
        {
            range1 = upperBound;
        } else
        {
            range1 = range1.upperBound;
        }
        return create(cut, range1);
    }

    public final boolean isConnected(Range range1)
    {
        return lowerBound.compareTo(range1.upperBound) <= 0 && range1.lowerBound.compareTo(upperBound) <= 0;
    }

    public final boolean isEmpty()
    {
        return lowerBound.equals(upperBound);
    }

    public final BoundType lowerBoundType()
    {
        return lowerBound.typeAsLowerBound();
    }

    public final Comparable lowerEndpoint()
    {
        return lowerBound.endpoint();
    }

    final Object readResolve()
    {
        Range range1 = this;
        if (equals(ALL))
        {
            range1 = all();
        }
        return range1;
    }

    public final Range span(Range range1)
    {
        int i = lowerBound.compareTo(range1.lowerBound);
        int j = upperBound.compareTo(range1.upperBound);
        if (i <= 0 && j >= 0)
        {
            return this;
        }
        if (i >= 0 && j <= 0)
        {
            return range1;
        }
        Cut cut;
        if (i <= 0)
        {
            cut = lowerBound;
        } else
        {
            cut = range1.lowerBound;
        }
        if (j >= 0)
        {
            range1 = upperBound;
        } else
        {
            range1 = range1.upperBound;
        }
        return create(cut, range1);
    }

    public final String toString()
    {
        return toString(lowerBound, upperBound);
    }

    public final BoundType upperBoundType()
    {
        return upperBound.typeAsUpperBound();
    }

    public final Comparable upperEndpoint()
    {
        return upperBound.endpoint();
    }


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
