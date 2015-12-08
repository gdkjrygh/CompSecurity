// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


final class AdHandle
{

    private final long _duration;
    private final int _handle;

    public AdHandle(int i, long l)
    {
        _handle = i;
        _duration = l;
    }

    public long getDuration()
    {
        return _duration;
    }

    public int getHandle()
    {
        return _handle;
    }
}
