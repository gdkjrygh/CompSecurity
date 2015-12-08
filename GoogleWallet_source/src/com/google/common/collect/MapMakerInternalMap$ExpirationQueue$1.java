// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

final class previousExpirable extends ntry
{

    previousExpirable nextExpirable;
    previousExpirable previousExpirable;
    final previousExpirable this$0;

    public final long getExpirationTime()
    {
        return 0x7fffffffffffffffL;
    }

    public final ntry getNextExpirable()
    {
        return nextExpirable;
    }

    public final nextExpirable getPreviousExpirable()
    {
        return previousExpirable;
    }

    public final void setExpirationTime(long l)
    {
    }

    public final void setNextExpirable(previousExpirable previousexpirable)
    {
        nextExpirable = previousexpirable;
    }

    public final void setPreviousExpirable(nextExpirable nextexpirable)
    {
        previousExpirable = nextexpirable;
    }

    ntry()
    {
        this$0 = this._cls0.this;
        super();
        nextExpirable = this;
        previousExpirable = this;
    }
}
