// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.services.network.d;
import java.io.InputStream;

// Referenced classes of package com.crashlytics.android.core:
//            PinningInfoProvider

class CrashlyticsPinningInfoProvider
    implements d
{

    private final PinningInfoProvider a;

    public CrashlyticsPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
    {
        a = pinninginfoprovider;
    }

    public final InputStream a()
    {
        return a.a();
    }

    public final String b()
    {
        return a.b();
    }

    public final String[] c()
    {
        return a.c();
    }
}
