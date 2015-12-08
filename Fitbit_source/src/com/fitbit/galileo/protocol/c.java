// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.protocol;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.Loader;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.protocol.commands.AirlinkCommand;
import com.fitbit.galileo.protocol.commands.SynclairSync;
import com.fitbit.mixpanel.f;
import com.fitbit.savedstate.AndroidWearInstallationState;
import com.fitbit.savedstate.t;
import com.fitbit.util.z;
import java.util.Date;

// Referenced classes of package com.fitbit.galileo.protocol:
//            b

public class c extends b
    implements android.support.v4.content.Loader.OnLoadCompleteListener
{

    public static final String b = "com.fitbit.galileo.protocol.TrackerSyncingManager.ACTION_FINISHED";
    public static final String c = "com.fitbit.galileo.protocol.TrackerSyncingManager.ACTION_FINISHED";
    public static final String d = "com.fitbit.galileo.protocol.TrackerSyncingManager.EXTRA_FAILURE";
    private static final String e = com/fitbit/galileo/protocol/c.getSimpleName();
    private static final String f = "sync_";
    private static final String g = "bg_sync_";
    private static final String h = "user_sync_";
    private static final String i = "start";
    private static final String j = "success";
    private static final String k = "failure";
    private final com.fitbit.serverinteraction.SynclairApi.SyncTrigger l;
    private SynclairSync m;
    private com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus n;
    private long o;

    private c(BluetoothWorker bluetoothworker, GalileoTrackerType galileotrackertype, String s, b.a a1, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger)
    {
        super(bluetoothworker, galileotrackertype, s, a1);
        bluetoothworker = synctrigger;
        if (synctrigger == null)
        {
            bluetoothworker = com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a;
        }
        l = bluetoothworker;
    }

    public static c a(BluetoothWorker bluetoothworker, GalileoTrackerType galileotrackertype, String s, b.a a1, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger)
    {
        bluetoothworker = new c(bluetoothworker, galileotrackertype, s, a1, synctrigger);
        a(((Runnable) (new _cls1(bluetoothworker))));
        return bluetoothworker;
    }

    static void a(c c1, String s, com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype)
    {
        c1.a(s, failuretype);
    }

    private void a(AirlinkCommand airlinkcommand, Bundle bundle, Throwable throwable)
    {
        com.fitbit.e.a.d(e, String.format("finished bad? %s, %s", new Object[] {
            airlinkcommand, throwable
        }), throwable, new Object[0]);
        a(com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.b(AirlinkCommand.b, bundle));
    }

    private void a(AirlinkCommand airlinkcommand, String s)
    {
        com.fitbit.e.a.d(e, (new StringBuilder()).append("finished Successfully, result = ").append(s).toString(), new Object[0]);
        if (s != null)
        {
            n = com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus.a(s);
        }
        a();
    }

    private void a(String s, com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype)
    {
        long l1 = (new Date()).getTime();
        if (s.equals("start"))
        {
            o = l1;
        }
        l1 = (l1 - o) / 1000L;
        String s1 = i();
        if (failuretype != null)
        {
            failuretype.toString();
        }
        if (l == com.fitbit.serverinteraction.SynclairApi.SyncTrigger.b)
        {
            FitBitApplication.a().c().a(0x7f11000d).a(s1, s, (int)l1);
        }
        if (!s.equals("failure")) goto _L2; else goto _L1
_L1:
        t.i();
_L4:
        AndroidWearInstallationState.g();
        return;
_L2:
        if (s.equals("success"))
        {
            t.h();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Intent b(com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype)
    {
        Intent intent = new Intent("com.fitbit.galileo.protocol.TrackerSyncingManager.ACTION_FINISHED");
        if (failuretype != null)
        {
            intent.putExtra("com.fitbit.galileo.protocol.TrackerSyncingManager.EXTRA_FAILURE", failuretype);
        }
        return intent;
    }

    private String i()
    {
    /* anonymous class not found */
    class _anm2 {}

        com.fitbit.galileo.protocol._cls2.a[l.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 62
    //                   2 68;
           goto _L1 _L2 _L3
_L1:
        String s = "sync_";
_L5:
        String s1 = g().c();
        return (new StringBuilder()).append(s).append(s1).toString();
_L2:
        s = "bg_sync_";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "user_sync_";
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void a()
    {
        a("success", ((com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType) (null)));
        com.fitbit.mixpanel.f.e("Successful Syncs");
        com.fitbit.mixpanel.f.f("Unfinished Syncs");
        z.a(b(null));
        super.a();
    }

    protected void a(BluetoothDevice bluetoothdevice)
    {
        m = new SynclairSync(FitBitApplication.a(), a, bluetoothdevice, GalileoTrackerType.a(bluetoothdevice), l);
        m.registerListener(0, this);
        m.startLoading();
    }

    public void a(Loader loader, com.fitbit.galileo.protocol.commands.AirlinkCommand.c c1)
    {
        if (c1.a())
        {
            a((AirlinkCommand)loader, c1.b, (Throwable)c1.b.getSerializable(AirlinkCommand.a));
            return;
        } else
        {
            a((AirlinkCommand)loader, (String)c1.a);
            return;
        }
    }

    protected void a(com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype)
    {
        a("failure", failuretype);
        z.a(b(failuretype));
        super.a(failuretype);
    }

    protected void b()
    {
        a("failure", com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.a);
        z.a(b(com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.a));
        super.b();
    }

    protected boolean e()
    {
        if (m != null)
        {
            m.stopLoading();
        }
        return true;
    }

    public com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus h()
    {
        return n;
    }

    public void onLoadComplete(Loader loader, Object obj)
    {
        a(loader, (com.fitbit.galileo.protocol.commands.AirlinkCommand.c)obj);
    }


    /* member class not found */
    class _cls1 {}

}
