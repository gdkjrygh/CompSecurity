// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;

// Referenced classes of package org.webrtc.voiceengine:
//            WebRtcAudioUtils

class WebRtcAudioManager
{

    private static final String AUDIO_MODES[] = {
        "MODE_NORMAL", "MODE_RINGTONE", "MODE_IN_CALL", "MODE_IN_COMMUNICATION"
    };
    private static final int BITS_PER_SAMPLE = 16;
    private static final int CHANNELS = 1;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final int SAMPLE_RATE_HZ = 44100;
    private static final String TAG = "WebRtcAudioManager";
    private final AudioManager audioManager;
    private int channels;
    private final Context context;
    private boolean hardwareAEC;
    private boolean initialized;
    private int inputBufferSize;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int sampleRate;

    WebRtcAudioManager(Context context1, long l)
    {
        initialized = false;
        Logd((new StringBuilder("ctor")).append(WebRtcAudioUtils.getThreadInfo()).toString());
        context = context1;
        nativeAudioManager = l;
        audioManager = (AudioManager)context1.getSystemService("audio");
        storeAudioParameters();
        nativeCacheAudioParameters(sampleRate, channels, hardwareAEC, lowLatencyOutput, outputBufferSize, inputBufferSize, l);
    }

    private static void Logd(String s)
    {
    }

    private static void Loge(String s)
    {
    }

    private static void assertTrue(boolean flag)
    {
        if (!flag)
        {
            throw new AssertionError("Expected condition to be true");
        } else
        {
            return;
        }
    }

    private void dispose()
    {
        Logd((new StringBuilder("dispose")).append(WebRtcAudioUtils.getThreadInfo()).toString());
        if (initialized);
    }

    private int getLowLatencyInputFramesPerBuffer()
    {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer()
    {
        assertTrue(isLowLatencyOutputSupported());
        String s;
        if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher())
        {
            if ((s = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER")) != null)
            {
                return Integer.parseInt(s);
            }
        }
        return 256;
    }

    private static int getMinInputFrameSize(int i, int j)
    {
        boolean flag = true;
        if (j != 1)
        {
            flag = false;
        }
        assertTrue(flag);
        return AudioRecord.getMinBufferSize(i, 16, 2) / (j << 1);
    }

    private static int getMinOutputFrameSize(int i, int j)
    {
        byte byte0;
        if (j == 1)
        {
            byte0 = 4;
        } else
        if (j == 2)
        {
            byte0 = 12;
        } else
        {
            return -1;
        }
        return AudioTrack.getMinBufferSize(i, byte0, 2) / (j << 1);
    }

    private int getNativeOutputSampleRate()
    {
        int j = 44100;
        int i;
        if (WebRtcAudioUtils.runningOnEmulator())
        {
            Logd("Running on old emulator, overriding sampling rate to 8 kHz.");
            i = 8000;
        } else
        {
            i = j;
            if (WebRtcAudioUtils.runningOnJellyBeanMR1OrHigher())
            {
                String s = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
                i = j;
                if (s != null)
                {
                    return Integer.parseInt(s);
                }
            }
        }
        return i;
    }

    private boolean hasEarpiece()
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init()
    {
        Logd((new StringBuilder("init")).append(WebRtcAudioUtils.getThreadInfo()).toString());
        if (initialized)
        {
            return true;
        } else
        {
            Logd((new StringBuilder("audio mode is: ")).append(AUDIO_MODES[audioManager.getMode()]).toString());
            initialized = true;
            return true;
        }
    }

    private static boolean isAcousticEchoCancelerSupported()
    {
        if (WebRtcAudioUtils.deviceIsBlacklistedForHwAecUsage())
        {
            Logd((new StringBuilder()).append(Build.MODEL).append(" is blacklisted for HW AEC usage!").toString());
            return false;
        } else
        {
            return WebRtcAudioUtils.isAcousticEchoCancelerSupported();
        }
    }

    private boolean isCommunicationModeEnabled()
    {
        return audioManager.getMode() == 3;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage()
    {
        boolean flag = WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (flag)
        {
            Loge((new StringBuilder()).append(Build.MODEL).append(" is blacklisted for OpenSL ES usage!").toString());
        }
        return flag;
    }

    private boolean isLowLatencyOutputSupported()
    {
        return isOpenSLESSupported() && context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isOpenSLESSupported()
    {
        return WebRtcAudioUtils.runningOnGingerBreadOrHigher();
    }

    private native void nativeCacheAudioParameters(int i, int j, boolean flag, boolean flag1, int k, int l, long l1);

    private void storeAudioParameters()
    {
        channels = 1;
        sampleRate = getNativeOutputSampleRate();
        hardwareAEC = isAcousticEchoCancelerSupported();
        lowLatencyOutput = isLowLatencyOutputSupported();
        int i;
        if (lowLatencyOutput)
        {
            i = getLowLatencyOutputFramesPerBuffer();
        } else
        {
            i = getMinOutputFrameSize(sampleRate, channels);
        }
        outputBufferSize = i;
        inputBufferSize = getMinInputFrameSize(sampleRate, channels);
    }

    public boolean isLowLatencyInputSupported()
    {
        return WebRtcAudioUtils.runningOnLollipopOrHigher() && isLowLatencyOutputSupported();
    }

}
