// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.b.b;
import io.fabric.sdk.android.services.b.d;
import io.fabric.sdk.android.services.b.j;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.g;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManagerStrategy, KeepAllEventFilter, SessionEvent, EventFilter, 
//            SessionAnalyticsFilesSender, AnswersRetryFilesSender, SessionAnalyticsFilesManager, SamplingEventFilter, 
//            SessionEventMetadata

class EnabledSessionAnalyticsManagerStrategy extends b
    implements SessionAnalyticsManagerStrategy
{

    final SessionEventMetadata a;
    EventFilter b;
    j c;
    g d;
    boolean e;
    boolean f;
    private final h l;
    private final io.fabric.sdk.android.services.network.c m;

    public EnabledSessionAnalyticsManagerStrategy(h h, Context context, ScheduledExecutorService scheduledexecutorservice, SessionAnalyticsFilesManager sessionanalyticsfilesmanager, io.fabric.sdk.android.services.network.c c1, SessionEventMetadata sessioneventmetadata)
    {
        super(context, scheduledexecutorservice, sessionanalyticsfilesmanager);
        b = new KeepAllEventFilter();
        d = new g();
        e = true;
        f = true;
        l = h;
        m = c1;
        a = sessioneventmetadata;
    }

    public final j a()
    {
        return c;
    }

    public final void a(SessionEvent.Builder builder)
    {
        boolean flag = false;
        builder = new SessionEvent(a, builder.b, builder.a, builder.c, builder.d, builder.e, builder.f, builder.g, (byte)0);
        if (!e && com.crashlytics.android.answers.SessionEvent.Type.k.equals(((SessionEvent) (builder)).c))
        {
            io.fabric.sdk.android.c.a().a("Answers", (new StringBuilder("Custom events tracking disabled - skipping event: ")).append(builder).toString());
        } else
        {
            if (!f && SessionEvent.Type.l.equals(((SessionEvent) (builder)).c))
            {
                io.fabric.sdk.android.c.a().a("Answers", (new StringBuilder("Predefined events tracking disabled - skipping event: ")).append(builder).toString());
                return;
            }
            if (b.a(builder))
            {
                io.fabric.sdk.android.c.a().a("Answers", (new StringBuilder("Skipping filtered event: ")).append(builder).toString());
                return;
            }
            CommonUtils.a(super.g, builder.toString());
            try
            {
                super.h.a(builder);
            }
            // Misplaced declaration of an exception variable
            catch (SessionEvent.Builder builder)
            {
                CommonUtils.b(super.g, "Failed to write event.");
            }
            if (super.k != -1)
            {
                flag = true;
            }
            if (flag)
            {
                a(super.k, super.k);
                return;
            }
        }
    }

    public final void a(io.fabric.sdk.android.services.settings.b b1, String s)
    {
        c = AnswersRetryFilesSender.a(new SessionAnalyticsFilesSender(l, s, b1.a, m, g.a(g)));
        ((SessionAnalyticsFilesManager)h).a = b1;
        e = b1.f;
        k k1 = io.fabric.sdk.android.c.a();
        StringBuilder stringbuilder = new StringBuilder("Custom event tracking ");
        if (e)
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        k1.a("Answers", stringbuilder.append(s).toString());
        f = b1.g;
        k1 = io.fabric.sdk.android.c.a();
        stringbuilder = new StringBuilder("Predefined event tracking ");
        if (f)
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        k1.a("Answers", stringbuilder.append(s).toString());
        if (b1.h > 1)
        {
            io.fabric.sdk.android.c.a().a("Answers", "Event sampling enabled");
            b = new SamplingEventFilter(b1.h);
        }
        super.k = b1.b;
        a(0L, super.k);
    }
}
