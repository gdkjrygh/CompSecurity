// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.frame;

import java.io.Closeable;
import java.nio.ByteBuffer;

// Referenced classes of package com.skype.android.video.hw.frame:
//            OutputFrame

public class size
    implements Closeable
{

    private ByteBuffer data;
    private int id;
    private int offset;
    private int size;
    final OutputFrame this$0;

    void assign(int i, ByteBuffer bytebuffer, int j, int k)
    {
        if (id >= 0)
        {
            throw new IllegalStateException("not closed");
        } else
        {
            id = i;
            data = bytebuffer;
            offset = j;
            size = k;
            return;
        }
    }

    public void close()
    {
        if (id < 0)
        {
            throw new IllegalStateException("closed");
        } else
        {
            id = -1;
            data = null;
            offset = -1;
            size = -1;
            return;
        }
    }

    public ByteBuffer getData()
    {
        return data;
    }

    public int getId()
    {
        return id;
    }

    public int getOffset()
    {
        return offset;
    }

    public int getSize()
    {
        return size;
    }

    public void releaseFrameBuffer()
    {
        OutputFrame.access$000(OutputFrame.this).onBufferReleased(id);
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [id=").append(id).append(", size=").append(size).append("]").toString();
    }

    public ()
    {
        this$0 = OutputFrame.this;
        super();
        id = -1;
        offset = -1;
        size = -1;
    }
}
