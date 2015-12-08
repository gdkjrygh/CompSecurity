// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//            AppEventsLogger

final class ushReason
    implements Runnable
{

    public final void run()
    {
        if (AppEventsLogger.getFlushBehavior() != ushBehavior.EXPLICIT_ONLY)
        {
            AppEventsLogger.access$300(ushReason.TIMER);
        }
    }

    ushReason()
    {
    }
}
