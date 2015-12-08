// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;

import java.io.Serializable;

// Referenced classes of package com.soundcloud.java.functions:
//            Predicate, Predicates

private static class target
    implements Predicate, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object target;

    public boolean apply(Object obj)
    {
        return target.equals(obj);
    }

    public boolean equals(Object obj)
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

    public int hashCode()
    {
        return target.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Predicates.equalTo(")).append(target).append(")").toString();
    }

    A(Object obj)
    {
        target = obj;
    }
}
