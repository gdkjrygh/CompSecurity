// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

final class JF extends AbstractGamesCallbacks
{

    final GamesClientImpl IJ;
    private final com.google.android.gms.common.api.cks.JF JF;

    public void a(int i, Bundle bundle)
    {
        bundle.setClassLoader(getClass().getClassLoader());
        Status status = new Status(i);
        IJ.a(new IJ(IJ, JF, status, bundle));
    }

    public a(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        IJ = gamesclientimpl;
        super();
        JF = (com.google.android.gms.common.api.cks.JF)fq.b(cks, "Holder must not be null");
    }
}
