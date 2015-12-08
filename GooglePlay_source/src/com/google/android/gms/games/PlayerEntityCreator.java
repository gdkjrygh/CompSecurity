// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

// Referenced classes of package com.google.android.gms.games:
//            PlayerEntity, PlayerLevelInfo

public class PlayerEntityCreator
    implements android.os.Parcelable.Creator
{

    public PlayerEntityCreator()
    {
    }

    static void writeToParcel(PlayerEntity playerentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, playerentity.mPlayerId, false);
        SafeParcelWriter.writeString(parcel, 2, playerentity.mDisplayName, false);
        SafeParcelWriter.writeParcelable(parcel, 3, playerentity.mIconImageUri, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, playerentity.mHiResImageUri, i, false);
        SafeParcelWriter.writeLong(parcel, 5, playerentity.mRetrievedTimestamp);
        SafeParcelWriter.writeInt(parcel, 6, playerentity.mIsInCircles);
        SafeParcelWriter.writeLong(parcel, 7, playerentity.mLastPlayedWithTimestamp);
        SafeParcelWriter.writeString(parcel, 8, playerentity.mIconImageUrl, false);
        SafeParcelWriter.writeString(parcel, 9, playerentity.mHiResImageUrl, false);
        SafeParcelWriter.writeString(parcel, 14, playerentity.mTitle, false);
        SafeParcelWriter.writeParcelable(parcel, 15, playerentity.mMostRecentGameInfo, i, false);
        SafeParcelWriter.writeParcelable(parcel, 16, playerentity.mPlayerLevelInfo, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, playerentity.mVersionCode);
        SafeParcelWriter.writeBoolean(parcel, 19, playerentity.mHasDebugAccess);
        SafeParcelWriter.writeBoolean(parcel, 18, playerentity.mIsProfileVisible);
        SafeParcelWriter.writeString(parcel, 21, playerentity.mName, false);
        SafeParcelWriter.writeString(parcel, 20, playerentity.mGamerTag, false);
        SafeParcelWriter.writeString(parcel, 23, playerentity.mBannerImageLandscapeUrl, false);
        SafeParcelWriter.writeParcelable(parcel, 22, playerentity.mBannerImageLandscapeUri, i, false);
        SafeParcelWriter.writeString(parcel, 25, playerentity.mBannerImagePortraitUrl, false);
        SafeParcelWriter.writeParcelable(parcel, 24, playerentity.mBannerImagePortraitUri, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public PlayerEntity createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s8 = null;
        String s7 = null;
        Uri uri3 = null;
        Uri uri2 = null;
        long l2 = 0L;
        int i = 0;
        long l1 = 0L;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        MostRecentGameInfoEntity mostrecentgameinfoentity = null;
        PlayerLevelInfo playerlevelinfo = null;
        boolean flag1 = false;
        boolean flag = false;
        String s3 = null;
        String s2 = null;
        Uri uri1 = null;
        String s1 = null;
        Uri uri = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    s8 = SafeParcelReader.createString(parcel, l);
                    break;

                case 2: // '\002'
                    s7 = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    uri3 = (Uri)SafeParcelReader.createParcelable(parcel, l, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri2 = (Uri)SafeParcelReader.createParcelable(parcel, l, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    l2 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 7: // '\007'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 8: // '\b'
                    s6 = SafeParcelReader.createString(parcel, l);
                    break;

                case 9: // '\t'
                    s5 = SafeParcelReader.createString(parcel, l);
                    break;

                case 14: // '\016'
                    s4 = SafeParcelReader.createString(parcel, l);
                    break;

                case 15: // '\017'
                    mostrecentgameinfoentity = (MostRecentGameInfoEntity)SafeParcelReader.createParcelable(parcel, l, MostRecentGameInfoEntity.CREATOR);
                    break;

                case 16: // '\020'
                    playerlevelinfo = (PlayerLevelInfo)SafeParcelReader.createParcelable(parcel, l, PlayerLevelInfo.CREATOR);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 19: // '\023'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 18: // '\022'
                    flag1 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 21: // '\025'
                    s2 = SafeParcelReader.createString(parcel, l);
                    break;

                case 20: // '\024'
                    s3 = SafeParcelReader.createString(parcel, l);
                    break;

                case 23: // '\027'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 22: // '\026'
                    uri1 = (Uri)SafeParcelReader.createParcelable(parcel, l, Uri.CREATOR);
                    break;

                case 25: // '\031'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 24: // '\030'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, l, Uri.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PlayerEntity(j, s8, s7, uri3, uri2, l2, i, l1, s6, s5, s4, mostrecentgameinfoentity, playerlevelinfo, flag1, flag, s3, s2, uri1, s1, uri, s);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public volatile Object[] newArray(int i)
    {
        return new PlayerEntity[i];
    }
}
