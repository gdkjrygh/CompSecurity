// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig

public final class TurnBasedMatchConfigImpl extends TurnBasedMatchConfig
{

    private final int adW;
    private final Bundle aem;
    private final String aeo[];
    private final int aew;

    TurnBasedMatchConfigImpl(TurnBasedMatchConfig.Builder builder)
    {
        adW = builder.adW;
        aew = builder.aew;
        aem = builder.aem;
        int i = builder.ael.size();
        aeo = (String[])builder.ael.toArray(new String[i]);
    }

    public Bundle getAutoMatchCriteria()
    {
        return aem;
    }

    public String[] getInvitedPlayerIds()
    {
        return aeo;
    }

    public int getVariant()
    {
        return adW;
    }

    public int mO()
    {
        return aew;
    }
}
