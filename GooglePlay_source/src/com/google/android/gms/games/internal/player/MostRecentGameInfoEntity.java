// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntityCreator

public final class MostRecentGameInfoEntity
    implements SafeParcelable, MostRecentGameInfo
{

    public static final MostRecentGameInfoEntityCreator CREATOR = new MostRecentGameInfoEntityCreator();
    final long mActivityTimestampMillis;
    final Uri mGameFeaturedImageUri;
    final Uri mGameHiResImageUri;
    final Uri mGameIconImageUri;
    final String mGameId;
    final String mGameName;
    final int mVersionCode;

    MostRecentGameInfoEntity(int i, String s, String s1, long l, Uri uri, Uri uri1, 
            Uri uri2)
    {
        mVersionCode = i;
        mGameId = s;
        mGameName = s1;
        mActivityTimestampMillis = l;
        mGameIconImageUri = uri;
        mGameHiResImageUri = uri1;
        mGameFeaturedImageUri = uri2;
    }

    public MostRecentGameInfoEntity(MostRecentGameInfo mostrecentgameinfo)
    {
        mVersionCode = 2;
        mGameId = mostrecentgameinfo.getGameId();
        mGameName = mostrecentgameinfo.getGameName();
        mActivityTimestampMillis = mostrecentgameinfo.getActivityTimestampMillis();
        mGameIconImageUri = mostrecentgameinfo.getGameIconImageUri();
        mGameHiResImageUri = mostrecentgameinfo.getGameHiResImageUri();
        mGameFeaturedImageUri = mostrecentgameinfo.getGameFeaturedImageUri();
    }

    static boolean equals(MostRecentGameInfo mostrecentgameinfo, Object obj)
    {
        if (obj instanceof MostRecentGameInfo)
        {
            if (mostrecentgameinfo == obj)
            {
                return true;
            }
            obj = (MostRecentGameInfo)obj;
            if (Objects.equal(((MostRecentGameInfo) (obj)).getGameId(), mostrecentgameinfo.getGameId()) && Objects.equal(((MostRecentGameInfo) (obj)).getGameName(), mostrecentgameinfo.getGameName()) && Objects.equal(Long.valueOf(((MostRecentGameInfo) (obj)).getActivityTimestampMillis()), Long.valueOf(mostrecentgameinfo.getActivityTimestampMillis())) && Objects.equal(((MostRecentGameInfo) (obj)).getGameIconImageUri(), mostrecentgameinfo.getGameIconImageUri()) && Objects.equal(((MostRecentGameInfo) (obj)).getGameHiResImageUri(), mostrecentgameinfo.getGameHiResImageUri()) && Objects.equal(((MostRecentGameInfo) (obj)).getGameFeaturedImageUri(), mostrecentgameinfo.getGameFeaturedImageUri()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(MostRecentGameInfo mostrecentgameinfo)
    {
        return Arrays.hashCode(new Object[] {
            mostrecentgameinfo.getGameId(), mostrecentgameinfo.getGameName(), Long.valueOf(mostrecentgameinfo.getActivityTimestampMillis()), mostrecentgameinfo.getGameIconImageUri(), mostrecentgameinfo.getGameHiResImageUri(), mostrecentgameinfo.getGameFeaturedImageUri()
        });
    }

    static String toString(MostRecentGameInfo mostrecentgameinfo)
    {
        return Objects.toStringHelper(mostrecentgameinfo).add("GameId", mostrecentgameinfo.getGameId()).add("GameName", mostrecentgameinfo.getGameName()).add("ActivityTimestampMillis", Long.valueOf(mostrecentgameinfo.getActivityTimestampMillis())).add("GameIconUri", mostrecentgameinfo.getGameIconImageUri()).add("GameHiResUri", mostrecentgameinfo.getGameHiResImageUri()).add("GameFeaturedUri", mostrecentgameinfo.getGameFeaturedImageUri()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((MostRecentGameInfo) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final long getActivityTimestampMillis()
    {
        return mActivityTimestampMillis;
    }

    public final Uri getGameFeaturedImageUri()
    {
        return mGameFeaturedImageUri;
    }

    public final Uri getGameHiResImageUri()
    {
        return mGameHiResImageUri;
    }

    public final Uri getGameIconImageUri()
    {
        return mGameIconImageUri;
    }

    public final String getGameId()
    {
        return mGameId;
    }

    public final String getGameName()
    {
        return mGameName;
    }

    public final int hashCode()
    {
        return hashCode(((MostRecentGameInfo) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((MostRecentGameInfo) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        MostRecentGameInfoEntityCreator.writeToParcel(this, parcel, i);
    }

}
