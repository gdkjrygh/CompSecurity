// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfo, PlayerLevel

public final class PlayerLevelInfoCreator
    implements android.os.Parcelable.Creator
{

    public PlayerLevelInfoCreator()
    {
    }

    static void writeToParcel(PlayerLevelInfo playerlevelinfo, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeLong(parcel, 1, playerlevelinfo.mCurrentXpTotal);
        SafeParcelWriter.writeInt(parcel, 1000, playerlevelinfo.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, playerlevelinfo.mLastLevelUpTimestamp);
        SafeParcelWriter.writeParcelable(parcel, 3, playerlevelinfo.mCurrentLevel, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, playerlevelinfo.mNextLevel, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        PlayerLevel playerlevel = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        PlayerLevel playerlevel1 = null;
        long l1 = 0L;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 3: // '\003'
                    playerlevel1 = (PlayerLevel)SafeParcelReader.createParcelable(parcel, k, PlayerLevel.CREATOR);
                    break;

                case 4: // '\004'
                    playerlevel = (PlayerLevel)SafeParcelReader.createParcelable(parcel, k, PlayerLevel.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PlayerLevelInfo(i, l1, l, playerlevel1, playerlevel);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlayerLevelInfo[i];
    }
}
