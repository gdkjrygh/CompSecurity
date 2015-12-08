// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.internal.fq;
import java.util.ArrayList;

public final class TurnBasedMatchConfig
{
    public static final class Builder
    {

        Bundle MO;
        ArrayList MR;
        int MZ;
        int My;

        public Builder addInvitedPlayer(String s)
        {
            fq.f(s);
            MR.add(s);
            return this;
        }

        public Builder addInvitedPlayers(ArrayList arraylist)
        {
            fq.f(arraylist);
            MR.addAll(arraylist);
            return this;
        }

        public TurnBasedMatchConfig build()
        {
            return new TurnBasedMatchConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            MO = bundle;
            return this;
        }

        public Builder setMinPlayers(int i)
        {
            MZ = i;
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
            fq.b(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
            My = i;
            return this;
        }

        private Builder()
        {
            My = -1;
            MR = new ArrayList();
            MO = null;
            MZ = 2;
        }

    }


    private final String MN[];
    private final Bundle MO;
    private final int MZ;
    private final int My;

    private TurnBasedMatchConfig(Builder builder1)
    {
        My = builder1.My;
        MZ = builder1.MZ;
        MO = builder1.MO;
        int i = builder1.MR.size();
        MN = (String[])builder1.MR.toArray(new String[i]);
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
        return MO;
    }

    public String[] getInvitedPlayerIds()
    {
        return MN;
    }

    public int getMinPlayers()
    {
        return MZ;
    }

    public int getVariant()
    {
        return My;
    }
}
