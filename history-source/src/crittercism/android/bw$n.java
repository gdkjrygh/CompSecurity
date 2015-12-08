// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.os.Debug;

// Referenced classes of package crittercism.android:
//            bv, bw

public static final class herPss
    implements bv
{

    private Integer a;

    public final String a()
    {
        return "memory_usage";
    }

    public final volatile Object b()
    {
        return a;
    }

    public fo()
    {
        a = null;
        android.os..MemoryInfo memoryinfo = new android.os..MemoryInfo();
        Debug.getMemoryInfo(memoryinfo);
        int i = memoryinfo.dalvikPss;
        int j = memoryinfo.nativePss;
        a = Integer.valueOf((memoryinfo.otherPss + (i + j)) * 1024);
    }
}
