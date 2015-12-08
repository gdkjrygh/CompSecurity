// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;

import android.bluetooth.BluetoothDevice;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.data.domain.device.Device;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.galileo.tasks.ae;
import com.fitbit.galileo.tasks.y;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.dncs.service:
//            a, DncsPairingError

public class DncsUnPairTrackerOperation extends a
{

    private static final String a = "DncsPairTrackerOperation";
    private State b;
    private BluetoothDevice c;

    public DncsUnPairTrackerOperation(Device device, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer, DncsOperation.a a1)
    {
        super(device, connectionconsumer, a1);
        b = null;
        c = null;
    }

    private void a(State state)
    {
        this;
        JVM INSTR monitorenter ;
        a((new StringBuilder()).append("Switching to state: ").append(state).toString());
        b = state;
    /* anonymous class not found */
    class _anm1 {}

    /* block-local class not found */
    class State {}

        _cls1.a[b.ordinal()];
        JVM INSTR tableswitch 1 3: default 151
    //                   1 78
    //                   2 101
    //                   3 139;
           goto _L1 _L2 _L3 _L4
_L1:
        a(((Enum) (DncsPairingError.a)));
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a(((f) (new ae(o()))));
          goto _L5
        state;
        throw state;
_L3:
        BluetoothErrorsHandler.a().a(EnumSet.allOf(com/fitbit/bluetooth/BluetoothErrorsHandler$BluetoothError));
        a(((f) (new y(c, e(), p(), false))));
          goto _L5
_L4:
        a(false);
        h();
          goto _L5
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != State.c)
        {
            super.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void b(f f)
    {
        this;
        JVM INSTR monitorenter ;
        a((new StringBuilder()).append("Task completed: ").append(f).append(". Current state: ").append(b).toString());
        int i1 = _cls1.a[b.ordinal()];
        i1;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 75
    //                   2 112;
           goto _L1 _L2 _L3
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c = ((ae)f).f();
        a(State.b);
          goto _L1
        f;
        a(DncsPairingError.a);
          goto _L1
        f;
        throw f;
_L3:
        a(State.c);
          goto _L1
    }

    protected void d(f f)
    {
        switch (_cls1.a[b.ordinal()])
        {
        default:
            a(DncsPairingError.e);
            return;

        case 1: // '\001'
            a(com.fitbit.dncs.service.DncsPairingError.f);
            break;
        }
    }

    protected void i()
    {
        super.i();
        a(State.a);
    }

    protected void j()
    {
    }

    protected String k()
    {
        return "DncsPairTrackerOperation";
    }

    protected BluetoothWorker l()
    {
        return new BluetoothWorker(com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.g);
    }
}
