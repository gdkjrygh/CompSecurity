// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;


// Referenced classes of package me.lyft.android.analytics:
//            Analytics, IEvent

final class val.event
    implements Runnable
{

    final IEvent val$event;

    public void run()
    {
        Analytics.access$000(val$event);
    }

    ()
    {
        val$event = ievent;
        super();
    }
}
