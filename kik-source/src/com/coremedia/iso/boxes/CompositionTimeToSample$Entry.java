// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;


// Referenced classes of package com.coremedia.iso.boxes:
//            CompositionTimeToSample

public static class offset
{

    int count;
    int offset;

    public int getCount()
    {
        return count;
    }

    public int getOffset()
    {
        return offset;
    }

    public void setCount(int i)
    {
        count = i;
    }

    public void setOffset(int i)
    {
        offset = i;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{count=")).append(count).append(", offset=").append(offset).append('}').toString();
    }

    public (int i, int j)
    {
        count = i;
        offset = j;
    }
}
