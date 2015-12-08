// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games:
//            GameEntity

public class GameEntityCreator
    implements android.os.Parcelable.Creator
{

    public GameEntityCreator()
    {
    }

    static void writeToParcel(GameEntity gameentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, gameentity.mApplicationId, false);
        SafeParcelWriter.writeString(parcel, 2, gameentity.mDisplayName, false);
        SafeParcelWriter.writeString(parcel, 3, gameentity.mPrimaryCategory, false);
        SafeParcelWriter.writeString(parcel, 4, gameentity.mSecondaryCategory, false);
        SafeParcelWriter.writeString(parcel, 5, gameentity.mDescription, false);
        SafeParcelWriter.writeString(parcel, 6, gameentity.mDeveloperName, false);
        SafeParcelWriter.writeParcelable(parcel, 7, gameentity.mIconImageUri, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, gameentity.mHiResImageUri, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, gameentity.mFeaturedImageUri, i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, gameentity.mPlayEnabledGame);
        SafeParcelWriter.writeBoolean(parcel, 11, gameentity.mInstanceInstalled);
        SafeParcelWriter.writeString(parcel, 12, gameentity.mInstancePackageName, false);
        SafeParcelWriter.writeInt(parcel, 13, gameentity.mGameplayAclStatus);
        SafeParcelWriter.writeInt(parcel, 14, gameentity.mAchievementTotalCount);
        SafeParcelWriter.writeInt(parcel, 15, gameentity.mLeaderboardCount);
        SafeParcelWriter.writeBoolean(parcel, 17, gameentity.mTurnBasedEnabled);
        SafeParcelWriter.writeBoolean(parcel, 16, gameentity.mRealTimeEnabled);
        SafeParcelWriter.writeInt(parcel, 1000, gameentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 19, gameentity.mHiResImageUrl, false);
        SafeParcelWriter.writeString(parcel, 18, gameentity.mIconImageUrl, false);
        SafeParcelWriter.writeBoolean(parcel, 21, gameentity.mMuted);
        SafeParcelWriter.writeString(parcel, 20, gameentity.mFeaturedImageUrl, false);
        SafeParcelWriter.writeBoolean(parcel, 23, gameentity.mSnapshotsEnabled);
        SafeParcelWriter.writeBoolean(parcel, 22, gameentity.mIdentitySharingConfirmed);
        SafeParcelWriter.writeBoolean(parcel, 25, gameentity.mHasGamepadSupport);
        SafeParcelWriter.writeString(parcel, 24, gameentity.mThemeColor, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public GameEntity createFromParcel(Parcel parcel)
    {
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int l = 0;
        String s10 = null;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        Uri uri2 = null;
        Uri uri1 = null;
        Uri uri = null;
        boolean flag7 = false;
        boolean flag6 = false;
        String s4 = null;
        int k = 0;
        int j = 0;
        int i = 0;
        boolean flag5 = false;
        boolean flag4 = false;
        String s3 = null;
        String s2 = null;
        String s1 = null;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        String s = null;
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    s10 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 2: // '\002'
                    s9 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 3: // '\003'
                    s8 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 4: // '\004'
                    s7 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 5: // '\005'
                    s6 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 6: // '\006'
                    s5 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 7: // '\007'
                    uri2 = (Uri)SafeParcelReader.createParcelable(parcel, j1, Uri.CREATOR);
                    break;

                case 8: // '\b'
                    uri1 = (Uri)SafeParcelReader.createParcelable(parcel, j1, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, j1, Uri.CREATOR);
                    break;

                case 10: // '\n'
                    flag7 = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 11: // '\013'
                    flag6 = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 12: // '\f'
                    s4 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 13: // '\r'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 14: // '\016'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 15: // '\017'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 17: // '\021'
                    flag4 = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 16: // '\020'
                    flag5 = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 1000: 
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 19: // '\023'
                    s2 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 18: // '\022'
                    s3 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 21: // '\025'
                    flag3 = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 20: // '\024'
                    s1 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 23: // '\027'
                    flag1 = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 22: // '\026'
                    flag2 = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 25: // '\031'
                    flag = SafeParcelReader.readBoolean(parcel, j1);
                    break;

                case 24: // '\030'
                    s = SafeParcelReader.createString(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new GameEntity(l, s10, s9, s8, s7, s6, s5, uri2, uri1, uri, flag7, flag6, s4, k, j, i, flag5, flag4, s3, s2, s1, flag3, flag2, flag1, s, flag);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public volatile Object[] newArray(int i)
    {
        return new GameEntity[i];
    }
}
