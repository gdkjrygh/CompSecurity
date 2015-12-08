// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.multiplayer.d;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntity

public final class c extends e
    implements Room
{

    private final int c;

    private Room k()
    {
        return new RoomEntity(this);
    }

    public final Object a()
    {
        return k();
    }

    public final String b()
    {
        return e("external_match_id");
    }

    public final String c()
    {
        return e("creator_external");
    }

    public final long d()
    {
        return b("creation_timestamp");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return c("status");
    }

    public final boolean equals(Object obj)
    {
        return RoomEntity.a(this, obj);
    }

    public final String f()
    {
        return e("description");
    }

    public final int g()
    {
        return c("variant");
    }

    public final Bundle h()
    {
        if (!d("has_automatch_criteria"))
        {
            return null;
        } else
        {
            int l = c("automatch_min_players");
            int i1 = c("automatch_max_players");
            long l1 = b("automatch_bit_mask");
            Bundle bundle = new Bundle();
            bundle.putInt("min_automatch_players", l);
            bundle.putInt("max_automatch_players", i1);
            bundle.putLong("exclusive_bit_mask", l1);
            return bundle;
        }
    }

    public final int hashCode()
    {
        return RoomEntity.a(this);
    }

    public final int i()
    {
        return c("automatch_wait_estimate_sec");
    }

    public final ArrayList j()
    {
        ArrayList arraylist = new ArrayList(c);
        for (int l = 0; l < c; l++)
        {
            arraylist.add(new d(a_, b + l));
        }

        return arraylist;
    }

    public final String toString()
    {
        return RoomEntity.b(this);
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        ((RoomEntity)k()).writeToParcel(parcel, l);
    }
}
