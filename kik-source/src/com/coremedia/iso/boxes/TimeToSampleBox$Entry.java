// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;


// Referenced classes of package com.coremedia.iso.boxes:
//            TimeToSampleBox

public static class delta
{

    long count;
    long delta;

    public long getCount()
    {
        return count;
    }

    public long getDelta()
    {
        return delta;
    }

    public void setCount(long l)
    {
        count = l;
    }

    public void setDelta(long l)
    {
        delta = l;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{count=")).append(count).append(", delta=").append(delta).append('}').toString();
    }

    public (long l, long l1)
    {
        count = l;
        delta = l1;
    }
}
