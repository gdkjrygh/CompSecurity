// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share;

import com.facebook.internal.Mutable;
import java.util.Iterator;

class val.size
    implements Iterator
{

    final next this$0;
    final Mutable val$current;
    final int val$size;

    public boolean hasNext()
    {
        return ((Integer)val$current.value).intValue() < val$size;
    }

    public Integer next()
    {
        Integer integer = (Integer)val$current.value;
        Mutable mutable = val$current;
        mutable.value = Integer.valueOf(((Integer)mutable.value).intValue() + 1);
        return integer;
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
    }

    ()
    {
        this$0 = final_;
        val$current = mutable;
        val$size = I.this;
        super();
    }
}
