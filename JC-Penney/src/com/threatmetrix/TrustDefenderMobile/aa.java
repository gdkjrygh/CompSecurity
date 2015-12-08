// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.os.StatFs;
import java.lang.reflect.Method;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            aq

class aa extends aq
{

    private static final Method a = a(android/os/StatFs, "getBlockSize", new Class[0]);
    private static final Method b = a(android/os/StatFs, "getBlockSizeLong", new Class[0]);
    private static final Method c = a(android/os/StatFs, "getAvailableBlocks", new Class[0]);
    private static final Method d = a(android/os/StatFs, "getAvailableBlocksLong", new Class[0]);
    private static final Method e = a(android/os/StatFs, "getBlockCount", new Class[0]);
    private static final Method f = a(android/os/StatFs, "getBlockCountLong", new Class[0]);
    private static final String g = com/threatmetrix/TrustDefenderMobile/aa.getName();
    private final StatFs h;

    public aa(String s)
    {
        h = new StatFs(s);
    }

    public final long a()
    {
        if (f != null)
        {
            Long long1 = (Long)a(h, f, new Object[0]);
            if (long1 != null)
            {
                return long1.longValue();
            }
        }
        if (e != null)
        {
            Integer integer = (Integer)a(h, e, new Object[0]);
            if (integer != null)
            {
                return (long)integer.intValue();
            }
        }
        return 0L;
    }

    public final long b()
    {
        if (b != null)
        {
            Long long1 = (Long)a(h, b, new Object[0]);
            if (long1 != null)
            {
                return long1.longValue();
            }
        }
        if (a != null)
        {
            Integer integer = (Integer)a(h, a, new Object[0]);
            if (integer != null)
            {
                return (long)integer.intValue();
            }
        }
        return 0L;
    }

    public final long c()
    {
        if (d != null)
        {
            Long long1 = (Long)a(h, d, new Object[0]);
            if (long1 != null)
            {
                return long1.longValue();
            }
        }
        if (c != null)
        {
            Integer integer = (Integer)a(h, c, new Object[0]);
            if (integer != null)
            {
                return (long)integer.intValue();
            }
        }
        return 0L;
    }

}
