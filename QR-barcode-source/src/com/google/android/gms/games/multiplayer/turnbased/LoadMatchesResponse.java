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

    private final TurnBasedMatchBuffer acA;
    private final TurnBasedMatchBuffer acB;
    private final TurnBasedMatchBuffer acC;
    private final InvitationBuffer acz;

    public LoadMatchesResponse(Bundle bundle)
    {
        DataHolder dataholder = a(bundle, 0);
        if (dataholder != null)
        {
            acz = new InvitationBuffer(dataholder);
        } else
        {
            acz = null;
        }
        dataholder = a(bundle, 1);
        if (dataholder != null)
        {
            acA = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            acA = null;
        }
        dataholder = a(bundle, 2);
        if (dataholder != null)
        {
            acB = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            acB = null;
        }
        bundle = a(bundle, 3);
        if (bundle != null)
        {
            acC = new TurnBasedMatchBuffer(bundle);
            return;
        } else
        {
            acC = null;
            return;
        }
    }

    private static DataHolder a(Bundle bundle, int i)
    {
        String s = TurnBasedMatchTurnStatus.dH(i);
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
        if (acz != null)
        {
            acz.close();
        }
        if (acA != null)
        {
            acA.close();
        }
        if (acB != null)
        {
            acB.close();
        }
        if (acC != null)
        {
            acC.close();
        }
    }

    public TurnBasedMatchBuffer getCompletedMatches()
    {
        return acC;
    }

    public InvitationBuffer getInvitations()
    {
        return acz;
    }

    public TurnBasedMatchBuffer getMyTurnMatches()
    {
        return acA;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches()
    {
        return acB;
    }

    public boolean hasData()
    {
        while (acz != null && acz.getCount() > 0 || acA != null && acA.getCount() > 0 || acB != null && acB.getCount() > 0 || acC != null && acC.getCount() > 0) 
        {
            return true;
        }
        return false;
    }
}
