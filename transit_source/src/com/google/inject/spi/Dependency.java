// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Key;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.inject.spi:
//            InjectionPoint

public final class Dependency
{

    private final InjectionPoint injectionPoint;
    private final Key key;
    private final boolean nullable;
    private final int parameterIndex;

    Dependency(InjectionPoint injectionpoint, Key key1, boolean flag, int i)
    {
        injectionPoint = injectionpoint;
        key = (Key)$Preconditions.checkNotNull(key1, "key");
        nullable = flag;
        parameterIndex = i;
    }

    public static Set forInjectionPoints(Set set)
    {
        java.util.ArrayList arraylist = $Lists.newArrayList();
        for (set = set.iterator(); set.hasNext(); arraylist.addAll(((InjectionPoint)set.next()).getDependencies())) { }
        return $ImmutableSet.copyOf(arraylist);
    }

    public static Dependency get(Key key1)
    {
        return new Dependency(null, key1, true, -1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Dependency)
        {
            obj = (Dependency)obj;
            flag = flag1;
            if ($Objects.equal(injectionPoint, ((Dependency) (obj)).injectionPoint))
            {
                flag = flag1;
                if ($Objects.equal(Integer.valueOf(parameterIndex), Integer.valueOf(((Dependency) (obj)).parameterIndex)))
                {
                    flag = flag1;
                    if ($Objects.equal(key, ((Dependency) (obj)).key))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public InjectionPoint getInjectionPoint()
    {
        return injectionPoint;
    }

    public Key getKey()
    {
        return key;
    }

    public int getParameterIndex()
    {
        return parameterIndex;
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            injectionPoint, Integer.valueOf(parameterIndex), key
        });
    }

    public boolean isNullable()
    {
        return nullable;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(key);
        if (injectionPoint != null)
        {
            stringbuilder.append("@").append(injectionPoint);
            if (parameterIndex != -1)
            {
                stringbuilder.append("[").append(parameterIndex).append("]");
            }
        }
        return stringbuilder.toString();
    }
}
