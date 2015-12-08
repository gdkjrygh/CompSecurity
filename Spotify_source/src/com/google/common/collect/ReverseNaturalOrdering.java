// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cva;
import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            NaturalOrdering

final class ReverseNaturalOrdering extends cva
    implements Serializable
{

    static final ReverseNaturalOrdering a = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0L;

    private ReverseNaturalOrdering()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    public final cva a()
    {
        return NaturalOrdering.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        ctz.a(obj);
        if (obj == obj1)
        {
            return 0;
        } else
        {
            return ((Comparable) (obj1)).compareTo(obj);
        }
    }

    public final String toString()
    {
        return "Ordering.natural().reverse()";
    }

}
