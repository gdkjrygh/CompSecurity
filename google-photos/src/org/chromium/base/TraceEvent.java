// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Looper;
import qwv;

// Referenced classes of package org.chromium.base:
//            ThreadUtils

public class TraceEvent
{

    private static volatile boolean a = false;
    private static volatile boolean b = false;

    public TraceEvent()
    {
    }

    public static void a(String s)
    {
        if (a)
        {
            nativeEnd(s, null);
        }
    }

    public static void a(String s, String s1)
    {
        if (a)
        {
            nativeInstant(s, s1);
        }
    }

    public static boolean a()
    {
        return a;
    }

    public static void b()
    {
        nativeBeginToplevel();
    }

    public static void b(String s, String s1)
    {
        if (a)
        {
            nativeBegin(s, s1);
        }
    }

    public static void c()
    {
        nativeEndToplevel();
    }

    private static native void nativeBegin(String s, String s1);

    private static native void nativeBeginToplevel();

    private static native void nativeEnd(String s, String s1);

    private static native void nativeEndToplevel();

    private static native void nativeFinishAsync(String s, long l);

    private static native void nativeInstant(String s, String s1);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String s, long l);

    private static native void nativeStopATrace();

    public static void setEnabled(boolean flag)
    {
        a = flag;
        boolean flag1 = b;
        Looper looper = ThreadUtils.a();
        qwt qwt;
        if (flag)
        {
            qwt = qwv.a();
        } else
        {
            qwt = null;
        }
        looper.setMessageLogging(qwt);
    }

}
