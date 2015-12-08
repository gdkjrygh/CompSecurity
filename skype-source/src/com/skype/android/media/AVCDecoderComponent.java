// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            AsyncComponent, e, Component, l

class AVCDecoderComponent extends AsyncComponent
{

    static final int DEQUEUE_TIMEOUT = 5000;
    static final String VIDEO_AVC = "video/avc";
    private static final Logger log = Logger.getLogger("SKAVC-Decoder");
    private android.media.MediaCodec.BufferInfo bufferInfo;
    private MediaCodec codec;
    private String codecName;
    private Surface codecSurface;
    private boolean decoding;
    private MediaFormat format;
    private ByteBuffer inputBuffers[];
    private Component source;
    private long startTime;
    private SurfaceTexture surface;

    AVCDecoderComponent(Component component, MediaFormat mediaformat, SurfaceTexture surfacetexture)
    {
        super("SKAVC");
        source = component;
        format = mediaformat;
        surface = surfacetexture;
    }

    private void decodeFrame(l l1)
    {
        inputBuffers = codec.getInputBuffers();
        if (decoding)
        {
            log.info("decodeFrame");
            fillInputBuffers(l1);
            dequeueVideoCodec();
        }
    }

    private void dequeueVideoCodec()
    {
_L8:
        if (!decoding) goto _L2; else goto _L1
_L1:
        int i = codec.dequeueOutputBuffer(bufferInfo, 5000L);
        i;
        JVM INSTR tableswitch -3 -1: default 48
    //                   -3 129
    //                   -2 140
    //                   -1 238;
           goto _L3 _L4 _L5 _L2
_L3:
        if ((bufferInfo.flags & 4) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        log.info("video eos");
        if (i >= 0)
        {
            log.info((new StringBuilder("eos result ")).append(i).toString());
            codec.releaseOutputBuffer(i, false);
            decoding = false;
        }
        decoding = false;
        source.send(e.r);
        continue; /* Loop/switch isn't completed */
_L4:
        codec.getOutputBuffers();
        continue; /* Loop/switch isn't completed */
_L5:
        log.info((new StringBuilder("INFO_OUTPUT_FORMAT_CHANGED")).append(i).toString());
        if (true) goto _L3; else goto _L6
_L6:
        if (i >= 0)
        {
            long l1;
            long l2;
            boolean flag;
            if (bufferInfo.size != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l1 = System.currentTimeMillis();
            l2 = startTime;
            l1 = bufferInfo.presentationTimeUs / 1000L - (l1 - l2);
            if (l1 > 0L)
            {
                SystemClock.sleep(l1);
            }
            codec.releaseOutputBuffer(i, flag);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void fillInputBuffers(l l1)
    {
        int i = codec.dequeueInputBuffer(5000L);
        i;
        JVM INSTR tableswitch -1 -1: default 32
    //                   -1 101;
           goto _L1 _L2
_L1:
        if (i < 0) goto _L2; else goto _L3
_L3:
        ByteBuffer bytebuffer = inputBuffers[i];
        bytebuffer.position(0);
        bytebuffer.put(l1.b().duplicate());
        if ((l1.a().flags & 4) != 0) goto _L5; else goto _L4
_L4:
        codec.queueInputBuffer(i, 0, 0, 0L, 4);
        log.info("end of stream, sent decoder eos.");
        send(e.c);
_L2:
        return;
_L5:
        long l2 = l1.d();
        codec.queueInputBuffer(i, 0, l1.a().size, l2, 0);
        send(e.o);
        return;
    }

    private void initDecoder()
    {
        codec = MediaCodec.createDecoderByType(format.getString("mime"));
        MediaCodecInfo mediacodecinfo = codec.getCodecInfo();
        if (mediacodecinfo != null)
        {
            codecName = mediacodecinfo.getName();
        }
        log.info((new StringBuilder("AVC Decoder configure: ")).append(codecName).append("format: ").append(format.toString()).toString());
        codecSurface = new Surface(surface);
        codec.configure(format, codecSurface, null, 0);
        bufferInfo = new android.media.MediaCodec.BufferInfo();
        startTime = System.currentTimeMillis();
        codec.start();
        codec.flush();
        decoding = true;
        log.info("AVC decoder started. ");
    }

    private void releaseDecoder()
    {
        if (codec != null)
        {
            codec.stop();
            codec.release();
            codec = null;
        }
    }

    private void stopDecoder()
    {
        if (codec != null && decoding)
        {
            log.info("video signalEndOfInputStream");
            codec.flush();
            dequeueVideoCodec();
            if (source != null)
            {
                source.send(e.r, "video/avc");
            }
            decoding = false;
        }
    }

    public boolean handle(e e1, Object obj)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[e.values().length];
                try
                {
                    a[e.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[e.o.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[e1.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            initDecoder();
            return true;

        case 2: // '\002'
            decoding = true;
            decodeFrame((l)obj);
            return true;

        case 3: // '\003'
            stopDecoder();
            return true;

        case 4: // '\004'
            stopDecoder();
            break;
        }
        releaseDecoder();
        return true;
    }

}
