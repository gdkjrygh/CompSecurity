// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntityCreator, PlayerLevelInfo

public final class PlayerEntity extends GamesDowngradeableSafeParcel
    implements Player
{
    static final class PlayerEntityCreatorCompat extends PlayerEntityCreator
    {

        public final PlayerEntity createFromParcel(Parcel parcel)
        {
            if (PlayerEntity.versionSupportsSafeParcel(PlayerEntity.getUnparcelClientVersion()) || PlayerEntity.canUnparcelSafely(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
            {
                return super.createFromParcel(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1 = parcel.readString();
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = Uri.parse(((String) (obj1)));
            }
            return new PlayerEntity(13, s, s1, ((Uri) (obj)), ((Uri) (obj1)), parcel.readLong(), -1, -1L, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        PlayerEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new PlayerEntityCreatorCompat();
    final Uri mBannerImageLandscapeUri;
    final String mBannerImageLandscapeUrl;
    final Uri mBannerImagePortraitUri;
    final String mBannerImagePortraitUrl;
    public final String mDisplayName;
    final String mGamerTag;
    final boolean mHasDebugAccess;
    public final Uri mHiResImageUri;
    public final String mHiResImageUrl;
    public final Uri mIconImageUri;
    public final String mIconImageUrl;
    final int mIsInCircles;
    final boolean mIsProfileVisible;
    final long mLastPlayedWithTimestamp;
    final MostRecentGameInfoEntity mMostRecentGameInfo;
    final String mName;
    public final String mPlayerId;
    final PlayerLevelInfo mPlayerLevelInfo;
    final long mRetrievedTimestamp;
    final String mTitle;
    final int mVersionCode;

    PlayerEntity(int i, String s, String s1, Uri uri, Uri uri1, long l, 
            int j, long l1, String s2, String s3, String s4, MostRecentGameInfoEntity mostrecentgameinfoentity, 
            PlayerLevelInfo playerlevelinfo, boolean flag, boolean flag1, String s5, String s6, Uri uri2, String s7, 
            Uri uri3, String s8)
    {
        mVersionCode = i;
        mPlayerId = s;
        mDisplayName = s1;
        mIconImageUri = uri;
        mIconImageUrl = s2;
        mHiResImageUri = uri1;
        mHiResImageUrl = s3;
        mRetrievedTimestamp = l;
        mIsInCircles = j;
        mLastPlayedWithTimestamp = l1;
        mTitle = s4;
        mIsProfileVisible = flag;
        mMostRecentGameInfo = mostrecentgameinfoentity;
        mPlayerLevelInfo = playerlevelinfo;
        mHasDebugAccess = flag1;
        mGamerTag = s5;
        mName = s6;
        mBannerImageLandscapeUri = uri2;
        mBannerImageLandscapeUrl = s7;
        mBannerImagePortraitUri = uri3;
        mBannerImagePortraitUrl = s8;
    }

    public PlayerEntity(Player player)
    {
        this(player, true);
    }

    public PlayerEntity(Player player, boolean flag)
    {
        Object obj1 = null;
        super();
        mVersionCode = 13;
        Object obj;
        if (flag)
        {
            obj = player.getPlayerId();
        } else
        {
            obj = null;
        }
        mPlayerId = ((String) (obj));
        mDisplayName = player.getDisplayName();
        mIconImageUri = player.getIconImageUri();
        mIconImageUrl = player.getIconImageUrl();
        mHiResImageUri = player.getHiResImageUri();
        mHiResImageUrl = player.getHiResImageUrl();
        mRetrievedTimestamp = player.getRetrievedTimestamp();
        mIsInCircles = player.isInCircles();
        mLastPlayedWithTimestamp = player.getLastPlayedWithTimestamp();
        mTitle = player.getTitle();
        mIsProfileVisible = player.isProfileVisible();
        obj = player.getMostRecentGameInfo();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = new MostRecentGameInfoEntity(((MostRecentGameInfo) (obj)));
        }
        mMostRecentGameInfo = ((MostRecentGameInfoEntity) (obj));
        mPlayerLevelInfo = player.getLevelInfo();
        mHasDebugAccess = player.hasDebugAccess();
        mGamerTag = player.getGamerTag();
        mName = player.getName();
        mBannerImageLandscapeUri = player.getBannerImageLandscapeUri();
        mBannerImageLandscapeUrl = player.getBannerImageLandscapeUrl();
        mBannerImagePortraitUri = player.getBannerImagePortraitUri();
        mBannerImagePortraitUrl = player.getBannerImagePortraitUrl();
        if (flag)
        {
            Asserts.checkNotNull(mPlayerId);
        }
        Asserts.checkNotNull(mDisplayName);
        if (mRetrievedTimestamp > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
    }

    static boolean equals(Player player, Object obj)
    {
        if (obj instanceof Player)
        {
            if (player == obj)
            {
                return true;
            }
            obj = (Player)obj;
            if (Objects.equal(((Player) (obj)).getPlayerId(), player.getPlayerId()) && Objects.equal(((Player) (obj)).getDisplayName(), player.getDisplayName()) && Objects.equal(Boolean.valueOf(((Player) (obj)).hasDebugAccess()), Boolean.valueOf(player.hasDebugAccess())) && Objects.equal(((Player) (obj)).getIconImageUri(), player.getIconImageUri()) && Objects.equal(((Player) (obj)).getHiResImageUri(), player.getHiResImageUri()) && Objects.equal(Long.valueOf(((Player) (obj)).getRetrievedTimestamp()), Long.valueOf(player.getRetrievedTimestamp())) && Objects.equal(((Player) (obj)).getTitle(), player.getTitle()) && Objects.equal(((Player) (obj)).getLevelInfo(), player.getLevelInfo()) && Objects.equal(((Player) (obj)).getGamerTag(), player.getGamerTag()) && Objects.equal(((Player) (obj)).getName(), player.getName()) && Objects.equal(((Player) (obj)).getBannerImageLandscapeUri(), player.getBannerImageLandscapeUri()) && Objects.equal(((Player) (obj)).getBannerImagePortraitUri(), player.getBannerImagePortraitUri()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(Player player)
    {
        return Arrays.hashCode(new Object[] {
            player.getPlayerId(), player.getDisplayName(), Boolean.valueOf(player.hasDebugAccess()), player.getIconImageUri(), player.getHiResImageUri(), Long.valueOf(player.getRetrievedTimestamp()), player.getTitle(), player.getLevelInfo(), player.getGamerTag(), player.getName(), 
            player.getBannerImageLandscapeUri(), player.getBannerImagePortraitUri()
        });
    }

    static String toString(Player player)
    {
        return Objects.toStringHelper(player).add("PlayerId", player.getPlayerId()).add("DisplayName", player.getDisplayName()).add("HasDebugAccess", Boolean.valueOf(player.hasDebugAccess())).add("IconImageUri", player.getIconImageUri()).add("IconImageUrl", player.getIconImageUrl()).add("HiResImageUri", player.getHiResImageUri()).add("HiResImageUrl", player.getHiResImageUrl()).add("RetrievedTimestamp", Long.valueOf(player.getRetrievedTimestamp())).add("Title", player.getTitle()).add("LevelInfo", player.getLevelInfo()).add("GamerTag", player.getGamerTag()).add("Name", player.getName()).add("BannerImageLandscapeUri", player.getBannerImageLandscapeUri()).add("BannerImageLandscapeUrl", player.getBannerImageLandscapeUrl()).add("BannerImagePortraitUri", player.getBannerImagePortraitUri()).add("BannerImagePortraitUrl", player.getBannerImagePortraitUrl()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((Player) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final Uri getBannerImageLandscapeUri()
    {
        return mBannerImageLandscapeUri;
    }

    public final String getBannerImageLandscapeUrl()
    {
        return mBannerImageLandscapeUrl;
    }

    public final Uri getBannerImagePortraitUri()
    {
        return mBannerImagePortraitUri;
    }

    public final String getBannerImagePortraitUrl()
    {
        return mBannerImagePortraitUrl;
    }

    public final String getDisplayName()
    {
        return mDisplayName;
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        DataUtils.copyStringToBuffer(mDisplayName, chararraybuffer);
    }

    public final String getGamerTag()
    {
        return mGamerTag;
    }

    public final Uri getHiResImageUri()
    {
        return mHiResImageUri;
    }

    public final String getHiResImageUrl()
    {
        return mHiResImageUrl;
    }

    public final Uri getIconImageUri()
    {
        return mIconImageUri;
    }

    public final String getIconImageUrl()
    {
        return mIconImageUrl;
    }

    public final long getLastPlayedWithTimestamp()
    {
        return mLastPlayedWithTimestamp;
    }

    public final PlayerLevelInfo getLevelInfo()
    {
        return mPlayerLevelInfo;
    }

    public final MostRecentGameInfo getMostRecentGameInfo()
    {
        return mMostRecentGameInfo;
    }

    public final String getName()
    {
        return mName;
    }

    public final String getPlayerId()
    {
        return mPlayerId;
    }

    public final long getRetrievedTimestamp()
    {
        return mRetrievedTimestamp;
    }

    public final String getTitle()
    {
        return mTitle;
    }

    public final boolean hasDebugAccess()
    {
        return mHasDebugAccess;
    }

    public final int hashCode()
    {
        return hashCode(((Player) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final int isInCircles()
    {
        return mIsInCircles;
    }

    public final boolean isProfileVisible()
    {
        return mIsProfileVisible;
    }

    public final String toString()
    {
        return toString(((Player) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        Object obj = null;
        if (!super.mShouldDowngrade)
        {
            PlayerEntityCreator.writeToParcel(this, parcel, i);
            return;
        }
        parcel.writeString(mPlayerId);
        parcel.writeString(mDisplayName);
        String s;
        if (mIconImageUri == null)
        {
            s = null;
        } else
        {
            s = mIconImageUri.toString();
        }
        parcel.writeString(s);
        if (mHiResImageUri == null)
        {
            s = obj;
        } else
        {
            s = mHiResImageUri.toString();
        }
        parcel.writeString(s);
        parcel.writeLong(mRetrievedTimestamp);
    }




}
