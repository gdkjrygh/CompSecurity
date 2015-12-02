// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.b;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.facebook.common.b:
//            a

class b
    implements Iterator
{

    int a;
    final a b;

    b(a a1)
    {
        b = a1;
        super();
        a = -1;
    }

    public boolean hasNext()
    {
        return a + 1 < com.facebook.common.b.a.a(b).size();
    }

    public Object next()
    {
        a = a + 1;
        return com.facebook.common.b.a.a(b).get(a);
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Remove not supported for this set iterator");
    }
}
