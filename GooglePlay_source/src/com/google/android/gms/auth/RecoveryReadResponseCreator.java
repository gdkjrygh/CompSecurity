// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryReadResponse, Country

public final class RecoveryReadResponseCreator
    implements android.os.Parcelable.Creator
{

    public RecoveryReadResponseCreator()
    {
    }

    static void writeToParcel$d57022f(RecoveryReadResponse recoveryreadresponse, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, recoveryreadresponse.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, recoveryreadresponse.mSecondaryEmail, false);
        SafeParcelWriter.writeString(parcel, 3, recoveryreadresponse.mPhoneNumber, false);
        SafeParcelWriter.writeString(parcel, 4, recoveryreadresponse.mPhoneCountryCode, false);
        SafeParcelWriter.writeTypedList(parcel, 5, recoveryreadresponse.mCountryList, false);
        SafeParcelWriter.writeString(parcel, 6, recoveryreadresponse.mError, false);
        SafeParcelWriter.writeString(parcel, 7, recoveryreadresponse.mAction, false);
        SafeParcelWriter.writeString(parcel, 8, recoveryreadresponse.mAllowedOptions, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s1 = null;
        String s2 = null;
        java.util.ArrayList arraylist = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
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
                    s5 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    arraylist = SafeParcelReader.createTypedList(parcel, k, Country.CREATOR);
                    break;

                case 6: // '\006'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RecoveryReadResponse(i, s5, s4, s3, arraylist, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RecoveryReadResponse[i];
    }
}
