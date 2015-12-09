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
//            InvitationFragment, InboxNearbyPlayersAdapter, InboxNearbyPlayersView

final class this._cls0
    implements ResultCallback
{

    final InvitationFragment this$0;

    public final volatile void onResult(Result result)
    {
        int i;
        result = (com.google.android.gms.games.sult)result;
        i = result.getStatus().mStatusCode;
        result = result.getPlayers();
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
        flag = InvitationFragment.access$000(InvitationFragment.this).canContinueWithStatus(i);
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
        InvitationFragment.access$102(InvitationFragment.this, result.getTotalPlayerCount());
        InvitationFragment.access$200(InvitationFragment.this).setNumPlayersNearby(InvitationFragment.access$100(InvitationFragment.this));
        InvitationFragment.access$400(InvitationFragment.this).populateViews(InvitationFragment.access$300(InvitationFragment.this), InvitationFragment.access$100(InvitationFragment.this));
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

    w()
    {
        this$0 = InvitationFragment.this;
        super();
    }
}
