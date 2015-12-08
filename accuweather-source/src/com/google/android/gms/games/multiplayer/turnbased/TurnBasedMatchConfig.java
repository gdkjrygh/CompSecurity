// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.internal.hn;
import java.util.ArrayList;

public final class TurnBasedMatchConfig
{
    public static final class Builder
    {

        int SV;
        Bundle Tl;
        ArrayList To;
        int Tw;

        public Builder addInvitedPlayer(String s)
        {
            hn.f(s);
            To.add(s);
            return this;
        }

        public Builder addInvitedPlayers(ArrayList arraylist)
        {
            hn.f(arraylist);
            To.addAll(arraylist);
            return this;
        }

        public TurnBasedMatchConfig build()
        {
            return new TurnBasedMatchConfig(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            Tl = bundle;
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
            hn.b(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
            SV = i;
            return this;
        }

        private Builder()
        {
            SV = -1;
            To = new ArrayList();
            Tl = null;
            Tw = 2;
        }

    }


    private final int SV;
    private final String Tk[];
    private final Bundle Tl;
    private final int Tw;

    private TurnBasedMatchConfig(Builder builder1)
    {
        SV = builder1.SV;
        Tw = builder1.Tw;
        Tl = builder1.Tl;
        int i = builder1.To.size();
        Tk = (String[])builder1.To.toArray(new String[i]);
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
        return Tl;
    }

    public String[] getInvitedPlayerIds()
    {
        return Tk;
    }

    public int getVariant()
    {
        return SV;
    }

    public int iC()
    {
        return Tw;
    }
}
