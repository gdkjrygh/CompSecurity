// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


final class Profiler
{

    private long _elapsedTime;
    private long _totalElapsedTime;

    Profiler()
    {
    }

    long getElapsedTime()
    {
        return _elapsedTime;
    }

    long getTotalElapsedTime()
    {
        return _totalElapsedTime;
    }

    void registerElapsedTime()
    {
        _elapsedTime = System.currentTimeMillis() - _elapsedTime;
        _totalElapsedTime = _totalElapsedTime + _elapsedTime;
    }

    void registerStartElapsedTime()
    {
        _elapsedTime = System.currentTimeMillis();
    }
}
