// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.game.GameBadge;
import com.google.android.gms.games.internal.game.GameBadgeEntity;
import com.google.android.gms.games.internal.game.GameBadgeEntityCreator;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.client.games:
//            GameFirstParty, GameFirstPartyEntityCreator

public final class GameFirstPartyEntity extends GamesDowngradeableSafeParcel
    implements GameFirstParty
{
    static final class GameFirstPartyEntityCreatorCompat extends GameFirstPartyEntityCreator
    {

        public final GameFirstPartyEntity createFromParcel(Parcel parcel)
        {
            if (GameFirstPartyEntity.versionSupportsSafeParcel(GameFirstPartyEntity.getUnparcelClientVersion()) || GameFirstPartyEntity.canUnparcelSafely(com/google/android/gms/games/client/games/GameFirstPartyEntity.getCanonicalName()))
            {
                return super.createFromParcel(parcel);
            }
            GameEntity gameentity = (GameEntity)GameEntity.CREATOR.createFromParcel(parcel);
            int j = parcel.readInt();
            String s;
            String s1;
            ArrayList arraylist;
            int k;
            int l;
            long l1;
            long l2;
            long l3;
            boolean flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = parcel.readInt();
            l1 = parcel.readLong();
            l2 = parcel.readLong();
            s = parcel.readString();
            l3 = parcel.readLong();
            s1 = parcel.readString();
            l = parcel.readInt();
            arraylist = new ArrayList(l);
            for (int i = 0; i < l; i++)
            {
                arraylist.add(GameBadgeEntity.CREATOR.createFromParcel(parcel));
            }

            return new GameFirstPartyEntity(3, gameentity, j, flag, k, l1, l2, s, l3, s1, arraylist, null, new ArrayList(), null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        GameFirstPartyEntityCreatorCompat()
        {
        }
    }


    public static final GameFirstPartyEntityCreator CREATOR = new GameFirstPartyEntityCreatorCompat();
    final int mAchievementUnlockedCount;
    final int mAvailability;
    private final ArrayList mBadges;
    final String mFormattedFullPrice;
    final String mFormattedPrice;
    final long mFullPriceMicros;
    final GameEntity mGame;
    final long mLastPlayedServerTimestamp;
    final boolean mOwned;
    final long mPriceMicros;
    final List mScreenshotImageUris;
    final SnapshotMetadataEntity mSnapshot;
    final int mVersionCode;
    final String mVideoUrl;

    GameFirstPartyEntity(int i, GameEntity gameentity, int j, boolean flag, int k, long l, 
            long l1, String s, long l2, String s1, ArrayList arraylist, 
            SnapshotMetadataEntity snapshotmetadataentity, List list, String s2)
    {
        mVersionCode = i;
        mGame = gameentity;
        mAvailability = j;
        mOwned = flag;
        mAchievementUnlockedCount = k;
        mLastPlayedServerTimestamp = l;
        mPriceMicros = l1;
        mFormattedPrice = s;
        mFullPriceMicros = l2;
        mFormattedFullPrice = s1;
        mBadges = arraylist;
        mSnapshot = snapshotmetadataentity;
        mScreenshotImageUris = list;
        mVideoUrl = s2;
    }

    public GameFirstPartyEntity(GameFirstParty gamefirstparty)
    {
        Object obj1 = null;
        super();
        mVersionCode = 3;
        Object obj = gamefirstparty.getGame();
        int j;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new GameEntity(((Game) (obj)));
        }
        mGame = ((GameEntity) (obj));
        mAvailability = gamefirstparty.getAvailability();
        mOwned = gamefirstparty.isOwned();
        mAchievementUnlockedCount = gamefirstparty.getAchievementUnlockedCount();
        mLastPlayedServerTimestamp = gamefirstparty.getLastPlayedServerTimestamp();
        mPriceMicros = gamefirstparty.getPriceMicros();
        mFormattedPrice = gamefirstparty.getFormattedPrice();
        mFullPriceMicros = gamefirstparty.getFullPriceMicros();
        mFormattedFullPrice = gamefirstparty.getFormattedFullPrice();
        obj = gamefirstparty.getSnapshot();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = new SnapshotMetadataEntity(((SnapshotMetadata) (obj)));
        }
        mSnapshot = ((SnapshotMetadataEntity) (obj));
        mScreenshotImageUris = gamefirstparty.getScreenshotImageUris();
        mVideoUrl = gamefirstparty.getVideoUrl();
        gamefirstparty = gamefirstparty.getBadges();
        j = gamefirstparty.size();
        mBadges = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            mBadges.add((GameBadgeEntity)((GameBadge)gamefirstparty.get(i)).freeze());
        }

    }

    static boolean equals(GameFirstParty gamefirstparty, Object obj)
    {
        if (obj instanceof GameFirstParty)
        {
            if (gamefirstparty == obj)
            {
                return true;
            }
            obj = (GameFirstParty)obj;
            if (Objects.equal(((GameFirstParty) (obj)).getGame(), gamefirstparty.getGame()) && Objects.equal(Integer.valueOf(((GameFirstParty) (obj)).getAvailability()), Integer.valueOf(gamefirstparty.getAvailability())) && Objects.equal(Boolean.valueOf(((GameFirstParty) (obj)).isOwned()), Boolean.valueOf(gamefirstparty.isOwned())) && Objects.equal(Integer.valueOf(((GameFirstParty) (obj)).getAchievementUnlockedCount()), Integer.valueOf(gamefirstparty.getAchievementUnlockedCount())) && Objects.equal(Long.valueOf(((GameFirstParty) (obj)).getLastPlayedServerTimestamp()), Long.valueOf(gamefirstparty.getLastPlayedServerTimestamp())) && Objects.equal(Long.valueOf(((GameFirstParty) (obj)).getPriceMicros()), Long.valueOf(gamefirstparty.getPriceMicros())) && Objects.equal(((GameFirstParty) (obj)).getFormattedPrice(), gamefirstparty.getFormattedPrice()) && Objects.equal(Long.valueOf(((GameFirstParty) (obj)).getFullPriceMicros()), Long.valueOf(gamefirstparty.getFullPriceMicros())) && Objects.equal(((GameFirstParty) (obj)).getFormattedFullPrice(), gamefirstparty.getFormattedFullPrice()) && Objects.equal(((GameFirstParty) (obj)).getScreenshotImageUris(), gamefirstparty.getScreenshotImageUris()) && Objects.equal(((GameFirstParty) (obj)).getVideoUrl(), gamefirstparty.getVideoUrl()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(GameFirstParty gamefirstparty)
    {
        return Arrays.hashCode(new Object[] {
            gamefirstparty.getGame(), Integer.valueOf(gamefirstparty.getAvailability()), Boolean.valueOf(gamefirstparty.isOwned()), Integer.valueOf(gamefirstparty.getAchievementUnlockedCount()), Long.valueOf(gamefirstparty.getLastPlayedServerTimestamp()), Long.valueOf(gamefirstparty.getPriceMicros()), gamefirstparty.getFormattedPrice(), Long.valueOf(gamefirstparty.getFullPriceMicros()), gamefirstparty.getFormattedFullPrice(), gamefirstparty.getScreenshotImageUris(), 
            gamefirstparty.getVideoUrl()
        });
    }

    static String toString(GameFirstParty gamefirstparty)
    {
        return Objects.toStringHelper(gamefirstparty).add("Game", gamefirstparty.getGame()).add("Availability", Integer.valueOf(gamefirstparty.getAvailability())).add("Owned", Boolean.valueOf(gamefirstparty.isOwned())).add("AchievementUnlockedCount", Integer.valueOf(gamefirstparty.getAchievementUnlockedCount())).add("LastPlayedServerTimestamp", Long.valueOf(gamefirstparty.getLastPlayedServerTimestamp())).add("PriceMicros", Long.valueOf(gamefirstparty.getPriceMicros())).add("FormattedPrice", gamefirstparty.getFormattedPrice()).add("FullPriceMicros", Long.valueOf(gamefirstparty.getFullPriceMicros())).add("FormattedFullPrice", gamefirstparty.getFormattedFullPrice()).add("Snapshot", gamefirstparty.getSnapshot()).add("ScreenshotImageUris", gamefirstparty.getScreenshotImageUris()).add("VideoUrl", gamefirstparty.getVideoUrl()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((GameFirstParty) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final int getAchievementUnlockedCount()
    {
        return mAchievementUnlockedCount;
    }

    public final int getAvailability()
    {
        return mAvailability;
    }

    public final ArrayList getBadges()
    {
        return new ArrayList(mBadges);
    }

    public final String getFormattedFullPrice()
    {
        return mFormattedFullPrice;
    }

    public final String getFormattedPrice()
    {
        return mFormattedPrice;
    }

    public final long getFullPriceMicros()
    {
        return mFullPriceMicros;
    }

    public final volatile Game getGame()
    {
        return mGame;
    }

    public final long getLastPlayedServerTimestamp()
    {
        return mLastPlayedServerTimestamp;
    }

    public final long getPriceMicros()
    {
        return mPriceMicros;
    }

    public final List getScreenshotImageUris()
    {
        return mScreenshotImageUris;
    }

    public final SnapshotMetadata getSnapshot()
    {
        return mSnapshot;
    }

    public final String getVideoUrl()
    {
        return mVideoUrl;
    }

    public final int hashCode()
    {
        return hashCode(((GameFirstParty) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final boolean isOwned()
    {
        return mOwned;
    }

    public final void setShouldDowngrade(boolean flag)
    {
        super.setShouldDowngrade(flag);
        mGame.setShouldDowngrade(flag);
        int i = 0;
        for (int j = mBadges.size(); i < j; i++)
        {
            ((GameBadgeEntity)mBadges.get(i)).setShouldDowngrade(flag);
        }

    }

    public final String toString()
    {
        return toString(((GameFirstParty) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (!super.mShouldDowngrade)
        {
            GameFirstPartyEntityCreator.writeToParcel(this, parcel, i);
        } else
        {
            mGame.writeToParcel(parcel, i);
            parcel.writeInt(mAvailability);
            int j;
            int k;
            if (mOwned)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            parcel.writeInt(j);
            parcel.writeInt(mAchievementUnlockedCount);
            parcel.writeLong(mLastPlayedServerTimestamp);
            parcel.writeLong(mPriceMicros);
            parcel.writeString(mFormattedPrice);
            parcel.writeLong(mFullPriceMicros);
            parcel.writeString(mFormattedFullPrice);
            k = mBadges.size();
            parcel.writeInt(k);
            j = 0;
            while (j < k) 
            {
                ((GameBadgeEntity)mBadges.get(j)).writeToParcel(parcel, i);
                j++;
            }
        }
    }




}
