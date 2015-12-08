// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.b.g;
import io.fabric.sdk.android.services.c.a;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.l;
import io.fabric.sdk.android.services.common.p;
import io.fabric.sdk.android.services.settings.b;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//            DisabledSessionAnalyticsManagerStrategy, SessionAnalyticsManagerStrategy, AnswersFilesManagerProvider, SessionMetadataCollector, 
//            SessionEventMetadata, SessionEventTransform, SessionAnalyticsFilesManager, EnabledSessionAnalyticsManagerStrategy

public class AnswersEventsHandler
    implements g
{

    final ScheduledExecutorService a;
    SessionAnalyticsManagerStrategy b;
    private final h c;
    private final Context d;
    private final AnswersFilesManagerProvider e;
    private final SessionMetadataCollector f;
    private final io.fabric.sdk.android.services.network.c g;

    public AnswersEventsHandler(h h, Context context, AnswersFilesManagerProvider answersfilesmanagerprovider, SessionMetadataCollector sessionmetadatacollector, io.fabric.sdk.android.services.network.c c1)
    {
        ScheduledExecutorService scheduledexecutorservice = Executors.newSingleThreadScheduledExecutor(l.a("Answers Events Handler"));
        l.a("Answers Events Handler", scheduledexecutorservice);
        this(h, context, answersfilesmanagerprovider, sessionmetadatacollector, c1, scheduledexecutorservice);
    }

    private AnswersEventsHandler(h h, Context context, AnswersFilesManagerProvider answersfilesmanagerprovider, SessionMetadataCollector sessionmetadatacollector, io.fabric.sdk.android.services.network.c c1, ScheduledExecutorService scheduledexecutorservice)
    {
        b = new DisabledSessionAnalyticsManagerStrategy();
        c = h;
        d = context;
        e = answersfilesmanagerprovider;
        f = sessionmetadatacollector;
        g = c1;
        a = scheduledexecutorservice;
    }

    static SessionMetadataCollector a(AnswersEventsHandler answerseventshandler)
    {
        return answerseventshandler.f;
    }

    static AnswersFilesManagerProvider b(AnswersEventsHandler answerseventshandler)
    {
        return answerseventshandler.e;
    }

    static h c(AnswersEventsHandler answerseventshandler)
    {
        return answerseventshandler.c;
    }

    static Context d(AnswersEventsHandler answerseventshandler)
    {
        return answerseventshandler.d;
    }

    static io.fabric.sdk.android.services.network.c e(AnswersEventsHandler answerseventshandler)
    {
        return answerseventshandler.g;
    }

    public final void a()
    {
        a(new Runnable() {

            final AnswersEventsHandler a;

            public void run()
            {
                try
                {
                    a.b.b();
                    return;
                }
                catch (Exception exception)
                {
                    io.fabric.sdk.android.c.a().c("Answers", "Failed to send events files", exception);
                }
            }

            
            {
                a = AnswersEventsHandler.this;
                super();
            }
        });
    }

    public final void a(SessionEvent.Builder builder, boolean flag, boolean flag1)
    {
        builder = new Runnable(builder, flag1) {

            final SessionEvent.Builder a;
            final boolean b;
            final AnswersEventsHandler c;

            public void run()
            {
                try
                {
                    c.b.a(a);
                    if (b)
                    {
                        c.b.e();
                    }
                    return;
                }
                catch (Exception exception)
                {
                    io.fabric.sdk.android.c.a().c("Answers", "Failed to process event", exception);
                }
            }

            
            {
                c = AnswersEventsHandler.this;
                a = builder;
                b = flag;
                super();
            }
        };
        if (flag)
        {
            try
            {
                a.submit(builder).get();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SessionEvent.Builder builder)
            {
                io.fabric.sdk.android.c.a().c("Answers", "Failed to run events task", builder);
            }
            return;
        } else
        {
            a(((Runnable) (builder)));
            return;
        }
    }

    final void a(Runnable runnable)
    {
        try
        {
            a.submit(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            io.fabric.sdk.android.c.a().c("Answers", "Failed to submit events task", runnable);
        }
    }

    // Unreferenced inner class com/crashlytics/android/answers/AnswersEventsHandler$1

/* anonymous class */
    class _cls1
        implements Runnable
    {

        final b a;
        final String b;
        final AnswersEventsHandler c;

        public void run()
        {
            try
            {
                c.b.a(a, b);
                return;
            }
            catch (Exception exception)
            {
                io.fabric.sdk.android.c.a().c("Answers", "Failed to set analytics settings data", exception);
            }
        }

            
            {
                c = AnswersEventsHandler.this;
                a = b1;
                b = s;
                super();
            }
    }


    // Unreferenced inner class com/crashlytics/android/answers/AnswersEventsHandler$2

/* anonymous class */
    class _cls2
        implements Runnable
    {

        final AnswersEventsHandler a;

        public void run()
        {
            try
            {
                SessionAnalyticsManagerStrategy sessionanalyticsmanagerstrategy = a.b;
                a.b = new DisabledSessionAnalyticsManagerStrategy();
                sessionanalyticsmanagerstrategy.c();
                return;
            }
            catch (Exception exception)
            {
                io.fabric.sdk.android.c.a().c("Answers", "Failed to disable events", exception);
            }
        }

            
            {
                a = AnswersEventsHandler.this;
                super();
            }
    }


    // Unreferenced inner class com/crashlytics/android/answers/AnswersEventsHandler$4

/* anonymous class */
    class _cls4
        implements Runnable
    {

        final AnswersEventsHandler a;

        public void run()
        {
            Object obj;
            Object obj1;
            SessionMetadataCollector sessionmetadatacollector;
            String s;
            String s1;
            String s2;
            String s3;
            Object obj3;
            Object obj4;
            String s4;
            try
            {
                sessionmetadatacollector = com.crashlytics.android.answers.AnswersEventsHandler.a(a);
                obj3 = sessionmetadatacollector.b.d();
                s = sessionmetadatacollector.a.getPackageName();
                s1 = sessionmetadatacollector.b.a();
                s2 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.d);
                s3 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.g);
                obj4 = sessionmetadatacollector.b;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                io.fabric.sdk.android.c.a().c("Answers", "Failed to enable events", ((Throwable) (obj)));
                return;
            }
            obj1 = null;
            obj = obj1;
            if (!((IdManager) (obj4)).a)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            obj4 = ((IdManager) (obj4)).f();
            obj = obj1;
            if (obj4 == null)
            {
                break MISSING_BLOCK_LABEL_106;
            }
            obj = Boolean.valueOf(((io.fabric.sdk.android.services.common.b) (obj4)).b);
            obj1 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.c);
            obj3 = CommonUtils.k(sessionmetadatacollector.a);
            obj4 = IdManager.b();
            s4 = IdManager.c();
            obj = new SessionEventMetadata(s, UUID.randomUUID().toString(), s1, s2, s3, ((Boolean) (obj)), ((String) (obj1)), ((String) (obj3)), ((String) (obj4)), s4, sessionmetadatacollector.c, sessionmetadatacollector.d);
            obj1 = com.crashlytics.android.answers.AnswersEventsHandler.b(a);
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
            }
            SessionEventTransform sessioneventtransform = new SessionEventTransform();
            p p1 = new p();
            Object obj2 = ((AnswersFilesManagerProvider) (obj1)).b.a();
            obj2 = new io.fabric.sdk.android.services.b.k(((AnswersFilesManagerProvider) (obj1)).a, ((java.io.File) (obj2)), "session_analytics.tap", "session_analytics_to_send");
            obj1 = new SessionAnalyticsFilesManager(((AnswersFilesManagerProvider) (obj1)).a, sessioneventtransform, p1, ((io.fabric.sdk.android.services.b.f) (obj2)));
            ((SessionAnalyticsFilesManager) (obj1)).a(a);
            a.b = new EnabledSessionAnalyticsManagerStrategy(com.crashlytics.android.answers.AnswersEventsHandler.c(a), AnswersEventsHandler.d(a), a.a, ((SessionAnalyticsFilesManager) (obj1)), AnswersEventsHandler.e(a), ((SessionEventMetadata) (obj)));
            return;
        }

            
            {
                a = AnswersEventsHandler.this;
                super();
            }
    }

}
