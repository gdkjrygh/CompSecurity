// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import com.adobe.mediacore.MediaPlayer;
import com.nbcsports.liveextra.library.player.QosEventListenerStub;
import java.util.List;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueEngine

class this._cls0 extends QosEventListenerStub
{

    final PremierLeagueEngine this$0;

    public void onSeekComplete(long l)
    {
        super.onSeekComplete(l);
        PremierLeagueEngine.access$002(PremierLeagueEngine.this, false);
        PremierLeagueEngine.access$100(PremierLeagueEngine.this);
        PremierLeagueEngine.access$200(PremierLeagueEngine.this);
        onTick(0L);
        PremierLeagueEngine.access$300(PremierLeagueEngine.this).play();
        for (int i = 0; i < listeners.size(); i++)
        {
            ((stener)listeners.get(i)).onSeekComplete();
        }

    }

    public void onSeekStart()
    {
        super.onSeekStart();
        if (!PremierLeagueEngine.access$000(PremierLeagueEngine.this))
        {
            PremierLeagueEngine.access$002(PremierLeagueEngine.this, true);
            PremierLeagueEngine.access$100(PremierLeagueEngine.this);
            int i = 0;
            while (i < listeners.size()) 
            {
                ((stener)listeners.get(i)).onSeek();
                i++;
            }
        }
    }

    stener()
    {
        this$0 = PremierLeagueEngine.this;
        super();
    }
}
