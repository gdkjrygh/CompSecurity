// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntityCreator

public final class GameEntity extends GamesDowngradeableSafeParcel
    implements Game
{
    static final class GameEntityCreatorCompat extends GameEntityCreator
    {

        public final GameEntity createFromParcel(Parcel parcel)
        {
            if (GameEntity.versionSupportsSafeParcel(GameEntity.getUnparcelClientVersion()) || GameEntity.canUnparcelSafely(com/google/android/gms/games/GameEntity.getCanonicalName()))
            {
                return super.createFromParcel(parcel);
            }
            String s = parcel.readString();
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            String s3 = parcel.readString();
            String s4 = parcel.readString();
            String s5 = parcel.readString();
            Object obj = parcel.readString();
            Object obj1;
            Object obj2;
            boolean flag;
            boolean flag1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = Uri.parse(((String) (obj)));
            }
            obj1 = parcel.readString();
            if (obj1 == null)
            {
                obj1 = null;
            } else
            {
                obj1 = Uri.parse(((String) (obj1)));
            }
            obj2 = parcel.readString();
            if (obj2 == null)
            {
                obj2 = null;
            } else
            {
                obj2 = Uri.parse(((String) (obj2)));
            }
            if (parcel.readInt() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            return new GameEntity(7, s, s1, s2, s3, s4, s5, ((Uri) (obj)), ((Uri) (obj1)), ((Uri) (obj2)), flag, flag1, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        GameEntityCreatorCompat()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new GameEntityCreatorCompat();
    final int mAchievementTotalCount;
    public final String mApplicationId;
    final String mDescription;
    final String mDeveloperName;
    public final String mDisplayName;
    final Uri mFeaturedImageUri;
    final String mFeaturedImageUrl;
    final int mGameplayAclStatus;
    final boolean mHasGamepadSupport;
    final Uri mHiResImageUri;
    final String mHiResImageUrl;
    final Uri mIconImageUri;
    final String mIconImageUrl;
    final boolean mIdentitySharingConfirmed;
    final boolean mInstanceInstalled;
    public final String mInstancePackageName;
    final int mLeaderboardCount;
    final boolean mMuted;
    final boolean mPlayEnabledGame;
    final String mPrimaryCategory;
    final boolean mRealTimeEnabled;
    final String mSecondaryCategory;
    final boolean mSnapshotsEnabled;
    public final String mThemeColor;
    final boolean mTurnBasedEnabled;
    final int mVersionCode;

    GameEntity(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s6, int j, 
            int k, int l, boolean flag2, boolean flag3, String s7, String s8, String s9, 
            boolean flag4, boolean flag5, boolean flag6, String s10, boolean flag7)
    {
        mVersionCode = i;
        mApplicationId = s;
        mDisplayName = s1;
        mPrimaryCategory = s2;
        mSecondaryCategory = s3;
        mDescription = s4;
        mDeveloperName = s5;
        mIconImageUri = uri;
        mIconImageUrl = s7;
        mHiResImageUri = uri1;
        mHiResImageUrl = s8;
        mFeaturedImageUri = uri2;
        mFeaturedImageUrl = s9;
        mPlayEnabledGame = flag;
        mInstanceInstalled = flag1;
        mInstancePackageName = s6;
        mGameplayAclStatus = j;
        mAchievementTotalCount = k;
        mLeaderboardCount = l;
        mRealTimeEnabled = flag2;
        mTurnBasedEnabled = flag3;
        mMuted = flag4;
        mIdentitySharingConfirmed = flag5;
        mSnapshotsEnabled = flag6;
        mThemeColor = s10;
        mHasGamepadSupport = flag7;
    }

    public GameEntity(Game game)
    {
        mVersionCode = 7;
        mApplicationId = game.getApplicationId();
        mPrimaryCategory = game.getPrimaryCategory();
        mSecondaryCategory = game.getSecondaryCategory();
        mDescription = game.getDescription();
        mDeveloperName = game.getDeveloperName();
        mDisplayName = game.getDisplayName();
        mIconImageUri = game.getIconImageUri();
        mIconImageUrl = game.getIconImageUrl();
        mHiResImageUri = game.getHiResImageUri();
        mHiResImageUrl = game.getHiResImageUrl();
        mFeaturedImageUri = game.getFeaturedImageUri();
        mFeaturedImageUrl = game.getFeaturedImageUrl();
        mPlayEnabledGame = game.isPlayEnabledGame();
        mInstanceInstalled = game.isInstanceInstalled();
        mInstancePackageName = game.getInstancePackageName();
        mGameplayAclStatus = game.getGameplayAclStatus();
        mAchievementTotalCount = game.getAchievementTotalCount();
        mLeaderboardCount = game.getLeaderboardCount();
        mRealTimeEnabled = game.isRealTimeMultiplayerEnabled();
        mTurnBasedEnabled = game.isTurnBasedMultiplayerEnabled();
        mMuted = game.isMuted();
        mIdentitySharingConfirmed = game.isIdentitySharingConfirmed();
        mSnapshotsEnabled = game.areSnapshotsEnabled();
        mThemeColor = game.getThemeColor();
        mHasGamepadSupport = game.hasGamepadSupport();
    }

    static boolean equals(Game game, Object obj)
    {
        if (obj instanceof Game)
        {
            if (game == obj)
            {
                return true;
            }
            obj = (Game)obj;
            if (Objects.equal(((Game) (obj)).getApplicationId(), game.getApplicationId()) && Objects.equal(((Game) (obj)).getDisplayName(), game.getDisplayName()) && Objects.equal(((Game) (obj)).getPrimaryCategory(), game.getPrimaryCategory()) && Objects.equal(((Game) (obj)).getSecondaryCategory(), game.getSecondaryCategory()) && Objects.equal(((Game) (obj)).getDescription(), game.getDescription()) && Objects.equal(((Game) (obj)).getDeveloperName(), game.getDeveloperName()) && Objects.equal(((Game) (obj)).getIconImageUri(), game.getIconImageUri()) && Objects.equal(((Game) (obj)).getHiResImageUri(), game.getHiResImageUri()) && Objects.equal(((Game) (obj)).getFeaturedImageUri(), game.getFeaturedImageUri()) && Objects.equal(Boolean.valueOf(((Game) (obj)).isPlayEnabledGame()), Boolean.valueOf(game.isPlayEnabledGame())) && Objects.equal(Boolean.valueOf(((Game) (obj)).isInstanceInstalled()), Boolean.valueOf(game.isInstanceInstalled())) && Objects.equal(((Game) (obj)).getInstancePackageName(), game.getInstancePackageName()) && Objects.equal(Integer.valueOf(((Game) (obj)).getGameplayAclStatus()), Integer.valueOf(game.getGameplayAclStatus())) && Objects.equal(Integer.valueOf(((Game) (obj)).getAchievementTotalCount()), Integer.valueOf(game.getAchievementTotalCount())) && Objects.equal(Integer.valueOf(((Game) (obj)).getLeaderboardCount()), Integer.valueOf(game.getLeaderboardCount())) && Objects.equal(Boolean.valueOf(((Game) (obj)).isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled())))
            {
                boolean flag1 = ((Game) (obj)).isTurnBasedMultiplayerEnabled();
                boolean flag;
                if (game.isTurnBasedMultiplayerEnabled() && Objects.equal(Boolean.valueOf(((Game) (obj)).isMuted()), Boolean.valueOf(game.isMuted())) && Objects.equal(Boolean.valueOf(((Game) (obj)).isIdentitySharingConfirmed()), Boolean.valueOf(game.isIdentitySharingConfirmed())))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (Objects.equal(Boolean.valueOf(flag1), Boolean.valueOf(flag)) && Objects.equal(Boolean.valueOf(((Game) (obj)).areSnapshotsEnabled()), Boolean.valueOf(game.areSnapshotsEnabled())) && Objects.equal(((Game) (obj)).getThemeColor(), game.getThemeColor()) && Objects.equal(Boolean.valueOf(((Game) (obj)).hasGamepadSupport()), Boolean.valueOf(game.hasGamepadSupport())))
                {
                    return true;
                }
            }
        }
        return false;
    }

    static int hashCode(Game game)
    {
        return Arrays.hashCode(new Object[] {
            game.getApplicationId(), game.getDisplayName(), game.getPrimaryCategory(), game.getSecondaryCategory(), game.getDescription(), game.getDeveloperName(), game.getIconImageUri(), game.getHiResImageUri(), game.getFeaturedImageUri(), Boolean.valueOf(game.isPlayEnabledGame()), 
            Boolean.valueOf(game.isInstanceInstalled()), game.getInstancePackageName(), Integer.valueOf(game.getGameplayAclStatus()), Integer.valueOf(game.getAchievementTotalCount()), Integer.valueOf(game.getLeaderboardCount()), Boolean.valueOf(game.isRealTimeMultiplayerEnabled()), Boolean.valueOf(game.isTurnBasedMultiplayerEnabled()), Boolean.valueOf(game.isMuted()), Boolean.valueOf(game.isIdentitySharingConfirmed()), Boolean.valueOf(game.areSnapshotsEnabled()), 
            game.getThemeColor(), Boolean.valueOf(game.hasGamepadSupport())
        });
    }

    static String toString(Game game)
    {
        return Objects.toStringHelper(game).add("ApplicationId", game.getApplicationId()).add("DisplayName", game.getDisplayName()).add("PrimaryCategory", game.getPrimaryCategory()).add("SecondaryCategory", game.getSecondaryCategory()).add("Description", game.getDescription()).add("DeveloperName", game.getDeveloperName()).add("IconImageUri", game.getIconImageUri()).add("IconImageUrl", game.getIconImageUrl()).add("HiResImageUri", game.getHiResImageUri()).add("HiResImageUrl", game.getHiResImageUrl()).add("FeaturedImageUri", game.getFeaturedImageUri()).add("FeaturedImageUrl", game.getFeaturedImageUrl()).add("PlayEnabledGame", Boolean.valueOf(game.isPlayEnabledGame())).add("InstanceInstalled", Boolean.valueOf(game.isInstanceInstalled())).add("InstancePackageName", game.getInstancePackageName()).add("AchievementTotalCount", Integer.valueOf(game.getAchievementTotalCount())).add("LeaderboardCount", Integer.valueOf(game.getLeaderboardCount())).add("RealTimeMultiplayerEnabled", Boolean.valueOf(game.isRealTimeMultiplayerEnabled())).add("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.isTurnBasedMultiplayerEnabled())).add("AreSnapshotsEnabled", Boolean.valueOf(game.areSnapshotsEnabled())).add("ThemeColor", game.getThemeColor()).add("HasGamepadSupport", Boolean.valueOf(game.hasGamepadSupport())).toString();
    }

    public final boolean areSnapshotsEnabled()
    {
        return mSnapshotsEnabled;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((Game) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final int getAchievementTotalCount()
    {
        return mAchievementTotalCount;
    }

    public final String getApplicationId()
    {
        return mApplicationId;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final String getDeveloperName()
    {
        return mDeveloperName;
    }

    public final void getDeveloperName(CharArrayBuffer chararraybuffer)
    {
        DataUtils.copyStringToBuffer(mDeveloperName, chararraybuffer);
    }

    public final String getDisplayName()
    {
        return mDisplayName;
    }

    public final void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        DataUtils.copyStringToBuffer(mDisplayName, chararraybuffer);
    }

    public final Uri getFeaturedImageUri()
    {
        return mFeaturedImageUri;
    }

    public final String getFeaturedImageUrl()
    {
        return mFeaturedImageUrl;
    }

    public final int getGameplayAclStatus()
    {
        return mGameplayAclStatus;
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

    public final String getInstancePackageName()
    {
        return mInstancePackageName;
    }

    public final int getLeaderboardCount()
    {
        return mLeaderboardCount;
    }

    public final String getPrimaryCategory()
    {
        return mPrimaryCategory;
    }

    public final String getSecondaryCategory()
    {
        return mSecondaryCategory;
    }

    public final String getThemeColor()
    {
        return mThemeColor;
    }

    public final boolean hasGamepadSupport()
    {
        return mHasGamepadSupport;
    }

    public final int hashCode()
    {
        return hashCode(((Game) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final boolean isIdentitySharingConfirmed()
    {
        return mIdentitySharingConfirmed;
    }

    public final boolean isInstanceInstalled()
    {
        return mInstanceInstalled;
    }

    public final boolean isMuted()
    {
        return mMuted;
    }

    public final boolean isPlayEnabledGame()
    {
        return mPlayEnabledGame;
    }

    public final boolean isRealTimeMultiplayerEnabled()
    {
        return mRealTimeEnabled;
    }

    public final boolean isTurnBasedMultiplayerEnabled()
    {
        return mTurnBasedEnabled;
    }

    public final String toString()
    {
        return toString(((Game) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        Object obj = null;
        if (!super.mShouldDowngrade)
        {
            GameEntityCreator.writeToParcel(this, parcel, i);
            return;
        }
        parcel.writeString(mApplicationId);
        parcel.writeString(mDisplayName);
        parcel.writeString(mPrimaryCategory);
        parcel.writeString(mSecondaryCategory);
        parcel.writeString(mDescription);
        parcel.writeString(mDeveloperName);
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
            s = null;
        } else
        {
            s = mHiResImageUri.toString();
        }
        parcel.writeString(s);
        if (mFeaturedImageUri == null)
        {
            s = obj;
        } else
        {
            s = mFeaturedImageUri.toString();
        }
        parcel.writeString(s);
        if (mPlayEnabledGame)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (mInstanceInstalled)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeString(mInstancePackageName);
        parcel.writeInt(mGameplayAclStatus);
        parcel.writeInt(mAchievementTotalCount);
        parcel.writeInt(mLeaderboardCount);
    }




}
