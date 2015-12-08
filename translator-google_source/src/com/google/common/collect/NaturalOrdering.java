// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Ordering, ReverseNaturalOrdering

final class NaturalOrdering extends Ordering
    implements Serializable
{

    static final NaturalOrdering INSTANCE = new NaturalOrdering();
    private static final long serialVersionUID = 0L;

    private NaturalOrdering()
    {
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

    public final int compare(Comparable comparable, Comparable comparable1)
    {
        p.a(comparable);
        p.a(comparable1);
        return comparable.compareTo(comparable1);
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((Comparable)obj, (Comparable)obj1);
    }

    public final Ordering reverse()
    {
        return ReverseNaturalOrdering.INSTANCE;
    }

    public final String toString()
    {
        return "Ordering.natural()";
    }

}
