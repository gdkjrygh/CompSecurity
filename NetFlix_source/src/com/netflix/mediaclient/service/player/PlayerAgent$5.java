// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.nrdp.media.SubtitleData;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.player.subtitles.SubtitleParser;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

class 
    implements Runnable
{

    final PlayerAgent this$0;
    final SubtitleData val$event;

    public void run()
    {
        com.netflix.mediaclient.service.player.subtitles.TextStyle textstyle;
        Object obj;
        Log.d(PlayerAgent.access$1400(), "Subtitles metadata update started.");
        textstyle = PlayerAgent.access$4400(PlayerAgent.this).getUserSubtitlePreferences();
        obj = PlayerAgent.access$4500(PlayerAgent.this).getSubtitleDefaults();
        obj = new SubtitleParser(PlayerAgent.access$100(PlayerAgent.this).getDisplayAspectRatio(), textstyle, ((com.netflix.mediaclient.service.player.subtitles.TextStyle) (obj)));
        synchronized (PlayerAgent.this)
        {
            PlayerAgent.access$4602(PlayerAgent.this, ((SubtitleParser) (obj)));
        }
        ((SubtitleParser) (obj)).parse(val$event);
_L2:
        Log.d(PlayerAgent.access$1400(), "Subtitles metadata updated.");
        return;
        exception;
        playeragent;
        JVM INSTR monitorexit ;
        throw exception;
        Throwable throwable;
        throwable;
_L3:
        Log.e(PlayerAgent.access$1400(), "We failed to parse subtitle metadata", throwable);
        PlayerAgent.access$4700(PlayerAgent.this).getClientLogging().getErrorLogging().logHandledException(new RuntimeException("We failed to parse subtitle metadata", throwable));
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
          goto _L3
    }

    ()
    {
        this$0 = final_playeragent;
        val$event = SubtitleData.this;
        super();
    }
}
