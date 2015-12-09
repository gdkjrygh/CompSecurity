// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.crashlytics.android.internal:
//            n, bg, f, ba, 
//            j, bu

final class e extends n
{

    private final Application b;
    private final android.app.Application.ActivityLifecycleCallbacks c;

    public e(Application application, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, j j, bu bu)
    {
        this(application, s, s1, s2, s3, s4, s5, s6, j, bg.b("Crashlytics Trace Manager"), bu);
    }

    private e(Application application, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, j j, ScheduledExecutorService scheduledexecutorservice, bu bu)
    {
        super(s, s1, s2, s3, s4, s5, s6, j, scheduledexecutorservice, bu);
        c = new f(this);
        b = application;
        ba.c("Registering activity lifecycle callbacks for session analytics.");
        application.registerActivityLifecycleCallbacks(c);
    }

    final void a()
    {
        ba.c("Unregistering activity lifecycle callbacks for session analytics");
        b.unregisterActivityLifecycleCallbacks(c);
        super.a();
    }
}
