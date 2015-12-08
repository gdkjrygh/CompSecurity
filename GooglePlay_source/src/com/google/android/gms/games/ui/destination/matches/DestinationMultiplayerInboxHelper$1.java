// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.matches;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;

// Referenced classes of package com.google.android.gms.games.ui.destination.matches:
//            DestinationMultiplayerInboxHelper

final class this._cls0
    implements ResultCallback
{

    final DestinationMultiplayerInboxHelper this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.multiplayer.turnbased.sult)result;
        onTurnBasedMatchInitiated(result);
    }

    ult()
    {
        this$0 = DestinationMultiplayerInboxHelper.this;
        super();
    }
}
