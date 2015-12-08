// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.audio;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class BluetoothReceiver extends BroadcastReceiver
{
    public static interface Listener
    {

        public abstract void deviceConnected(BluetoothDevice bluetoothdevice);

        public abstract void deviceDisconnected(BluetoothDevice bluetoothdevice);

        public abstract void scoConnected();

        public abstract void scoDisconnected();
    }


    private static Set a = new CopyOnWriteArraySet();
    private static HashSet b = new HashSet();

    public BluetoothReceiver()
    {
    }

    public static Boolean a()
    {
        boolean flag;
        if (!b.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public static void a(Context context)
    {
        context = context.getApplicationContext();
        BluetoothAdapter bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothadapter != null && context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0)
        {
            android.bluetooth.BluetoothProfile.ServiceListener servicelistener = new android.bluetooth.BluetoothProfile.ServiceListener() {

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
                                ((Listener)iterator1.next()).deviceConnected(bluetoothdevice);
                            }
                        }
                    } while (true);
                    BluetoothAdapter.getDefaultAdapter().closeProfileProxy(i, bluetoothprofile);
                }

                public final void onServiceDisconnected(int i)
                {
                }

            };
            bluetoothadapter.getProfileProxy(context, servicelistener, 1);
            bluetoothadapter.getProfileProxy(context, servicelistener, 2);
        }
    }

    public static void a(Listener listener)
    {
        a.add(listener);
    }

    static HashSet b()
    {
        return b;
    }

    public static void b(Listener listener)
    {
        a.remove(listener);
    }

    static Set c()
    {
        return a;
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        if (intent != null)
        {
            context = intent.getAction();
        } else
        {
            context = null;
        }
        if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(context)) goto _L2; else goto _L1
_L1:
        intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0x80000000);
        JVM INSTR lookupswitch 3: default 64
    //                   -2147483648: 70
    //                   10: 70
    //                   13: 70;
           goto _L3 _L4 _L4 _L4
_L3:
        return;
_L4:
        b.clear();
        return;
_L2:
        if (!"android.bluetooth.device.action.ACL_CONNECTED".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        context = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (context == null || context.getBluetoothClass() == null) goto _L6; else goto _L5
_L5:
        context.getBluetoothClass().getDeviceClass();
        JVM INSTR lookupswitch 7: default 180
    //                   1028: 182
    //                   1032: 182
    //                   1044: 182
    //                   1048: 182
    //                   1052: 182
    //                   1056: 182
    //                   1064: 182;
           goto _L6 _L7 _L7 _L7 _L7 _L7 _L7 _L7
_L7:
        continue; /* Loop/switch isn't completed */
_L6:
        flag = false;
        if (!flag) goto _L3; else goto _L8
_L8:
        b.add(context);
        intent = a.iterator();
        while (intent.hasNext()) 
        {
            ((Listener)intent.next()).deviceConnected(context);
        }
        if (true) goto _L3; else goto _L9
_L9:
        if (!"android.bluetooth.device.action.ACL_DISCONNECTED".equals(context) && !"android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        context = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        b.remove(context);
        intent = a.iterator();
        while (intent.hasNext()) 
        {
            ((Listener)intent.next()).deviceDisconnected(context);
        }
        if (true) goto _L3; else goto _L10
_L10:
        if (!"android.media.SCO_AUDIO_STATE_CHANGED".equals(context))
        {
            flag1 = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(context);
        }
        if (!flag1) goto _L3; else goto _L11
_L11:
        intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", 0);
        switch (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0))
        {
        default:
            return;

        case -1: 
        case 0: // '\0'
            context = a.iterator();
            while (context.hasNext()) 
            {
                ((Listener)context.next()).scoDisconnected();
            }
            break;

        case 1: // '\001'
            for (context = a.iterator(); context.hasNext(); ((Listener)context.next()).scoConnected()) { }
            break;
        }
        if (true) goto _L3; else goto _L12
_L12:
    }

}
