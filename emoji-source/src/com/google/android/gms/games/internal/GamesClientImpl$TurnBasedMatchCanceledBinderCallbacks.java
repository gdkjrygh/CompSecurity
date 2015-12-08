// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class ON extends AbstractGamesCallbacks
{

    final GamesClientImpl NE;
    private final com.google.android.gms.common.api.cks.ON ON;

    public void f(int i, String s)
    {
        Status status = new Status(i);
        ON.ON(new ON(status, s));
    }

    public a(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        NE = gamesclientimpl;
        super();
        ON = (com.google.android.gms.common.api.cks.ON)hm.b(cks, "Holder must not be null");
    }
}
