// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            mh, jh, ke, jg

class kf extends mh
{

    final Iterator a;
    final ke b;

    kf(ke ke, Iterator iterator)
    {
        b = ke;
        a = iterator;
        super();
    }

    public jg a()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
        return jh.a(entry.getKey(), ((Integer)entry.getValue()).intValue());
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return a();
    }
}
