// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            AbstractIterator, n, p, Optional

final class o extends AbstractIterator
{

    final n b;
    private final Iterator c;

    o(n n1)
    {
        b = n1;
        super();
        c = (Iterator)p.a(b.a.iterator());
    }

    protected final Object a()
    {
        while (c.hasNext()) 
        {
            Optional optional = (Optional)c.next();
            if (optional.isPresent())
            {
                return optional.get();
            }
        }
        super.a = AbstractIterator.State.DONE;
        return null;
    }
}
