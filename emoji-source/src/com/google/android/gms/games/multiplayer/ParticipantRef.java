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

    private final PlayerRef Te;

    public ParticipantRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        Te = new PlayerRef(dataholder, i);
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

    public String gW()
    {
        return getString("client_address");
    }

    public int getCapabilities()
    {
        return getInteger("capabilities");
    }

    public String getDisplayName()
    {
        if (ax("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return Te.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (ax("external_player_id"))
        {
            a("default_display_name", chararraybuffer);
            return;
        } else
        {
            Te.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (ax("external_player_id"))
        {
            return aw("default_display_hi_res_image_uri");
        } else
        {
            return Te.getHiResImageUri();
        }
    }

    public String getHiResImageUrl()
    {
        if (ax("external_player_id"))
        {
            return getString("default_display_hi_res_image_url");
        } else
        {
            return Te.getHiResImageUrl();
        }
    }

    public Uri getIconImageUri()
    {
        if (ax("external_player_id"))
        {
            return aw("default_display_image_uri");
        } else
        {
            return Te.getIconImageUri();
        }
    }

    public String getIconImageUrl()
    {
        if (ax("external_player_id"))
        {
            return getString("default_display_image_url");
        } else
        {
            return Te.getIconImageUrl();
        }
    }

    public String getParticipantId()
    {
        return getString("external_participant_id");
    }

    public Player getPlayer()
    {
        if (ax("external_player_id"))
        {
            return null;
        } else
        {
            return Te;
        }
    }

    public ParticipantResult getResult()
    {
        if (ax("result_type"))
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

    public String toString()
    {
        return ParticipantEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ParticipantEntity)freeze()).writeToParcel(parcel, i);
    }
}
