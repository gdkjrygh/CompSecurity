// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableCollection, $UnmodifiableIterator

private static class <init> extends $ImmutableCollection
{

    public boolean contains(Object obj)
    {
        return false;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public $UnmodifiableIterator iterator()
    {
        return $ImmutableCollection.access$100();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return 0;
    }

    public Object[] toArray()
    {
        return $ImmutableCollection.access$200();
    }

    public Object[] toArray(Object aobj[])
    {
        if (aobj.length > 0)
        {
            aobj[0] = null;
        }
        return aobj;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
