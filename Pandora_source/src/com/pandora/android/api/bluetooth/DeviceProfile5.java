// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.api.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.pandora.android.provider.b;
import com.pandora.radio.provider.f;
import java.util.Hashtable;
import p.cy.c;
import p.df.a;

public class DeviceProfile5 extends c
{

    BluetoothDevice a;

    public DeviceProfile5()
    {
        a = null;
    }

    private String a(BluetoothDevice bluetoothdevice)
    {
        if (bluetoothdevice.getName() == null)
        {
            BluetoothDevice bluetoothdevice1 = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(b.x().b("BLUETOOTH_DEVICE_CONNECTED_ADDRESS"));
            if (bluetoothdevice1 != null)
            {
                a = bluetoothdevice1;
                return bluetoothdevice1.getName();
            }
        }
        return bluetoothdevice.getName();
    }

    public IntentFilter a()
    {
        IntentFilter intentfilter = super.a();
        intentfilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentfilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentfilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentfilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentfilter.addAction("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
        intentfilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.device.action.CLASS_CHANGED");
        intentfilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_CHANGED");
        return intentfilter;
    }

    String a(int j)
    {
        switch (j)
        {
        default:
            return (new StringBuilder()).append(j).append("").toString();

        case 10: // '\n'
            return "STATE_OFF";

        case 11: // '\013'
            return "STATE_TURNING_ON";

        case 12: // '\f'
            return "STATE_ON";

        case 13: // '\r'
            return "STATE_TURNING_OFF";
        }
    }

    public String a(BluetoothClass bluetoothclass)
    {
        if (bluetoothclass == null)
        {
            return "";
        }
        switch (bluetoothclass.getDeviceClass())
        {
        default:
            return (new StringBuilder()).append(bluetoothclass.getDeviceClass()).append("").toString();

        case 1032: 
            return "AUDIO_VIDEO_HANDSFREE";

        case 1028: 
            return "AUDIO_VIDEO_WEARABLE_HEADSET";

        case 268: 
            return "COMPUTER_LAPTOP";

        case 1076: 
            return "AUDIO_VIDEO_CAMCORDER";

        case 1056: 
            return "AUDIO_VIDEO_CAR_AUDIO";

        case 1048: 
            return "AUDIO_VIDEO_HEADPHONES";

        case 1064: 
            return "AUDIO_VIDEO_HIFI_AUDIO";

        case 1044: 
            return "AUDIO_VIDEO_LOUDSPEAKER";

        case 1040: 
            return "AUDIO_VIDEO_MICROPHONE";

        case 1052: 
            return "AUDIO_VIDEO_PORTABLE_AUDIO";

        case 1060: 
            return "AUDIO_VIDEO_SET_TOP_BOX";

        case 1024: 
            return "AUDIO_VIDEO_UNCATEGORIZED";

        case 1068: 
            return "AUDIO_VIDEO_VCR";

        case 1072: 
            return "AUDIO_VIDEO_VIDEO_CAMERA";

        case 1088: 
            return "AUDIO_VIDEO_VIDEO_CONFERENCING";

        case 1084: 
            return "AUDIO_VIDEO_VIDEO_DISPLAY_AND_LOUDSPEAKER";

        case 1096: 
            return "AUDIO_VIDEO_VIDEO_GAMING_TOY";

        case 1080: 
            return "AUDIO_VIDEO_VIDEO_MONITOR";

        case 272: 
            return "COMPUTER_HANDHELD_PC_PDA";

        case 260: 
            return "COMPUTER_DESKTOP";

        case 276: 
            return "COMPUTER_PALM_SIZE_PC_PDA";

        case 264: 
            return "COMPUTER_SERVER";

        case 256: 
            return "COMPUTER_UNCATEGORIZED";

        case 280: 
            return "COMPUTER_WEARABLE";

        case 516: 
            return "PHONE_CELLULAR";

        case 520: 
            return "PHONE_CORDLESS";

        case 532: 
            return "PHONE_ISDN";

        case 528: 
            return "PHONE_MODEM_OR_GATEWAY";

        case 524: 
            return "PHONE_SMART";

        case 512: 
            return "PHONE_UNCATEGORIZED";
        }
    }

    public void a(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (!s.equals("android.bluetooth.adapter.action.STATE_CHANGED")) goto _L2; else goto _L1
_L1:
        if (intent.getExtras() != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        int j = intent.getExtras().getInt("android.bluetooth.adapter.extra.STATE");
        a(intent, intent.getExtras().toString());
        if (j == 13 || j == 10)
        {
            p.df.a.c("DeviceProfile5", "bluetooth turned off");
            if (b.a.b().C())
            {
                p.df.a.c("DeviceProfile5", "accessory is connected, lost bluetooth, pause audio");
                if (b.a.b() != null)
                {
                    b.a.b().d().b(p.cw.b.c.b);
                }
            }
            i();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("android.bluetooth.adapter.action.SCAN_MODE_CHANGED"))
        {
            if (intent.getExtras() != null)
            {
                int k = intent.getExtras().getInt("android.bluetooth.adapter.extra.SCAN_MODE");
                if (k == 20)
                {
                    p.df.a.c("DeviceProfile5", "scan mode - not available");
                    return;
                }
                if (k == 21)
                {
                    p.df.a.c("DeviceProfile5", "scan mode - connectable");
                    return;
                }
                if (k == 23)
                {
                    p.df.a.c("DeviceProfile5", "scan mode - connectable and discoverable");
                    return;
                }
            }
        } else
        {
            super.a(context, intent);
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void a(Intent intent)
    {
        if (intent != null && intent.hasExtra("android.bluetooth.device.extra.DEVICE"))
        {
            a = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (a == null || a.getAddress() == null || a.getAddress().equals(""))
            {
                a(((String) (null)));
                return;
            } else
            {
                a(a.getAddress());
                return;
            }
        } else
        {
            a = null;
            a(((String) (null)));
            return;
        }
    }

    public void a(Intent intent, String s)
    {
        String s2 = intent.getAction();
        if (s2.equals("android.bluetooth.headset.action.STATE_CHANGED") || s2.equals("android.bluetooth.intent.action.HEADSET_STATE_CHANGED"))
        {
            return;
        }
        String s1 = s;
        if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(s2))
        {
            s1 = s;
            if (intent.getExtras() != null)
            {
                int j = intent.getExtras().getInt("android.bluetooth.adapter.extra.STATE");
                s = new StringBuffer();
                s.append("android.bluetooth.adapter.extra.STATE");
                s.append("=");
                s.append(a(j));
                s1 = s.toString();
            }
        }
        super.a(intent, s1);
    }

    public String b()
    {
        BluetoothDevice bluetoothdevice = f();
        if (bluetoothdevice != null)
        {
            return a(bluetoothdevice);
        } else
        {
            return null;
        }
    }

    public String b(BluetoothClass bluetoothclass)
    {
        if (bluetoothclass == null)
        {
            return "";
        }
        switch (bluetoothclass.getMajorDeviceClass())
        {
        default:
            return (new StringBuilder()).append(bluetoothclass.getMajorDeviceClass()).append("").toString();

        case 1024: 
            return "AUDIO_VIDEO";

        case 256: 
            return "COMPUTER";

        case 2304: 
            return "HEALTH";

        case 1536: 
            return "IMAGING";

        case 0: // '\0'
            return "MISC";

        case 768: 
            return "NETWORKING";

        case 1280: 
            return "PERIPHERAL";

        case 512: 
            return "PHONE";

        case 2048: 
            return "TOY";

        case 7936: 
            return "UNCATEGORIZED";

        case 1792: 
            return "WEARABLE";
        }
    }

    public String c()
    {
        BluetoothDevice bluetoothdevice = f();
        if (bluetoothdevice != null)
        {
            return a(bluetoothdevice.getBluetoothClass());
        } else
        {
            return null;
        }
    }

    public String d()
    {
        BluetoothDevice bluetoothdevice = f();
        if (bluetoothdevice != null)
        {
            return b(bluetoothdevice.getBluetoothClass());
        } else
        {
            return null;
        }
    }

    public String e()
    {
        BluetoothDevice bluetoothdevice = f();
        if (bluetoothdevice != null)
        {
            return bluetoothdevice.getAddress();
        } else
        {
            return null;
        }
    }

    BluetoothDevice f()
    {
        if (a != null)
        {
            return a;
        } else
        {
            return g();
        }
    }

    BluetoothDevice g()
    {
        String s = b.x().b("BLUETOOTH_DEVICE_CONNECTED_ADDRESS");
        if (s != null)
        {
            return BluetoothAdapter.getDefaultAdapter().getRemoteDevice(s);
        } else
        {
            return null;
        }
    }

    public Hashtable h()
    {
        Object obj = f();
        if (obj == null)
        {
            return null;
        }
        Hashtable hashtable = new Hashtable();
        BluetoothClass bluetoothclass = ((BluetoothDevice) (obj)).getBluetoothClass();
        String s = a(((BluetoothDevice) (obj)));
        obj = ((BluetoothDevice) (obj)).getAddress();
        if (s == null)
        {
            s = "";
        }
        hashtable.put("name", s);
        if (bluetoothclass != null)
        {
            s = a(bluetoothclass);
        } else
        {
            s = "";
        }
        hashtable.put("device", s);
        if (bluetoothclass != null)
        {
            s = b(bluetoothclass);
        } else
        {
            s = "";
        }
        hashtable.put("major", s);
        if (obj != null)
        {
            s = ((String) (obj));
        } else
        {
            s = "";
        }
        hashtable.put("addr", s);
        return hashtable;
    }

    protected void i()
    {
        a = null;
        a(((String) (null)));
    }
}
