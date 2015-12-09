// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Predicate, Predicates

static final class <init>
    implements Predicate, Serializable
{

    private final Object target;

    public final boolean apply(Object obj)
    {
        return target.equals(obj);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof target)
        {
            obj = (target)obj;
            return target.equals(((target) (obj)).target);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return target.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("Predicates.equalTo(")).append(target).append(")").toString();
    }

    private (Object obj)
    {
        target = obj;
    }

    target(Object obj, target target1)
    {
        this(obj);
    }
}
