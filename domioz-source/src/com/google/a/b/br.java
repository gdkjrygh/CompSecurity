// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ae;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            b

final class br extends b
{

    final Iterator a;
    final ae b;

    br(Iterator iterator, ae ae1)
    {
        a = iterator;
        b = ae1;
        super();
    }

    protected final Object a()
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
