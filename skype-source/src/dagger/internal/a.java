// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

final class a
{

    static LinkedHashSet a(int i)
    {
        return new LinkedHashSet(c(i));
    }

    static LinkedHashMap b(int i)
    {
        return new LinkedHashMap(c(i));
    }

    private static int c(int i)
    {
        if (i < 3)
        {
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return (int)((float)i / 0.75F + 1.0F);
        } else
        {
            return 0x7fffffff;
        }
    }
}
