// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import android.bluetooth.BluetoothDevice;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.synclair.operation.BaseSynclairOperation;
import com.fitbit.synclair.operation.i;
import com.fitbit.synclair.operation.k;
import com.fitbit.synclair.operation.l;
import com.fitbit.synclair.operation.p;
import com.fitbit.synclair.ui.controller.SynclairType;
import java.util.List;

// Referenced classes of package com.fitbit.synclair:
//            SynclairManager, b

public abstract class a extends SynclairManager
{

    protected String a;
    protected BluetoothDevice b;
    protected GalileoTrackerType c;
    private List d;

    protected a(BluetoothWorker bluetoothworker)
    {
        super(bluetoothworker);
    }

    static List a(a a1, List list)
    {
        a1.d = list;
        return list;
    }

    public boolean a()
    {
        return d != null && !d.isEmpty();
    }

    public boolean a(boolean flag)
    {
        com.fitbit.e.a.a(m(), "startOperationToSyncTracker()", new Object[0]);
        return a(((BaseSynclairOperation) (new p(e, i(), g(), flag))), new SynclairManager.a(this));
    }

    public boolean b()
    {
        com.fitbit.e.a.a(m(), "startOperationToSearchTrackerForUpdate()", new Object[0]);
        return a(new k(e, h()), new SynclairManager.a() {

            final a a;

            protected volatile void a(BaseSynclairOperation basesynclairoperation)
            {
                a((k)basesynclairoperation);
            }

            protected void a(k k1)
            {
                a.b = (BluetoothDevice)k1.d();
                super.a(k1);
            }

            
            {
                a = a.this;
                super(a.this);
            }
        });
    }

    public boolean c()
    {
        com.fitbit.e.a.a(m(), "startOperationToCheckForFirmware()", new Object[0]);
        return a(new com.fitbit.synclair.operation.a(e, i(), g()), new SynclairManager.a() {

            final a a;

            protected volatile void a(BaseSynclairOperation basesynclairoperation)
            {
                a((com.fitbit.synclair.operation.a)basesynclairoperation);
            }

            protected void a(com.fitbit.synclair.operation.a a1)
            {
                a.a(a, (List)a1.d());
                super.a(a1);
            }

            
            {
                a = a.this;
                super(a.this);
            }
        });
    }

    public boolean d()
    {
        com.fitbit.e.a.a(m(), "startOperationToSendFirmwareImages()", new Object[0]);
        SynclairType synclairtype;
        if (this instanceof b)
        {
            synclairtype = SynclairType.b;
        } else
        {
            synclairtype = SynclairType.a;
        }
        return a(new l(synclairtype, e, i(), g(), d), new SynclairManager.a(this));
    }

    public boolean e()
    {
        com.fitbit.e.a.a(m(), "startOperationToRefreshProfile()", new Object[0]);
        return a(new i(g()), new SynclairManager.a(this));
    }

    protected void f()
    {
        a = null;
        b = null;
        d = null;
        c = null;
        super.f();
    }

    public GalileoTrackerType g()
    {
        return c;
    }

    public String h()
    {
        return a;
    }

    public BluetoothDevice i()
    {
        return b;
    }
}
