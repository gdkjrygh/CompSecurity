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

    private final PlayerLevelInfo VP;
    private final PlayerColumnNames VY;
    private final MostRecentGameInfoRef VZ;

    public PlayerRef(DataHolder dataholder, int i)
    {
        this(dataholder, i, null);
    }

    public PlayerRef(DataHolder dataholder, int i, String s)
    {
        super(dataholder, i);
        VY = new PlayerColumnNames(s);
        VZ = new MostRecentGameInfoRef(dataholder, i, VY);
        if (jW())
        {
            i = getInteger(VY.abc);
            int j = getInteger(VY.abf);
            s = new PlayerLevel(i, getLong(VY.abd), getLong(VY.abe));
            if (i != j)
            {
                dataholder = new PlayerLevel(j, getLong(VY.abe), getLong(VY.abg));
            } else
            {
                dataholder = s;
            }
            VP = new PlayerLevelInfo(getLong(VY.abb), getLong(VY.abh), s, dataholder);
            return;
        } else
        {
            VP = null;
            return;
        }
    }

    private boolean jW()
    {
        while (aS(VY.abb) || getLong(VY.abb) == -1L) 
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
        return getString(VY.aaT);
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a(VY.aaT, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return aR(VY.aaW);
    }

    public String getHiResImageUrl()
    {
        return getString(VY.aaX);
    }

    public Uri getIconImageUri()
    {
        return aR(VY.aaU);
    }

    public String getIconImageUrl()
    {
        return getString(VY.aaV);
    }

    public long getLastPlayedWithTimestamp()
    {
        if (!aQ(VY.aba) || aS(VY.aba))
        {
            return -1L;
        } else
        {
            return getLong(VY.aba);
        }
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return VP;
    }

    public String getPlayerId()
    {
        return getString(VY.aaS);
    }

    public long getRetrievedTimestamp()
    {
        return getLong(VY.aaY);
    }

    public String getTitle()
    {
        return getString(VY.abi);
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        a(VY.abi, chararraybuffer);
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
        return getBoolean(VY.abk);
    }

    public int jU()
    {
        return getInteger(VY.aaZ);
    }

    public MostRecentGameInfo jV()
    {
        if (aS(VY.abl))
        {
            return null;
        } else
        {
            return VZ;
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
