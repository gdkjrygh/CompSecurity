// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.i;

import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.kik.g.p;
import com.kik.sdkutils.y;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeoutException;
import kik.android.util.ak;

// Referenced classes of package kik.android.i:
//            e, f

public class h
    implements Runnable
{

    private static final String a = kik/android/i/h.getSimpleName();
    private String b;
    private String c;
    private Point d;
    private int e;
    private int f;
    private p g;
    private long h;

    public h(String s, String s1, Point point, int i, int j)
    {
        int k;
        int l;
        g = new p();
        b = s;
        c = s1;
        e = j;
        f = i;
        if (y.a(20))
        {
            if (f == 90 || f == 270)
            {
                i = point.x;
                point.x = point.y;
                point.y = i;
            }
            f = 0;
        }
        l = point.x;
        k = point.y;
        i = Math.max(l, k);
        if (i > 640) goto _L2; else goto _L1
_L1:
        d = new Point(l, k);
        return;
_L2:
        double d1 = (double)Math.min(l, k) / (double)i;
        if (i == l)
        {
            k = 640;
            i = (int)(640D * d1);
        } else
        {
            i = 640;
            k = (int)(640D * d1);
        }
        j = k;
        if (k % 16 != 0)
        {
            j = Math.round((float)k / 16F) * 16;
        }
        k = i;
        l = j;
        if (i % 16 != 0)
        {
            k = Math.round((float)i / 16F) * 16;
            l = j;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static void a(String s)
    {
        throw new Exception(s);
    }

    private void b()
    {
        long l = System.currentTimeMillis();
        long l1 = h;
        if (Thread.currentThread().isInterrupted() || g.j())
        {
            throw new InterruptedException();
        }
        if (l - l1 > 0x2bf20L)
        {
            throw new TimeoutException();
        } else
        {
            return;
        }
    }

    public final p a()
    {
        return g;
    }

    public void run()
    {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        MediaExtractor mediaextractor;
        android.media.MediaCodec.BufferInfo bufferinfo;
        boolean flag;
        h = System.currentTimeMillis();
        obj4 = null;
        obj6 = null;
        obj5 = null;
        obj3 = null;
        mediaextractor = new MediaExtractor();
        flag = false;
        bufferinfo = new android.media.MediaCodec.BufferInfo();
        Object obj;
        Object obj1;
        obj = MediaFormat.createVideoFormat("video/avc", d.x, d.y);
        ((MediaFormat) (obj)).setInteger("max-input-size", 0);
        ((MediaFormat) (obj)).setInteger("color-format", 0x7f000789);
        ((MediaFormat) (obj)).setInteger("bitrate", e);
        ((MediaFormat) (obj)).setInteger("frame-rate", 30);
        ((MediaFormat) (obj)).setInteger("i-frame-interval", 1);
        obj1 = MediaCodec.createEncoderByType("video/avc");
        ((MediaCodec) (obj1)).configure(((MediaFormat) (obj)), null, null, 1);
        (new StringBuilder("Configured encoder with format: ")).append(obj);
        obj3 = new e(((MediaCodec) (obj1)).createInputSurface());
        Object obj2;
        int i;
        int l;
        ((e) (obj3)).b();
        ((MediaCodec) (obj1)).start();
        mediaextractor.setDataSource(b);
        i = ak.a(mediaextractor, true);
        l = ak.a(mediaextractor, false);
        mediaextractor.selectTrack(i);
        obj2 = mediaextractor.getTrackFormat(i);
        obj = MediaCodec.createDecoderByType(((MediaFormat) (obj2)).getString("mime"));
        obj5 = new f();
        ByteBuffer abytebuffer2[];
        ((MediaCodec) (obj)).configure(((MediaFormat) (obj2)), ((f) (obj5)).b(), null, 0);
        (new StringBuilder("Configured decoder with format: ")).append(obj2);
        ((MediaCodec) (obj)).start();
        abytebuffer2 = ((MediaCodec) (obj)).getInputBuffers();
        obj4 = ((MediaCodec) (obj1)).getOutputBuffers();
        int j;
        int k;
        k = 0;
        j = 0;
        obj2 = null;
_L18:
        if (j != 0) goto _L2; else goto _L1
_L1:
        b();
        if (flag) goto _L4; else goto _L3
_L3:
        int i1 = ((MediaCodec) (obj)).dequeueInputBuffer(2500L);
        if (i1 < 0) goto _L4; else goto _L5
_L5:
        int j1 = mediaextractor.readSampleData(abytebuffer2[i1], 0);
        if (j1 >= 0) goto _L7; else goto _L6
_L6:
        ((MediaCodec) (obj)).queueInputBuffer(i1, 0, 0, 0L, 4);
        flag = true;
_L4:
        int k1 = l;
        i1 = k;
        l = j;
        j1 = 1;
        j = i;
        obj6 = obj2;
        k = 1;
        i = k1;
        obj2 = obj4;
        obj4 = obj6;
_L14:
        if (j1 == 0 && k == 0) goto _L9; else goto _L8
_L8:
        ByteBuffer abytebuffer[];
        ByteBuffer abytebuffer1[];
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        b();
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        int i2 = ((MediaCodec) (obj1)).dequeueOutputBuffer(bufferinfo, 2500L);
        if (i2 != -1) goto _L11; else goto _L10
_L10:
        boolean flag1 = false;
        k = j;
        j = ((flag1) ? 1 : 0);
_L15:
        if (i2 != -1)
        {
            break MISSING_BLOCK_LABEL_2123;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        b();
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        int l1 = ((MediaCodec) (obj)).dequeueOutputBuffer(bufferinfo, 2500L);
        if (l1 != -1) goto _L13; else goto _L12
_L12:
        j1 = j;
        l1 = 0;
        j = k;
        k = j1;
        j1 = l1;
          goto _L14
_L7:
        ((MediaCodec) (obj)).queueInputBuffer(i1, 0, j1, mediaextractor.getSampleTime(), 0);
        mediaextractor.advance();
          goto _L4
_L11:
        if (i2 != -3)
        {
            break MISSING_BLOCK_LABEL_556;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        obj2 = ((MediaCodec) (obj1)).getOutputBuffers();
        l1 = j;
        j = k;
        k = l1;
          goto _L15
        if (i2 != -2)
        {
            break MISSING_BLOCK_LABEL_721;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        a("format changed twice");
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        Object obj8 = ((MediaCodec) (obj1)).getOutputFormat();
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        (new StringBuilder("encoder output format changed: ")).append(obj8);
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        obj4 = new MediaMuxer(c, 0);
        l1 = ((MediaMuxer) (obj4)).addTrack(((MediaFormat) (obj8)));
        j = i;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_689;
        }
        j = ((MediaMuxer) (obj4)).addTrack(mediaextractor.getTrackFormat(i));
        ((MediaMuxer) (obj4)).setOrientationHint(f);
        ((MediaMuxer) (obj4)).start();
        i1 = 1;
        i = j;
        j = k;
        k = l1;
          goto _L15
        if (i2 >= 0) goto _L17; else goto _L16
_L16:
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        a((new StringBuilder("unexpected result from encoder.dequeueOutputBuffer: ")).append(i2).toString());
        if (obj1 != null)
        {
            ((MediaCodec) (obj1)).release();
        }
        if (obj != null)
        {
            ((MediaCodec) (obj)).release();
        }
        ((e) (obj3)).a();
        ((f) (obj5)).a();
        if (obj4 != null)
        {
            ((MediaMuxer) (obj4)).release();
        }
_L20:
        return;
_L17:
        obj8 = obj2[i2];
        if (obj8 != null)
        {
            break MISSING_BLOCK_LABEL_846;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        a((new StringBuilder("encoderOutputBuffer ")).append(i2).append(" was null").toString());
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        if (bufferinfo.size == 0)
        {
            break MISSING_BLOCK_LABEL_1006;
        }
        if (i1 != 0 && obj4 != null)
        {
            break MISSING_BLOCK_LABEL_894;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        a("muxer hasn't started");
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        ((ByteBuffer) (obj8)).position(bufferinfo.offset);
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        ((ByteBuffer) (obj8)).limit(bufferinfo.offset + bufferinfo.size);
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        ((MediaMuxer) (obj4)).writeSampleData(j, ((ByteBuffer) (obj8)), bufferinfo);
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        (new StringBuilder("sent ")).append(bufferinfo.size).append(" bytes to buffer");
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        InterruptedException interruptedexception;
        Object obj7;
        MediaFormat mediaformat;
        boolean flag2;
        if ((bufferinfo.flags & 4) != 0)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        ((MediaCodec) (obj1)).releaseOutputBuffer(i2, false);
        l1 = j;
        j = k;
        k = l1;
          goto _L15
_L13:
        if (l1 == -3)
        {
            break MISSING_BLOCK_LABEL_1408;
        }
        if (l1 != -2)
        {
            break MISSING_BLOCK_LABEL_1140;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        mediaformat = ((MediaCodec) (obj)).getOutputFormat();
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        (new StringBuilder("decoder output format changed: ")).append(mediaformat);
        l1 = j;
        j = k;
        k = l1;
          goto _L14
        if (l1 >= 0)
        {
            break MISSING_BLOCK_LABEL_1193;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        a((new StringBuilder("unexpected result from decoder.dequeueOutputBuffer: ")).append(l1).toString());
        l1 = j;
        j = k;
        k = l1;
          goto _L14
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        (new StringBuilder("surface decoder given buffer ")).append(l1).append(" (size=").append(bufferinfo.size).append(")");
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        if (bufferinfo.size != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        ((MediaCodec) (obj)).releaseOutputBuffer(l1, flag2);
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_1370;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        if (!((f) (obj5)).c())
        {
            break MISSING_BLOCK_LABEL_1370;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        ((f) (obj5)).d();
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        ((e) (obj3)).a(bufferinfo.presentationTimeUs * 1000L);
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        ((e) (obj3)).c();
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        if ((bufferinfo.flags & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_1408;
        }
        obj6 = obj4;
        abytebuffer = ((ByteBuffer []) (obj4));
        abytebuffer1 = ((ByteBuffer []) (obj4));
        ((MediaCodec) (obj1)).signalEndOfInputStream();
        l1 = j;
        j = k;
        k = l1;
          goto _L14
_L9:
        obj6 = obj2;
        k = i1;
        i1 = l;
        obj2 = obj4;
        obj4 = obj6;
        l = i;
        i = j;
        j = i1;
          goto _L18
_L2:
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_1475;
        }
        ak.a(mediaextractor, ((MediaMuxer) (obj2)), l);
        ((MediaMuxer) (obj2)).stop();
        ((MediaCodec) (obj1)).stop();
        ((MediaCodec) (obj)).stop();
        b();
        if (obj1 != null)
        {
            ((MediaCodec) (obj1)).release();
        }
        if (obj != null)
        {
            ((MediaCodec) (obj)).release();
        }
        ((e) (obj3)).a();
        ((f) (obj5)).a();
        if (obj2 != null)
        {
            ((MediaMuxer) (obj2)).release();
        }
        g.a(new File(c));
        return;
        obj;
        obj1 = null;
        obj2 = null;
        obj = null;
        obj4 = obj5;
_L25:
        g.e();
        if (obj3 != null)
        {
            ((MediaCodec) (obj3)).release();
        }
        if (obj4 != null)
        {
            ((MediaCodec) (obj4)).release();
        }
        if (obj2 != null)
        {
            ((e) (obj2)).a();
        }
        if (obj1 != null)
        {
            ((f) (obj1)).a();
        }
        if (obj == null) goto _L20; else goto _L19
_L19:
        ((MediaMuxer) (obj)).release();
        return;
        obj;
        obj5 = null;
        obj3 = null;
        obj1 = null;
        obj2 = null;
_L24:
        (new StringBuilder("Transcode failed: ")).append(obj);
        g.a(((Throwable) (obj)));
        if (obj1 != null)
        {
            ((MediaCodec) (obj1)).release();
        }
        if (obj4 != null)
        {
            ((MediaCodec) (obj4)).release();
        }
        if (obj3 != null)
        {
            ((e) (obj3)).a();
        }
        if (obj5 != null)
        {
            ((f) (obj5)).a();
        }
        if (obj2 == null) goto _L20; else goto _L21
_L21:
        ((MediaMuxer) (obj2)).release();
        return;
        obj;
        obj5 = null;
        obj3 = null;
        obj1 = null;
        obj2 = null;
        obj4 = obj6;
_L23:
        if (obj1 != null)
        {
            ((MediaCodec) (obj1)).release();
        }
        if (obj4 != null)
        {
            ((MediaCodec) (obj4)).release();
        }
        if (obj3 != null)
        {
            ((e) (obj3)).a();
        }
        if (obj5 != null)
        {
            ((f) (obj5)).a();
        }
        if (obj2 != null)
        {
            ((MediaMuxer) (obj2)).release();
        }
        throw obj;
        obj;
        obj5 = null;
        obj3 = null;
        obj2 = null;
        obj4 = obj6;
        continue; /* Loop/switch isn't completed */
        obj;
        obj5 = null;
        obj2 = null;
        obj4 = obj6;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj5 = null;
        obj4 = obj;
        obj = obj2;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj4 = obj;
        obj = obj2;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj6;
        obj2 = obj4;
        obj4 = obj;
        obj = obj6;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj4 = obj;
        obj = obj2;
        obj2 = obj6;
        continue; /* Loop/switch isn't completed */
        obj7;
        obj4 = obj;
        obj = obj7;
        continue; /* Loop/switch isn't completed */
        obj5;
        obj7 = obj2;
        abytebuffer = ((ByteBuffer []) (obj3));
        obj2 = obj;
        obj = obj5;
        obj5 = obj1;
        obj3 = obj7;
        obj1 = abytebuffer;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L23; else goto _L22
_L22:
        obj;
        obj5 = null;
        obj3 = null;
        obj2 = null;
          goto _L24
        obj;
        obj5 = null;
        obj2 = null;
          goto _L24
        obj2;
        obj5 = null;
        obj4 = obj;
        obj = obj2;
        obj2 = null;
          goto _L24
        obj2;
        obj4 = obj;
        obj = obj2;
        obj2 = null;
          goto _L24
        obj7;
        obj2 = obj4;
        obj4 = obj;
        obj = obj7;
          goto _L24
        obj2;
        obj4 = obj;
        obj = obj2;
        obj2 = abytebuffer;
          goto _L24
        obj7;
        obj4 = obj;
        obj = obj7;
          goto _L24
        obj;
        obj3 = obj1;
        obj2 = null;
        obj = null;
        obj1 = null;
        obj4 = obj5;
          goto _L25
        obj;
        obj = null;
        obj4 = obj1;
        obj1 = null;
        obj2 = obj3;
        obj3 = obj4;
        obj4 = obj5;
          goto _L25
        obj2;
        obj4 = obj1;
        obj5 = obj;
        obj = null;
        obj1 = null;
        obj2 = obj3;
        obj3 = obj4;
        obj4 = obj5;
          goto _L25
        obj2;
        obj2 = obj3;
        obj3 = obj1;
        obj4 = obj;
        obj = null;
        obj1 = obj5;
          goto _L25
        obj2;
        obj2 = obj5;
        obj5 = obj;
        obj = obj4;
        obj4 = obj1;
        obj1 = obj2;
        obj2 = obj3;
        obj3 = obj4;
        obj4 = obj5;
          goto _L25
        obj2;
        obj2 = obj5;
        obj4 = obj1;
        obj5 = obj;
        obj = abytebuffer1;
        obj1 = obj2;
        obj2 = obj3;
        obj3 = obj4;
        obj4 = obj5;
          goto _L25
        interruptedexception;
        interruptedexception = ((InterruptedException) (obj1));
        obj7 = obj;
        obj = obj2;
        obj1 = obj5;
        obj2 = obj3;
        obj3 = interruptedexception;
        interruptedexception = ((InterruptedException) (obj7));
          goto _L25
        l1 = j;
        j = k;
        k = l1;
          goto _L14
    }

}
