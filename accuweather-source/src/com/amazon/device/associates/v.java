// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import com.amazon.android.framework.util.KiwiLogger;

// Referenced classes of package com.amazon.device.associates:
//            bl

final class v
    implements bl
{

    private static final KiwiLogger a = new KiwiLogger("In App Purchasing SDK/Real Mode");

    v()
    {
    }

    private static String c(String s, String s1)
    {
        return (new StringBuilder()).append(s).append(": ").append(s1).toString();
    }

    public void a(String s, String s1)
    {
        if (KiwiLogger.TRACE_ON)
        {
            a.trace(c(s, s1));
        }
    }

    public boolean a()
    {
        return KiwiLogger.TRACE_ON;
    }

    public void b(String s, String s1)
    {
        if (KiwiLogger.ERROR_ON)
        {
            a.error(c(s, s1));
        }
    }

    public boolean b()
    {
        return KiwiLogger.ERROR_ON;
    }

}
