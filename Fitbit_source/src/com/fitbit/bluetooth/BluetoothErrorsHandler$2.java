// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth;

import com.fitbit.data.domain.device.Device;
import com.fitbit.e.a;
import com.fitbit.galileo.a.f;
import com.fitbit.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.bluetooth:
//            e, BluetoothErrorsHandler, n, k

class a extends e
{

    final BluetoothErrorsHandler a;

    protected void a()
    {
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Bluetooth is disabled. Trying to enable...", new Object[0]);
        if (!com.fitbit.bluetooth.n.a().e())
        {
            com.fitbit.e.a.a("BluetoothErrorsHandler", "Unable to enable Bluetooth.", new Object[0]);
            BluetoothErrorsHandler.b(a);
            d();
        }
    }

    protected void b()
    {
        Object obj = new ArrayList();
        BluetoothErrorsHandler bluetootherrorshandler = a;
        bluetootherrorshandler;
        JVM INSTR monitorenter ;
        Object obj1 = BluetoothErrorsHandler.c(a).keySet();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        obj1 = ((Set) (obj1)).iterator();
_L2:
        Device device;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_87;
            }
            device = p.c(f.c((String)((Iterator) (obj1)).next()));
        } while (device == null);
        ((List) (obj)).add(device);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        bluetootherrorshandler;
        JVM INSTR monitorexit ;
        throw obj;
        BluetoothErrorsHandler.b(a);
        bluetootherrorshandler;
        JVM INSTR monitorexit ;
        com.fitbit.e.a.a("BluetoothErrorsHandler", "Bluetooth is enabled.", new Object[0]);
        d();
        if (!((List) (obj)).isEmpty())
        {
            if (((List) (obj)).size() == 1)
            {
                com.fitbit.multipledevice.a.a().a(((Device)((List) (obj)).get(0)).c(), com.fitbit.serverinteraction., false);
                return;
            } else
            {
                com.fitbit.multipledevice.a.a().a(com.fitbit.serverinteraction., false);
                return;
            }
        } else
        {
            com.fitbit.e.a.a("BluetoothErrorsHandler", "Unable to start force sync: no devices", new Object[0]);
            return;
        }
    }

    rigger(BluetoothErrorsHandler bluetootherrorshandler, boolean flag)
    {
        a = bluetootherrorshandler;
        super(flag);
    }
}
