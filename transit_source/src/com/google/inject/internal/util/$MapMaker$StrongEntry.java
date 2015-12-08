// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $MapMaker

private static class hash
    implements ry
{

    final int hash;
    final ap.Internals internals;
    final Object key;
    volatile ce valueReference;

    public int getHash()
    {
        return hash;
    }

    public Object getKey()
    {
        return key;
    }

    public ry getNext()
    {
        return null;
    }

    public ce getValueReference()
    {
        return valueReference;
    }

    public void setValueReference(ce ce)
    {
        valueReference = ce;
    }

    public void valueReclaimed()
    {
        internals.removeEntry(this, null);
    }

    ap.Internals(ap.Internals internals1, Object obj, int i)
    {
        valueReference = $MapMaker.access$600();
        internals = internals1;
        key = obj;
        hash = i;
    }
}
