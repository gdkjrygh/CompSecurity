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

    private final SnapshotMetadataRef aaJ;
    private final int aaK;
    private final GameRef aax;

    ExtendedGameRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        aax = new GameRef(dataholder, i);
        aaK = j;
        if (aQ("external_snapshot_id") && !aS("external_snapshot_id"))
        {
            aaJ = new SnapshotMetadataRef(dataholder, i);
            return;
        } else
        {
            aaJ = null;
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
        return lc();
    }

    public Game getGame()
    {
        return aax;
    }

    public int hashCode()
    {
        return ExtendedGameEntity.a(this);
    }

    public ArrayList kR()
    {
        int i = 0;
        if (II.c("badge_title", JX, II.ar(JX)) == null)
        {
            return new ArrayList(0);
        }
        ArrayList arraylist = new ArrayList(aaK);
        for (; i < aaK; i++)
        {
            arraylist.add(new GameBadgeRef(II, JX + i));
        }

        return arraylist;
    }

    public int kS()
    {
        return getInteger("availability");
    }

    public boolean kT()
    {
        return getBoolean("owned");
    }

    public int kU()
    {
        return getInteger("achievement_unlocked_count");
    }

    public long kV()
    {
        return getLong("last_played_server_time");
    }

    public long kW()
    {
        return getLong("price_micros");
    }

    public String kX()
    {
        return getString("formatted_price");
    }

    public long kY()
    {
        return getLong("full_price_micros");
    }

    public String kZ()
    {
        return getString("formatted_full_price");
    }

    public SnapshotMetadata la()
    {
        return aaJ;
    }

    public ExtendedGame lc()
    {
        return new ExtendedGameEntity(this);
    }

    public String toString()
    {
        return ExtendedGameEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ExtendedGameEntity)lc()).writeToParcel(parcel, i);
    }
}
