// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            ConfirmCredentialsRequest

public final class ConfirmCredentialsRequestCreator
    implements android.os.Parcelable.Creator
{

    public ConfirmCredentialsRequestCreator()
    {
    }

    static void writeToParcel(ConfirmCredentialsRequest confirmcredentialsrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, confirmcredentialsrequest.version);
        SafeParcelWriter.writeParcelable(parcel, 2, confirmcredentialsrequest.accountCredentials, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, confirmcredentialsrequest.optionalCaptchaSolution, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        AccountCredentials accountcredentials = null;
        int i = 0;
        CaptchaSolution captchasolution = null;
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
                    accountcredentials = (AccountCredentials)SafeParcelReader.createParcelable(parcel, k, AccountCredentials.CREATOR);
                    break;

                case 3: // '\003'
                    captchasolution = (CaptchaSolution)SafeParcelReader.createParcelable(parcel, k, CaptchaSolution.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ConfirmCredentialsRequest(i, accountcredentials, captchasolution);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ConfirmCredentialsRequest[i];
    }
}
