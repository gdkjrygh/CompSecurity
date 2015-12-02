// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.periodicreporters;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import com.facebook.analytics.ak;
import com.facebook.analytics.al;
import com.facebook.analytics.ca;
import com.facebook.analytics.cb;
import com.facebook.common.process.c;
import com.facebook.common.process.d;
import com.facebook.prefs.shared.aj;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.analytics.periodicreporters:
//            l

public class m
    implements l
{

    private static final Class a = com/facebook/analytics/periodicreporters/m;
    private final Context b;
    private final ak c;
    private final com.facebook.base.a.d d;
    private final com.facebook.prefs.shared.d e;
    private final String f;
    private long g;

    public m(Context context, ak ak1, com.facebook.base.a.d d1, com.facebook.prefs.shared.d d2, d d3)
    {
        g = 0L;
        b = context;
        c = ak1;
        d = d1;
        e = d2;
        f = d3.b().c();
    }

    private long a()
    {
        return e.a(aj.o, 0x1d4c0L);
    }

    private void a(cb cb1)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        ActivityManager activitymanager = (ActivityManager)b.getSystemService("activity");
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        activitymanager.getMemoryInfo(memoryinfo);
        android.os.Debug.MemoryInfo memoryinfo1 = new android.os.Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryinfo1);
        int i = activitymanager.getMemoryClass();
        int j = (int)(100F * ((float)(memoryinfo1.nativePrivateDirty + memoryinfo1.dalvikPrivateDirty) / ((float)i * 1024F)));
        int k = (int)((float)(memoryinfo1.nativePrivateDirty * 100) / ((float)i * 1024F));
        int i1 = (int)((float)((memoryinfo1.nativePrivateDirty + memoryinfo1.dalvikPrivateDirty + memoryinfo1.otherPrivateDirty) * 100) / ((float)i * 1024F));
        int j1 = (int)((float)(memoryinfo1.otherPrivateDirty * 100) / ((float)i * 1024F));
        int k1 = (int)((float)(100L * memoryinfo.threshold) / (float)memoryinfo.availMem);
        objectnode.put("pct_dirty_dalvik_native", j);
        objectnode.put("pct_dirty_native", k);
        objectnode.put("pct_dirty_dalvik_native_other", i1);
        objectnode.put("pct_dirty_other", j1);
        objectnode.put("mem_available", memoryinfo.availMem);
        objectnode.put("mem_threshold", memoryinfo.threshold);
        objectnode.put("mem_is_low", memoryinfo.lowMemory);
        objectnode.put("mem_pct_total", k1);
        objectnode.put("mem_class", i);
        objectnode.put("debug_kb_private_dalvik", memoryinfo1.dalvikPrivateDirty);
        objectnode.put("debug_kb_proportional_dalvik", memoryinfo1.dalvikPss);
        objectnode.put("debug_kb_shared_dalvik", memoryinfo1.dalvikSharedDirty);
        objectnode.put("debug_kb_private_native", memoryinfo1.nativePrivateDirty);
        objectnode.put("debug_kb_proportional_native", memoryinfo1.nativePss);
        objectnode.put("debug_kb_shared_native", memoryinfo1.nativeSharedDirty);
        objectnode.put("debug_kb_private_other", memoryinfo1.otherPrivateDirty);
        objectnode.put("debug_kb_proportional_other", memoryinfo1.otherPss);
        objectnode.put("debug_kb_shared_other", memoryinfo1.otherSharedDirty);
        objectnode.put("gc_total_count", Debug.getGlobalGcInvocationCount());
        objectnode.put("gc_freed_size", Debug.getGlobalFreedSize());
        objectnode.put("gc_freed_count", Debug.getGlobalFreedCount());
        objectnode.put("native_heap_size", Debug.getNativeHeapSize());
        objectnode.put("native_heap_allocated", Debug.getNativeHeapAllocatedSize());
        objectnode.put("native_heap_free", Debug.getNativeHeapFreeSize());
        objectnode.put("thread_alloc_count", Debug.getThreadAllocCount());
        objectnode.put("thread_alloc_size", Debug.getThreadAllocSize());
        cb1.a("memory_info", objectnode);
    }

    private ca b(long l1)
    {
        cb cb1 = new cb("process_status");
        a(cb1);
        cb1.a(l1);
        cb1.e("process");
        cb1.d(f);
        return cb1;
    }

    public List a(long l1, String s)
    {
        g = l1;
        return Collections.singletonList(b(l1));
    }

    public boolean a(long l1)
    {
        while (!d.c() || c.a() != al.CORE_AND_SAMPLED || l1 - g <= a()) 
        {
            return false;
        }
        return true;
    }

}
