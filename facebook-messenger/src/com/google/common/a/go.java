// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Predicate;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            l

final class go extends l
{

    final Iterator a;
    final Predicate b;

    go(Iterator iterator, Predicate predicate)
    {
        a = iterator;
        b = predicate;
        super();
    }

    protected Object a()
    {
        while (a.hasNext()) 
        {
            Object obj = a.next();
            if (b.apply(obj))
            {
                return obj;
            }
        }
        return b();
    }
}
