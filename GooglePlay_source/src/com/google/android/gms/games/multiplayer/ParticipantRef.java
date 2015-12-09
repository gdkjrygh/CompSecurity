// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntity, ParticipantResult

public final class ParticipantRef extends DataBufferRef
    implements Participant
{

    private final PlayerRef mPlayer;

    public ParticipantRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        mPlayer = new PlayerRef(dataholder, i);
    }

    private Participant freeze()
    {
        return new ParticipantEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return ParticipantEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getCapabilities()
    {
        return getInteger("capabilities");
    }

    public final String getClientAddress()
    {
        return getString("client_address");
    }

    public final String getDisplayName()
    {
        if (hasNull("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return mPlayer.getDisplayName();
        }
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (hasNull("external_player_id"))
        {
            copyToBuffer("default_display_name", chararraybuffer);
            return;
        } else
        {
            mPlayer.getDisplayName(chararraybuffer);
            return;
        }
    }

    public final Uri getHiResImageUri()
    {
        if (hasNull("external_player_id"))
        {
            return parseUri("default_display_hi_res_image_uri");
        } else
        {
            return mPlayer.getHiResImageUri();
        }
    }

    public final String getHiResImageUrl()
    {
        if (hasNull("external_player_id"))
        {
            return getString("default_display_hi_res_image_url");
        } else
        {
            return mPlayer.getHiResImageUrl();
        }
    }

    public final Uri getIconImageUri()
    {
        if (hasNull("external_player_id"))
        {
            return parseUri("default_display_image_uri");
        } else
        {
            return mPlayer.getIconImageUri();
        }
    }

    public final String getIconImageUrl()
    {
        if (hasNull("external_player_id"))
        {
            return getString("default_display_image_url");
        } else
        {
            return mPlayer.getIconImageUrl();
        }
    }

    public final String getParticipantId()
    {
        return getString("external_participant_id");
    }

    public final Player getPlayer()
    {
        if (hasNull("external_player_id"))
        {
            return null;
        } else
        {
            return mPlayer;
        }
    }

    public final ParticipantResult getResult()
    {
        if (hasNull("result_type"))
        {
            return null;
        } else
        {
            int i = getInteger("result_type");
            int j = getInteger("placing");
            return new ParticipantResult(getString("external_participant_id"), i, j);
        }
    }

    public final int getStatus()
    {
        return getInteger("player_status");
    }

    public final int hashCode()
    {
        return ParticipantEntity.hashCode(this);
    }

    public final boolean isConnectedToRoom()
    {
        return getInteger("connected") > 0;
    }

    public final String toString()
    {
        return ParticipantEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((ParticipantEntity)freeze()).writeToParcel(parcel, i);
    }
}
