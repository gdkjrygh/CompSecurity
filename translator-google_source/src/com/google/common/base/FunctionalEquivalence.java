// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.google.common.base:
//            Equivalence, p, d

final class FunctionalEquivalence extends Equivalence
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final d function;
    private final Equivalence resultEquivalence;

    FunctionalEquivalence(d d1, Equivalence equivalence)
    {
        function = (d)p.a(d1);
        resultEquivalence = (Equivalence)p.a(equivalence);
    }

    protected final boolean doEquivalent(Object obj, Object obj1)
    {
        return resultEquivalence.equivalent(function.apply(obj), function.apply(obj1));
    }

    protected final int doHash(Object obj)
    {
        return resultEquivalence.hash(function.apply(obj));
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof FunctionalEquivalence)
            {
                if (!function.equals(((FunctionalEquivalence) (obj = (FunctionalEquivalence)obj)).function) || !resultEquivalence.equals(((FunctionalEquivalence) (obj)).resultEquivalence))
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
            function, resultEquivalence
        });
    }

    public final String toString()
    {
        return (new StringBuilder()).append(resultEquivalence).append(".onResultOf(").append(function).append(")").toString();
    }
}
