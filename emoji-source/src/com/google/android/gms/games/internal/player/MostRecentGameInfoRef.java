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

    private final PlayerColumnNames Ng;

    public MostRecentGameInfoRef(DataHolder dataholder, int i, PlayerColumnNames playercolumnnames)
    {
        super(dataholder, i);
        Ng = playercolumnnames;
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
        return iv();
    }

    public int hashCode()
    {
        return MostRecentGameInfoEntity.a(this);
    }

    public String ip()
    {
        return getString(Ng.Sg);
    }

    public String iq()
    {
        return getString(Ng.Sh);
    }

    public long ir()
    {
        return getLong(Ng.Si);
    }

    public Uri is()
    {
        return aw(Ng.Sj);
    }

    public Uri it()
    {
        return aw(Ng.Sk);
    }

    public Uri iu()
    {
        return aw(Ng.Sl);
    }

    public MostRecentGameInfo iv()
    {
        return new MostRecentGameInfoEntity(this);
    }

    public String toString()
    {
        return MostRecentGameInfoEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((MostRecentGameInfoEntity)iv()).writeToParcel(parcel, i);
    }
}
