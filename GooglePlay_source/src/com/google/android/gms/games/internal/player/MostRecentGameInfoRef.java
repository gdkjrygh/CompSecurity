// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntity, PlayerColumnNames

public final class MostRecentGameInfoRef extends DataBufferRef
    implements MostRecentGameInfo
{

    private final PlayerColumnNames mColumnNames;

    public MostRecentGameInfoRef(DataHolder dataholder, int i, PlayerColumnNames playercolumnnames)
    {
        super(dataholder, i);
        mColumnNames = playercolumnnames;
    }

    private MostRecentGameInfo freeze()
    {
        return new MostRecentGameInfoEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return MostRecentGameInfoEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final long getActivityTimestampMillis()
    {
        return getLong(mColumnNames.mostRecentActivityTimestamp);
    }

    public final Uri getGameFeaturedImageUri()
    {
        return parseUri(mColumnNames.mostRecentGameFeaturedUri);
    }

    public final Uri getGameHiResImageUri()
    {
        return parseUri(mColumnNames.mostRecentGameHiResUri);
    }

    public final Uri getGameIconImageUri()
    {
        return parseUri(mColumnNames.mostRecentGameIconUri);
    }

    public final String getGameId()
    {
        return getString(mColumnNames.mostRecentGameId);
    }

    public final String getGameName()
    {
        return getString(mColumnNames.mostRecentGameName);
    }

    public final int hashCode()
    {
        return MostRecentGameInfoEntity.hashCode(this);
    }

    public final String toString()
    {
        return MostRecentGameInfoEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((MostRecentGameInfoEntity)freeze()).writeToParcel(parcel, i);
    }
}
