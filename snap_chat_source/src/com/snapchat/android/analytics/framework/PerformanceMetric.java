// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics.framework;

import Bt;
import Im;
import It;
import Jo;
import LP;
import LQ;
import Lz;
import akh;
import android.content.Context;
import android.content.res.Resources;
import cJ;
import cK;
import com.google.gson.Gson;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.HashMap;
import java.util.Map;
import kp;
import ly;

// Referenced classes of package com.snapchat.android.analytics.framework:
//            EasyMetric, MemoryState

public class PerformanceMetric extends EasyMetric
{

    private final Im f;
    private final LQ g;
    private final kp h;
    private MemoryState i;

    public PerformanceMetric(String s)
    {
        this(s, 0.10000000000000001D);
    }

    public PerformanceMetric(String s, double d)
    {
        this(s, d, Im.a(), LQ.a(), kp.a());
    }

    private PerformanceMetric(String s, double d, Im im, LQ lq, kp kp1)
    {
        super(s, d);
        f = im;
        g = lq;
        h = kp1;
    }

    static LQ a(PerformanceMetric performancemetric)
    {
        return performancemetric.g;
    }

    private void a(MemoryState memorystate)
    {
        String s;
        if (memorystate.f)
        {
            s = "_change";
        } else
        {
            s = "";
        }
        a((new StringBuilder("mem_free")).append(s).toString(), Long.valueOf(memorystate.a));
        a((new StringBuilder("mem_used")).append(s).toString(), Long.valueOf(memorystate.b));
        a((new StringBuilder("mem_total")).append(s).toString(), Long.valueOf(memorystate.c));
        a((new StringBuilder("mem_max")).append(s).toString(), Long.valueOf(memorystate.d));
        if (!memorystate.f)
        {
            a("mem_class", Long.valueOf(memorystate.e));
        }
    }

    static void b(PerformanceMetric performancemetric)
    {
        performancemetric.EasyMetric.b(false);
    }

    public final void a(boolean flag)
    {
        b(false);
    }

    public final EasyMetric b()
    {
        i = new MemoryState();
        return super.b();
    }

    public final void b(boolean flag)
    {
        Object obj2;
        long l = c();
        if (b.c())
        {
            a("endpoint_host", Lz.c());
        }
        Object obj = f;
        obj2 = SnapchatApplication.get();
        android.util.DisplayMetrics displaymetrics = ((Context) (obj2)).getResources().getDisplayMetrics();
        String s1 = Bt.bs();
        int j;
        if (((Im) (obj)).mDeviceHardwareInfo != null && ((Im) (obj)).mDeviceHardwareInfo.containsKey("year_class"))
        {
            obj = ((Im) (obj)).mDeviceHardwareInfo;
        } else
        {
            java.lang.reflect.Type type = (new Im._cls1(((Im) (obj)))).getType();
            obj.mDeviceHardwareInfo = (Map)It.a().fromJson(s1, type);
            if (((Im) (obj)).mDeviceHardwareInfo.containsKey("year_class"))
            {
                obj = ((Im) (obj)).mDeviceHardwareInfo;
            } else
            {
                HashMap hashmap = new HashMap();
                hashmap.put("num_processors", Integer.toString(cJ.a()));
                hashmap.put("total_memory", Long.toString(cJ.a(((Context) (obj2)))));
                hashmap.put("display_density", Jo.a(displaymetrics));
                hashmap.put("year_class", Integer.toString(cK.a(((Context) (obj2)))));
                Bt.u(It.a().toJson(hashmap));
                obj.mDeviceHardwareInfo = hashmap;
                obj = ((Im) (obj)).mDeviceHardwareInfo;
            }
        }
        a("device_info", obj);
        a("is_performance", Boolean.valueOf(true));
        a("disk_encrypted", Boolean.valueOf(LandingPageActivity.k()));
        d();
        obj2 = h.c;
        if (a().equals("BATTERY_DROP"))
        {
            flag = false;
        } else
        {
            flag = this instanceof PerformanceMetric;
        }
        if (flag && ((ly) (obj2)).d == 1) goto _L2; else goto _L1
_L1:
        j = (int)Math.max(0L, 5000L - l);
        akh.a(new Runnable() {

            private PerformanceMetric a;

            public void run()
            {
                LQ lq = PerformanceMetric.a(a);
                PerformanceMetric performancemetric = a;
                lq.mUiLatencyAggregator.a(performancemetric);
                PerformanceMetric.b(a);
            }

            
            {
                a = PerformanceMetric.this;
                super();
            }
        }, j);
        return;
_L2:
        Object obj1 = ((ly) (obj2)).a;
        obj1;
        JVM INSTR monitorenter ;
        String s;
        s = a();
        if (((ly) (obj2)).b.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_387;
        }
        ((ly) (obj2)).b.put(s, Integer.valueOf(1));
          goto _L1
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
        int k = ((Integer)((ly) (obj2)).b.get(s)).intValue();
        ((ly) (obj2)).b.put(s, Integer.valueOf(k + 1));
          goto _L1
    }

    public final long c()
    {
        MemoryState memorystate = i;
        MemoryState memorystate1 = new MemoryState();
        a(memorystate1);
        if (memorystate != null)
        {
            memorystate1.a = memorystate1.a - memorystate.a;
            memorystate1.c = memorystate1.c - memorystate.c;
            memorystate1.b = memorystate1.b - memorystate.b;
            memorystate1.d = memorystate1.d - memorystate.d;
            memorystate1.f = true;
            a(memorystate1);
        }
        return super.c();
    }

    public final void e()
    {
        b(false);
    }
}
