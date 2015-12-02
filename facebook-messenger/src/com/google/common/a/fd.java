// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            mh, fc

class fd extends mh
{

    final Iterator a;
    final fc b;

    fd(fc fc, Iterator iterator)
    {
        b = fc;
        a = iterator;
        super();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return ((java.util.Map.Entry)a.next()).getValue();
    }
}
