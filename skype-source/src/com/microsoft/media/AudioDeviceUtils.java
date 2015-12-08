// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioManager;
import android.util.Log;

// Referenced classes of package com.microsoft.media:
//            AudioPal

public class AudioDeviceUtils
{

    public static final int JDeviceType_Add = 4;
    public static final int JDeviceType_Removed = 8;
    public static final int JEndpointType_Bluetooth = 4;
    public static final int JEndpointType_Loudspeaker = 1;
    public static final int JEndpointType_NonLoudspeaker = 2;
    private static final String TAG = "AudioDeviceUtils";
    private BluetoothAdapter m_adapter;
    private AudioManager m_audioManager;
    private Context m_context;
    private boolean m_headsetWithMic;
    private int m_nativePlatform;
    private Runnable m_volumeChangeTask;

    public AudioDeviceUtils(Context context)
    {
        m_audioManager = null;
        m_context = null;
        m_adapter = null;
        m_nativePlatform = 0;
        m_headsetWithMic = false;
        m_volumeChangeTask = new Runnable() {

            final AudioDeviceUtils this$0;

            public void run()
            {
                AudioPal.onVolumeChange();
            }

            
            {
                this$0 = AudioDeviceUtils.this;
                super();
            }
        };
        m_audioManager = (AudioManager)context.getSystemService("audio");
        try
        {
            m_adapter = BluetoothAdapter.getDefaultAdapter();
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("AudioDeviceUtils", "Exception caught", runtimeexception);
            m_adapter = null;
        }
        m_context = context;
    }

    private static native int onActiveEndpointChange(int i, int j);

    private static native void onDeviceChange(int i, int j);

    public int getWiredHeadsetConnectionState()
    {
        if (m_audioManager.isWiredHeadsetOn())
        {
            return !m_headsetWithMic ? 2 : 1;
        } else
        {
            return 0;
        }
    }

    public boolean isBluetoothHeadsetConnected()
    {
        if (m_adapter != null)
        {
            int i = m_adapter.getProfileConnectionState(1);
            if (i == 2 || i == 1)
            {
                return true;
            }
        }
        return false;
    }

    public int onActiveEndpointChange(int i)
    {
        if (m_nativePlatform != 0)
        {
            return onActiveEndpointChange(m_nativePlatform, i);
        } else
        {
            return 0;
        }
    }

    public void onDeviceChange(int i)
    {
        if (m_nativePlatform != 0)
        {
            onDeviceChange(m_nativePlatform, i);
        }
    }

    public void registerPlatform(int i)
    {
        m_nativePlatform = i;
    }

    public void restoreSpeakerMode()
    {
    }

    public void setHeadsetWithMicStatus(boolean flag)
    {
        m_headsetWithMic = flag;
    }

    public void setMode(int i)
    {
    }

    public void setModeForTestingOnly(int i)
    {
        m_audioManager.setMode(i);
    }

    public void turnOnBluetoothHeadset(boolean flag)
    {
    }

    public void turnOnSpeaker(boolean flag)
    {
    }

    public void unregisterPlatform()
    {
        m_nativePlatform = 0;
    }
}
