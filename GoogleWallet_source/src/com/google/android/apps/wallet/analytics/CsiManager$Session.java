// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import android.os.SystemClock;
import java.util.UUID;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            CsiManager

static final class A
{

    private final long expirationTimestamp = SystemClock.elapsedRealtime() + 0x36ee80L;
    public final String id = UUID.randomUUID().toString();

    public final boolean isExpired()
    {
        return SystemClock.elapsedRealtime() > expirationTimestamp;
    }

    public A()
    {
    }
}
