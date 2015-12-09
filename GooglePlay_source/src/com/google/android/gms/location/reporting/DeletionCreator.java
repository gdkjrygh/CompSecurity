// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.reporting:
//            Deletion

public final class DeletionCreator
    implements android.os.Parcelable.Creator
{

    public DeletionCreator()
    {
    }

    static void writeToParcel(Deletion deletion, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, deletion.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, deletion.mAccount, i, false);
        SafeParcelWriter.writeLong(parcel, 3, deletion.mStartTimeMs);
        SafeParcelWriter.writeLong(parcel, 4, deletion.mEndTimeMs);
        SafeParcelWriter.writeLong(parcel, 5, deletion.mTimestampMs);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        Account account = null;
        long l2 = 0L;
        long l1 = 0L;
        long l = 0L;
        int i = 0;
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
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;

                case 3: // '\003'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 4: // '\004'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 5: // '\005'
                    l2 = SafeParcelReader.readLong(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Deletion(i, account, Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2));
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Deletion[i];
    }
}
