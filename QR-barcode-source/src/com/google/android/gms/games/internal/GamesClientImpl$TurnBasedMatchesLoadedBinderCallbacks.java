// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class XT extends AbstractGamesCallbacks
{

    final GamesClientImpl WC;
    private final com.google.android.gms.common.api.cks.XT XT;

    public void b(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        Status status = new Status(i);
        XT.XT(new XT(status, bundle));
    }

    public a(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        WC = gamesclientimpl;
        super();
        XT = (com.google.android.gms.common.api.cks.XT)o.b(cks, "Holder must not be null");
    }
}
