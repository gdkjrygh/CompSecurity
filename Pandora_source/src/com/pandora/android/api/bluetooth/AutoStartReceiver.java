// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.api.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pandora.android.fordsync.AppLinkBluetoothService;
import com.pandora.android.provider.b;
import com.pandora.radio.provider.f;
import p.cw.c;
import p.df.a;

// Referenced classes of package com.pandora.android.api.bluetooth:
//            BluetoothService

public class AutoStartReceiver extends BroadcastReceiver
{

    public AutoStartReceiver()
    {
    }

    private f a(Context context)
    {
        return b.a.b().x();
    }

    private void a(Context context, Intent intent)
    {
        String s = null;
        if (intent.hasExtra("android.bluetooth.device.extra.DEVICE"))
        {
            s = ((BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")).getName();
        }
        if (s != null && (s.contains("SYNC") || s.contains("Ford") || s.contains("Lincoln")))
        {
            a(context, "[AutoStart] ACTION_ACL_CONNECTED from SYNC");
            intent = new Intent(context, com/pandora/android/fordsync/AppLinkBluetoothService);
            intent.putExtra("DEVICE_ADDED", true);
            context.startService(intent);
        }
    }

    private void a(Context context, String s)
    {
        if (!a(context).a("DEBUG_LOGGING").booleanValue())
        {
            return;
        } else
        {
            p.df.a.c("PANDORA", s);
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        Object obj = intent.getAction();
        if (!((String) (obj)).equals("android.bluetooth.device.action.ACL_CONNECTED")) goto _L2; else goto _L1
_L1:
        p.cy.b.c().a(intent);
        a(context, intent);
_L4:
        return;
_L2:
        if ("android.intent.action.BOOT_COMPLETED".equals(obj))
        {
            a(context, "starting PandoraLink Bluetooth Service");
            context.startService(new Intent(context, com/pandora/android/api/bluetooth/BluetoothService));
            return;
        }
        if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        int i = intent.getExtras().getInt("android.bluetooth.adapter.extra.STATE");
        if (i == 13)
        {
            a(context, "Bluetooth disabled - stopping Pandora bluetooth services");
            b.a.a(context);
            return;
        }
        if (i == 12)
        {
            a(context, "Bluetooth enabled - starting Pandora bluetooth services");
            b.a.b(context);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!"android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        if (intent.getExtras() != null)
        {
            int j = intent.getExtras().getInt("android.media.extra.SCO_AUDIO_STATE");
            int j1 = intent.getExtras().getInt("android.media.extra.SCO_AUDIO_PREVIOUS_STATE");
            a(context, (new StringBuilder()).append("Bluetooth ACTION_SCO_AUDIO_STATE_UPDATED state=").append(j).append(" prevState=").append(j1).toString());
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!"android.bluetooth.intent.action.HEADSET_STATE_CHANGED".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        if (intent.getExtras() != null)
        {
            obj = intent.getExtras();
            ((Bundle) (obj)).size();
            int k = ((Bundle) (obj)).getInt("android.bluetooth.intent.HEADSET_STATE");
            p.cy.c c2 = p.cy.b.c();
            c2.a(intent);
            a(context, (new StringBuilder()).append("[AutoStart] Bluetooth HEADSET_STATE_CHANGED [").append(k).append("] extras: [").append(((Bundle) (obj)).toString()).append("]").toString());
            c2.a(context, intent, false);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (!"android.bluetooth.headset.action.STATE_CHANGED".equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        int l = intent.getExtras().getInt("android.bluetooth.headset.extra.STATE");
        obj = p.cy.b.c();
        ((p.cy.c) (obj)).a(intent);
        a(context, (new StringBuilder()).append("[AutoStart] Bluetooth headset STATE_CHANGED [").append(l).append("] ").append(((p.cy.c) (obj)).l()).toString());
        if (!b.a.u())
        {
            ((p.cy.c) (obj)).a(context, intent, false);
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(obj)) goto _L4; else goto _L7
_L7:
        a(context, intent);
        int i1 = intent.getExtras().getInt("android.bluetooth.adapter.extra.CONNECTION_STATE");
        p.cy.c c1 = p.cy.b.c();
        c1.a(intent);
        a(context, (new StringBuilder()).append("[AutoStart] Bluetooth CONNECTION_STATE_CHANGED [").append(i1).append("] ").append(c1.l()).toString());
        if (!b.a.u())
        {
            c1.a(context, intent, false);
            return;
        }
        if (true) goto _L4; else goto _L8
_L8:
    }
}
