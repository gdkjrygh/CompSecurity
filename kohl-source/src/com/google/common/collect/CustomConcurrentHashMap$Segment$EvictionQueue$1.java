// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

class previousEvictable
    implements previousEvictable
{

    previousEvictable nextEvictable;
    previousEvictable previousEvictable;
    final previousEvictable this$2;

    public long getExpirationTime()
    {
        throw new UnsupportedOperationException();
    }

    public int getHash()
    {
        throw new UnsupportedOperationException();
    }

    public Object getKey()
    {
        throw new UnsupportedOperationException();
    }

    public previousEvictable getNext()
    {
        throw new UnsupportedOperationException();
    }

    public previousEvictable getNextEvictable()
    {
        return nextEvictable;
    }

    public nextEvictable getNextExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public nextEvictable getPreviousEvictable()
    {
        return previousEvictable;
    }

    public previousEvictable getPreviousExpirable()
    {
        throw new UnsupportedOperationException();
    }

    public previousEvictable getValueReference()
    {
        throw new UnsupportedOperationException();
    }

    public void notifyKeyReclaimed()
    {
    }

    public void notifyValueReclaimed(previousEvictable previousevictable)
    {
        throw new UnsupportedOperationException();
    }

    public void setExpirationTime(long l)
    {
        throw new UnsupportedOperationException();
    }

    public void setNextEvictable(previousEvictable previousevictable)
    {
        nextEvictable = previousevictable;
    }

    public void setNextExpirable(nextEvictable nextevictable)
    {
        throw new UnsupportedOperationException();
    }

    public void setPreviousEvictable(nextEvictable nextevictable)
    {
        previousEvictable = nextevictable;
    }

    public void setPreviousExpirable(previousEvictable previousevictable)
    {
        throw new UnsupportedOperationException();
    }

    public void setValueReference(previousEvictable previousevictable)
    {
        throw new UnsupportedOperationException();
    }

    ()
    {
        this$2 = this._cls2.this;
        super();
        nextEvictable = this;
        previousEvictable = this;
    }
}
