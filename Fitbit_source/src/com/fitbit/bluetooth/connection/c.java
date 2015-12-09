// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.ParcelUuid;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.commands.CommandName;
import com.fitbit.bluetooth.commands.d;
import com.fitbit.data.bl.Blob;
import com.fitbit.dncs.domain.EventID;
import com.fitbit.livedata.auth.TrackerAuthCredentials;
import java.util.UUID;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionService

public class c
{

    public c()
    {
    }

    private static Intent a(CommandName commandname)
    {
        Intent intent = new Intent(FitBitApplication.a(), com/fitbit/bluetooth/connection/BluetoothConnectionService);
        intent.setAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_EXECUTE_COMMAND");
        intent.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_COMMAND", commandname);
        return intent;
    }

    public static UUID a()
    {
        Intent intent = new Intent(FitBitApplication.a(), com/fitbit/bluetooth/connection/BluetoothConnectionService);
        intent.setAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_DISCONNECT");
        return a(intent);
    }

    public static UUID a(int i1, EventID eventid)
    {
        Intent intent = a(CommandName.k);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_NOTIFICATION_ID", i1);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_EVENT_ID", eventid);
        return a(intent);
    }

    public static UUID a(BluetoothDevice bluetoothdevice)
    {
        Intent intent = new Intent(FitBitApplication.a(), com/fitbit/bluetooth/connection/BluetoothConnectionService);
        intent.setAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_CONNECT");
        intent.putExtra("android.bluetooth.device.extra.DEVICE", bluetoothdevice);
        return a(intent);
    }

    private static UUID a(Intent intent)
    {
        ParcelUuid parceluuid = new ParcelUuid(UUID.randomUUID());
        intent.putExtra("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_ACTION_UUID", parceluuid);
        if (FitBitApplication.a().startService(intent) != null)
        {
            return parceluuid.getUuid();
        } else
        {
            return null;
        }
    }

    public static UUID a(Blob blob)
    {
        Intent intent = a(CommandName.g);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_DATA", blob);
        return a(intent);
    }

    public static UUID a(Blob blob, boolean flag)
    {
        Intent intent = a(CommandName.h);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_DATA", blob);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.SendMicrodumpCommand.EXTRA_USE_V2", flag);
        return a(intent);
    }

    public static UUID a(com.fitbit.galileo.ota.GalileoOtaMessages.BootMode bootmode)
    {
        Intent intent = a(CommandName.c);
        if (bootmode != null)
        {
            intent.putExtra(d.i, bootmode.ordinal());
        }
        return a(intent);
    }

    public static UUID a(TrackerAuthCredentials trackerauthcredentials)
    {
        Intent intent = a(CommandName.j);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_CREDENTIALS", trackerauthcredentials);
        return a(intent);
    }

    public static UUID a(boolean flag)
    {
        Intent intent = a(CommandName.m);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", flag);
        return a(intent);
    }

    public static UUID b()
    {
        Intent intent = a(CommandName.a);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", true);
        return a(intent);
    }

    public static UUID c()
    {
        Intent intent = a(CommandName.a);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", false);
        return a(intent);
    }

    public static UUID d()
    {
        return a(a(CommandName.d));
    }

    public static UUID e()
    {
        Intent intent = a(CommandName.i);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_WAIT_FOR_USER", true);
        return a(intent);
    }

    public static UUID f()
    {
        Intent intent = a(CommandName.i);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_WAIT_FOR_USER", false);
        return a(intent);
    }

    public static UUID g()
    {
        return a(a(CommandName.p));
    }

    public static UUID h()
    {
        return a(a(CommandName.q));
    }

    public static UUID i()
    {
        Intent intent = a(CommandName.b);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", true);
        return a(intent);
    }

    public static UUID j()
    {
        Intent intent = a(CommandName.b);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", false);
        return a(intent);
    }

    public static UUID k()
    {
        return a(a(CommandName.f));
    }

    public static UUID l()
    {
        return a(a(CommandName.e));
    }

    public static UUID m()
    {
        Intent intent = a(CommandName.l);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", true);
        return a(intent);
    }

    public static UUID n()
    {
        Intent intent = a(CommandName.l);
        intent.putExtra("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", false);
        return a(intent);
    }

    public static UUID o()
    {
        return a(a(CommandName.n));
    }

    public static UUID p()
    {
        Intent intent = new Intent(FitBitApplication.a(), com/fitbit/bluetooth/connection/BluetoothConnectionService);
        intent.setAction("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_EXECUTE_CANCEL");
        return a(intent);
    }

    public static UUID q()
    {
        return a(a(CommandName.o));
    }

    public static UUID r()
    {
        return a(a(CommandName.r));
    }
}
