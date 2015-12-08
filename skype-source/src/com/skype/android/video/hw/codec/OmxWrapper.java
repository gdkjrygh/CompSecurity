// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.skype.android.video.hw.HWFeatureSelectiveFields;
import com.skype.android.video.hw.format.H264Level;
import com.skype.android.video.hw.format.H264Profile;
import com.skype.android.video.hw.utils.CodecUtils;
import com.skype.android.video.hw.utils.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.EnumSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OmxWrapper
    implements Closeable
{

    public static final int MAGIC_FAILURE_CONSTANT = -1;
    private static final Lock lock = new ReentrantLock(true);
    long driverVersion;
    final String dummyName;
    final String hwCodecName;
    final long nativeObj = createNativeOmxObject(this);
    int newNodeId;
    int oldNodeId;

    public OmxWrapper(String s, String s1)
    {
        driverVersion = 0L;
        hwCodecName = s;
        dummyName = s1;
    }

    private static native int configureEncoder(long l, int i, String s, int j, int k, int i1, int j1, 
            float f, int k1, int l1, int i2, int j2, int k2, int l2, 
            int i3, int j3, int k3, boolean flag);

    public static native long createNativeOmxObject(OmxWrapper omxwrapper);

    public static native void deleteNativeOmxObject(long l);

    private static native long getDecCapability(long l, int i);

    private static native long getEncCapability(long l, int i);

    public static native int incrementAndGetNodeId(String s, long l);

    private static native int markLtrFrame(long l, int i, int j);

    private void postAllocate()
    {
        newNodeId = -1;
        newNodeId = incrementAndGetNodeId(dummyName, nativeObj);
        Log.i("SLIQ", (new StringBuilder("new node ID: ")).append(newNodeId).toString());
        lock.unlock();
        return;
        Exception exception;
        exception;
        Log.i("SLIQ", (new StringBuilder("new node ID: ")).append(newNodeId).toString());
        lock.unlock();
        throw exception;
    }

    private void preAllocate()
    {
        lock.lock();
        oldNodeId = -1;
        oldNodeId = incrementAndGetNodeId(dummyName, nativeObj);
        Log.i("SLIQ", (new StringBuilder("old node ID: ")).append(oldNodeId).toString());
        return;
        Exception exception;
        exception;
        Log.i("SLIQ", (new StringBuilder("old node ID: ")).append(oldNodeId).toString());
        throw exception;
    }

    private static native int queryDriverVersion(long l, int i);

    private static native int queryDriverVersionAndCheckVerSystem(long l, int i);

    private static native int queryQpIndex(long l, int i, int j);

    private static native int setBaseLayerPID(long l, int i, int j);

    private static native int setDecoderLowLatencyMode(long l, int i);

    private static native int setNumTempLayers(long l, int i, int j);

    private static native int setQp(long l, int i, int j);

    private static native int setRcFrameRate(long l, int i, float f);

    private static native int useLTRFrame(long l, int i, int j);

    public void close()
        throws IOException
    {
        if (nativeObj != 0L)
        {
            deleteNativeOmxObject(nativeObj);
        }
    }

    public int configureDecoderLowLatency()
    {
        return setDecoderLowLatencyMode(nativeObj, getNodeId());
    }

    public int configureEncoder(MediaFormat mediaformat, int i, int j, int k, int l, int i1, boolean flag)
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Android_OMX))
        {
            int i2 = mediaformat.getInteger("color-format");
            int j2 = mediaformat.getInteger("width");
            int k2 = mediaformat.getInteger("height");
            int l2 = mediaformat.getInteger("bitrate");
            int i3 = mediaformat.getInteger("frame-rate");
            int j1;
            int k1;
            int l1;
            int j3;
            if (mediaformat.containsKey("i-frame-interval"))
            {
                j1 = mediaformat.getInteger("i-frame-interval");
            } else
            {
                j1 = 0;
            }
            if (mediaformat.containsKey("profile"))
            {
                k1 = mediaformat.getInteger("profile");
            } else
            {
                k1 = H264Profile.BASELINE.getOmxValue().intValue();
            }
            if (mediaformat.containsKey("level"))
            {
                l1 = mediaformat.getInteger("level");
            } else
            {
                l1 = H264Level.L3.getOmxValue().intValue();
            }
            j3 = CodecUtils.getHWModefromNative();
            return configureEncoder(nativeObj, getNodeId(), hwCodecName, i2, j2, k2, l2, i3, j1, k1, l1, i, j3, j, k, l, i1, flag);
        } else
        {
            Log.i("SLIQ", "EnableAndroidOMXFeature is false, thus will not configureEncoder via OMX");
            return 0;
        }
    }

    public MediaCodec createTracked()
    {
        MediaCodec mediacodec;
        preAllocate();
        mediacodec = MediaCodec.createByCodecName(hwCodecName);
        postAllocate();
        return mediacodec;
        Object obj;
        obj;
        ((IOException) (obj)).printStackTrace();
        postAllocate();
        return null;
        obj;
        postAllocate();
        throw obj;
    }

    public long getDecCapability()
    {
        return getDecCapability(nativeObj, getNodeId());
    }

    public long getDriverVersion()
    {
        return driverVersion;
    }

    public long getEncCapability()
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Skype_OMX_Extension))
        {
            return getEncCapability(nativeObj, getNodeId());
        } else
        {
            return 0L;
        }
    }

    public int getNodeId()
    {
        if (!isNodeIdKnown())
        {
            throw new IllegalStateException("Node ID not determined");
        } else
        {
            return oldNodeId + 1;
        }
    }

    public boolean isNodeIdKnown()
    {
        return oldNodeId != -1 && newNodeId != -1 && newNodeId - 1 == oldNodeId + 1;
    }

    public int markLtrFrame(int i)
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Skype_OMX_Extension))
        {
            return markLtrFrame(nativeObj, getNodeId(), i);
        } else
        {
            return 0;
        }
    }

    public int queryDriverVersion()
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Skype_OMX_Extension))
        {
            return queryDriverVersion(nativeObj, getNodeId());
        } else
        {
            return 0;
        }
    }

    public int queryDriverVersionAndCheckVerSystem()
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Skype_OMX_Extension))
        {
            return queryDriverVersionAndCheckVerSystem(nativeObj, getNodeId());
        } else
        {
            return 0;
        }
    }

    public int queryQpIndex()
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Skype_OMX_Extension))
        {
            return queryQpIndex(nativeObj, getNodeId(), 30);
        } else
        {
            return -1;
        }
    }

    public int setBaseLayerPID(int i)
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Skype_OMX_Extension))
        {
            return setBaseLayerPID(nativeObj, getNodeId(), i);
        } else
        {
            return 0;
        }
    }

    public int setDriverVersion(long l)
    {
        driverVersion = l;
        return 0;
    }

    public int setNumTempLayers(int i)
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Skype_OMX_Extension))
        {
            return setNumTempLayers(nativeObj, getNodeId(), i);
        } else
        {
            return 0;
        }
    }

    public int setQp(int i)
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Skype_OMX_Extension))
        {
            return setQp(nativeObj, getNodeId(), i);
        } else
        {
            return 0;
        }
    }

    public int setRcFrameRate(float f)
    {
        return setRcFrameRate(nativeObj, getNodeId(), f);
    }

    public int useLTRFrame(int i)
    {
        if (CodecUtils.getHWMode().contains(HWFeatureSelectiveFields.Skype_OMX_Extension))
        {
            return useLTRFrame(nativeObj, getNodeId(), i);
        } else
        {
            return 0;
        }
    }

}
