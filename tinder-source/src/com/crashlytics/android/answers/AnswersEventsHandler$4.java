// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.c.a;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.b;
import io.fabric.sdk.android.services.common.p;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//            AnswersEventsHandler, SessionMetadataCollector, SessionEventMetadata, SessionEventTransform, 
//            AnswersFilesManagerProvider, SessionAnalyticsFilesManager, EnabledSessionAnalyticsManagerStrategy

class a
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
            s2 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.ierType.d);
            s3 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.ierType.g);
            obj4 = sessionmetadatacollector.b;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            c.a().c("Answers", "Failed to enable events", ((Throwable) (obj)));
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
        obj = Boolean.valueOf(((b) (obj4)).b);
        obj1 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.ierType.c);
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

    ManagerStrategy(AnswersEventsHandler answerseventshandler)
    {
        a = answerseventshandler;
        super();
    }
}
