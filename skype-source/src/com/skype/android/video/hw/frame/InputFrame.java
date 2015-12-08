// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.frame;

import java.nio.ByteBuffer;

public class InputFrame
{

    private ByteBuffer data;
    private int id;
    private int size;
    private long timestamp;

    public InputFrame()
    {
    }

    public ByteBuffer getData()
    {
        return data;
    }

    public int getId()
    {
        return id;
    }

    public int getSize()
    {
        return size;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public void initialize(int i, ByteBuffer bytebuffer)
    {
        id = i;
        data = bytebuffer;
        timestamp = 0L;
        size = -1;
    }

    public void setSize(int i)
    {
        size = i;
    }

    public void setTimestamp(long l)
    {
        timestamp = l;
    }
}
