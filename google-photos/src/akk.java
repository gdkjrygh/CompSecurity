// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

abstract class akk
{

    private final int a;
    MediaCodec b;
    private final MediaFormat c;
    private final akl d;
    private final Queue e;
    private MediaFormat f;
    private ByteBuffer g[];
    private ByteBuffer h[];
    private boolean i;

    protected akk(int j, MediaFormat mediaformat, akl akl1)
    {
        a = j;
        if (mediaformat == null)
        {
            throw new NullPointerException("mediaFormat cannot be null");
        }
        c = mediaformat;
        if (akl1 == null)
        {
            throw new NullPointerException("listener cannot be null");
        } else
        {
            d = akl1;
            e = new LinkedList();
            return;
        }
    }

    private void g()
    {
        int j = b.dequeueInputBuffer(50L);
        if (j != -1)
        {
            b.queueInputBuffer(j, 0, 0, 0L, 4);
            i = false;
        }
    }

    public abstract long a();

    protected abstract MediaCodec a(MediaFormat mediaformat);

    protected abstract boolean a(MediaCodec mediacodec, ByteBuffer abytebuffer[], int j, android.media.MediaCodec.BufferInfo bufferinfo, boolean flag);

    public boolean a(MediaExtractor mediaextractor)
    {
        int k = b.dequeueInputBuffer(50L);
        if (k != -1)
        {
            int l = mediaextractor.readSampleData(g[k], 0);
            if (l < 0)
            {
                Log.w("TrackDecoder", "Media extractor had sample but no data.");
                b.queueInputBuffer(k, 0, 0, 0L, 4);
            } else
            {
                long l1 = mediaextractor.getSampleTime();
                int j;
                if ((mediaextractor.getSampleFlags() & 1) != 0)
                {
                    e.add(Long.valueOf(l1));
                    j = 1;
                } else
                {
                    j = 0;
                }
                b.queueInputBuffer(k, 0, l, l1, j);
                if (mediaextractor.advance() && mediaextractor.getSampleTrackIndex() == a)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b()
    {
        android.media.MediaCodec.BufferInfo bufferinfo = new android.media.MediaCodec.BufferInfo();
        int j = b.dequeueOutputBuffer(bufferinfo, 50L);
        if ((bufferinfo.flags & 4) != 0)
        {
            d.b(this);
        } else
        {
            if (i)
            {
                g();
            }
            if (j >= 0)
            {
                boolean flag;
                if (!e.isEmpty())
                {
                    long l = ((Long)e.peek()).longValue();
                    if (bufferinfo.presentationTimeUs == l)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (bufferinfo.presentationTimeUs >= l)
                    {
                        e.remove();
                    }
                } else
                {
                    flag = false;
                }
                return a(b, h, j, bufferinfo, flag);
            }
            if (j == -3)
            {
                h = b.getOutputBuffers();
                return true;
            }
            if (j == -2)
            {
                f = b.getOutputFormat();
                String s = String.valueOf(f);
                (new StringBuilder(String.valueOf(s).length() + 29)).append("Output format has changed to ").append(s);
                return true;
            }
        }
        return false;
    }

    public void c()
    {
        if (b != null)
        {
            b.stop();
            b.release();
        }
    }

    public void d()
    {
        i = true;
        g();
    }

    public void e()
    {
        b = a(c);
        b.start();
        g = b.getInputBuffers();
        h = b.getOutputBuffers();
        e.clear();
    }

    protected final void f()
    {
        d.a(this);
    }
}
