// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.d;
import com.google.common.base.p;
import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.google.common.collect:
//            Ordering

final class ByFunctionOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final d function;
    final Ordering ordering;

    ByFunctionOrdering(d d1, Ordering ordering1)
    {
        function = (d)p.a(d1);
        ordering = (Ordering)p.a(ordering1);
    }

    public final int compare(Object obj, Object obj1)
    {
        return ordering.compare(function.apply(obj), function.apply(obj1));
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof ByFunctionOrdering)
            {
                if (!function.equals(((ByFunctionOrdering) (obj = (ByFunctionOrdering)obj)).function) || !ordering.equals(((ByFunctionOrdering) (obj)).ordering))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            function, ordering
        });
    }

    public final String toString()
    {
        return (new StringBuilder()).append(ordering).append(".onResultOf(").append(function).append(")").toString();
    }
}
