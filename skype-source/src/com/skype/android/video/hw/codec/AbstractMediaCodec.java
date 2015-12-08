// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.skype.android.video.hw.HWFeatureSelectiveFields;
import com.skype.android.video.hw.format.Capabilities;
import com.skype.android.video.hw.format.RateControlMode;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.format.VideoFormat;
import com.skype.android.video.hw.frame.OutputFrame;
import com.skype.android.video.hw.frame.OutputFramePool;
import com.skype.android.video.hw.utils.CodecUtils;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumSet;

// Referenced classes of package com.skype.android.video.hw.codec:
//            OmxWrapper

public abstract class AbstractMediaCodec
    implements Closeable
{

    private static final int OUTPUT_FRAME_POOL_SIZE = 4;
    private MediaFormat format;
    private boolean isEncoder;
    private boolean isOpen;
    protected MediaCodec mediaCodec;
    protected OmxWrapper omxWrapper;
    protected final android.media.MediaCodec.BufferInfo outputBufferInfo = new android.media.MediaCodec.BufferInfo();
    private ByteBuffer outputBuffers[];
    private final OutputFramePool outputFramePool;
    protected boolean useQCExtension;

    protected AbstractMediaCodec(String s, boolean flag)
    {
        boolean flag1 = true;
        super();
        isOpen = true;
        isEncoder = true;
        omxWrapper = null;
        useQCExtension = false;
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Creating MediaCodec by name ").append(s).toString());
        }
        isEncoder = flag;
        if (!flag || !CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.QC_OMX_Extension) || !CodecUtils.getEncoderCapabilities(s).isQCExtensionSupported().booleanValue())
        {
            flag1 = false;
        }
        useQCExtension = flag1;
        if (!flag || !useQCExtension && CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Android_OMX))
        {
            omxWrapper = new OmxWrapper(s, s);
            mediaCodec = omxWrapper.createTracked();
            if (omxWrapper.isNodeIdKnown())
            {
                Log.i("SLIQ", (new StringBuilder("!!! Got nodeId: ")).append(omxWrapper.getNodeId()).toString());
            }
        } else
        {
            try
            {
                mediaCodec = MediaCodec.createByCodecName(s);
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        outputFramePool = new OutputFramePool(4, mediaCodec);
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": ").append(mediaCodec).append(" by name ").append(s).append(" created").toString());
        }
    }

    private MediaFormat createMediaFormat(VideoFormat videoformat)
    {
        MediaFormat mediaformat = MediaFormat.createVideoFormat("video/avc", videoformat.getResolution().getWidth(), videoformat.getResolution().getHeight());
        doConfigureMediaFormat(mediaformat, videoformat);
        Log.i("SLIQ", (new StringBuilder("Created MediaFormat: ")).append(mediaformat.toString()).toString());
        return mediaformat;
    }

    public void close()
    {
        if (!isOpen)
        {
            throw new IllegalStateException("closed");
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Releasing ").append(mediaCodec).toString());
        }
        mediaCodec.release();
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Released ").append(mediaCodec).toString());
        }
        if (omxWrapper != null)
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": OMXWrapper Closing").toString());
            omxWrapper.close();
        }
        outputFramePool.close();
_L2:
        isOpen = false;
        return;
        IOException ioexception;
        ioexception;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", "Exception caught!", ioexception);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void configure(Object obj, VideoFormat videoformat, boolean flag)
    {
label0:
        {
            if (!isOpen)
            {
                throw new IllegalStateException("closed");
            }
            format = createMediaFormat(videoformat);
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Configuring ").append(mediaCodec).append(" with ").append(format).toString());
            }
            mediaCodec.configure(format, null, null, doGetMediaCodecFlags());
            if (!useQCExtension && omxWrapper != null && omxWrapper.isNodeIdKnown())
            {
                if (flag)
                {
                    omxWrapper.queryDriverVersionAndCheckVerSystem();
                }
                if (!isEncoder)
                {
                    break label0;
                }
                int i = omxWrapper.configureEncoder(format, videoformat.getRCMode().ordinal(), videoformat.getRefCount(), videoformat.getNumLayers(), videoformat.getBaseLayerPriorityId(), videoformat.getMinNumSlices(), videoformat.getSvcAlways());
                Log.i("SLIQ", (new StringBuilder("configureEncoder returned ")).append(i).toString());
            }
            return;
        }
        int j = omxWrapper.configureDecoderLowLatency();
        Log.i("SLIQ", (new StringBuilder("configureDecoderLowLatency returned ")).append(j).toString());
    }

    public void configureDynamic(VideoFormat videoformat)
    {
        doConfigureDynamic(videoformat);
    }

    protected boolean copyFrame(OutputFrame outputframe, int i)
    {
        ByteBuffer bytebuffer = outputBuffers[i];
        if (bytebuffer == null || outputBufferInfo.size <= 0)
        {
            return false;
        } else
        {
            outputframe.pushBuffer(i, bytebuffer, outputBufferInfo.offset, outputBufferInfo.size);
            return true;
        }
    }

    protected abstract void doConfigureDynamic(VideoFormat videoformat);

    protected abstract void doConfigureMediaFormat(MediaFormat mediaformat, VideoFormat videoformat);

    protected abstract int doGetMediaCodecFlags();

    protected OutputFrame drainCodec(long l)
    {
        Object obj;
        if (!isOpen)
        {
            throw new IllegalStateException("closed");
        }
        obj = outputFramePool.poll();
        if (obj == null)
        {
            throw new IllegalStateException("frame pool is empty");
        }
_L9:
        int i = 0x80000000;
        int j = mediaCodec.dequeueOutputBuffer(outputBufferInfo, l);
        i = j;
        if ((outputBufferInfo.flags & 4) == 0)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        i = j;
        ((OutputFrame) (obj)).setEndOfStream(true);
        i = j;
        if (!Log.isLoggable("SLIQ", 4))
        {
            break MISSING_BLOCK_LABEL_133;
        }
        i = j;
        Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": End of stream").toString());
        i = j;
        if ((outputBufferInfo.flags & 2) == 0) goto _L2; else goto _L1
_L1:
        i = j;
        ((OutputFrame) (obj)).setCodecConfig(true);
        i = j;
        if (!Log.isLoggable("SLIQ", 4)) goto _L2; else goto _L3
_L3:
        i = j;
        Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Codec config (e.g. SPS/PPS)").toString());
          goto _L2
_L18:
        if (j < 0) goto _L5; else goto _L4
_L4:
        i = j;
        boolean flag = copyFrame(((OutputFrame) (obj)), j);
        if (j >= 0 && !flag)
        {
            mediaCodec.releaseOutputBuffer(j, false);
        }
_L7:
        return ((OutputFrame) (obj));
_L16:
        i = j;
        ((OutputFrame) (obj)).setTimedOut(true);
        i = j;
        if (!Log.isLoggable("SLIQ", 4))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": dequeueOutputBuffer timed out ").append((float)l / 1000F).append(" ms").toString());
        if (j < 0) goto _L7; else goto _L6
_L6:
        mediaCodec.releaseOutputBuffer(j, false);
        return ((OutputFrame) (obj));
_L14:
        i = j;
        outputBuffers = mediaCodec.getOutputBuffers();
        i = j;
        if (!Log.isLoggable("SLIQ", 4))
        {
            break MISSING_BLOCK_LABEL_404;
        }
        i = j;
        Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Output buffers changed").toString());
_L11:
        if (j >= 0)
        {
            mediaCodec.releaseOutputBuffer(j, false);
        }
        if (!((OutputFrame) (obj)).isEndOfStream()) goto _L9; else goto _L8
_L8:
        return ((OutputFrame) (obj));
_L15:
        i = j;
        format = mediaCodec.getOutputFormat();
        i = j;
        ((OutputFrame) (obj)).setOutputFormatChanged(true);
        i = j;
        if (!Log.isLoggable("SLIQ", 4)) goto _L11; else goto _L10
_L10:
        i = j;
        Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Output format changed: ").append(format).toString());
          goto _L11
        obj;
        if (i >= 0 && true)
        {
            mediaCodec.releaseOutputBuffer(i, false);
        }
        throw obj;
_L5:
        i = j;
        if (!Log.isLoggable("SLIQ", 5))
        {
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        Log.w("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Unknown encoder status: ").append(j).toString());
        if (j < 0) goto _L7; else goto _L12
_L12:
        mediaCodec.releaseOutputBuffer(j, false);
        return ((OutputFrame) (obj));
_L2:
        j;
        JVM INSTR tableswitch -3 -1: default 632
    //                   -3 340
    //                   -2 428
    //                   -1 250;
           goto _L13 _L14 _L15 _L16
_L13:
        if (true) goto _L18; else goto _L17
_L17:
    }

    public MediaFormat getMediaFormat()
    {
        return format;
    }

    public OmxWrapper getOmxWrapper()
    {
        return omxWrapper;
    }

    protected boolean isOpen()
    {
        return isOpen;
    }

    public void setReconfigFlag(boolean flag)
    {
        outputFramePool.setReconfigFlag(flag);
    }

    public void start()
    {
        if (!isOpen)
        {
            throw new IllegalStateException("closed");
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Starting ").append(mediaCodec).toString());
        }
        mediaCodec.start();
        outputBuffers = mediaCodec.getOutputBuffers();
    }

    public void stop()
    {
        if (!isOpen)
        {
            throw new IllegalStateException("closed");
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Stopping ").append(mediaCodec).toString());
        }
        mediaCodec.stop();
_L1:
        return;
        Exception exception;
        exception;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", "Exception caught!", exception);
            return;
        }
          goto _L1
    }
}
