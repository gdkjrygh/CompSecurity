// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ByFunctionOrdering;
import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.Lists;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.ReverseOrdering;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public abstract class cva
    implements Comparator
{

    public cva()
    {
    }

    public static cva a(Comparator comparator)
    {
        if (comparator instanceof cva)
        {
            return (cva)comparator;
        } else
        {
            return new ComparatorOrdering(comparator);
        }
    }

    public static cva b()
    {
        return NaturalOrdering.a;
    }

    public cva a()
    {
        return new ReverseOrdering(this);
    }

    public final cva a(ctv ctv)
    {
        return new ByFunctionOrdering(ctv, this);
    }

    public final List a(Iterable iterable)
    {
        iterable = ((Iterable) ((Object[])cuv.b(iterable).toArray()));
        Arrays.sort(iterable, this);
        return Lists.a(Arrays.asList(iterable));
    }

    public abstract int compare(Object obj, Object obj1);
}
