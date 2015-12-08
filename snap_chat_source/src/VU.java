// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class VU
{

    public MediaCodec a;
    public ByteBuffer b[];
    public android.media.MediaCodec.BufferInfo c;
    private ByteBuffer d[];
    private int e;

    public VU(MediaCodec mediacodec, We we, boolean flag)
    {
        a = null;
        b = null;
        d = null;
        c = null;
        e = 0;
        a = mediacodec;
        if (a == null)
        {
            throw new Wu("Codec is null");
        }
        mediacodec = a;
        try
        {
            mediacodec.configure(we.a, we.b, null, we.c);
        }
        catch (IllegalStateException illegalstateexception)
        {
            mediacodec = (new StringBuilder("Failed to configure codec: ")).append(illegalstateexception.toString()).toString();
            mediacodec = (new StringBuilder()).append(mediacodec).append(" format:[").toString();
            mediacodec = (new StringBuilder()).append(mediacodec).append(we.a.toString()).toString();
            mediacodec = (new StringBuilder()).append(mediacodec).append("]").toString();
            if (we.b != null)
            {
                mediacodec = (new StringBuilder()).append(mediacodec).append(", surface:[").toString();
                mediacodec = (new StringBuilder()).append(mediacodec).append(we.b.toString()).toString();
                mediacodec = (new StringBuilder()).append(mediacodec).append("]").toString();
            } else
            {
                mediacodec = (new StringBuilder()).append(mediacodec).append(", surface:null").toString();
            }
            mediacodec = (new StringBuilder()).append(mediacodec).append(", crypto:null").toString();
            throw new Wu((new StringBuilder()).append(mediacodec).append(", flags:").append(we.c).toString(), illegalstateexception);
        }
        if (flag)
        {
            (new StringBuilder("Codec was initialized: ")).append(a.toString());
            return;
        } else
        {
            a.start();
            c();
            (new StringBuilder("Codec was initialized: ")).append(a.toString()).append(" inputBuffers: ").append(b).append(" outputBuffers: ").append(d).append(" outputBufferInfo ").append(c);
            return;
        }
    }

    public static boolean a(android.media.MediaCodec.BufferInfo bufferinfo)
    {
        return (bufferinfo.flags & 4) != 0;
    }

    public final int a()
    {
        int i;
        try
        {
            i = a.dequeueOutputBuffer(c, 10000L);
            (new StringBuilder("decoder: returned output buffer: ")).append(i).append(" size: ").append(c.size).append(" Buffer flag is: ").append(c.flags);
        }
        catch (IllegalStateException illegalstateexception)
        {
            String s = (new StringBuilder("Failed to dequeue output buffer: ")).append(illegalstateexception.toString()).toString();
            if (c != null)
            {
                s = (new StringBuilder()).append(s).append(" outputBufferInfo:[").toString();
                s = (new StringBuilder()).append(s).append("offset:").append(c.offset).toString();
                s = (new StringBuilder()).append(s).append(", size:").append(c.size).toString();
                s = (new StringBuilder()).append(s).append(", presentationTimeUs:").append(c.presentationTimeUs).toString();
                s = (new StringBuilder()).append(s).append(", flags:").append(c.flags).toString();
                s = (new StringBuilder()).append(s).append("]").toString();
            } else
            {
                s = (new StringBuilder()).append(s).append(" outputBufferInfo:null").toString();
            }
            throw new Wy(s, illegalstateexception);
        }
        return i;
    }

    public final void a(int i)
    {
        if (i == -3)
        {
            d = a.getOutputBuffers();
        }
        if (i == -2)
        {
            (new StringBuilder("output format changed: ")).append(a.getOutputFormat());
        }
    }

    public final void a(int i, int j, long l, int k)
    {
        a.queueInputBuffer(i, 0, j, l, k);
    }

    public final void a(int i, boolean flag)
    {
        a.releaseOutputBuffer(i, flag);
    }

    public final int b()
    {
        StringBuilder stringbuilder = new StringBuilder("Calling native method dequeueInputBuffer for the: ");
        int i = e;
        e = i + 1;
        stringbuilder.append(i).append(" time on: ").append(a.toString());
        return a.dequeueInputBuffer(10000L);
    }

    public final ByteBuffer b(int i)
    {
        ByteBuffer bytebuffer = d[i].duplicate();
        bytebuffer.position(c.offset);
        bytebuffer.limit(c.offset + c.size);
        return bytebuffer;
    }

    public final void c()
    {
        d = a.getOutputBuffers();
        b = a.getInputBuffers();
        c = new android.media.MediaCodec.BufferInfo();
    }

    public final void d()
    {
        try
        {
            if (a != null)
            {
                a.stop();
                a.release();
                a = null;
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public final boolean e()
    {
        return (c.flags & 2) != 0;
    }
}
