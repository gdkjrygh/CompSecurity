// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import com.spotify.mobile.android.spotlets.applink.service.AppLinkService;
import com.spotify.mobile.android.spotlets.appprotocol.service.AppProtocolBluetoothService;
import com.spotify.mobile.android.util.Assertion;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class BluetoothServiceManager extends BroadcastReceiver
{

    private static boolean a;

    public BluetoothServiceManager()
    {
    }

    public static void a(Context context)
    {
        if (a())
        {
            context.startService(new Intent(context, com/spotify/mobile/android/spotlets/applink/service/AppLinkService));
        }
        if (AppProtocolBluetoothService.a(BluetoothAdapter.getDefaultAdapter()))
        {
            context.startService(new Intent(context, com/spotify/mobile/android/spotlets/appprotocol/service/AppProtocolBluetoothService));
        }
    }

    private static boolean a()
    {
        long l = Binder.clearCallingIdentity();
        Object obj = BluetoothAdapter.getDefaultAdapter();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = Collections.emptySet();
_L3:
        obj = ((Set) (obj)).iterator();
        boolean flag;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_89;
            }
            flag = a((BluetoothDevice)((Iterator) (obj)).next());
        } while (!flag);
        Binder.restoreCallingIdentity(l);
        return true;
_L2:
label0:
        {
            if (((BluetoothAdapter) (obj)).isEnabled())
            {
                break label0;
            }
            obj = Collections.emptySet();
        }
          goto _L3
        Set set = ((BluetoothAdapter) (obj)).getBondedDevices();
        obj = set;
        if (set != null) goto _L3; else goto _L4
_L4:
        obj = Collections.emptySet();
          goto _L3
        Binder.restoreCallingIdentity(l);
        return false;
        Object obj1;
        obj1;
        if (!a)
        {
            a = true;
            Assertion.a("Permission problem using Bluetooth", ((Throwable) (obj1)));
        }
        Binder.restoreCallingIdentity(l);
        return false;
        obj1;
        Binder.restoreCallingIdentity(l);
        throw obj1;
    }

    private static boolean a(BluetoothDevice bluetoothdevice)
    {
        while (bluetoothdevice == null || bluetoothdevice.getName() == null) 
        {
            return false;
        }
        return String.valueOf(bluetoothdevice.getName()).contains("SYNC");
    }

    public static void b(Context context)
    {
        context.stopService(new Intent(context, com/spotify/mobile/android/spotlets/applink/service/AppLinkService));
        context.stopService(new Intent(context, com/spotify/mobile/android/spotlets/appprotocol/service/AppProtocolBluetoothService));
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        boolean flag;
        flag = true;
        intent.getAction();
        s = intent.getAction();
        if (!"android.bluetooth.device.action.ACL_CONNECTED".equals(s)) goto _L2; else goto _L1
_L1:
        intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        a(context);
_L4:
        return;
_L2:
        if (!"android.bluetooth.device.action.ACL_DISCONNECTED".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (intent != null && a(intent))
        {
            context.stopService(new Intent(context, com/spotify/mobile/android/spotlets/applink/service/AppLinkService));
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(s)) goto _L4; else goto _L3
_L3:
        if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1) != 13)
        {
            flag = false;
        }
        if (flag)
        {
            b(context);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
