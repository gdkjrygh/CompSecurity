// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Predicate, Preconditions

class ll
    implements Predicate, Serializable
{

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
        return (new StringBuilder()).append("Not(").append(predicate.toString()).append(")").toString();
    }

    (Predicate predicate1)
    {
        predicate = (Predicate)Preconditions.checkNotNull(predicate1);
    }
}
