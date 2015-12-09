// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            di

final class bq extends di
{

    final Iterator a;

    bq(Iterator iterator)
    {
        a = iterator;
        super();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        return a.next();
    }
}
