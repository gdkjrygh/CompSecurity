// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2.jsonextract;

import java.util.Iterator;

// Referenced classes of package com.dropbox.client2.jsonextract:
//            JsonThing, JsonList

final class <init>
    implements Iterator
{

    private final Iterator internal;
    private int numReturned;
    private final String path;

    public final boolean hasNext()
    {
        return internal.hasNext();
    }

    public final JsonThing next()
    {
        int i = numReturned;
        numReturned = i + 1;
        return new JsonThing(internal.next(), JsonList.access$000(path, i));
    }

    public final volatile Object next()
    {
        return next();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("can't remove");
    }

    private (String s, Iterator iterator)
    {
        numReturned = 0;
        path = s;
        internal = iterator;
    }

    internal(String s, Iterator iterator, internal internal1)
    {
        this(s, iterator);
    }
}
