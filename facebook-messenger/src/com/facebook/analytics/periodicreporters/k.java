// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.periodicreporters;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.facebook.analytics.ak;
import com.facebook.analytics.al;
import com.facebook.analytics.ca;
import com.facebook.analytics.cb;
import com.facebook.common.e.h;
import com.facebook.common.hardware.a;
import com.facebook.common.hardware.c;
import com.facebook.common.hardware.z;
import com.facebook.debug.log.b;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.analytics.periodicreporters:
//            l

public class k
    implements l
{

    private static final Class a = com/facebook/analytics/periodicreporters/k;
    private static final ae b = com.facebook.f.n.a("fbandroid_optional_analytics");
    private final Context c;
    private final com.facebook.base.a.d d;
    private final d e;
    private final TelephonyManager f;
    private final com.facebook.common.hardware.k g;
    private final com.facebook.e.c h;
    private final ak i;
    private final a j;
    private final PackageManager k;
    private final h l;
    private final com.facebook.analytics.i.a m;
    private long n;

    public k(Context context, com.facebook.base.a.d d1, d d2, TelephonyManager telephonymanager, PackageManager packagemanager, com.facebook.common.hardware.k k1, com.facebook.e.c c1, 
            a a1, ak ak1, h h1, com.facebook.analytics.i.a a2)
    {
        n = 0L;
        c = context;
        d = d1;
        e = d2;
        l = h1;
        f = telephonymanager;
        g = k1;
        h = c1;
        i = ak1;
        j = a1;
        k = packagemanager;
        m = a2;
    }

    private long a()
    {
        return e.a(aj.l, 0x1d4c0L);
    }

    private void a(cb cb1)
    {
        Runtime runtime = Runtime.getRuntime();
        long l1 = runtime.maxMemory();
        cb1.a("free_mem", (l1 - (runtime.totalMemory() - runtime.freeMemory())) / 0x100000L);
        cb1.a("total_mem", l1 / 0x100000L);
        cb1.a("core_count", runtime.availableProcessors());
    }

    private void a(ObjectNode objectnode, Class class1, Object obj, int i1)
    {
        Object obj1;
        Object obj2;
        int k1;
        obj1 = Class.forName("com.android.internal.os.PowerProfile");
        obj2 = ((Class) (obj1)).getDeclaredConstructor(new Class[] {
            android/content/Context
        }).newInstance(new Object[] {
            c
        });
        k1 = ((Integer)((Class) (obj1)).getDeclaredMethod("getNumSpeedSteps", new Class[0]).invoke(obj2, new Object[0])).intValue();
        obj1 = new ObjectNode(JsonNodeFactory.instance);
        obj2 = Class.forName("com.android.internal.os.BatteryStatsImpl$Uid$Proc");
        class1 = ((Map)class1.getDeclaredMethod("getProcessStats", new Class[0]).invoke(obj, new Object[0])).entrySet().iterator();
_L1:
        Object obj3;
        ObjectNode objectnode1;
        ObjectNode objectnode2;
        if (!class1.hasNext())
        {
            break MISSING_BLOCK_LABEL_479;
        }
        obj = (java.util.Map.Entry)class1.next();
        obj3 = ((java.util.Map.Entry) (obj)).getValue();
        long l1 = ((Long)((Class) (obj2)).getDeclaredMethod("getUserTime", new Class[] {
            Integer.TYPE
        }).invoke(obj3, new Object[] {
            Integer.valueOf(i1)
        })).longValue();
        long l3 = ((Long)((Class) (obj2)).getDeclaredMethod("getSystemTime", new Class[] {
            Integer.TYPE
        }).invoke(obj3, new Object[] {
            Integer.valueOf(i1)
        })).longValue();
        long l4 = ((Long)((Class) (obj2)).getDeclaredMethod("getForegroundTime", new Class[] {
            Integer.TYPE
        }).invoke(obj3, new Object[] {
            Integer.valueOf(i1)
        })).longValue();
        objectnode1 = new ObjectNode(JsonNodeFactory.instance);
        objectnode1.put("user_time_ms", 10L * l1);
        objectnode1.put("system_time_ms", 10L * l3);
        objectnode1.put("foreground_time_ms", l4 * 10L);
        objectnode2 = new ObjectNode(JsonNodeFactory.instance);
        int j1 = 0;
        do
        {
            if (j1 >= k1)
            {
                break;
            }
            try
            {
                long l2 = ((Long)((Class) (obj2)).getDeclaredMethod("getTimeAtCpuSpeedStep", new Class[] {
                    Integer.TYPE, Integer.TYPE
                }).invoke(obj3, new Object[] {
                    Integer.valueOf(j1), Integer.valueOf(i1)
                })).longValue();
                objectnode2.put((new StringBuilder()).append(j1).append("").toString(), l2);
            }
            // Misplaced declaration of an exception variable
            catch (ObjectNode objectnode)
            {
                a(((Throwable) (objectnode)), "Failed to extract process stats");
                return;
            }
            j1++;
        } while (true);
        objectnode1.put("relative_time_at_speeds", objectnode2);
        ((ObjectNode) (obj1)).put((String)((java.util.Map.Entry) (obj)).getKey(), objectnode1);
          goto _L1
        objectnode.put("proc_cpu", ((com.fasterxml.jackson.databind.JsonNode) (obj1)));
        return;
    }

    private void a(ObjectNode objectnode, Class class1, Object obj, int i1, long l1)
    {
        Class class2;
        Class class3;
        class2 = Class.forName("com.android.internal.os.BatteryStatsImpl$Uid$Wakelock");
        class3 = Class.forName("com.android.internal.os.BatteryStatsImpl$Timer");
        class1 = (Map)class1.getDeclaredMethod("getWakelockStats", new Class[0]).invoke(obj, new Object[0]);
        long l2 = 0L;
        class1 = class1.values().iterator();
_L2:
        do
        {
            if (!class1.hasNext())
            {
                break MISSING_BLOCK_LABEL_170;
            }
            obj = class1.next();
            obj = class2.getDeclaredMethod("getWakeTime", new Class[] {
                Integer.TYPE
            }).invoke(obj, new Object[] {
                Integer.valueOf(0)
            });
        } while (obj == null);
        l2 += ((Long)class3.getDeclaredMethod("getTotalTimeLocked", new Class[] {
            Long.TYPE, Integer.TYPE
        }).invoke(obj, new Object[] {
            Long.valueOf(l1), Integer.valueOf(i1)
        })).longValue();
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            objectnode.put("wake_lock_time_ms", l2 / 1000L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ObjectNode objectnode)
        {
            a(((Throwable) (objectnode)), "Failed to extract wakelock stats");
        }
        return;
    }

    private void a(Throwable throwable, String s)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        com.facebook.debug.log.b.d(a, stringwriter.toString());
        l.a("BatteryLogger", (new StringBuilder()).append(s).append(": ").append(stringwriter.toString()).toString());
    }

    private void b(cb cb1)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        Class class2;
        Object obj1;
        int j1;
        long l1;
        obj1 = Class.forName("com.android.internal.app.IBatteryStats");
        Object obj2 = Class.forName("com.android.internal.app.IBatteryStats$Stub");
        Object obj3 = Class.forName("android.os.ServiceManager");
        Class class1 = Class.forName("com.android.internal.os.BatteryStatsImpl");
        class2 = Class.forName("com.android.internal.os.BatteryStatsImpl$Uid");
        obj3 = (IBinder)((Class) (obj3)).getDeclaredMethod("getService", new Class[] {
            java/lang/String
        }).invoke(null, new Object[] {
            "batteryinfo"
        });
        obj2 = ((Class) (obj2)).getDeclaredMethod("asInterface", new Class[] {
            android/os/IBinder
        }).invoke(null, new Object[] {
            obj3
        });
        byte abyte0[] = (byte[])(byte[])((Class) (obj1)).getDeclaredMethod("getStatistics", new Class[0]).invoke(obj2, new Object[0]);
        obj2 = Parcel.obtain();
        ((Parcel) (obj2)).unmarshall(abyte0, 0, abyte0.length);
        ((Parcel) (obj2)).setDataPosition(0);
        abyte0 = ((byte []) (((android.os.Parcelable.Creator)class1.getDeclaredField("CREATOR").get(null)).createFromParcel(((Parcel) (obj2)))));
        l1 = SystemClock.elapsedRealtime();
        l1 = ((Long)class1.getDeclaredMethod("computeBatteryRealtime", new Class[] {
            Long.TYPE, Integer.TYPE
        }).invoke(abyte0, new Object[] {
            Long.valueOf(l1 * 1000L), Integer.valueOf(0)
        })).longValue();
        long l2 = SystemClock.uptimeMillis();
        l2 = ((Long)class1.getDeclaredMethod("computeBatteryUptime", new Class[] {
            Long.TYPE, Integer.TYPE
        }).invoke(abyte0, new Object[] {
            Long.valueOf(l2 * 1000L), Integer.valueOf(0)
        })).longValue() / 1000L;
        objectnode.put("total_time_ms", l1 / 1000L);
        objectnode.put("wake_time_ms", l2);
        class1.getDeclaredMethod("distributeWorkLocked", new Class[] {
            Integer.TYPE
        }).invoke(abyte0, new Object[] {
            Integer.valueOf(0)
        });
        abyte0 = (SparseArray)class1.getDeclaredMethod("getUidStats", new Class[0]).invoke(abyte0, new Object[0]);
        j1 = Process.myUid();
        Object obj;
        int i1;
        i1 = 0;
        obj = null;
_L2:
        if (i1 >= abyte0.size())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = abyte0.valueAt(i1);
        if (((Integer)class2.getDeclaredMethod("getUid", new Class[0]).invoke(obj, new Object[0])).intValue() == j1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (obj == null)
        {
            try
            {
                l.a("BatteryLogger", "Failed to find Uid");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (cb cb1)
            {
                a(cb1, "Error in Initialization");
            }
            break MISSING_BLOCK_LABEL_556;
        }
        a(objectnode, class2, obj, 0);
        a(objectnode, class2, obj, 0, l1);
        b(objectnode, class2, obj, 0);
        b(objectnode, class2, obj, 0, l1);
        cb1.a("detailed_battery", objectnode);
        return;
    }

    private void b(ObjectNode objectnode, Class class1, Object obj, int i1)
    {
        try
        {
            long l1 = ((Long)class1.getDeclaredMethod("getTcpBytesReceived", new Class[] {
                Integer.TYPE
            }).invoke(obj, new Object[] {
                Integer.valueOf(i1)
            })).longValue();
            long l2 = ((Long)class1.getDeclaredMethod("getTcpBytesSent", new Class[] {
                Integer.TYPE
            }).invoke(obj, new Object[] {
                Integer.valueOf(i1)
            })).longValue();
            objectnode.put("tcp_bytes_recvd", l1);
            objectnode.put("tcp_bytes_sent", l2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ObjectNode objectnode)
        {
            a(objectnode, "Failed to extract data stats");
        }
    }

    private void b(ObjectNode objectnode, Class class1, Object obj, int i1, long l1)
    {
        try
        {
            Class class2 = Class.forName("com.android.internal.os.BatteryStatsImpl$Uid$Sensor");
            Class class3 = Class.forName("com.android.internal.os.BatteryStatsImpl$Timer");
            obj = (Map)class1.getDeclaredMethod("getSensorStats", new Class[0]).invoke(obj, new Object[0]);
            class1 = new ObjectNode(JsonNodeFactory.instance);
            int j1;
            long l2;
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); class1.put((new StringBuilder()).append(j1).append("").toString(), l2))
            {
                Object obj1 = ((java.util.Map.Entry)((Iterator) (obj)).next()).getValue();
                j1 = ((Integer)class2.getDeclaredMethod("getHandle", new Class[0]).invoke(obj1, new Object[0])).intValue();
                obj1 = class2.getDeclaredMethod("getSensorTime", new Class[0]).invoke(obj1, new Object[0]);
                l2 = ((Long)class3.getDeclaredMethod("getTotalTimeLocked", new Class[] {
                    Long.TYPE, Integer.TYPE
                }).invoke(obj1, new Object[] {
                    Long.valueOf(l1), Integer.valueOf(i1)
                })).longValue() / 1000L;
            }

        }
        // Misplaced declaration of an exception variable
        catch (ObjectNode objectnode)
        {
            a(objectnode, "Failed to extract sensor stats");
            return;
        }
        objectnode.put("sensor_times_ms", class1);
        return;
    }

    private boolean b()
    {
        boolean flag = false;
        if (i.b())
        {
            flag = true;
        } else
        if (e.a(b))
        {
            flag = e.a(b, false);
        }
        if (flag)
        {
            com.facebook.debug.log.b.b(a, "This user is selected for OPTIONAL logging!");
            return flag;
        } else
        {
            com.facebook.debug.log.b.b(a, "This user is NOT selected for OPTIONAL logging!");
            return flag;
        }
    }

    public cb a(cb cb1, long l1)
    {
        cb1.a(l1);
        cb1.b("carrier", f.getNetworkOperatorName());
        cb1.b("carrier_country_iso", f.getNetworkCountryIso());
        cb1.b("network_type", z.a(f.getNetworkType()));
        cb1.b("phone_type", z.b(f));
        cb1.b("locale", c.getResources().getConfiguration().locale.toString());
        cb1.b("sim_country_iso", f.getSimCountryIso());
        int i1 = f.getSimState();
        TelephonyManager telephonymanager = f;
        if (i1 == 5)
        {
            cb1.b("sim_operator", f.getSimOperatorName());
        }
        cb1.a("battery", j.a());
        cb1.b("charge_state", j.b().toString().toLowerCase(Locale.US));
        cb1.b("battery_health", j.c().toString().toLowerCase(Locale.US));
        cb1.a("wifi_enabled", h.b());
        m.a(cb1);
        a(cb1);
        m.a(g.c(), cb1);
        m.e(cb1);
        if (i.a() == al.CORE_AND_SAMPLED)
        {
            m.b(cb1);
            m.c(cb1);
            m.d(cb1);
        }
        if (b() && android.os.Build.VERSION.SDK_INT >= 9 && k.checkPermission("android.permission.BATTERY_STATS", c.getPackageName()) == 0)
        {
            b(cb1);
        }
        return cb1;
    }

    public List a(long l1, String s)
    {
        n = l1;
        return Collections.singletonList(b(l1));
    }

    public boolean a(long l1)
    {
        while (!d.c() || l1 - n <= a()) 
        {
            return false;
        }
        return true;
    }

    ca b(long l1)
    {
        cb cb1 = new cb("device_status");
        a(cb1, l1);
        cb1.e("device");
        return cb1;
    }

}
