// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntity

public final class GameRequestRef extends DataBufferRef
    implements GameRequest
{

    private final int mNumChildren;

    public GameRequestRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        mNumChildren = j;
    }

    private GameRequest freeze()
    {
        return new GameRequestEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return GameRequestEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final long getCreationTimestamp()
    {
        return getLong("creation_timestamp");
    }

    public final byte[] getData()
    {
        return getByteArray("data");
    }

    public final long getExpirationTimestamp()
    {
        return getLong("expiration_timestamp");
    }

    public final Game getGame()
    {
        return new GameRef(mDataHolder, mDataRow);
    }

    public final int getRecipientStatus(String s)
    {
        for (int i = mDataRow; i < mDataRow + mNumChildren; i++)
        {
            int j = mDataHolder.getWindowIndex(i);
            if (mDataHolder.getString("recipient_external_player_id", i, j).equals(s))
            {
                return mDataHolder.getInteger("recipient_status", i, j);
            }
        }

        return -1;
    }

    public final List getRecipients()
    {
        ArrayList arraylist = new ArrayList(mNumChildren);
        for (int i = 0; i < mNumChildren; i++)
        {
            arraylist.add(new PlayerRef(mDataHolder, mDataRow + i, "recipient_"));
        }

        return arraylist;
    }

    public final String getRequestId()
    {
        return getString("external_request_id");
    }

    public final Player getSender()
    {
        return new PlayerRef(mDataHolder, super.mDataRow, "sender_");
    }

    public final int getStatus()
    {
        return getInteger("status");
    }

    public final int getType()
    {
        return getInteger("type");
    }

    public final int hashCode()
    {
        return GameRequestEntity.hashCode(this);
    }

    public final String toString()
    {
        return GameRequestEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((GameRequestEntity)freeze()).writeToParcel(parcel, i);
    }
}
