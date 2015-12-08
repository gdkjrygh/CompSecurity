// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            UnmodifiableIterator

public abstract class UnmodifiableListIterator extends UnmodifiableIterator
    implements ListIterator
{

    protected UnmodifiableListIterator()
    {
    }

    public final void add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public final void set(Object obj)
    {
        throw new UnsupportedOperationException();
    }
}
