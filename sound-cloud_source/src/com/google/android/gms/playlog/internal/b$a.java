// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            b, PlayLoggerContext, LogEvent

public static final class vent
{

    public final PlayLoggerContext a;
    public final LogEvent b;
    public final com.google.android.gms.b. c;

    private vent(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        a = (PlayLoggerContext)zzx.zzv(playloggercontext);
        b = (LogEvent)zzx.zzv(logevent);
        c = null;
    }

    vent(PlayLoggerContext playloggercontext, LogEvent logevent, byte byte0)
    {
        this(playloggercontext, logevent);
    }
}
