// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.internal.o;
import java.util.ArrayList;

public final class TurnBasedMatchConfig
{
    public static final class Builder
    {

        int acD;
        int acd;
        Bundle acs;
        ArrayList acv;

        public Builder addInvitedPlayer(String s)
        {
            o.i(s);
            acv.add(s);
            return this;
        }

        public Builder addInvitedPlayers(ArrayList arraylist)
        {
            o.i(arraylist);
            acv.addAll(arraylist);
            return this;
        }

        public TurnBasedMatchConfig build()
        {
            return new TurnBasedMatchConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            acs = bundle;
            return this;
        }

        public Builder setVariant(int i)
        {
            boolean flag;
            if (i == -1 || i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
            acd = i;
            return this;
        }

        private Builder()
        {
            acd = -1;
            acv = new ArrayList();
            acs = null;
            acD = 2;
        }

    }


    private final int acD;
    private final int acd;
    private final String acr[];
    private final Bundle acs;

    private TurnBasedMatchConfig(Builder builder1)
    {
        acd = builder1.acd;
        acD = builder1.acD;
        acs = builder1.acs;
        int i = builder1.acv.size();
        acr = (String[])builder1.acv.toArray(new String[i]);
    }


    public static Builder builder()
    {
        return new Builder();
    }

    public static Bundle createAutoMatchCriteria(int i, int j, long l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", i);
        bundle.putInt("max_automatch_players", j);
        bundle.putLong("exclusive_bit_mask", l);
        return bundle;
    }

    public Bundle getAutoMatchCriteria()
    {
        return acs;
    }

    public String[] getInvitedPlayerIds()
    {
        return acr;
    }

    public int getVariant()
    {
        return acd;
    }

    public int lH()
    {
        return acD;
    }
}
