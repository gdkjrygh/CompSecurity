// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext, LogEvent

public final class b
{
    public static final class a
    {

        public final PlayLoggerContext a;
        public final LogEvent b;
        public final com.google.android.gms.b.aK.d c;

        private a(PlayLoggerContext playloggercontext, LogEvent logevent)
        {
            a = (PlayLoggerContext)zzx.zzv(playloggercontext);
            b = (LogEvent)zzx.zzv(logevent);
            c = null;
        }

        a(PlayLoggerContext playloggercontext, LogEvent logevent, byte byte0)
        {
            this(playloggercontext, logevent);
        }
    }


    final ArrayList a;
    int b;

    public b()
    {
        this((byte)0);
    }

    private b(byte byte0)
    {
        a = new ArrayList();
        b = 100;
    }
}
