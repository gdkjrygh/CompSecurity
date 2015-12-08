// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.player;

import rx.functions.Func1;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.player:
//            PlayerItemPresenter

class this._cls0
    implements Func1
{

    final PlayerItemPresenter this$0;

    public Boolean call(com.nbcsports.liveextra.content.models.overlay.premierleague.melineEvent melineevent)
    {
        boolean flag;
        if (melineevent.getPid() == PlayerItemPresenter.access$600(PlayerItemPresenter.this).id() && melineevent.getEventType().equals("Card"))
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
        return call((com.nbcsports.liveextra.content.models.overlay.premierleague.melineEvent)obj);
    }

    ine.TimelineEvent()
    {
        this$0 = PlayerItemPresenter.this;
        super();
    }
}
