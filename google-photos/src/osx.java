// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.nio.ByteBuffer;

public final class osx
    implements ost
{

    private final MediaCodec a;

    public osx(MediaCodec mediacodec)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        a = (MediaCodec)p.a(mediacodec);
    }

    public final int a(long l)
    {
        return a.dequeueInputBuffer(10000L);
    }

    public final int a(android.media.MediaCodec.BufferInfo bufferinfo, long l)
    {
        return a.dequeueOutputBuffer(bufferinfo, 10000L);
    }

    public final void a()
    {
        a.release();
    }

    public final void a(int i, int j, int k, long l, int i1)
    {
        a.queueInputBuffer(i, 0, k, l, i1);
    }

    public final void a(int i, boolean flag)
    {
        a.releaseOutputBuffer(i, flag);
    }

    public final void a(MediaFormat mediaformat, Surface surface, MediaCrypto mediacrypto, int i)
    {
        a.configure(mediaformat, surface, null, 0);
    }

    public final void b()
    {
        a.start();
    }

    public final void c()
    {
        a.stop();
    }

    public final void d()
    {
        a.flush();
    }

    public final ByteBuffer[] e()
    {
        return a.getInputBuffers();
    }

    public final boolean equals(Object obj)
    {
        return a.equals(obj);
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return a.toString();
    }
}
