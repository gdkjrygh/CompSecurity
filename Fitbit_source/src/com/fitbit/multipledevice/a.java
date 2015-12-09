// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.multipledevice;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.bluetooth.e;
import com.fitbit.bluetooth.g;
import com.fitbit.data.bl.exceptions.MobileTrackBackOffException;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.galileo.service.d;
import com.fitbit.livedata.LiveDataSource;
import com.fitbit.livedata.LiveDataState;
import com.fitbit.livedata.c;
import com.fitbit.livedata.h;
import com.fitbit.pedometer.l;
import com.fitbit.savedstate.s;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionInfo;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.util.p;
import com.fitbit.util.threading.FitbitHandlerThread;
import com.fitbit.util.z;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.multipledevice:
//            MultipleDeviceMode

public class com.fitbit.multipledevice.a
{
    private class a
        implements com.fitbit.livedata.g
    {

        final com.fitbit.multipledevice.a a;
        private final LiveDataSource b;

        static LiveDataSource a(a a1)
        {
            return a1.b;
        }

        public void g()
        {
            FitbitHandlerThread.a(false, new Runnable(this) {

                final a a;

                public void run()
                {
                    com.fitbit.multipledevice.a.a(a.a, a.a(a));
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        public void h()
        {
            FitbitHandlerThread.a(false, new Runnable(this) {

                final a a;

                public void run()
                {
                    com.fitbit.multipledevice.a.b(a.a, a.a(a));
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        public void i()
        {
            FitbitHandlerThread.a(false, new Runnable(this) {

                final a a;

                public void run()
                {
                    com.fitbit.multipledevice.a.c(a.a, a.a(a));
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        public void j()
        {
            FitbitHandlerThread.a(false, new Runnable(this) {

                final a a;

                public void run()
                {
                    com.fitbit.multipledevice.a.d(a.a, a.a(a));
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        public void k()
        {
            FitbitHandlerThread.a(false, new Runnable(this) {

                final a a;

                public void run()
                {
                    com.fitbit.multipledevice.a.e(a.a, a.a(a));
                }

            
            {
                a = a1;
                super();
            }
            });
        }

        public a(LiveDataSource livedatasource)
        {
            a = com.fitbit.multipledevice.a.this;
            super();
            b = livedatasource;
        }
    }

    private static class b
    {

        public final LiveDataState a;
        public final LiveDataSource b;

        public boolean equals(Object obj)
        {
            if (obj instanceof b)
            {
                if (b == ((b) (obj = (b)obj)).b && a == ((b) (obj)).a)
                {
                    return true;
                }
            }
            return false;
        }

        public String toString()
        {
            return (new StringBuilder()).append("").append(a).append("(").append(b).append(")").toString();
        }

        public b()
        {
            this(null, null);
        }

        public b(LiveDataState livedatastate, LiveDataSource livedatasource)
        {
            if (livedatastate == null)
            {
                livedatastate = LiveDataState.a;
            }
            a = livedatastate;
            if (livedatasource == null)
            {
                livedatasource = LiveDataSource.c;
            }
            b = livedatasource;
        }
    }

    private static class c
    {

        public static com.fitbit.multipledevice.a a = new com.fitbit.multipledevice.a();


        private c()
        {
        }
    }


    public static final String a = (new StringBuilder()).append(com/fitbit/multipledevice/a.getCanonicalName()).append(".ACTION_LIVE_DATA_STATE_CHANGED").toString();
    private static final String c = "MultipleDeviceController";
    public final com.fitbit.util.threading.c b;
    private final d d;
    private MultipleDeviceMode e;
    private final h f;
    private final com.fitbit.livedata.c g;
    private b h;
    private e i = new e() {

        final com.fitbit.multipledevice.a a;

        protected void a()
        {
            com.fitbit.e.a.a("MultipleDeviceController", "Bluetooth is turned off", new Object[0]);
            a.b();
        }

        protected void b()
        {
            com.fitbit.e.a.a("MultipleDeviceController", "Bluetooth is turned on", new Object[0]);
            a.b();
        }

            
            {
                a = com.fitbit.multipledevice.a.this;
                super();
            }
    };
    private final com.fitbit.util.threading.c j;
    private final com.fitbit.serverinteraction.restrictions.RestrictionsController.a k;

    private com.fitbit.multipledevice.a()
    {
        d = new d();
        e = MultipleDeviceMode.a;
        f = new h(new a(h.a));
        g = new com.fitbit.livedata.c(new a(com.fitbit.livedata.c.a));
        h = new b();
        b = new com.fitbit.util.threading.c() {

            final com.fitbit.multipledevice.a a;

            protected void a(Intent intent)
            {
                intent = intent.getAction();
                if ("SavedState.GalileoState.ACTION_USE_BLUETOOTH_OPTION_CHANGED".equals(intent))
                {
                    com.fitbit.e.a.a("MultipleDeviceController", "'Use bluetooth' option changed", new Object[0]);
                    a.b();
                } else
                {
                    if ("com.fitbit.FitbitMobile.BluetoothSupportStatusController.ACTION_SUPPORT_STATUS_CHANGED".equals(intent))
                    {
                        com.fitbit.e.a.a("MultipleDeviceController", "Bluetooth support status changed", new Object[0]);
                        a.b();
                        return;
                    }
                    if ("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE".equals(intent))
                    {
                        com.fitbit.e.a.a("MultipleDeviceController", "China Bluetooth permission changed", new Object[0]);
                        a.b();
                        return;
                    }
                }
            }

            
            {
                a = com.fitbit.multipledevice.a.this;
                super();
            }
        };
        j = new com.fitbit.util.threading.c() {

            final com.fitbit.multipledevice.a a;

            protected void a(Intent intent)
            {
                com.fitbit.multipledevice.a a1 = a;
                a1;
                JVM INSTR monitorenter ;
                String s = intent.getAction();
                if (com.fitbit.multipledevice.a.a(a) == MultipleDeviceMode.a) goto _L2; else goto _L1
_L1:
                if (!"com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(s)) goto _L4; else goto _L3
_L3:
                intent = com.fitbit.ApplicationForegroundController.LaunchType.b(intent);
                if (com.fitbit.multipledevice.a.a(a) != MultipleDeviceMode.a && (com.fitbit.multipledevice.a.a(a) == com.fitbit.multipledevice.MultipleDeviceMode.d || intent == com.fitbit.ApplicationForegroundController.LaunchType.b))
                {
                    com.fitbit.e.a.a("MultipleDeviceController", "Application switched from background. Trying to start force sync with 1 sec offset...", new Object[0]);
                    FitbitHandlerThread.a(new Runnable(this) {

                        final _cls3 a;

                        public void run()
                        {
                            com.fitbit.multipledevice.a.a(a.a, com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a, false, false);
                        }

            
            {
                a = _pcls3;
                super();
            }
                    }, 1000L);
                }
                com.fitbit.multipledevice.a.b(a);
_L2:
                return;
_L4:
                if (!"com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(s)) goto _L6; else goto _L5
_L5:
                com.fitbit.multipledevice.a.c(a);
                  goto _L2
                intent;
                a1;
                JVM INSTR monitorexit ;
                throw intent;
_L6:
                if (!"com.fitbit.data.bl.SyncPendingActivityLogsOperation.ACTIVITY_LOGS_SYNCED".equals(s)) goto _L2; else goto _L7
_L7:
                com.fitbit.e.a.a("MultipleDeviceController", "Activity logs changed", new Object[0]);
                com.fitbit.multipledevice.a.a(a, com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a, false, false);
                  goto _L2
            }

            
            {
                a = com.fitbit.multipledevice.a.this;
                super();
            }
        };
        k = new com.fitbit.serverinteraction.restrictions.RestrictionsController.a() {

            final com.fitbit.multipledevice.a a;

            public void a(RestrictionInfo restrictioninfo)
            {
            }

            public void a(List list)
            {
label0:
                {
                    if (list == null)
                    {
                        break label0;
                    }
                    list = list.iterator();
                    RestrictionInfo restrictioninfo;
                    do
                    {
                        if (!list.hasNext())
                        {
                            break label0;
                        }
                        restrictioninfo = (RestrictionInfo)list.next();
                    } while (!restrictioninfo.e().equals("warning_mobile_track_sync_backed_off"));
                    if (!s.e())
                    {
                        s.a(MobileTrackBackOffException.d(), restrictioninfo.d());
                    }
                }
            }

            public void b(RestrictionInfo restrictioninfo)
            {
            }

            
            {
                a = com.fitbit.multipledevice.a.this;
                super();
            }
        };
        i.c();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("SavedState.GalileoState.ACTION_USE_BLUETOOTH_OPTION_CHANGED");
        intentfilter.addAction("com.fitbit.FitbitMobile.BluetoothSupportStatusController.ACTION_SUPPORT_STATUS_CHANGED");
        intentfilter.addAction("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE");
        b.a(intentfilter);
        ServerGateway.a().b().c(k);
        b();
    }


    static MultipleDeviceMode a(com.fitbit.multipledevice.a a1)
    {
        return a1.e;
    }

    public static com.fitbit.multipledevice.a a()
    {
        return c.a;
    }

    private void a(LiveDataSource livedatasource)
    {
        this;
        JVM INSTR monitorenter ;
        if (livedatasource == LiveDataSource.a)
        {
            f.b();
        }
        l();
        this;
        JVM INSTR monitorexit ;
        return;
        livedatasource;
        throw livedatasource;
    }

    static void a(com.fitbit.multipledevice.a a1, LiveDataSource livedatasource)
    {
        a1.a(livedatasource);
    }

    static void a(com.fitbit.multipledevice.a a1, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, boolean flag, boolean flag1)
    {
        a1.a(synctrigger, flag, flag1);
    }

    private void a(com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, boolean flag, boolean flag1)
    {
        this;
        JVM INSTR monitorenter ;
        d.a(com.fitbit.galileo.service.GalileoSyncService.SyncMode.a, synctrigger, null, flag, flag1);
        this;
        JVM INSTR monitorexit ;
        return;
        synctrigger;
        throw synctrigger;
    }

    private void b(LiveDataSource livedatasource)
    {
        this;
        JVM INSTR monitorenter ;
        if (livedatasource == LiveDataSource.a)
        {
            f.b();
        }
        l();
        this;
        JVM INSTR monitorexit ;
        return;
        livedatasource;
        throw livedatasource;
    }

    static void b(com.fitbit.multipledevice.a a1)
    {
        a1.m();
    }

    static void b(com.fitbit.multipledevice.a a1, LiveDataSource livedatasource)
    {
        a1.b(livedatasource);
    }

    private void c(LiveDataSource livedatasource)
    {
        this;
        JVM INSTR monitorenter ;
        l();
        this;
        JVM INSTR monitorexit ;
        return;
        livedatasource;
        throw livedatasource;
    }

    static void c(com.fitbit.multipledevice.a a1)
    {
        a1.n();
    }

    static void c(com.fitbit.multipledevice.a a1, LiveDataSource livedatasource)
    {
        a1.c(livedatasource);
    }

    private void d(LiveDataSource livedatasource)
    {
        this;
        JVM INSTR monitorenter ;
        l();
        this;
        JVM INSTR monitorexit ;
        return;
        livedatasource;
        throw livedatasource;
    }

    static void d(com.fitbit.multipledevice.a a1, LiveDataSource livedatasource)
    {
        a1.d(livedatasource);
    }

    private void e(LiveDataSource livedatasource)
    {
        this;
        JVM INSTR monitorenter ;
        if (livedatasource == LiveDataSource.a && e.b())
        {
            com.fitbit.e.a.a("MultipleDeviceController", "[LiveData] Failed to start Bluetooth Live Data streaming. Starting Pedometer Live Data streaming", new Object[0]);
            f.a();
        }
        l();
        this;
        JVM INSTR monitorexit ;
        return;
        livedatasource;
        throw livedatasource;
    }

    static void e(com.fitbit.multipledevice.a a1, LiveDataSource livedatasource)
    {
        a1.e(livedatasource);
    }

    private b k()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        LiveDataState livedatastate;
        obj = g.d();
        livedatastate = f.d();
        if (!((LiveDataState) (obj)).b()) goto _L2; else goto _L1
_L1:
        if (livedatastate.b()) goto _L4; else goto _L3
_L3:
        obj = new b(livedatastate, LiveDataSource.b);
_L7:
        this;
        JVM INSTR monitorexit ;
        return ((b) (obj));
_L4:
        obj = LiveDataSource.c;
        if (!e.a()) goto _L6; else goto _L5
_L5:
        obj = LiveDataSource.a;
_L9:
        obj = new b(LiveDataState.a, ((LiveDataSource) (obj)));
          goto _L7
        obj;
        throw obj;
_L6:
        if (!e.b()) goto _L9; else goto _L8
_L8:
        obj = LiveDataSource.b;
          goto _L9
_L2:
label0:
        {
            if (obj != LiveDataState.c)
            {
                break MISSING_BLOCK_LABEL_147;
            }
            if (livedatastate.b())
            {
                break label0;
            }
            obj = new b(livedatastate, LiveDataSource.b);
        }
          goto _L7
        obj = new b(((LiveDataState) (obj)), LiveDataSource.a);
          goto _L7
        obj = new b(((LiveDataState) (obj)), LiveDataSource.a);
          goto _L7
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        b b1 = k();
        if (!h.equals(b1))
        {
            com.fitbit.e.a.a("MultipleDeviceController", "[LiveData] State changed from %s to %s", new Object[] {
                h, b1
            });
            h = b1;
            z.a(new Intent(a));
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        com.fitbit.pedometer.e e1 = com.fitbit.pedometer.e.g();
        static class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.values().length];
                try
                {
                    a[com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        i1 = _cls5.a[e1.a().ordinal()];
        i1;
        JVM INSTR tableswitch 1 2: default 40
    //                   1 43
    //                   2 43;
           goto _L1 _L2 _L2
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (e == com.fitbit.multipledevice.MultipleDeviceMode.d)
        {
            com.fitbit.e.a.a("MultipleDeviceController", "[LiveData] Start Pedometer Live Data streaming after switching to foreground: %s", new Object[] {
                Boolean.valueOf(f.a())
            });
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void n()
    {
        this;
        JVM INSTR monitorenter ;
        if (e.b())
        {
            com.fitbit.e.a.a("MultipleDeviceController", "[LiveData] Stopping Pedometer Live Data streaming", new Object[0]);
            f.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(synctrigger, flag, true);
        this;
        JVM INSTR monitorexit ;
        return;
        synctrigger;
        throw synctrigger;
    }

    public void a(String s, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        d.a(com.fitbit.galileo.service.GalileoSyncService.SyncMode.b, synctrigger, s, flag, true);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public boolean a(boolean flag)
    {
        boolean flag4 = true;
        boolean flag3 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag5;
        boolean flag6;
        List list = p.a();
        flag6 = p.a(list, DeviceFeature.WIRELESS_SYNC);
        flag5 = p.h(list);
        if (!flag6) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Wireless device exists!", new Object[0]);
        flag6 = com.fitbit.bluetooth.support.a.a().c();
        if (com.fitbit.bluetooth.g.d()) goto _L4; else goto _L3
_L3:
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Bluetooth LE is not supported by adapter!", new Object[0]);
        boolean flag1 = false;
_L17:
        if (!flag5) goto _L6; else goto _L5
_L5:
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Motionbit device exists!", new Object[0]);
        if (com.fitbit.pedometer.e.h()) goto _L8; else goto _L7
_L7:
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Pedometer is not supported!", new Object[0]);
        boolean flag2 = false;
_L20:
        Object obj = MultipleDeviceMode.a;
        if (!flag1 || !flag2) goto _L10; else goto _L9
_L9:
        obj = MultipleDeviceMode.b;
_L23:
        if (obj == e) goto _L12; else goto _L11
_L11:
        if (obj == MultipleDeviceMode.a) goto _L14; else goto _L13
_L13:
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.data.bl.SyncPendingActivityLogsOperation.ACTIVITY_LOGS_SYNCED");
        intentfilter.addAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND");
        intentfilter.addAction("com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_BACKGROUND");
        j.a(intentfilter);
_L25:
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Mode changed from %s to %s. startForceSync = %s", new Object[] {
            e, obj, Boolean.valueOf(flag)
        });
        e = ((MultipleDeviceMode) (obj));
        d.a(e);
        if (e != MultipleDeviceMode.a) goto _L16; else goto _L15
_L15:
        d.a();
        f.b();
        f.f();
        g.b();
        g.f();
_L28:
        l();
        flag = flag4;
_L31:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        if (!flag6)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        if (com.fitbit.bluetooth.g.f())
        {
            break MISSING_BLOCK_LABEL_314;
        }
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Bluetooth LE is not supported by server!", new Object[0]);
        flag1 = false;
          goto _L17
        if (!com.fitbit.bluetooth.g.h())
        {
            break MISSING_BLOCK_LABEL_338;
        }
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Bluetooth access restricted!", new Object[0]);
        flag1 = false;
          goto _L17
        if (com.fitbit.bluetooth.g.g()) goto _L19; else goto _L18
_L18:
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Bluetooth is disabled!", new Object[0]);
        flag1 = false;
          goto _L17
_L8:
        if (!com.fitbit.pedometer.l.a())
        {
            break MISSING_BLOCK_LABEL_576;
        }
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Tracker key expired!", new Object[0]);
        flag2 = false;
          goto _L20
_L10:
        if (!flag1) goto _L22; else goto _L21
_L21:
        obj = com.fitbit.multipledevice.MultipleDeviceMode.c;
          goto _L23
_L22:
        if (!flag2) goto _L23; else goto _L24
_L24:
        obj = com.fitbit.multipledevice.MultipleDeviceMode.d;
          goto _L23
_L14:
        j.d();
          goto _L25
        Exception exception;
        exception;
        throw exception;
_L16:
        exception = d;
        if (!flag)
        {
            flag3 = true;
        }
        exception.a(flag3);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        a(com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a, false, false);
        if (!e.a()) goto _L27; else goto _L26
_L26:
        g.e();
_L29:
        if (!e.b())
        {
            break MISSING_BLOCK_LABEL_516;
        }
        f.e();
_L30:
        h();
          goto _L28
_L27:
        g.b();
        g.f();
          goto _L29
        f.b();
        f.f();
          goto _L30
_L12:
        com.fitbit.e.a.a("MultipleDeviceController", "[Refresh] Mode is not changed. Current mode = %s", new Object[] {
            e
        });
        flag = false;
          goto _L31
_L6:
        flag2 = false;
          goto _L20
_L2:
        flag1 = false;
          goto _L17
_L19:
        flag1 = true;
          goto _L17
        flag2 = true;
          goto _L20
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = a(false);
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        d.b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        d.c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.a()) goto _L2; else goto _L1
_L1:
        boolean flag = g();
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean f()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.b()) goto _L2; else goto _L1
_L1:
        boolean flag = g();
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        if (e == MultipleDeviceMode.a) goto _L2; else goto _L1
_L1:
        d.d();
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.a()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("MultipleDeviceController", "[LiveData] Start Bluetooth Live Data streaming: %s", new Object[] {
            Boolean.valueOf(g.a())
        });
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (e.b())
        {
            com.fitbit.e.a.a("MultipleDeviceController", "[LiveData] Starting Pedometer Live Data streaming: %s", new Object[] {
                Boolean.valueOf(f.a())
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e.a()) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("MultipleDeviceController", "[LiveData] Restart Bluetooth Live Data streaming: %s", new Object[] {
            Boolean.valueOf(g.a(true))
        });
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (e.b())
        {
            com.fitbit.e.a.a("MultipleDeviceController", "[LiveData] Restarting Pedometer Live Data streaming: %s", new Object[] {
                Boolean.valueOf(f.a())
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public LiveDataState j()
    {
        this;
        JVM INSTR monitorenter ;
        LiveDataState livedatastate;
        l();
        livedatastate = h.a;
        this;
        JVM INSTR monitorexit ;
        return livedatastate;
        Exception exception;
        exception;
        throw exception;
    }

}
