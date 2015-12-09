// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.videos;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.EventProtoCache;
import com.google.android.gms.games.logging.GamesLogflowLogger;
import com.google.android.gms.games.ui.common.videos.VideoRecordingOnboardingActivity;

public class DestinationVideoRecordingOnboardingActivity extends VideoRecordingOnboardingActivity
{

    private GamesLogflowLogger mLogflowLogger;

    public DestinationVideoRecordingOnboardingActivity()
    {
    }

    public final void logAction(int i)
    {
        i;
        JVM INSTR tableswitch 1 5: default 36
    //                   1 58
    //                   2 79
    //                   3 89
    //                   4 99
    //                   5 109;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_109;
_L1:
        GamesLog.w("DestVideoRecOnboardAct", (new StringBuilder("Unknown action type received: ")).append(i).toString());
        return;
_L2:
        boolean flag;
        i = 302;
        flag = false;
_L7:
        if (flag)
        {
            mLogflowLogger.logVideoRecordingOnboardingImpression(i);
            return;
        } else
        {
            GamesLogflowLogger gameslogflowlogger = mLogflowLogger;
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesClickEvent playloggamesclickevent = gameslogflowlogger.mProtoCache.obtainPlaylogGamesClickEvent();
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement playloggamesuielement = gameslogflowlogger.mProtoCache.obtainPlaylogGamesUiElement();
            playloggamesuielement.type = i;
            playloggamesclickevent.elementPath = (new com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement[] {
                playloggamesuielement
            });
            gameslogflowlogger.logClickEvent(playloggamesclickevent);
            return;
        }
_L3:
        i = 303;
        flag = false;
          goto _L7
_L4:
        i = 304;
        flag = false;
          goto _L7
_L5:
        i = 305;
        flag = true;
          goto _L7
        i = 306;
        flag = true;
          goto _L7
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        mLogflowLogger = new GamesLogflowLogger(this, 3, bundle.getStringExtra("com.google.android.gms.games.ACCOUNT_NAME"), bundle.getStringExtra("com.google.android.gms.games.GAME_ID"));
    }
}
