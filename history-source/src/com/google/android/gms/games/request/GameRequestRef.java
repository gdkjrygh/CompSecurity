// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntity

public final class GameRequestRef extends d
    implements GameRequest
{

    private final int Ya;

    public GameRequestRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        Ya = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return GameRequestEntity.a(this, obj);
    }

    public GameRequest freeze()
    {
        return new GameRequestEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getCreationTimestamp()
    {
        return getLong("creation_timestamp");
    }

    public byte[] getData()
    {
        return getByteArray("data");
    }

    public long getExpirationTimestamp()
    {
        return getLong("expiration_timestamp");
    }

    public Game getGame()
    {
        return new GameRef(JG, KZ);
    }

    public int getRecipientStatus(String s)
    {
        for (int i = KZ; i < KZ + Ya; i++)
        {
            int j = JG.au(i);
            if (JG.c("recipient_external_player_id", i, j).equals(s))
            {
                return JG.b("recipient_status", i, j);
            }
        }

        return -1;
    }

    public List getRecipients()
    {
        ArrayList arraylist = new ArrayList(Ya);
        for (int i = 0; i < Ya; i++)
        {
            arraylist.add(new PlayerRef(JG, KZ + i, "recipient_"));
        }

        return arraylist;
    }

    public String getRequestId()
    {
        return getString("external_request_id");
    }

    public Player getSender()
    {
        return new PlayerRef(JG, gW(), "sender_");
    }

    public int getStatus()
    {
        return getInteger("status");
    }

    public int getType()
    {
        return getInteger("type");
    }

    public int hashCode()
    {
        return GameRequestEntity.a(this);
    }

    public boolean isConsumed(String s)
    {
        return getRecipientStatus(s) == 1;
    }

    public String toString()
    {
        return GameRequestEntity.c(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((GameRequestEntity)freeze()).writeToParcel(parcel, i);
    }
}
