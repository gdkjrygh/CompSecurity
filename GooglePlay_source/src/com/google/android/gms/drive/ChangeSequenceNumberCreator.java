// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive:
//            ChangeSequenceNumber

public final class ChangeSequenceNumberCreator
    implements android.os.Parcelable.Creator
{

    public ChangeSequenceNumberCreator()
    {
    }

    static void writeToParcel$4001d267(ChangeSequenceNumber changesequencenumber, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, changesequencenumber.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, changesequencenumber.mSequenceNumber);
        SafeParcelWriter.writeLong(parcel, 3, changesequencenumber.mDatabaseInstanceId);
        SafeParcelWriter.writeLong(parcel, 4, changesequencenumber.mAccountId);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l1 = 0L;
        long l2 = 0L;
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
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    l2 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 4: // '\004'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ChangeSequenceNumber(i, l2, l1, l);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ChangeSequenceNumber[i];
    }
}
