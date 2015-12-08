// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;
import com.google.android.gms.games.ui.destination.util.GamesShuffleFilteredDataBuffer;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            HomepageRecyclerFragment, FeaturedGamesAdapter

private final class <init>
    implements ResultCallback
{

    final HomepageRecyclerFragment this$0;

    public final volatile void onResult(Result result)
    {
        GameFirstPartyBuffer gamefirstpartybuffer;
        boolean flag;
        boolean flag1;
        int j;
        flag = true;
        j = 1;
        result = (com.google.android.gms.games.client.games.llback)result;
        int i = result.llback().mStatusCode;
        gamefirstpartybuffer = result.llback();
        GamesLog.d(HomepageRecyclerFragment.access$600(), (new StringBuilder("FeaturedGamesLoadedListener... statusCode = ")).append(i).append(", data = ").append(gamefirstpartybuffer).toString());
        flag1 = flag;
        if (canUseResult(result)) goto _L2; else goto _L1
_L1:
        flag1 = flag;
        HomepageRecyclerFragment.access$300(HomepageRecyclerFragment.this).logEvents(new int[] {
            7
        });
        gamefirstpartybuffer.release();
_L5:
        return;
_L2:
        flag1 = flag;
        int k = gamefirstpartybuffer.getCount();
        if (k != 0) goto _L4; else goto _L3
_L3:
        flag1 = flag;
        HomepageRecyclerFragment.access$2200(HomepageRecyclerFragment.this).setVisible(false);
        flag1 = flag;
        HomepageRecyclerFragment.access$2300(HomepageRecyclerFragment.this).clearData();
        flag = j;
_L6:
        flag1 = flag;
        HomepageRecyclerFragment.access$900(HomepageRecyclerFragment.this);
        if (flag)
        {
            gamefirstpartybuffer.release();
            return;
        }
          goto _L5
_L4:
        flag1 = flag;
        HomepageRecyclerFragment.access$2200(HomepageRecyclerFragment.this).setVisible(true);
        flag1 = flag;
        j = ((DatabufferRecyclerAdapter) (HomepageRecyclerFragment.access$2300(HomepageRecyclerFragment.this))).mMaxNumItems;
        if (k > j)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        flag1 = flag;
        HomepageRecyclerFragment.access$2300(HomepageRecyclerFragment.this).setDataBuffer(gamefirstpartybuffer);
        flag = false;
          goto _L6
        flag1 = flag;
        result = new >(HomepageRecyclerFragment.this, gamefirstpartybuffer, j);
        flag1 = flag;
        if (result.getCount() >= j)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        flag1 = flag;
        result = new GamesShuffleFilteredDataBuffer(gamefirstpartybuffer, j, SharedPrefsConfig.getLong(HomepageRecyclerFragment.access$2400(HomepageRecyclerFragment.this), "shuffleHomePageSeed", System.currentTimeMillis()));
        flag1 = flag;
        HeaderItemRecyclerAdapter headeritemrecycleradapter = HomepageRecyclerFragment.access$2200(HomepageRecyclerFragment.this);
        boolean flag2;
        if (k > j)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        flag1 = flag;
        headeritemrecycleradapter.showButton(flag2);
        flag1 = flag;
        HomepageRecyclerFragment.access$2300(HomepageRecyclerFragment.this).setDataBuffer(result);
        flag = false;
          goto _L6
        result;
        if (flag1)
        {
            gamefirstpartybuffer.release();
        }
        throw result;
          goto _L6
    }

    private ()
    {
        this$0 = HomepageRecyclerFragment.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
