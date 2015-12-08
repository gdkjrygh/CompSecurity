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

    private final PlayerLevelInfo Xm;
    private final PlayerColumnNames Xv;
    private final MostRecentGameInfoRef Xw;

    public PlayerRef(DataHolder dataholder, int i)
    {
        this(dataholder, i, null);
    }

    public PlayerRef(DataHolder dataholder, int i, String s)
    {
        super(dataholder, i);
        Xv = new PlayerColumnNames(s);
        Xw = new MostRecentGameInfoRef(dataholder, i, Xv);
        if (kG())
        {
            i = getInteger(Xv.acV);
            int j = getInteger(Xv.acY);
            s = new PlayerLevel(i, getLong(Xv.acW), getLong(Xv.acX));
            if (i != j)
            {
                dataholder = new PlayerLevel(j, getLong(Xv.acX), getLong(Xv.acZ));
            } else
            {
                dataholder = s;
            }
            Xm = new PlayerLevelInfo(getLong(Xv.acU), getLong(Xv.ada), s, dataholder);
            return;
        } else
        {
            Xm = null;
            return;
        }
    }

    private boolean kG()
    {
        while (aS(Xv.acU) || getLong(Xv.acU) == -1L) 
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

    public String getDisplayName()
    {
        return getString(Xv.acM);
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a(Xv.acM, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return aR(Xv.acP);
    }

    public String getHiResImageUrl()
    {
        return getString(Xv.acQ);
    }

    public Uri getIconImageUri()
    {
        return aR(Xv.acN);
    }

    public String getIconImageUrl()
    {
        return getString(Xv.acO);
    }

    public long getLastPlayedWithTimestamp()
    {
        if (!aQ(Xv.acT) || aS(Xv.acT))
        {
            return -1L;
        } else
        {
            return getLong(Xv.acT);
        }
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return Xm;
    }

    public String getPlayerId()
    {
        return getString(Xv.acL);
    }

    public long getRetrievedTimestamp()
    {
        return getLong(Xv.acR);
    }

    public String getTitle()
    {
        return getString(Xv.adb);
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        a(Xv.adb, chararraybuffer);
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
        return PlayerEntity.b(this);
    }

    public boolean isProfileVisible()
    {
        return getBoolean(Xv.add);
    }

    public int kE()
    {
        return getInteger(Xv.acS);
    }

    public MostRecentGameInfo kF()
    {
        if (aS(Xv.ade))
        {
            return null;
        } else
        {
            return Xw;
        }
    }

    public String toString()
    {
        return PlayerEntity.c(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((PlayerEntity)freeze()).writeToParcel(parcel, i);
    }
}
