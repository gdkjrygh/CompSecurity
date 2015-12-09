// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class previousWrite extends previousWrite
{

    volatile long accessTime;
    writeTime nextAccess;
    writeTime nextWrite;
    writeTime previousAccess;
    writeTime previousWrite;
    volatile long writeTime;

    public final long getAccessTime()
    {
        return accessTime;
    }

    public final accessTime getNextInAccessQueue()
    {
        return nextAccess;
    }

    public final nextAccess getNextInWriteQueue()
    {
        return nextWrite;
    }

    public final nextWrite getPreviousInAccessQueue()
    {
        return previousAccess;
    }

    public final previousAccess getPreviousInWriteQueue()
    {
        return previousWrite;
    }

    public final long getWriteTime()
    {
        return writeTime;
    }

    public final void setAccessTime(long l)
    {
        accessTime = l;
    }

    public final void setNextInAccessQueue(accessTime accesstime)
    {
        nextAccess = accesstime;
    }

    public final void setNextInWriteQueue(nextAccess nextaccess)
    {
        nextWrite = nextaccess;
    }

    public final void setPreviousInAccessQueue(nextWrite nextwrite)
    {
        previousAccess = nextwrite;
    }

    public final void setPreviousInWriteQueue(previousAccess previousaccess)
    {
        previousWrite = previousaccess;
    }

    public final void setWriteTime(long l)
    {
        writeTime = l;
    }

    (ReferenceQueue referencequeue, Object obj, int i,  )
    {
        super(referencequeue, obj, i, );
        accessTime = 0x7fffffffffffffffL;
        nextAccess = LocalCache.nullEntry();
        previousAccess = LocalCache.nullEntry();
        writeTime = 0x7fffffffffffffffL;
        nextWrite = LocalCache.nullEntry();
        previousWrite = LocalCache.nullEntry();
    }
}
