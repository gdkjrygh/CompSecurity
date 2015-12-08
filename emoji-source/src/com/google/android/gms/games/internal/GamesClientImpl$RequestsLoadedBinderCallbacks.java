// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class OE extends AbstractGamesCallbacks
{

    final GamesClientImpl NE;
    private final com.google.android.gms.common.api.it> OE;

    public void c(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        Status status = new Status(i);
        OE.OE(new OE(status, bundle));
    }

    public Y(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        NE = gamesclientimpl;
        super();
        OE = (com.google.android.gms.common.api.cks.OE)hm.b(cks, "Holder must not be null");
    }
}
