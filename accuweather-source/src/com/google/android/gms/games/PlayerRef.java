// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.PlayerColumnNames;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerLevel, PlayerLevelInfo, PlayerEntity

public final class PlayerRef extends d
    implements Player
{

    private final PlayerLevelInfo MU;
    private final PlayerColumnNames Nd;
    private final MostRecentGameInfoRef Ne;

    public PlayerRef(DataHolder dataholder, int i)
    {
        this(dataholder, i, null);
    }

    public PlayerRef(DataHolder dataholder, int i, String s)
    {
        super(dataholder, i);
        Nd = new PlayerColumnNames(s);
        Ne = new MostRecentGameInfoRef(dataholder, i, Nd);
        if (gQ())
        {
            i = getInteger(Nd.RV);
            int j = getInteger(Nd.RY);
            s = new PlayerLevel(i, getLong(Nd.RW), getLong(Nd.RX));
            if (i != j)
            {
                dataholder = new PlayerLevel(j, getLong(Nd.RX), getLong(Nd.RZ));
            } else
            {
                dataholder = s;
            }
            MU = new PlayerLevelInfo(getLong(Nd.RU), getLong(Nd.Sa), s, dataholder);
            return;
        } else
        {
            MU = null;
            return;
        }
    }

    private boolean gQ()
    {
        while (ax(Nd.RU) || getLong(Nd.RU) == -1L) 
        {
            return false;
        }
        return true;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return PlayerEntity.a(this, obj);
    }

    public Player freeze()
    {
        return new PlayerEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int gN()
    {
        return getInteger(Nd.RS);
    }

    public boolean gO()
    {
        return getBoolean(Nd.Sc);
    }

    public MostRecentGameInfo gP()
    {
        if (ax(Nd.Sd))
        {
            return null;
        } else
        {
            return Ne;
        }
    }

    public String getDisplayName()
    {
        return getString(Nd.RM);
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a(Nd.RM, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return aw(Nd.RP);
    }

    public String getHiResImageUrl()
    {
        return getString(Nd.RQ);
    }

    public Uri getIconImageUri()
    {
        return aw(Nd.RN);
    }

    public String getIconImageUrl()
    {
        return getString(Nd.RO);
    }

    public long getLastPlayedWithTimestamp()
    {
        if (!av(Nd.RT) || ax(Nd.RT))
        {
            return -1L;
        } else
        {
            return getLong(Nd.RT);
        }
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return MU;
    }

    public String getPlayerId()
    {
        return getString(Nd.RL);
    }

    public long getRetrievedTimestamp()
    {
        return getLong(Nd.RR);
    }

    public String getTitle()
    {
        return getString(Nd.Sb);
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        a(Nd.Sb, chararraybuffer);
    }

    public boolean hasHiResImage()
    {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage()
    {
        return getIconImageUri() != null;
    }

    public int hashCode()
    {
        return PlayerEntity.a(this);
    }

    public String toString()
    {
        return PlayerEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((PlayerEntity)freeze()).writeToParcel(parcel, i);
    }
}
