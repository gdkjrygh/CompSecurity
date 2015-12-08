// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.PowerManager;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.bluetooth.connection.BluetoothConnectionController;
import com.fitbit.bluetooth.g;
import com.fitbit.bluetooth.support.BluetoothSupportStatus;
import com.fitbit.data.bl.SyncTrackerTask;
import com.fitbit.data.bl.ag;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.e.a;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.tasks.i;
import com.fitbit.multipledevice.b;
import com.fitbit.pedometer.e;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.util.ar;
import com.fitbit.util.p;
import com.fitbit.util.threading.FitbitHandlerThread;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncService_, GalileoSyncProcessor, GalileoServicesStateListener, a

public class GalileoSyncService extends Service
    implements GalileoSyncProcessor.b, Runnable
{
    public static final class SyncMode extends Enum
    {

        public static final SyncMode a;
        public static final SyncMode b;
        private static final SyncMode c[];

        public static SyncMode valueOf(String s1)
        {
            return (SyncMode)Enum.valueOf(com/fitbit/galileo/service/GalileoSyncService$SyncMode, s1);
        }

        public static SyncMode[] values()
        {
            return (SyncMode[])c.clone();
        }

        static 
        {
            a = new SyncMode("SYNC_ALL", 0);
            b = new SyncMode("SYNC_SELECTED", 1);
            c = (new SyncMode[] {
                a, b
            });
        }

        private SyncMode(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static class a
    {

        List a;
        Set b;
        com.fitbit.serverinteraction.SynclairApi.SyncTrigger c;
        SyncMode d;

        private a()
        {
            a = new ArrayList();
            b = new HashSet();
            c = com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a;
            d = com.fitbit.galileo.service.SyncMode.a;
        }

    }


    private static final String c = "GalileoSyncService";
    private static final long d = 60000L;
    private static final String e = "com.fitbit.galileo.GalileoSyncService.WAKE_LOCK";
    private static final String f = "EXTRA_DEVICE_ID";
    private static final String g = "EXTRA_DEVICE_ENCODED_ID";
    private static final String h = "EXTRA_SYNC_MODE";
    private static final String i = "com.fitbit.galileo.GalileoSyncService.FORCE_SYNC_EXTRA";
    private static final String j = "com.fitbit.galileo.GalileoSyncService.EXTRA_RESTART_BT_IF_NEEDED";
    private static final Object k = new Object();
    protected GalileoServicesStateListener a;
    protected PowerManager b;
    private UUID l;
    private final BluetoothWorker m;
    private GalileoSyncProcessor n;
    private a o;
    private android.os.PowerManager.WakeLock p;
    private boolean q;
    private BroadcastReceiver r;
    private AsyncTask s;

    public GalileoSyncService()
    {
        l = null;
        m = new BluetoothWorker(com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.a);
        n = null;
        o = null;
        r = new BroadcastReceiver() {

            final GalileoSyncService a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if ("com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK".equals(context))
                {
                    context = (UUID)intent.getSerializableExtra("com.fitbit.util.service.DispatcherService.GUID");
                    a.a(context);
                } else
                if ("com.fitbit.FitbitMobile.BluetoothSupportStatusController.ACTION_SUPPORT_STATUS_CHANGED".equals(context))
                {
                    ag.b().execute(a);
                    return;
                }
            }

            
            {
                a = GalileoSyncService.this;
                super();
            }
        };
    }

    public static Intent a(Context context, SyncMode syncmode, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, String s1, boolean flag, boolean flag1)
    {
        context = com.fitbit.galileo.service.GalileoSyncService_.a(context).a();
        context.putExtra("EXTRA_SYNC_MODE", syncmode.ordinal());
        context.putExtra("EXTRA_DEVICE_ENCODED_ID", s1);
        context.putExtra("com.fitbit.galileo.GalileoSyncService.FORCE_SYNC_EXTRA", flag);
        context.putExtra("com.fitbit.galileo.GalileoSyncService.EXTRA_RESTART_BT_IF_NEEDED", flag1);
        synctrigger.a(context);
        return context;
    }

    private a a(Intent intent)
    {
        Object obj;
        Device device;
        a a1;
        com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger;
        boolean flag;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        a1 = new a();
        obj = SyncMode.values()[intent.getIntExtra("EXTRA_SYNC_MODE", com.fitbit.galileo.service.SyncMode.b.ordinal())];
        flag3 = intent.getBooleanExtra("com.fitbit.galileo.GalileoSyncService.FORCE_SYNC_EXTRA", false);
        synctrigger = com.fitbit.serverinteraction.SynclairApi.SyncTrigger.b(intent);
        a1.c = synctrigger;
        a1.d = ((SyncMode) (obj));
        device = null;
        if (obj == com.fitbit.galileo.service.SyncMode.b || !com.fitbit.multipledevice.b.a())
        {
            if (obj == com.fitbit.galileo.service.SyncMode.b)
            {
                String s1 = intent.getStringExtra("EXTRA_DEVICE_ENCODED_ID");
                intent = com.fitbit.util.p.d(s1);
                obj = intent;
                if (intent == null)
                {
                    com.fitbit.e.a.a("GalileoSyncService", "Device with encoded id %s is not found.", new Object[] {
                        s1
                    });
                    obj = intent;
                }
            } else
            {
                obj = com.fitbit.util.p.f();
            }
            intent = device;
            if (obj != null)
            {
                intent = new ArrayList();
                intent.add(obj);
            }
        } else
        {
            intent = com.fitbit.util.p.d();
        }
        if (intent == null) goto _L2; else goto _L1
_L1:
        flag4 = com.fitbit.bluetooth.g.h();
        flag5 = com.fitbit.bluetooth.g.g();
        boolean flag2;
        if (com.fitbit.bluetooth.support.a.a().b().a().equals(com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.a))
        {
            flag2 = com.fitbit.bluetooth.g.d();
        } else
        {
            flag2 = com.fitbit.bluetooth.g.f();
        }
        obj = com.fitbit.galileo.a.a.c();
        intent = intent.iterator();
_L10:
        if (!intent.hasNext()) goto _L2; else goto _L3
_L3:
        device = (Device)intent.next();
        flag1 = true;
        if (!device.a(DeviceFeature.WIRELESS_SYNC)) goto _L5; else goto _L4
_L4:
        if (flag2) goto _L7; else goto _L6
_L6:
        com.fitbit.e.a.a("GalileoSyncService", "Could not sync device %s. Bluetooth LE is not supported by hardware!", new Object[] {
            device.c()
        });
        flag = false;
_L8:
        if (flag)
        {
            if (synctrigger == com.fitbit.serverinteraction.SynclairApi.SyncTrigger.c && !TrackerSyncPreferencesSavedState.t() && TrackerSyncPreferencesSavedState.d(device.c()))
            {
                a1.b.add(device.c());
            }
            a1.a.add(device);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (!flag5)
        {
            com.fitbit.e.a.a("GalileoSyncService", "Could not sync device %s. Bluetooth is not enabled!", new Object[] {
                device.c()
            });
            flag = false;
        } else
        if (flag4)
        {
            com.fitbit.e.a.a("GalileoSyncService", "Could not sync device %s. Bluetooth access is restricted!", new Object[] {
                device.c()
            });
            flag = false;
        } else
        if (((com.fitbit.galileo.a.a.a) (obj)).b())
        {
            com.fitbit.e.a.a("GalileoSyncService", "Could not sync device %s. Galileo sync backoff is enabled!", new Object[] {
                device.c()
            });
            flag = false;
        } else
        {
            flag = flag1;
            if (synctrigger == com.fitbit.serverinteraction.SynclairApi.SyncTrigger.c)
            {
                flag = flag1;
                if (!flag3)
                {
                    flag = flag1;
                    if (!device.u())
                    {
                        com.fitbit.e.a.a("GalileoSyncService", "Could not sync device %s. Background sync is disabled!", new Object[] {
                            device.c()
                        });
                        flag = false;
                    }
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (com.fitbit.util.p.d(device))
        {
            if (!com.fitbit.pedometer.e.h())
            {
                com.fitbit.e.a.a("GalileoSyncService", "Could not sync device %s. Pedometer is not supported by current device!", new Object[] {
                    device.c()
                });
                flag = false;
            } else
            if (!com.fitbit.util.p.e(device))
            {
                com.fitbit.e.a.a("GalileoSyncService", "Could not sync device %s. MotionBit tracker is not linked!", new Object[] {
                    device.c()
                });
                flag = false;
            } else
            {
                flag = flag1;
                if (((com.fitbit.galileo.a.a.a) (obj)).d())
                {
                    com.fitbit.e.a.a("GalileoSyncService", "Could not sync device %s. SoftTracker sync backoff is enabled!", new Object[] {
                        device.c()
                    });
                    flag = false;
                }
            }
        } else
        {
            com.fitbit.e.a.a("GalileoSyncService", "Could not sync device: %s. Not supported!", new Object[] {
                device.c()
            });
            flag = false;
        }
        if (true) goto _L8; else goto _L2
_L2:
        return a1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void a(long l1)
    {
        com.fitbit.e.a.d("GalileoSyncService", "Acquiring wake lock...", new Object[0]);
        if (p != null)
        {
            p.acquire(l1);
            com.fitbit.e.a.d("GalileoSyncService", "Wake lock is acquired.", new Object[0]);
            return;
        } else
        {
            com.fitbit.e.a.d("GalileoSyncService", "Unable to acquire wake lock: wakeLock is null.", new Object[0]);
            return;
        }
    }

    private void a(SyncMode syncmode, boolean flag)
    {
        a(syncmode, flag, (new Date()).getTime());
    }

    private void a(SyncMode syncmode, boolean flag, long l1)
    {
        com.fitbit.e.a.a("GalileoSyncService", "Reschedule service: %s, success = %s", new Object[] {
            syncmode, Boolean.valueOf(flag)
        });
        if (syncmode == com.fitbit.galileo.service.SyncMode.a)
        {
            TrackerSyncPreferencesSavedState.b(l1);
            b(syncmode, flag);
        }
        com.fitbit.multipledevice.a.a().g();
    }

    private static boolean a(a a1)
    {
        if (a1 != null && !a1.a.isEmpty())
        {
            for (Iterator iterator = a1.a.iterator(); iterator.hasNext();)
            {
                Device device = (Device)iterator.next();
                if (!a1.b.contains(device.c()))
                {
                    return false;
                }
            }

            return true;
        } else
        {
            return false;
        }
    }

    private void b(SyncMode syncmode, boolean flag)
    {
        if (syncmode == com.fitbit.galileo.service.SyncMode.a)
        {
            int i1 = TrackerSyncPreferencesSavedState.u();
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1++;
            }
            com.fitbit.e.a.a("GalileoSyncService", "Set background sync retry count to %s", new Object[] {
                Integer.valueOf(i1)
            });
            TrackerSyncPreferencesSavedState.b(i1);
        }
    }

    private void c()
    {
        a(com.fitbit.util.p.a(DeviceFeature.ALARMS));
    }

    private void d()
    {
        com.fitbit.widget.b.a(this);
        if (n != null && n.f())
        {
            Iterator iterator = n.g().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                GalileoSyncProcessor.c c1 = (GalileoSyncProcessor.c)iterator.next();
                if (c1.d != null)
                {
                    com.fitbit.serverinteraction.SynclairApi.FirmwareUpdateStatus firmwareupdatestatus = c1.d;
                    Intent intent = new Intent("ACTION_FW_UPDATE_STATUS_RECEIVED");
                    intent.putExtra("EXTRA_FW_UPDATE_STATUS", firmwareupdatestatus.getSerializableName());
                    intent.putExtra("EXTRA_FW_UPDATE_DEVICE", c1.a.b);
                    z.a(intent);
                }
            } while (true);
        }
        b(true);
    }

    private boolean e()
    {
        return com.fitbit.galileo.bluetooth.b.a().a(m);
    }

    private void f()
    {
        if (com.fitbit.galileo.bluetooth.b.a().b(m))
        {
            BluetoothConnectionController.a().b(com.fitbit.bluetooth.connection.BluetoothConnectionController.ConnectionConsumer.b);
        }
    }

    private void g()
    {
        com.fitbit.e.a.d("GalileoSyncService", "Creating non reference counted wake lock with tag = %s", new Object[] {
            "com.fitbit.galileo.GalileoSyncService.WAKE_LOCK"
        });
        p = b.newWakeLock(1, "com.fitbit.galileo.GalileoSyncService.WAKE_LOCK");
        p.setReferenceCounted(false);
    }

    private void h()
    {
        com.fitbit.e.a.d("GalileoSyncService", (new StringBuilder()).append("Releasing wake lock...").append(Thread.currentThread().getName()).toString(), new Object[0]);
        if (p != null)
        {
            try
            {
                p.release();
                p = null;
                com.fitbit.e.a.d("GalileoSyncService", "Wake lock is released.", new Object[0]);
                return;
            }
            catch (Throwable throwable)
            {
                com.fitbit.e.a.e("GalileoSyncService", "Unable to release wake lock.", throwable, new Object[0]);
            }
            return;
        } else
        {
            com.fitbit.e.a.d("GalileoSyncService", "Unable to release wake lock: wakeLock is null.", new Object[0]);
            return;
        }
    }

    protected void a()
    {
        if (o == null)
        {
            com.fitbit.e.a.a("GalileoSyncService", "currentCommandInfo is null. Stopping...", new Object[0]);
            b(false);
            return;
        }
        boolean flag = com.fitbit.util.p.a(o.a, DeviceFeature.WIRELESS_SYNC);
        if (flag && !com.fitbit.bluetooth.g.f())
        {
            com.fitbit.e.a.a("GalileoSyncService", "Bluetooth LE is not Supported!", new Object[0]);
            for (int i1 = 0; i1 < o.a.size();)
            {
                Device device = (Device)o.a.get(i1);
                if (device.a(DeviceFeature.WIRELESS_SYNC))
                {
                    o.a.remove(i1);
                    com.fitbit.e.a.a("GalileoSyncService", "Removing device %s from sync.", new Object[] {
                        device.c()
                    });
                } else
                {
                    i1++;
                }
            }

            if (o.a.isEmpty())
            {
                com.fitbit.e.a.a("GalileoSyncService", "There is no device to sync. Stopping...", new Object[0]);
                a(o.d, false);
                b(false);
                return;
            }
            if (a(o))
            {
                com.fitbit.e.a.a("GalileoSyncService", "All devices are synced recently. Stopping...", new Object[0]);
                a(o.d, false);
                b(false);
                return;
            }
            flag = false;
        }
        Object obj = new HashSet();
        for (Iterator iterator1 = o.a.iterator(); iterator1.hasNext(); ((Set) (obj)).add(((Device)iterator1.next()).c())) { }
        a.a(((Set) (obj)));
        a.a(o.c);
        obj = a;
        boolean flag1;
        if (flag && q)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((GalileoServicesStateListener) (obj)).a(flag1);
        com.fitbit.e.a.a("GalileoSyncService", "bluetoothNeeded = %s", new Object[] {
            Boolean.valueOf(flag)
        });
        if (flag && !e())
        {
            com.fitbit.e.a.a("GalileoSyncService", "Unable to start a BluetoothWorker. Stopping...", new Object[0]);
            a(o.d, false);
            b(false);
            return;
        }
        if (o.d == com.fitbit.galileo.service.SyncMode.a && o.c != com.fitbit.serverinteraction.SynclairApi.SyncTrigger.c)
        {
            a.d();
        } else
        {
            Iterator iterator = o.a.iterator();
            while (iterator.hasNext()) 
            {
                Device device1 = (Device)iterator.next();
                a.b(device1.c());
            }
        }
        n = new com.fitbit.galileo.service.a(o.a, m, o.c, a, this);
        c();
        if (n.h())
        {
            BluetoothErrorsHandler bluetootherrorshandler = BluetoothErrorsHandler.a();
            bluetootherrorshandler.a(false);
            bluetootherrorshandler.a(EnumSet.allOf(com/fitbit/bluetooth/BluetoothErrorsHandler$BluetoothError));
            return;
        } else
        {
            com.fitbit.e.a.a("GalileoSyncService", "Could not start sync. Stopping... ", new Object[0]);
            a(o.d, false);
            b(false);
            return;
        }
    }

    protected void a(com.fitbit.data.bl.SyncTrackerTask.SyncTrackerTaskTarget synctrackertasktarget)
    {
        com.fitbit.e.a.a("GalileoSyncService", "Galileo operation finished. Starting SyncTracker task with target: %s", new Object[] {
            synctrackertasktarget
        });
        a.a(com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.e);
        l = UUID.randomUUID();
        synctrackertasktarget = SyncTrackerTask.a(this, synctrackertasktarget);
        synctrackertasktarget.putExtra("com.fitbit.util.service.DispatcherService.GUID", l);
        startService(synctrackertasktarget);
        synctrackertasktarget = ((com.fitbit.data.bl.SyncTrackerTask.SyncTrackerTaskTarget) (k));
        synctrackertasktarget;
        JVM INSTR monitorenter ;
        k.wait(60000L);
_L2:
        com.fitbit.e.a.a("GalileoSyncService", "Completely synced", new Object[0]);
        d();
        return;
        Object obj;
        obj;
        com.fitbit.e.a.a("GalileoSyncService", "Interrupted: %s", ((Throwable) (obj)), new Object[] {
            ((InterruptedException) (obj)).getMessage()
        });
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        synctrackertasktarget;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public void a(GalileoSyncProcessor galileosyncprocessor)
    {
        boolean flag;
        long l1;
        boolean flag1;
        com.fitbit.e.a.a("GalileoSyncService", "All devices processed!", new Object[0]);
        galileosyncprocessor = galileosyncprocessor.g();
        l1 = (new Date()).getTime();
        galileosyncprocessor = galileosyncprocessor.iterator();
        flag = false;
        flag1 = false;
_L3:
        if (!galileosyncprocessor.hasNext()) goto _L2; else goto _L1
_L1:
        GalileoSyncProcessor.c c1 = (GalileoSyncProcessor.c)galileosyncprocessor.next();
        if (c1.b)
        {
            TrackerSyncPreferencesSavedState.a(c1.a.a, l1);
            if (!c1.a.d)
            {
                flag = true;
                flag1 = true;
            } else
            {
                flag1 = true;
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (flag)
        {
            dg.d().h();
        }
        if (o != null)
        {
            galileosyncprocessor = o.d;
        } else
        {
            galileosyncprocessor = com.fitbit.galileo.service.SyncMode.a;
        }
        a(((SyncMode) (galileosyncprocessor)), flag1, l1);
        galileosyncprocessor = BluetoothErrorsHandler.a();
        galileosyncprocessor.a(true);
        if (galileosyncprocessor.b())
        {
            com.fitbit.e.a.a("GalileoSyncService", "Has pending errors. Disconnecting...", new Object[0]);
            if (m != null)
            {
                m.a(new i());
            }
        }
        f();
        if (flag1)
        {
            if (flag)
            {
                galileosyncprocessor = com.fitbit.data.bl.SyncTrackerTask.SyncTrackerTaskTarget.a;
            } else
            {
                galileosyncprocessor = com.fitbit.data.bl.SyncTrackerTask.SyncTrackerTaskTarget.b;
            }
            a(((com.fitbit.data.bl.SyncTrackerTask.SyncTrackerTaskTarget) (galileosyncprocessor)));
            return;
        } else
        {
            b(false);
            return;
        }
    }

    protected void a(UUID uuid)
    {
        if (com.fitbit.util.b.a.a(19))
        {
            com.fitbit.multipledevice.a.a().g();
        }
        if (uuid.equals(l))
        {
            com.fitbit.e.a.a("GalileoSyncService", "syncWithServerTask finished", new Object[0]);
            l = null;
        }
        if (l == null)
        {
            synchronized (k)
            {
                k.notifyAll();
            }
            return;
        } else
        {
            return;
        }
        exception;
        uuid;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(boolean flag)
    {
        if (flag)
        {
            try
            {
                dg.d().f(true, null);
                return;
            }
            catch (Exception exception)
            {
                com.fitbit.e.a.f("GalileoSyncService", "Unable to sync pending objects", exception, new Object[0]);
            }
            break MISSING_BLOCK_LABEL_36;
        }
        dg.d().e(true, null);
        return;
    }

    protected void b()
    {
        h();
        f();
        o = null;
    }

    protected void b(boolean flag)
    {
        FitbitHandlerThread.a(new Runnable(flag) {

            final boolean a;
            final GalileoSyncService b;

            public void run()
            {
                com.fitbit.e.a.a("GalileoSyncService", "Stop service success[%s]", new Object[] {
                    Boolean.valueOf(a)
                });
                b.a.a(com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a);
                b.b();
                b.stopSelf();
            }

            
            {
                b = GalileoSyncService.this;
                a = flag;
                super();
            }
        });
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        com.fitbit.e.a.a("GalileoSyncService", "Create service.", new Object[0]);
        g();
        a.a();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK");
        intentfilter.addAction("com.fitbit.FitbitMobile.BluetoothSupportStatusController.ACTION_SUPPORT_STATUS_CHANGED");
        LocalBroadcastManager.getInstance(this).registerReceiver(r, intentfilter);
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.fitbit.e.a.a("GalileoSyncService", "Destroy service.", new Object[0]);
        a.b();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(r);
        b();
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        com.fitbit.e.a.a("GalileoSyncService", "Starting Galileo Sync command.", new Object[0]);
        if (a.c() != com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a)
        {
            com.fitbit.e.a.a("GalileoSyncService", "Unable to execute Galileo Sync command: Previous operation is in progress.", new Object[0]);
        } else
        {
            if (intent == null)
            {
                com.fitbit.e.a.a("GalileoSyncService", "Empty intent!", new Object[0]);
                com.fitbit.multipledevice.a.a().g();
                stopSelf();
                return 3;
            }
            a a1 = a(intent);
            if (a1.a.isEmpty())
            {
                com.fitbit.e.a.a("GalileoSyncService", "There is no device to sync.", new Object[0]);
                a(a1.d, false);
                stopSelf();
                return 3;
            }
            if (!ar.c(getApplicationContext()))
            {
                com.fitbit.e.a.a("GalileoSyncService", "No network connection!", new Object[0]);
                a(a1.d, false);
                stopSelf();
                return 3;
            }
            if (a(a1))
            {
                com.fitbit.e.a.a("GalileoSyncService", "All devices are synced recently. Updating scheduler...", new Object[0]);
                com.fitbit.multipledevice.a.a().g();
                stopSelf();
                return 3;
            }
            a.a(com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.b);
            o = a1;
            com.fitbit.e.a.a("GalileoSyncService", "Executing Galileo Sync command...", new Object[0]);
            a(0x927c0L);
            q = intent.getBooleanExtra("com.fitbit.galileo.GalileoSyncService.EXTRA_RESTART_BT_IF_NEEDED", false);
            if (com.fitbit.bluetooth.support.a.a().b().a().equals(com.fitbit.bluetooth.support.BluetoothSupportStatus.SupportLevel.a))
            {
                if (s == null || s.getStatus().equals(android.os.AsyncTask.Status.FINISHED) || s.getStatus().equals(android.os.AsyncTask.Status.PENDING))
                {
                    s = new AsyncTask() {

                        final GalileoSyncService a;

                        protected transient Void a(Void avoid[])
                        {
                            try
                            {
                                dg.d().z(true, null);
                            }
                            // Misplaced declaration of an exception variable
                            catch (Void avoid[])
                            {
                                com.fitbit.e.a.a("GalileoSyncService", "Server communication error syncing bt support status", avoid, new Object[0]);
                                avoid.printStackTrace();
                                return null;
                            }
                            // Misplaced declaration of an exception variable
                            catch (Void avoid[])
                            {
                                com.fitbit.e.a.a("GalileoSyncService", "JSON error syncing bt support status", avoid, new Object[0]);
                                avoid.printStackTrace();
                                return null;
                            }
                            return null;
                        }

                        protected Object doInBackground(Object aobj[])
                        {
                            return a((Void[])aobj);
                        }

            
            {
                a = GalileoSyncService.this;
                super();
            }
                    };
                    s.execute(new Void[0]);
                    return 3;
                }
            } else
            {
                ag.b().execute(this);
                return 3;
            }
        }
        return 3;
    }

    public void run()
    {
        a();
    }

}
