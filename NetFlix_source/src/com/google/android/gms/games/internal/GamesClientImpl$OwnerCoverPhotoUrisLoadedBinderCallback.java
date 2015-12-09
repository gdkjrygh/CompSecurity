// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

final class wH extends AbstractGamesCallbacks
{

    final GamesClientImpl IJ;
    private final com.google.android.gms.common.api.ack.wH wH;

    public void c(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        IJ.a(new (IJ, wH, i, bundle));
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack)
    {
        IJ = gamesclientimpl;
        super();
        wH = (com.google.android.gms.common.api.ack.wH)fq.b(ack, "Holder must not be null");
    }
}
