// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

public class BitReaderBuffer
{

    private ByteBuffer buffer;
    int initialPos;
    int position;

    public BitReaderBuffer(ByteBuffer bytebuffer)
    {
        buffer = bytebuffer;
        initialPos = bytebuffer.position();
    }

    public int byteSync()
    {
        int j = 8 - position % 8;
        int i = j;
        if (j == 8)
        {
            i = 0;
        }
        readBits(i);
        return i;
    }

    public int getPosition()
    {
        return position;
    }

    public int readBits(int i)
    {
        int l = buffer.get(initialPos + position / 8);
        int j = l;
        if (l < 0)
        {
            j = l + 256;
        }
        l = 8 - position % 8;
        if (i <= l)
        {
            j = (j << position % 8 & 0xff) >> (l - i) + position % 8;
            position = position + i;
            i = j;
        } else
        {
            i -= l;
            int k = readBits(l);
            i = readBits(i) + (k << i);
        }
        buffer.position(initialPos + (int)Math.ceil((double)position / 8D));
        return i;
    }

    public int remainingBits()
    {
        return buffer.limit() * 8 - position;
    }
}
