// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            AppEventsLogger

final class val.reason
    implements Runnable
{

    final ushReason val$reason;

    public final void run()
    {
        AppEventsLogger.access$300(val$reason);
    }

    ushReason()
    {
        val$reason = ushreason;
        super();
    }
}
