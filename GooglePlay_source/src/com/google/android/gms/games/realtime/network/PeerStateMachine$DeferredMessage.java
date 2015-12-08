// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.os.Message;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            PeerStateMachine

private abstract class msg
{

    public final Message msg;
    final PeerStateMachine this$0;

    public abstract void dispatch();

    protected (Message message)
    {
        this$0 = PeerStateMachine.this;
        super();
        msg = message;
    }
}
