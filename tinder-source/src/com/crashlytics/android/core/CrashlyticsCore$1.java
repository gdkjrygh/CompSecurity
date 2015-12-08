// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.d;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore

class nit> extends d
{

    final CrashlyticsCore a;

    public final Priority a()
    {
        return Priority.d;
    }

    public Object call()
        throws Exception
    {
        return a.d();
    }

    rity(CrashlyticsCore crashlyticscore)
    {
        a = crashlyticscore;
        super();
    }
}
