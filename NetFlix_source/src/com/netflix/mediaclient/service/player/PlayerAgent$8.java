// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;


// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

class val.arguments
    implements Runnable
{

    final PlayerAgent this$0;
    final Object val$arguments[];
    final Manager.PlayerListenerHandler val$handler;
    final com.netflix.mediaclient.servicemgr.Listener val$listener;

    public void run()
    {
        val$handler.handle(val$listener, val$arguments);
    }

    ener()
    {
        this$0 = final_playeragent;
        val$handler = playerlistenerhandler;
        val$listener = listener1;
        val$arguments = _5B_Ljava.lang.Object_3B_.this;
        super();
    }
}
