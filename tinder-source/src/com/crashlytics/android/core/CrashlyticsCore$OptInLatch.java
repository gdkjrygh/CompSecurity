// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore

private class <init>
{

    boolean a;
    final CountDownLatch b;
    final CrashlyticsCore c;

    final void a(boolean flag)
    {
        a = flag;
        b.countDown();
    }

    private (CrashlyticsCore crashlyticscore)
    {
        c = crashlyticscore;
        super();
        a = false;
        b = new CountDownLatch(1);
    }

    b(CrashlyticsCore crashlyticscore, byte byte0)
    {
        this(crashlyticscore);
    }
}
