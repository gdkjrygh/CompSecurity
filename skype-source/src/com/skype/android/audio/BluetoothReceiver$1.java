// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.skype.android.audio:
//            BluetoothReceiver

static final class stener
    implements android.bluetooth.viceListener
{

    public final void onServiceConnected(int i, BluetoothProfile bluetoothprofile)
    {
        Iterator iterator = bluetoothprofile.getConnectedDevices().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            BluetoothDevice bluetoothdevice = (BluetoothDevice)iterator.next();
            if (BluetoothReceiver.b().add(bluetoothdevice))
            {
                Iterator iterator1 = BluetoothReceiver.c().iterator();
                while (iterator1.hasNext()) 
                {
                    ((stener)iterator1.next()).deviceConnected(bluetoothdevice);
                }
            }
        } while (true);
        BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i, bluetoothprofile);
    }

    public final void onServiceDisconnected(int i)
    {
    }

    stener()
    {
    }
}
