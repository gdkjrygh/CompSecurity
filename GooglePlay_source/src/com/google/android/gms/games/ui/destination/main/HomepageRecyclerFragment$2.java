// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.api.BatchResult;
import com.google.android.gms.common.api.BatchResultToken;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.card.OnyxGotItCardAdapter;
import com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter;
import com.google.android.gms.games.ui.destination.players.FriendsArePlaying;
import com.google.android.gms.games.ui.destination.players.FriendsArePlayingAdapter;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            HomepageRecyclerFragment

final class val.gamersResultToken
    implements ResultCallback
{

    final HomepageRecyclerFragment this$0;
    final BatchResultToken val$friendsPlayingResultToken;
    final BatchResultToken val$gamersResultToken;

    public final volatile void onResult(Result result)
    {
        com.google.android.gms.games.eRecyclerFragment erecyclerfragment;
        com.google.android.gms.games.eRecyclerFragment erecyclerfragment1;
        result = (BatchResult)result;
        erecyclerfragment1 = (com.google.android.gms.games.eRecyclerFragment)result.take(val$friendsPlayingResultToken);
        int i = erecyclerfragment1.etStatus().mStatusCode;
        erecyclerfragment = (com.google.android.gms.games.etStatus)result.take(val$gamersResultToken);
        i = erecyclerfragment.etStatus().mStatusCode;
        boolean flag = HomepageRecyclerFragment.access$1000(HomepageRecyclerFragment.this);
        if (flag) goto _L2; else goto _L1
_L1:
        erecyclerfragment.etPlayers().release();
_L8:
        return;
_L2:
        String s;
        PlayerBuffer playerbuffer;
        ObjectDataBuffer objectdatabuffer;
        ArrayMap arraymap;
        int k;
        int l;
        HomepageRecyclerFragment.access$1100(HomepageRecyclerFragment.this);
        HomepageRecyclerFragment.access$1200(HomepageRecyclerFragment.this);
        k = erecyclerfragment1.etPlayers().getCount();
        s = ((GamesFragmentActivity) (HomepageRecyclerFragment.access$1300(HomepageRecyclerFragment.this))).mConfiguration.getCurrentPlayerId();
        playerbuffer = erecyclerfragment1.etPlayers();
        Asserts.checkNotNull(playerbuffer);
        objectdatabuffer = new ObjectDataBuffer();
        arraymap = new ArrayMap();
        l = playerbuffer.getCount();
        FriendsArePlaying friendsareplaying;
        Player player;
        String s1;
        MostRecentGameInfo mostrecentgameinfo;
        for (int j = 0; j >= l; j++)
        {
            break MISSING_BLOCK_LABEL_286;
        }

        player = (Player)((Player)playerbuffer.get(j)).freeze();
        if (player.getPlayerId().equals(s))
        {
            break MISSING_BLOCK_LABEL_477;
        }
        mostrecentgameinfo = player.getMostRecentGameInfo();
        if (mostrecentgameinfo == null)
        {
            break MISSING_BLOCK_LABEL_477;
        }
        s1 = mostrecentgameinfo.getGameId();
        friendsareplaying = (FriendsArePlaying)arraymap.get(s1);
        result = friendsareplaying;
        if (friendsareplaying != null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        result = new FriendsArePlaying(mostrecentgameinfo);
        arraymap.put(s1, result);
        objectdatabuffer.add(result);
        ((FriendsArePlaying) (result)).playerList.add(player);
        break MISSING_BLOCK_LABEL_477;
        erecyclerfragment1.etPlayers().release();
        if (objectdatabuffer.getCount() != 0) goto _L4; else goto _L3
_L3:
        HomepageRecyclerFragment.access$1400(HomepageRecyclerFragment.this).showButton(false);
        HomepageRecyclerFragment.access$1500(HomepageRecyclerFragment.this).clearData();
        HomepageRecyclerFragment.access$1600(HomepageRecyclerFragment.this).setVisible(true);
        flag = true;
_L9:
        result = erecyclerfragment.etPlayers();
        if (result.getCount() != 0) goto _L6; else goto _L5
_L5:
        HomepageRecyclerFragment.access$1800(HomepageRecyclerFragment.this).clearData();
        HomepageRecyclerFragment.access$1900(HomepageRecyclerFragment.this).setVisible(false);
        result = HomepageRecyclerFragment.this;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        HomepageRecyclerFragment.access$2000(result, flag);
        j = 1;
_L10:
        HomepageRecyclerFragment.access$900(HomepageRecyclerFragment.this);
        if (j == 0) goto _L8; else goto _L7
_L7:
        erecyclerfragment.etPlayers().release();
        return;
_L4:
        HomepageRecyclerFragment.access$1700(HomepageRecyclerFragment.this, objectdatabuffer);
        flag = false;
          goto _L9
_L6:
        HomepageRecyclerFragment.access$2100(HomepageRecyclerFragment.this, result, k, flag);
        j = 0;
          goto _L10
        result;
        j = 1;
_L12:
        if (j != 0)
        {
            erecyclerfragment.etPlayers().release();
        }
        throw result;
        result;
        if (true) goto _L12; else goto _L11
_L11:
          goto _L9
    }

    ()
    {
        this$0 = final_homepagerecyclerfragment;
        val$friendsPlayingResultToken = batchresulttoken;
        val$gamersResultToken = BatchResultToken.this;
        super();
    }
}
