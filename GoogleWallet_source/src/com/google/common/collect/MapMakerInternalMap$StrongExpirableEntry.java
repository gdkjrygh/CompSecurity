// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class previousExpirable extends previousExpirable
    implements previousExpirable
{

    previousExpirable nextExpirable;
    previousExpirable previousExpirable;
    volatile long time;

    public final long getExpirationTime()
    {
        return time;
    }

    public final time getNextExpirable()
    {
        return nextExpirable;
    }

    public final nextExpirable getPreviousExpirable()
    {
        return previousExpirable;
    }

    public final void setExpirationTime(long l)
    {
        time = l;
    }

    public final void setNextExpirable(time time1)
    {
        nextExpirable = time1;
    }

    public final void setPreviousExpirable(nextExpirable nextexpirable)
    {
        previousExpirable = nextexpirable;
    }

    (Object obj, int i,  )
    {
        super(obj, i, );
        time = 0x7fffffffffffffffL;
        nextExpirable = MapMakerInternalMap.nullEntry();
        previousExpirable = MapMakerInternalMap.nullEntry();
    }
}
