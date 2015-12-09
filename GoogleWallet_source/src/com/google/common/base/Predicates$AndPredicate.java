// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.google.common.base:
//            Predicate, Predicates, Joiner

static final class <init>
    implements Predicate, Serializable
{

    private final List components;

    public final boolean apply(Object obj)
    {
        for (int i = 0; i < components.size(); i++)
        {
            if (!((Predicate)components.get(i)).apply(obj))
            {
                return false;
            }
        }

        return true;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof components)
        {
            obj = (components)obj;
            return components.equals(((components) (obj)).components);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return components.hashCode() + 0x12472c2c;
    }

    public final String toString()
    {
        return (new StringBuilder("Predicates.and(")).append(Predicates.access$800().join(components)).append(")").toString();
    }

    private (List list)
    {
        components = list;
    }

    components(List list, components components1)
    {
        this(list);
    }
}
