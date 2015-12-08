// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class De extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.nit> De;
    final GamesClientImpl WC;

    public void d(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        De.De(new (i, bundle));
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack)
    {
        WC = gamesclientimpl;
        super();
        De = (com.google.android.gms.common.api.ack.De)o.b(ack, "Holder must not be null");
    }
}
