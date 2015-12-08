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

    private final InvitationBuffer Ts;
    private final TurnBasedMatchBuffer Tt;
    private final TurnBasedMatchBuffer Tu;
    private final TurnBasedMatchBuffer Tv;

    public LoadMatchesResponse(Bundle bundle)
    {
        DataHolder dataholder = a(bundle, 0);
        if (dataholder != null)
        {
            Ts = new InvitationBuffer(dataholder);
        } else
        {
            Ts = null;
        }
        dataholder = a(bundle, 1);
        if (dataholder != null)
        {
            Tt = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            Tt = null;
        }
        dataholder = a(bundle, 2);
        if (dataholder != null)
        {
            Tu = new TurnBasedMatchBuffer(dataholder);
        } else
        {
            Tu = null;
        }
        bundle = a(bundle, 3);
        if (bundle != null)
        {
            Tv = new TurnBasedMatchBuffer(bundle);
            return;
        } else
        {
            Tv = null;
            return;
        }
    }

    private static DataHolder a(Bundle bundle, int i)
    {
        String s = TurnBasedMatchTurnStatus.cm(i);
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
        if (Ts != null)
        {
            Ts.close();
        }
        if (Tt != null)
        {
            Tt.close();
        }
        if (Tu != null)
        {
            Tu.close();
        }
        if (Tv != null)
        {
            Tv.close();
        }
    }

    public TurnBasedMatchBuffer getCompletedMatches()
    {
        return Tv;
    }

    public InvitationBuffer getInvitations()
    {
        return Ts;
    }

    public TurnBasedMatchBuffer getMyTurnMatches()
    {
        return Tt;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches()
    {
        return Tu;
    }

    public boolean hasData()
    {
        while (Ts != null && Ts.getCount() > 0 || Tt != null && Tt.getCount() > 0 || Tu != null && Tu.getCount() > 0 || Tv != null && Tv.getCount() > 0) 
        {
            return true;
        }
        return false;
    }
}
