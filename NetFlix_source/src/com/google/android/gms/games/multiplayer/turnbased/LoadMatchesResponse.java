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

    private final InvitationBuffer MV;
    private final TurnBasedMatchBuffer MW;
    private final TurnBasedMatchBuffer MX;
    private final TurnBasedMatchBuffer MY;

    public LoadMatchesResponse(Bundle bundle)
    {
        DataHolder dataholder = a(bundle, 0);
        if (dataholder != null)
        {
            MV = new InvitationBuffer(dataholder);
        } else
        {
            MV = null;
        }
        dataholder = a(bundle, 1);
        if (dataholder != null)
        {
            MW = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            MW = null;
        }
        dataholder = a(bundle, 2);
        if (dataholder != null)
        {
            MX = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            MX = null;
        }
        bundle = a(bundle, 3);
        if (bundle != null)
        {
            MY = new TurnBasedMatchBuffer(bundle);
            return;
        } else
        {
            MY = null;
            return;
        }
    }

    private static DataHolder a(Bundle bundle, int i)
    {
        String s = TurnBasedMatchTurnStatus.bd(i);
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
        if (MV != null)
        {
            MV.close();
        }
        if (MW != null)
        {
            MW.close();
        }
        if (MX != null)
        {
            MX.close();
        }
        if (MY != null)
        {
            MY.close();
        }
    }

    public TurnBasedMatchBuffer getCompletedMatches()
    {
        return MY;
    }

    public InvitationBuffer getInvitations()
    {
        return MV;
    }

    public TurnBasedMatchBuffer getMyTurnMatches()
    {
        return MW;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches()
    {
        return MX;
    }

    public boolean hasData()
    {
        while (MV != null && MV.getCount() > 0 || MW != null && MW.getCount() > 0 || MX != null && MX.getCount() > 0 || MY != null && MY.getCount() > 0) 
        {
            return true;
        }
        return false;
    }
}
