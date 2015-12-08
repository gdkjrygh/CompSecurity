// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


public final class BufferControlParameters
{

    private long _initialBufferTime;
    private long _playBufferTime;

    private BufferControlParameters()
    {
    }

    public static BufferControlParameters createDual(long l, long l1)
    {
        if (l <= 0L || l1 <= 0L)
        {
            throw new IllegalArgumentException("The initial buffer time and the play buffer time must be bigger than zero.");
        }
        if (l > l1)
        {
            throw new IllegalArgumentException("The initial buffer time can't be bigger than the play buffer time.");
        } else
        {
            BufferControlParameters buffercontrolparameters = new BufferControlParameters();
            buffercontrolparameters._initialBufferTime = l;
            buffercontrolparameters._playBufferTime = l1;
            return buffercontrolparameters;
        }
    }

    public static BufferControlParameters createSimple(long l)
    {
        if (l <= 0L)
        {
            throw new IllegalArgumentException("The buffer time must be bigger than zero.");
        } else
        {
            BufferControlParameters buffercontrolparameters = new BufferControlParameters();
            buffercontrolparameters._initialBufferTime = l;
            buffercontrolparameters._playBufferTime = l;
            return buffercontrolparameters;
        }
    }

    public long getInitialBufferTime()
    {
        return _initialBufferTime;
    }

    public long getPlayBufferTime()
    {
        return _playBufferTime;
    }

    public String toString()
    {
        return (new StringBuilder()).append("BufferControlParameters { _initialBufferTime=").append(_initialBufferTime).append(", _playBufferTime=").append(_playBufferTime).append("}").toString();
    }
}
