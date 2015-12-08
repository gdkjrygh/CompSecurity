// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class yO extends AbstractGamesCallbacks
{

    final GamesClientImpl NB;
    private final com.google.android.gms.common.api.nit> yO;

    public void d(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        yO.yO(new (i, bundle));
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack)
    {
        NB = gamesclientimpl;
        super();
        yO = (com.google.android.gms.common.api.ack.yO)hn.b(ack, "Holder must not be null");
    }
}
