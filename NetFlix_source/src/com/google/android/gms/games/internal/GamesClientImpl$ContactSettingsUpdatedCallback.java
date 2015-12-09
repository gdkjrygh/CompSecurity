// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class wJ extends com.google.android.gms.internal.lback
{

    final GamesClientImpl IJ;
    private final Status wJ;

    protected void a(Object obj)
    {
        c((com.google.android.gms.common.api.ack.c)obj);
    }

    protected void c(com.google.android.gms.common.api.ack ack)
    {
        ack.ack(wJ);
    }

    protected void dx()
    {
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, int i)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack);
        wJ = new Status(i);
    }
}
