// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.Matrix;
import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            AsyncComponent, e, AVCEncoderComponent, AACEncoderComponent, 
//            l, AACDecoderComponent, AVCDecoderComponent, GLTextureViewWrapper, 
//            ShaderEffect, GLES20Renderer, EncoderRenderer, SurfaceWrapper, 
//            b, a, m, c, 
//            TranscodeCallback

class TranscodeComponent extends AsyncComponent
{

    private static final int BUFFER_SIZE = 0x20000;
    private static final int START_TIMEOUT = 10000;
    private static final Logger log = Logger.getLogger("SKMT");
    private AACDecoderComponent aacDecoderComponent;
    private AACEncoderComponent aacEncoderComponent;
    private a aacEncoderSettings;
    private AVCDecoderComponent avcDecoderComponent;
    private AVCEncoderComponent avcEncoderComponent;
    private c avcEncoderSettings;
    private TranscodeCallback callback;
    private boolean canAdvance;
    private Context context;
    private SurfaceWrapper decoderSurfaceWrapper;
    private MediaExtractor extractor;
    private File file;
    private int inputAudioTrackIndex;
    private int inputVideoTrackIndex;
    private String mediaFilePath;
    private MediaMuxer mediaMuxer;
    private ConditionVariable muxerStarted;
    private int orientation;
    private int outputAudioTrackIndex;
    private int outputVideoTrackIndex;
    private ByteBuffer sampleBuffer;
    private int trackCount;
    private float xScale;
    private float yScale;

    TranscodeComponent(Context context1, String s, SurfaceWrapper surfacewrapper, c c, a a1)
    {
        super("SKMT");
        if (context1 == null)
        {
            throw new IllegalArgumentException("null context");
        }
        if (s == null)
        {
            throw new IllegalArgumentException("null path");
        } else
        {
            context = context1;
            decoderSurfaceWrapper = surfacewrapper;
            aacEncoderSettings = a1;
            avcEncoderSettings = c;
            mediaFilePath = s;
            outputVideoTrackIndex = -1;
            muxerStarted = new ConditionVariable();
            orientation = 0;
            xScale = 1.0F;
            yScale = 1.0F;
            return;
        }
    }

    private void encodeDecoderFrame(SurfaceTexture surfacetexture)
    {
        if (surfacetexture.getTimestamp() > 0L)
        {
            avcEncoderComponent.send(e.g, Long.valueOf(surfacetexture.getTimestamp()));
        }
    }

    private void extractSample()
    {
        if (!canAdvance) goto _L2; else goto _L1
_L1:
        int i = extractor.readSampleData(sampleBuffer, 0);
        if (i >= 0) goto _L4; else goto _L3
_L3:
        if (avcEncoderComponent != null)
        {
            avcEncoderComponent.send(e.r);
        }
        if (aacEncoderComponent != null)
        {
            aacEncoderComponent.send(e.r);
        }
        log.info("end of stream, sent decoder eos.");
        canAdvance = false;
        send(e.c);
_L6:
        if (canAdvance)
        {
            send(e.q);
        }
_L2:
        return;
_L4:
        Object obj;
        int j;
        j = extractor.getSampleTrackIndex();
        long l1 = extractor.getSampleTime();
        android.media.MediaCodec.BufferInfo bufferinfo;
        if (j == inputVideoTrackIndex)
        {
            obj = "video/avc";
        } else
        {
            obj = "audio/mp4a-latm";
        }
        bufferinfo = new android.media.MediaCodec.BufferInfo();
        bufferinfo.offset = 0;
        bufferinfo.size = i;
        bufferinfo.flags = extractor.getSampleFlags();
        bufferinfo.presentationTimeUs = l1;
        obj = new l(((String) (obj)), sampleBuffer, bufferinfo);
        if (j != inputAudioTrackIndex)
        {
            break; /* Loop/switch isn't completed */
        }
        aacDecoderComponent.handle(e.o, obj);
_L7:
        canAdvance = extractor.advance();
        if (true) goto _L6; else goto _L5
_L5:
        if (j == inputVideoTrackIndex)
        {
            avcDecoderComponent.handle(e.o, obj);
        } else
        {
            log.warning("Sample from extractor not on expected track");
        }
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }

    private GLES20Renderer getDecoderRenderer()
    {
        GLES20Renderer gles20renderer = ((GLTextureViewWrapper)decoderSurfaceWrapper).i();
        gles20renderer.a(ShaderEffect.t.a());
        return gles20renderer;
    }

    private EncoderRenderer getEncoderRenderer()
    {
        GLES20Renderer gles20renderer = ((GLTextureViewWrapper)decoderSurfaceWrapper).i();
        if (gles20renderer instanceof EncoderRenderer)
        {
            return (EncoderRenderer)gles20renderer;
        } else
        {
            return null;
        }
    }

    private void onEndOfStream(String s)
    {
        this;
        JVM INSTR monitorenter ;
        log.info((new StringBuilder("eos ")).append(s).toString());
        stop();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void onFileTranscoded()
    {
        if (file != null && file.exists() && callback != null)
        {
            file = null;
        }
    }

    private void onFormatChange(MediaFormat mediaformat)
    {
        this;
        JVM INSTR monitorenter ;
        if (mediaMuxer == null) goto _L2; else goto _L1
_L1:
        String s;
        s = mediaformat.getString("mime");
        log.info((new StringBuilder("onFormatChange ")).append(s).append(" ").append(mediaformat).toString());
        if (!"video/avc".equalsIgnoreCase(s)) goto _L4; else goto _L3
_L3:
        outputVideoTrackIndex = mediaMuxer.addTrack(mediaformat);
        log.info((new StringBuilder("add video track ")).append(outputVideoTrackIndex).toString());
        trackCount = trackCount + 1;
_L9:
        int i;
        if (inputVideoTrackIndex > 0 && inputAudioTrackIndex > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!i) goto _L6; else goto _L5
_L5:
        if (trackCount != 2) goto _L2; else goto _L7
_L7:
        log.info("mediaMuxer.start()");
        mediaMuxer.start();
        muxerStarted.open();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!"audio/mp4a-latm".equalsIgnoreCase(s)) goto _L9; else goto _L8
_L8:
        outputAudioTrackIndex = mediaMuxer.addTrack(mediaformat);
        log.info((new StringBuilder("add audio track ")).append(outputAudioTrackIndex).toString());
        trackCount = trackCount + 1;
          goto _L9
        mediaformat;
        throw mediaformat;
_L6:
        i = trackCount;
        if (i != 1) goto _L2; else goto _L7
    }

    private void releaseMuxer()
    {
        if (mediaMuxer != null)
        {
            log.info("mediaMuxer.release()");
            try
            {
                mediaMuxer.release();
            }
            catch (IllegalStateException illegalstateexception)
            {
                illegalstateexception.printStackTrace();
            }
            mediaMuxer = null;
        }
        outputVideoTrackIndex = -1;
    }

    private void start()
        throws IOException
    {
        canAdvance = true;
        sampleBuffer = ByteBuffer.allocateDirect(0x20000);
        extractor = new MediaExtractor();
        String s = null;
        Object obj = null;
        extractor.setDataSource(mediaFilePath);
        inputVideoTrackIndex = -1;
        inputAudioTrackIndex = -1;
        int i = 0;
        do
        {
            Object obj1;
            String s1;
label0:
            {
                obj1 = s;
                if (i < extractor.getTrackCount())
                {
                    obj1 = extractor.getTrackFormat(i);
                    s1 = ((MediaFormat) (obj1)).getString("mime");
                    if (!s1.startsWith("video/"))
                    {
                        break label0;
                    }
                    inputVideoTrackIndex = i;
                    extractor.selectTrack(inputVideoTrackIndex);
                }
                s = (new StringBuilder("scv_")).append(System.currentTimeMillis()).append(".mp4").toString();
                file = new File(context.getCacheDir(), s);
                mediaMuxer = new MediaMuxer(file.getPath(), 0);
                if (avcEncoderSettings != null && inputVideoTrackIndex > 0)
                {
                    avcDecoderComponent = new AVCDecoderComponent(this, ((MediaFormat) (obj1)), getDecoderSurface().b());
                    updateEncoderTransform(orientation, xScale, yScale);
                    obj1 = b.a;
                    avcEncoderComponent = new AVCEncoderComponent(this, avcEncoderSettings, ((b) (obj1)), getEncoderRenderer());
                    avcDecoderComponent.send(e.b);
                    avcEncoderComponent.send(e.b);
                    avcDecoderComponent.send(e.o);
                }
                if (aacEncoderSettings != null && inputAudioTrackIndex > 0)
                {
                    i = ((MediaFormat) (obj)).getInteger("sample-rate");
                    aacEncoderComponent = new AACEncoderComponent(this, new a(aacEncoderSettings.a(), i, aacEncoderSettings.c(), aacEncoderSettings.d()));
                    aacDecoderComponent = new AACDecoderComponent(aacEncoderComponent, ((MediaFormat) (obj)));
                    aacEncoderComponent.send(e.b);
                    aacDecoderComponent.send(e.b);
                }
                send(e.q);
                return;
            }
            if (s1.startsWith("audio/"))
            {
                inputAudioTrackIndex = i;
                obj = obj1;
                extractor.selectTrack(inputAudioTrackIndex);
            }
            i++;
        } while (true);
    }

    private void stop()
    {
        AVCEncoderComponent avcencodercomponent = avcEncoderComponent;
        AACDecoderComponent aacdecodercomponent = aacDecoderComponent;
        AACEncoderComponent aacencodercomponent = aacEncoderComponent;
        AACDecoderComponent aacdecodercomponent1 = aacDecoderComponent;
        for (int i = 0; i < 4; i++)
        {
            AsyncComponent asynccomponent = (new AsyncComponent[] {
                avcencodercomponent, aacdecodercomponent, aacencodercomponent, aacdecodercomponent1
            })[i];
            if (asynccomponent != null)
            {
                asynccomponent.send(e.c);
                asynccomponent.releaseAndWait();
            }
        }

        if (mediaMuxer != null)
        {
            log.info("mediaMuxer.release()");
            releaseMuxer();
        }
        if (extractor != null)
        {
            extractor.release();
            extractor = null;
        }
        releaseMuxer();
        getDecoderSurface().d();
        onFileTranscoded();
    }

    private void updateEncoderTransform(int i, float f, float f1)
    {
        EncoderRenderer encoderrenderer = getEncoderRenderer();
        if (encoderrenderer != null && (i == 90 || i == 270))
        {
            float af[] = encoderrenderer.b();
            f = Math.max(f, f1);
            f1 /= f;
            Matrix.setIdentityM(af, 0);
            Matrix.scaleM(af, 0, f, f1, 1.0F);
        }
    }

    private void writeSample(m m1)
    {
        int i;
        if (!muxerStarted.block(10000L))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        i = -1;
        if ("video/avc".equalsIgnoreCase(m1.c()))
        {
            i = outputVideoTrackIndex;
        }
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        long l1 = m1.d();
        m1.a().presentationTimeUs = l1;
        mediaMuxer.writeSampleData(i, m1.b(), m1.a());
        return;
        m1;
        m1.printStackTrace();
        return;
        log.severe("muxer failed to start");
        muxerStarted.open();
        return;
    }

    public SurfaceWrapper getDecoderSurface()
    {
        return decoderSurfaceWrapper;
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
                    a[e.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[e.n.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[e.m.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[e.p.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[e.r.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.e.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.q.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[e1.ordinal()];
        JVM INSTR tableswitch 1 8: default 56
    //                   1 58
    //                   2 71
    //                   3 77
    //                   4 88
    //                   5 99
    //                   6 110
    //                   7 121
    //                   8 141;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return false;
_L2:
        try
        {
            start();
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            e1.printStackTrace();
            return true;
        }
        return true;
_L3:
        stop();
        return true;
_L4:
        onFormatChange((MediaFormat)obj);
        continue; /* Loop/switch isn't completed */
_L5:
        writeSample((m)obj);
        continue; /* Loop/switch isn't completed */
_L6:
        encodeDecoderFrame((SurfaceTexture)obj);
        continue; /* Loop/switch isn't completed */
_L7:
        onEndOfStream((String)obj);
        continue; /* Loop/switch isn't completed */
_L8:
        if (avcEncoderComponent != null)
        {
            avcEncoderComponent.send(e1, obj);
        }
        continue; /* Loop/switch isn't completed */
_L9:
        extractSample();
        if (true) goto _L1; else goto _L10
_L10:
    }

    public void setOrientation(int i)
    {
        orientation = i;
    }

    public void setTranscoderCallback(TranscodeCallback transcodecallback)
    {
        callback = transcodecallback;
    }

    public void setVideoRatio(float f, float f1)
    {
        xScale = f;
        yScale = f1;
    }

}
