// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;


// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsStrategy, FilesSender

public class DisabledEventsStrategy
    implements EventsStrategy
{

    public DisabledEventsStrategy()
    {
    }

    public void cancelTimeBasedFileRollOver()
    {
    }

    public void deleteAllEvents()
    {
    }

    public FilesSender getFilesSender()
    {
        return null;
    }

    public void recordEvent(Object obj)
    {
    }

    public boolean rollFileOver()
    {
        return false;
    }

    public void scheduleTimeBasedRollOverIfNeeded()
    {
    }

    public void sendEvents()
    {
    }
}
