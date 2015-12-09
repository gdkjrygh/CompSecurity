// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext, LogEvent

public final class LogEventCache
{
    public static final class Item
    {

        public final LogEvent event;
        public final PlayLoggerContext loggerContext;
        public final com.google.wireless.android.play.playlog.proto.ClientAnalytics.LogEvent protoEvent;

        private Item(PlayLoggerContext playloggercontext, LogEvent logevent)
        {
            loggerContext = (PlayLoggerContext)Preconditions.checkNotNull(playloggercontext);
            event = (LogEvent)Preconditions.checkNotNull(logevent);
            protoEvent = null;
        }

        Item(PlayLoggerContext playloggercontext, LogEvent logevent, byte byte0)
        {
            this(playloggercontext, logevent);
        }
    }


    final ArrayList mCache;
    int mCapacity;

    public LogEventCache()
    {
        this((byte)0);
    }

    private LogEventCache(byte byte0)
    {
        mCache = new ArrayList();
        mCapacity = 100;
    }
}
