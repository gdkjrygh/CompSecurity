// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class osa
    implements osd
{

    private final osb a;
    private osm b;
    private long c;
    private int d;
    private int e;

    public osa(osb osb1)
    {
        a = (osb)p.a(osb1);
        c = 0L;
    }

    private void b()
    {
_L7:
        Object obj;
        Object obj1;
        obj = b;
        obj1 = new android.media.MediaCodec.BufferInfo();
_L4:
        int i = ((osm) (obj)).b.dequeueOutputBuffer(((android.media.MediaCodec.BufferInfo) (obj1)), 1000L);
        if (i >= 0) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch -3 -1: default 60
    //                   -3 13
    //                   -2 207
    //                   -1 90;
           goto _L3 _L4 _L5 _L6
_L3:
        throw new oso((new StringBuilder(26)).append("Invalid index: ").append(i).toString());
_L6:
        obj = null;
_L8:
        if (obj != null)
        {
            ((osn) (obj)).c.position(((osn) (obj)).d.offset);
            ((osn) (obj)).c.limit(((osn) (obj)).d.offset + ((osn) (obj)).d.size);
            int j = d;
            i = e;
            obj1 = b.a;
            if (obj1 != null)
            {
                j = ((MediaFormat) (obj1)).getInteger("sample-rate");
                i = ((MediaFormat) (obj1)).getInteger("channel-count");
            }
            a.a(((osn) (obj)).c, j, i);
            ((osn) (obj)).b.b.releaseOutputBuffer(((osn) (obj)).a, false);
        } else
        {
            return;
        }
          goto _L7
_L5:
        if (((osm) (obj)).a != null)
        {
            throw new oso("Output format changed twice");
        }
        obj.a = ((osm) (obj)).b.getOutputFormat();
          goto _L4
_L2:
        if ((((android.media.MediaCodec.BufferInfo) (obj1)).flags & 4) != 0)
        {
            obj.c = osp.b;
        }
        ByteBuffer abytebuffer[] = ((osm) (obj)).b.getOutputBuffers();
        p.a(i, abytebuffer.length);
        ByteBuffer bytebuffer = abytebuffer[i];
        bytebuffer.position(((android.media.MediaCodec.BufferInfo) (obj1)).offset);
        bytebuffer.limit(((android.media.MediaCodec.BufferInfo) (obj1)).offset + ((android.media.MediaCodec.BufferInfo) (obj1)).size);
        obj = new osn(((osm) (obj)), i, bytebuffer, ((android.media.MediaCodec.BufferInfo) (obj1)));
          goto _L8
    }

    public final void a()
    {
        if (b != null)
        {
            do
            {
                b();
                Object obj = b;
                long l = c;
                obj = oss.a(((osm) (obj)).b);
                boolean flag;
                if (obj == null)
                {
                    flag = false;
                } else
                {
                    ((oss) (obj)).a(ByteBuffer.allocate(0), l, 4);
                    flag = true;
                }
            } while (!flag);
            while (b.c == osp.a) 
            {
                b();
            }
            osm osm1 = b;
            osm1.c = osp.c;
            osm1.b.stop();
            osm1.b.release();
            b = null;
        } else
        {
            orw.a("Encoder not started!");
        }
        a.a();
    }

    public final void a(ShortBuffer shortbuffer, int i, int j)
    {
        if (b == null)
        {
            orw.d((new StringBuilder(54)).append("Creating encoder rate:").append(i).append(" channels:").append(j).toString());
            Object obj = MediaFormat.createAudioFormat("audio/mp4a-latm", i, j);
            ((MediaFormat) (obj)).setInteger("bitrate", 0x1f400);
            int k;
            long l;
            try
            {
                b = new osm(((MediaFormat) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (ShortBuffer shortbuffer)
            {
                throw new RuntimeException("Cannot create an audio encoder", shortbuffer);
            }
            d = i;
            e = j;
        } else
        {
            boolean flag;
            if (d == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "samplesPerSec changed from %s to %s", new Object[] {
                Integer.valueOf(d), Integer.valueOf(i)
            });
            if (e == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "channelCount changed from %s to %s", new Object[] {
                Integer.valueOf(e), Integer.valueOf(j)
            });
        }
        do
        {
            b();
            l = ((long)shortbuffer.remaining() * 0xf4240L) / (long)i / (long)j;
            k = shortbuffer.position();
            obj = ByteBuffer.allocate(shortbuffer.remaining() << 1);
            ((ByteBuffer) (obj)).order(ByteOrder.LITTLE_ENDIAN);
            ((ByteBuffer) (obj)).asShortBuffer().put(shortbuffer).flip();
            b.a(((ByteBuffer) (obj)), c);
            c = l + c;
            shortbuffer.position(Math.min(((ByteBuffer) (obj)).position() / 2 + k, shortbuffer.limit()));
        } while (shortbuffer.remaining() > 0);
    }
}
