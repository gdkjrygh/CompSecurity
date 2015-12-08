// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import me.lyft.android.common.Preconditions;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.analytics:
//            IEventTracker, IEvent

public final class Analytics
{

    private static Executor dispatchExecutor = Executors.newSingleThreadExecutor();
    private static final List eventTrackers = new CopyOnWriteArrayList();

    private Analytics()
    {
    }

    public static void add(IEventTracker ieventtracker)
    {
        Preconditions.checkNotNull(ieventtracker, "EventTracker cannot be null");
        eventTrackers.add(ieventtracker);
    }

    public static void flush()
    {
        for (Iterator iterator = eventTrackers.iterator(); iterator.hasNext(); ((IEventTracker)iterator.next()).flush()) { }
    }

    static void removeAllTrackers()
    {
        eventTrackers.clear();
    }

    public static void setDispatchExecutor(Executor executor)
    {
        Preconditions.checkNotNull(executor, "Executor cannot be null");
        dispatchExecutor = executor;
    }

    public static void track(final IEvent event)
    {
        Preconditions.checkNotNull(event, "Event cannot be null");
        dispatchExecutor.execute(new Runnable() {

            final IEvent val$event;

            public void run()
            {
                Analytics.trackInternal(event);
            }

            
            {
                event = ievent;
                super();
            }
        });
    }

    private static void trackInternal(IEvent ievent)
    {
        boolean flag;
        if (!eventTrackers.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, String.format("Initialize analytics before tracking: %s", new Object[] {
            ievent.getName()
        }));
        try
        {
            for (Iterator iterator = eventTrackers.iterator(); iterator.hasNext(); ((IEventTracker)iterator.next()).track(ievent)) { }
        }
        catch (Throwable throwable)
        {
            L.e(throwable, "Failed to track event %s", new Object[] {
                ievent.getName()
            });
        }
    }

    public static void trackSync(IEvent ievent)
    {
        Preconditions.checkNotNull(ievent, "Event cannot be null");
        trackInternal(ievent);
    }


}
