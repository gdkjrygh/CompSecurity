// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            Lists

private static class  extends AbstractList
    implements Serializable, RandomAccess
{

    private static final long serialVersionUID = 0L;
    final Object first;
    final Object rest[];
    final Object second;

    public Object get(int i)
    {
        switch (i)
        {
        default:
            Preconditions.checkElementIndex(i, size());
            return rest[i - 2];

        case 0: // '\0'
            return first;

        case 1: // '\001'
            return second;
        }
    }

    public int size()
    {
        return rest.length + 2;
    }

    (Object obj, Object obj1, Object aobj[])
    {
        first = obj;
        second = obj1;
        rest = (Object[])Preconditions.checkNotNull(((Object) (aobj)));
    }
}
