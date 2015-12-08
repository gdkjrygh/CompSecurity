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

    private final GameRef RE;
    private final SnapshotMetadataRef RF;
    private final int RG;

    ExtendedGameRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        RE = new GameRef(dataholder, i);
        RG = j;
        if (av("external_snapshot_id") && !ax("external_snapshot_id"))
        {
            RF = new SnapshotMetadataRef(dataholder, i);
            return;
        } else
        {
            RF = null;
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
        return ib();
    }

    public Game getGame()
    {
        return RE;
    }

    public ArrayList hQ()
    {
        int i = 0;
        if (DG.c("badge_title", EC, DG.ae(EC)) == null)
        {
            return new ArrayList(0);
        }
        ArrayList arraylist = new ArrayList(RG);
        for (; i < RG; i++)
        {
            arraylist.add(new GameBadgeRef(DG, EC + i));
        }

        return arraylist;
    }

    public int hR()
    {
        return getInteger("availability");
    }

    public boolean hS()
    {
        return getBoolean("owned");
    }

    public int hT()
    {
        return getInteger("achievement_unlocked_count");
    }

    public long hU()
    {
        return getLong("last_played_server_time");
    }

    public long hV()
    {
        return getLong("price_micros");
    }

    public String hW()
    {
        return getString("formatted_price");
    }

    public long hX()
    {
        return getLong("full_price_micros");
    }

    public String hY()
    {
        return getString("formatted_full_price");
    }

    public SnapshotMetadata hZ()
    {
        return RF;
    }

    public int hashCode()
    {
        return ExtendedGameEntity.a(this);
    }

    public ExtendedGame ib()
    {
        return new ExtendedGameEntity(this);
    }

    public String toString()
    {
        return ExtendedGameEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ExtendedGameEntity)ib()).writeToParcel(parcel, i);
    }
}
