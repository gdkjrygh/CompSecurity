// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class onLoad extends 
{

    private static HashMap sPlayerMap = new HashMap();
    private final allback mCallback;
    private final String mPlayerId;

    protected final PendingResult onLoad(GoogleApiClient googleapiclient)
    {
        if (sPlayerMap.containsKey(mPlayerId))
        {
            mCallback.onPlayerLoaded((Player)sPlayerMap.get(mPlayerId));
            finish();
        } else
        if (googleapiclient != null)
        {
            return Games.Players.loadPlayer(googleapiclient, mPlayerId);
        }
        return null;
    }

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games..PlayerLoader)result;
        if (mFragment.canUseResult(result) && result.yers().getCount() > 0)
        {
            Player player = (Player)result.yers().get(0).freeze();
            sPlayerMap.put(mPlayerId, player);
            mCallback.onPlayerLoaded(player);
        } else
        {
            GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load player: ")).append(mPlayerId).toString());
            mCallback.onPlayerLoadFailed();
        }
        result.e();
        finish();
    }


    public allback(AppContentFragment appcontentfragment, String s, allback allback)
    {
        super(appcontentfragment);
        mPlayerId = s;
        mCallback = allback;
        onLoad(null);
    }
}
