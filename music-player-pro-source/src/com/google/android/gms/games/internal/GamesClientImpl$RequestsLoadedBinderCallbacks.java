// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class Zw extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.it> Zw;

    public void c(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        Status status = new Status(i);
        Zw.Zw(new Zw(status, bundle));
    }

    public Y(com.google.android.gms.common.api.cks cks)
    {
        Zw = (com.google.android.gms.common.api.cks.Zw)jx.b(cks, "Holder must not be null");
    }
}
