// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import java.util.Set;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            MediaCodec, MediaCodecNull, DeviceCapabilities

abstract class XWalkMediaCodec
{
    protected class AudioCodecElement
    {

        public String codecName;
        final XWalkMediaCodec this$0;

        public boolean equals(Object obj)
        {
            return codecName.equals(((AudioCodecElement)obj).codecName);
        }

        public int hashCode()
        {
            return codecName.hashCode();
        }

        public AudioCodecElement(String s)
        {
            this$0 = XWalkMediaCodec.this;
            super();
            codecName = s;
        }
    }

    protected class VideoCodecElement
    {

        public String codecName;
        public boolean hwAccel;
        public boolean isEncoder;
        final XWalkMediaCodec this$0;

        public boolean equals(Object obj)
        {
            return codecName.equals(((VideoCodecElement)obj).codecName) && isEncoder == ((VideoCodecElement)obj).isEncoder && hwAccel == ((VideoCodecElement)obj).hwAccel;
        }

        public int hashCode()
        {
            return codecName.hashCode();
        }

        public VideoCodecElement(String s, boolean flag, boolean flag1)
        {
            this$0 = XWalkMediaCodec.this;
            super();
            codecName = s;
            isEncoder = flag;
            hwAccel = flag1;
        }
    }


    protected static final String AUDIO_CODEC_NAMES[] = {
        "ALAC", "MP3", "AMRNB", "AMRWB", "AAC", "G711", "VORBIS", "WMA", "FLAC", "OPUS"
    };
    private static final String TAG = "XWalkMediaCodec";
    protected static final String VIDEO_CODEC_NAMES[] = {
        "H263", "H264", "MPEG4", "AVC", "WMV", "VP8", "Theora"
    };
    protected Set mAudioCodecsSet;
    protected DeviceCapabilities mDeviceCapabilities;
    protected Set mVideoCodecsSet;

    XWalkMediaCodec()
    {
    }

    public static XWalkMediaCodec Create(DeviceCapabilities devicecapabilities)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new MediaCodec(devicecapabilities);
        } else
        {
            return new MediaCodecNull(devicecapabilities);
        }
    }

    public abstract JSONObject getCodecsInfo();

}
