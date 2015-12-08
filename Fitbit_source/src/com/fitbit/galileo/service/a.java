// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.text.TextUtils;
import com.fitbit.data.domain.device.Device;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.bluetooth.GalileoTaskExecutor;
import com.fitbit.galileo.c;
import com.fitbit.galileo.tasks.z;
import com.fitbit.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncProcessor, GalileoServicesStateListener

public class a extends GalileoSyncProcessor
{

    private final String d;
    private com.fitbit.galileo.protocol.c e;
    private GalileoTaskExecutor f;
    private final List g;
    private int h;

    public a(List list, BluetoothWorker bluetoothworker, com.fitbit.serverinteraction.SynclairApi.SyncTrigger synctrigger, GalileoServicesStateListener galileoservicesstatelistener, GalileoSyncProcessor.b b1)
    {
        super(bluetoothworker, synctrigger, galileoservicesstatelistener, b1);
        d = "GalileoMultipleDeviceSyncProcessor";
        g = new ArrayList();
        h = -1;
        bluetoothworker = list.iterator();
_L4:
        if (!bluetoothworker.hasNext()) goto _L2; else goto _L1
_L1:
        if (((Device)bluetoothworker.next()).u()) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        if (flag)
        {
            p.d(list);
        }
    /* block-local class not found */
    class a {}

        for (list = list.iterator(); list.hasNext(); g.add(new a(bluetoothworker)))
        {
            bluetoothworker = (Device)list.next();
        }

        return;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static GalileoTaskExecutor a(a a1, GalileoTaskExecutor galileotaskexecutor)
    {
        a1.f = galileotaskexecutor;
        return galileotaskexecutor;
    }

    static List a(a a1)
    {
        return a1.g;
    }

    static void b(a a1)
    {
        a1.j();
    }

    static void c(a a1)
    {
        a1.k();
    }

    static int d(a a1)
    {
        return a1.h;
    }

    private void i()
    {
        ArrayList arraylist;
        Object obj;
        Iterator iterator;
        com.fitbit.e.a.a("GalileoMultipleDeviceSyncProcessor", "searchDevices()", new Object[0]);
        arraylist = new ArrayList();
        obj = g.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            a a1 = (a)((Iterator) (obj)).next();
            if (!a1.a.d && !TextUtils.isEmpty(a1.a.b))
            {
                arraylist.add(a1.a.b);
            }
        } while (true);
        if (arraylist.size() < 1)
        {
            com.fitbit.e.a.a("GalileoMultipleDeviceSyncProcessor", "No need to search bluetooth devices", new Object[0]);
            j();
            return;
        }
        com.fitbit.e.a.a("GalileoMultipleDeviceSyncProcessor", "Trackers to search: %s", new Object[] {
            arraylist
        });
        obj = com.fitbit.galileo.c.a();
        iterator = arraylist.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (((c) (obj)).b((String)iterator.next())) goto _L4; else goto _L3
_L3:
        boolean flag = false;
_L6:
        if (flag)
        {
            com.fitbit.e.a.a("GalileoMultipleDeviceSyncProcessor", "The cache contains all required trackers. No need to perform a search operation.", new Object[0]);
            j();
            return;
        } else
        {
            f = new _cls1(new z(arraylist), b, com.fitbit.util.threading.FitbitHandlerThread.ThreadName.b);
            f.g();
            return;
        }
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void j()
    {
        h = h + 1;
        com.fitbit.e.a.a("GalileoMultipleDeviceSyncProcessor", "Processing: %s", new Object[] {
            Integer.valueOf(h)
        });
        if (h < 0)
        {
            k();
            return;
        }
        if (h >= g.size())
        {
            k();
            return;
        }
        a a1 = (a)g.get(h);
        if (a1.a())
        {
            com.fitbit.e.a.a("GalileoMultipleDeviceSyncProcessor", "Item is already processed: %s", new Object[] {
                a1
            });
            j();
            return;
        }
        a.c(a1.a.a);
        a.a(GalileoServicesStateListener.GalileoState.d);
        if (a1.a.d)
        {
            a1.b = a(a1.a);
            com.fitbit.e.a.a("GalileoMultipleDeviceSyncProcessor", "Motionbit synced: %s", new Object[] {
                a1
            });
            j();
            return;
        } else
        {
            e = com.fitbit.galileo.protocol.c.a(b, a1.a.c, a1.a.b, new _cls2(a1), c);
            return;
        }
    }

    private void k()
    {
        com.fitbit.e.a.a("GalileoMultipleDeviceSyncProcessor", "finishNow()", new Object[0]);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = g.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (a1.a())
            {
                arraylist.add(a1.b);
            }
        } while (true);
        a(arraylist);
    }

    protected void a()
    {
        com.fitbit.e.a.a("GalileoMultipleDeviceSyncProcessor", "Total count: %s", new Object[] {
            Integer.valueOf(g.size())
        });
        i();
    }

    protected void b()
    {
        f = null;
        e = null;
    }

    protected String c()
    {
        return "GalileoMultipleDeviceSyncProcessor";
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
