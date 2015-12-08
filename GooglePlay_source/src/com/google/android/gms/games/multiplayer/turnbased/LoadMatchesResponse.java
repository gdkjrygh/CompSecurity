// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchBuffer

public final class LoadMatchesResponse
{

    public final TurnBasedMatchBuffer mCompletedMatches;
    public final InvitationBuffer mInvitations;
    public final TurnBasedMatchBuffer mMyTurnMatches;
    public final TurnBasedMatchBuffer mTheirTurnMatches;

    public LoadMatchesResponse(Bundle bundle)
    {
        DataHolder dataholder = getDataHolder(bundle, 0);
        if (dataholder != null)
        {
            mInvitations = new InvitationBuffer(dataholder);
        } else
        {
            mInvitations = null;
        }
        dataholder = getDataHolder(bundle, 1);
        if (dataholder != null)
        {
            mMyTurnMatches = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            mMyTurnMatches = null;
        }
        dataholder = getDataHolder(bundle, 2);
        if (dataholder != null)
        {
            mTheirTurnMatches = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            mTheirTurnMatches = null;
        }
        bundle = getDataHolder(bundle, 3);
        if (bundle != null)
        {
            mCompletedMatches = new TurnBasedMatchBuffer(bundle);
            return;
        } else
        {
            mCompletedMatches = null;
            return;
        }
    }

    private static DataHolder getDataHolder(Bundle bundle, int i)
    {
        String s = TurnBasedMatchTurnStatus.fromInt(i);
        if (!bundle.containsKey(s))
        {
            return null;
        } else
        {
            return (DataHolder)bundle.getParcelable(s);
        }
    }

    public final void release()
    {
        if (mInvitations != null)
        {
            mInvitations.release();
        }
        if (mMyTurnMatches != null)
        {
            mMyTurnMatches.release();
        }
        if (mTheirTurnMatches != null)
        {
            mTheirTurnMatches.release();
        }
        if (mCompletedMatches != null)
        {
            mCompletedMatches.release();
        }
    }
}
