// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.games.ui.client.matches:
//            RealTimeWaitingRoomActivity

final class this._cls0
    implements android.content.r
{

    final RealTimeWaitingRoomActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        RealTimeWaitingRoomActivity.access$800$1a7b9ee7(RealTimeWaitingRoomActivity.this, RealTimeWaitingRoomActivity.access$700());
        if (i == -1)
        {
            RealTimeWaitingRoomActivity.access$600(RealTimeWaitingRoomActivity.this, 10005);
            finish();
            return;
        } else
        {
            RealTimeWaitingRoomActivity.access$1000(RealTimeWaitingRoomActivity.this);
            return;
        }
    }

    ()
    {
        this$0 = RealTimeWaitingRoomActivity.this;
        super();
    }
}
