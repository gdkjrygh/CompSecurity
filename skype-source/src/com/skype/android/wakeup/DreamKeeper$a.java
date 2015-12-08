// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.wakeup;

import android.os.SystemClock;

// Referenced classes of package com.skype.android.wakeup:
//            DreamKeeper, MediaWakeupEvent

private static final class b
{

    private final long a;
    private final MediaWakeupEvent b;

    public final long a()
    {
        return a;
    }

    public final MediaWakeupEvent b()
    {
        return b;
    }

    nt(long l, MediaWakeupEvent mediawakeupevent)
    {
        a = SystemClock.uptimeMillis() + l;
        b = mediawakeupevent;
    }
}
