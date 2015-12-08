// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountNameCheckResponse

public final class AccountNameCheckResponseCreator
    implements android.os.Parcelable.Creator
{

    public AccountNameCheckResponseCreator()
    {
    }

    static void writeToParcel(AccountNameCheckResponse accountnamecheckresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, accountnamecheckresponse.version);
        SafeParcelWriter.writeString(parcel, 2, accountnamecheckresponse.statusWireCode, false);
        SafeParcelWriter.writeStringList(parcel, 3, accountnamecheckresponse.suggestions, false);
        SafeParcelWriter.writeString(parcel, 4, accountnamecheckresponse.detail, false);
        SafeParcelWriter.writeParcelable(parcel, 5, accountnamecheckresponse.captcha, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        CaptchaChallenge captchachallenge = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        java.util.ArrayList arraylist = null;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    captchachallenge = (CaptchaChallenge)SafeParcelReader.createParcelable(parcel, k, CaptchaChallenge.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountNameCheckResponse(i, s1, arraylist, s, captchachallenge);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountNameCheckResponse[i];
    }
}
