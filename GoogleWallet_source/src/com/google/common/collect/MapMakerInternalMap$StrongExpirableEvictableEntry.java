// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class previousEvictable extends previousEvictable
    implements previousEvictable
{

    previousExpirable nextEvictable;
    previousExpirable nextExpirable;
    previousExpirable previousEvictable;
    previousExpirable previousExpirable;
    volatile long time;

    public final long getExpirationTime()
    {
        return time;
    }

    public final time getNextEvictable()
    {
        return nextEvictable;
    }

    public final nextEvictable getNextExpirable()
    {
        return nextExpirable;
    }

    public final nextExpirable getPreviousEvictable()
    {
        return previousEvictable;
    }

    public final previousEvictable getPreviousExpirable()
    {
        return previousExpirable;
    }

    public final void setExpirationTime(long l)
    {
        time = l;
    }

    public final void setNextEvictable(time time1)
    {
        nextEvictable = time1;
    }

    public final void setNextExpirable(nextEvictable nextevictable)
    {
        nextExpirable = nextevictable;
    }

    public final void setPreviousEvictable(nextExpirable nextexpirable)
    {
        previousEvictable = nextexpirable;
    }

    public final void setPreviousExpirable(previousEvictable previousevictable)
    {
        previousExpirable = previousevictable;
    }

    Q(Object obj, int i, Q q)
    {
        super(obj, i, q);
        time = 0x7fffffffffffffffL;
        nextExpirable = MapMakerInternalMap.nullEntry();
        previousExpirable = MapMakerInternalMap.nullEntry();
        nextEvictable = MapMakerInternalMap.nullEntry();
        previousEvictable = MapMakerInternalMap.nullEntry();
    }
}
