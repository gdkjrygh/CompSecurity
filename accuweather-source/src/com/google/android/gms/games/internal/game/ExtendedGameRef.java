// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGame, ExtendedGameEntity, GameBadgeRef

public class ExtendedGameRef extends d
    implements ExtendedGame
{

    private final GameRef RB;
    private final SnapshotMetadataRef RC;
    private final int RD;

    ExtendedGameRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        RB = new GameRef(dataholder, i);
        RD = j;
        if (av("external_snapshot_id") && !ax("external_snapshot_id"))
        {
            RC = new SnapshotMetadataRef(dataholder, i);
            return;
        } else
        {
            RC = null;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return ExtendedGameEntity.a(this, obj);
    }

    public Object freeze()
    {
        return hW();
    }

    public Game getGame()
    {
        return RB;
    }

    public ArrayList hL()
    {
        int i = 0;
        if (DD.c("badge_title", Ez, DD.ae(Ez)) == null)
        {
            return new ArrayList(0);
        }
        ArrayList arraylist = new ArrayList(RD);
        for (; i < RD; i++)
        {
            arraylist.add(new GameBadgeRef(DD, Ez + i));
        }

        return arraylist;
    }

    public int hM()
    {
        return getInteger("availability");
    }

    public boolean hN()
    {
        return getBoolean("owned");
    }

    public int hO()
    {
        return getInteger("achievement_unlocked_count");
    }

    public long hP()
    {
        return getLong("last_played_server_time");
    }

    public long hQ()
    {
        return getLong("price_micros");
    }

    public String hR()
    {
        return getString("formatted_price");
    }

    public long hS()
    {
        return getLong("full_price_micros");
    }

    public String hT()
    {
        return getString("formatted_full_price");
    }

    public SnapshotMetadata hU()
    {
        return RC;
    }

    public ExtendedGame hW()
    {
        return new ExtendedGameEntity(this);
    }

    public int hashCode()
    {
        return ExtendedGameEntity.a(this);
    }

    public String toString()
    {
        return ExtendedGameEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ExtendedGameEntity)hW()).writeToParcel(parcel, i);
    }
}
