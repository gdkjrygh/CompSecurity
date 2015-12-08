// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Asserts;

// Referenced classes of package com.google.android.gms.games.ui.client.matches:
//            RealTimeWaitingRoomActivity

final class this._cls0
    implements Runnable
{

    final RealTimeWaitingRoomActivity this$0;

    public final void run()
    {
        Asserts.checkMainThread("return to game sequence not on main thread");
        if (!RealTimeWaitingRoomActivity.access$1400(RealTimeWaitingRoomActivity.this) || !getGoogleApiClient().isConnected())
        {
            RealTimeWaitingRoomActivity.access$600(RealTimeWaitingRoomActivity.this, 0);
        } else
        {
            RealTimeWaitingRoomActivity.access$600(RealTimeWaitingRoomActivity.this, -1);
        }
        finish();
    }

    ()
    {
        this$0 = RealTimeWaitingRoomActivity.this;
        super();
    }
}
