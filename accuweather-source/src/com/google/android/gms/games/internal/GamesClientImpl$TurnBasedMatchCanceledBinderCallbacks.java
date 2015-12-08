// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class OK extends AbstractGamesCallbacks
{

    final GamesClientImpl NB;
    private final com.google.android.gms.common.api.cks.OK OK;

    public void f(int i, String s)
    {
        Status status = new Status(i);
        OK.OK(new OK(status, s));
    }

    public a(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        NB = gamesclientimpl;
        super();
        OK = (com.google.android.gms.common.api.cks.OK)hn.b(cks, "Holder must not be null");
    }
}
