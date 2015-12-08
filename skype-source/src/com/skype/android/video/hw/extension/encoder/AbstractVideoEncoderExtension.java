// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.extension.encoder;

import android.media.MediaFormat;
import android.util.Range;
import com.skype.android.video.hw.HWFeatureSelectiveFields;
import com.skype.android.video.hw.codec.OmxWrapper;
import com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder;
import com.skype.android.video.hw.codec.encoder.camera.SurfaceObserver;
import com.skype.android.video.hw.codec.encoder.camera.capture.CapturerException;
import com.skype.android.video.hw.extension.JniCodecUtils;
import com.skype.android.video.hw.format.Capabilities;
import com.skype.android.video.hw.format.ColorFormat;
import com.skype.android.video.hw.format.H264Level;
import com.skype.android.video.hw.format.H264Profile;
import com.skype.android.video.hw.format.RateControlMode;
import com.skype.android.video.hw.format.Resolution;
import com.skype.android.video.hw.format.VideoFormat;
import com.skype.android.video.hw.frame.OutputFrame;
import com.skype.android.video.hw.utils.CodecUtils;
import com.skype.android.video.hw.utils.DebugUtils;
import com.skype.android.video.hw.utils.EncoderAttributes;
import com.skype.android.video.hw.utils.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.skype.android.video.hw.extension.encoder:
//            VideoEncoderExtension

public abstract class AbstractVideoEncoderExtension
    implements VideoEncoderExtension
{

    private static final int COMPRESSION_RATIO_ESTIMATION = 100;
    private static final int DEFAULT_FRAMERATE = 30;
    private static final H264Level DEFAULT_H264_LEVEL;
    private static final H264Profile DEFAULT_H264_PROFILE;
    private static final int DEFAULT_I_FRAME_INTERVAL = 420;
    private static final int OUTPUT_FRAME_POOL_SIZE = 2;
    private int consecutiveTimeOut;
    private AbstractVideoEncoder encoder;
    private final String encoderName;
    private long initialTimestamp;
    private boolean isFastAsyncMode;
    private boolean isFirstFrame;
    private int rawFrameSize;
    private WeakReference weakRefSurfaceObserver;

    protected AbstractVideoEncoderExtension(int i)
    {
        isFirstFrame = true;
        isFastAsyncMode = false;
        encoderName = CodecUtils.enumEncoders()[i];
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append(" with h/w encoder #").append(i).append(" (").append(encoderName).append(") created").toString());
        }
    }

    private static native void bitstreamReady(long l, boolean flag, ByteBuffer bytebuffer, int i, int j, long l1, 
            boolean flag1, boolean flag2, boolean flag3);

    public static boolean getCapabilities(String s, long l)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/extension/encoder/AbstractVideoEncoderExtension.getSimpleName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (android.os.Build.VERSION.SDK_INT >= 19) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/extension/encoder/AbstractVideoEncoderExtension.getSimpleName()).append('#').append(DebugUtils.getMethodName()).append("() don't query capability on API level ").append(android.os.Build.VERSION.SDK_INT).toString());
        }
_L4:
        return false;
_L2:
        passCapabilitiesToNative(l, CodecUtils.getEncoderCapabilities(s));
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/extension/encoder/AbstractVideoEncoderExtension.getSimpleName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
        }
        return true;
        s;
        if (Log.isLoggable("SLIQ", 6))
        {
            Log.e("SLIQ", "Unexpected exception caught", s);
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(com/skype/android/video/hw/extension/encoder/AbstractVideoEncoderExtension.getSimpleName()).append('#').append(DebugUtils.getMethodName()).append("() failed").toString());
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static VideoFormat getVideoFormatFromAttributes(EncoderAttributes encoderattributes)
        throws com.skype.android.video.hw.utils.EncoderAttributes.AttributeException
    {
        boolean flag = true;
        int j = encoderattributes.getInteger("width").intValue();
        if (j <= 0)
        {
            throw new com.skype.android.video.hw.utils.EncoderAttributes.AttributeException((new StringBuilder("width is illegal: ")).append(j).toString());
        }
        int k = encoderattributes.getInteger("height").intValue();
        if (k <= 0)
        {
            throw new com.skype.android.video.hw.utils.EncoderAttributes.AttributeException((new StringBuilder("height is illegal: ")).append(j).toString());
        }
        int i = encoderattributes.getInteger("hrd-max-rate", 0);
        if (i <= 0)
        {
            i = encoderattributes.getInteger("bitrate").intValue();
        }
        if (i > 0x20c49b || i < 0)
        {
            throw new com.skype.android.video.hw.utils.EncoderAttributes.AttributeException((new StringBuilder("bitrate out of range: ")).append(i).toString());
        }
        int l = encoderattributes.getInteger("android-rc-mode", 2);
        VideoFormat videoformat = new VideoFormat();
        videoformat.setResolution(new Resolution(j + 15 & 0xfff0, k + 15 & 0xfff0));
        videoformat.setBitrate(i * 1000);
        videoformat.setColorFormat(ColorFormat.fromSliq(encoderattributes.getInteger("color-space-format").intValue()));
        videoformat.setProfile(H264Profile.valueOf(encoderattributes.getString("h264-profile", DEFAULT_H264_PROFILE.getName()).toUpperCase()));
        videoformat.setLevel(H264Level.fromName(encoderattributes.getString("h264-level-idc", DEFAULT_H264_LEVEL.getName())));
        videoformat.setFrameRate(encoderattributes.getInteger("fps", 30));
        videoformat.setiFrameInterval(420);
        videoformat.setRCMode(RateControlMode.values()[l]);
        videoformat.setRefCount(encoderattributes.getInteger("ref-count", 1));
        videoformat.setNumLayers(encoderattributes.getInteger("num-substreams", 1));
        videoformat.setBaseLayerPriorityId(encoderattributes.getInteger("base-priority-id", 0));
        videoformat.setMinNumSlices(encoderattributes.getInteger("min-num-slices", 1));
        if (encoderattributes.getInteger("mlvec-svc", 0) == 0)
        {
            flag = false;
        }
        videoformat.setSvcAlways(flag);
        return videoformat;
    }

    private static void passCapabilitiesToNative(long l, Capabilities capabilities)
    {
        Object obj;
        Object obj1;
        int i2;
        boolean flag;
        long l2;
        long l3;
        long l4;
        long l6;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        int ai[] = new int[capabilities.getProfiles().size()];
        int i = 0;
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

        int ai1[] = new int[capabilities.getColorFormats().size()];
        int j = 0;
        for (Iterator iterator2 = capabilities.getColorFormats().iterator(); iterator2.hasNext();)
        {
            ai1[j] = ((ColorFormat)iterator2.next()).getSliqValue().intValue();
            j++;
        }

        l2 = 0L;
        l4 = 0L;
        flag7 = false;
        Integer integer;
        StringBuilder stringbuilder1;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        if (capabilities.getBitrateRange() != null)
        {
            j = ((Integer)capabilities.getBitrateRange().getLower()).intValue();
        } else
        {
            j = 0;
        }
        if (capabilities.getBitrateRange() != null)
        {
            k = ((Integer)capabilities.getBitrateRange().getUpper()).intValue();
        } else
        {
            k = 0;
        }
        if (capabilities.getWidthRange() != null)
        {
            i1 = ((Integer)capabilities.getWidthRange().getLower()).intValue();
        } else
        {
            i1 = 0;
        }
        if (capabilities.getWidthRange() != null)
        {
            j1 = ((Integer)capabilities.getWidthRange().getUpper()).intValue();
        } else
        {
            j1 = 0;
        }
        if (capabilities.getHeightRange() != null)
        {
            k1 = ((Integer)capabilities.getHeightRange().getLower()).intValue();
        } else
        {
            k1 = 0;
        }
        if (capabilities.getHeightRange() != null)
        {
            l1 = ((Integer)capabilities.getHeightRange().getUpper()).intValue();
        } else
        {
            l1 = 0;
        }
        obj1 = null;
        flag4 = false;
        flag = false;
        flag6 = false;
        flag5 = false;
        if (!CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.QC_OMX_Extension) || !capabilities.isQCExtensionSupported().booleanValue()) goto _L2; else goto _L1
_L1:
        MediaFormat mediaformat = capabilities.getExtCapabilities();
        if (mediaformat.getString("vt-version") == null)
        {
            i2 = 0;
        } else
        {
            i2 = 1;
        }
        integer = Integer.valueOf(i2);
        stringbuilder1 = new StringBuilder("getExtCapabilities: ");
        if (mediaformat == null)
        {
            obj = "null";
        } else
        {
            obj = mediaformat;
        }
        Log.d("SLIQ", stringbuilder1.append(obj).toString());
        if (mediaformat != null)
        {
            Log.d("SLIQ", "!!!!!!!!!!!!!!");
            Log.d("SLIQ", (new StringBuilder("getVersion() =>                     ")).append(mediaformat.getString("vt-version")).toString());
            Log.d("SLIQ", (new StringBuilder("isLowLatencySupported() =>          ")).append(mediaformat.getString("vt-low-latency")).toString());
            Log.d("SLIQ", (new StringBuilder("getMaxInstances() =>                ")).append(mediaformat.getString("vt-max-instances")).toString());
            Log.d("SLIQ", (new StringBuilder("getMaxTemporalLayerCount() =>       ")).append(mediaformat.getString("vt-max-temporal-layer-count")).toString());
            Log.d("SLIQ", (new StringBuilder("getMaxRefFrames() =>                ")).append(mediaformat.getString("vt-max-ref-frames")).toString());
            Log.d("SLIQ", (new StringBuilder("getMaxLTRFrames() =>                ")).append(mediaformat.getString("vt-max-ltr-frames")).toString());
            Log.d("SLIQ", (new StringBuilder("getMaxLevel() =>                    ")).append(mediaformat.getString("vt-max-level")).toString());
            Log.d("SLIQ", (new StringBuilder("getSliceControlModesBM() =>         ")).append(mediaformat.getString("vt-slice-control-modes-bitmask")).toString());
            Log.d("SLIQ", (new StringBuilder("getMaxMacroblockProcessingRate() => ")).append(mediaformat.getString("vt-max-macroblock-processing-rate")).toString());
            Log.d("SLIQ", (new StringBuilder("getSupportedDownScaleFactor() =>    ")).append(mediaformat.getString("vt-down-scale-factor")).toString());
            Log.d("SLIQ", (new StringBuilder("getMinScaleFactor() =>              ")).append(mediaformat.getString("vt-min-scale-factor")).toString());
        }
        i2 = Integer.valueOf(mediaformat.getString("vt-max-ltr-frames")).intValue();
        if (integer != null)
        {
            l3 = integer.intValue();
        } else
        {
            l3 = 0L;
        }
        if (integer != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag3 = true;
        obj = obj1;
        flag2 = flag5;
        l6 = l2;
_L6:
        JniCodecUtils.returnCapabilities(l, capabilities.getCodecName(), ai, i, ai1, l6, l3, flag1, 1, i1, j1, k1, l1, j, k, flag3, i2, flag2);
        if (obj == null || !((OmxWrapper) (obj)).isNodeIdKnown())
        {
            break MISSING_BLOCK_LABEL_865;
        }
        ((OmxWrapper) (obj)).close();
_L4:
        return;
_L2:
        l6 = l2;
        l3 = l4;
        flag1 = flag7;
        flag3 = flag4;
        i2 = ((flag) ? 1 : 0);
        flag2 = flag5;
        obj = obj1;
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Android_OMX))
        {
            OmxWrapper omxwrapper = new OmxWrapper(capabilities.getCodecName(), capabilities.getCodecName());
            omxwrapper.createTracked();
            l6 = l2;
            l3 = l4;
            flag1 = flag7;
            flag3 = flag4;
            i2 = ((flag) ? 1 : 0);
            flag2 = flag5;
            obj = omxwrapper;
            if (omxwrapper.isNodeIdKnown())
            {
                Log.i("SLIQ", (new StringBuilder("!!! Got nodeId: ")).append(omxwrapper.getNodeId()).toString());
                StringBuilder stringbuilder;
                if (omxwrapper.queryDriverVersion() != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                l3 = l4;
                if (flag1)
                {
                    long l5 = omxwrapper.getDriverVersion();
                    l6 = omxwrapper.getEncCapability();
                    l2 = l6;
                    l3 = l5;
                    if (l6 == 0L)
                    {
                        l2 = l6;
                        l3 = l5;
                        if (Arrays.asList(CodecUtils.omxCapableHW).contains(capabilities.getCodecName()))
                        {
                            CodecUtils.overrideHWMode(HWFeatureSelectiveFields.Android_OMX);
                            l3 = l5;
                            l2 = l6;
                        }
                    }
                }
                Log.i("SLIQ", (new StringBuilder("Driver version: ")).append(l3).toString());
                flag2 = flag6;
                if (omxwrapper.queryQpIndex() == 0)
                {
                    flag2 = true;
                }
                stringbuilder = new StringBuilder("QP control ");
                if (flag2)
                {
                    obj = "supported";
                } else
                {
                    obj = "un-supported";
                }
                Log.i("SLIQ", stringbuilder.append(((String) (obj))).toString());
                l6 = l2;
                flag3 = flag4;
                i2 = ((flag) ? 1 : 0);
                obj = omxwrapper;
            }
        }
        continue; /* Loop/switch isn't completed */
        capabilities;
        if (!Log.isLoggable("SLIQ", 6)) goto _L4; else goto _L3
_L3:
        Log.e("SLIQ", "Unexpected IOexception caught", capabilities);
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected abstract AbstractVideoEncoder doCreateEncoder(String s);

    protected abstract OutputFrame doEncodeFrame(long l, long l1, long l2);

    public int dropNextNFrames(int i)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED").toString());
        }
        return -10;
    }

    public int enhanceROI(int i, int j, int k, int l, int i1)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED").toString());
        }
        return -10;
    }

    public int flushFrames()
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
        }
        return 0;
    }

    public int forceIdr()
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED in API ").append(android.os.Build.VERSION.SDK_INT).toString());
            }
            return -10;
        }
        try
        {
            encoder.requestSyncFrame();
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
            return -1;
        }
        return 0;
    }

    protected AbstractVideoEncoder getEncoder()
    {
        return encoder;
    }

    protected long getInitialTimestamp()
    {
        return initialTimestamp;
    }

    public int getMaxQp()
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED").toString());
        }
        return -10;
    }

    protected int getRawFrameSize()
    {
        return rawFrameSize;
    }

    public int h264SetQp(int i)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        try
        {
            encoder.setQp(i);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
        }
        catch (com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException apinotimplementedexception)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(apinotimplementedexception.getFailedApiName()).append("(").append(apinotimplementedexception.toString()).append(")").toString());
            }
            return -10;
        }
        return 0;
    }

    public int hintRcFrameRate(float f, float f1)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        SurfaceObserver surfaceobserver;
        try
        {
            encoder.setRcFrameRate(f);
            surfaceobserver = (SurfaceObserver)weakRefSurfaceObserver.get();
        }
        catch (com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException apinotimplementedexception)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(apinotimplementedexception.getFailedApiName()).append("(").append(apinotimplementedexception.toString()).append(")").toString());
            }
            return -10;
        }
        if (surfaceobserver == null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() set targetFps to ").append(f1).toString());
        }
        surfaceobserver.setTargetFrameRate(f1);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
        }
        return 0;
    }

    public int init(String s, boolean flag)
    {
        boolean flag2;
        flag2 = true;
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
            Log.d("SLIQ", s);
        }
        s = new EncoderAttributes(s);
        initialTimestamp = s.getInteger("ts").intValue();
        Object obj;
        VideoFormat videoformat;
        boolean flag1;
        if (s.getInteger("android-fast-async-mode").intValue() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        try
        {
            isFastAsyncMode = flag1;
            obj = s.getPointer("java-object", null);
            weakRefSurfaceObserver = new WeakReference((SurfaceObserver)obj);
            videoformat = getVideoFormatFromAttributes(s);
            if (!CodecUtils.getEncoderCapabilities(encoderName).getProfiles().contains(videoformat.getProfile()))
            {
                throw new com.skype.android.video.hw.utils.EncoderAttributes.AttributeException((new StringBuilder("encoder ")).append(encoderName).append(" does not support ").append(videoformat.getProfile()).toString());
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
        rawFrameSize = (videoformat.getResolution().getWidth() * videoformat.getResolution().getHeight() * videoformat.getColorFormat().getBitsPerPixel()) / 8;
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Creating encoder ").append(encoderName).append(" with ").append(videoformat).append(" and ").append(obj).toString());
        }
        isFirstFrame = true;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_407;
        }
        encoder = doCreateEncoder(encoderName);
        if (flag) goto _L2; else goto _L1
_L1:
        if (1 != s.getInteger("check-android-hw-api-version", 0)) goto _L2; else goto _L3
_L3:
        flag = flag2;
_L5:
        encoder.configure(obj, videoformat, flag);
        encoder.start();
        encoder.configureDynamic(videoformat);
        Thread.sleep(200L);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
        }
        break MISSING_BLOCK_LABEL_632;
        s;
        if (Log.isLoggable("SLIQ", 5))
        {
            Log.w("SLIQ", (new StringBuilder()).append(getClass().getSimpleName()).append(": Interrupted").toString(), s);
        }
        return -1;
        return 0;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int markLTRFrame(int i)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        try
        {
            encoder.markLtrFrame(i);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
        }
        catch (com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException apinotimplementedexception)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(apinotimplementedexception.getFailedApiName()).append("(").append(apinotimplementedexception.toString()).append(")").toString());
            }
            return -10;
        }
        return 0;
    }

    public int processFrame(long l, long l1, long l2, long l3, boolean flag)
    {
        Object obj;
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        obj = (SurfaceObserver)weakRefSurfaceObserver.get();
        if (obj == null || flag)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (!((SurfaceObserver) (obj)).pushFrame())
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append(": Drop frame from Capturer").toString());
        }
        bitstreamReady(l1, false, null, 0, 0, l3, false, false, false);
        return 0;
        if (isFirstFrame && isFastAsyncMode)
        {
            ((SurfaceObserver) (obj)).pushFrame();
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("SLIQ", 4))
        {
            Log.i("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append(": Skipping the frame due to reinitialization").toString());
        }
        bitstreamReady(l1, false, null, 0, 0, l3, false, false, false);
_L8:
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
        }
        break MISSING_BLOCK_LABEL_673;
_L2:
        if (!isFirstFrame)
        {
            break MISSING_BLOCK_LABEL_290;
        }
        l = 0x30d40L;
        isFirstFrame = false;
_L9:
        Object obj1;
        boolean flag1;
        obj1 = doEncodeFrame(l, l2, l3);
        flag1 = ((OutputFrame) (obj1)).isCodecConfig();
_L5:
        if (!((OutputFrame) (obj1)).hasBuffers()) goto _L4; else goto _L3
_L3:
        obj = ((OutputFrame) (obj1)).popBuffer();
        flag = ((OutputFrame) (obj1)).hasBuffers();
        if (flag || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bitstreamReady(l1, flag, ((com.skype.android.video.hw.frame.OutputFrame.FrameBuffer) (obj)).getData(), ((com.skype.android.video.hw.frame.OutputFrame.FrameBuffer) (obj)).getOffset(), ((com.skype.android.video.hw.frame.OutputFrame.FrameBuffer) (obj)).getSize(), l3, ((OutputFrame) (obj1)).isEndOfStream(), ((OutputFrame) (obj1)).isTimedOut(), ((OutputFrame) (obj1)).isOutputFormatChanged());
        ((com.skype.android.video.hw.frame.OutputFrame.FrameBuffer) (obj)).releaseFrameBuffer();
        ((com.skype.android.video.hw.frame.OutputFrame.FrameBuffer) (obj)).close();
          goto _L5
        obj1;
        try
        {
            ((com.skype.android.video.hw.frame.OutputFrame.FrameBuffer) (obj)).releaseFrameBuffer();
            ((com.skype.android.video.hw.frame.OutputFrame.FrameBuffer) (obj)).close();
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", "Unexpected exception caught", ((Throwable) (obj)));
            }
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_UNKNOWN").toString());
            }
            return -1;
        }
        catch (CapturerException capturerexception)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append("Push frame has failed").toString(), capturerexception);
            }
        }
        return -1;
_L4:
        if (!((OutputFrame) (obj1)).isTimedOut())
        {
            break MISSING_BLOCK_LABEL_665;
        }
        consecutiveTimeOut = consecutiveTimeOut + 1;
        if (consecutiveTimeOut >= 151) goto _L7; else goto _L6
_L6:
        bitstreamReady(l1, false, null, 0, 0, l3, ((OutputFrame) (obj1)).isEndOfStream(), ((OutputFrame) (obj1)).isTimedOut(), ((OutputFrame) (obj1)).isOutputFormatChanged());
_L10:
        ((OutputFrame) (obj1)).close();
        if (flag1) goto _L9; else goto _L8
_L7:
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() HW encoder should not drop continuouse for 5 seconds, it is a timeout").toString());
        }
        break MISSING_BLOCK_LABEL_675;
        consecutiveTimeOut = 0;
          goto _L10
        return 0;
        return 0;
    }

    public int restartEncoder(int i, float f)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED").toString());
        }
        return -10;
    }

    public int setBaseLayerPID(int i)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        try
        {
            encoder.setBaseLayerPID(i);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
        }
        catch (com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException apinotimplementedexception)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(apinotimplementedexception.getFailedApiName()).append("(").append(apinotimplementedexception.toString()).append(")").toString());
            }
            return -10;
        }
        return 0;
    }

    public int setBitrate(int i)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called bitrate:").append(i).append("kbps").toString());
        }
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED in API ").append(android.os.Build.VERSION.SDK_INT).toString());
            }
            return -10;
        }
        try
        {
            encoder.setBitrate(i * 1000);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (Log.isLoggable("SLIQ", 6))
            {
                Log.e("SLIQ", "Illegal argument value", illegalargumentexception);
            }
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_INCORRECT_PARAM").toString());
            }
            return -9;
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
            return -1;
        }
        return 0;
    }

    public int setFPS(float f)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        SurfaceObserver surfaceobserver;
        try
        {
            surfaceobserver = (SurfaceObserver)weakRefSurfaceObserver.get();
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
            return -1;
        }
        if (surfaceobserver == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() set targetFps to ").append(f).toString());
        }
        surfaceobserver.setTargetFrameRate(f);
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
        }
        return 0;
    }

    public int setLTRBufferControl(int i, boolean flag)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED").toString());
        }
        return -10;
    }

    public int setMaxNumRefFrames(int i)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED").toString());
        }
        return -10;
    }

    public int setNumTempLayers(int i)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        try
        {
            encoder.setNumTempLayers(i);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
        }
        catch (com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException apinotimplementedexception)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(apinotimplementedexception.getFailedApiName()).append("(").append(apinotimplementedexception.toString()).append(")").toString());
            }
            return -10;
        }
        return 0;
    }

    public int setProvideMADMetric(boolean flag)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED").toString());
        }
        return -10;
    }

    public int setSliceSize(int i, int j)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() failed: SLIQ_ERROR_NOT_IMPLEMENTED").toString());
        }
        return -10;
    }

    public int uninit(boolean flag)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        try
        {
            if (encoder == null)
            {
                break MISSING_BLOCK_LABEL_81;
            }
            encoder.stop();
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
            return -1;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        encoder.close();
        encoder = null;
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
        }
        return 0;
    }

    public int useLTRFrame(int i, boolean flag)
    {
        if (Log.isLoggable("SLIQ", 3))
        {
            Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() called").toString());
        }
        try
        {
            encoder.useLTRFrame(i);
            if (Log.isLoggable("SLIQ", 3))
            {
                Log.d("SLIQ", (new StringBuilder()).append(getClass().getCanonicalName()).append('#').append(DebugUtils.getMethodName()).append("() succeeded").toString());
            }
        }
        catch (com.skype.android.video.hw.codec.encoder.AbstractVideoEncoder.APINotImplementedException apinotimplementedexception)
        {
            if (Log.isLoggable("SLIQ", 4))
            {
                Log.i("SLIQ", (new StringBuilder()).append(apinotimplementedexception.getFailedApiName()).append("(").append(apinotimplementedexception.toString()).append(")").toString());
            }
            return -10;
        }
        return 0;
    }

    static 
    {
        DEFAULT_H264_LEVEL = H264Level.L31;
        DEFAULT_H264_PROFILE = H264Profile.BASELINE;
    }
}
