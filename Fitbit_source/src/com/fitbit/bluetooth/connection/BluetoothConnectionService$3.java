// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.connection;

import android.os.Bundle;
import com.fitbit.bluetooth.AirlinkSession;
import com.fitbit.bluetooth.commands.CommandName;
import com.fitbit.bluetooth.commands.d;
import com.fitbit.bluetooth.commands.f;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.bluetooth.connection:
//            BluetoothConnectionService, d, BluetoothConnectionServiceStatus

class a
    implements com.fitbit.bluetooth.commands._cls3
{

    final BluetoothConnectionService a;

    public void a()
    {
        if (com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a) == null)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Current command does not exists but onCommandCancelled received", new Object[0]);
            return;
        } else
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Command %s cancelled", new Object[] {
                f.a(com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a))
            });
            com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a, com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a), mmandCompletionReason.c, null);
            com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a, null);
            return;
        }
    }

    public void a(boolean flag, Bundle bundle)
    {
        boolean flag3 = true;
        boolean flag1 = true;
        if (com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a) == null)
        {
            com.fitbit.e.a.a("BluetoothConnectionService", "Current command does not exists but onCommandExecuted received with success: %s and result: %s", new Object[] {
                Boolean.valueOf(flag), bundle
            });
            return;
        }
        Object obj = f.a(com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a));
        com.fitbit.e.a.a("BluetoothConnectionService", "Command %s executed with success = %s and result: %s", new Object[] {
            obj, Boolean.valueOf(flag), bundle
        });
        if (!flag)
        {
            com.fitbit.e.a.e("BluetoothConnectionService", "Command %s failed with result: %s", new Object[] {
                obj, bundle
            });
        }
        if (obj == CommandName.a)
        {
            flag3 = com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a).o().getBoolean("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", false);
            obj = BluetoothConnectionService.b(a);
            Object obj1 = BluetoothConnectionService.b(a).b().i();
            d d1;
            if (!flag3 || !flag)
            {
                flag1 = false;
            }
            ((com.fitbit.bluetooth.connection.d) (obj)).a(((tus.a) (obj1)).b(flag1).a());
        } else
        if (obj == CommandName.b)
        {
            boolean flag2 = com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a).o().getBoolean("com.fitbit.bluetooth.commands.Command.EXTRA_ENABLE", false);
            obj = BluetoothConnectionService.b(a);
            tus.a a1 = BluetoothConnectionService.b(a).b().i();
            if (flag2 && flag)
            {
                flag2 = flag3;
            } else
            {
                flag2 = false;
            }
            ((com.fitbit.bluetooth.connection.d) (obj)).a(a1.c(flag2).a());
        } else
        if (obj == CommandName.c)
        {
            if (bundle != null && flag)
            {
                obj = (AirlinkSession)bundle.getParcelable(d.h);
            } else
            {
                obj = null;
            }
            BluetoothConnectionService.b(a).a(BluetoothConnectionService.b(a).b().i().a(flag, ((AirlinkSession) (obj))).a());
        } else
        if (obj == CommandName.d)
        {
            BluetoothConnectionService.b(a).a(BluetoothConnectionService.b(a).b().i().a(false, null).a());
        }
        obj1 = a;
        d1 = com.fitbit.bluetooth.connection.BluetoothConnectionService.d(a);
        if (flag)
        {
            obj = com.fitbit.bluetooth.connection.mmandCompletionReason.a;
        } else
        {
            obj = mmandCompletionReason.b;
        }
        com.fitbit.bluetooth.connection.BluetoothConnectionService.a(((BluetoothConnectionService) (obj1)), d1, ((mmandCompletionReason) (obj)), bundle);
        com.fitbit.bluetooth.connection.BluetoothConnectionService.a(a, null);
    }

    tus.a(BluetoothConnectionService bluetoothconnectionservice)
    {
        a = bluetoothconnectionservice;
        super();
    }
}
