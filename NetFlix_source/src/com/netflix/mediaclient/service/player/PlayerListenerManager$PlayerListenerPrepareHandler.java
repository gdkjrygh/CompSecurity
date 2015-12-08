// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.service.NrdController;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerListenerManager, PlayerAgent

private class <init>
    implements <init>
{

    final PlayerListenerManager this$0;

    public transient void handle(com.netflix.mediaclient.servicemgr.ler ler, Object aobj[])
    {
        if (ler.ler())
        {
            ler.ler();
            aobj = PlayerListenerManager.access$1900(PlayerListenerManager.this).getNrdController().getNrdp().getMedia();
            ler._mth0(((IMedia) (aobj)).getVideoWidth(), ((IMedia) (aobj)).getVideoHeight());
        }
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
