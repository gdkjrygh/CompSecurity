// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Enumeration;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, Iterators

static final class terator extends UnmodifiableIterator
{

    final Enumeration val$enumeration;

    public boolean hasNext()
    {
        return val$enumeration.hasMoreElements();
    }

    public Object next()
    {
        return val$enumeration.nextElement();
    }

    terator(Enumeration enumeration1)
    {
        val$enumeration = enumeration1;
        super();
    }
}
