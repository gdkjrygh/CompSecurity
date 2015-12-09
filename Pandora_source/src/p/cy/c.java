// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Bundle;
import com.pandora.radio.provider.f;
import com.pandora.radio.util.NetworkUtil;
import java.util.Hashtable;
import p.dd.af;
import p.df.a;

// Referenced classes of package p.cy:
//            b

public class c
{

    protected final p.cw.c b;

    public c()
    {
        b = p.cw.c.z;
    }

    public IntentFilter a()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.bluetooth.a2dp.action.SINK_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.a2dp.intent.action.SINK_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.headset.action.STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.headset.action.AUDIO_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.intent.action.HEADSET_STATE_CHANGED");
        intentfilter.addAction("android.bluetooth.intent.action.REMOTE_DEVICE_CONNECTED");
        intentfilter.addAction("android.bluetooth.intent.action.REMOTE_DEVICE_DISCONNECTED");
        return intentfilter;
    }

    public void a(Context context, Intent intent)
    {
        if (intent.getExtras() == null)
        {
            return;
        }
        try
        {
            Bundle bundle = intent.getExtras();
            bundle.size();
            a(intent);
            a(intent, bundle.toString());
            a(context, intent, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p.df.a.b("DeviceProfile", "unable to listen for bluetooth events. bluetooth not supported.");
        }
        return;
    }

    public void a(Context context, Intent intent, boolean flag)
    {
        boolean flag1 = true;
        context = intent.getAction();
        if (intent.getExtras() != null)
        {
            if (b.C())
            {
                p.df.a.c("DeviceProfile", "[Bluetooth] Accessory Connected - Ignoring bluetooth events....");
                return;
            }
            if (context.equals("android.bluetooth.headset.action.STATE_CHANGED"))
            {
                if (intent.getExtras().getInt("android.bluetooth.headset.extra.STATE") == 0)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            } else
            if (context.equals("android.bluetooth.intent.action.HEADSET_STATE_CHANGED"))
            {
                flag = flag1;
                if (intent.getExtras().getInt("android.bluetooth.intent.HEADSET_STATE") != 0)
                {
                    flag = false;
                }
            }
            if (flag)
            {
                i();
                b.a(new af());
                return;
            }
        }
    }

    public void a(Intent intent)
    {
    }

    public void a(Intent intent, String s)
    {
        String s1 = s;
        if ("android.bluetooth.a2dp.action.SINK_STATE_CHANGED".equals(intent.getAction()))
        {
            s1 = s;
            if (intent.getExtras() != null)
            {
                s = new StringBuffer();
                s.append("android.bluetooth.a2dp.extra.PREVIOUS_STATE=");
                s.append(b(intent.getExtras().getInt("android.bluetooth.a2dp.extra.PREVIOUS_STATE")));
                s.append(", android.bluetooth.a2dp.extra.SINK_STATE=");
                s.append(b(intent.getExtras().getInt("android.bluetooth.a2dp.extra.SINK_STATE")));
                s1 = s.toString();
            }
        }
        a(intent);
        p.df.a.c("DeviceProfile", (new StringBuilder()).append("[DeviceProfile] ").append(intent.getAction()).append(" extras:[").append(s1).append("] audioPath:").append(k()).append(" ").append(l()).toString());
    }

    public void a(String s)
    {
        if (s != null)
        {
            b.x().a("BLUETOOTH_DEVICE_CONNECTED_ADDRESS", s);
            return;
        } else
        {
            b.x().c("BLUETOOTH_DEVICE_CONNECTED_ADDRESS");
            return;
        }
    }

    public String b()
    {
        return null;
    }

    protected String b(int i1)
    {
        switch (i1)
        {
        default:
            return (new StringBuilder()).append(i1).append("").toString();

        case 0: // '\0'
            return (new StringBuilder()).append("[").append(i1).append("] STATE_DISCONNECTED").toString();

        case 1: // '\001'
            return (new StringBuilder()).append("[").append(i1).append("] STATE_CONNECTING").toString();

        case 2: // '\002'
            return (new StringBuilder()).append("[").append(i1).append("] STATE_CONNECTED").toString();

        case 3: // '\003'
            return (new StringBuilder()).append("[").append(i1).append("] STATE_DISCONNECTING").toString();

        case 4: // '\004'
            return (new StringBuilder()).append("[").append(i1).append("] STATE_PLAYING").toString();
        }
    }

    public String c()
    {
        return null;
    }

    public String d()
    {
        return null;
    }

    public String e()
    {
        return null;
    }

    public Hashtable h()
    {
        if (e() == null)
        {
            return null;
        } else
        {
            Hashtable hashtable = new Hashtable();
            hashtable.put("name", b());
            hashtable.put("device", c());
            hashtable.put("major", d());
            hashtable.put("addr", e());
            return hashtable;
        }
    }

    protected void i()
    {
    }

    public String j()
    {
        if (b.u().c())
        {
            return "wifi";
        } else
        {
            return "mobile";
        }
    }

    public String k()
    {
        if (((AudioManager)b.s().getSystemService("audio")).isBluetoothA2dpOn())
        {
            return "BLUETOOTH";
        }
        if (((AudioManager)b.s().getSystemService("audio")).isWiredHeadsetOn())
        {
            return "HEADSET";
        } else
        {
            return "SPEAKER_PHONE";
        }
    }

    public String l()
    {
        return (new StringBuilder()).append("bluetoothDevice:").append(h()).toString();
    }

    public BroadcastReceiver m()
    {
        return new BroadcastReceiver() {

            final c a;

            public void onReceive(Context context, Intent intent)
            {
                try
                {
                    p.cy.b.c().a(context, intent);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    p.df.a.b("DeviceProfile", "Error processing bluetooth events.", context);
                }
            }

            
            {
                a = c.this;
                super();
            }
        };
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("deviceProfile:{");
        stringbuffer.append("osVersion:");
        stringbuffer.append(com.pandora.radio.data.f.j());
        stringbuffer.append(", appVersion:");
        stringbuffer.append(b.l().b());
        stringbuffer.append(", networkType:");
        stringbuffer.append(j());
        stringbuffer.append(", audioPath:");
        stringbuffer.append(k());
        if (e() != null)
        {
            stringbuffer.append(", ");
            stringbuffer.append(l());
        }
        stringbuffer.append("}");
        return stringbuffer.toString();
    }
}
