// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import com.b.a.a.b;
import java.util.Iterator;

// Referenced classes of package com.b.a:
//            d

final class ject
    implements Iterator
{

    final b a;
    final d b;
    private Object c;

    public final boolean hasNext()
    {
        while (b.a.hasNext()) 
        {
            c = b.a.next();
            if (a.test(c))
            {
                return true;
            }
        }
        return false;
    }

    public final Object next()
    {
        return c;
    }

    ject(d d1, b b1)
    {
        b = d1;
        a = b1;
        super();
    }
}
