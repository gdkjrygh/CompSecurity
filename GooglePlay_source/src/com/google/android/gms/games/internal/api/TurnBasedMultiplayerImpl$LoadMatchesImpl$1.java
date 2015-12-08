// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            TurnBasedMultiplayerImpl

final class val.status
    implements com.google.android.gms.games.multiplayer.turnbased.s
{

    final val.status this$0;
    final Status val$status;

    public final LoadMatchesResponse getMatches()
    {
        return new LoadMatchesResponse(new Bundle());
    }

    public final Status getStatus()
    {
        return val$status;
    }

    public final void release()
    {
    }

    sult()
    {
        this$0 = final_sult;
        val$status = Status.this;
        super();
    }
}
