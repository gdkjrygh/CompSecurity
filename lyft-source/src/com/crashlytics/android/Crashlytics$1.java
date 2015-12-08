// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityCallable;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics

class ency.PriorityCallable extends PriorityCallable
{

    final Crashlytics a;

    public Void a()
    {
        return a.b();
    }

    public Priority b()
    {
        return Priority.d;
    }

    public Object call()
    {
        return a();
    }

    ency.Priority(Crashlytics crashlytics)
    {
        a = crashlytics;
        super();
    }
}
