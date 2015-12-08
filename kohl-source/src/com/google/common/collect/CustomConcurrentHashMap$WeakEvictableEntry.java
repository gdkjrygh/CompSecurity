// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

private static class previousEvictable extends previousEvictable
    implements previousEvictable
{

    previousEvictable nextEvictable;
    previousEvictable previousEvictable;

    public previousEvictable getNextEvictable()
    {
        return nextEvictable;
    }

    public nextEvictable getPreviousEvictable()
    {
        return previousEvictable;
    }

    public void setNextEvictable(previousEvictable previousevictable)
    {
        nextEvictable = previousevictable;
    }

    public void setPreviousEvictable(nextEvictable nextevictable)
    {
        previousEvictable = nextevictable;
    }

    (CustomConcurrentHashMap customconcurrenthashmap, Object obj, int i,  )
    {
        super(customconcurrenthashmap, obj, i, );
        nextEvictable = CustomConcurrentHashMap.nullEntry();
        previousEvictable = CustomConcurrentHashMap.nullEntry();
    }
}
