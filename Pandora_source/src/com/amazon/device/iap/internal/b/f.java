// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.b;

import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.device.iap.internal.a;

public class f
    implements a
{

    private static KiwiLogger a = new KiwiLogger("In App Purchasing SDK - Production Mode");

    public f()
    {
    }

    private static String c(String s, String s1)
    {
        return (new StringBuilder()).append(s).append(": ").append(s1).toString();
    }

    public void a(String s, String s1)
    {
        a.trace(c(s, s1));
    }

    public boolean a()
    {
        return KiwiLogger.TRACE_ON;
    }

    public void b(String s, String s1)
    {
        a.error(c(s, s1));
    }

    public boolean b()
    {
        return KiwiLogger.ERROR_ON;
    }

}
