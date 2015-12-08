// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import cva;
import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            ReverseNaturalOrdering

public final class NaturalOrdering extends cva
    implements Serializable
{

    public static final NaturalOrdering a = new NaturalOrdering();
    private static final long serialVersionUID = 0L;

    private NaturalOrdering()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    public final cva a()
    {
        return ReverseNaturalOrdering.a;
    }

    public final int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        ctz.a(obj);
        ctz.a(obj1);
        return ((Comparable) (obj)).compareTo(obj1);
    }

    public final String toString()
    {
        return "Ordering.natural()";
    }

}
