// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.frame;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

public class OutputFrame
    implements Closeable
{
    public class FrameBuffer
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
            frameEventsHandler.onBufferReleased(id);
        }

        public String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [id=").append(id).append(", size=").append(size).append("]").toString();
        }

        public FrameBuffer()
        {
            this$0 = OutputFrame.this;
            super();
            id = -1;
            offset = -1;
            size = -1;
        }
    }

    private class FrameBufferQueue
    {

        private FrameBuffer buffers[];
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
            FrameBuffer aframebuffer[] = new FrameBuffer[i];
            int l = headIndex;
            for (int j = 0; j < size; j++)
            {
                aframebuffer[j] = buffers[l];
                l = advance(l);
            }

            for (int k = size; k < i; k++)
            {
                aframebuffer[k] = new FrameBuffer();
            }

            buffers = aframebuffer;
            headIndex = 0;
            tailIndex = size;
        }

        public boolean isEmpty()
        {
            return size == 0;
        }

        public FrameBuffer pop()
        {
            if (isEmpty())
            {
                return null;
            } else
            {
                FrameBuffer framebuffer = buffers[headIndex];
                headIndex = advance(headIndex);
                size = size - 1;
                return framebuffer;
            }
        }

        public void push(int i, ByteBuffer bytebuffer, int j, int k)
        {
            if (size == buffers.length)
            {
                allocate(buffers.length * 2);
            }
            buffers[tailIndex].assign(i, bytebuffer, j, k);
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
                stringbuilder.append(buffers[i].toString());
            }

            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        public FrameBufferQueue()
        {
            this$0 = OutputFrame.this;
            super();
            allocate(1);
        }
    }

    public static interface FrameEvents
    {

        public abstract void onBufferReleased(int i);

        public abstract void onFrameReleased(OutputFrame outputframe);
    }


    private final FrameEvents frameEventsHandler;
    private boolean isCodecConfig;
    private boolean isEndOfStream;
    private boolean isOpen;
    private boolean isOutputFormatChanged;
    private boolean isTimedOut;
    private long nativeBufferLockObj;
    private final FrameBufferQueue queue = new FrameBufferQueue();
    private long timestamp;

    OutputFrame(FrameEvents frameevents, long l)
    {
        isOpen = false;
        frameEventsHandler = frameevents;
        nativeBufferLockObj = l;
    }

    public void close()
    {
        if (!isOpen)
        {
            throw new IllegalStateException("already closed");
        }
        FrameBuffer framebuffer;
        for (; !queue.isEmpty(); framebuffer.close())
        {
            framebuffer = queue.pop();
            if (Log.isLoggable("SLIQ", 5))
            {
                Log.w("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": A buffer was not closed: ").append(framebuffer).toString());
            }
        }

        frameEventsHandler.onFrameReleased(this);
        isOpen = false;
        timestamp = 0L;
        isTimedOut = false;
        isOutputFormatChanged = false;
        isCodecConfig = false;
        isEndOfStream = false;
    }

    public long getNativeLockingObj()
    {
        return nativeBufferLockObj;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public boolean hasBuffers()
    {
        return !queue.isEmpty();
    }

    public boolean isCodecConfig()
    {
        return isCodecConfig;
    }

    public boolean isEndOfStream()
    {
        return isEndOfStream;
    }

    public boolean isOutputFormatChanged()
    {
        return isOutputFormatChanged;
    }

    public boolean isTimedOut()
    {
        return isTimedOut;
    }

    public void open()
    {
        if (isOpen)
        {
            throw new IllegalStateException("not closed");
        } else
        {
            isOpen = true;
            return;
        }
    }

    public FrameBuffer popBuffer()
    {
        return queue.pop();
    }

    public void pushBuffer(int i, ByteBuffer bytebuffer, int j, int k)
    {
        queue.push(i, bytebuffer, j, k);
    }

    public void setCodecConfig(boolean flag)
    {
        isCodecConfig = flag;
    }

    public void setEndOfStream(boolean flag)
    {
        isEndOfStream = flag;
    }

    public void setOutputFormatChanged(boolean flag)
    {
        isOutputFormatChanged = flag;
    }

    public void setTimedOut(boolean flag)
    {
        isTimedOut = flag;
    }

    public void setTimestamp(long l)
    {
        timestamp = l;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [isOpen=").append(isOpen).append(", timestamp=").append(timestamp).append(", queue=").append(queue).append("]").toString();
    }

}
