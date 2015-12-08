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

    private final InvitationBuffer aes;
    private final TurnBasedMatchBuffer aet;
    private final TurnBasedMatchBuffer aeu;
    private final TurnBasedMatchBuffer aev;

    public LoadMatchesResponse(Bundle bundle)
    {
        DataHolder dataholder = a(bundle, 0);
        if (dataholder != null)
        {
            aes = new InvitationBuffer(dataholder);
        } else
        {
            aes = null;
        }
        dataholder = a(bundle, 1);
        if (dataholder != null)
        {
            aet = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            aet = null;
        }
        dataholder = a(bundle, 2);
        if (dataholder != null)
        {
            aeu = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            aeu = null;
        }
        bundle = a(bundle, 3);
        if (bundle != null)
        {
            aev = new TurnBasedMatchBuffer(bundle);
            return;
        } else
        {
            aev = null;
            return;
        }
    }

    private static DataHolder a(Bundle bundle, int i)
    {
        String s = TurnBasedMatchTurnStatus.dZ(i);
        if (!bundle.containsKey(s))
        {
            return null;
        } else
        {
            return (DataHolder)bundle.getParcelable(s);
        }
    }

    public void close()
    {
        release();
    }

    public TurnBasedMatchBuffer getCompletedMatches()
    {
        return aev;
    }

    public InvitationBuffer getInvitations()
    {
        return aes;
    }

    public TurnBasedMatchBuffer getMyTurnMatches()
    {
        return aet;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches()
    {
        return aeu;
    }

    public boolean hasData()
    {
        while (aes != null && aes.getCount() > 0 || aet != null && aet.getCount() > 0 || aeu != null && aeu.getCount() > 0 || aev != null && aev.getCount() > 0) 
        {
            return true;
        }
        return false;
    }

    public void release()
    {
        if (aes != null)
        {
            aes.release();
        }
        if (aet != null)
        {
            aet.release();
        }
        if (aeu != null)
        {
            aeu.release();
        }
        if (aev != null)
        {
            aev.release();
        }
    }
}
