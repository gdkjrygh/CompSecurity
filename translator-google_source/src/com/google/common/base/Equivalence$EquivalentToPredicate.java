// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

// Referenced classes of package com.google.common.base:
//            q, p, Equivalence, k

final class target
    implements q, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Equivalence equivalence;
    private final Object target;

    public final boolean apply(Object obj)
    {
        return equivalence.equivalent(obj, target);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof target)
            {
                if (!equivalence.equals(((equivalence) (obj = (equivalence)obj)).equivalence) || !k.a(target, ((target) (obj)).target))
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
            equivalence, target
        });
    }

    public final String toString()
    {
        return (new StringBuilder()).append(equivalence).append(".equivalentTo(").append(target).append(")").toString();
    }

    (Equivalence equivalence1, Object obj)
    {
        equivalence = (Equivalence)p.a(equivalence1);
        target = obj;
    }
}
