// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.support.v4.app.Fragment;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            StartRecordingAction

final class LoadedCallback extends LoadedCallback
{

    final StartRecordingAction this$0;
    final String val$gameId;

    public final void onGameLoaded(GameFirstParty gamefirstparty)
    {
        gamefirstparty = gamefirstparty.getGame();
        PrebuiltDialogs.showVideoRecordingPrerecordDialog((GamesFragmentActivity)((Fragment) (mFragment)).mActivity, val$gameId, gamefirstparty.getInstancePackageName(), null);
    }

    LoadedCallback()
    {
        this$0 = final_startrecordingaction;
        val$gameId = String.this;
        super();
    }
}
