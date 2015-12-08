// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.utils;


public class TimeRange
    implements Comparable
{

    private final long _begin;
    private final long _end;

    public TimeRange(long l, long l1)
    {
        _begin = l;
        _end = l1;
    }

    public static long adjustTime(long l, long l1, long l2)
    {
        return Math.max(l1, Math.min(l2, l));
    }

    public static TimeRange createRange(long l, long l1)
    {
        return new TimeRange(l, l + l1);
    }

    public int compareTo(TimeRange timerange)
    {
        return (int)(_begin - timerange.getBegin());
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((TimeRange)obj);
    }

    public boolean contains(long l)
    {
        return _begin <= l && l <= _end;
    }

    public long getBegin()
    {
        return _begin;
    }

    public long getDuration()
    {
        return _end - _begin;
    }

    public long getEnd()
    {
        return _end;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getName()).append("Object {");
        stringbuilder.append(" begin=").append(_begin);
        stringbuilder.append(" ,end=").append(_end);
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
