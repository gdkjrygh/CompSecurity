// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.card.OnyxGotItCardAdapter;
import com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            HomepageRecyclerFragment

private final class <init>
    implements ResultCallback
{

    final HomepageRecyclerFragment this$0;

    public final volatile void onResult(Result result)
    {
        GameFirstPartyBuffer gamefirstpartybuffer;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = true;
        result = (com.google.android.gms.games.client.games.llback)result;
        int i = result.llback().mStatusCode;
        gamefirstpartybuffer = result.llback();
        GamesLog.d(HomepageRecyclerFragment.access$600(), (new StringBuilder("RecentlyPlayedGamesLoaded... statusCode = ")).append(i).append(", data = ").append(gamefirstpartybuffer).toString());
        if (canUseResult(result))
        {
            break MISSING_BLOCK_LABEL_94;
        }
        HomepageRecyclerFragment.access$300(HomepageRecyclerFragment.this).logEvents(new int[] {
            7
        });
        gamefirstpartybuffer.release();
        return;
        HomepageRecyclerFragment.access$700(HomepageRecyclerFragment.this).setDataBuffer(gamefirstpartybuffer);
        result = HomepageRecyclerFragment.access$800(HomepageRecyclerFragment.this);
        if (gamefirstpartybuffer.getCount() != 0)
        {
            flag1 = false;
        }
        result.setVisible(flag1);
        HomepageRecyclerFragment.access$900(HomepageRecyclerFragment.this);
        return;
        result;
        flag = false;
_L2:
        if (flag)
        {
            gamefirstpartybuffer.release();
        }
        throw result;
        result;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private q()
    {
        this$0 = HomepageRecyclerFragment.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
