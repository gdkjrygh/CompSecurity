// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import android.content.Context;
import com.skype.android.inject.LifecycleAdapter;

// Referenced classes of package com.skype.android.analytics:
//            SessionReporter

public class AnalyticsLifecycleObserver extends LifecycleAdapter
{

    Context a;
    SessionReporter b;

    AnalyticsLifecycleObserver(Context context, SessionReporter sessionreporter)
    {
        a = context;
        b = sessionreporter;
    }

    public void onStart()
    {
        b.a();
    }

    public void onStop()
    {
        b.b();
    }
}
