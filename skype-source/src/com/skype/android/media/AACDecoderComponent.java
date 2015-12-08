// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            AsyncComponent, l, e, Component

public class AACDecoderComponent extends AsyncComponent
{

    private static final Logger log = Logger.getLogger("SKAAC");
    private MediaCodec codec;
    private MediaFormat format;
    private String mime;
    private Component sink;

    AACDecoderComponent(Component component, MediaFormat mediaformat)
    {
        super("SKAAC");
        sink = component;
        format = mediaformat;
    }

    private void decodeSample(l l1)
    {
        dequeueBuffer();
        ByteBuffer abytebuffer[] = codec.getInputBuffers();
        int i = codec.dequeueInputBuffer(TimeUnit.SECONDS.toMicros(5L));
        if (i > 0)
        {
            ByteBuffer bytebuffer = abytebuffer[i];
            bytebuffer.position(0);
            bytebuffer.put(l1.b().duplicate());
            codec.queueInputBuffer(i, 0, l1.a().size, l1.d(), l1.a().flags);
        }
    }

    private void dequeueBuffer()
    {
        ByteBuffer abytebuffer[];
        android.media.MediaCodec.BufferInfo bufferinfo;
        int i;
        if (codec == null)
        {
            abytebuffer = null;
        } else
        {
            abytebuffer = codec.getOutputBuffers();
        }
        bufferinfo = new android.media.MediaCodec.BufferInfo();
        i = codec.dequeueOutputBuffer(bufferinfo, TimeUnit.SECONDS.toMicros(5L));
        if (i > 0)
        {
            abytebuffer = abytebuffer[i];
            sink.send(e.k, abytebuffer);
            codec.releaseOutputBuffer(i, false);
        } else
        if (i == -2)
        {
            MediaFormat mediaformat = codec.getOutputFormat();
            sink.send(e.n, mediaformat);
            return;
        }
    }

    private void release()
    {
        if (codec != null)
        {
            codec.release();
            codec = null;
        }
    }

    private void startDecoder()
    {
        mime = format.getString("mime");
        codec = MediaCodec.createDecoderByType(mime);
        codec.configure(format, null, null, 0);
        codec.start();
    }

    private void stopDecoder()
    {
        if (codec != null)
        {
            codec.stop();
            if (sink != null)
            {
                sink.send(e.r, mime);
            }
        }
    }

    public volatile String getName()
    {
        return super.getName();
    }

    public volatile Thread getThread()
    {
        return super.getThread();
    }

    boolean handle(e e1, Object obj)
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
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[e.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.o.ordinal()] = 4;
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
            startDecoder();
            return true;

        case 2: // '\002'
            stopDecoder();
            return true;

        case 3: // '\003'
            release();
            return true;

        case 4: // '\004'
            decodeSample((l)obj);
            break;
        }
        return true;
    }

    public volatile void releaseAndWait()
    {
        super.releaseAndWait();
    }

    public volatile void remove(e e1)
    {
        super.remove(e1);
    }

    public volatile boolean send(e e1)
    {
        return super.send(e1);
    }

    public volatile boolean send(e e1, Object obj)
    {
        return super.send(e1, obj);
    }

}
