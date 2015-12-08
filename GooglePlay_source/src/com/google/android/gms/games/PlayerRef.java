// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.PlayerColumnNames;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerLevel, PlayerLevelInfo, PlayerEntity

public final class PlayerRef extends DataBufferRef
    implements Player
{

    private final PlayerColumnNames mColumnNames;
    private final MostRecentGameInfoRef mMostRecentGameInfo;
    private final PlayerLevelInfo mPlayerLevelInfo;

    public PlayerRef(DataHolder dataholder, int i)
    {
        this(dataholder, i, null);
    }

    public PlayerRef(DataHolder dataholder, int i, String s)
    {
        super(dataholder, i);
        mColumnNames = new PlayerColumnNames(s);
        mMostRecentGameInfo = new MostRecentGameInfoRef(dataholder, i, mColumnNames);
        if (!hasNull(mColumnNames.currentXpTotal) && getLong(mColumnNames.currentXpTotal) != -1L)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = getInteger(mColumnNames.currentLevel);
            int j = getInteger(mColumnNames.nextLevel);
            s = new PlayerLevel(i, getLong(mColumnNames.currentLevelMinXp), getLong(mColumnNames.currentLevelMaxXp));
            dataholder = s;
            if (i != j)
            {
                dataholder = new PlayerLevel(j, getLong(mColumnNames.currentLevelMaxXp), getLong(mColumnNames.nextLevelMaxXp));
            }
            mPlayerLevelInfo = new PlayerLevelInfo(getLong(mColumnNames.currentXpTotal), getLong(mColumnNames.lastLevelUpTimestamp), s, dataholder);
            return;
        } else
        {
            mPlayerLevelInfo = null;
            return;
        }
    }

    public static ContentValues copyForNonGplusUser(ContentValues contentvalues)
    {
        contentvalues = new ContentValues(contentvalues);
        contentvalues.putNull("external_player_id");
        return contentvalues;
    }

    private Player freeze()
    {
        return new PlayerEntity(this);
    }

    public static ContentValues toContentValues(Player player)
    {
        return toContentValues(null, player);
    }

    public static ContentValues toContentValues(String s, Player player)
    {
        PlayerColumnNames playercolumnnames = new PlayerColumnNames(s);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(playercolumnnames.externalPlayerId, player.getPlayerId());
        contentvalues.put(playercolumnnames.profileName, player.getDisplayName());
        s = player.getIconImageUri();
        if (s == null)
        {
            contentvalues.putNull(playercolumnnames.profileIconImageUri);
        } else
        {
            contentvalues.put(playercolumnnames.profileIconImageUri, s.toString());
        }
        contentvalues.put(playercolumnnames.profileIconImageUrl, player.getIconImageUrl());
        s = player.getHiResImageUri();
        if (s == null)
        {
            contentvalues.putNull(playercolumnnames.profileHiResImageUri);
        } else
        {
            contentvalues.put(playercolumnnames.profileHiResImageUri, s.toString());
        }
        contentvalues.put(playercolumnnames.profileHiResImageUrl, player.getHiResImageUrl());
        s = player.getBannerImageLandscapeUri();
        if (s == null)
        {
            contentvalues.putNull(playercolumnnames.bannerLandscapeUri);
        } else
        {
            contentvalues.put(playercolumnnames.bannerLandscapeUri, s.toString());
        }
        contentvalues.put(playercolumnnames.bannerLandscapeUrl, player.getBannerImageLandscapeUrl());
        s = player.getBannerImagePortraitUri();
        if (s == null)
        {
            contentvalues.putNull(playercolumnnames.bannerPortraitUri);
        } else
        {
            contentvalues.put(playercolumnnames.bannerPortraitUri, s.toString());
        }
        contentvalues.put(playercolumnnames.bannerPortraitUrl, player.getBannerImagePortraitUrl());
        contentvalues.put(playercolumnnames.retrievedTimestamp, Long.valueOf(player.getRetrievedTimestamp()));
        contentvalues.put(playercolumnnames.isInCircles, Integer.valueOf(player.isInCircles()));
        contentvalues.put(playercolumnnames.playedWithTimestamp, Long.valueOf(player.getLastPlayedWithTimestamp()));
        contentvalues.put(playercolumnnames.title, player.getTitle());
        contentvalues.put(playercolumnnames.isProfileVisible, Boolean.valueOf(player.isProfileVisible()));
        contentvalues.put(playercolumnnames.hasDebugAccess, Boolean.valueOf(player.hasDebugAccess()));
        contentvalues.put(playercolumnnames.hasAllPublicAclsDeprecated, Boolean.valueOf(player.isProfileVisible()));
        s = player.getLevelInfo();
        if (s == null)
        {
            contentvalues.putNull(playercolumnnames.currentLevel);
            contentvalues.putNull(playercolumnnames.currentLevelMinXp);
            contentvalues.putNull(playercolumnnames.currentLevelMaxXp);
            contentvalues.putNull(playercolumnnames.nextLevel);
            contentvalues.putNull(playercolumnnames.nextLevelMaxXp);
            contentvalues.put(playercolumnnames.lastLevelUpTimestamp, Integer.valueOf(-1));
            contentvalues.put(playercolumnnames.currentXpTotal, Long.valueOf(-1L));
        } else
        {
            PlayerLevel playerlevel = ((PlayerLevelInfo) (s)).mCurrentLevel;
            PlayerLevel playerlevel1 = ((PlayerLevelInfo) (s)).mNextLevel;
            contentvalues.put(playercolumnnames.currentLevel, Integer.valueOf(playerlevel.mLevelNumber));
            contentvalues.put(playercolumnnames.currentLevelMinXp, Long.valueOf(playerlevel.mMinXp));
            contentvalues.put(playercolumnnames.currentLevelMaxXp, Long.valueOf(playerlevel.mMaxXp));
            contentvalues.put(playercolumnnames.nextLevel, Integer.valueOf(playerlevel1.mLevelNumber));
            contentvalues.put(playercolumnnames.nextLevelMaxXp, Long.valueOf(playerlevel1.mMaxXp));
            contentvalues.put(playercolumnnames.lastLevelUpTimestamp, Long.valueOf(((PlayerLevelInfo) (s)).mLastLevelUpTimestamp));
            contentvalues.put(playercolumnnames.currentXpTotal, Long.valueOf(((PlayerLevelInfo) (s)).mCurrentXpTotal));
        }
        player = player.getMostRecentGameInfo();
        if (player != null)
        {
            contentvalues.put(playercolumnnames.mostRecentGameId, player.getGameId());
            contentvalues.put(playercolumnnames.mostRecentGameName, player.getGameName());
            contentvalues.put(playercolumnnames.mostRecentActivityTimestamp, Long.valueOf(player.getActivityTimestampMillis()));
            s = player.getGameIconImageUri();
            if (s == null)
            {
                s = null;
            } else
            {
                s = s.toString();
            }
            contentvalues.put(playercolumnnames.mostRecentGameIconUri, s);
            s = player.getGameHiResImageUri();
            if (s == null)
            {
                s = null;
            } else
            {
                s = s.toString();
            }
            contentvalues.put(playercolumnnames.mostRecentGameHiResUri, s);
            s = player.getGameFeaturedImageUri();
            if (s == null)
            {
                s = null;
            } else
            {
                s = s.toString();
            }
            contentvalues.put(playercolumnnames.mostRecentGameFeaturedUri, s);
            return contentvalues;
        } else
        {
            contentvalues.putNull(playercolumnnames.mostRecentGameId);
            contentvalues.putNull(playercolumnnames.mostRecentGameName);
            contentvalues.putNull(playercolumnnames.mostRecentActivityTimestamp);
            contentvalues.putNull(playercolumnnames.mostRecentGameIconUri);
            contentvalues.putNull(playercolumnnames.mostRecentGameHiResUri);
            contentvalues.putNull(playercolumnnames.mostRecentGameFeaturedUri);
            return contentvalues;
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return PlayerEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final Uri getBannerImageLandscapeUri()
    {
        return parseUri(mColumnNames.bannerLandscapeUri);
    }

    public final String getBannerImageLandscapeUrl()
    {
        return getString(mColumnNames.bannerLandscapeUrl);
    }

    public final Uri getBannerImagePortraitUri()
    {
        return parseUri(mColumnNames.bannerPortraitUri);
    }

    public final String getBannerImagePortraitUrl()
    {
        return getString(mColumnNames.bannerPortraitUrl);
    }

    public final String getDisplayName()
    {
        return getString(mColumnNames.profileName);
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer(mColumnNames.profileName, chararraybuffer);
    }

    public final String getGamerTag()
    {
        return getString(mColumnNames.gamerTag);
    }

    public final Uri getHiResImageUri()
    {
        return parseUri(mColumnNames.profileHiResImageUri);
    }

    public final String getHiResImageUrl()
    {
        return getString(mColumnNames.profileHiResImageUrl);
    }

    public final Uri getIconImageUri()
    {
        return parseUri(mColumnNames.profileIconImageUri);
    }

    public final String getIconImageUrl()
    {
        return getString(mColumnNames.profileIconImageUrl);
    }

    public final long getLastPlayedWithTimestamp()
    {
        if (!hasColumn(mColumnNames.playedWithTimestamp) || hasNull(mColumnNames.playedWithTimestamp))
        {
            return -1L;
        } else
        {
            return getLong(mColumnNames.playedWithTimestamp);
        }
    }

    public final PlayerLevelInfo getLevelInfo()
    {
        return mPlayerLevelInfo;
    }

    public final MostRecentGameInfo getMostRecentGameInfo()
    {
        if (hasNull(mColumnNames.mostRecentGameId))
        {
            return null;
        } else
        {
            return mMostRecentGameInfo;
        }
    }

    public final String getName()
    {
        return getString(mColumnNames.name);
    }

    public final String getPlayerId()
    {
        return getString(mColumnNames.externalPlayerId);
    }

    public final long getRetrievedTimestamp()
    {
        return getLong(mColumnNames.retrievedTimestamp);
    }

    public final String getTitle()
    {
        return getString(mColumnNames.title);
    }

    public final boolean hasDebugAccess()
    {
        return getBoolean(mColumnNames.hasDebugAccess);
    }

    public final int hashCode()
    {
        return PlayerEntity.hashCode(this);
    }

    public final int isInCircles()
    {
        return getInteger(mColumnNames.isInCircles);
    }

    public final boolean isProfileVisible()
    {
        return getBoolean(mColumnNames.isProfileVisible);
    }

    public final String toString()
    {
        return PlayerEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((PlayerEntity)freeze()).writeToParcel(parcel, i);
    }
}
