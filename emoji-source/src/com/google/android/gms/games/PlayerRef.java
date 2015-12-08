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

    private final PlayerLevelInfo MX;
    private final PlayerColumnNames Ng;
    private final MostRecentGameInfoRef Nh;

    public PlayerRef(DataHolder dataholder, int i)
    {
        this(dataholder, i, null);
    }

    public PlayerRef(DataHolder dataholder, int i, String s)
    {
        super(dataholder, i);
        Ng = new PlayerColumnNames(s);
        Nh = new MostRecentGameInfoRef(dataholder, i, Ng);
        if (gV())
        {
            i = getInteger(Ng.RY);
            int j = getInteger(Ng.Sb);
            s = new PlayerLevel(i, getLong(Ng.RZ), getLong(Ng.Sa));
            if (i != j)
            {
                dataholder = new PlayerLevel(j, getLong(Ng.Sa), getLong(Ng.Sc));
            } else
            {
                dataholder = s;
            }
            MX = new PlayerLevelInfo(getLong(Ng.RX), getLong(Ng.Sd), s, dataholder);
            return;
        } else
        {
            MX = null;
            return;
        }
    }

    private boolean gV()
    {
        while (ax(Ng.RX) || getLong(Ng.RX) == -1L) 
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

    public int gS()
    {
        return getInteger(Ng.RV);
    }

    public boolean gT()
    {
        return getBoolean(Ng.Sf);
    }

    public MostRecentGameInfo gU()
    {
        if (ax(Ng.Sg))
        {
            return null;
        } else
        {
            return Nh;
        }
    }

    public String getDisplayName()
    {
        return getString(Ng.RP);
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a(Ng.RP, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return aw(Ng.RS);
    }

    public String getHiResImageUrl()
    {
        return getString(Ng.RT);
    }

    public Uri getIconImageUri()
    {
        return aw(Ng.RQ);
    }

    public String getIconImageUrl()
    {
        return getString(Ng.RR);
    }

    public long getLastPlayedWithTimestamp()
    {
        if (!av(Ng.RW) || ax(Ng.RW))
        {
            return -1L;
        } else
        {
            return getLong(Ng.RW);
        }
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return MX;
    }

    public String getPlayerId()
    {
        return getString(Ng.RO);
    }

    public long getRetrievedTimestamp()
    {
        return getLong(Ng.RU);
    }

    public String getTitle()
    {
        return getString(Ng.Se);
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        a(Ng.Se, chararraybuffer);
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
