// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class De extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.ack.De De;
    final GamesClientImpl WC;

    public void dz(int i)
    {
        De.De(new Status(i));
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack)
    {
        WC = gamesclientimpl;
        super();
        De = (com.google.android.gms.common.api.ack.De)o.b(ack, "Holder must not be null");
    }
}
