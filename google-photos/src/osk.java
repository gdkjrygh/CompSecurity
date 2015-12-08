// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class osk extends jiq
    implements jim
{

    public osd f;
    private long i;
    private boolean j;

    public osk(jjl jjl, boolean flag)
    {
        super(jjl, null, false, null, null);
        i = 0L;
        j = true;
    }

    protected final boolean a(long l, long l1, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
            int k, boolean flag)
    {
        i = bufferinfo.presentationTimeUs;
        bytebuffer.position(bufferinfo.offset).limit(bufferinfo.offset + bufferinfo.size);
        if (f != null)
        {
            bufferinfo = mediacodec.getOutputFormat();
            int i1 = bufferinfo.getInteger("sample-rate");
            int j1 = bufferinfo.getInteger("channel-count");
            bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
            f.a(bytebuffer.asShortBuffer(), i1, j1);
        }
        mediacodec.releaseOutputBuffer(k, false);
        return true;
    }

    protected final boolean a(jjh jjh1)
    {
        return c.a(jjh1.b);
    }

    public final long b()
    {
        return i;
    }

    protected final jim h()
    {
        if (j)
        {
            return this;
        } else
        {
            return null;
        }
    }

    protected final void m()
    {
        super.m();
        f.a();
    }
}
