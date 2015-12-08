// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.e.a;
import com.fitbit.multipledevice.MultipleDeviceMode;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.util.p;
import com.fitbit.util.service.f;
import com.fitbit.util.threading.c;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.service:
//            e, GalileoSyncService

public class d
    implements f
{

    private c b;
    private boolean c;
    private MultipleDeviceMode d;

    public d()
    {
        b = new c() {

            final d a;

            public void a(Intent intent)
            {
                String s = intent.getAction();
                d d1 = a;
                d1;
                JVM INSTR monitorenter ;
                if (!"com.fitbit.galileo.GALILEO_PROTOCOL_BACKOFF_ALL_CHANGED".equals(s)) goto _L2; else goto _L1
_L1:
                if (com.fitbit.galileo.service.d.a(a).a())
                {
                    d.b(a);
                }
_L3:
                return;
_L2:
                if (!"com.fitbit.galileo.GALILEO_PROTOCOL_BACKOFF_SYNC_CHANGED".equals(s))
                {
                    break MISSING_BLOCK_LABEL_81;
                }
                if (com.fitbit.galileo.service.d.a(a).a())
                {
                    d.b(a);
                }
                  goto _L3
                intent;
                d1;
                JVM INSTR monitorexit ;
                throw intent;
                if (!"com.fitbit.galileo.GALILEO_SYNC_BACKGROUND_SYNC_OPTION_CHANGED".equals(s)) goto _L5; else goto _L4
_L4:
                if (com.fitbit.galileo.service.d.a(a).a())
                {
                    boolean flag = intent.getBooleanExtra("com.fitbit.galileo.EXTRA_SUCCESS", false);
                    com.fitbit.galileo.service.d.a(a, flag);
                }
                  goto _L3
_L5:
                if (!"com.fitbit.SavedState.SoftTrackerData.ACTION_SYNC_BACKOFF_STATE_CHANGED".equals(s) || !com.fitbit.galileo.service.d.a(a).b()) goto _L3; else goto _L6
_L6:
                d.b(a);
                  goto _L3
            }

            
            {
                a = d.this;
                super();
            }
        };
        d = MultipleDeviceMode.a;
    }

    private long a(com.fitbit.galileo.a.a.a a1)
    {
        if (a1 != null)
        {
            if (d == MultipleDeviceMode.c)
            {
                return a1.a();
            }
            if (d == MultipleDeviceMode.d)
            {
                return a1.c();
            }
            if (d == MultipleDeviceMode.b)
            {
                return a1.e();
            }
        }
        return 0L;
    }

    static MultipleDeviceMode a(d d1)
    {
        return d1.d;
    }

    private void a(long l)
    {
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] Scheduling sync with offset from now: %s msec(%s sec)", new Object[] {
            Long.valueOf(l), Long.valueOf(l / 1000L)
        });
        TrackerSyncPreferencesSavedState.a((new Date()).getTime() + l);
        com.fitbit.a.a.b(FitBitApplication.a(), l, com.fitbit.galileo.service.GalileoSyncService.SyncMode.a, com.fitbit.serverinteraction.SynclairApi.SyncTrigger.c, null, false, false);
    }

    static void a(d d1, boolean flag)
    {
        d1.b(flag);
    }

    static void b(d d1)
    {
        d1.g();
    }

    private void b(boolean flag)
    {
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] Background sync option changed. Rescheduling service...", new Object[0]);
        h();
    }

    private void e()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.galileo.GALILEO_PROTOCOL_BACKOFF_ALL_CHANGED");
        intentfilter.addAction("com.fitbit.galileo.GALILEO_PROTOCOL_BACKOFF_SYNC_CHANGED");
        intentfilter.addAction("com.fitbit.galileo.GALILEO_SYNC_BACKGROUND_SYNC_OPTION_CHANGED");
        intentfilter.addAction("com.fitbit.SavedState.SoftTrackerData.ACTION_SYNC_BACKOFF_STATE_CHANGED");
        b.a(intentfilter);
    }

    private void f()
    {
        b.d();
    }

    private void g()
    {
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] Backoff configuration changed. Rescheduling service...", new Object[0]);
        h();
    }

    private boolean h()
    {
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] Scheduling sync", new Object[0]);
        j();
        if (c)
        {
            com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] Warning: scheduler is paused.", new Object[0]);
            return false;
        }
        if (d == MultipleDeviceMode.a)
        {
            com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] Warning: currentMode == %s", new Object[] {
                MultipleDeviceMode.a
            });
            return false;
        }
        Long long1 = i();
        if (long1 == null)
        {
            com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] Warning: there is no device to sync", new Object[0]);
            return false;
        } else
        {
            long l = a(com.fitbit.galileo.a.a.c());
            a(Math.max(long1.longValue(), l));
            return true;
        }
    }

    private Long i()
    {
        Object obj1 = p.d();
        Object obj = new ArrayList();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Device device = (Device)((Iterator) (obj1)).next();
            if (device.a(DeviceFeature.WIRELESS_SYNC))
            {
                if (d.a() && device.u())
                {
                    ((List) (obj)).add(device);
                }
            } else
            if (p.e(device) && d.b())
            {
                ((List) (obj)).add(device);
            }
        } while (true);
        if (((List) (obj)).isEmpty())
        {
            return null;
        }
        long l3 = (long)TrackerSyncPreferencesSavedState.v() * 60000L;
        long l = TrackerSyncPreferencesSavedState.w();
        int k = TrackerSyncPreferencesSavedState.u();
        if (d == MultipleDeviceMode.d && !((PowerManager)FitBitApplication.a().getSystemService("power")).isScreenOn())
        {
            k = 0;
        }
        if (k == 0)
        {
            l += l3;
        } else
        {
            l = (new e(2, l3)).a(k - 1) + l;
        }
        obj1 = ((List) (obj)).iterator();
        obj = null;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            long l1 = TrackerSyncPreferencesSavedState.e(((Device)((Iterator) (obj1)).next()).c());
            if (obj == null || l1 < ((Long) (obj)).longValue())
            {
                obj = Long.valueOf(l1);
            }
        } while (true);
        long l2 = l;
        if (obj != null)
        {
            l2 = Math.max(l, ((Long) (obj)).longValue() + l3);
        }
        l2 -= (new Date()).getTime();
        l = l2;
        if (l2 < 0L)
        {
            l = 0L;
        }
        return Long.valueOf(l);
    }

    private void j()
    {
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC]  Remove service from schedule.", new Object[0]);
        com.fitbit.a.a.b(FitBitApplication.a());
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] stopScheduler()", new Object[0]);
        f();
        j();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(MultipleDeviceMode multipledevicemode)
    {
        this;
        JVM INSTR monitorenter ;
        if (multipledevicemode == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (d != multipledevicemode)
        {
            com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] Mode changed to: %s", new Object[] {
                multipledevicemode
            });
            d = multipledevicemode;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        multipledevicemode;
        throw multipledevicemode;
    }

    public boolean a(GalileoSyncService.SyncMode syncmode, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, String s, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        this;
        JVM INSTR monitorenter ;
        if (flag1) goto _L2; else goto _L1
_L1:
        if (!c) goto _L2; else goto _L3
_L3:
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC]  Unable to start force sync: scheduler is paused", new Object[0]);
        flag = flag2;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Object obj;
        long l;
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] Start force sync (%s, %s, %s)", new Object[] {
            synctrigger, syncmode, s
        });
        obj = com.fitbit.galileo.a.a.c();
        if (syncmode != com.fitbit.galileo.service.GalileoSyncService.SyncMode.a)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        l = a(((com.fitbit.galileo.a.a.a) (obj)));
        TrackerSyncPreferencesSavedState.b(0);
_L4:
        obj = FitBitApplication.a();
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC]  Unable to start force sync: backoff not expired. Scheduling force sync with offset from now: %s msec", new Object[] {
            Long.valueOf(l)
        });
        com.fitbit.a.a.a(((Context) (obj)), l, syncmode, synctrigger, s, true, flag);
        flag = flag2;
        continue; /* Loop/switch isn't completed */
        syncmode;
        throw syncmode;
        l = ((com.fitbit.galileo.a.a.a) (obj)).a();
          goto _L4
        ((Context) (obj)).startService(com.fitbit.galileo.service.GalileoSyncService.a(((Context) (obj)), syncmode, synctrigger, s, true, flag));
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean a(boolean flag)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] startScheduler()", new Object[0]);
        e();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        flag1 = h();
        this;
        JVM INSTR monitorexit ;
        return flag1;
        Exception exception;
        exception;
        throw exception;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] paused", new Object[0]);
            c = true;
            j();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (c)
        {
            com.fitbit.e.a.a("ServiceScheduler", "[TRACKERS SYNC] resumed", new Object[0]);
            c = false;
            h();
        }
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
        h();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
