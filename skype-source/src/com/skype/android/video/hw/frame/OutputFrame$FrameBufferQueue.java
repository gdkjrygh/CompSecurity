// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.frame;

import android.util.Log;
import java.nio.ByteBuffer;

// Referenced classes of package com.skype.android.video.hw.frame:
//            OutputFrame

private class allocate
{

    private ing buffers[];
    private int headIndex;
    private int size;
    private int tailIndex;
    final OutputFrame this$0;

    private int advance(int i)
    {
        int j = i + 1;
        i = j;
        if (j == buffers.length)
        {
            i = 0;
        }
        return i;
    }

    private void allocate(int i)
    {
        if (i <= size)
        {
            throw new IllegalArgumentException("capacity must be greater than actual size");
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            (new StringBuilder()).append(getClass().getSimpleName()).append(": Allocating space for ").append(i).append(" frames, current size: ").append(size);
        }
        buffers abuffers[] = new size[i];
        int l = headIndex;
        for (int j = 0; j < size; j++)
        {
            abuffers[j] = buffers[l];
            l = advance(l);
        }

        for (int k = size; k < i; k++)
        {
            abuffers[k] = new >(OutputFrame.this);
        }

        buffers = abuffers;
        headIndex = 0;
        tailIndex = size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public size pop()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            size size1 = buffers[headIndex];
            headIndex = advance(headIndex);
            size = size - 1;
            return size1;
        }
    }

    public void push(int i, ByteBuffer bytebuffer, int j, int k)
    {
        if (size == buffers.length)
        {
            allocate(buffers.length * 2);
        }
        buffers[tailIndex].n(i, bytebuffer, j, k);
        tailIndex = advance(tailIndex);
        size = size + 1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getSimpleName());
        stringbuilder.append(" [");
        for (int i = headIndex; size > 0; i = advance(i))
        {
            stringbuilder.append(buffers[i].ing());
        }

        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public ()
    {
        this$0 = OutputFrame.this;
        super();
        allocate(1);
    }
}
