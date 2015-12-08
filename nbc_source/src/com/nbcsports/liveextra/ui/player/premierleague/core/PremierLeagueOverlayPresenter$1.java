// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague.core;

import com.nbcsports.liveextra.ui.player.AbstractPresenterListener;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague.core:
//            PremierLeagueOverlayPresenter

class this._cls0 extends AbstractPresenterListener
{

    final PremierLeagueOverlayPresenter this$0;

    public void onAdBreakComplete()
    {
        super.onAdBreakComplete();
        adComplete();
    }

    public void onAdBreakStart()
    {
        super.onAdBreakStart();
        adStart();
    }

    public void onPlayComplete()
    {
        super.onPlayComplete();
        onComplete();
    }

    public void onToggleFullScreen(boolean flag)
    {
        super.onToggleFullScreen(flag);
        if (flag)
        {
            pause();
            return;
        } else
        {
            resume();
            return;
        }
    }

    ()
    {
        this$0 = PremierLeagueOverlayPresenter.this;
        super();
    }
}
