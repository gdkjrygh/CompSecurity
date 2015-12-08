// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            TransformedIterator

final class terator extends TransformedIterator
{

    final volatile Object transform(Object obj)
    {
        return transform((Iterable)obj);
    }

    final Iterator transform(Iterable iterable)
    {
        return iterable.iterator();
    }

    terator(Iterator iterator)
    {
        super(iterator);
    }
}
