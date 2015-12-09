// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

final class Collections
{

    private Collections()
    {
    }

    private static int calculateInitialCapacity(int i)
    {
        if (i < 3)
        {
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return i / 3 + i;
        } else
        {
            return 0x7fffffff;
        }
    }

    static LinkedHashMap newLinkedHashMapWithExpectedSize(int i)
    {
        return new LinkedHashMap(calculateInitialCapacity(i), 1.0F);
    }

    static LinkedHashSet newLinkedHashSetWithExpectedSize(int i)
    {
        return new LinkedHashSet(calculateInitialCapacity(i), 1.0F);
    }
}
