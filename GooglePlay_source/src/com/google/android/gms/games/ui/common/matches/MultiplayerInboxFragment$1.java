// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.ui.GamesFragmentActivity;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            MultiplayerInboxFragment, MultiplayerInboxRecyclerAdapter, InboxNearbyPlayersAdapter, InboxNearbyPlayersView

final class this._cls0
    implements ResultCallback
{

    final MultiplayerInboxFragment this$0;

    public final volatile void onResult(Result result)
    {
        int i;
        result = (com.google.android.gms.games.erInboxFragment)result;
        i = result.etStatus().mStatusCode;
        result = result.etPlayers();
        if (mDetached) goto _L2; else goto _L1
_L1:
        boolean flag = mRemoving;
        if (!flag) goto _L3; else goto _L2
_L2:
        if (result != null)
        {
            result.release();
        }
_L5:
        return;
_L3:
        flag = MultiplayerInboxFragment.access$000(MultiplayerInboxFragment.this).canContinueWithStatus(i);
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (result != null)
        {
            result.release();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (result == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        MultiplayerInboxFragment.access$102(MultiplayerInboxFragment.this, result.getTotalPlayerCount());
        MultiplayerInboxRecyclerAdapter multiplayerinboxrecycleradapter = MultiplayerInboxFragment.access$200(MultiplayerInboxFragment.this);
        int j = MultiplayerInboxFragment.access$100(MultiplayerInboxFragment.this);
        multiplayerinboxrecycleradapter.mInboxNearbyPlayersAdapter.setNumPlayersNearby(j);
        MultiplayerInboxFragment.access$400(MultiplayerInboxFragment.this).populateViews(MultiplayerInboxFragment.access$300(MultiplayerInboxFragment.this), MultiplayerInboxFragment.access$100(MultiplayerInboxFragment.this));
        if (result == null) goto _L5; else goto _L6
_L6:
        result.release();
        return;
        Exception exception;
        exception;
        if (result != null)
        {
            result.release();
        }
        throw exception;
    }

    pter()
    {
        this$0 = MultiplayerInboxFragment.this;
        super();
    }
}
