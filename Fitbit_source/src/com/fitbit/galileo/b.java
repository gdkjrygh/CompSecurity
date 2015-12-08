// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.os.ParcelUuid;
import bluetooth.le.BluetoothLeScanCallbacks;
import bluetooth.le.external.ScanResult;
import bluetooth.le.external.e;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.bluetooth.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.bluetooth.galileo.c;
import com.fitbit.util.b.a;
import com.fitbit.util.threading.FitbitHandlerThread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.fitbit.galileo:
//            GalileoTracker

public class b
    implements BluetoothLeScanCallbacks, com.fitbit.bluetooth.a.a
{
    public static interface a
    {

        public abstract void a(List list);

        public abstract boolean a(GalileoTracker galileotracker);
    }


    private static final String a = "GalileoScanner";
    private final com.fitbit.bluetooth.a b;
    private final bluetooth.le.b c;
    private final a d;
    private List e;
    private volatile boolean f;
    private long g;

    public b(a a1, com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname)
    {
        e = new ArrayList();
        g = 12000L;
        if (com.fitbit.util.b.a.a(18))
        {
            b = null;
            threadname = FitbitHandlerThread.b(threadname);
            c = bluetooth.le.b.a(FitBitApplication.a().getApplicationContext(), this, threadname.getLooper());
        } else
        {
            b = new com.fitbit.bluetooth.a(threadname);
            c = null;
        }
        d = a1;
    }

    public b(a a1, com.fitbit.util.threading.FitbitHandlerThread.ThreadName threadname, long l)
    {
        e = new ArrayList();
        g = 12000L;
        if (com.fitbit.util.b.a.a(18))
        {
            b = null;
            threadname = FitbitHandlerThread.b(threadname);
            c = bluetooth.le.b.a(FitBitApplication.a().getApplicationContext(), this, threadname.getLooper());
        } else
        {
            b = new com.fitbit.bluetooth.a(threadname, l);
            c = null;
        }
        d = a1;
        g = l;
    }

    private boolean a(BluetoothDevice bluetoothdevice, int i, byte abyte0[], UUID uuid)
    {
        boolean flag = false;
        com.fitbit.e.a.a("GalileoScanner", "Process device: %s; uuid: %s", new Object[] {
            bluetoothdevice, uuid
        });
        if (com.fitbit.bluetooth.galileo.c.a(bluetoothdevice, uuid))
        {
            GalileoTracker galileotracker = null;
            Iterator iterator = e.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                GalileoTracker galileotracker1 = (GalileoTracker)iterator.next();
                if (galileotracker1.a().getAddress().equals(bluetoothdevice.getAddress()))
                {
                    galileotracker = galileotracker1;
                }
            } while (true);
            GalileoTracker galileotracker2 = galileotracker;
            if (galileotracker == null)
            {
                galileotracker2 = new GalileoTracker(bluetoothdevice);
            }
            galileotracker2.a(i);
            galileotracker2.a(abyte0);
            galileotracker2.a(uuid);
            if (!e.contains(galileotracker2))
            {
                e.add(galileotracker2);
            }
            flag = d.a(galileotracker2);
        }
        return flag;
    }

    public void A_()
    {
        com.fitbit.e.a.a("GalileoScanner", "onScanStarted", new Object[0]);
        f = true;
    }

    public void B_()
    {
        com.fitbit.e.a.d("GalileoScanner", "onScanEnded", new Object[0]);
        f = false;
        if (e.isEmpty())
        {
            com.fitbit.bluetooth.g.b();
        }
        d.a(e);
    }

    public void C_()
    {
        this;
        JVM INSTR monitorenter ;
        com.fitbit.e.a.a("GalileoScanner", "Scan finished: found %s unique trackers. They are: %s", new Object[] {
            Integer.valueOf(e.size()), e
        });
        if (e.isEmpty())
        {
            com.fitbit.bluetooth.g.b();
        }
        if (f)
        {
            f = false;
            d.a(e);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(bluetooth.le.BluetoothLeScanCallbacks.ScanError scanerror)
    {
        com.fitbit.e.a.a("GalileoScanner", (new StringBuilder()).append("onError: ").append(scanerror).toString(), new Object[0]);
    }

    public void a(List list)
    {
        com.fitbit.e.a.a("GalileoScanner", (new StringBuilder()).append("onResults size: ").append(list.size()).toString(), new Object[0]);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ScanResult scanresult = (ScanResult)iterator.next();
            list = null;
            Iterator iterator1 = e.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                GalileoTracker galileotracker = (GalileoTracker)iterator1.next();
                com.fitbit.e.a.a("GalileoScanner", "foundTracker(%s), scannedTracker(%s))", new Object[] {
                    galileotracker.a().getAddress(), scanresult.a().getAddress()
                });
                if (galileotracker.a().getAddress().equals(scanresult.a().getAddress()))
                {
                    list = galileotracker;
                }
            } while (true);
            Object obj = list;
            if (list == null)
            {
                obj = new GalileoTracker(scanresult.a());
            }
            ((GalileoTracker) (obj)).a(scanresult.c());
            if (scanresult.b() != null)
            {
                ((GalileoTracker) (obj)).a(scanresult.b().g());
                list = scanresult.b().b();
                if (list != null)
                {
                    list = list.iterator();
                    do
                    {
                        if (!list.hasNext())
                        {
                            break;
                        }
                        ParcelUuid parceluuid = (ParcelUuid)list.next();
                        if (com.fitbit.bluetooth.galileo.c.a(scanresult.a(), parceluuid.getUuid()))
                        {
                            ((GalileoTracker) (obj)).a(parceluuid);
                        }
                    } while (true);
                } else
                {
                    com.fitbit.e.a.e("GalileoScanner", "onResults no serviceUuids found!", new Object[0]);
                }
            }
            if (!e.contains(obj))
            {
                e.add(obj);
            }
            if (d.a(((GalileoTracker) (obj))))
            {
                com.fitbit.e.a.a("GalileoScanner", "Tracker found!", new Object[0]);
                f = false;
                try
                {
                    c.a();
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    FitBitApplication.a().c().a(0x7f11000b).b("google_bt_crash");
                    com.fitbit.e.a.e("GalileoScanner", "stopScan failed!", list, new Object[0]);
                }
            }
        } while (true);
    }

    public boolean a(BluetoothDevice bluetoothdevice, int i, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        com.fitbit.e.a.a("GalileoScanner", "Device found: %s", new Object[] {
            bluetoothdevice
        });
        List list = com.fitbit.bluetooth.a.a.c(bluetoothdevice);
        if (list.size() > 0)
        {
            com.fitbit.e.a.a("GalileoScanner", "UUIDs: %s", new Object[] {
                list
            });
        }
        obj = list.iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        UUID uuid = (UUID)((Iterator) (obj)).next();
        if (!com.fitbit.bluetooth.galileo.c.a(bluetoothdevice, uuid)) goto _L4; else goto _L3
_L3:
        obj = uuid;
        if (uuid != null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = uuid;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        obj = com.fitbit.bluetooth.broadcom.a.a(abyte0);
        boolean flag = a(bluetoothdevice, i, abyte0, ((UUID) (obj)));
        this;
        JVM INSTR monitorexit ;
        return flag;
        bluetoothdevice;
        throw bluetoothdevice;
_L2:
        uuid = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean d()
    {
        com.fitbit.e.a.a("GalileoScanner", "Start scan.", new Object[0]);
        e.clear();
        if (b != null)
        {
            if (b.a(this))
            {
                f = true;
                return true;
            } else
            {
                return false;
            }
        } else
        {
            bluetooth.le.external.ScanFilter scanfilter = (new bluetooth.le.external.ScanFilter.a()).a(new ParcelUuid(GalileoProfile.l), new ParcelUuid(GalileoProfile.m)).a();
            c.a(Collections.singletonList(scanfilter), (new bluetooth.le.external.ScanSettings.a()).a(1).b(g).a());
            return true;
        }
    }

    public void e()
    {
        if (!f)
        {
            return;
        }
        com.fitbit.e.a.a("GalileoScanner", "Stop scan.", new Object[0]);
        f = false;
        if (b != null)
        {
            b.a();
            return;
        } else
        {
            c.a();
            return;
        }
    }
}
