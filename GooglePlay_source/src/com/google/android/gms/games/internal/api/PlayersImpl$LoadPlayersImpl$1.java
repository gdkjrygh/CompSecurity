// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

final class val.status
    implements com.google.android.gms.games.layersImpl._cls1
{

    final val.status this$0;
    final Status val$status;

    public final PlayerBuffer getPlayers()
    {
        return new PlayerBuffer(DataHolder.empty(14));
    }

    public final Status getStatus()
    {
        return val$status;
    }

    public final void release()
    {
    }

    ()
    {
        this$0 = final_;
        val$status = Status.this;
        super();
    }
}
