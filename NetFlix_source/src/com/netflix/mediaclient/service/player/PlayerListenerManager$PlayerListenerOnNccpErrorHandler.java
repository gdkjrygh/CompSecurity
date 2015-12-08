// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.event.nrdp.media.NccpError;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerListenerManager

private class <init>
    implements <init>
{

    final PlayerListenerManager this$0;

    public transient void handle(com.netflix.mediaclient.servicemgr.ler ler, Object aobj[])
    {
        while (!ler.ler() || aobj == null || aobj.length < 1 || !(aobj[0] instanceof NccpError)) 
        {
            return;
        }
        ler.ler((NccpError)aobj[0]);
    }

    private ()
    {
        this$0 = PlayerListenerManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
