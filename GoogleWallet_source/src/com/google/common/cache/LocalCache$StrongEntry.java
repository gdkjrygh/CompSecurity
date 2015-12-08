// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;


// Referenced classes of package com.google.common.cache:
//            LocalCache

static class next extends renceEntry
{

    final int hash;
    final Object key;
    final ry next;
    volatile ce valueReference;

    public final int getHash()
    {
        return hash;
    }

    public final Object getKey()
    {
        return key;
    }

    public final ry getNext()
    {
        return next;
    }

    public final ce getValueReference()
    {
        return valueReference;
    }

    public final void setValueReference(ce ce)
    {
        valueReference = ce;
    }

    ry(Object obj, int i, ry ry)
    {
        valueReference = LocalCache.unset();
        key = obj;
        hash = i;
        next = ry;
    }
}
