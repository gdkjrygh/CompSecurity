// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static final class onLoad extends r
{

    private static final HashMap sMatchMap = new HashMap();
    private final allback mCallback;
    private final String mMatchId;

    protected final PendingResult onLoad(GoogleApiClient googleapiclient)
    {
        if (sMatchMap.containsKey(mMatchId))
        {
            mCallback.onMatchLoaded((TurnBasedMatch)sMatchMap.get(mMatchId));
            finish();
        } else
        if (googleapiclient != null)
        {
            return Games.TurnBasedMultiplayer.loadMatch(googleapiclient, mMatchId);
        }
        return null;
    }

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.multiplayer.turnbased.esult)result;
        if (mFragment.canUseResult(result))
        {
            result = (TurnBasedMatch)result.getMatch().freeze();
            sMatchMap.put(mMatchId, result);
            mCallback.onMatchLoaded(result);
        } else
        {
            GamesLog.e("AppContentFrag", (new StringBuilder("Failed to load match: ")).append(mMatchId).toString());
        }
        finish();
    }


    public allback(AppContentFragment appcontentfragment, String s, allback allback)
    {
        super(appcontentfragment);
        mMatchId = s;
        mCallback = allback;
        onLoad(null);
    }
}
