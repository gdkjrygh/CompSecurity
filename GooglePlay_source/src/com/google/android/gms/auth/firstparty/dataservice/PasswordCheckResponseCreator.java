// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            PasswordCheckResponse

public final class PasswordCheckResponseCreator
    implements android.os.Parcelable.Creator
{

    public PasswordCheckResponseCreator()
    {
    }

    static void writeToParcel$51a6c614(PasswordCheckResponse passwordcheckresponse, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, passwordcheckresponse.version);
        SafeParcelWriter.writeString(parcel, 2, passwordcheckresponse.status, false);
        SafeParcelWriter.writeString(parcel, 3, passwordcheckresponse.passwordStrength, false);
        SafeParcelWriter.writeString(parcel, 4, passwordcheckresponse.detail, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s2 = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PasswordCheckResponse(i, s, s1, s2);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PasswordCheckResponse[i];
    }
}
