// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevel

public final class PlayerLevelCreator
    implements android.os.Parcelable.Creator
{

    public PlayerLevelCreator()
    {
    }

    static void writeToParcel$6fcc3d2f(PlayerLevel playerlevel, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, playerlevel.mLevelNumber);
        SafeParcelWriter.writeInt(parcel, 1000, playerlevel.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, playerlevel.mMinXp);
        SafeParcelWriter.writeLong(parcel, 3, playerlevel.mMaxXp);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        long l2 = 0L;
        int j = 0;
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
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PlayerLevel(j, i, l2, l1);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PlayerLevel[i];
    }
}
