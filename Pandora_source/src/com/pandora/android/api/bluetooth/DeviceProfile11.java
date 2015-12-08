// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.api.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

// Referenced classes of package com.pandora.android.api.bluetooth:
//            DeviceProfile5

public class DeviceProfile11 extends DeviceProfile5
{

    public DeviceProfile11()
    {
    }

    public IntentFilter a()
    {
        IntentFilter intentfilter = super.a();
        intentfilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT");
        intentfilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        return intentfilter;
    }

    public void a(Context context, Intent intent, boolean flag)
    {
        if (intent.getAction().equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"))
        {
            if (intent.getExtras() == null)
            {
                return;
            }
            int i = intent.getExtras().getInt("android.bluetooth.profile.extra.STATE");
            int j = intent.getExtras().getInt("android.bluetooth.profile.extra.PREVIOUS_STATE");
            if (i == 0 && j == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        super.a(context, intent, flag);
    }

    public void a(Intent intent)
    {
        if (intent == null || !intent.getAction().equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"))
        {
            return;
        }
        if (intent.hasExtra("android.bluetooth.device.extra.DEVICE") && intent.hasExtra("android.bluetooth.profile.extra.STATE") && intent.getExtras().getInt("android.bluetooth.profile.extra.STATE") == 2)
        {
            a = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (a == null || a.getAddress() == null || a.getAddress().equals(""))
            {
                a(null);
                return;
            } else
            {
                a(a.getAddress());
                return;
            }
        } else
        {
            a = null;
            a(null);
            return;
        }
    }

    public void a(Intent intent, String s)
    {
        if (intent.getAction().equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"))
        {
            return;
        } else
        {
            super.a(intent, s);
            return;
        }
    }
}
