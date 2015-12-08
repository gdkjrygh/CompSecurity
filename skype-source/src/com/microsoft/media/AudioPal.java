// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import android.content.Context;
import android.util.Log;

// Referenced classes of package com.microsoft.media:
//            AudioVolumeListener, AudioDeviceUtils

public class AudioPal
{

    private static final String TAG = "AudioPal";
    private static AudioDeviceUtils m_audioDeviceUtil = null;
    private static AudioVolumeListener m_volumeListener = null;

    public AudioPal()
    {
    }

    private static int getStreamMaxVolume(int i)
    {
        return m_volumeListener.getStreamMaxVolume(i);
    }

    private static int getStreamVolume(int i)
    {
        return m_volumeListener.getStreamVolume(i);
    }

    private static int getWiredHeadsetConnectionState()
    {
        return m_audioDeviceUtil.getWiredHeadsetConnectionState();
    }

    public static boolean initialize(Context context)
    {
        if (m_volumeListener == null)
        {
            m_volumeListener = new AudioVolumeListener(context);
        }
        if (m_audioDeviceUtil == null)
        {
            m_audioDeviceUtil = new AudioDeviceUtils(context);
        }
        return true;
    }

    private static boolean isBluetoothHeadsetConnected()
    {
        return m_audioDeviceUtil.isBluetoothHeadsetConnected();
    }

    public static int onActiveEndpointChange(int i)
    {
        if (m_audioDeviceUtil != null)
        {
            return m_audioDeviceUtil.onActiveEndpointChange(i);
        } else
        {
            return 0;
        }
    }

    public static void onDeviceChange(int i)
    {
        if (m_audioDeviceUtil != null)
        {
            m_audioDeviceUtil.onDeviceChange(i);
        }
    }

    public static void onHeadsetWithMicStatusChange(boolean flag)
    {
        if (m_audioDeviceUtil != null)
        {
            m_audioDeviceUtil.setHeadsetWithMicStatus(flag);
        }
    }

    public static void onVolumeChange()
    {
        if (m_volumeListener != null)
        {
            m_volumeListener.onVolumeChange();
        }
    }

    private static void registerDevice(int i)
    {
        m_volumeListener.registerDevice(i);
    }

    private static void registerPlatform(int i)
    {
        m_audioDeviceUtil.registerPlatform(i);
    }

    public static void registerReceiver()
    {
        if (m_volumeListener != null)
        {
            m_volumeListener.registerReceiver();
            return;
        } else
        {
            Log.e("AudioPal", "AudioVolumeListener is null");
            return;
        }
    }

    private static void restoreAudioMode()
    {
        m_audioDeviceUtil.setMode(0);
    }

    private static void restoreSpeakerMode()
    {
        m_audioDeviceUtil.restoreSpeakerMode();
    }

    private static void setAudioCommunicationMode()
    {
        m_audioDeviceUtil.setMode(3);
    }

    public static void setAudioModeForTestingOnly(int i)
    {
        if (i >= 0 && i <= 3)
        {
            m_audioDeviceUtil.setModeForTestingOnly(i);
        }
    }

    private static void turnOnBluetoothHeadset(boolean flag)
    {
        m_audioDeviceUtil.turnOnBluetoothHeadset(flag);
    }

    private static void turnOnSpeaker(boolean flag)
    {
        m_audioDeviceUtil.turnOnSpeaker(flag);
    }

    private static void unregisterDevice()
    {
        m_volumeListener.unregisterDevice();
    }

    private static void unregisterPlatform()
    {
        m_audioDeviceUtil.unregisterPlatform();
    }

    public static void unregisterReceiver()
    {
        if (m_volumeListener != null)
        {
            m_volumeListener.unregisterReceiver();
        }
    }

}
