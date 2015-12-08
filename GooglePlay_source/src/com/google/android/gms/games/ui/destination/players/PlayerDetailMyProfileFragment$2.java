// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.LoadingStateAdapter;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailMyProfileFragment

final class this._cls0
    implements ResultCallback
{

    final PlayerDetailMyProfileFragment this$0;

    public final volatile void onResult(Result result)
    {
        result = (com.google.android.gms.games.esult)result;
        mLatencyLogger.logEvents(new int[] {
            8
        });
        PlayerDetailMyProfileFragment.access$300(PlayerDetailMyProfileFragment.this, result);
        PlayerDetailMyProfileFragment.access$500(PlayerDetailMyProfileFragment.this).setViewState(2);
        mLoadingStateAdapter.setVisible(false);
    }

    Y()
    {
        this$0 = PlayerDetailMyProfileFragment.this;
        super();
    }
}
