// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

class previousExpirable
    implements previousExpirable
{

    previousExpirable nextExpirable;
    previousExpirable previousExpirable;
    final previousExpirable this$2;

    public long getExpirationTime()
    {
        return 0x7fffffffffffffffL;
    }

    public int getHash()
    {
        throw new UnsupportedOperationException();
    }

    public Object getKey()
    {
        throw new UnsupportedOperationException();
    }

    public previousExpirable getNext()
    {
        throw new UnsupportedOperationException();
    }

    public previousExpirable getNextEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public previousExpirable getNextExpirable()
    {
        return nextExpirable;
    }

    public nextExpirable getPreviousEvictable()
    {
        throw new UnsupportedOperationException();
    }

    public nextExpirable getPreviousExpirable()
    {
        return previousExpirable;
    }

    public previousExpirable getValueReference()
    {
        throw new UnsupportedOperationException();
    }

    public void notifyKeyReclaimed()
    {
    }

    public void notifyValueReclaimed(previousExpirable previousexpirable)
    {
        throw new UnsupportedOperationException();
    }

    public void setExpirationTime(long l)
    {
    }

    public void setNextEvictable(previousExpirable previousexpirable)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextExpirable(previousExpirable previousexpirable)
    {
        nextExpirable = previousexpirable;
    }

    public void setPreviousEvictable(nextExpirable nextexpirable)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousExpirable(nextExpirable nextexpirable)
    {
        previousExpirable = nextexpirable;
    }

    public void setValueReference(previousExpirable previousexpirable)
    {
        throw new UnsupportedOperationException();
    }

    Q()
    {
        this$2 = this._cls2.this;
        super();
        nextExpirable = this;
        previousExpirable = this;
    }
}
