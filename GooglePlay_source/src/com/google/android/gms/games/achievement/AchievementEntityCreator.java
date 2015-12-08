// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.achievement:
//            AchievementEntity

public final class AchievementEntityCreator
    implements android.os.Parcelable.Creator
{

    public AchievementEntityCreator()
    {
    }

    static void writeToParcel(AchievementEntity achievemententity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, achievemententity.mAchievementId, false);
        SafeParcelWriter.writeInt(parcel, 2, achievemententity.mType);
        SafeParcelWriter.writeString(parcel, 3, achievemententity.mName, false);
        SafeParcelWriter.writeString(parcel, 4, achievemententity.mDescription, false);
        SafeParcelWriter.writeParcelable(parcel, 5, achievemententity.mUnlockedImageUri, i, false);
        SafeParcelWriter.writeString(parcel, 6, achievemententity.mUnlockedImageUrl, false);
        SafeParcelWriter.writeParcelable(parcel, 7, achievemententity.mRevealedImageUri, i, false);
        SafeParcelWriter.writeString(parcel, 8, achievemententity.mRevealedImageUrl, false);
        SafeParcelWriter.writeInt(parcel, 9, achievemententity.mTotalSteps);
        SafeParcelWriter.writeString(parcel, 10, achievemententity.mFormattedTotalSteps, false);
        SafeParcelWriter.writeParcelable(parcel, 11, achievemententity.mPlayer, i, false);
        SafeParcelWriter.writeInt(parcel, 12, achievemententity.mState);
        SafeParcelWriter.writeInt(parcel, 13, achievemententity.mCurrentSteps);
        SafeParcelWriter.writeString(parcel, 14, achievemententity.mFormattedCurrentSteps, false);
        SafeParcelWriter.writeLong(parcel, 15, achievemententity.mLastUpdatedTimestamp);
        SafeParcelWriter.writeLong(parcel, 16, achievemententity.mXpValue);
        SafeParcelWriter.writeInt(parcel, 1000, achievemententity.mVersionCode);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j1 = SafeParcelReader.validateObjectHeader(parcel);
        int i1 = 0;
        String s6 = null;
        int l = 0;
        String s5 = null;
        String s4 = null;
        Uri uri1 = null;
        String s3 = null;
        Uri uri = null;
        String s2 = null;
        int k = 0;
        String s1 = null;
        PlayerEntity playerentity = null;
        int j = 0;
        int i = 0;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j1)
            {
                int k1 = parcel.readInt();
                switch (0xffff & k1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k1);
                    break;

                case 1: // '\001'
                    s6 = SafeParcelReader.createString(parcel, k1);
                    break;

                case 2: // '\002'
                    l = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 3: // '\003'
                    s5 = SafeParcelReader.createString(parcel, k1);
                    break;

                case 4: // '\004'
                    s4 = SafeParcelReader.createString(parcel, k1);
                    break;

                case 5: // '\005'
                    uri1 = (Uri)SafeParcelReader.createParcelable(parcel, k1, Uri.CREATOR);
                    break;

                case 6: // '\006'
                    s3 = SafeParcelReader.createString(parcel, k1);
                    break;

                case 7: // '\007'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k1, Uri.CREATOR);
                    break;

                case 8: // '\b'
                    s2 = SafeParcelReader.createString(parcel, k1);
                    break;

                case 9: // '\t'
                    k = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 10: // '\n'
                    s1 = SafeParcelReader.createString(parcel, k1);
                    break;

                case 11: // '\013'
                    playerentity = (PlayerEntity)SafeParcelReader.createParcelable(parcel, k1, PlayerEntity.CREATOR);
                    break;

                case 12: // '\f'
                    j = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 13: // '\r'
                    i = SafeParcelReader.readInt(parcel, k1);
                    break;

                case 14: // '\016'
                    s = SafeParcelReader.createString(parcel, k1);
                    break;

                case 15: // '\017'
                    l2 = SafeParcelReader.readLong(parcel, k1);
                    break;

                case 16: // '\020'
                    l1 = SafeParcelReader.readLong(parcel, k1);
                    break;

                case 1000: 
                    i1 = SafeParcelReader.readInt(parcel, k1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j1).toString(), parcel);
            } else
            {
                return new AchievementEntity(i1, s6, l, s5, s4, uri1, s3, uri, s2, k, s1, playerentity, j, i, s, l2, l1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AchievementEntity[i];
    }
}
