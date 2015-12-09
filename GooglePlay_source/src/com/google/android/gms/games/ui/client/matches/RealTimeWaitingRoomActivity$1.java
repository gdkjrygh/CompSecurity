// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;


// Referenced classes of package com.google.android.gms.games.ui.client.matches:
//            RealTimeWaitingRoomActivity

final class this._cls0
    implements Runnable
{

    final RealTimeWaitingRoomActivity this$0;

    public final void run()
    {
        if (RealTimeWaitingRoomActivity.access$000(RealTimeWaitingRoomActivity.this) == null || isFinishing())
        {
            return;
        }
        if (RealTimeWaitingRoomActivity.access$100(RealTimeWaitingRoomActivity.this))
        {
            RealTimeWaitingRoomActivity.access$200(RealTimeWaitingRoomActivity.this);
            return;
        } else
        {
            RealTimeWaitingRoomActivity.access$300(RealTimeWaitingRoomActivity.this);
            return;
        }
    }

    ()
    {
        this$0 = RealTimeWaitingRoomActivity.this;
        super();
    }
}
