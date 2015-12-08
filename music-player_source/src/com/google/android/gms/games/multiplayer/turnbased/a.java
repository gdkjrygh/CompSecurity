// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.d;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, TurnBasedMatchEntity

public final class a extends e
    implements TurnBasedMatch
{

    private final Game c;
    private final int d;

    private TurnBasedMatch w()
    {
        return new TurnBasedMatchEntity(this);
    }

    public final Object a()
    {
        return w();
    }

    public final Game b()
    {
        return c;
    }

    public final String c()
    {
        return e("external_match_id");
    }

    public final String d()
    {
        return e("creator_external");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final long e()
    {
        return b("creation_timestamp");
    }

    public final boolean equals(Object obj)
    {
        return TurnBasedMatchEntity.a(this, obj);
    }

    public final int f()
    {
        return c("status");
    }

    public final int g()
    {
        return c("user_match_status");
    }

    public final String h()
    {
        return e("description");
    }

    public final int hashCode()
    {
        return TurnBasedMatchEntity.a(this);
    }

    public final int i()
    {
        return c("variant");
    }

    public final ArrayList j()
    {
        ArrayList arraylist = new ArrayList(d);
        for (int i1 = 0; i1 < d; i1++)
        {
            arraylist.add(new d(a_, b + i1));
        }

        return arraylist;
    }

    public final String k()
    {
        return e("last_updater_external");
    }

    public final long l()
    {
        return b("last_updated_timestamp");
    }

    public final String m()
    {
        return e("pending_participant_external");
    }

    public final byte[] n()
    {
        return f("data");
    }

    public final int o()
    {
        return c("version");
    }

    public final String p()
    {
        return e("rematch_id");
    }

    public final byte[] q()
    {
        return f("previous_match_data");
    }

    public final int r()
    {
        return c("match_number");
    }

    public final Bundle s()
    {
        if (!d("has_automatch_criteria"))
        {
            return null;
        } else
        {
            int i1 = c("automatch_min_players");
            int j1 = c("automatch_max_players");
            long l1 = b("automatch_bit_mask");
            Bundle bundle = new Bundle();
            bundle.putInt("min_automatch_players", i1);
            bundle.putInt("max_automatch_players", j1);
            bundle.putLong("exclusive_bit_mask", l1);
            return bundle;
        }
    }

    public final int t()
    {
        if (!d("has_automatch_criteria"))
        {
            return 0;
        } else
        {
            return c("automatch_max_players");
        }
    }

    public final String toString()
    {
        return TurnBasedMatchEntity.b(this);
    }

    public final boolean u()
    {
        return d("upsync_required");
    }

    public final String v()
    {
        return e("description_participant_id");
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        ((TurnBasedMatchEntity)w()).writeToParcel(parcel, i1);
    }
}
