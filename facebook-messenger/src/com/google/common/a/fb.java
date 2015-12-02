// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            mh, em, ik, fa

class fb extends mh
{

    Object a;
    Iterator b;
    final Iterator c;
    final fa d;

    fb(fa fa, Iterator iterator)
    {
        d = fa;
        c = iterator;
        super();
    }

    public java.util.Map.Entry a()
    {
        if (a == null || !b.hasNext())
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)c.next();
            a = entry.getKey();
            b = ((em)entry.getValue()).h_();
        }
        return ik.a(a, b.next());
    }

    public boolean hasNext()
    {
        return a != null && b.hasNext() || c.hasNext();
    }

    public Object next()
    {
        return a();
    }
}
