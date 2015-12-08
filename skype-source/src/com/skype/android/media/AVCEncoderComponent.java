// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.opengl.EGLContext;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            AsyncComponent, c, b, e, 
//            Component, l, g, Size, 
//            k, EncoderRenderer

class AVCEncoderComponent extends AsyncComponent
{

    static final int DEQUEUE_TIMEOUT = 5000;
    static final String OMX_SOFTWARE_ENCODER = "OMX.google.h264.encoder";
    static final String VIDEO_AVC = "video/avc";
    private static MediaFormat lastOutputFormat;
    private static final Logger log = Logger.getLogger("SKAVC");
    private int bitRate;
    private android.media.MediaCodec.BufferInfo bufferInfo;
    private MediaCodec codec;
    private String codecName;
    private Surface codecSurface;
    private Rect cropRect;
    private g eglSurface;
    private AtomicInteger encodeQueueLength;
    private Size encodeSize;
    private boolean encoding;
    private int frameRate;
    private Size frameSize;
    private boolean haveCodeConfig;
    private int iframeInterval;
    private k imageConverter;
    private b profile;
    private EncoderRenderer renderer;
    private Component sink;
    private boolean skipFrame;
    private boolean syncBuffer;
    private boolean unmirror;
    private boolean useInputSurface;
    private boolean useSoftwareEncoder;

    AVCEncoderComponent(Component component, c c1, b b1, EncoderRenderer encoderrenderer)
    {
        super("SKAVC");
        sink = component;
        profile = b1;
        frameSize = c1.a();
        encodeSize = c1.b();
        frameRate = c1.d();
        iframeInterval = c1.f();
        bitRate = c1.e();
        cropRect = c1.c();
        unmirror = c1.g();
        useSoftwareEncoder = b1.c();
        if (encoderrenderer != null && android.os.Build.VERSION.SDK_INT >= 18)
        {
            useInputSurface = true;
            renderer = encoderrenderer;
        }
        if (useSoftwareEncoder)
        {
            useInputSurface = false;
        }
        updateMirroring(unmirror);
        encodeQueueLength = new AtomicInteger();
    }

    private void dequeueVideoCodec()
    {
        Object obj = codec.getOutputBuffers();
_L5:
        int i;
        if (!encoding)
        {
            break MISSING_BLOCK_LABEL_339;
        }
        i = codec.dequeueOutputBuffer(bufferInfo, 5000L);
        i;
        JVM INSTR tableswitch -3 -1: default 60
    //                   -3 130
    //                   -2 141
    //                   -1 339;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_339;
_L1:
        Object obj1 = obj;
_L6:
        if ((bufferInfo.flags & 4) != 0)
        {
            log.info("video eos");
            if (i >= 0)
            {
                log.info((new StringBuilder("eos result ")).append(i).toString());
                codec.releaseOutputBuffer(i, false);
            }
            encoding = false;
            obj = obj1;
        } else
        {
            obj = obj1;
            if (i >= 0)
            {
                if (!haveCodeConfig)
                {
                    throw new IllegalStateException("Didn't receive INFO_OUTPUT_FORMAT_CHANGED");
                }
                obj = obj1[i];
                if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0 && sink != null)
                {
                    sink.send(e.m, new l("video/avc", ((ByteBuffer) (obj)), bufferInfo));
                }
                codec.releaseOutputBuffer(i, false);
                obj = obj1;
            }
        }
        if (true) goto _L5; else goto _L2
_L2:
        obj1 = codec.getOutputBuffers();
          goto _L6
_L3:
        obj1 = obj;
        if (sink != null)
        {
            obj1 = codec.getOutputFormat();
            ByteBuffer bytebuffer = ((MediaFormat) (obj1)).getByteBuffer("csd-0");
            ByteBuffer bytebuffer1 = ((MediaFormat) (obj1)).getByteBuffer("csd-1");
            if (bytebuffer == null || bytebuffer1 == null)
            {
                log.severe("failed to receive codec specific data");
                if (lastOutputFormat != null)
                {
                    log.warning("trying last configured format");
                    obj1 = lastOutputFormat;
                }
            } else
            {
                lastOutputFormat = ((MediaFormat) (obj1));
            }
            sink.send(e.n, obj1);
            haveCodeConfig = true;
            obj1 = obj;
        }
          goto _L6
    }

    private void eglCreate(EGLContext eglcontext)
    {
        synchronized (renderer)
        {
            if (eglSurface == null)
            {
                eglSurface = new g();
                eglSurface.a(codecSurface, eglcontext);
                eglSurface.b(true);
            }
        }
        return;
        eglcontext;
        encoderrenderer;
        JVM INSTR monitorexit ;
        throw eglcontext;
    }

    private void eglRelease()
    {
        EncoderRenderer encoderrenderer = renderer;
        encoderrenderer;
        JVM INSTR monitorenter ;
        g g1;
        if (eglSurface == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        g1 = eglSurface;
        Exception exception;
        boolean flag;
        if (!profile.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g1.a(flag);
        eglSurface = null;
        encoderrenderer;
        JVM INSTR monitorexit ;
        return;
        exception;
        encoderrenderer;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void encodePreviewFrame(byte abyte0[])
    {
        dequeueVideoCodec();
        ByteBuffer abytebuffer[] = codec.getInputBuffers();
        int i1 = codec.dequeueInputBuffer(5000L);
        log.info((new StringBuilder("encodePreviewFrame ")).append(i1).toString());
        if (i1 >= 0)
        {
            ByteBuffer bytebuffer = abytebuffer[i1];
            bytebuffer.clear();
            if (abyte0 != null)
            {
                Size size = getEncodedFrameSize();
                int j = size.a();
                int j1 = size.b();
                int i = profile.a(j);
                if (useSoftwareEncoder)
                {
                    i = j;
                }
                j = profile.a(j, j1);
                bytebuffer.put(imageConverter.a(abyte0));
                long l1 = System.nanoTime() / 1000L;
                j1 = (size.b() * i * 3) / 2;
                if (syncBuffer)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                codec.queueInputBuffer(i1, 0, j1 + j, l1, i);
                syncBuffer = false;
            } else
            {
                codec.queueInputBuffer(i1, 0, 0, 0L, 4);
                dequeueVideoCodec();
            }
        }
        if (sink != null && abyte0 != null)
        {
            sink.send(e.l, abyte0);
        }
    }

    private void encodeSurfaceFrame(long l1)
    {
        if (l1 > 0L && eglSurface != null && encoding && !skipFrame)
        {
            dequeueVideoCodec();
            if (!skipFrame)
            {
                synchronized (renderer)
                {
                    encodeQueueLength.decrementAndGet();
                    renderer.a();
                    eglSurface.a(l1);
                }
                return;
            }
        } else
        {
            skipFrame = false;
        }
        break MISSING_BLOCK_LABEL_85;
        exception;
        encoderrenderer;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private MediaCodecInfo getCodecInfo()
    {
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            return codec.getCodecInfo();
        }
        if (!useSoftwareEncoder)
        {
            return getCodecInfoForMimeType("video/avc");
        } else
        {
            return getCodecInfoByName("OMX.google.h264.encoder");
        }
    }

    private MediaCodecInfo getCodecInfoByName(String s)
    {
        int j = MediaCodecList.getCodecCount();
        for (int i = 0; i < j; i++)
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
            if (mediacodecinfo.getName().equals(s))
            {
                return mediacodecinfo;
            }
        }

        return null;
    }

    private MediaCodecInfo getCodecInfoForMimeType(String s)
    {
        int i1 = MediaCodecList.getCodecCount();
label0:
        for (int i = 0; i < i1; i++)
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
            if (!mediacodecinfo.isEncoder())
            {
                continue;
            }
            String as[] = mediacodecinfo.getSupportedTypes();
            int j1 = as.length;
            int j = 0;
            do
            {
                if (j >= j1)
                {
                    continue label0;
                }
                if (as[j].equalsIgnoreCase(s))
                {
                    return mediacodecinfo;
                }
                j++;
            } while (true);
        }

        return null;
    }

    private Size getEncodedFrameSize()
    {
        int i;
        int j;
        int i1;
        int j1;
        int k1;
        int l1;
        i1 = encodeSize.a();
        j1 = encodeSize.b();
        l1 = i1;
        k1 = j1;
        i = k1;
        j = l1;
        if (cropRect == null) goto _L2; else goto _L1
_L1:
        j = l1 - (cropRect.left + cropRect.right);
        k1 -= cropRect.top + cropRect.bottom;
        if (j != j1) goto _L4; else goto _L3
_L3:
        j = j1;
        i = j1;
_L2:
        return new Size(j, i);
_L4:
        i = k1;
        if (k1 == i1)
        {
            j = i1;
            i = i1;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private int[] getSupportedColorFormats(MediaCodecInfo mediacodecinfo)
    {
        Object obj = null;
        try
        {
            mediacodecinfo = mediacodecinfo.getCapabilitiesForType("video/avc");
        }
        // Misplaced declaration of an exception variable
        catch (MediaCodecInfo mediacodecinfo)
        {
            mediacodecinfo.printStackTrace();
            mediacodecinfo = obj;
        }
        if (mediacodecinfo == null)
        {
            return new int[0];
        } else
        {
            return ((android.media.MediaCodecInfo.CodecCapabilities) (mediacodecinfo)).colorFormats;
        }
    }

    private void initEncoder()
    {
        Size size = getEncodedFrameSize();
        MediaFormat mediaformat;
        MediaCodecInfo mediacodecinfo;
        int i;
        if (!useSoftwareEncoder)
        {
            codec = MediaCodec.createEncoderByType("video/avc");
        } else
        {
            codec = MediaCodec.createByCodecName("OMX.google.h264.encoder");
        }
        mediaformat = MediaFormat.createVideoFormat("video/avc", size.a(), size.b());
        mediacodecinfo = getCodecInfo();
        if (mediacodecinfo != null)
        {
            codecName = mediacodecinfo.getName();
        } else
        if (useSoftwareEncoder)
        {
            codecName = "OMX.google.h264.encoder";
        }
        if (useInputSurface)
        {
            i = 0x7f000789;
        } else
        if (mediacodecinfo != null)
        {
            b b2 = profile;
            String s = codecName;
            getSupportedColorFormats(mediacodecinfo);
            i = b2.a(s);
        } else
        {
            i = 21;
        }
        mediaformat.setInteger("color-format", i);
        mediaformat.setInteger("bitrate", bitRate);
        mediaformat.setInteger("frame-rate", frameRate);
        mediaformat.setInteger("i-frame-interval", iframeInterval);
        log.info((new StringBuilder("AVC configure: ")).append(codecName).append(" format ").append(mediaformat.toString()).toString());
        codec.configure(mediaformat, null, null, 1);
        bufferInfo = new android.media.MediaCodec.BufferInfo();
        if (useInputSurface)
        {
            codecSurface = codec.createInputSurface();
        } else
        {
            int j1 = size.a();
            int i1 = size.b();
            int j = profile.a(j1);
            i1 = profile.a(j1, i1);
            if (useSoftwareEncoder)
            {
                j = j1;
                i1 = 0;
            }
            boolean flag1 = profile.a();
            b b1 = profile;
            boolean flag;
            if (!unmirror)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag = b1.a(flag);
            imageConverter = new k(flag1, i, frameSize, size, j, flag, i1);
        }
        codec.start();
        codec.flush();
        encoding = true;
        log.info("AVC encoder started. ");
    }

    private void releaseEncoder()
    {
        if (renderer != null)
        {
            eglRelease();
        }
        if (codec != null)
        {
            codec.stop();
            codec.release();
            codec = null;
        }
    }

    private void stopEncoder()
    {
        if (codec != null && encoding)
        {
            if (useInputSurface)
            {
                log.info("video signalEndOfInputStream");
                codec.flush();
                codec.signalEndOfInputStream();
                dequeueVideoCodec();
            } else
            {
                encodePreviewFrame(null);
            }
            if (sink != null)
            {
                sink.send(e.r, "video/avc");
            }
            encoding = false;
        }
    }

    private void updateMirroring(boolean flag)
    {
        if (renderer == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        EncoderRenderer encoderrenderer = renderer;
        encoderrenderer;
        JVM INSTR monitorenter ;
        float f1;
        float af[];
        af = renderer.b();
        f1 = Math.abs(af[0]);
        float f = f1;
        if (flag)
        {
            f = -f1;
        }
        af[0] = f;
        if (encoding)
        {
            skipFrame = true;
        }
        encoderrenderer;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        encoderrenderer;
        JVM INSTR monitorexit ;
        throw exception;
    }

    AtomicInteger getQueueLength()
    {
        return encodeQueueLength;
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
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[e.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[e.g.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[e.h.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[e.f.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[e.c.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.d.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.i.ordinal()] = 8;
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
            initEncoder();
            return true;

        case 2: // '\002'
            eglCreate((EGLContext)obj);
            return true;

        case 3: // '\003'
            encodeSurfaceFrame(((Long)obj).longValue());
            return true;

        case 4: // '\004'
            encodePreviewFrame((byte[])obj);
            return true;

        case 5: // '\005'
            updateMirroring(((Boolean)obj).booleanValue());
            return true;

        case 6: // '\006'
            stopEncoder();
            return true;

        case 7: // '\007'
            stopEncoder();
            releaseEncoder();
            return true;

        case 8: // '\b'
            syncBuffer = true;
            break;
        }
        return true;
    }

    public boolean hasRecordingSurface()
    {
        return eglSurface != null;
    }

}
