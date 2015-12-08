// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

abstract class BB extends com.google.android.gms.internal.lback
    implements Releasable, Result
{

    final DataHolder BB;
    final GamesClientImpl IJ;
    final Status wJ;

    public Status getStatus()
    {
        return wJ;
    }

    public void release()
    {
        if (BB != null)
        {
            BB.close();
        }
    }

    public (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack, dataholder);
        wJ = new Status(dataholder.getStatusCode());
        BB = dataholder;
    }
}
