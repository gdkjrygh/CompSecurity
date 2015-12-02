// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.c;

import android.os.Debug;
import com.facebook.common.w.m;
import java.text.DecimalFormat;

public class i
{

    private static DecimalFormat f = new DecimalFormat("##0.0");
    public final long a;
    public final long b;
    public final long c = Debug.getNativeHeapAllocatedSize() - Debug.getNativeHeapFreeSize();
    public final long d;
    public final long e;
    private final long g;

    public i(Runtime runtime)
    {
        a = runtime.totalMemory() - runtime.freeMemory();
        b = runtime.maxMemory();
        g = b - a;
        e = b;
        d = e - c;
    }

    private static String a(long l, long l1)
    {
        double d1 = ((double)l * 1.0D) / 1048576D;
        double d2 = ((double)l1 * 1.0D) / 1048576D;
        return m.a("Max: %sM Used: %sM %s%%", new Object[] {
            f.format(d1), f.format(d2), f.format((d2 * 100D) / d1)
        });
    }

    public long a()
    {
        return g;
    }

    public String toString()
    {
        return m.a("Memory: JAVA [%s]  NATIVE [%s]", new Object[] {
            a(b, a), a(e, c)
        });
    }

}
