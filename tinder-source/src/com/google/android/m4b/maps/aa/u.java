// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Comparator;
import java.util.SortedSet;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            q, t

final class u
{

    public static boolean a(Comparator comparator, Iterable iterable)
    {
        j.a(comparator);
        j.a(iterable);
        if (iterable instanceof SortedSet)
        {
            Comparator comparator1 = ((SortedSet)iterable).comparator();
            iterable = comparator1;
            if (comparator1 == null)
            {
                iterable = q.b();
            }
        } else
        if (iterable instanceof t)
        {
            iterable = ((t)iterable).comparator();
        } else
        {
            return false;
        }
        return comparator.equals(iterable);
    }
}
