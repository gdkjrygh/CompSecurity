// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            OtpRequest

public final class OtpRequestCreator
    implements android.os.Parcelable.Creator
{

    public OtpRequestCreator()
    {
    }

    static void writeToParcel(OtpRequest otprequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, otprequest.mVersion);
        SafeParcelWriter.writeString(parcel, 2, otprequest.accountName, false);
        SafeParcelWriter.writeParcelable(parcel, 3, otprequest.callerDescription, i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, otprequest.challenge, false);
        SafeParcelWriter.writeBoolean(parcel, 5, otprequest.isLegacyRequest);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        byte abyte0[] = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        AppDescription appdescription = null;
        String s = null;
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
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;

                case 4: // '\004'
                    abyte0 = SafeParcelReader.createByteArray(parcel, k);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new OtpRequest(i, s, appdescription, abyte0, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new OtpRequest[i];
    }
}
