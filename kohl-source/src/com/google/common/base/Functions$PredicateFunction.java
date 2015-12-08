// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Function, Functions, Preconditions, Predicate

private static class <init>
    implements Function, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Predicate predicate;

    public Boolean apply(Object obj)
    {
        return Boolean.valueOf(predicate.apply(obj));
    }

    public volatile Object apply(Object obj)
    {
        return apply(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof apply)
        {
            obj = (apply)obj;
            return predicate.equals(((predicate) (obj)).predicate);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return predicate.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("forPredicate(").append(predicate).append(")").toString();
    }

    private (Predicate predicate1)
    {
        predicate = (Predicate)Preconditions.checkNotNull(predicate1);
    }

    predicate(Predicate predicate1, predicate predicate2)
    {
        this(predicate1);
    }
}
