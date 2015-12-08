// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.device.Device;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.protocol.c;
import com.fitbit.pedometer.service.PedometerServerSyncHelper;
import com.fitbit.savedstate.PedometerSavedState;
import com.fitbit.util.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoServicesStateListener

public abstract class GalileoSyncProcessor
{
    public static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        private static final State d[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/galileo/service/GalileoSyncProcessor$State, s);
        }

        public static State[] values()
        {
            return (State[])d.clone();
        }

        static 
        {
            a = new State("NOT_STARTED", 0);
            b = new State("IN_PROGRESS", 1);
            c = new State("FINISHED", 2);
            d = (new State[] {
                a, b, c
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

    public static class a
    {

        public final String a;
        public final String b;
        public final GalileoTrackerType c;
        public final boolean d;

        public a(Device device)
        {
            a = device.c();
            b = device.d();
            c = GalileoTrackerType.a(device.j());
            d = p.d(device);
        }
    }

    public static interface b
    {

        public abstract void a(GalileoSyncProcessor galileosyncprocessor);
    }

    public static class c
    {

        public final a a;
        public final boolean b;
        public final com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType c;
        public final com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus d;

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("").append(b);
            String s;
            if (b)
            {
                s = "";
            } else
            {
                s = (new StringBuilder()).append("(").append(c).append(")").toString();
            }
            return stringbuilder.append(s).toString();
        }

        private c(a a1, boolean flag, com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype, com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus firmwareupdatestatus)
        {
            a = a1;
            b = flag;
            c = failuretype;
            d = firmwareupdatestatus;
        }

    }


    protected final GalileoServicesStateListener a;
    protected final BluetoothWorker b;
    protected final com.fitbit.serverinteraction.SynclairApi.SyncTrigger c;
    private final b d;
    private State e;
    private List f;

    public GalileoSyncProcessor(BluetoothWorker bluetoothworker, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, GalileoServicesStateListener galileoservicesstatelistener, b b1)
    {
        e = com.fitbit.galileo.service.State.a;
        b = bluetoothworker;
        c = synctrigger;
        d = b1;
        a = galileoservicesstatelistener;
    }

    private void a(String s)
    {
        com.fitbit.e.a.a(c(), "Updating last sync time: encodedId = %s", new Object[] {
            s
        });
        s = an.a().a(s);
        if (s == null)
        {
            com.fitbit.e.a.a(c(), "Could not found device to update last sync time!", new Object[0]);
            return;
        } else
        {
            Date date = new Date();
            com.fitbit.e.a.a(c(), "Last sync time updated: mac = %s, time = %s", new Object[] {
                s.d(), date
            });
            s.a(date);
            an.a().a(s);
            return;
        }
    }

    private void a(String s, com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype)
    {
        com.fitbit.e.a.a(c(), "Update fail reason: deviceEncodedId = %s, failure = %s", new Object[] {
            s, failuretype
        });
        if (a != null)
        {
            a.a(s, failuretype);
        }
    }

    protected c a(a a1)
    {
        Object obj;
        PedometerSavedState.p();
        obj = PedometerServerSyncHelper.a(FitBitApplication.a(), false);
        if (obj == null || obj == com.fitbit.pedometer.service.PedometerServerSyncHelper.SoftTrackerSyncError.b)
        {
            return new c(a1, true, null, null);
        }
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.pedometer.service.PedometerServerSyncHelper.SoftTrackerSyncError.values().length];
                try
                {
                    a[com.fitbit.pedometer.service.PedometerServerSyncHelper.SoftTrackerSyncError.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.fitbit.pedometer.service.PedometerServerSyncHelper.SoftTrackerSyncError.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.pedometer.service.PedometerServerSyncHelper.SoftTrackerSyncError.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.pedometer.service.PedometerServerSyncHelper.SoftTrackerSyncError.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.galileo.service._cls1.a[((com.fitbit.pedometer.service.PedometerServerSyncHelper.SoftTrackerSyncError) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 72
    //                   1 87
    //                   2 94
    //                   3 101
    //                   4 101;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        obj = null;
_L6:
        return new c(a1, false, ((com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType) (obj)), null, null);
_L2:
        obj = com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.i;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.f;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.e;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected c a(a a1, com.fitbit.galileo.protocol.c c1)
    {
        if (a1 != null)
        {
            if (c1 != null)
            {
                c1 = c1.h();
            } else
            {
                c1 = null;
            }
            c1 = new c(a1, true, null, c1, null);
            a(a1.a, ((com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType) (null)));
            a(a1.a);
            return c1;
        } else
        {
            return null;
        }
    }

    protected c a(a a1, com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype, com.fitbit.galileo.protocol.c c1)
    {
        if (a1 != null)
        {
            if (c1 != null)
            {
                c1 = c1.h();
            } else
            {
                c1 = null;
            }
            c1 = new c(a1, false, failuretype, c1, null);
            a(a1.a, failuretype);
            return c1;
        } else
        {
            return null;
        }
    }

    protected abstract void a();

    protected void a(List list)
    {
        if (e == State.b)
        {
            com.fitbit.e.a.a(c(), "Finished", new Object[0]);
            e = com.fitbit.galileo.service.State.c;
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
            }
            f = ((List) (obj));
            b();
            if (d != null)
            {
                d.a(this);
            }
        }
    }

    protected abstract void b();

    protected abstract String c();

    public State d()
    {
        return e;
    }

    public boolean e()
    {
        return e == State.b;
    }

    public boolean f()
    {
        return e == com.fitbit.galileo.service.State.c;
    }

    public List g()
    {
        return f;
    }

    public final boolean h()
    {
        if (e == com.fitbit.galileo.service.State.a)
        {
            com.fitbit.e.a.a(c(), "Started", new Object[0]);
            e = State.b;
            a();
        } else
        if (e != State.b)
        {
            return false;
        }
        return true;
    }
}
