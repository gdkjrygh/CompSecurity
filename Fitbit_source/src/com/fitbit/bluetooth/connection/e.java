// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelUuid;
import com.fitbit.bluetooth.AirlinkSession;
import com.fitbit.galileo.a.f;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            d, BluetoothConnectionServiceStatus

public class e
{

    public e()
    {
    }

    public static BluetoothConnectionService.CommandCompletionReason a(Intent intent)
    {
        if (intent != null && intent.hasExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND_COMPLETION_REASON"))
        {
            intent = intent.getSerializableExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND_COMPLETION_REASON");
            if (intent != null && (intent instanceof BluetoothConnectionService.CommandCompletionReason))
            {
                return (BluetoothConnectionService.CommandCompletionReason)intent;
            }
        }
        return null;
    }

    public static BluetoothConnectionServiceStatus a()
    {
        return com.fitbit.bluetooth.connection.d.a().b();
    }

    public static UUID a(Bundle bundle)
    {
        bundle = b(bundle);
        if (bundle != null)
        {
            return bundle.getUuid();
        } else
        {
            return null;
        }
    }

    public static boolean a(BluetoothDevice bluetoothdevice)
    {
        BluetoothDevice bluetoothdevice1 = c();
        return bluetoothdevice1 != null && bluetoothdevice1.equals(bluetoothdevice);
    }

    public static boolean a(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        return bluetoothconnectionservicestatus != null && bluetoothconnectionservicestatus.c();
    }

    public static boolean a(String s)
    {
        return a(s, a());
    }

    public static boolean a(String s, BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        if (s != null)
        {
            bluetoothconnectionservicestatus = c(bluetoothconnectionservicestatus);
            if (bluetoothconnectionservicestatus != null)
            {
                return com.fitbit.galileo.a.f.a(s, com.fitbit.galileo.a.f.a(bluetoothconnectionservicestatus));
            }
        }
        return false;
    }

    public static ParcelUuid b(Bundle bundle)
    {
        if (bundle != null)
        {
            return (ParcelUuid)bundle.getParcelable("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_ACTION_UUID");
        } else
        {
            return null;
        }
    }

    public static AirlinkSession b(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        if (bluetoothconnectionservicestatus != null)
        {
            return bluetoothconnectionservicestatus.b();
        } else
        {
            return null;
        }
    }

    public static boolean b()
    {
        return a(a());
    }

    public static boolean b(Intent intent)
    {
        return a(intent) == BluetoothConnectionService.CommandCompletionReason.a;
    }

    public static BluetoothDevice c()
    {
        return c(a());
    }

    public static BluetoothDevice c(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        if (bluetoothconnectionservicestatus != null)
        {
            return bluetoothconnectionservicestatus.h();
        } else
        {
            return null;
        }
    }

    public static boolean c(Intent intent)
    {
        return a(intent) == BluetoothConnectionService.CommandCompletionReason.c;
    }

    public static AirlinkSession d()
    {
        return b(a());
    }

    public static UUID d(Intent intent)
    {
        if (intent != null)
        {
            return a(intent.getExtras());
        } else
        {
            return null;
        }
    }

    public static boolean d(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        return bluetoothconnectionservicestatus != null && bluetoothconnectionservicestatus.c() && bluetoothconnectionservicestatus.d();
    }

    public static boolean e()
    {
        return d(a());
    }

    public static boolean e(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        return bluetoothconnectionservicestatus != null && bluetoothconnectionservicestatus.c() && bluetoothconnectionservicestatus.e();
    }

    public static boolean f()
    {
        return e(a());
    }

    public static boolean f(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        return bluetoothconnectionservicestatus != null && bluetoothconnectionservicestatus.c() && bluetoothconnectionservicestatus.d() && bluetoothconnectionservicestatus.f();
    }

    public static boolean g()
    {
        return f(a());
    }

    public static boolean g(BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        return bluetoothconnectionservicestatus != null && bluetoothconnectionservicestatus.c() && bluetoothconnectionservicestatus.g();
    }

    public static boolean h()
    {
        return g(a());
    }
}
