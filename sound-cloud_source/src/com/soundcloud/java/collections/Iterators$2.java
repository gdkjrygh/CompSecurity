// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.soundcloud.java.collections:
//            CollectPreconditions

final class nditions
    implements Iterator
{

    public final boolean hasNext()
    {
        return false;
    }

    public final Object next()
    {
        throw new NoSuchElementException();
    }

    public final void remove()
    {
        CollectPreconditions.checkRemove(false);
    }

    nditions()
    {
    }
}
