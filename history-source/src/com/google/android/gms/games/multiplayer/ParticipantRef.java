// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntity, ParticipantResult

public final class ParticipantRef extends d
    implements Participant
{

    private final PlayerRef aeb;

    public ParticipantRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        aeb = new PlayerRef(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return ParticipantEntity.a(this, obj);
    }

    public Participant freeze()
    {
        return new ParticipantEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getCapabilities()
    {
        return getInteger("capabilities");
    }

    public String getDisplayName()
    {
        if (aS("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return aeb.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (aS("external_player_id"))
        {
            a("default_display_name", chararraybuffer);
            return;
        } else
        {
            aeb.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (aS("external_player_id"))
        {
            return aR("default_display_hi_res_image_uri");
        } else
        {
            return aeb.getHiResImageUri();
        }
    }

    public String getHiResImageUrl()
    {
        if (aS("external_player_id"))
        {
            return getString("default_display_hi_res_image_url");
        } else
        {
            return aeb.getHiResImageUrl();
        }
    }

    public Uri getIconImageUri()
    {
        if (aS("external_player_id"))
        {
            return aR("default_display_image_uri");
        } else
        {
            return aeb.getIconImageUri();
        }
    }

    public String getIconImageUrl()
    {
        if (aS("external_player_id"))
        {
            return getString("default_display_image_url");
        } else
        {
            return aeb.getIconImageUrl();
        }
    }

    public String getParticipantId()
    {
        return getString("external_participant_id");
    }

    public Player getPlayer()
    {
        if (aS("external_player_id"))
        {
            return null;
        } else
        {
            return aeb;
        }
    }

    public ParticipantResult getResult()
    {
        if (aS("result_type"))
        {
            return null;
        } else
        {
            int i = getInteger("result_type");
            int j = getInteger("placing");
            return new ParticipantResult(getParticipantId(), i, j);
        }
    }

    public int getStatus()
    {
        return getInteger("player_status");
    }

    public int hashCode()
    {
        return ParticipantEntity.a(this);
    }

    public boolean isConnectedToRoom()
    {
        return getInteger("connected") > 0;
    }

    public String le()
    {
        return getString("client_address");
    }

    public String toString()
    {
        return ParticipantEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ParticipantEntity)freeze()).writeToParcel(parcel, i);
    }
}
