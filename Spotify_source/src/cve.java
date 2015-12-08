// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.SortedSet;

public final class cve
{

    public static boolean a(Comparator comparator, Iterable iterable)
    {
        ctz.a(comparator);
        ctz.a(iterable);
        if (iterable instanceof SortedSet)
        {
            Comparator comparator1 = ((SortedSet)iterable).comparator();
            iterable = comparator1;
            if (comparator1 == null)
            {
                iterable = cva.b();
            }
        } else
        if (iterable instanceof cvd)
        {
            iterable = ((cvd)iterable).comparator();
        } else
        {
            return false;
        }
        return comparator.equals(iterable);
    }
}
