// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.widget.Toast;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesSettingsFragment

final class this._cls0
    implements ResultCallback
{

    final GamesSettingsFragment this$0;

    public final volatile void onResult(Result result)
    {
        Object obj = (com.google.android.gms.games.atusChangeResult)result;
        result = GamesSettingsFragment.this;
        int i = ((com.google.android.gms.games.atusChangeResult) (obj)).getStatus().mStatusCode;
        String s = ((com.google.android.gms.games.atusChangeResult) (obj)).getExternalGameId();
        boolean flag = ((com.google.android.gms.games.atusChangeResult) (obj)).isMuted();
        obj = (String)((GamesSettingsFragment) (result)).mUnmutedGamesMap.get(s);
        if (flag)
        {
            GamesLog.e("GamesSettings", (new StringBuilder("Application was not unmuted as it should have been. (status: ")).append(i).append(", externalGameId: ").append(s).toString());
        } else
        if (obj != null)
        {
            s = result.getString(0x7f1002c5, new Object[] {
                obj
            });
            Toast.makeText(((Fragment) (result)).mActivity.getApplicationContext(), s, 0).show();
        } else
        {
            GamesLog.w("GamesSettings", (new StringBuilder("Display name of unmuted game with externalGameId: ")).append(s).append(" was not found!").toString());
        }
        result.loadMutedGames(true);
    }

    sChangeResult()
    {
        this$0 = GamesSettingsFragment.this;
        super();
    }
}
