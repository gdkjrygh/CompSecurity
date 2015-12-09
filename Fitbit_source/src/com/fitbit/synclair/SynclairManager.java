// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.bluetooth.connection.BluetoothConnectionController;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.bluetooth.b;
import com.fitbit.mixpanel.f;
import com.fitbit.mixpanel.i;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.synclair.config.bean.DeviceBaseConfigBean;
import com.fitbit.synclair.config.bean.e;
import com.fitbit.synclair.operation.BaseSynclairOperation;
import com.fitbit.synclair.operation.info.SynclairOperationInfo;
import com.fitbit.synclair.operation.o;
import com.fitbit.util.PushNotificationsController;
import com.fitbit.util.z;
import java.util.EnumSet;

// Referenced classes of package com.fitbit.synclair:
//            c

public abstract class SynclairManager
{
    public static final class SynclairManagerState extends Enum
    {

        public static final SynclairManagerState a;
        public static final SynclairManagerState b;
        public static final SynclairManagerState c;
        public static final SynclairManagerState d;
        private static final SynclairManagerState e[];

        public static SynclairManagerState valueOf(String s)
        {
            return (SynclairManagerState)Enum.valueOf(com/fitbit/synclair/SynclairManager$SynclairManagerState, s);
        }

        public static SynclairManagerState[] values()
        {
            return (SynclairManagerState[])e.clone();
        }

        static 
        {
            a = new SynclairManagerState("NOT_STARTED", 0);
            b = new SynclairManagerState("EXECUTING", 1);
            c = new SynclairManagerState("FINISHING", 2);
            d = new SynclairManagerState("FINISHED", 3);
            e = (new SynclairManagerState[] {
                a, b, c, d
            });
        }

        private SynclairManagerState(String s, int i)
        {
            super(s, i);
        }
    }

    protected class a
        implements com.fitbit.synclair.operation.BaseSynclairOperation.a
    {

        final SynclairManager b;

        private BaseSynclairOperation i(BaseSynclairOperation basesynclairoperation)
        {
            BaseSynclairOperation basesynclairoperation1 = basesynclairoperation;
            if (com.fitbit.synclair.SynclairManager.a(b) != basesynclairoperation)
            {
                com.fitbit.e.a.a(b.m(), "%s is not a current operation", new Object[] {
                    basesynclairoperation
                });
                basesynclairoperation1 = null;
            }
            return basesynclairoperation1;
        }

        protected void a(BaseSynclairOperation basesynclairoperation)
        {
            if (basesynclairoperation.c().equals(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.i))
            {
                com.fitbit.synclair.SynclairManager.a(b, true);
                UISavedState.i();
            }
            if (com.fitbit.synclair.SynclairManager.b(b) && basesynclairoperation.c().equals(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.k))
            {
                com.fitbit.mixpanel.f.a(new i(com.fitbit.synclair.c.j().k().a()));
                com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.e);
                com.fitbit.synclair.SynclairManager.a(b, false);
            }
            b.O();
            b.b(basesynclairoperation);
        }

        public final void b(BaseSynclairOperation basesynclairoperation)
        {
            basesynclairoperation = i(basesynclairoperation);
            if (basesynclairoperation != null)
            {
                f(basesynclairoperation);
            }
        }

        public final void c(BaseSynclairOperation basesynclairoperation)
        {
            basesynclairoperation = i(basesynclairoperation);
            if (basesynclairoperation != null)
            {
                a(basesynclairoperation);
            }
        }

        public final void d(BaseSynclairOperation basesynclairoperation)
        {
            basesynclairoperation = i(basesynclairoperation);
            if (basesynclairoperation != null)
            {
                g(basesynclairoperation);
            }
        }

        public final void e(BaseSynclairOperation basesynclairoperation)
        {
            basesynclairoperation = i(basesynclairoperation);
            if (basesynclairoperation != null)
            {
                h(basesynclairoperation);
            }
        }

        protected void f(BaseSynclairOperation basesynclairoperation)
        {
            b.O();
        }

        protected void g(BaseSynclairOperation basesynclairoperation)
        {
            b.O();
            b.b(basesynclairoperation);
        }

        protected void h(BaseSynclairOperation basesynclairoperation)
        {
            if (SynclairManager.c(b) == SynclairManagerState.c)
            {
                b.a(SynclairManagerState.d);
            }
            b.O();
            b.b(basesynclairoperation);
        }

        protected a()
        {
            b = SynclairManager.this;
            super();
        }
    }


    private boolean a;
    private boolean b;
    private boolean c;
    private BaseSynclairOperation d;
    protected final BluetoothWorker e;
    private SynclairManagerState f;
    private final Handler g = new Handler(Looper.getMainLooper());
    private final Runnable h = new Runnable() {

        final SynclairManager a;

        public void run()
        {
            z.a(new Intent(a.l()));
        }

            
            {
                a = SynclairManager.this;
                super();
            }
    };

    protected SynclairManager(BluetoothWorker bluetoothworker)
    {
        a = false;
        b = false;
        c = false;
        d = null;
        f = com.fitbit.synclair.SynclairManagerState.a;
        e = bluetoothworker;
    }

    static BaseSynclairOperation a(SynclairManager synclairmanager)
    {
        return synclairmanager.d;
    }

    static boolean a(SynclairManager synclairmanager, boolean flag)
    {
        synclairmanager.a = flag;
        return flag;
    }

    static boolean b(SynclairManager synclairmanager)
    {
        return synclairmanager.a;
    }

    static SynclairManagerState c(SynclairManager synclairmanager)
    {
        return synclairmanager.f;
    }

    public SynclairManagerState B()
    {
        return f;
    }

    public SynclairOperationInfo C()
    {
        return d;
    }

    public boolean D()
    {
        return f != com.fitbit.synclair.SynclairManagerState.a;
    }

    public boolean E()
    {
        return f == com.fitbit.synclair.SynclairManagerState.b || f == SynclairManagerState.c;
    }

    public boolean F()
    {
        return f == SynclairManagerState.d;
    }

    protected boolean G()
    {
        PushNotificationsController.a(FitBitApplication.a().getApplicationContext());
        if (!E())
        {
            com.fitbit.e.a.a(m(), "Started", new Object[0]);
            f();
            a(com.fitbit.synclair.SynclairManagerState.b);
            return true;
        } else
        {
            com.fitbit.e.a.a(m(), "Could not start. Manager is in progress", new Object[0]);
            return false;
        }
    }

    protected boolean H()
    {
        com.fitbit.e.a.a(m(), "startOperationToInitPairing()", new Object[0]);
        b(false);
        return a(new o(e), new a() {

            final SynclairManager a;

            protected volatile void a(BaseSynclairOperation basesynclairoperation)
            {
                a((o)basesynclairoperation);
            }

            protected void a(o o1)
            {
                super.a(o1);
                BluetoothErrorsHandler.a().a(EnumSet.allOf(com/fitbit/bluetooth/BluetoothErrorsHandler$BluetoothError));
            }

            
            {
                a = SynclairManager.this;
                super();
            }
        });
    }

    public void I()
    {
        com.fitbit.e.a.a(m(), "finishManager()", new Object[0]);
        if (f != com.fitbit.synclair.SynclairManagerState.b) goto _L2; else goto _L1
_L1:
        if (d == null || !d.g()) goto _L4; else goto _L3
_L3:
        a(SynclairManagerState.c);
        d.j();
_L6:
        return;
_L4:
        a(SynclairManagerState.d);
        return;
_L2:
        if (f == com.fitbit.synclair.SynclairManagerState.a)
        {
            a(SynclairManagerState.d);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void J()
    {
        com.fitbit.e.a.a(m(), "resetManager()", new Object[0]);
        f();
        P();
        com.fitbit.synclair.config.bean.e.a().a(false);
        a(com.fitbit.synclair.SynclairManagerState.a);
    }

    public void K()
    {
        if (d != null)
        {
            d.j();
        }
    }

    public boolean L()
    {
        return false;
    }

    protected BaseSynclairOperation M()
    {
        return d;
    }

    protected boolean N()
    {
        return f == com.fitbit.synclair.SynclairManagerState.b && (d == null || !d.g());
    }

    protected void O()
    {
        g.removeCallbacks(h);
        g.post(h);
    }

    protected void P()
    {
        if (com.fitbit.galileo.bluetooth.b.a().b(e))
        {
            BluetoothConnectionController.a().b(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.b);
        }
    }

    public boolean Q()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean R()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(BaseSynclairOperation basesynclairoperation)
    {
    }

    protected boolean a(SynclairManagerState synclairmanagerstate)
    {
        if (f != synclairmanagerstate)
        {
            com.fitbit.e.a.a(m(), "State changed from %s to %s", new Object[] {
                f, synclairmanagerstate
            });
            boolean flag = E();
            f = synclairmanagerstate;
            if (flag && !E())
            {
                P();
            }
            O();
            return true;
        } else
        {
            return false;
        }
    }

    protected boolean a(BaseSynclairOperation basesynclairoperation, a a1)
    {
        if (basesynclairoperation == null)
        {
            com.fitbit.e.a.a(m(), "Unable to start new operation. Invalid operation.", new Object[0]);
            return false;
        }
        if (a1 == null)
        {
            com.fitbit.e.a.a(m(), "Unable to start new operation. Invalid listener.", new Object[0]);
            return false;
        }
        if (!N())
        {
            com.fitbit.e.a.a(m(), "Unable to start new operation. Manager is busy", new Object[0]);
            return false;
        } else
        {
            a(basesynclairoperation);
            d = basesynclairoperation;
            d.a(a1);
            O();
            return true;
        }
    }

    public void b(BaseSynclairOperation basesynclairoperation)
    {
        if (basesynclairoperation.c().equals(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.k))
        {
            b(true);
            return;
        } else
        {
            b(false);
            return;
        }
    }

    public void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        b = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        c = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void f()
    {
        if (d != null)
        {
            BaseSynclairOperation basesynclairoperation = d;
            d = null;
            basesynclairoperation.j();
        }
    }

    protected abstract String l();

    protected abstract String m();

    public abstract DeviceBaseConfigBean o();
}
