// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $UnmodifiableIterator, $Iterators

static final class Iterator extends $UnmodifiableIterator
{

    public boolean hasNext()
    {
        return false;
    }

    public Object next()
    {
        throw new NoSuchElementException();
    }

    Iterator()
    {
    }
}
