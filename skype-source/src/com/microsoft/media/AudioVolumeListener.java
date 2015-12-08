// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.util.Log;

public class AudioVolumeListener
{

    public static final String EXTRA_PREV_VOLUME_STREAM_VALUE = "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE";
    public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
    public static final int STREAM_BLUETOOTH_SCO = 6;
    private static final String TAG = "AudioVolumeListener";
    public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() {

        final AudioVolumeListener this$0;

        public void onReceive(Context context1, Intent intent)
        {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()))
            {
                int i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
                int j = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                int k = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
                if (i != -1)
                {
                    Log.i("AudioVolumeListener", (new StringBuilder("BroadcastReceiver:onReceive streamType=")).append(i).append(", newVolLevel=").append(j).append(", oldVolLevel=").append(k).append(", maxVolume=").append(m_audioManager.getStreamMaxVolume(i)).toString());
                } else
                {
                    Log.e("AudioVolumeListener", "BroadcastReceiver:onReceive: failed to get stream type.");
                }
                if (j != k)
                {
                    onVolumeChange();
                }
            }
        }

            
            {
                this$0 = AudioVolumeListener.this;
                super();
            }
    };
    private AudioManager m_audioManager;
    private Context m_context;
    private int m_nativeRenderDevice;

    public AudioVolumeListener(Context context)
    {
        m_context = null;
        m_audioManager = null;
        m_nativeRenderDevice = 0;
        m_audioManager = (AudioManager)context.getSystemService("audio");
        m_context = context;
    }

    private static native void onVolumeChange(int i);

    public int getStreamMaxVolume(int i)
    {
        if (m_audioManager.isBluetoothScoOn())
        {
            return m_audioManager.getStreamMaxVolume(6);
        } else
        {
            return m_audioManager.getStreamMaxVolume(i);
        }
    }

    public int getStreamVolume(int i)
    {
        if (m_audioManager.isBluetoothScoOn())
        {
            return m_audioManager.getStreamVolume(6);
        } else
        {
            return m_audioManager.getStreamVolume(i);
        }
    }

    public void onVolumeChange()
    {
        this;
        JVM INSTR monitorenter ;
        if (m_nativeRenderDevice != 0)
        {
            Log.i("AudioVolumeListener", "onVolumeChange triggered");
            onVolumeChange(m_nativeRenderDevice);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void registerDevice(int i)
    {
        this;
        JVM INSTR monitorenter ;
        m_nativeRenderDevice = i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void registerReceiver()
    {
        IntentFilter intentfilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        m_context.registerReceiver(mReceiver, intentfilter);
    }

    public void unregisterDevice()
    {
        this;
        JVM INSTR monitorenter ;
        m_nativeRenderDevice = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void unregisterReceiver()
    {
        m_context.unregisterReceiver(mReceiver);
    }

}
