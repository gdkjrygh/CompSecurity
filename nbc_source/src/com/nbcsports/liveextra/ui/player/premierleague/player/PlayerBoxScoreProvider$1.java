// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerBoxScoreProvider

class val.pid
    implements Func1
{

    final PlayerBoxScoreProvider this$0;
    final int val$pid;

    public Boolean call(com.nbcsports.liveextra.content.models.overlay.premierleague.d d)
    {
        boolean flag;
        if (d.d() == val$pid)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((com.nbcsports.liveextra.content.models.overlay.premierleague.d)obj);
    }

    ()
    {
        this$0 = final_playerboxscoreprovider;
        val$pid = I.this;
        super();
    }
}
