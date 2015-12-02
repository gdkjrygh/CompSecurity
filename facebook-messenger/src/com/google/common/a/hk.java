// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            hl, hj, jg

class hk
    implements Iterator
{

    final Iterator a;
    final hj b;

    hk(hj hj, Iterator iterator)
    {
        b = hj;
        a = iterator;
        super();
    }

    public jg a()
    {
        return new hl(this, a.next());
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        a.remove();
    }
}
