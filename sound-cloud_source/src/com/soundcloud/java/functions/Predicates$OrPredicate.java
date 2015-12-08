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
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < components.size())
                {
                    if (!((Predicate)components.get(i)).apply(obj))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
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
        return components.hashCode() + 0x53c91cf;
    }

    public String toString()
    {
        return (new StringBuilder("Predicates.or(")).append(Predicates.access$100().join(components)).append(")").toString();
    }

    (List list)
    {
        components = list;
    }
}
