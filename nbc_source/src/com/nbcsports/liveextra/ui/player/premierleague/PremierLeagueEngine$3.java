// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueEngine

class it> extends AdPlaybackEventListenerStub
{

    final PremierLeagueEngine this$0;

    public void onAdBreakComplete(AdBreak adbreak)
    {
        super.onAdBreakComplete(adbreak);
        PremierLeagueEngine.access$602(PremierLeagueEngine.this, false);
        PremierLeagueEngine.access$200(PremierLeagueEngine.this);
        PremierLeagueEngine.access$700(PremierLeagueEngine.this);
    }

    public void onAdBreakStart(AdBreak adbreak)
    {
        super.onAdBreakStart(adbreak);
        PremierLeagueEngine.access$602(PremierLeagueEngine.this, true);
        PremierLeagueEngine.access$100(PremierLeagueEngine.this);
        for (adbreak = listeners.iterator(); adbreak.hasNext(); ((stener)adbreak.next()).showGoLive(false)) { }
    }

    stener()
    {
        this$0 = PremierLeagueEngine.this;
        super();
    }
}
