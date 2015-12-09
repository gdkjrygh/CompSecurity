// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.data.domain.device:
//            FirmwareVersion, DeviceVersion, c, DeviceFeature, 
//            Device

final class b
{
    private static class a
    {

        public static b a = new b();


        private a()
        {
        }
    }


    private static final FirmwareVersion a = new FirmwareVersion(new int[] {
        6, 54
    });
    private static final FirmwareVersion b = new FirmwareVersion(new int[] {
        6, 34
    });
    private static final FirmwareVersion c = new FirmwareVersion(new int[] {
        8, 30
    });
    private static final FirmwareVersion d = new FirmwareVersion(new int[] {
        8, 31
    });
    private static final FirmwareVersion e = new FirmwareVersion(new int[] {
        18, 36
    });
    private static final FirmwareVersion f = new FirmwareVersion(new int[] {
        16, 26, 52, 1
    });
    private static final FirmwareVersion g = new FirmwareVersion(new int[] {
        16, 29, 10, 2
    });
    private static final FirmwareVersion h = new FirmwareVersion(new int[] {
        16, 32, 0, 0
    });
    private Map i;

    private b()
    {
        i = new HashMap(9);
        i.put(DeviceVersion.CLASSIC, b());
        i.put(DeviceVersion.ULTRA, c());
        i.put(DeviceVersion.ARIA, d());
        i.put(DeviceVersion.ZIP, e());
        i.put(DeviceVersion.FLEX, g());
        i.put(DeviceVersion.ONE, f());
        i.put(DeviceVersion.FORCE, h());
        i.put(DeviceVersion.CHARGE, i());
        i.put(DeviceVersion.CHARGE_HR, j());
        i.put(DeviceVersion.SURGE, k());
        i.put(DeviceVersion.MOTIONBIT, l());
        i.put(DeviceVersion.UNKNOWN, m());
    }


    static b a()
    {
        return a.a;
    }

    private boolean a(c c1, FirmwareVersion firmwareversion)
    {
        while (c1 == null || firmwareversion == null || !c1.a().b(firmwareversion) || !c1.b().b(firmwareversion)) 
        {
            return false;
        }
        return true;
    }

    private static List b()
    {
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(DeviceFeature.STEPS);
        arraylist.add(DeviceFeature.SLEEP);
        return arraylist;
    }

    private boolean b(c c1, FirmwareVersion firmwareversion)
    {
        if (c1 == null || firmwareversion == null)
        {
            return false;
        } else
        {
            return c1.a().b(firmwareversion);
        }
    }

    private static List c()
    {
        ArrayList arraylist = new ArrayList(3);
        arraylist.add(DeviceFeature.STEPS);
        arraylist.add(DeviceFeature.SLEEP);
        arraylist.add(DeviceFeature.FLOORS);
        return arraylist;
    }

    private boolean c(c c1, FirmwareVersion firmwareversion)
    {
        if (c1 == null || firmwareversion == null)
        {
            return false;
        } else
        {
            return c1.a().c(firmwareversion);
        }
    }

    private static List d()
    {
        return Collections.singletonList(DeviceFeature.SCALE);
    }

    private boolean d(c c1, FirmwareVersion firmwareversion)
    {
        if (c1 == null || firmwareversion == null)
        {
            return false;
        } else
        {
            return c1.a().equals(firmwareversion);
        }
    }

    private static List e()
    {
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(DeviceFeature.WIRELESS_SYNC);
        arraylist.add(DeviceFeature.STEPS);
        return arraylist;
    }

    private static List f()
    {
        ArrayList arraylist = new ArrayList(7);
        arraylist.add(DeviceFeature.WIRELESS_SYNC);
        arraylist.add(DeviceFeature.ALARMS);
        arraylist.add(DeviceFeature.FLOORS);
        arraylist.add(DeviceFeature.SLEEP);
        arraylist.add(DeviceFeature.LIVE_DATA);
        arraylist.add(DeviceFeature.GREETING);
        arraylist.add(DeviceFeature.STEPS);
        return arraylist;
    }

    private static List g()
    {
        ArrayList arraylist = new ArrayList(7);
        arraylist.add(DeviceFeature.WIRELESS_SYNC);
        arraylist.add(DeviceFeature.ALARMS);
        arraylist.add(DeviceFeature.SLEEP);
        arraylist.add(DeviceFeature.LIVE_DATA);
        arraylist.add(DeviceFeature.NFC);
        arraylist.add(DeviceFeature.WRIST_PLACEMENT);
        arraylist.add(DeviceFeature.STEPS);
        return arraylist;
    }

    private static List h()
    {
        ArrayList arraylist = new ArrayList(11);
        arraylist.add(DeviceFeature.STEPS);
        arraylist.add(DeviceFeature.WIRELESS_SYNC);
        arraylist.add(DeviceFeature.ALARMS);
        arraylist.add(DeviceFeature.FLOORS);
        arraylist.add(DeviceFeature.SLEEP);
        arraylist.add(DeviceFeature.LIVE_DATA);
        arraylist.add(DeviceFeature.STATS_ORDERING);
        arraylist.add(DeviceFeature.CLOCK_FACE);
        arraylist.add(DeviceFeature.WRIST_PLACEMENT);
        arraylist.add(DeviceFeature.GREETING);
        arraylist.add(DeviceFeature.NOTIFICATIONS);
        arraylist.add(DeviceFeature.ACTIVE_MINUTES);
        arraylist.add(DeviceFeature.TAP_GESTURE);
        return arraylist;
    }

    private static List i()
    {
        List list = h();
        list.add(DeviceFeature.QUICK_VIEW);
        return list;
    }

    private static List j()
    {
        return new ArrayList(EnumSet.of(DeviceFeature.STEPS, new DeviceFeature[] {
            DeviceFeature.WIRELESS_SYNC, DeviceFeature.ALARMS, DeviceFeature.FLOORS, DeviceFeature.SLEEP, DeviceFeature.LIVE_DATA, DeviceFeature.STATS_ORDERING, DeviceFeature.CLOCK_FACE, DeviceFeature.WRIST_PLACEMENT, DeviceFeature.NOTIFICATIONS, DeviceFeature.HEART_RATE, 
            DeviceFeature.ACTIVE_MINUTES, DeviceFeature.TAP_GESTURE, DeviceFeature.QUICK_VIEW
        }));
    }

    private static List k()
    {
        return new ArrayList(EnumSet.of(DeviceFeature.STEPS, new DeviceFeature[] {
            DeviceFeature.WIRELESS_SYNC, DeviceFeature.ALARMS, DeviceFeature.FLOORS, DeviceFeature.SLEEP, DeviceFeature.LIVE_DATA, DeviceFeature.CLOCK_FACE, DeviceFeature.WRIST_PLACEMENT, DeviceFeature.NOTIFICATIONS, DeviceFeature.HEART_RATE, DeviceFeature.EXERCISES, 
            DeviceFeature.BIKE_TRACKING, DeviceFeature.QUICK_VIEW, DeviceFeature.AUTO_LAP
        }));
    }

    private static List l()
    {
        ArrayList arraylist = new ArrayList(2);
        arraylist.add(DeviceFeature.LIVE_DATA);
        arraylist.add(DeviceFeature.STEPS);
        return arraylist;
    }

    private static List m()
    {
        ArrayList arraylist = new ArrayList(10);
        arraylist.add(DeviceFeature.STEPS);
        arraylist.add(DeviceFeature.WIRELESS_SYNC);
        arraylist.add(DeviceFeature.ALARMS);
        arraylist.add(DeviceFeature.FLOORS);
        arraylist.add(DeviceFeature.SLEEP);
        arraylist.add(DeviceFeature.LIVE_DATA);
        arraylist.add(DeviceFeature.STATS_ORDERING);
        arraylist.add(DeviceFeature.CLOCK_FACE);
        arraylist.add(DeviceFeature.WRIST_PLACEMENT);
        arraylist.add(DeviceFeature.GREETING);
        arraylist.add(DeviceFeature.ACTIVE_MINUTES);
        arraylist.add(DeviceFeature.PRIMARY_GOAL);
        arraylist.add(DeviceFeature.NOTIFICATIONS);
        arraylist.add(DeviceFeature.HEART_RATE);
        arraylist.add(DeviceFeature.EXERCISES);
        return arraylist;
    }

    boolean a(Device device, DeviceFeature devicefeature)
    {
        boolean flag = true;
        if (device != null && devicefeature != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (DeviceVersion.ONE.equals(device.h()))
        {
            c c1 = device.m();
            if (devicefeature == DeviceFeature.ALARMS)
            {
                return a(c1, b);
            }
            if (devicefeature == DeviceFeature.LIVE_DATA)
            {
                return a(c1, a);
            }
        }
        if (devicefeature != DeviceFeature.PRIMARY_GOAL)
        {
            break; /* Loop/switch isn't completed */
        }
        if (device.q() == null || device.q().isEmpty())
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!DeviceVersion.FORCE.equals(device.h()))
        {
            break; /* Loop/switch isn't completed */
        }
        c c2 = device.m();
        if (devicefeature == DeviceFeature.CLOCK_FACE)
        {
            if (device.s() == null || device.s().isEmpty())
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (devicefeature == DeviceFeature.NOTIFICATIONS)
        {
            return c(c2, c);
        }
        if (devicefeature != DeviceFeature.TAP_GESTURE)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!b(c2, d) || device.t() == null || device.t().isEmpty())
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!DeviceVersion.CHARGE.equals(device.h()))
        {
            break; /* Loop/switch isn't completed */
        }
        c c3 = device.m();
        if (devicefeature == DeviceFeature.CLOCK_FACE)
        {
            if (device.s() == null || device.s().isEmpty())
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (devicefeature == DeviceFeature.NOTIFICATIONS)
        {
            return c(c3, c);
        }
        if (devicefeature == DeviceFeature.TAP_GESTURE)
        {
            if (!b(c3, d) || device.t() == null || device.t().isEmpty())
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (devicefeature != DeviceFeature.QUICK_VIEW)
        {
            break; /* Loop/switch isn't completed */
        }
        if (device.B() == null || device.B().isEmpty())
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
        if (DeviceVersion.SURGE.equals(device.h()))
        {
            c c4 = device.m();
            if (devicefeature == DeviceFeature.CLOCK_FACE)
            {
                if (device.s() == null || device.s().isEmpty())
                {
                    return false;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (devicefeature == DeviceFeature.EXERCISES)
            {
                if (device.r() == null || device.r().isEmpty())
                {
                    return false;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (devicefeature == DeviceFeature.NOTIFICATIONS)
            {
                return c(c4, f);
            }
            if (devicefeature == DeviceFeature.BIKE_TRACKING)
            {
                return c(c4, g);
            }
            if (devicefeature == DeviceFeature.QUICK_VIEW)
            {
                if (device.B() == null || device.B().isEmpty())
                {
                    return false;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (devicefeature == DeviceFeature.AUTO_LAP)
            {
                return b(c4, h);
            }
        }
        if (!DeviceVersion.CHARGE_HR.equals(device.h()))
        {
            break; /* Loop/switch isn't completed */
        }
        c c5 = device.m();
        if (devicefeature == DeviceFeature.CLOCK_FACE)
        {
            if (device.s() == null || device.s().isEmpty())
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (devicefeature == DeviceFeature.NOTIFICATIONS)
        {
            return c(c5, e);
        }
        if (devicefeature == DeviceFeature.TAP_GESTURE)
        {
            if (device.t() == null || device.t().isEmpty())
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (devicefeature != DeviceFeature.QUICK_VIEW)
        {
            break; /* Loop/switch isn't completed */
        }
        if (device.B() == null || device.B().isEmpty())
        {
            return false;
        }
        if (true) goto _L4; else goto _L7
_L7:
        if (!DeviceVersion.UNKNOWN.equals(device.h()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (devicefeature == DeviceFeature.CLOCK_FACE)
        {
            if (device.s() == null || device.s().isEmpty())
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (devicefeature != DeviceFeature.EXERCISES)
        {
            break; /* Loop/switch isn't completed */
        }
        if (device.r() == null || device.r().isEmpty())
        {
            return false;
        }
        if (true) goto _L4; else goto _L8
_L8:
        if (devicefeature == DeviceFeature.WIRELESS_SYNC && TextUtils.isEmpty(device.d()))
        {
            return false;
        }
        device = (List)i.get(device.h());
        if (device == null)
        {
            return false;
        } else
        {
            return device.contains(devicefeature);
        }
    }

    boolean b(Device device, DeviceFeature devicefeature)
    {
        if (device == null || devicefeature == null)
        {
            return false;
        }
        device = (List)i.get(device.h());
        if (device == null)
        {
            return false;
        } else
        {
            return device.contains(devicefeature);
        }
    }

    boolean c(Device device, DeviceFeature devicefeature)
    {
        boolean flag;
        flag = true;
        break MISSING_BLOCK_LABEL_2;
        if (device != null && devicefeature != null && (List)i.get(device.h()) != null)
        {
            if ((DeviceVersion.CHARGE.equals(device.h()) || DeviceVersion.FORCE.equals(device.h())) && devicefeature == DeviceFeature.NOTIFICATIONS)
            {
                if (d(device.m(), c) && device.x())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag;
            }
            if (DeviceVersion.SURGE.equals(device.h()) && devicefeature == DeviceFeature.BIKE_TRACKING)
            {
                if (!d(device.m(), g) || !device.x())
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

}
