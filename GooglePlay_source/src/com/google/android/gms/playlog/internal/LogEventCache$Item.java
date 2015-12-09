// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import com.google.android.gms.common.internal.Preconditions;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            LogEventCache, PlayLoggerContext, LogEvent

public static final class <init>
{

    public final LogEvent event;
    public final PlayLoggerContext loggerContext;
    public final com.google.wireless.android.play.playlog.proto.Event protoEvent;

    private ics.LogEvent(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        loggerContext = (PlayLoggerContext)Preconditions.checkNotNull(playloggercontext);
        event = (LogEvent)Preconditions.checkNotNull(logevent);
        protoEvent = null;
    }

    protoEvent(PlayLoggerContext playloggercontext, LogEvent logevent, byte byte0)
    {
        this(playloggercontext, logevent);
    }
}
