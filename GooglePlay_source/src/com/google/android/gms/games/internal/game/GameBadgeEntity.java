// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntityCreator

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel
    implements GameBadge
{
    static final class GameBadgeEntityCreatorCompat extends GameBadgeEntityCreator
    {

        public final GameBadgeEntity createFromParcel(Parcel parcel)
        {
            if (GameBadgeEntity.versionSupportsSafeParcel(GameBadgeEntity.getUnparcelClientVersion()) || GameBadgeEntity.canUnparcelSafely(com/google/android/gms/games/internal/game/GameBadgeEntity.getCanonicalName()))
            {
                return super.createFromParcel(parcel);
            }
            int i = parcel.readInt();
            String s = parcel.readString();
            String s1 = parcel.readString();
            parcel = parcel.readString();
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                parcel = Uri.parse(parcel);
            }
            return new GameBadgeEntity(1, i, s, s1, parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        GameBadgeEntityCreatorCompat()
        {
        }
    }


    public static final GameBadgeEntityCreator CREATOR = new GameBadgeEntityCreatorCompat();
    String mDescription;
    Uri mIconImageUri;
    String mTitle;
    int mType;
    final int mVersionCode;

    GameBadgeEntity(int i, int j, String s, String s1, Uri uri)
    {
        mVersionCode = i;
        mType = j;
        mTitle = s;
        mDescription = s1;
        mIconImageUri = uri;
    }

    public GameBadgeEntity(GameBadge gamebadge)
    {
        mVersionCode = 1;
        mType = gamebadge.getType();
        mTitle = gamebadge.getTitle();
        mDescription = gamebadge.getDescription();
        mIconImageUri = gamebadge.getIconImageUri();
    }

    static boolean equals(GameBadge gamebadge, Object obj)
    {
        if (obj instanceof GameBadge)
        {
            if (gamebadge == obj)
            {
                return true;
            }
            obj = (GameBadge)obj;
            if (Objects.equal(Integer.valueOf(((GameBadge) (obj)).getType()), gamebadge.getTitle()) && Objects.equal(((GameBadge) (obj)).getDescription(), gamebadge.getIconImageUri()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(GameBadge gamebadge)
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(gamebadge.getType()), gamebadge.getTitle(), gamebadge.getDescription(), gamebadge.getIconImageUri()
        });
    }

    static String toString(GameBadge gamebadge)
    {
        return Objects.toStringHelper(gamebadge).add("Type", Integer.valueOf(gamebadge.getType())).add("Title", gamebadge.getTitle()).add("Description", gamebadge.getDescription()).add("IconImageUri", gamebadge.getIconImageUri()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((GameBadge) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final Uri getIconImageUri()
    {
        return mIconImageUri;
    }

    public final String getTitle()
    {
        return mTitle;
    }

    public final int getType()
    {
        return mType;
    }

    public final int hashCode()
    {
        return hashCode(((GameBadge) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((GameBadge) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        if (!super.mShouldDowngrade)
        {
            GameBadgeEntityCreator.writeToParcel(this, parcel, i);
            return;
        }
        parcel.writeInt(mType);
        parcel.writeString(mTitle);
        parcel.writeString(mDescription);
        String s;
        if (mIconImageUri == null)
        {
            s = null;
        } else
        {
            s = mIconImageUri.toString();
        }
        parcel.writeString(s);
    }




}
