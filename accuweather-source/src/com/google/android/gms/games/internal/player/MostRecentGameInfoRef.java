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

    private final PlayerColumnNames Nd;

    public MostRecentGameInfoRef(DataHolder dataholder, int i, PlayerColumnNames playercolumnnames)
    {
        super(dataholder, i);
        Nd = playercolumnnames;
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
        return iq();
    }

    public int hashCode()
    {
        return MostRecentGameInfoEntity.a(this);
    }

    public String ik()
    {
        return getString(Nd.Sd);
    }

    public String il()
    {
        return getString(Nd.Se);
    }

    public long im()
    {
        return getLong(Nd.Sf);
    }

    public Uri in()
    {
        return aw(Nd.Sg);
    }

    public Uri io()
    {
        return aw(Nd.Sh);
    }

    public Uri ip()
    {
        return aw(Nd.Si);
    }

    public MostRecentGameInfo iq()
    {
        return new MostRecentGameInfoEntity(this);
    }

    public String toString()
    {
        return MostRecentGameInfoEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((MostRecentGameInfoEntity)iq()).writeToParcel(parcel, i);
    }
}
