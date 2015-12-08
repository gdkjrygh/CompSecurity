// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public final class ake extends akk
{

    public final BlockingDeque a;
    private int c;
    private int d;
    private long e;

    public ake(int i, MediaFormat mediaformat, akl akl)
    {
        super(i, mediaformat, akl);
        if (!b.a(mediaformat))
        {
            throw new IllegalArgumentException("AudioTrackDecoder can only be used with audio formats");
        } else
        {
            a = new LinkedBlockingDeque();
            c = mediaformat.getInteger("sample-rate");
            d = mediaformat.getInteger("channel-count");
            return;
        }
    }

    public final long a()
    {
        return e * 1000L;
    }

    protected final MediaCodec a(MediaFormat mediaformat)
    {
        MediaCodec mediacodec;
        try
        {
            mediacodec = MediaCodec.createDecoderByType(mediaformat.getString("mime"));
            mediacodec.configure(mediaformat, null, null, 0);
        }
        // Misplaced declaration of an exception variable
        catch (MediaFormat mediaformat)
        {
            return null;
        }
        return mediacodec;
    }

    public final void a(aig aig1)
    {
        aig1.a((akd)a.getFirst());
        aig1.a(a());
    }

    protected final boolean a(MediaCodec mediacodec, ByteBuffer abytebuffer[], int i, android.media.MediaCodec.BufferInfo bufferinfo, boolean flag)
    {
        abytebuffer = abytebuffer[i];
        byte abyte0[] = new byte[bufferinfo.size];
        abytebuffer.position(bufferinfo.offset);
        abytebuffer.get(abyte0, 0, bufferinfo.size);
        a.offerLast(new akd(c, d, abyte0, bufferinfo.presentationTimeUs));
        abytebuffer.clear();
        mediacodec.releaseOutputBuffer(i, false);
        e = bufferinfo.presentationTimeUs;
        f();
        return true;
    }

    public final volatile boolean a(MediaExtractor mediaextractor)
    {
        return super.a(mediaextractor);
    }

    public final volatile boolean b()
    {
        return super.b();
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }
}
