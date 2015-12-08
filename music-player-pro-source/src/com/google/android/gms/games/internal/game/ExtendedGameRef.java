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

    private final int Ya;
    private final SnapshotMetadataRef acD;
    private final GameRef acr;

    ExtendedGameRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        acr = new GameRef(dataholder, i);
        Ya = j;
        if (aQ("external_snapshot_id") && !aS("external_snapshot_id"))
        {
            acD = new SnapshotMetadataRef(dataholder, i);
            return;
        } else
        {
            acD = null;
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
        return mj();
    }

    public Game getGame()
    {
        return acr;
    }

    public int hashCode()
    {
        return ExtendedGameEntity.a(this);
    }

    public ArrayList lY()
    {
        int i = 0;
        if (JG.c("badge_title", KZ, JG.au(KZ)) == null)
        {
            return new ArrayList(0);
        }
        ArrayList arraylist = new ArrayList(Ya);
        for (; i < Ya; i++)
        {
            arraylist.add(new GameBadgeRef(JG, KZ + i));
        }

        return arraylist;
    }

    public int lZ()
    {
        return getInteger("availability");
    }

    public boolean ma()
    {
        return getBoolean("owned");
    }

    public int mb()
    {
        return getInteger("achievement_unlocked_count");
    }

    public long mc()
    {
        return getLong("last_played_server_time");
    }

    public long md()
    {
        return getLong("price_micros");
    }

    public String me()
    {
        return getString("formatted_price");
    }

    public long mf()
    {
        return getLong("full_price_micros");
    }

    public String mg()
    {
        return getString("formatted_full_price");
    }

    public SnapshotMetadata mh()
    {
        return acD;
    }

    public ExtendedGame mj()
    {
        return new ExtendedGameEntity(this);
    }

    public String toString()
    {
        return ExtendedGameEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ExtendedGameEntity)mj()).writeToParcel(parcel, i);
    }
}
