// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;

import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.data.domain.device.Device;
import com.fitbit.dncs.NotificationManager;
import com.fitbit.dncs.c;
import com.fitbit.dncs.ui.DncsPairingRequestDialogController;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.bluetooth.b;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.tasks.ae;
import com.fitbit.galileo.tasks.g;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.dncs.service:
//            a, DncsPairingError

class DncsPairTrackerOperation extends a
{

    private static final String a = "DncsPairTrackerOperation";
    private final com.fitbit.dncs.ui.DncsPairingRequestDialogController.DncsPairingTrigger b;
    private State c;
    private BluetoothDevice d;
    private com.fitbit.dncs.ui.DncsPairingRequestDialogController.a e;

    public DncsPairTrackerOperation(Device device, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer, com.fitbit.dncs.ui.DncsPairingRequestDialogController.DncsPairingTrigger dncspairingtrigger, DncsOperation.a a1)
    {
        super(device, connectionconsumer, a1);
        c = null;
        d = null;
        if (dncspairingtrigger == null)
        {
            dncspairingtrigger = com.fitbit.dncs.ui.DncsPairingRequestDialogController.DncsPairingTrigger.a;
        }
        b = dncspairingtrigger;
    }

    static com.fitbit.dncs.ui.DncsPairingRequestDialogController.a a(DncsPairTrackerOperation dncspairtrackeroperation)
    {
        return dncspairtrackeroperation.e;
    }

    static com.fitbit.dncs.ui.DncsPairingRequestDialogController.a a(DncsPairTrackerOperation dncspairtrackeroperation, com.fitbit.dncs.ui.DncsPairingRequestDialogController.a a1)
    {
        dncspairtrackeroperation.e = a1;
        return a1;
    }

    private void a(State state)
    {
        this;
        JVM INSTR monitorenter ;
        a((new StringBuilder()).append("Switching to state: ").append(state).toString());
        c = state;
    /* anonymous class not found */
    class _anm2 {}

    /* block-local class not found */
    class State {}

        _cls2.a[c.ordinal()];
        JVM INSTR tableswitch 1 4: default 218
    //                   1 82
    //                   2 120
    //                   3 138
    //                   4 176;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        a(((Enum) (DncsPairingError.a)));
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = new _cls1();
        DncsPairingRequestDialogController.a().a(n(), b, e);
          goto _L6
        state;
        throw state;
_L3:
        a(((f) (new ae(o()))));
          goto _L6
_L4:
        BluetoothErrorsHandler.a().a(EnumSet.allOf(com/fitbit/bluetooth/BluetoothErrorsHandler$BluetoothError));
        a(((f) (new g(d, e(), p(), false))));
          goto _L6
_L5:
        if (NotificationManager.a().b(o()).a())
        {
            com.fitbit.dncs.c.a().a(o(), p());
        }
        a(true);
        h();
          goto _L6
    }

    static void a(DncsPairTrackerOperation dncspairtrackeroperation, State state)
    {
        dncspairtrackeroperation.a(state);
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != State.a) goto _L2; else goto _L1
_L1:
        if (e == null) goto _L4; else goto _L3
_L3:
        DncsPairingRequestDialogController.a().a(e);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        super.b();
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L2:
        if (c == State.d) goto _L5; else goto _L6
_L6:
        super.b();
          goto _L5
    }

    protected void b(f f)
    {
        this;
        JVM INSTR monitorenter ;
        a((new StringBuilder()).append("Task completed: ").append(f).append(". Current state: ").append(c).toString());
        int i1 = _cls2.a[c.ordinal()];
        i1;
        JVM INSTR tableswitch 2 3: default 72
    //                   2 75
    //                   3 112;
           goto _L1 _L2 _L3
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = ((ae)f).f();
        a(com.fitbit.dncs.service.State.c);
          goto _L1
        f;
        a(DncsPairingError.a);
          goto _L1
        f;
        throw f;
_L3:
        a(State.d);
          goto _L1
    }

    protected void d(f f)
    {
        switch (_cls2.a[c.ordinal()])
        {
        default:
            a(DncsPairingError.e);
            return;

        case 2: // '\002'
            a(com.fitbit.dncs.service.DncsPairingError.f);
            break;
        }
    }

    protected void i()
    {
        super.i();
        if (m() == null)
        {
            a("Device does not exists. Cancelling...");
            a(DncsPairingError.d);
            return;
        }
        if (com.fitbit.galileo.bluetooth.b.a().b())
        {
            a("Bluetooth is occupied by another module. Cancelling...");
            a(com.fitbit.dncs.service.DncsPairingError.g);
            return;
        }
        if (com.fitbit.savedstate.g.c(o()))
        {
            a(com.fitbit.dncs.service.State.b);
            return;
        } else
        {
            a(State.a);
            return;
        }
    }

    protected void j()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null)
        {
            com.fitbit.dncs.ui.DncsPairingRequestDialogController.a a1 = e;
            e = null;
            DncsPairingRequestDialogController.a().a(a1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected String k()
    {
        return "DncsPairTrackerOperation";
    }

    protected BluetoothWorker l()
    {
        return new BluetoothWorker(com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.f);
    }

    /* member class not found */
    class _cls1 {}

}
