// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntity, PlayerColumnNames

public final class MostRecentGameInfoRef extends d
    implements MostRecentGameInfo
{

    private final PlayerColumnNames VY;

    public MostRecentGameInfoRef(DataHolder dataholder, int i, PlayerColumnNames playercolumnnames)
    {
        super(dataholder, i);
        VY = playercolumnnames;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return MostRecentGameInfoEntity.a(this, obj);
    }

    public Object freeze()
    {
        return lv();
    }

    public int hashCode()
    {
        return MostRecentGameInfoEntity.a(this);
    }

    public String lp()
    {
        return getString(VY.abl);
    }

    public String lq()
    {
        return getString(VY.abm);
    }

    public long lr()
    {
        return getLong(VY.abn);
    }

    public Uri ls()
    {
        return aR(VY.abo);
    }

    public Uri lt()
    {
        return aR(VY.abp);
    }

    public Uri lu()
    {
        return aR(VY.abq);
    }

    public MostRecentGameInfo lv()
    {
        return new MostRecentGameInfoEntity(this);
    }

    public String toString()
    {
        return MostRecentGameInfoEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((MostRecentGameInfoEntity)lv()).writeToParcel(parcel, i);
    }
}
