// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class previousAccess extends previousAccess
{

    volatile long accessTime;
    previousAccess nextAccess;
    previousAccess previousAccess;

    public final long getAccessTime()
    {
        return accessTime;
    }

    public final accessTime getNextInAccessQueue()
    {
        return nextAccess;
    }

    public final nextAccess getPreviousInAccessQueue()
    {
        return previousAccess;
    }

    public final void setAccessTime(long l)
    {
        accessTime = l;
    }

    public final void setNextInAccessQueue(accessTime accesstime)
    {
        nextAccess = accesstime;
    }

    public final void setPreviousInAccessQueue(nextAccess nextaccess)
    {
        previousAccess = nextaccess;
    }

    (ReferenceQueue referencequeue, Object obj, int i,  )
    {
        super(referencequeue, obj, i, );
        accessTime = 0x7fffffffffffffffL;
        nextAccess = LocalCache.nullEntry();
        previousAccess = LocalCache.nullEntry();
    }
}
