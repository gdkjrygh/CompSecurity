// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.service;

import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.e;
import com.fitbit.dncs.c;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.f;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.dncs.service:
//            DncsOperation, DncsPairingError

public abstract class a extends DncsOperation
{

    private final String a;
    private final String b;
    private final GalileoTrackerType c;
    private boolean d;

    public a(Device device, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer connectionconsumer, DncsOperation.a a1)
    {
        super(connectionconsumer, null, a1);
        d = false;
        if (device != null)
        {
            a = device.c();
            b = device.d();
            c = GalileoTrackerType.a(device.j());
            return;
        } else
        {
            a = "";
            b = "";
            c = GalileoTrackerType.h;
            return;
        }
    }

    public volatile void a()
    {
        super.a();
    }

    protected void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Device device = com.fitbit.util.p.d(a);
        if (device != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj = device.o();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((TrackerSettings) (obj)).a(TrackerOption.ENABLE_ANCS);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Exception exception;
        boolean flag1;
        if (((Boolean)((e) (obj)).c()).booleanValue() != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        ((e) (obj)).a(Boolean.valueOf(flag));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        device.a(FitBitApplication.a());
        an.a().a(device, FitBitApplication.a(), false);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (p() != GalileoTrackerType.e)
        {
            continue; /* Loop/switch isn't completed */
        }
        d = true;
        if (true) goto _L1; else goto _L3
_L3:
        exception;
        throw exception;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f())
        {
            a(DncsPairingError.b);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public volatile DncsOperation.State c()
    {
        return super.c();
    }

    protected void c(f f)
    {
        a(DncsPairingError.b);
    }

    protected void d(f f)
    {
        a(com.fitbit.dncs.service.DncsPairingError.e);
    }

    public volatile com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer e()
    {
        return super.e();
    }

    protected void g()
    {
        a(DncsPairingError.g);
    }

    protected void i()
    {
        com.fitbit.dncs.c.a().a(b);
    }

    protected Device m()
    {
        return com.fitbit.util.p.d(a);
    }

    public String n()
    {
        return a;
    }

    public String o()
    {
        return b;
    }

    public GalileoTrackerType p()
    {
        return c;
    }

    public boolean q()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
