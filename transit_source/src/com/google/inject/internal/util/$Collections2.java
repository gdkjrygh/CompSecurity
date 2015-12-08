// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.inject.internal.util:
//            $Lists

public final class $Collections2
{

    private $Collections2()
    {
    }

    static boolean setEquals(Set set, Object obj)
    {
        if (obj != set)
        {
            if (obj instanceof Set)
            {
                if (set.size() != ((Set) (obj = (Set)obj)).size() || !set.containsAll(((Collection) (obj))))
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

    static Collection toCollection(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return (Collection)iterable;
        } else
        {
            return $Lists.newArrayList(iterable);
        }
    }
}
