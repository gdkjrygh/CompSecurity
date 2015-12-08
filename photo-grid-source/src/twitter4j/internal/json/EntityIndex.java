// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import java.io.Serializable;

abstract class EntityIndex
    implements Serializable, Comparable
{

    private static final long serialVersionUID = 0x35a0e17beef13b78L;
    private int end;
    private int start;

    EntityIndex()
    {
        start = -1;
        end = -1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((EntityIndex)obj);
    }

    public int compareTo(EntityIndex entityindex)
    {
        long l = start - entityindex.start;
        if (l < 0xffffffff80000000L)
        {
            return 0x80000000;
        }
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        } else
        {
            return (int)l;
        }
    }

    int getEnd()
    {
        return end;
    }

    int getStart()
    {
        return start;
    }

    void setEnd(int i)
    {
        end = i;
    }

    void setStart(int i)
    {
        start = i;
    }
}
