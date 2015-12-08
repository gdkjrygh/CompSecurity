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

    final Crashlytics this$0;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        return doInBackground();
    }

    public Priority getPriority()
    {
        return Priority.IMMEDIATE;
    }

    ency.Priority()
    {
        this$0 = Crashlytics.this;
        super();
    }
}
