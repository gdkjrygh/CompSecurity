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

    private final PlayerColumnNames Xv;

    public MostRecentGameInfoRef(DataHolder dataholder, int i, PlayerColumnNames playercolumnnames)
    {
        super(dataholder, i);
        Xv = playercolumnnames;
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
        return mC();
    }

    public int hashCode()
    {
        return MostRecentGameInfoEntity.a(this);
    }

    public Uri mA()
    {
        return aR(Xv.adi);
    }

    public Uri mB()
    {
        return aR(Xv.adj);
    }

    public MostRecentGameInfo mC()
    {
        return new MostRecentGameInfoEntity(this);
    }

    public String mw()
    {
        return getString(Xv.ade);
    }

    public String mx()
    {
        return getString(Xv.adf);
    }

    public long my()
    {
        return getLong(Xv.adg);
    }

    public Uri mz()
    {
        return aR(Xv.adh);
    }

    public String toString()
    {
        return MostRecentGameInfoEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((MostRecentGameInfoEntity)mC()).writeToParcel(parcel, i);
    }
}
