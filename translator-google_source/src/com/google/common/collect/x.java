// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            dg, w, de

class x extends dg
{

    final w a;

    private x(w w1)
    {
        a = w1;
        super();
    }

    x(w w1, byte byte0)
    {
        this(w1);
    }

    final de a()
    {
        return a;
    }

    public Iterator iterator()
    {
        return a.entryIterator();
    }
}
