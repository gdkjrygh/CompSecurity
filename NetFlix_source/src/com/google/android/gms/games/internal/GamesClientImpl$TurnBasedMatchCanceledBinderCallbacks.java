// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

final class Jz extends AbstractGamesCallbacks
{

    final GamesClientImpl IJ;
    private final com.google.android.gms.common.api.cks.Jz Jz;

    public void f(int i, String s)
    {
        Status status = new Status(i);
        IJ.a(new IJ(IJ, Jz, status, s));
    }

    public a(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        IJ = gamesclientimpl;
        super();
        Jz = (com.google.android.gms.common.api.cks.Jz)fq.b(cks, "Holder must not be null");
    }
}
