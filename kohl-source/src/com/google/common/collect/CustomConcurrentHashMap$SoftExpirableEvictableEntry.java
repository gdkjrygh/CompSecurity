// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

private static class previousEvictable extends previousEvictable
    implements previousEvictable
{

    previousExpirable nextEvictable;
    previousExpirable nextExpirable;
    previousExpirable previousEvictable;
    previousExpirable previousExpirable;
    volatile long time;

    public long getExpirationTime()
    {
        return time;
    }

    public time getNextEvictable()
    {
        return nextEvictable;
    }

    public nextEvictable getNextExpirable()
    {
        return nextExpirable;
    }

    public nextExpirable getPreviousEvictable()
    {
        return previousEvictable;
    }

    public previousEvictable getPreviousExpirable()
    {
        return previousExpirable;
    }

    public void setExpirationTime(long l)
    {
        time = l;
    }

    public void setNextEvictable(time time1)
    {
        nextEvictable = time1;
    }

    public void setNextExpirable(nextEvictable nextevictable)
    {
        nextExpirable = nextevictable;
    }

    public void setPreviousEvictable(nextExpirable nextexpirable)
    {
        previousEvictable = nextexpirable;
    }

    public void setPreviousExpirable(previousEvictable previousevictable)
    {
        previousExpirable = previousevictable;
    }

    (CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i,  )
    {
        super(customconcurrenthashmap, obj, i, );
        time = 0x7fffffffffffffffL;
        nextExpirable = CustomConcurrentHashMap.nullEntry();
        previousExpirable = CustomConcurrentHashMap.nullEntry();
        nextEvictable = CustomConcurrentHashMap.nullEntry();
        previousEvictable = CustomConcurrentHashMap.nullEntry();
    }
}
