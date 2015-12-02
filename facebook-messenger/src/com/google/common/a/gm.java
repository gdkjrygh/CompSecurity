// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            mh

final class gm extends mh
{

    final Iterator a;

    gm(Iterator iterator)
    {
        a = iterator;
        super();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return a.next();
    }
}
