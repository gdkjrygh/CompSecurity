// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountNameCheckRequest

public final class AccountNameCheckRequestCreator
    implements android.os.Parcelable.Creator
{

    public AccountNameCheckRequestCreator()
    {
    }

    static void writeToParcel(AccountNameCheckRequest accountnamecheckrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, accountnamecheckrequest.version);
        SafeParcelWriter.writeString(parcel, 2, accountnamecheckrequest.accountNameToCheck, false);
        SafeParcelWriter.writeString(parcel, 3, accountnamecheckrequest.optionalFirstName, false);
        SafeParcelWriter.writeString(parcel, 4, accountnamecheckrequest.optionalLastName, false);
        SafeParcelWriter.writeParcelable(parcel, 5, accountnamecheckrequest.callingAppDescription, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, accountnamecheckrequest.optionalCaptchaSolution, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, accountnamecheckrequest.accountToCheck, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Account account = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        CaptchaSolution captchasolution = null;
        AppDescription appdescription = null;
        String s = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;

                case 6: // '\006'
                    captchasolution = (CaptchaSolution)SafeParcelReader.createParcelable(parcel, k, CaptchaSolution.CREATOR);
                    break;

                case 7: // '\007'
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountNameCheckRequest(i, s2, s1, s, appdescription, captchasolution, account);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountNameCheckRequest[i];
    }
}
