// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountSignInRequest

public final class AccountSignInRequestCreator
    implements android.os.Parcelable.Creator
{

    public AccountSignInRequestCreator()
    {
    }

    static void writeToParcel(AccountSignInRequest accountsigninrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, accountsigninrequest.version);
        SafeParcelWriter.writeParcelable(parcel, 2, accountsigninrequest.callingAppDescription, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, accountsigninrequest.isCreatingAccount);
        SafeParcelWriter.writeBoolean(parcel, 4, accountsigninrequest.isSetupWizardInProgress);
        SafeParcelWriter.writeParcelable(parcel, 5, accountsigninrequest.optionalCaptchaSolution, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, accountsigninrequest.accountCredentials, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        AccountCredentials accountcredentials = null;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        CaptchaSolution captchasolution = null;
        boolean flag1 = false;
        AppDescription appdescription = null;
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
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;

                case 3: // '\003'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    captchasolution = (CaptchaSolution)SafeParcelReader.createParcelable(parcel, k, CaptchaSolution.CREATOR);
                    break;

                case 6: // '\006'
                    accountcredentials = (AccountCredentials)SafeParcelReader.createParcelable(parcel, k, AccountCredentials.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountSignInRequest(i, appdescription, flag1, flag, captchasolution, accountcredentials);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountSignInRequest[i];
    }
}
