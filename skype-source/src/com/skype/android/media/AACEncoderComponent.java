// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            AsyncComponent, a, e, l, 
//            Component

class AACEncoderComponent extends AsyncComponent
{

    static final String AUDIO_AAC = "audio/mp4a-latm";
    private static final int DEQUEUE_TIMEOUT = 3000;
    private static final String OMX_GOOGLE_AAC_ENCODER = "OMX.google.aac.encoder";
    private static final Logger log = Logger.getLogger("SKAAC");
    private int bitRate;
    private android.media.MediaCodec.BufferInfo bufferInfo;
    private int channels;
    private MediaCodec codec;
    private int codecProfile;
    private boolean configSent;
    private long presentationTimeLast;
    private boolean recording;
    private int sampleRate;
    private Component sink;

    AACEncoderComponent(Component component, a a1)
    {
        super("SKAAC");
        sink = component;
        codecProfile = a1.a();
        sampleRate = a1.b();
        channels = a1.c();
        bitRate = a1.d();
    }

    private void dequeueBuffer()
    {
        Object obj;
        Object obj1;
        int i;
        if (codec == null)
        {
            obj = null;
        } else
        {
            obj = codec.getOutputBuffers();
        }
_L8:
        if (!recording) goto _L2; else goto _L1
_L1:
        i = codec.dequeueOutputBuffer(bufferInfo, 3000L);
        i;
        JVM INSTR tableswitch -3 -1: default 60
    //                   -3 278
    //                   -2 289
    //                   -1 330;
           goto _L3 _L4 _L5 _L2
_L3:
        obj1 = obj;
_L6:
        if ((bufferInfo.flags & 4) != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (i >= 0)
        {
            obj = obj1[i];
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0 && sink != null)
            {
                if (bufferInfo.presentationTimeUs < presentationTimeLast)
                {
                    log.info("bufferInfo.presentationTimeUs < presentationTimeLast");
                    android.media.MediaCodec.BufferInfo bufferinfo = bufferInfo;
                    long l1 = presentationTimeLast + (long)bufferInfo.size;
                    presentationTimeLast = l1;
                    bufferinfo.presentationTimeUs = l1;
                }
                if (configSent)
                {
                    android.media.MediaCodec.BufferInfo bufferinfo1 = new android.media.MediaCodec.BufferInfo();
                    bufferinfo1.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                    sink.send(e.m, new l("audio/mp4a-latm", ((ByteBuffer) (obj)), bufferinfo1));
                }
                presentationTimeLast = bufferInfo.presentationTimeUs;
            }
            codec.releaseOutputBuffer(i, false);
            obj = obj1;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = codec.getOutputBuffers();
        continue; /* Loop/switch isn't completed */
_L5:
        obj1 = obj;
        if (sink != null)
        {
            obj1 = codec.getOutputFormat();
            sink.send(e.n, obj1);
            configSent = true;
            obj1 = obj;
        }
        if (true) goto _L6; else goto _L2
_L2:
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void queueBuffer(ByteBuffer bytebuffer, boolean flag)
    {
        do
        {
            if (!recording || bytebuffer.remaining() <= 0)
            {
                break;
            }
            ByteBuffer abytebuffer[] = codec.getInputBuffers();
            int j = codec.dequeueInputBuffer(3000L);
            if (j >= 0)
            {
                long l1 = System.nanoTime() / 1000L;
                ByteBuffer bytebuffer1 = abytebuffer[j];
                bytebuffer1.clear();
                int i = bytebuffer.remaining();
                byte byte0;
                if (i <= bytebuffer1.remaining())
                {
                    bytebuffer1.put(bytebuffer);
                } else
                {
                    ByteBuffer bytebuffer2 = bytebuffer.duplicate();
                    i = bytebuffer1.remaining();
                    bytebuffer2.limit(i);
                    bytebuffer1.put(bytebuffer2);
                    bytebuffer1.limit(i);
                    bytebuffer.position(bytebuffer.position() + i);
                }
                bytebuffer1.position(0);
                if (flag)
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 0;
                }
                codec.queueInputBuffer(j, 0, i, l1, byte0);
                if (!flag)
                {
                    dequeueBuffer();
                }
            }
        } while (true);
    }

    private void release()
    {
        stopEncoder();
    }

    private void startEncoder()
    {
        codec = MediaCodec.createEncoderByType("audio/mp4a-latm");
        bufferInfo = new android.media.MediaCodec.BufferInfo();
        log.info((new StringBuilder("use codec ")).append(codec.getName()).toString());
        MediaFormat mediaformat = MediaFormat.createAudioFormat("audio/mp4a-latm", sampleRate, channels);
        if (codec.getName().equals("OMX.google.aac.decoder"))
        {
            codec.release();
            codec = MediaCodec.createByCodecName("OMX.google.aac.encoder");
        }
        mediaformat.setInteger("aac-profile", codecProfile);
        mediaformat.setInteger("bitrate", bitRate);
        codec.configure(mediaformat, null, null, 1);
        codec.start();
        send(e.j);
        recording = true;
    }

    private void stopEncoder()
    {
        if (recording)
        {
            queueBuffer(ByteBuffer.allocateDirect(0), true);
            dequeueBuffer();
        }
        recording = false;
        if (codec != null)
        {
            codec.stop();
            codec.release();
            codec = null;
            if (sink != null)
            {
                sink.send(e.r, "audio/mp4a-latm");
            }
            configSent = false;
        }
    }

    public boolean handle(e e1, Object obj)
    {
        log.info((new StringBuilder("handle ")).append(e1).toString());
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
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[e.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[e.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.j.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.k.ordinal()] = 5;
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
            startEncoder();
            return true;

        case 2: // '\002'
            stopEncoder();
            return true;

        case 3: // '\003'
            release();
            return true;

        case 4: // '\004'
            dequeueBuffer();
            return true;

        case 5: // '\005'
            queueBuffer((ByteBuffer)obj, false);
            break;
        }
        return true;
    }

}
