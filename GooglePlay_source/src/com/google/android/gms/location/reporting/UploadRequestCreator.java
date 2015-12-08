// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.location.reporting:
//            UploadRequest

public final class UploadRequestCreator
    implements android.os.Parcelable.Creator
{

    public UploadRequestCreator()
    {
    }

    static void writeToParcel(UploadRequest uploadrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, uploadrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, uploadrequest.mAccount, i, false);
        SafeParcelWriter.writeString(parcel, 3, uploadrequest.mReason, false);
        SafeParcelWriter.writeLong(parcel, 4, uploadrequest.mDurationMillis);
        SafeParcelWriter.writeLong(parcel, 5, uploadrequest.mMovingLatencyMillis);
        SafeParcelWriter.writeLong(parcel, 6, uploadrequest.mStationaryLatencyMillis);
        SafeParcelWriter.writeString(parcel, 7, uploadrequest.mAppSpecificKey, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l = 0L;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l1 = 0L;
        long l2 = 0L;
        String s1 = null;
        Account account = null;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    l2 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 5: // '\005'
                    l1 = SafeParcelReader.readLong(parcel, k);
                    break;

                case 6: // '\006'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UploadRequest(i, account, s1, l2, l1, l, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UploadRequest[i];
    }
}
