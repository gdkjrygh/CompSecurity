// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.bluetooth.BluetoothDevice;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.bluetooth.connection.BluetoothConnectionController;
import com.fitbit.bluetooth.connection.BluetoothConnectionServiceStatus;
import com.fitbit.bluetooth.connection.e;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.a.f;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.bluetooth.h;
import com.fitbit.galileo.bluetooth.i;
import com.fitbit.galileo.tasks.aa;
import com.fitbit.galileo.tasks.l;
import com.fitbit.multipledevice.b;
import com.fitbit.util.p;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.livedata:
//            LiveDataState, g

class a
{

    private static final String a = "BluetoothLiveDataStateController";
    private aa b;
    private l c;
    private com.fitbit.galileo.tasks.h d;
    private BluetoothDevice e;
    private final BluetoothWorker f;
    private LiveDataState g;
    private com.fitbit.livedata.g h;
    private h i;

    a()
    {
        f = new BluetoothWorker(com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.d);
        g = LiveDataState.a;
        i = new h() {

            final a a;

            protected void a(UUID uuid)
            {
            }

            protected void b(UUID uuid)
            {
                a a1 = a;
                a1;
                JVM INSTR monitorenter ;
                if (a.a(a) == null || !uuid.equals(a.a(a).i())) goto _L2; else goto _L1
_L1:
                com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to find tracker.", new Object[0]);
                a.a(a, null);
                com.fitbit.livedata.a.b(a);
_L5:
                return;
_L2:
                if (a.c(a) == null || !uuid.equals(a.c(a).i())) goto _L4; else goto _L3
_L3:
                com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to enable LiveData.", new Object[0]);
                a.a(a, null);
                com.fitbit.livedata.a.b(a);
                  goto _L5
                uuid;
                a1;
                JVM INSTR monitorexit ;
                throw uuid;
_L4:
                if (a.d(a) == null || !uuid.equals(a.d(a).i())) goto _L5; else goto _L6
_L6:
                a.a(a, null);
                com.fitbit.livedata.a.e(a);
                  goto _L5
            }

            protected void c(UUID uuid)
            {
                a a1 = a;
                a1;
                JVM INSTR monitorenter ;
                if (a.a(a) == null || !uuid.equals(a.a(a).i())) goto _L2; else goto _L1
_L1:
                com.fitbit.e.a.a("BluetoothLiveDataStateController", "Tracker is found. Authenticating...", new Object[0]);
                uuid = a.a(a).a();
                a.a(a, null);
                if (uuid != null) goto _L4; else goto _L3
_L3:
                com.fitbit.e.a.a("BluetoothLiveDataStateController", "Tracker not found. Stop streaming.", new Object[0]);
                com.fitbit.livedata.a.b(a);
_L5:
                a1;
                JVM INSTR monitorexit ;
                return;
_L4:
                a.a(a, uuid);
                  goto _L5
                uuid;
                a1;
                JVM INSTR monitorexit ;
                throw uuid;
_L2:
                if (a.c(a) == null || !uuid.equals(a.c(a).i())) goto _L7; else goto _L6
_L6:
                com.fitbit.e.a.a("BluetoothLiveDataStateController", "LiveData enabled.", new Object[0]);
                a.a(a, null);
                com.fitbit.livedata.a.f(a);
                  goto _L5
_L7:
                if (a.d(a) == null || !uuid.equals(a.d(a).i())) goto _L5; else goto _L8
_L8:
                com.fitbit.e.a.a("BluetoothLiveDataStateController", "LiveData disabled.", new Object[0]);
                a.a(a, null);
                com.fitbit.livedata.a.e(a);
                  goto _L5
            }

            protected void d(UUID uuid)
            {
                a a1 = a;
                a1;
                JVM INSTR monitorenter ;
                if (a.a(a) == null || !uuid.equals(a.a(a).i())) goto _L2; else goto _L1
_L1:
                a.a(a, null);
                com.fitbit.livedata.a.e(a);
_L5:
                return;
_L2:
                if (a.c(a) == null || !uuid.equals(a.c(a).i())) goto _L4; else goto _L3
_L3:
                a.a(a, null);
                com.fitbit.livedata.a.e(a);
                  goto _L5
                uuid;
                a1;
                JVM INSTR monitorexit ;
                throw uuid;
_L4:
                if (a.d(a) == null || !uuid.equals(a.d(a).i())) goto _L5; else goto _L6
_L6:
                a.a(a, null);
                com.fitbit.livedata.a.e(a);
                  goto _L5
            }

            
            {
                a = a.this;
                super();
            }
        };
    }

    static aa a(a a1)
    {
        return a1.b;
    }

    static aa a(a a1, aa aa)
    {
        a1.b = aa;
        return aa;
    }

    static com.fitbit.galileo.tasks.h a(a a1, com.fitbit.galileo.tasks.h h1)
    {
        a1.d = h1;
        return h1;
    }

    static l a(a a1, l l1)
    {
        a1.c = l1;
        return l1;
    }

    private void a(BluetoothDevice bluetoothdevice)
    {
        this;
        JVM INSTR monitorenter ;
        e = bluetoothdevice;
        c = new l(e, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.c, GalileoTrackerType.a(e), false);
        if (!a(((com.fitbit.galileo.bluetooth.f) (c))))
        {
            c = null;
            i();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        bluetoothdevice;
        throw bluetoothdevice;
    }

    private void a(LiveDataState livedatastate)
    {
        this;
        JVM INSTR monitorenter ;
        if (g != livedatastate)
        {
            com.fitbit.e.a.a("BluetoothLiveDataStateController", "Current state changed from %s to %s", new Object[] {
                g, livedatastate
            });
            g = livedatastate;
            if (g == LiveDataState.a)
            {
                com.fitbit.savedstate.l.a(null);
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        livedatastate;
        throw livedatastate;
    }

    static void a(a a1, BluetoothDevice bluetoothdevice)
    {
        a1.a(bluetoothdevice);
    }

    private boolean a(com.fitbit.galileo.bluetooth.f f1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f.a(f1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        f1;
        throw f1;
    }

    static void b(a a1)
    {
        a1.i();
    }

    static l c(a a1)
    {
        return a1.c;
    }

    private boolean c()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (ApplicationForegroundController.a().b()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Cannot use live data: application is in background.", new Object[0]);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (!com.fitbit.bluetooth.g.f())
        {
            com.fitbit.e.a.a("BluetoothLiveDataStateController", "Cannot use live data: Bluetooth is not supported.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_53;
        Exception exception;
        exception;
        throw exception;
        if (!com.fitbit.bluetooth.g.g())
        {
            com.fitbit.e.a.a("BluetoothLiveDataStateController", "Cannot use live data: Bluetooth is off.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        if (com.fitbit.bluetooth.g.h())
        {
            com.fitbit.e.a.a("BluetoothLiveDataStateController", "Cannot use live data: Bluetooth usage is restricted.", new Object[0]);
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static com.fitbit.galileo.tasks.h d(a a1)
    {
        return a1.d;
    }

    private void d()
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (!com.fitbit.multipledevice.b.a())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        obj = p.b(DeviceFeature.LIVE_DATA);
_L3:
        Object obj1 = new ArrayList();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = ((List) (obj)).iterator();
_L2:
        String s;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_118;
            }
            s = ((Device)((Iterator) (obj)).next()).d();
        } while (s == null);
        if (s.isEmpty()) goto _L2; else goto _L1
_L1:
        ((List) (obj1)).add(s);
          goto _L2
        obj;
        throw obj;
        obj1 = p.f();
        if (((Device) (obj1)).a(DeviceFeature.LIVE_DATA))
        {
            obj = new ArrayList();
            ((List) (obj)).add(obj1);
        }
          goto _L3
        if (((List) (obj1)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_158;
        }
        b = com.fitbit.multipledevice.b.a(((List) (obj1)));
        if (!a(b))
        {
            b = null;
            i();
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "There is no tracker with live data", new Object[0]);
        i();
          goto _L4
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        i.a();
        a(com.fitbit.livedata.LiveDataState.b);
        if (h != null)
        {
            h.g();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void e(a a1)
    {
        a1.h();
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        a(LiveDataState.d);
        if (h != null)
        {
            h.h();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void f(a a1)
    {
        a1.f();
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        a(LiveDataState.c);
        if (h != null)
        {
            h.i();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        e = null;
        b(true);
        if (h != null)
        {
            h.j();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (!BluetoothErrorsHandler.a().b()) goto _L2; else goto _L1
_L1:
        a();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i.d();
        a(LiveDataState.a);
        if (h != null)
        {
            h.k();
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(com.fitbit.livedata.g g1)
    {
        this;
        JVM INSTR monitorenter ;
        h = g1;
        this;
        JVM INSTR monitorexit ;
        return;
        g1;
        throw g1;
    }

    public void a(boolean flag, BluetoothConnectionServiceStatus bluetoothconnectionservicestatus)
    {
        this;
        JVM INSTR monitorenter ;
        if (flag) goto _L2; else goto _L1
_L1:
        flag = ApplicationForegroundController.a().b();
        if (flag) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!com.fitbit.bluetooth.g.f() || com.fitbit.bluetooth.g.h())
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        BluetoothConnectionServiceStatus bluetoothconnectionservicestatus1;
        bluetoothconnectionservicestatus1 = bluetoothconnectionservicestatus;
        if (bluetoothconnectionservicestatus != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        bluetoothconnectionservicestatus1 = com.fitbit.bluetooth.connection.e.a();
        bluetoothconnectionservicestatus = p.c(com.fitbit.galileo.a.f.a(com.fitbit.bluetooth.connection.e.c(bluetoothconnectionservicestatus1)));
        if (bluetoothconnectionservicestatus == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (bluetoothconnectionservicestatus.a(DeviceFeature.LIVE_DATA) && BluetoothConnectionController.a().a(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.c))
        {
            com.fitbit.e.a.a("BluetoothLiveDataStateController", "Connection consumer registered", new Object[0]);
        }
        if (true) goto _L3; else goto _L5
_L5:
        bluetoothconnectionservicestatus;
        throw bluetoothconnectionservicestatus;
    }

    public boolean a()
    {
        boolean flag1 = false;
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "stopStreaming()", new Object[0]);
        if (g != LiveDataState.a) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to stop streaming: LiveData is already disconnected.", new Object[0]);
        b(true);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (b != null)
        {
            f.b(b);
        }
        if (c != null)
        {
            f.b(c);
        }
        flag = flag1;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        flag = flag1;
        if (!com.fitbit.bluetooth.g.g())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        g();
        d = new com.fitbit.galileo.tasks.h(e, com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.c, GalileoTrackerType.a(e), true);
        flag1 = f.a(d);
        flag = flag1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        flag = com.fitbit.galileo.bluetooth.i.a().a(d);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        h();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a(boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "startStreaming() restartAllowed=%s", new Object[] {
            Boolean.valueOf(flag)
        });
        if (ApplicationForegroundController.a().b()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to start streaming: application is in background.", new Object[0]);
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (com.fitbit.bluetooth.g.f())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to start streaming: Bluetooth is not supported.", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        throw exception;
        if (com.fitbit.bluetooth.g.g())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to start streaming: Bluetooth is off.", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        if (!com.fitbit.bluetooth.g.h())
        {
            break MISSING_BLOCK_LABEL_124;
        }
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to start streaming: Bluetooth usage is restricted.", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        c(true);
        if (g != com.fitbit.livedata.LiveDataState.b)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to start streaming: LiveData is establishing connection.", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        if (flag)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        if (g != LiveDataState.d)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to start streaming: LiveData is streaming.", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        if (!BluetoothErrorsHandler.a().b())
        {
            break MISSING_BLOCK_LABEL_213;
        }
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to start streaming: pending errors waiting for user confirmation.", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        if (com.fitbit.dncs.service.b.a().d())
        {
            break MISSING_BLOCK_LABEL_239;
        }
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to start streaming: DNCS Pairing is in progress.", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        if (com.fitbit.galileo.bluetooth.b.a().a(f))
        {
            break MISSING_BLOCK_LABEL_269;
        }
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "Unable to start streaming: could not start a BluetoothWorker", new Object[0]);
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        BluetoothErrorsHandler.a().a(EnumSet.of(com.fitbit.bluetooth.BluetoothErrorsHandler.BluetoothError.c));
        e();
        d();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public LiveDataState b()
    {
        this;
        JVM INSTR monitorenter ;
        LiveDataState livedatastate = g;
        this;
        JVM INSTR monitorexit ;
        return livedatastate;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("BluetoothLiveDataStateController", "cancelStreaming()", new Object[0]);
        a(LiveDataState.a);
        com.fitbit.galileo.bluetooth.b.a().b(f);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        BluetoothConnectionController.a().b(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.c);
        i.d();
        e = null;
        b = null;
        c = null;
        d = null;
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
        a(flag, ((BluetoothConnectionServiceStatus) (null)));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
