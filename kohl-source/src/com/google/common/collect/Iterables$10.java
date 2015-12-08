// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Iterables, Iterators

static final class rableWithToString extends rableWithToString
{

    final List val$list;
    final int val$numberToSkip;

    public Iterator iterator()
    {
        if (val$numberToSkip >= val$list.size())
        {
            return Iterators.emptyIterator();
        } else
        {
            return val$list.subList(val$numberToSkip, val$list.size()).iterator();
        }
    }

    rableWithToString(int i, List list1)
    {
        val$numberToSkip = i;
        val$list = list1;
        super();
    }
}
