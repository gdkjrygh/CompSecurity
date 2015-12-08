// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryWriteRequest

public final class RecoveryWriteRequestCreator
    implements android.os.Parcelable.Creator
{

    public RecoveryWriteRequestCreator()
    {
    }

    static void writeToParcel$4479f008(RecoveryWriteRequest recoverywriterequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, recoverywriterequest.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, recoverywriterequest.mAccount, false);
        SafeParcelWriter.writeString(parcel, 3, recoverywriterequest.mSecondaryEmail, false);
        SafeParcelWriter.writeString(parcel, 4, recoverywriterequest.mPhoneNumber, false);
        SafeParcelWriter.writeString(parcel, 5, recoverywriterequest.mPhoneCountryCode, false);
        SafeParcelWriter.writeBoolean(parcel, 6, recoverywriterequest.mIsBroadUse);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RecoveryWriteRequest(i, s3, s2, s1, s, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RecoveryWriteRequest[i];
    }
}
