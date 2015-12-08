// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;

import com.soundcloud.java.checks.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.soundcloud.java.functions:
//            Predicate, Predicates

private static class predicate
    implements Predicate, Serializable
{

    private static final long serialVersionUID = 0L;
    final Predicate predicate;

    public boolean apply(Object obj)
    {
        return !predicate.apply(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof predicate)
        {
            obj = (predicate)obj;
            return predicate.equals(((predicate) (obj)).predicate);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return ~predicate.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Predicates.not(")).append(predicate.toString()).append(")").toString();
    }

    (Predicate predicate1)
    {
        predicate = (Predicate)Preconditions.checkNotNull(predicate1);
    }
}
