// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class onLoad extends er
{

    private static HashMap sGameMap = new HashMap();
    private final String mApplicationId;
    private final allback mCallback;

    protected final PendingResult onLoad(GoogleApiClient googleapiclient)
    {
        if (sGameMap.containsKey(mApplicationId))
        {
            mCallback.onGameLoaded((GameFirstParty)sGameMap.get(mApplicationId));
            finish();
        } else
        if (googleapiclient != null)
        {
            return PlayGames.GamesMetadata.loadGame(googleapiclient, mApplicationId);
        }
        return null;
    }

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.client.games.)result;
        if (mFragment.canUseResult(result) && result.getGames().getCount() > 0)
        {
            GameFirstParty gamefirstparty = (GameFirstParty)((GameFirstParty)result.getGames().get(0)).freeze();
            sGameMap.put(mApplicationId, gamefirstparty);
            mCallback.onGameLoaded(gamefirstparty);
        } else
        {
            GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load game: ")).append(mApplicationId).toString());
            mCallback.onGameLoadFailed();
        }
        result.release();
        finish();
    }


    public allback(AppContentFragment appcontentfragment, String s, allback allback)
    {
        super(appcontentfragment);
        mApplicationId = s;
        mCallback = allback;
        onLoad(null);
    }
}
