// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class ZK extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.cks.ZK ZK;

    public void b(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        Status status = new Status(i);
        ZK.ZK(new ZK(status, bundle));
    }

    public a(com.google.android.gms.common.api.cks cks)
    {
        ZK = (com.google.android.gms.common.api.cks.ZK)jx.b(cks, "Holder must not be null");
    }
}
