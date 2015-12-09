// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.e;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.device.FirmwareVersion;
import com.fitbit.data.domain.device.c;
import com.fitbit.dncs.domain.TrackerBondState;
import com.fitbit.dncs.service.DncsPairingError;
import com.fitbit.dncs.service.DncsPairingService;
import com.fitbit.e.a;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.b;
import com.fitbit.util.bh;
import com.fitbit.util.p;
import com.fitbit.util.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.dncs:
//            DncsHelper, c, NotificationManager

public class DncsPairingManager
{
    public static class DncsPairingTaskInfo
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public DncsPairingTaskInfo a(Parcel parcel)
            {
                String s = parcel.readString();
                DncsPairingType dncspairingtype = (DncsPairingType)parcel.readParcelable(com/fitbit/dncs/DncsPairingManager$DncsPairingType.getClassLoader());
                int k = parcel.readInt();
                if (s != null && dncspairingtype != null)
                {
                    return new DncsPairingTaskInfo(s, dncspairingtype, k);
                } else
                {
                    return null;
                }
            }

            public DncsPairingTaskInfo[] a(int k)
            {
                return new DncsPairingTaskInfo[k];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int k)
            {
                return a(k);
            }

        };
        public final String a;
        public final DncsPairingType b;
        public final int c;

        public int describeContents()
        {
            return 0;
        }

        public String toString()
        {
            return (new StringBuilder()).append(a).append("(").append(b).append(", ").append(c).append(")").toString();
        }

        public void writeToParcel(Parcel parcel, int k)
        {
            parcel.writeString(a);
            parcel.writeParcelable(b, k);
            parcel.writeInt(c);
        }


        private DncsPairingTaskInfo(String s, DncsPairingType dncspairingtype)
        {
            this(s, dncspairingtype, 0);
        }

        private DncsPairingTaskInfo(String s, DncsPairingType dncspairingtype, int k)
        {
            a = s;
            b = dncspairingtype;
            c = k;
        }


    }

    public static final class DncsPairingType extends Enum
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        public static final DncsPairingType a;
        public static final DncsPairingType b;
        public static final DncsPairingType c;
        private static final DncsPairingType d[];

        public static DncsPairingType valueOf(String s)
        {
            return (DncsPairingType)Enum.valueOf(com/fitbit/dncs/DncsPairingManager$DncsPairingType, s);
        }

        public static DncsPairingType[] values()
        {
            return (DncsPairingType[])d.clone();
        }

        public boolean a()
        {
            return this == a || this == b;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int k)
        {
            parcel.writeString(name());
        }

        static 
        {
            a = new DncsPairingType("AUTO_PAIRING", 0);
            b = new DncsPairingType("PAIRING", 1);
            c = new DncsPairingType("UNPAIRING", 2);
            d = (new DncsPairingType[] {
                a, b, c
            });
        /* block-local class not found */
        class _cls1 {}

        }

        private DncsPairingType(String s, int k)
        {
            super(s, k);
        }
    }

    private static class a
    {

        public static DncsPairingManager a = new DncsPairingManager();


        private a()
        {
        }
    }


    public static final String a = (new StringBuilder()).append(com/fitbit/dncs/DncsPairingManager.getCanonicalName()).append(".ACTION_CHANGED").toString();
    private static final String b = "DncsPairingManager";
    private final List c;
    private final Object d;
    private boolean e;
    private final com.fitbit.util.threading.c f;
    private final com.fitbit.util.threading.c g;
    private final e h;
    private final com.fitbit.util.threading.c i;
    private final com.fitbit.util.threading.c j;

    private DncsPairingManager()
    {
        c = new ArrayList();
        d = new Object();
        e = false;
        f = new com.fitbit.util.threading.c() {

            final DncsPairingManager a;

            public void a(Intent intent)
            {
                Object obj;
                obj = intent.getAction();
                if (!"com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_STARTED".equals(obj))
                {
                    break MISSING_BLOCK_LABEL_83;
                }
                obj = DncsPairingService.a(intent);
                intent = ((Intent) (com.fitbit.dncs.DncsPairingManager.a(a)));
                intent;
                JVM INSTR monitorenter ;
                obj = com.fitbit.dncs.DncsPairingManager.a(a, ((DncsPairingTaskInfo) (obj)));
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_75;
                }
                DncsPairingTaskInfo dncspairingtaskinfo = new DncsPairingTaskInfo(((DncsPairingTaskInfo) (obj)).a, ((DncsPairingTaskInfo) (obj)).b, ((DncsPairingTaskInfo) (obj)).c + 1);
                com.fitbit.dncs.DncsPairingManager.a(a, ((DncsPairingTaskInfo) (obj)), dncspairingtaskinfo, false);
                intent;
                JVM INSTR monitorexit ;
                return;
                obj;
                intent;
                JVM INSTR monitorexit ;
                throw obj;
                DncsPairingError dncspairingerror;
                if (!"com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED".equals(obj))
                {
                    break MISSING_BLOCK_LABEL_152;
                }
                obj = DncsPairingService.a(intent);
                dncspairingerror = DncsPairingService.b(intent);
                intent = ((Intent) (com.fitbit.dncs.DncsPairingManager.a(a)));
                intent;
                JVM INSTR monitorenter ;
                obj = com.fitbit.dncs.DncsPairingManager.a(a, ((DncsPairingTaskInfo) (obj)));
                if (obj == null)
                {
                    break MISSING_BLOCK_LABEL_144;
                }
                if (dncspairingerror == null)
                {
                    break MISSING_BLOCK_LABEL_136;
                }
                if (com.fitbit.dncs.DncsPairingManager.a(dncspairingerror))
                {
                    break MISSING_BLOCK_LABEL_144;
                }
                com.fitbit.dncs.DncsPairingManager.b(a, ((DncsPairingTaskInfo) (obj)));
                intent;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                intent;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = DncsPairingManager.this;
                super();
            }
        };
        g = new com.fitbit.util.threading.c() {

            final DncsPairingManager a;

            protected void a(Intent intent)
            {
                if ("com.fitbit.galileo.tasks.BluetoothWorkersManager.ACTION_WORKER_STOPPED".equals(intent.getAction()) && !com.fitbit.galileo.bluetooth.b.a().b())
                {
                    intent = com.fitbit.galileo.bluetooth.b.b.a(intent);
                    if (intent.c() && intent != com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.f && intent != com.fitbit.galileo.bluetooth.BluetoothWorker.BluetoothWorkerName.g)
                    {
                        com.fitbit.dncs.DncsPairingManager.a(a, false);
                    }
                }
            }

            
            {
                a = DncsPairingManager.this;
                super();
            }
        };
        h = new e() {

            final DncsPairingManager a;

            protected void b()
            {
                com.fitbit.dncs.DncsPairingManager.a(a, false);
            }

            
            {
                a = DncsPairingManager.this;
                super();
            }
        };
        i = new com.fitbit.util.threading.c() {

            final DncsPairingManager a;

            protected void a(Intent intent)
            {
                intent.getAction();
                if (!com.fitbit.bluetooth.g.h())
                {
                    com.fitbit.dncs.DncsPairingManager.a(a, false);
                }
            }

            
            {
                a = DncsPairingManager.this;
                super();
            }
        };
        j = new com.fitbit.util.threading.c() {

            final DncsPairingManager a;

            protected void a(Intent intent)
            {
                if (com.fitbit.savedstate.g.b.equals(intent.getAction()))
                {
                    Object obj = intent.getStringExtra(com.fitbit.savedstate.g.c);
                    TrackerBondState trackerbondstate = (TrackerBondState)intent.getParcelableExtra(com.fitbit.savedstate.g.d);
                    intent = (TrackerBondState)intent.getParcelableExtra(com.fitbit.savedstate.g.e);
                    if (obj != null && trackerbondstate == null && intent != null)
                    {
                        obj = p.c(((String) (obj)));
                        if (obj != null)
                        {
                            synchronized (com.fitbit.dncs.DncsPairingManager.a(a))
                            {
                                if (a.a(((Device) (obj)).c()) != null)
                                {
                                    com.fitbit.dncs.DncsPairingManager.a(a, false);
                                }
                            }
                            return;
                        }
                    }
                }
                break MISSING_BLOCK_LABEL_104;
                exception;
                intent;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = DncsPairingManager.this;
                super();
            }
        };
        Iterator iterator = p.b(DeviceFeature.NOTIFICATIONS).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Device device = (Device)iterator.next();
            if (com.fitbit.dncs.DncsHelper.a(device.d()) == TrackerBondState.b)
            {
                com.fitbit.dncs.c.a().a(device.d(), GalileoTrackerType.a(device.j()));
            }
        } while (true);
    }


    private DncsPairingTaskInfo a(DncsPairingTaskInfo dncspairingtaskinfo)
    {
        if (dncspairingtaskinfo != null && dncspairingtaskinfo.b != null)
        {
            DncsPairingTaskInfo dncspairingtaskinfo1 = a(dncspairingtaskinfo.a);
            if (dncspairingtaskinfo1 != null && dncspairingtaskinfo1.b.a() == dncspairingtaskinfo.b.a())
            {
                return dncspairingtaskinfo1;
            }
        }
        return null;
    }

    static DncsPairingTaskInfo a(DncsPairingManager dncspairingmanager, DncsPairingTaskInfo dncspairingtaskinfo)
    {
        return dncspairingmanager.a(dncspairingtaskinfo);
    }

    public static DncsPairingManager a()
    {
        return com.fitbit.dncs.a.a;
    }

    static Object a(DncsPairingManager dncspairingmanager)
    {
        return dncspairingmanager.d;
    }

    private void a(Device device, Device device1)
    {
        NotificationManager.NotificationsStatus notificationsstatus;
        com.fitbit.e.a.a("DncsPairingManager", "onDeviceUpdated: %s", new Object[] {
            device.c()
        });
        notificationsstatus = com.fitbit.dncs.NotificationManager.a().b(device);
        if (com.fitbit.dncs.NotificationManager.a().b(device1) != com.fitbit.dncs.NotificationManager.NotificationsStatus.b || !p.f(device1)) goto _L2; else goto _L1
_L1:
        if (device.m().a().equals(device1.m().a())) goto _L4; else goto _L3
_L3:
        if (notificationsstatus.a()) goto _L6; else goto _L5
_L5:
        com.fitbit.e.a.a("DncsPairingManager", "Autobonding: Updating a tracker that didn't support bonding before update.", new Object[0]);
        a(device1, com.fitbit.dncs.DncsPairingType.a);
_L2:
        return;
_L6:
        if (p.f(device))
        {
            com.fitbit.e.a.a("DncsPairingManager", "Autobonding: Updating a tracker that was bonded to this device and now isn't bonded (because FWUP can wipe out bonding data)", new Object[0]);
            a(device1, com.fitbit.dncs.DncsPairingType.a);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!p.f(device))
        {
            com.fitbit.e.a.a("DncsPairingManager", "Autobonding: Notifications was enabled on the tracker", new Object[0]);
            a(device1, com.fitbit.dncs.DncsPairingType.a);
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    private void a(DncsPairingTaskInfo dncspairingtaskinfo, DncsPairingTaskInfo dncspairingtaskinfo1, boolean flag)
    {
        if (dncspairingtaskinfo == null || dncspairingtaskinfo1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        int k = c.indexOf(dncspairingtaskinfo);
        if (k < 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        com.fitbit.e.a.a("DncsPairingManager", "Task %s replaced with %s", new Object[] {
            dncspairingtaskinfo, dncspairingtaskinfo1
        });
        c.set(k, dncspairingtaskinfo1);
        a(flag);
        obj;
        JVM INSTR monitorexit ;
        return;
        dncspairingtaskinfo;
        obj;
        JVM INSTR monitorexit ;
        throw dncspairingtaskinfo;
    }

    static void a(DncsPairingManager dncspairingmanager, DncsPairingTaskInfo dncspairingtaskinfo, DncsPairingTaskInfo dncspairingtaskinfo1, boolean flag)
    {
        dncspairingmanager.a(dncspairingtaskinfo, dncspairingtaskinfo1, flag);
    }

    static void a(DncsPairingManager dncspairingmanager, boolean flag)
    {
        dncspairingmanager.b(flag);
    }

    private void a(boolean flag)
    {
        z.a(new Intent(a));
        if (flag)
        {
            b(true);
        }
    }

    private boolean a(Device device, DncsPairingType dncspairingtype)
    {
label0:
        {
            if (device != null && dncspairingtype != null)
            {
                com.fitbit.e.a.a("DncsPairingManager", "addTask: %s, type", new Object[] {
                    device.c(), dncspairingtype
                });
                if (!dncspairingtype.a() || com.fitbit.dncs.NotificationManager.a().b(device).a())
                {
                    break label0;
                }
                com.fitbit.e.a.a("DncsPairingManager", "Notifications not supported on Device: %s", new Object[] {
                    device.c()
                });
            }
            return false;
        }
        if (!com.fitbit.bluetooth.g.i())
        {
            com.fitbit.e.a.a("DncsPairingManager", "There is no sim card on this phone", new Object[0]);
            return false;
        }
        synchronized (c)
        {
            if (e)
            {
                break MISSING_BLOCK_LABEL_127;
            }
            com.fitbit.e.a.a("DncsPairingManager", "Manager is disabled!", new Object[0]);
        }
        return false;
        device;
        list;
        JVM INSTR monitorexit ;
        throw device;
        int k = 0;
_L2:
        if (k >= c.size())
        {
            break MISSING_BLOCK_LABEL_214;
        }
        DncsPairingTaskInfo dncspairingtaskinfo = (DncsPairingTaskInfo)c.get(k);
        if (!dncspairingtaskinfo.a.equals(device.c()))
        {
            break MISSING_BLOCK_LABEL_264;
        }
        if (dncspairingtaskinfo.b.a() != dncspairingtype.a())
        {
            a(dncspairingtaskinfo, new DncsPairingTaskInfo(device.c(), dncspairingtype), true);
        }
        list;
        JVM INSTR monitorexit ;
        return true;
        device = new DncsPairingTaskInfo(device.c(), dncspairingtype);
        c.add(device);
        com.fitbit.e.a.a("DncsPairingManager", "Task added: %s", new Object[] {
            device
        });
        a(true);
        list;
        JVM INSTR monitorexit ;
        return true;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static boolean a(DncsPairingError dncspairingerror)
    {
        return b(dncspairingerror);
    }

    static void b(DncsPairingManager dncspairingmanager, DncsPairingTaskInfo dncspairingtaskinfo)
    {
        dncspairingmanager.c(dncspairingtaskinfo);
    }

    private void b(boolean flag)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        if (!e || c.isEmpty())
        {
            break MISSING_BLOCK_LABEL_36;
        }
        DncsPairingService.a(FitBitApplication.a());
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean b(DncsPairingTaskInfo dncspairingtaskinfo)
    {
label0:
        {
label1:
            {
                if (dncspairingtaskinfo == null)
                {
                    break label0;
                }
                if (dncspairingtaskinfo.b == com.fitbit.dncs.DncsPairingType.a)
                {
                    dncspairingtaskinfo = p.d(dncspairingtaskinfo.a);
                    if (dncspairingtaskinfo == null)
                    {
                        break label0;
                    }
                    if (com.fitbit.savedstate.g.a(dncspairingtaskinfo.d()) == null)
                    {
                        break label1;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean b(DncsPairingError dncspairingerror)
    {
        return dncspairingerror == DncsPairingError.b || dncspairingerror == DncsPairingError.g;
    }

    private void c(Device device)
    {
        com.fitbit.e.a.a("DncsPairingManager", "onDeviceAdded: %s", new Object[] {
            device.c()
        });
        com.fitbit.savedstate.g.b(device.d());
        if (com.fitbit.dncs.NotificationManager.a().b(device) == com.fitbit.dncs.NotificationManager.NotificationsStatus.b && p.f(device))
        {
            com.fitbit.e.a.a("DncsPairingManager", "Autobonding: Device %s was paired or Profile was logged in", new Object[] {
                device.c()
            });
            a(device, com.fitbit.dncs.DncsPairingType.a);
        }
    }

    private void c(DncsPairingTaskInfo dncspairingtaskinfo)
    {
        if (dncspairingtaskinfo != null)
        {
            synchronized (d)
            {
                if (c.remove(dncspairingtaskinfo))
                {
                    com.fitbit.e.a.a("DncsPairingManager", "Task removed: %s", new Object[] {
                        dncspairingtaskinfo
                    });
                    a(true);
                }
            }
            return;
        } else
        {
            return;
        }
        dncspairingtaskinfo;
        obj;
        JVM INSTR monitorexit ;
        throw dncspairingtaskinfo;
    }

    private void d(Device device)
    {
        com.fitbit.e.a.a("DncsPairingManager", "onDeviceRemoved: %s", new Object[] {
            device.c()
        });
        com.fitbit.savedstate.g.b(device.d());
        e(device);
    }

    private void e()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = c.iterator();
_L1:
        DncsPairingTaskInfo dncspairingtaskinfo;
        Object obj2;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_166;
        }
        dncspairingtaskinfo = (DncsPairingTaskInfo)((Iterator) (obj1)).next();
        obj2 = p.d(dncspairingtaskinfo.a);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        com.fitbit.e.a.a("DncsPairingManager", "[Update] Unknown device. Removing task: %s", new Object[] {
            dncspairingtaskinfo
        });
        ((Iterator) (obj1)).remove();
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj2 = com.fitbit.dncs.NotificationManager.a().b(((Device) (obj2)));
        if (((NotificationManager.NotificationsStatus) (obj2)).a()) goto _L3; else goto _L2
_L2:
        com.fitbit.e.a.a("DncsPairingManager", "[Update] Notifications are not supported. Removing task: %s", new Object[] {
            dncspairingtaskinfo
        });
        ((Iterator) (obj1)).remove();
          goto _L1
_L3:
        if (dncspairingtaskinfo.b != com.fitbit.dncs.DncsPairingType.a || obj2 == com.fitbit.dncs.NotificationManager.NotificationsStatus.b) goto _L1; else goto _L4
_L4:
        com.fitbit.e.a.a("DncsPairingManager", "[Update] Device is bonded. Removing task: %s", new Object[] {
            dncspairingtaskinfo
        });
        ((Iterator) (obj1)).remove();
          goto _L1
        obj;
        JVM INSTR monitorexit ;
    }

    private void e(Device device)
    {
        if (device == null) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.a("DncsPairingManager", "removeAction: %s", new Object[] {
            device.c()
        });
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (!e)
        {
            com.fitbit.e.a.a("DncsPairingManager", "Manager is disabled!", new Object[0]);
            return;
        }
          goto _L3
_L5:
        int k;
        if (k >= c.size())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        DncsPairingTaskInfo dncspairingtaskinfo = (DncsPairingTaskInfo)c.get(k);
        if (!dncspairingtaskinfo.a.equals(device.c()))
        {
            break MISSING_BLOCK_LABEL_108;
        }
        c(dncspairingtaskinfo);
        return;
        device;
        obj;
        JVM INSTR monitorexit ;
        throw device;
        k++;
        continue; /* Loop/switch isn't completed */
        obj;
        JVM INSTR monitorexit ;
_L2:
        return;
_L3:
        k = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public DncsPairingTaskInfo a(String s)
    {
label0:
        {
            if (s == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            DncsPairingTaskInfo dncspairingtaskinfo;
            synchronized (d)
            {
                Iterator iterator = c.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    dncspairingtaskinfo = (DncsPairingTaskInfo)iterator.next();
                } while (!dncspairingtaskinfo.a.equals(s));
            }
            return dncspairingtaskinfo;
        }
        obj;
        JVM INSTR monitorexit ;
        break MISSING_BLOCK_LABEL_68;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        return null;
    }

    public void a(Device device)
    {
        a(device, com.fitbit.dncs.DncsPairingType.b);
    }

    public void a(List list, List list1)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        b();
        if (list.isEmpty() || !list.isEmpty()) goto _L2; else goto _L1
_L1:
        com.fitbit.savedstate.g.k();
_L8:
        Object obj1;
        list1 = p.b(list1, DeviceFeature.NOTIFICATIONS);
        obj1 = list.iterator();
_L6:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        Device device;
        device = (Device)((Iterator) (obj1)).next();
        Iterator iterator1 = list1.iterator();
        Device device1;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_265;
            }
            device1 = (Device)iterator1.next();
        } while (!bh.b(device.c(), device1.c()));
        a(device, device1);
        boolean flag = true;
_L14:
        if (flag) goto _L6; else goto _L5
_L5:
        d(device);
          goto _L6
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
_L2:
        if (!list.isEmpty() || list1.isEmpty()) goto _L8; else goto _L7
_L7:
        com.fitbit.savedstate.g.k();
          goto _L8
_L4:
        list1 = list1.iterator();
_L12:
        if (!list1.hasNext()) goto _L10; else goto _L9
_L9:
        obj1 = (Device)list1.next();
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_259;
            }
        } while (!bh.b(((Device)iterator.next()).c(), ((Device) (obj1)).c()));
        flag = true;
_L13:
        if (flag) goto _L12; else goto _L11
_L11:
        c(((Device) (obj1)));
          goto _L12
_L10:
        obj;
        JVM INSTR monitorexit ;
        return;
        flag = false;
          goto _L13
        flag = false;
          goto _L14
    }

    public void b()
    {
        synchronized (d)
        {
            if (!e)
            {
                com.fitbit.e.a.a("DncsPairingManager", "Enabled!", new Object[0]);
                e = true;
                IntentFilter intentfilter = new IntentFilter();
                intentfilter.addAction("com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_STARTED");
                intentfilter.addAction("com.fitbit.dncs.service.DncsPairingService.ACTION_OPERATION_FINISHED");
                f.a(intentfilter);
                IntentFilter intentfilter1 = new IntentFilter();
                intentfilter.addAction("SavedState.GalileoState.ACTION_USE_BLUETOOTH_OPTION_CHANGED");
                intentfilter.addAction("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE");
                i.a(intentfilter1);
                g.a(new IntentFilter("com.fitbit.galileo.tasks.BluetoothWorkersManager.ACTION_WORKER_STOPPED"));
                h.c();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(Device device)
    {
        a(device, com.fitbit.dncs.DncsPairingType.c);
    }

    public void c()
    {
        synchronized (d)
        {
            if (e)
            {
                com.fitbit.e.a.a("DncsPairingManager", "Disabled!", new Object[0]);
                e = false;
                f.d();
                i.d();
                g.d();
                h.d();
                c.clear();
                a(true);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public DncsPairingTaskInfo d()
    {
label0:
        {
            DncsPairingTaskInfo dncspairingtaskinfo;
            synchronized (d)
            {
                e();
                Iterator iterator = c.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    dncspairingtaskinfo = (DncsPairingTaskInfo)iterator.next();
                } while (!b(dncspairingtaskinfo));
            }
            return dncspairingtaskinfo;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
