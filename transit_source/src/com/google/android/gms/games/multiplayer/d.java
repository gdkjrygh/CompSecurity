// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntity

public final class d extends b
    implements Participant
{

    private final com.google.android.gms.games.d nZ;

    public d(com.google.android.gms.common.data.d d1, int i)
    {
        super(d1, i);
        nZ = new com.google.android.gms.games.d(d1, i);
    }

    public String ci()
    {
        return getString("client_address");
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
        if (v("external_player_id"))
        {
            return getString("default_display_name");
        } else
        {
            return nZ.getDisplayName();
        }
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if (v("external_player_id"))
        {
            a("default_display_name", chararraybuffer);
            return;
        } else
        {
            nZ.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if (v("external_player_id"))
        {
            return null;
        } else
        {
            return nZ.getHiResImageUri();
        }
    }

    public Uri getIconImageUri()
    {
        if (v("external_player_id"))
        {
            return u("default_display_image_uri");
        } else
        {
            return nZ.getIconImageUri();
        }
    }

    public String getParticipantId()
    {
        return getString("external_participant_id");
    }

    public Player getPlayer()
    {
        if (v("external_player_id"))
        {
            return null;
        } else
        {
            return nZ;
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
        return com.google.android.gms.games.multiplayer.ParticipantEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ParticipantEntity)freeze()).writeToParcel(parcel, i);
    }
}
