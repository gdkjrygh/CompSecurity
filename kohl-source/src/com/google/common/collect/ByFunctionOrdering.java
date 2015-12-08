// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Ordering

final class ByFunctionOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Function function;
    final Ordering ordering;

    ByFunctionOrdering(Function function1, Ordering ordering1)
    {
        function = (Function)Preconditions.checkNotNull(function1);
        ordering = (Ordering)Preconditions.checkNotNull(ordering1);
    }

    public int compare(Object obj, Object obj1)
    {
        return ordering.compare(function.apply(obj), function.apply(obj1));
    }

    public boolean equals(Object obj)
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

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            function, ordering
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append(ordering).append(".onResultOf(").append(function).append(")").toString();
    }
}
