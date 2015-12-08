// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsStorageListener, EventsFilesManager, EventsStrategy

public abstract class EventsHandler
    implements EventsStorageListener
{

    protected final Context a;
    protected final ScheduledExecutorService b;
    protected EventsStrategy c;

    public EventsHandler(Context context, EventsStrategy eventsstrategy, EventsFilesManager eventsfilesmanager, ScheduledExecutorService scheduledexecutorservice)
    {
        a = context.getApplicationContext();
        b = scheduledexecutorservice;
        c = eventsstrategy;
        eventsfilesmanager.a(this);
    }

    protected abstract EventsStrategy a();

    public void a(Object obj)
    {
        a(new Runnable(obj) {

            final Object a;
            final EventsHandler b;

            public void run()
            {
                try
                {
                    b.c.a(a);
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.a(b.a, "Crashlytics failed to record event", exception);
                }
            }

            
            {
                b = EventsHandler.this;
                a = obj;
                super();
            }
        });
    }

    public void a(Object obj, boolean flag)
    {
        b(new Runnable(obj, flag) {

            final Object a;
            final boolean b;
            final EventsHandler c;

            public void run()
            {
                try
                {
                    c.c.a(a);
                    if (b)
                    {
                        c.c.e();
                    }
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.a(c.a, "Failed to record event.", exception);
                }
            }

            
            {
                c = EventsHandler.this;
                a = obj;
                b = flag;
                super();
            }
        });
    }

    protected void a(Runnable runnable)
    {
        try
        {
            b.submit(runnable).get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            CommonUtils.a(a, "Failed to run events task", runnable);
        }
    }

    public void a(String s)
    {
        b(new Runnable() {

            final EventsHandler a;

            public void run()
            {
                try
                {
                    a.c.b();
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.a(a.a, "Failed to send events files.", exception);
                }
            }

            
            {
                a = EventsHandler.this;
                super();
            }
        });
    }

    public void b()
    {
        b(new Runnable() {

            final EventsHandler a;

            public void run()
            {
                try
                {
                    EventsStrategy eventsstrategy = a.c;
                    a.c = a.a();
                    eventsstrategy.c();
                    return;
                }
                catch (Exception exception)
                {
                    CommonUtils.a(a.a, "Failed to disable events.", exception);
                }
            }

            
            {
                a = EventsHandler.this;
                super();
            }
        });
    }

    protected void b(Runnable runnable)
    {
        try
        {
            b.submit(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            CommonUtils.a(a, "Failed to submit events task", runnable);
        }
    }
}
