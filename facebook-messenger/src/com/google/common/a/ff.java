// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            mh, jg, fe

class ff extends mh
{

    int a;
    Object b;
    final Iterator c;
    final fe d;

    ff(fe fe, Iterator iterator)
    {
        d = fe;
        c = iterator;
        super();
    }

    public boolean hasNext()
    {
        return a > 0 || c.hasNext();
    }

    public Object next()
    {
        if (a <= 0)
        {
            jg jg1 = (jg)c.next();
            b = jg1.a();
            a = jg1.b();
        }
        a = a - 1;
        return b;
    }
}
