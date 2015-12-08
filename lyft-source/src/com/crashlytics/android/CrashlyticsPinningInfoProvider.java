// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import io.fabric.sdk.android.services.network.PinningInfoProvider;
import java.io.InputStream;

// Referenced classes of package com.crashlytics.android:
//            PinningInfoProvider

class CrashlyticsPinningInfoProvider
    implements PinningInfoProvider
{

    private final com.crashlytics.android.PinningInfoProvider a;

    public CrashlyticsPinningInfoProvider(com.crashlytics.android.PinningInfoProvider pinninginfoprovider)
    {
        a = pinninginfoprovider;
    }

    public InputStream a()
    {
        return a.a();
    }

    public String b()
    {
        return a.b();
    }

    public String[] c()
    {
        return a.c();
    }

    public long d()
    {
        return -1L;
    }
}
