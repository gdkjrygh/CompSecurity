// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.memorymonitor;

import android.os.Debug;

// Referenced classes of package com.google.android.libraries.memorymonitor:
//            JavaMemorySnapshot

public final class AndroidMemorySnapshot extends JavaMemorySnapshot
{

    public final long dalvikPrivateDirtyB;
    public final long dalvikPssB;
    public final long nativeHeapAllocatedB;
    public final long otherPrivateDirtyB;
    public final long otherPssB;
    public final long totalPssB;

    public AndroidMemorySnapshot()
    {
        android.os.Debug.MemoryInfo memoryinfo = new android.os.Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryinfo);
        nativeHeapAllocatedB = Debug.getNativeHeapAllocatedSize();
        otherPrivateDirtyB = kbToB(memoryinfo.otherPrivateDirty);
        otherPssB = kbToB(memoryinfo.otherPss);
        dalvikPrivateDirtyB = kbToB(memoryinfo.dalvikPrivateDirty);
        dalvikPssB = kbToB(memoryinfo.dalvikPss);
        totalPssB = kbToB(memoryinfo.getTotalPss());
    }

    AndroidMemorySnapshot(long l, long l1, long l2, long l3, long l4, long l5, long l6, 
            long l7, long l8)
    {
        super(l4, l5, l6);
        otherPrivateDirtyB = l;
        otherPssB = l1;
        dalvikPrivateDirtyB = l2;
        dalvikPssB = l3;
        totalPssB = l8;
        nativeHeapAllocatedB = l7;
    }

    private static long kbToB(long l)
    {
        return l << 10;
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        long l = otherPrivateDirtyB;
        long l1 = otherPssB;
        long l2 = dalvikPrivateDirtyB;
        long l3 = dalvikPssB;
        long l4 = totalPssB;
        return (new StringBuilder(String.valueOf(s).length() + 174)).append(s).append(", otherPrivateDirtyB: ").append(l).append(", otherPssB:").append(l1).append(", otherPssB: ").append(l2).append(", dalvikPssB: ").append(l3).append(", totalPssB: ").append(l4).toString();
    }
}
