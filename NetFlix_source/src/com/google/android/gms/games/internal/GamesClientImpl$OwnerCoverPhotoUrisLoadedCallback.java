// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Jf extends com.google.android.gms.internal.lback
    implements com.google.android.gms.games.Callback
{

    final GamesClientImpl IJ;
    private final Bundle Jf;
    private final Status wJ;

    protected void a(Object obj)
    {
        c((com.google.android.gms.common.api.ack.c)obj);
    }

    protected void c(com.google.android.gms.common.api.ack ack)
    {
        ack.ack(this);
    }

    protected void dx()
    {
    }

    public Status getStatus()
    {
        return wJ;
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, int i, Bundle bundle)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack);
        wJ = new Status(i);
        Jf = bundle;
    }
}
