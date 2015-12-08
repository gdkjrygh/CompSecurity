// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Enumeration;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Iterators

static final class val.iterator
    implements Enumeration
{

    final Iterator val$iterator;

    public boolean hasMoreElements()
    {
        return val$iterator.hasNext();
    }

    public Object nextElement()
    {
        return val$iterator.next();
    }

    (Iterator iterator1)
    {
        val$iterator = iterator1;
        super();
    }
}
