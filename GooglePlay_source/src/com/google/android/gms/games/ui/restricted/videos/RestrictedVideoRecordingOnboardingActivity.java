// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.restricted.videos;

import android.content.Intent;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.ui.common.videos.VideoRecordingOnboardingActivity;

public class RestrictedVideoRecordingOnboardingActivity extends VideoRecordingOnboardingActivity
{

    public RestrictedVideoRecordingOnboardingActivity()
    {
    }

    public final void logAction(int i)
    {
        i;
        JVM INSTR tableswitch 1 5: default 36
    //                   1 58
    //                   2 90
    //                   3 96
    //                   4 102
    //                   5 108;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        GamesLog.w("RestVideoRecOnboardAct", (new StringBuilder("Unknown action type received: ")).append(i).toString());
        return;
_L2:
        i = 40;
_L8:
        Intent intent = getIntent();
        GamesPlayLogger.logInGameAction(this, intent.getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME"), intent.getStringExtra("com.google.android.gms.games.GAME_ID"), intent.getStringExtra("com.google.android.gms.games.ACCOUNT_NAME"), i);
        return;
_L3:
        i = 41;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 42;
        continue; /* Loop/switch isn't completed */
_L5:
        i = 43;
        continue; /* Loop/switch isn't completed */
_L6:
        i = 44;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
