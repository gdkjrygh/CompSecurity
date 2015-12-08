// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.extension.decoder;

import android.media.MediaFormat;
import com.skype.android.video.hw.codec.OmxWrapper;
import com.skype.android.video.hw.codec.decoder.VideoSampleDecoder;
import com.skype.android.video.hw.extension.JniCodecUtils;
import com.skype.android.video.hw.format.Capabilities;
import com.skype.android.video.hw.format.ColorFormat;
import com.skype.android.video.hw.format.H264Level;
import com.skype.android.video.hw.format.H264Profile;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.format.VideoFormat;
import com.skype.android.video.hw.frame.InputFrame;
import com.skype.android.video.hw.frame.OutputFrame;
import com.skype.android.video.hw.utils.CodecUtils;
import com.skype.android.video.hw.utils.DebugUtils;
import com.skype.android.video.hw.utils.EncoderAttributes;
import com.skype.android.video.hw.utils.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.skype.android.video.hw.extension.decoder:
//            VideoDecoderExtension, VideoDecoderExtensionFactory

public class VideoSampleDecoderExtension
    implements VideoDecoderExtension
{
    public static class Factory
        implements VideoDecoderExtensionFactory
    {

        public volatile VideoDecoderExtension create(int i)
        {
            return create(i);
        }

        public VideoSampleDecoderExtension create(int i)
        {
            return new VideoSampleDecoderExtension(i);
        }

        public Factory()
        {
        }
    }


    private static final int COMPRESSION_RATIO_ESTIMATION = 10;
    private static final int DEFAULT_FRAMERATE = 30;
    private static final H264Level DEFAULT_H264_LEVEL;
    private static final H264Profile DEFAULT_H264_PROFILE;
    private static final int DEFAULT_I_FRAME_INTERVAL = 420;
    private static final int INPUT_FRAME_POOL_SIZE = 10;
    private static final int MAX_CONSECUTIVE_TIMEOUT_COUNT = 4;
    private static final int MAX_TOTAL_TIMEOUT_COUNT = 3;
    private static final int OUTPUT_FRAME_POOL_SIZE = 10;
    private int consecutiveTimeoutCount;
    private VideoSampleDecoder decoder;
    private final String decoderName;
    boolean firstFrame;
    private long initialTimestamp;
    boolean isRunning;
    private long lastTs;
    private final Object lock;
    private int rawFrameSize;
    private int totaltimeoutCount;
    VideoFormat videoFormat;

    private VideoSampleDecoderExtension(int i)
    {
        lock = new Object();
        firstFrame = false;
        isRunning = false;
        consecutiveTimeoutCount = 0;
        totaltimeoutCount = 0;
        lastTs = 0L;
        decoderName = CodecUtils.enumDecoders()[i];
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append(" with h/w decoder #").append(i).append(" (").append(decoderName).append(") created").toString());
        }
    }


    private static VideoFormat createDecoderVideoFormat(EncoderAttributes encoderattributes)
        throws com.skype.android.video.hw.utils.EncoderAttributes.AttributeException
    {
        encoderattributes = new VideoFormat();
        encoderattributes.setResolution(new Resolution(1920, 1080));
        encoderattributes.setMaxResolution(new Resolution(1920, 1080));
        encoderattributes.setColorFormat(ColorFormat.I420);
        return encoderattributes;
    }

    private static native void frameReady(long l, long l1, int i, ByteBuffer bytebuffer, int j, int k, 
            long l2, boolean flag, int i1, int j1, int k1, int i2, 
            int j2, int k2, int i3, int j3);

    private void frameReady(long l, long l1, OutputFrame outputframe)
    {
        int i;
        int j;
        int k;
        int i1;
        i = 0;
        j = 0;
        k = 0;
        i1 = 0;
        if (decoder.getMediaFormat().containsKey("crop-left"))
        {
            i = decoder.getMediaFormat().getInteger("crop-left");
            j = decoder.getMediaFormat().getInteger("crop-top");
            k = decoder.getMediaFormat().getInteger("crop-right");
            i1 = decoder.getMediaFormat().getInteger("crop-bottom");
        }
_L2:
        com.skype.android.video.hw.frame.OutputFrame.FrameBuffer framebuffer;
        if (!outputframe.hasBuffers())
        {
            break; /* Loop/switch isn't completed */
        }
        framebuffer = outputframe.popBuffer();
        int k1 = decoder.getMediaFormat().getInteger("stride");
        int j1;
        if (k1 % 16 == 0)
        {
            j1 = 0;
        } else
        {
            j1 = 16 - k1 % 16;
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() outputFrame.popBuffer() done").toString());
        }
        frameReady(l, outputframe.getNativeLockingObj(), framebuffer.getId(), framebuffer.getData(), framebuffer.getOffset(), framebuffer.getSize(), l1, outputframe.isTimedOut(), decoder.getMediaFormat().getInteger("width"), decoder.getMediaFormat().getInteger("height"), ColorFormat.fromOmx(decoder.getMediaFormat().getInteger("color-format")).getSliqValue().intValue(), k1 + j1, i, j, k, i1);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() frameReady() native call done").toString());
        }
        framebuffer.close();
        if (true) goto _L2; else goto _L1
        outputframe;
        framebuffer.close();
        throw outputframe;
_L1:
    }

    public static boolean getCapabilities(String s, long l)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/extension/decoder/VideoSampleDecoderExtension.getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        try
        {
            passCapabilitiesToNative(l, CodecUtils.getDecoderCapabilities(s));
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/extension/decoder/VideoSampleDecoderExtension.getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", "Unexpected exception caught", s);
            }
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/extension/decoder/VideoSampleDecoderExtension.getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed").toString());
            }
            return false;
        }
        return true;
    }

    private static void passCapabilitiesToNative(long l, Capabilities capabilities)
    {
        int ai[];
        int ai1[];
        OmxWrapper omxwrapper;
        int i;
        long l1;
        ai = new int[capabilities.getProfiles().size()];
        i = 0;
        for (Iterator iterator = capabilities.getProfiles().iterator(); iterator.hasNext();)
        {
            ai[i] = ((H264Profile)iterator.next()).getSliqValue().intValue();
            i++;
        }

        i = -1;
        for (Iterator iterator1 = capabilities.getLevels().iterator(); iterator1.hasNext();)
        {
            i = Math.max(i, ((H264Level)iterator1.next()).getSliqValue().intValue());
        }

        ai1 = new int[capabilities.getColorFormats().size()];
        int j = 0;
        for (Iterator iterator2 = capabilities.getColorFormats().iterator(); iterator2.hasNext();)
        {
            ai1[j] = ((ColorFormat)iterator2.next()).getSliqValue().intValue();
            j++;
        }

        l1 = 0L;
        omxwrapper = new OmxWrapper(capabilities.getCodecName(), capabilities.getCodecName());
        omxwrapper.createTracked();
        if (omxwrapper.isNodeIdKnown())
        {
            Log.i("SLIQ", (new StringBuilder("!!! Got nodeId: ")).append(omxwrapper.getNodeId()).toString());
            l1 = omxwrapper.getDecCapability();
        }
        omxwrapper.close();
_L2:
        JniCodecUtils.returnCapabilities(l, capabilities.getCodecName(), ai, i, ai1, l1, 0L, false, 0, 0, 0, 0, 0, 0, 0, false, 0, false);
        return;
        IOException ioexception;
        ioexception;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", "Unexpected IOexception caught", ioexception);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int configure(long l, int i, long l1, int j)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(i);
        ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(j);
        ByteBuffer bytebuffer2 = ByteBuffer.allocateDirect(i + j);
        consecutiveTimeoutCount = 0;
        totaltimeoutCount = 0;
        JniCodecUtils.fillInputFrameBuffer(l, bytebuffer, i);
        JniCodecUtils.fillInputFrameBuffer(l1, bytebuffer1, j);
        bytebuffer.position(0);
        bytebuffer2.put(bytebuffer);
        bytebuffer1.position(0);
        bytebuffer2.put(bytebuffer1);
        bytebuffer2.position(0);
        try
        {
            if (isRunning)
            {
                decoder.setReconfigFlag(true);
                decoder.stop();
            }
            videoFormat.setSpsPps(bytebuffer2);
            decoder.configure(null, videoFormat, false);
            decoder.start();
            isRunning = true;
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
            firstFrame = true;
        }
        catch (Exception exception)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", "Exception caught!", exception);
            }
            isRunning = false;
            return -1;
        }
        return 0;
    }

    public int flushFrames(long l, long l1)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (!isRunning)
        {
            Log.e("SLIQ", "can't flushFrame because decoder is not running!");
        } else
        {
            decoder.signalEOS(initialTimestamp, l1);
            boolean flag = false;
            do
            {
                OutputFrame outputframe = decoder.flushOneFrame(l1);
                boolean flag1;
                if (outputframe != null && !outputframe.isTimedOut() && !outputframe.isEndOfStream())
                {
                    outputframe.close();
                    flag1 = flag;
                } else
                {
                    flag1 = true;
                }
                flag = flag1;
            } while (!flag1);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
                return 0;
            }
        }
        return 0;
    }

    public int init(String s)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        try
        {
            videoFormat = createDecoderVideoFormat(new EncoderAttributes(s));
            rawFrameSize = (videoFormat.getMaxResolution().getWidth() * videoFormat.getMaxResolution().getHeight() * videoFormat.getColorFormat().getBitsPerPixel()) / 8;
            initialTimestamp = 132L;
            lastTs = 0L;
            isRunning = false;
            decoder = new VideoSampleDecoder(decoderName);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", "Illegal attribute value", s);
            }
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_INCORRECT_PARAM").toString());
            }
            return -9;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", "Unexpected exception caught", s);
            }
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_UNKNOWN").toString());
            }
            return -1;
        }
        return 0;
    }

    public int processFrame(long l, long l1, long l2, int i, 
            long l3)
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = false;
        boolean flag1;
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        flag1 = isRunning;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_764;
        }
        Object obj1;
        obj1 = decoder.getInputFrame(l);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() deocder.getInputFrame() done").toString());
        }
        ((InputFrame) (obj1)).setTimestamp(initialTimestamp);
        initialTimestamp = initialTimestamp + 33333L;
        ((InputFrame) (obj1)).setSize(i);
        JniCodecUtils.fillInputFrameBuffer(l2, ((InputFrame) (obj1)).getData(), i);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() JniCodecUtils.fillInputFrameBuffer done").toString());
        }
        l2 = l;
        if (firstFrame)
        {
            l2 = l * 10L;
        }
        obj1 = decoder.decode(((InputFrame) (obj1)), l2);
        if (!((OutputFrame) (obj1)).isTimedOut()) goto _L2; else goto _L1
_L1:
        consecutiveTimeoutCount = consecutiveTimeoutCount + 1;
        totaltimeoutCount = totaltimeoutCount + 1;
_L5:
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() decoder.decode() done !totalTimeoutCount ").append(totaltimeoutCount).toString());
        }
        firstFrame = false;
        lastTs = l3;
        frameReady(l1, l3, ((OutputFrame) (obj1)));
        ((OutputFrame) (obj1)).close();
        i = consecutiveTimeoutCount;
        if (i < 4) goto _L4; else goto _L3
_L3:
        obj;
        JVM INSTR monitorexit ;
        return -23;
_L2:
        consecutiveTimeoutCount = 0;
          goto _L5
        Object obj2;
        obj2;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", "Unexpected exception caught", ((Throwable) (obj2)));
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_ANDROID_FAILED").toString());
        }
        isRunning = false;
        i = -23;
_L10:
        obj;
        JVM INSTR monitorexit ;
        return i;
_L4:
        if (totaltimeoutCount < 3) goto _L7; else goto _L6
_L6:
        int j;
        Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() start to flush frames").toString());
        j = totaltimeoutCount;
        i = 0;
_L8:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = decoder.flushOneFrame(l2);
        if (((OutputFrame) (obj2)).isTimedOut())
        {
            consecutiveTimeoutCount = consecutiveTimeoutCount + 1;
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_679;
        }
        if (!((OutputFrame) (obj2)).isTimedOut() && !((OutputFrame) (obj2)).isEndOfStream())
        {
            frameReady(l1, l3, ((OutputFrame) (obj2)));
            totaltimeoutCount = totaltimeoutCount - 1;
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() flush succeeded, now ").append(totaltimeoutCount).append(" frames remain").toString());
        }
        ((OutputFrame) (obj2)).close();
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        i = ((flag) ? 1 : 0);
        if (!Log.isLoggable("SLIQ", 3)) goto _L10; else goto _L9
_L9:
        Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
        i = ((flag) ? 1 : 0);
          goto _L10
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        obj;
        JVM INSTR monitorexit ;
        return -1;
    }

    public int uninit()
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        try
        {
            if (decoder != null)
            {
                decoder.stop();
                isRunning = false;
                decoder.close();
                decoder = null;
            }
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
        }
        catch (RuntimeException runtimeexception)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", "Unexpected exception caught", runtimeexception);
            }
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_UNKNOWN").toString());
            }
            isRunning = false;
            return -1;
        }
        return 0;
    }

    static 
    {
        DEFAULT_H264_LEVEL = H264Level.L31;
        DEFAULT_H264_PROFILE = H264Profile.BASELINE;
    }
}
