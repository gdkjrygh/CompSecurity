// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            VideoEngineTimeline

public static class <init>
{

    public static final int INVALID_PERIOD = -1;
    public static final long INVALID_POSITION = -3L;
    public static final long LIVE_POINT = -2L;
    final int _period;
    final long _time;

    public static <init> create(int i, long l)
    {
        return new <init>(i, l);
    }

    public static <init> createInvalid()
    {
        return new <init>(-1, -3L);
    }

    public static <init> createLivePoint()
    {
        return new <init>(-1, -2L);
    }

    public int getPeriod()
    {
        return _period;
    }

    public long getTime()
    {
        return _time;
    }

    public boolean isInvalid()
    {
        return _period == -1 && _time == -3L;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TimeMapping { _period=").append(_period).append(", _time=").append(_time).append("}").toString();
    }

    private _cls9(int i, long l)
    {
        _period = i;
        _time = l;
    }

    _time(int i, long l, _time _ptime)
    {
        this(i, l);
    }
}
