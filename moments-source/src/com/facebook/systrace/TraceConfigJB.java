// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;

import com.facebook.androidinternals.android.os.SystemPropertiesInternal;

// Referenced classes of package com.facebook.systrace:
//            TraceDirect

final class TraceConfigJB
{

    private static volatile Boolean a = null;

    private TraceConfigJB()
    {
    }

    public static boolean a()
    {
        if (a == null)
        {
            c();
        }
        return a.booleanValue();
    }

    static void b()
    {
        c();
    }

    private static void c()
    {
        String s = SystemPropertiesInternal.a("debug.atrace.app_cmdlines");
        if (s.length() == 0)
        {
            a = Boolean.valueOf(false);
            return;
        }
        String as[] = s.split(",");
        String s1 = TraceDirect.b();
        for (int i = 0; i < as.length; i++)
        {
            if (s1.equals(as[i]))
            {
                a = Boolean.valueOf(true);
                return;
            }
        }

        a = Boolean.valueOf(false);
    }

    static 
    {
        SystemPropertiesInternal.a(new _cls1());
    }

    private class _cls1
        implements Runnable
    {

        public final void run()
        {
            TraceConfigJB.b();
        }

        _cls1()
        {
        }
    }

}
