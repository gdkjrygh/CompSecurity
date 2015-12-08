// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.support.v4.app.Fragment;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            SharePackageAction

final class meLoadedCallback extends meLoadedCallback
{

    final SharePackageAction this$0;
    final String val$applicationId;

    public final void onGameLoadFailed()
    {
        GamesLog.e("SharePackageAct", (new StringBuilder("Game load failed for applicationId ")).append(val$applicationId).toString());
    }

    public final void onGameLoaded(GameFirstParty gamefirstparty)
    {
        gamefirstparty = gamefirstparty.getGame();
        ((GamesFragmentActivity)((Fragment) (mFragment)).mActivity).shareGame(gamefirstparty.getDisplayName(), gamefirstparty.getInstancePackageName());
    }

    meLoadedCallback()
    {
        this$0 = final_sharepackageaction;
        val$applicationId = String.this;
        super();
    }
}
