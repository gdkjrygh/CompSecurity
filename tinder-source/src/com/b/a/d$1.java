// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.b.a:
//            d

static final class b
    implements Iterator
{

    final List a;
    private int b;

    public final boolean hasNext()
    {
        return b < a.size();
    }

    public final Object next()
    {
        List list = a;
        int i = b;
        b = i + 1;
        return list.get(i);
    }

    st(List list)
    {
        a = list;
        super();
        b = 0;
    }
}
