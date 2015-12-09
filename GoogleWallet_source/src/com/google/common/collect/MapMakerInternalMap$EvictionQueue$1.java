// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

final class previousEvictable extends eEntry
{

    previousEvictable nextEvictable;
    previousEvictable previousEvictable;
    final previousEvictable this$0;

    public final eEntry getNextEvictable()
    {
        return nextEvictable;
    }

    public final nextEvictable getPreviousEvictable()
    {
        return previousEvictable;
    }

    public final void setNextEvictable(previousEvictable previousevictable)
    {
        nextEvictable = previousevictable;
    }

    public final void setPreviousEvictable(nextEvictable nextevictable)
    {
        previousEvictable = nextevictable;
    }

    eEntry()
    {
        this$0 = this._cls0.this;
        super();
        nextEvictable = this;
        previousEvictable = this;
    }
}
