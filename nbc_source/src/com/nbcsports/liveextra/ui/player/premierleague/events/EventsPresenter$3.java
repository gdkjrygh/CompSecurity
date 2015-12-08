// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.events;

import com.nbcsports.liveextra.ui.player.AbstractPresenterListener;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.events:
//            EventsPresenter, EventsView

class this._cls0 extends AbstractPresenterListener
{

    final EventsPresenter this$0;

    public void onAdBreakComplete()
    {
        super.onAdBreakComplete();
        if (!hasView())
        {
            return;
        } else
        {
            ((EventsView)EventsPresenter.access$500(EventsPresenter.this)).enablePrematch(true);
            return;
        }
    }

    public void onAdBreakStart()
    {
        super.onAdBreakStart();
        if (!hasView())
        {
            return;
        } else
        {
            ((EventsView)EventsPresenter.access$400(EventsPresenter.this)).enablePrematch(false);
            return;
        }
    }

    public void onPlayComplete()
    {
        super.onPlayComplete();
        if (!hasView())
        {
            return;
        } else
        {
            ((EventsView)EventsPresenter.access$600(EventsPresenter.this)).enablePrematch(false);
            return;
        }
    }

    ()
    {
        this$0 = EventsPresenter.this;
        super();
    }
}
