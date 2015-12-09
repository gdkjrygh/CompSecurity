// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class previousWrite extends previousWrite
{

    writeTime nextWrite;
    writeTime previousWrite;
    volatile long writeTime;

    public final previousWrite getNextInWriteQueue()
    {
        return nextWrite;
    }

    public final nextWrite getPreviousInWriteQueue()
    {
        return previousWrite;
    }

    public final long getWriteTime()
    {
        return writeTime;
    }

    public final void setNextInWriteQueue(writeTime writetime)
    {
        nextWrite = writetime;
    }

    public final void setPreviousInWriteQueue(nextWrite nextwrite)
    {
        previousWrite = nextwrite;
    }

    public final void setWriteTime(long l)
    {
        writeTime = l;
    }

    (ReferenceQueue referencequeue, Object obj, int i,  )
    {
        super(referencequeue, obj, i, );
        writeTime = 0x7fffffffffffffffL;
        nextWrite = LocalCache.nullEntry();
        previousWrite = LocalCache.nullEntry();
    }
}
