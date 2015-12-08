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

    public Object get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        if (i == 0)
        {
            return first;
        } else
        {
            return rest[i - 1];
        }
    }

    public int size()
    {
        return rest.length + 1;
    }

    (Object obj, Object aobj[])
    {
        first = obj;
        rest = (Object[])Preconditions.checkNotNull(((Object) (aobj)));
    }
}
