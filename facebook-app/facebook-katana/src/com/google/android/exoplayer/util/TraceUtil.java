// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;

import android.os.Trace;

// Referenced classes of package com.google.android.exoplayer.util:
//            Util

public final class TraceUtil
{

    private TraceUtil()
    {
    }

    public static void a()
    {
        if (Util.a >= 18)
        {
            b();
        }
    }

    public static void a(String s)
    {
        if (Util.a >= 18)
        {
            b(s);
        }
    }

    private static void b()
    {
        Trace.endSection();
    }

    private static void b(String s)
    {
        Trace.beginSection(s);
    }
}
