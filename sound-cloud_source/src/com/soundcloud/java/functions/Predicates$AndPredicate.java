// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;

import com.soundcloud.java.strings.Joiner;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.soundcloud.java.functions:
//            Predicate, Predicates

private static class components
    implements Predicate, Serializable
{

    private static final long serialVersionUID = 0L;
    private final List components;

    public boolean apply(Object obj)
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

    public boolean equals(Object obj)
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

    public int hashCode()
    {
        return components.hashCode() + 0x12472c2c;
    }

    public String toString()
    {
        return (new StringBuilder("Predicates.and(")).append(Predicates.access$100().join(components)).append(")").toString();
    }

    (List list)
    {
        components = list;
    }
}
