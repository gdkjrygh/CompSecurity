// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import java.nio.ByteBuffer;

public final class oss
{

    private final MediaCodec a;
    private final int b;

    private oss(MediaCodec mediacodec, int i)
    {
        a = mediacodec;
        b = i;
    }

    public static oss a(MediaCodec mediacodec)
    {
        int i = mediacodec.dequeueInputBuffer(0xf4240L);
        if (i >= 0)
        {
            return new oss(mediacodec, i);
        } else
        {
            return null;
        }
    }

    public final boolean a(ByteBuffer bytebuffer, long l, int i)
    {
        int j = bytebuffer.position();
        int k = bytebuffer.limit();
        ByteBuffer bytebuffer1 = a.getInputBuffers()[b];
        bytebuffer1.clear();
        bytebuffer.limit(j + Math.min(bytebuffer1.remaining(), k - j));
        bytebuffer1.put(bytebuffer).flip();
        a.queueInputBuffer(b, 0, bytebuffer1.remaining(), l, i);
        bytebuffer.limit(k);
        return bytebuffer.hasRemaining();
    }
}
