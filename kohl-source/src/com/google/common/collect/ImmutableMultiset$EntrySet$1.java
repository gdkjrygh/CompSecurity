// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator, ImmutableMultiset, Multisets

class val.mapIterator extends UnmodifiableIterator
{

    final next this$0;
    final Iterator val$mapIterator;

    public boolean hasNext()
    {
        return val$mapIterator.hasNext();
    }

    public val.mapIterator next()
    {
        java.util.y y = (java.util.y)val$mapIterator.next();
        return Multisets.immutableEntry(y.utableEntry(), ((Integer)y.utableEntry()).intValue());
    }

    public volatile Object next()
    {
        return next();
    }

    ()
    {
        this$0 = final_;
        val$mapIterator = Iterator.this;
        super();
    }
}
