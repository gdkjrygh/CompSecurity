// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.util.Log;

public class VolumeController
{

    public static final String EXTRA_PREV_VOLUME_STREAM_VALUE = "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE";
    public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
    public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
    public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private static VolumeController e = null;
    private static long f = 0L;
    private final int a = 6;
    private final int b = 0;
    private Context c;
    private AudioManager d;
    private int g;
    private final BroadcastReceiver h = new BroadcastReceiver() {

        final VolumeController a;

        public void onReceive(Context context1, Intent intent)
        {
            boolean flag = false;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
            int i;
            int j;
            int k;
            i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
            j = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
            k = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
            if (i == -1) goto _L4; else goto _L3
_L3:
            if (Log.isLoggable("DLAudioJava", 4))
            {
                Log.i("DLAudioJava", (new StringBuilder("BroadcastReceiver:onReceive streamType=")).append(i).append(", newVolLevel=").append(j).append(", oldVolLevel=").append(k).append(", maxVolume=").append(VolumeController.a(a).getStreamMaxVolume(i)).toString());
            }
_L6:
            if (j != k)
            {
                if (j == 0)
                {
                    flag = true;
                }
                VolumeController.a(a, flag);
            }
_L2:
            return;
_L4:
            if (Log.isLoggable("DLAudioJava", 6))
            {
                Log.e("DLAudioJava", "BroadcastReceiver:onReceive: failed to get stream type.");
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

            
            {
                a = VolumeController.this;
                super();
            }
    };

    public VolumeController(Context context)
    {
        c = null;
        g = 0;
        d = (AudioManager)context.getSystemService("audio");
        c = context;
        if (e == null)
        {
            e = this;
        }
    }

    private int a()
    {
        byte byte0 = 0;
        boolean flag;
        if (d.isBluetoothScoOn())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            byte0 = 6;
        }
        return byte0;
    }

    static AudioManager a(VolumeController volumecontroller)
    {
        return volumecontroller.d;
    }

    static void a(VolumeController volumecontroller, boolean flag)
    {
        volumecontroller.a(flag);
    }

    private void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (f != 0L)
        {
            if (Log.isLoggable("DLAudioJava", 4))
            {
                Log.i("DLAudioJava", "onVolumeChange triggered");
            }
            onVolumeChange(f, flag);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private static native void onVolumeChange(long l, boolean flag);

    public int getStreamMaxVolume()
    {
        return d.getStreamMaxVolume(a());
    }

    public int getStreamVolume()
    {
        return d.getStreamVolume(a());
    }

    public boolean isStreamMuted()
    {
        return getStreamVolume() == 0;
    }

    public void registerNativeInstance(long l)
    {
        this;
        JVM INSTR monitorenter ;
        f = l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void registerVolumeIntentReceiver()
    {
        IntentFilter intentfilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        c.registerReceiver(h, intentfilter);
    }

    public void setMute(boolean flag)
    {
        if (flag && !isStreamMuted())
        {
            g = getStreamVolume();
            setStreamVolume(0);
        }
        if (!flag && isStreamMuted())
        {
            setStreamVolume(g);
        }
    }

    public void setStreamVolume(int i)
    {
        int k = getStreamMaxVolume();
        int j = i;
        if (i > k)
        {
            j = k;
        }
        d.setStreamVolume(a(), j, 1);
    }

    public void unregisterNativeInstance()
    {
        this;
        JVM INSTR monitorenter ;
        f = 0L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void unregisterVolumeIntentReceiver()
    {
        c.unregisterReceiver(h);
    }

}
