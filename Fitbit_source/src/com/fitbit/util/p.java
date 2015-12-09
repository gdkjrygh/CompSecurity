// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.text.TextUtils;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.data.domain.device.TrackerOption;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.galileo.a.f;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.pedometer.e;
import com.fitbit.savedstate.TrackerSyncPreferencesSavedState;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.savedstate.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.util:
//            an, o

public class p
{

    public static final Comparator a = new Comparator() {

        public int a(Device device, Device device1)
        {
            return an.b(device.h().getPriority(), device1.h().getPriority());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((Device)obj, (Device)obj1);
        }

    };
    public static final Comparator b = new Comparator() {

        private int a(Device device, Device device1, long l1)
        {
            Date date = com.fitbit.util.o.b();
            device = device.e();
            device1 = device1.e();
            long l2 = com.fitbit.util.o.a(device, date, TimeUnit.MINUTES);
            long l3 = com.fitbit.util.o.a(device1, date, TimeUnit.MINUTES);
            int j1 = 0;
            int i1;
            if (l2 <= l1)
            {
                i1 = 0;
            } else
            {
                i1 = 1;
            }
            if (l3 > l1)
            {
                j1 = 1;
            }
            return an.b(i1, j1);
        }

        private int b(Device device, Device device1)
        {
            return an.b(device.h().getPriority(), device1.h().getPriority());
        }

        public int a(Device device, Device device1)
        {
            int j1 = a(device, device1, TrackerSyncPreferencesSavedState.v());
            int i1 = j1;
            if (j1 == 0)
            {
                i1 = b(device, device1);
            }
            return i1;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((Device)obj, (Device)obj1);
        }

    };

    public p()
    {
    }

    public static Device a(Long long1)
    {
label0:
        {
            if (long1 == null)
            {
                break label0;
            }
            Iterator iterator = a().iterator();
            Device device;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                device = (Device)iterator.next();
            } while (device.getEntityId() != long1);
            return device;
        }
        return null;
    }

    public static List a()
    {
        Object obj = an.a().b();
        if (obj != null)
        {
            obj = new ArrayList(((Profile) (obj)).s());
            Collections.sort(((List) (obj)), a);
            return ((List) (obj));
        } else
        {
            return Collections.emptyList();
        }
    }

    public static List a(DeviceVersion deviceversion)
    {
        return a(a(), deviceversion);
    }

    public static List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Device device = (Device)list.next();
                if (device.g() == DeviceType.TRACKER || device.h() == DeviceVersion.MOTIONBIT)
                {
                    arraylist.add(device);
                }
            } while (true);
        }
        return arraylist;
    }

    public static List a(List list, Device device)
    {
        Object obj;
        if (list == null)
        {
            obj = new ArrayList();
        } else
        {
            obj = list;
            if (device != null)
            {
                list = new ArrayList(list);
                Iterator iterator = list.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    if (!((Device)iterator.next()).equals(device))
                    {
                        continue;
                    }
                    iterator.remove();
                    break;
                } while (true);
                return list;
            }
        }
        return ((List) (obj));
    }

    public static List a(List list, DeviceType devicetype)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Device device = (Device)list.next();
                if (device.g() == devicetype)
                {
                    arraylist.add(device);
                }
            } while (true);
        }
        return arraylist;
    }

    public static List a(List list, DeviceVersion deviceversion)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Device device = (Device)list.next();
                if (device.h() == deviceversion)
                {
                    arraylist.add(device);
                }
            } while (true);
        }
        return arraylist;
    }

    public static List a(List list, List list1)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null && list1 != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Device device = (Device)list.next();
                boolean flag = true;
                if (DeviceVersion.MOTIONBIT.equals(device.h()))
                {
                    flag = com.fitbit.pedometer.e.h();
                }
                boolean flag1;
                if (flag)
                {
                    Iterator iterator = list1.iterator();
                    do
                    {
                        flag1 = flag;
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        if (!device.a((DeviceFeature)iterator.next()))
                        {
                            flag = false;
                        }
                    } while (true);
                } else
                {
                    flag1 = flag;
                }
                if (flag1)
                {
                    arraylist.add(device);
                }
            } while (true);
        }
        Collections.sort(arraylist, a);
        return arraylist;
    }

    public static boolean a(Device device)
    {
        return device != null && device.z() != null;
    }

    public static boolean a(DeviceFeature devicefeature)
    {
        return !b(a(), devicefeature).isEmpty();
    }

    public static boolean a(DeviceType devicetype)
    {
        return !b(devicetype).isEmpty();
    }

    public static boolean a(String s1)
    {
        return c(s1) != null;
    }

    public static boolean a(List list, DeviceFeature devicefeature)
    {
        return !b(list, devicefeature).isEmpty();
    }

    public static Device b()
    {
        Device device = null;
        List list = a(DeviceVersion.parse(UISavedState.n()));
        if (!list.isEmpty())
        {
            device = (Device)list.get(0);
        }
        return device;
    }

    public static TrackerGoalType b(Device device)
    {
label0:
        {
            Object obj = TrackerGoalType.CALORIES;
            Object obj1 = obj;
            if (device == null)
            {
                break label0;
            }
            obj1 = device.o();
            if (obj1 != null)
            {
                obj = ((TrackerSettings) (obj1)).a(TrackerOption.PRIMARY_GOAL);
                if (obj != null && ((com.fitbit.data.domain.device.e) (obj)).c() != null)
                {
                    obj = (TrackerGoalType)((com.fitbit.data.domain.device.e) (obj)).c();
                } else
                {
                    obj = TrackerGoalType.STEPS;
                }
            }
            if (!device.h().equals(DeviceVersion.MOTIONBIT))
            {
                obj1 = obj;
                if (!((TrackerGoalType) (obj)).equals(TrackerGoalType.UNKNOWN))
                {
                    break label0;
                }
            }
            obj1 = TrackerGoalType.STEPS;
        }
        return ((TrackerGoalType) (obj1));
    }

    public static List b(DeviceFeature devicefeature)
    {
        return b(a(), devicefeature);
    }

    public static List b(DeviceType devicetype)
    {
        return a(a(), devicetype);
    }

    public static List b(List list)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(b(list, DeviceFeature.WIRELESS_SYNC));
        list = i(list);
        if (list != null)
        {
            arraylist.add(list);
        }
        Collections.sort(arraylist, a);
        return arraylist;
    }

    public static List b(List list, DeviceFeature devicefeature)
    {
        ArrayList arraylist = new ArrayList();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Device device = (Device)list.next();
                if (device.a(devicefeature))
                {
                    arraylist.add(device);
                }
            } while (true);
        }
        Collections.sort(arraylist, a);
        return arraylist;
    }

    public static boolean b(DeviceVersion deviceversion)
    {
        return !a(deviceversion).isEmpty();
    }

    public static boolean b(String s1)
    {
        return d(s1) != null;
    }

    public static boolean b(List list, List list1)
    {
label0:
        {
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
            }
            list = list1;
            if (list1 == null)
            {
                list = new ArrayList();
            }
            if (((List) (obj)).size() == list.size())
            {
                for (list1 = ((List) (obj)).iterator(); list1.hasNext();)
                {
                    Device device = (Device)list1.next();
                    if (a(list, device.g()).isEmpty() || a(list, device.h()).isEmpty())
                    {
                        return true;
                    }
                }

                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break label0;
                    }
                    list1 = (Device)list.next();
                } while (!a(((List) (obj)), list1.g()).isEmpty() && !a(((List) (obj)), list1.h()).isEmpty());
                return true;
            } else
            {
                return true;
            }
        }
        return false;
    }

    public static Device c(String s1)
    {
label0:
        {
            if (TextUtils.isEmpty(s1))
            {
                break label0;
            }
            Iterator iterator = a().iterator();
            Device device;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                device = (Device)iterator.next();
            } while (!com.fitbit.galileo.a.f.a(s1, device.d()));
            return device;
        }
        return null;
    }

    public static Device c(List list)
    {
        list = new ArrayList(list);
        Collections.sort(list, a);
        if (!list.isEmpty())
        {
            return (Device)list.get(0);
        } else
        {
            return null;
        }
    }

    public static List c()
    {
        return a(a());
    }

    public static boolean c(Device device)
    {
        return device.h().equals(DeviceVersion.ULTRA) || device.h().equals(DeviceVersion.CLASSIC);
    }

    public static boolean c(DeviceFeature devicefeature)
    {
        for (Iterator iterator = a().iterator(); iterator.hasNext();)
        {
            if (((Device)iterator.next()).b(devicefeature))
            {
                return true;
            }
        }

        return false;
    }

    public static Device d(String s1)
    {
label0:
        {
            if (s1 == null)
            {
                break label0;
            }
            Iterator iterator = a().iterator();
            Device device;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                device = (Device)iterator.next();
            } while (!s1.equalsIgnoreCase(device.c()));
            return device;
        }
        return null;
    }

    public static List d()
    {
        return b(a());
    }

    public static void d(List list)
    {
        Collections.sort(list, b);
    }

    public static boolean d(Device device)
    {
        return device != null && device.h() == DeviceVersion.MOTIONBIT;
    }

    public static boolean e()
    {
        return d().size() > 1;
    }

    public static boolean e(Device device)
    {
        while (!d(device) || device.b() == null || device.c() == null || s.a() == null || s.b() == null || !device.b().equals(s.a()) || !device.c().equals(s.b())) 
        {
            return false;
        }
        return true;
    }

    public static boolean e(String s1)
    {
        return f(s1) != null;
    }

    public static boolean e(List list)
    {
        return !a(a(), list).isEmpty();
    }

    public static Device f()
    {
        List list = d();
        if (!list.isEmpty())
        {
            return (Device)list.get(0);
        } else
        {
            return null;
        }
    }

    public static Device f(String s1)
    {
label0:
        {
            if (TextUtils.isEmpty(s1))
            {
                break label0;
            }
            Iterator iterator = a().iterator();
            Device device;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                device = (Device)iterator.next();
            } while (!TextUtils.equals(s1, device.j()));
            return device;
        }
        return null;
    }

    public static boolean f(Device device)
    {
        if (device != null)
        {
            device = device.o();
            if (device != null)
            {
                device = device.a(TrackerOption.ENABLE_ANCS);
                return device != null && ((Boolean)device.c()).booleanValue();
            }
        }
        return false;
    }

    public static boolean f(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Device device = (Device)list.next();
            if (!device.h().equals(DeviceVersion.ARIA) && !device.h().equals(DeviceVersion.MOTIONBIT))
            {
                return false;
            }
        }

        return true;
    }

    public static Device g()
    {
        List list = d();
        Collections.sort(list, new Comparator() {

            public int a(Device device, Device device1)
            {
                device = device.e();
                return device1.e().compareTo(device);
            }

            public int compare(Object obj, Object obj1)
            {
                return a((Device)obj, (Device)obj1);
            }

        });
        if (!list.isEmpty())
        {
            return (Device)list.get(0);
        } else
        {
            return null;
        }
    }

    public static Device g(List list)
    {
label0:
        {
            if (list == null)
            {
                break label0;
            }
            list = list.iterator();
            Device device;
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
                device = (Device)list.next();
            } while (!device.h().equals(DeviceVersion.CLASSIC) && !device.h().equals(DeviceVersion.ULTRA));
            return device;
        }
        return null;
    }

    public static Device h()
    {
        List list = b(DeviceType.TRACKER);
        Collections.sort(list, a);
        if (!list.isEmpty())
        {
            return (Device)list.get(0);
        } else
        {
            return null;
        }
    }

    public static boolean h(List list)
    {
        return i(list) != null;
    }

    public static Device i()
    {
        List list = b(DeviceType.SCALE);
        Collections.sort(list, a);
        if (!list.isEmpty())
        {
            return (Device)list.get(0);
        } else
        {
            return null;
        }
    }

    public static Device i(List list)
    {
label0:
        {
            if (list == null)
            {
                break label0;
            }
            list = list.iterator();
            Device device;
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
                device = (Device)list.next();
            } while (!e(device));
            return device;
        }
        return null;
    }

    public static Device j()
    {
        Object obj = GalileoServicesStateListener.f().j();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = d(((String) (obj)));
        if (obj == null) goto _L2; else goto _L3
_L3:
        return ((Device) (obj));
_L2:
        Device device;
        obj = com.fitbit.bluetooth.connection.e.c();
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        device = c(com.fitbit.galileo.a.f.a(((android.bluetooth.BluetoothDevice) (obj))));
        obj = device;
        if (device != null) goto _L3; else goto _L4
_L4:
        Device device1 = f();
        obj = device1;
        if (device1 == null)
        {
            List list = an.a().f();
            if (list != null && !list.isEmpty())
            {
                Collections.sort(list, a);
                return (Device)list.get(0);
            } else
            {
                return null;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static boolean j(List list)
    {
        return !k(list).isEmpty();
    }

    public static TrackerGoalType k()
    {
        Object obj = d();
        if (!((List) (obj)).isEmpty())
        {
            obj = (Device)((List) (obj)).get(0);
        } else
        {
            obj = null;
        }
        return b(((Device) (obj)));
    }

    public static List k(List list)
    {
        return a(list, DeviceVersion.MOTIONBIT);
    }

    public static boolean l()
    {
        return h(a());
    }

    public static Device m()
    {
        return i(a());
    }

    public static boolean n()
    {
        return j(a());
    }

    public static List o()
    {
        return k(a());
    }

}
