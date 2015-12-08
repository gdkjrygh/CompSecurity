// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.b.a;
import io.fabric.sdk.android.services.settings.b;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsManagerStrategy

class DisabledSessionAnalyticsManagerStrategy extends a
    implements SessionAnalyticsManagerStrategy
{

    DisabledSessionAnalyticsManagerStrategy()
    {
    }

    public final void a(SessionEvent.Builder builder)
    {
    }

    public final void a(b b, String s)
    {
    }
}
