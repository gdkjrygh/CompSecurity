// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.devtools;

import android.os.SystemClock;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.devtools:
//            TraceStyle, MethodTraceScope

final class nit> extends TraceStyle
{

    public final void a(MethodTraceScope methodtracescope)
    {
        Logger.c("Trace start: %s", new Object[] {
            methodtracescope.name()
        });
        methodtracescope.a("TIME_LOG_START", Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void b(MethodTraceScope methodtracescope)
    {
        long l = SystemClock.elapsedRealtime();
        Long long1 = (Long)methodtracescope.mAuxData.get("TIME_LOG_START");
        if (long1 == null)
        {
            return;
        } else
        {
            methodtracescope.a("TIME_LOG_START", null);
            Logger.c("Trace stop: %s, elapsed real time: %d", new Object[] {
                methodtracescope, Long.valueOf(l - long1.longValue())
            });
            return;
        }
    }

    ope(String s)
    {
        super(s, 1, (byte)0);
    }
}
