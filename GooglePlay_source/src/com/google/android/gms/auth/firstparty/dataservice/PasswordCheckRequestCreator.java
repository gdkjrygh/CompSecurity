// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            PasswordCheckRequest

public final class PasswordCheckRequestCreator
    implements android.os.Parcelable.Creator
{

    public PasswordCheckRequestCreator()
    {
    }

    static void writeToParcel(PasswordCheckRequest passwordcheckrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, passwordcheckrequest.version);
        SafeParcelWriter.writeString(parcel, 2, passwordcheckrequest.accountName, false);
        SafeParcelWriter.writeString(parcel, 3, passwordcheckrequest.password, false);
        SafeParcelWriter.writeString(parcel, 4, passwordcheckrequest.optionalFirstName, false);
        SafeParcelWriter.writeString(parcel, 5, passwordcheckrequest.optionalLastName, false);
        SafeParcelWriter.writeParcelable(parcel, 6, passwordcheckrequest.appDescription, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        AppDescription appdescription = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PasswordCheckRequest(i, s3, s2, s1, s, appdescription);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PasswordCheckRequest[i];
    }
}
